package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

class zzde implements c {
    private final String a;
    private final Context b;
    private final a c;
    private final zza d;

    public interface zza {
        void zza(q qVar);

        void zzb(q qVar);

        void zzc(q qVar);
    }

    interface a {
        HttpURLConnection a(URL url) throws IOException;
    }

    zzde(Context context, zza com_google_android_gms_tagmanager_zzde_zza) {
        this(new a() {
            public HttpURLConnection a(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }
        }, context, com_google_android_gms_tagmanager_zzde_zza);
    }

    zzde(a aVar, Context context, zza com_google_android_gms_tagmanager_zzde_zza) {
        this.c = aVar;
        this.b = context.getApplicationContext();
        this.d = com_google_android_gms_tagmanager_zzde_zza;
        this.a = a("GoogleTagManager", "4.00", VERSION.RELEASE, a(Locale.getDefault()), Build.MODEL, Build.ID);
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

    URL a(q qVar) {
        try {
            return new URL(qVar.c());
        } catch (MalformedURLException e) {
            zzbn.e("Error trying to parse the GTM url.");
            return null;
        }
    }

    public void a(List<q> list) {
        Object obj;
        Throwable th;
        InputStream inputStream;
        Object obj2;
        Throwable th2;
        Object obj3;
        IOException iOException;
        int min = Math.min(list.size(), 40);
        Object obj4 = 1;
        int i = 0;
        while (i < min) {
            q qVar = (q) list.get(i);
            URL a = a(qVar);
            if (a == null) {
                zzbn.zzaW("No destination: discarding hit.");
                this.d.zzb(qVar);
                obj = obj4;
            } else {
                try {
                    HttpURLConnection a2 = this.c.a(a);
                    if (obj4 != null) {
                        try {
                            ah.b(this.b);
                            obj4 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            obj2 = obj4;
                            th2 = th;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    obj3 = obj2;
                                    iOException = e;
                                }
                            }
                            a2.disconnect();
                            throw th2;
                        }
                    }
                    a2.setRequestProperty(a.a.a.a.a.b.a.HEADER_USER_AGENT, this.a);
                    int responseCode = a2.getResponseCode();
                    InputStream inputStream2 = a2.getInputStream();
                    if (responseCode != 200) {
                        try {
                            zzbn.zzaW("Bad response: " + responseCode);
                            this.d.zzc(qVar);
                        } catch (Throwable th32) {
                            th = th32;
                            inputStream = inputStream2;
                            obj2 = obj4;
                            th2 = th;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            a2.disconnect();
                            throw th2;
                        }
                    }
                    this.d.zza(qVar);
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    a2.disconnect();
                    obj = obj4;
                } catch (IOException e2) {
                    iOException = e2;
                    obj3 = obj4;
                    String str = "Exception sending hit: ";
                    String valueOf = String.valueOf(iOException.getClass().getSimpleName());
                    zzbn.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    zzbn.zzaW(iOException.getMessage());
                    this.d.zzc(qVar);
                    obj = obj3;
                    i++;
                    obj4 = obj;
                }
            }
            i++;
            obj4 = obj;
        }
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzbn.v("...no network connectivity");
        return false;
    }
}
