package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.adjust.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

class zzva implements al {
    private final String a;
    private final Context b;
    private final a c;
    private final zza d;

    public interface zza {
        void zza(an anVar);

        void zzb(an anVar);

        void zzc(an anVar);
    }

    interface a {
        HttpURLConnection a(URL url) throws IOException;
    }

    zzva(Context context, zza com_google_android_gms_internal_zzva_zza) {
        this(new a() {
            public HttpURLConnection a(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }
        }, context, com_google_android_gms_internal_zzva_zza);
    }

    zzva(a aVar, Context context, zza com_google_android_gms_internal_zzva_zza) {
        this.c = aVar;
        this.b = context.getApplicationContext();
        this.d = com_google_android_gms_internal_zzva_zza;
        this.a = a("GoogleTagManager", "5.00", VERSION.RELEASE, a(Locale.getDefault()), Build.MODEL, Build.ID);
    }

    static String a(Locale locale) {
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage().toLowerCase());
        if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
            stringBuilder.append("-").append(locale.getCountry().toLowerCase());
        }
        return stringBuilder.toString();
    }

    String a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    URL a(an anVar) {
        try {
            return new URL(anVar.c());
        } catch (MalformedURLException e) {
            zzun.e("Error trying to parse the GTM url.");
            return null;
        }
    }

    public void a(List<an> list) {
        Object obj;
        Throwable th;
        InputStream inputStream;
        IOException iOException;
        int min = Math.min(list.size(), 40);
        Object obj2 = 1;
        int i = 0;
        while (i < min) {
            an anVar = (an) list.get(i);
            URL a = a(anVar);
            String d = anVar.d();
            Map e = anVar.e();
            String f = anVar.f();
            if (a == null) {
                zzun.zzaW("No destination: discarding hit.");
                this.d.zzb(anVar);
                obj = obj2;
            } else {
                String valueOf;
                try {
                    Object obj3;
                    HttpURLConnection a2 = this.c.a(a);
                    if (obj2 != null) {
                        try {
                            as.b(this.b);
                            obj3 = null;
                        } catch (Throwable th2) {
                            obj3 = obj2;
                            th = th2;
                            inputStream = null;
                            if (inputStream == null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e2) {
                                    iOException = e2;
                                    obj2 = obj3;
                                }
                            }
                            a2.disconnect();
                            throw th;
                        }
                    }
                    obj3 = obj2;
                    try {
                        a2.setRequestProperty(a.a.a.a.a.b.a.HEADER_USER_AGENT, this.a);
                        if (e != null) {
                            for (Entry entry : e.entrySet()) {
                                a2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        if (d == null) {
                            zzun.zzaW(String.format("Hit %d retrieved from the store has null HTTP method.", new Object[]{Long.valueOf(anVar.a())}));
                            this.d.zzb(anVar);
                            a2.disconnect();
                            obj = obj3;
                        } else if (d.equals("GET") || d.equals("HEAD") || d.equals("POST") || d.equals("PUT")) {
                            obj2 = -1;
                            switch (d.hashCode()) {
                                case 70454:
                                    if (d.equals("GET")) {
                                        obj2 = null;
                                        break;
                                    }
                                    break;
                                case 79599:
                                    if (d.equals("PUT")) {
                                        obj2 = 3;
                                        break;
                                    }
                                    break;
                                case 2213344:
                                    if (d.equals("HEAD")) {
                                        obj2 = 1;
                                        break;
                                    }
                                    break;
                                case 2461856:
                                    if (d.equals("POST")) {
                                        obj2 = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (obj2) {
                                case null:
                                case 1:
                                    if (f != null) {
                                        zzun.zzaW(String.format("Body of %s hit is ignored: %s.", new Object[]{d, f}));
                                    }
                                    a2.setRequestMethod(d);
                                    break;
                                case 2:
                                case 3:
                                    a2.setRequestMethod(d);
                                    if (f != null) {
                                        a2.setDoOutput(true);
                                        byte[] bytes = f.getBytes(Charset.forName(Constants.ENCODING));
                                        a2.setFixedLengthStreamingMode(bytes.length);
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(a2.getOutputStream());
                                        bufferedOutputStream.write(bytes);
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        break;
                                    }
                                    break;
                            }
                            int responseCode = a2.getResponseCode();
                            inputStream = a2.getInputStream();
                            if (responseCode != 200) {
                                try {
                                    valueOf = String.valueOf(a);
                                    zzun.zzaW(new StringBuilder(String.valueOf(valueOf).length() + 39).append("Bad response received for ").append(valueOf).append(": ").append(responseCode).toString());
                                    this.d.zzc(anVar);
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream == null) {
                                        inputStream.close();
                                    }
                                    a2.disconnect();
                                    throw th;
                                }
                            }
                            String valueOf2 = String.valueOf(a);
                            zzun.v(new StringBuilder((String.valueOf(valueOf2).length() + 23) + String.valueOf(d).length()).append("Hit sent to ").append(valueOf2).append("(method = ").append(d).append(")").toString());
                            this.d.zza(anVar);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            a2.disconnect();
                            obj = obj3;
                        } else {
                            zzun.zzaW(String.format("Unrecongnized HTTP method %s. Supported methods are GET, HEAD, PUT and/or POST", new Object[]{d}));
                            this.d.zzb(anVar);
                            a2.disconnect();
                            obj = obj3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        if (inputStream == null) {
                            inputStream.close();
                        }
                        a2.disconnect();
                        throw th;
                    }
                } catch (IOException e3) {
                    iOException = e3;
                    String valueOf3 = String.valueOf(a);
                    valueOf = String.valueOf(iOException.getClass().getSimpleName());
                    zzun.zzaW(new StringBuilder((String.valueOf(valueOf3).length() + 27) + String.valueOf(valueOf).length()).append("Exception sending hit to ").append(valueOf3).append(": ").append(valueOf).toString());
                    zzun.zzaW(iOException.getMessage());
                    this.d.zzc(anVar);
                    obj = obj2;
                    i++;
                    obj2 = obj;
                }
            }
            i++;
            obj2 = obj;
        }
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzun.v("...no network connectivity");
        return false;
    }
}
