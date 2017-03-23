package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzq extends b {

    interface a {
        void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map);
    }

    private static class b implements Runnable {
        private final a a;
        private final int b;
        private final Throwable c;
        private final byte[] d;
        private final String e;
        private final Map<String, List<String>> f;

        private b(String str, a aVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
            zzaa.zzz(aVar);
            this.a = aVar;
            this.b = i;
            this.c = th;
            this.d = bArr;
            this.e = str;
            this.f = map;
        }

        public void run() {
            this.a.a(this.e, this.b, this.c, this.d, this.f);
        }
    }

    private class c implements Runnable {
        final /* synthetic */ zzq a;
        private final URL b;
        private final byte[] c;
        private final a d;
        private final String e;
        private final Map<String, String> f;

        public c(zzq com_google_android_gms_measurement_internal_zzq, String str, URL url, byte[] bArr, Map<String, String> map, a aVar) {
            this.a = com_google_android_gms_measurement_internal_zzq;
            zzaa.zzdl(str);
            zzaa.zzz(url);
            zzaa.zzz(aVar);
            this.b = url;
            this.c = bArr;
            this.d = aVar;
            this.e = str;
            this.f = map;
        }

        public void run() {
            HttpURLConnection zzc;
            Throwable e;
            Map map;
            int i;
            HttpURLConnection httpURLConnection;
            Throwable th;
            this.a.zzFb();
            int i2 = 0;
            OutputStream outputStream;
            Map map2;
            try {
                this.a.zzbS(this.e);
                zzc = this.a.zzc(this.b);
                try {
                    if (this.f != null) {
                        for (Entry entry : this.f.entrySet()) {
                            zzc.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    if (this.c != null) {
                        byte[] zzh = this.a.zzFi().zzh(this.c);
                        this.a.zzFm().zzFL().zzj("Uploading data. size", Integer.valueOf(zzh.length));
                        zzc.setDoOutput(true);
                        zzc.addRequestProperty("Content-Encoding", "gzip");
                        zzc.setFixedLengthStreamingMode(zzh.length);
                        zzc.connect();
                        outputStream = zzc.getOutputStream();
                        try {
                            outputStream.write(zzh);
                            outputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            map = null;
                            i = 0;
                            httpURLConnection = zzc;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    this.a.zzFm().zzFE().zzj("Error closing HTTP compressed POST connection output stream", e3);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.a.zzik();
                            this.a.zzFl().zzg(new b(this.e, this.d, i, e, null, map));
                        } catch (Throwable th2) {
                            th = th2;
                            map2 = null;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e32) {
                                    this.a.zzFm().zzFE().zzj("Error closing HTTP compressed POST connection output stream", e32);
                                }
                            }
                            if (zzc != null) {
                                zzc.disconnect();
                            }
                            this.a.zzik();
                            this.a.zzFl().zzg(new b(this.e, this.d, i2, null, null, map2));
                            throw th;
                        }
                    }
                    i2 = zzc.getResponseCode();
                    map2 = zzc.getHeaderFields();
                } catch (IOException e4) {
                    e = e4;
                    map = null;
                    i = i2;
                    outputStream = null;
                    httpURLConnection = zzc;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.a.zzik();
                    this.a.zzFl().zzg(new b(this.e, this.d, i, e, null, map));
                } catch (Throwable th3) {
                    th = th3;
                    map2 = null;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (zzc != null) {
                        zzc.disconnect();
                    }
                    this.a.zzik();
                    this.a.zzFl().zzg(new b(this.e, this.d, i2, null, null, map2));
                    throw th;
                }
                try {
                    byte[] zza = this.a.zzc(zzc);
                    if (zzc != null) {
                        zzc.disconnect();
                    }
                    this.a.zzik();
                    this.a.zzFl().zzg(new b(this.e, this.d, i2, null, zza, map2));
                } catch (IOException e5) {
                    e = e5;
                    map = map2;
                    i = i2;
                    outputStream = null;
                    httpURLConnection = zzc;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.a.zzik();
                    this.a.zzFl().zzg(new b(this.e, this.d, i, e, null, map));
                } catch (Throwable th32) {
                    th = th32;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (zzc != null) {
                        zzc.disconnect();
                    }
                    this.a.zzik();
                    this.a.zzFl().zzg(new b(this.e, this.d, i2, null, null, map2));
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                map = null;
                i = 0;
                outputStream = null;
                httpURLConnection = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.a.zzik();
                this.a.zzFl().zzg(new b(this.e, this.d, i, e, null, map));
            } catch (Throwable th322) {
                th = th322;
                map2 = null;
                zzc = null;
                outputStream = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (zzc != null) {
                    zzc.disconnect();
                }
                this.a.zzik();
                this.a.zzFl().zzg(new b(this.e, this.d, i2, null, null, map2));
                throw th;
            }
        }
    }

    public zzq(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
    }

    private byte[] zzc(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            return toByteArray;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public /* bridge */ /* synthetic */ void zzFb() {
        super.zzFb();
    }

    public /* bridge */ /* synthetic */ f zzFc() {
        return super.zzFc();
    }

    public /* bridge */ /* synthetic */ zzac zzFd() {
        return super.zzFd();
    }

    public /* bridge */ /* synthetic */ zzn zzFe() {
        return super.zzFe();
    }

    public /* bridge */ /* synthetic */ zzg zzFf() {
        return super.zzFf();
    }

    public /* bridge */ /* synthetic */ zzad zzFg() {
        return super.zzFg();
    }

    public /* bridge */ /* synthetic */ zze zzFh() {
        return super.zzFh();
    }

    public /* bridge */ /* synthetic */ zzal zzFi() {
        return super.zzFi();
    }

    public /* bridge */ /* synthetic */ zzv zzFj() {
        return super.zzFj();
    }

    public /* bridge */ /* synthetic */ zzaf zzFk() {
        return super.zzFk();
    }

    public /* bridge */ /* synthetic */ zzw zzFl() {
        return super.zzFl();
    }

    public /* bridge */ /* synthetic */ zzp zzFm() {
        return super.zzFm();
    }

    public /* bridge */ /* synthetic */ zzt zzFn() {
        return super.zzFn();
    }

    public /* bridge */ /* synthetic */ zzd zzFo() {
        return super.zzFo();
    }

    public void zza(String str, URL url, Map<String, String> map, a aVar) {
        zzkN();
        zzma();
        zzaa.zzz(url);
        zzaa.zzz(aVar);
        zzFl().zzh(new c(this, str, url, null, map, aVar));
    }

    public void zza(String str, URL url, byte[] bArr, Map<String, String> map, a aVar) {
        zzkN();
        zzma();
        zzaa.zzz(url);
        zzaa.zzz(bArr);
        zzaa.zzz(aVar);
        zzFl().zzh(new c(this, str, url, bArr, map, aVar));
    }

    protected void zzbS(String str) {
    }

    protected HttpURLConnection zzc(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout((int) zzFo().zzEK());
            httpURLConnection.setReadTimeout((int) zzFo().zzEL());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    protected void zzik() {
    }

    public /* bridge */ /* synthetic */ void zzkN() {
        super.zzkN();
    }

    protected void zzkO() {
    }

    public /* bridge */ /* synthetic */ void zzlP() {
        super.zzlP();
    }

    public /* bridge */ /* synthetic */ zze zzlQ() {
        return super.zzlQ();
    }

    public boolean zzod() {
        NetworkInfo activeNetworkInfo;
        zzma();
        try {
            activeNetworkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
