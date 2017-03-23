package com.google.android.gms.analytics.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.zzaa;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;

class b extends zzd {
    private static final byte[] c = "\n".getBytes();
    private final String a = a("GoogleAnalytics", zze.VERSION, VERSION.RELEASE, zzao.zza(Locale.getDefault()), Build.MODEL, Build.ID);
    private final c b;

    private class a {
        final /* synthetic */ b a;
        private int b;
        private ByteArrayOutputStream c = new ByteArrayOutputStream();

        public a(b bVar) {
            this.a = bVar;
        }

        public int a() {
            return this.b;
        }

        public boolean a(zzab com_google_android_gms_analytics_internal_zzab) {
            zzaa.zzz(com_google_android_gms_analytics_internal_zzab);
            if (this.b + 1 > this.a.zzlS().zzni()) {
                return false;
            }
            String a = this.a.a(com_google_android_gms_analytics_internal_zzab, false);
            if (a == null) {
                this.a.zzlR().zza(com_google_android_gms_analytics_internal_zzab, "Error formatting hit");
                return true;
            }
            byte[] bytes = a.getBytes();
            int length = bytes.length;
            if (length > this.a.zzlS().zzna()) {
                this.a.zzlR().zza(com_google_android_gms_analytics_internal_zzab, "Hit size exceeds the maximum size limit");
                return true;
            }
            if (this.c.size() > 0) {
                length++;
            }
            if (length + this.c.size() > this.a.zzlS().zznc()) {
                return false;
            }
            try {
                if (this.c.size() > 0) {
                    this.c.write(b.c);
                }
                this.c.write(bytes);
                this.b++;
                return true;
            } catch (IOException e) {
                this.a.zze("Failed to write payload when batching hits", e);
                return true;
            }
        }

        public byte[] b() {
            return this.c.toByteArray();
        }
    }

    b(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf);
        this.b = new c(com_google_android_gms_analytics_internal_zzf.zzlQ());
    }

    private int a(URL url, byte[] bArr) {
        HttpURLConnection a;
        Object e;
        Throwable th;
        OutputStream outputStream = null;
        zzaa.zzz(url);
        zzaa.zzz(bArr);
        zzb("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (zziW()) {
            zza("Post payload\n", new String(bArr));
        }
        try {
            a(getContext().getPackageName());
            a = a(url);
            try {
                a.setDoOutput(true);
                a.setFixedLengthStreamingMode(bArr.length);
                a.connect();
                outputStream = a.getOutputStream();
                outputStream.write(bArr);
                a(a);
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    zzkw().zzlN();
                }
                zzb("POST status", Integer.valueOf(responseCode));
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e2) {
                        zze("Error closing http post connection output stream", e2);
                    }
                }
                if (a != null) {
                    a.disconnect();
                }
                b();
                return responseCode;
            } catch (IOException e3) {
                e = e3;
                try {
                    zzd("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            zze("Error closing http post connection output stream", e4);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    b();
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e22) {
                            zze("Error closing http post connection output stream", e22);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    b();
                    throw th;
                }
            }
        } catch (IOException e5) {
            e = e5;
            a = outputStream;
            zzd("Network POST connection error", e);
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            b();
            return 0;
        } catch (Throwable th3) {
            th = th3;
            a = outputStream;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            b();
            throw th;
        }
    }

    private static String a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    private URL a(zzab com_google_android_gms_analytics_internal_zzab, String str) {
        String valueOf;
        String valueOf2;
        if (com_google_android_gms_analytics_internal_zzab.zznV()) {
            valueOf2 = String.valueOf(zzlS().zznk());
            valueOf = String.valueOf(zzlS().zznm());
            valueOf = new StringBuilder(((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(valueOf2).append(valueOf).append("?").append(str).toString();
        } else {
            valueOf2 = String.valueOf(zzlS().zznl());
            valueOf = String.valueOf(zzlS().zznm());
            valueOf = new StringBuilder(((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(valueOf2).append(valueOf).append("?").append(str).toString();
        }
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private void a(StringBuilder stringBuilder, String str, String str2) throws UnsupportedEncodingException {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('&');
        }
        stringBuilder.append(URLEncoder.encode(str, Constants.ENCODING));
        stringBuilder.append('=');
        stringBuilder.append(URLEncoder.encode(str2, Constants.ENCODING));
    }

    private void a(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zze("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    zze("Error closing http connection input stream", e2);
                }
            }
        }
    }

    private boolean a(zzab com_google_android_gms_analytics_internal_zzab) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzab);
        String a = a(com_google_android_gms_analytics_internal_zzab, !com_google_android_gms_analytics_internal_zzab.zznV());
        if (a == null) {
            zzlR().zza(com_google_android_gms_analytics_internal_zzab, "Error formatting hit for upload");
            return true;
        } else if (a.length() <= zzlS().zzmZ()) {
            URL a2 = a(com_google_android_gms_analytics_internal_zzab, a);
            if (a2 != null) {
                return b(a2) == 200;
            } else {
                zzbK("Failed to build collect GET endpoint url");
                return false;
            }
        } else {
            a = a(com_google_android_gms_analytics_internal_zzab, false);
            if (a == null) {
                zzlR().zza(com_google_android_gms_analytics_internal_zzab, "Error formatting hit for POST upload");
                return true;
            }
            byte[] bytes = a.getBytes();
            if (bytes.length > zzlS().zznb()) {
                zzlR().zza(com_google_android_gms_analytics_internal_zzab, "Hit payload exceeds size limit");
                return true;
            }
            URL b = b(com_google_android_gms_analytics_internal_zzab);
            if (b != null) {
                return a(b, bytes) == 200;
            } else {
                zzbK("Failed to build collect POST endpoint url");
                return false;
            }
        }
    }

    private static byte[] a(byte[] bArr) throws IOException {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private int b(java.net.URL r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0030 in list [B:7:0x002d]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        com.google.android.gms.common.internal.zzaa.zzz(r5);
        r0 = "GET request";
        r4.zzb(r0, r5);
        r1 = 0;
        r1 = r4.a(r5);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r1.connect();	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r4.a(r1);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r0 = r1.getResponseCode();	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        if (r0 != r2) goto L_0x0022;	 Catch:{ IOException -> 0x0031, all -> 0x003e }
    L_0x001b:
        r2 = r4.zzkw();	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r2.zzlN();	 Catch:{ IOException -> 0x0031, all -> 0x003e }
    L_0x0022:
        r2 = "GET status";	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r3 = java.lang.Integer.valueOf(r0);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r4.zzb(r2, r3);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        if (r1 == 0) goto L_0x0030;
    L_0x002d:
        r1.disconnect();
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = move-exception;
        r2 = "Network GET connection error";	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r4.zzd(r2, r0);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        if (r1 == 0) goto L_0x003c;
    L_0x0039:
        r1.disconnect();
    L_0x003c:
        r0 = 0;
        goto L_0x0030;
    L_0x003e:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0044;
    L_0x0041:
        r1.disconnect();
    L_0x0044:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.b.b(java.net.URL):int");
    }

    private int b(URL url, byte[] bArr) {
        HttpURLConnection a;
        OutputStream outputStream;
        Object e;
        HttpURLConnection httpURLConnection;
        Throwable th;
        OutputStream outputStream2 = null;
        zzaa.zzz(url);
        zzaa.zzz(bArr);
        try {
            a(getContext().getPackageName());
            byte[] a2 = a(bArr);
            zza("POST compressed size, ratio %, url", Integer.valueOf(a2.length), Long.valueOf((100 * ((long) a2.length)) / ((long) bArr.length)), url);
            if (a2.length > bArr.length) {
                zzc("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(a2.length), Integer.valueOf(bArr.length));
            }
            if (zziW()) {
                String str = "Post payload";
                String str2 = "\n";
                String valueOf = String.valueOf(new String(bArr));
                zza(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            a = a(url);
            try {
                a.setDoOutput(true);
                a.addRequestProperty("Content-Encoding", "gzip");
                a.setFixedLengthStreamingMode(a2.length);
                a.connect();
                outputStream = a.getOutputStream();
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = a;
                try {
                    zzd("Network compressed POST connection error", e);
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e3) {
                            zze("Error closing http compressed post connection output stream", e3);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b();
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    a = httpURLConnection;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e4) {
                            zze("Error closing http compressed post connection output stream", e4);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    b();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                b();
                throw th;
            }
            try {
                outputStream.write(a2);
                outputStream.close();
                a(a);
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    zzkw().zzlN();
                }
                zzb("POST status", Integer.valueOf(responseCode));
                if (a != null) {
                    a.disconnect();
                }
                b();
                return responseCode;
            } catch (IOException e5) {
                e = e5;
                outputStream2 = outputStream;
                httpURLConnection = a;
                zzd("Network compressed POST connection error", e);
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b();
                return 0;
            } catch (Throwable th4) {
                th = th4;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                b();
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            httpURLConnection = null;
            zzd("Network compressed POST connection error", e);
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            b();
            return 0;
        } catch (Throwable th5) {
            th = th5;
            a = null;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (a != null) {
                a.disconnect();
            }
            b();
            throw th;
        }
    }

    private URL b(zzab com_google_android_gms_analytics_internal_zzab) {
        String valueOf;
        String valueOf2;
        if (com_google_android_gms_analytics_internal_zzab.zznV()) {
            valueOf = String.valueOf(zzlS().zznk());
            valueOf2 = String.valueOf(zzlS().zznm());
            valueOf = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            valueOf = String.valueOf(zzlS().zznl());
            valueOf2 = String.valueOf(zzlS().zznm());
            valueOf = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private String c(zzab com_google_android_gms_analytics_internal_zzab) {
        return String.valueOf(com_google_android_gms_analytics_internal_zzab.zznS());
    }

    private URL d() {
        String valueOf = String.valueOf(zzlS().zznk());
        String valueOf2 = String.valueOf(zzlS().zznn());
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    String a(zzab com_google_android_gms_analytics_internal_zzab, boolean z) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzab);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : com_google_android_gms_analytics_internal_zzab.zzm().entrySet()) {
                String str = (String) entry.getKey();
                if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str) || "z".equals(str) || "_gmsv".equals(str))) {
                    a(stringBuilder, str, (String) entry.getValue());
                }
            }
            a(stringBuilder, "ht", String.valueOf(com_google_android_gms_analytics_internal_zzab.zznT()));
            a(stringBuilder, "qt", String.valueOf(zzlQ().currentTimeMillis() - com_google_android_gms_analytics_internal_zzab.zznT()));
            if (zzlS().zzmW()) {
                a(stringBuilder, "_gmsv", zze.VERSION);
            }
            if (z) {
                long zznW = com_google_android_gms_analytics_internal_zzab.zznW();
                a(stringBuilder, "z", zznW != 0 ? String.valueOf(zznW) : c(com_google_android_gms_analytics_internal_zzab));
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            zze("Failed to encode name or value", e);
            return null;
        }
    }

    HttpURLConnection a(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(zzlS().zznz());
            httpURLConnection.setReadTimeout(zzlS().zznA());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty(a.a.a.a.a.b.a.HEADER_USER_AGENT, this.a);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    public List<Long> a(List<zzab> list) {
        boolean z;
        boolean z2 = true;
        zzkN();
        zzma();
        zzaa.zzz(list);
        if (zzlS().zznq().isEmpty() || !this.b.a(zzlS().zznj() * 1000)) {
            z2 = false;
            z = false;
        } else {
            z = zzlS().zzno() != zzm.zzXf;
            if (zzlS().zznp() != zzo.GZIP) {
                z2 = false;
            }
        }
        return z ? a((List) list, z2) : b((List) list);
    }

    List<Long> a(List<zzab> list, boolean z) {
        zzaa.zzaj(!list.isEmpty());
        zza("Uploading batched hits. compression, count", Boolean.valueOf(z), Integer.valueOf(list.size()));
        a aVar = new a(this);
        List<Long> arrayList = new ArrayList();
        for (zzab com_google_android_gms_analytics_internal_zzab : list) {
            if (!aVar.a(com_google_android_gms_analytics_internal_zzab)) {
                break;
            }
            arrayList.add(Long.valueOf(com_google_android_gms_analytics_internal_zzab.zznS()));
        }
        if (aVar.a() == 0) {
            return arrayList;
        }
        URL d = d();
        if (d == null) {
            zzbK("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int b = z ? b(d, aVar.b()) : a(d, aVar.b());
        if (200 == b) {
            zza("Batched upload completed. Hits batched", Integer.valueOf(aVar.a()));
            return arrayList;
        }
        zza("Network error uploading hits. status code", Integer.valueOf(b));
        if (zzlS().zznq().contains(Integer.valueOf(b))) {
            zzbJ("Server instructed the client to stop batching");
            this.b.a();
        }
        return Collections.emptyList();
    }

    protected void a(String str) {
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo;
        zzkN();
        zzma();
        try {
            activeNetworkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzbG("No network connectivity");
        return false;
    }

    List<Long> b(List<zzab> list) {
        List<Long> arrayList = new ArrayList(list.size());
        for (zzab com_google_android_gms_analytics_internal_zzab : list) {
            if (!a(com_google_android_gms_analytics_internal_zzab)) {
                break;
            }
            arrayList.add(Long.valueOf(com_google_android_gms_analytics_internal_zzab.zznS()));
            if (arrayList.size() >= zzlS().zznh()) {
                break;
            }
        }
        return arrayList;
    }

    protected void b() {
    }

    protected void zzkO() {
        zza("Network initialized. User agent", this.a);
    }
}
