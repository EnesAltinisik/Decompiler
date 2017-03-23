package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzabt;
import com.google.android.gms.internal.zzabw;
import com.google.android.gms.internal.zzabx;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.tagmanager.zzbm.zza;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

class bg implements Runnable {
    private final Context a;
    private final zzabx b;
    private final String c;
    private final String d;
    private zzbm<zzj> e;
    private volatile ci f;
    private volatile String g;
    private volatile String h;

    bg(Context context, String str, zzabx com_google_android_gms_internal_zzabx, ci ciVar) {
        this.a = context;
        this.b = com_google_android_gms_internal_zzabx;
        this.c = str;
        this.f = ciVar;
        String valueOf = String.valueOf("/r?id=");
        String valueOf2 = String.valueOf(str);
        this.d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        this.g = this.d;
        this.h = null;
    }

    public bg(Context context, String str, ci ciVar) {
        this(context, str, new zzabx(), ciVar);
    }

    private boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzbn.v("...no network connectivity");
        return false;
    }

    private void c() {
        String valueOf;
        if (b()) {
            zzbn.v("Start loading resource from network ...");
            String a = a();
            zzabw zzMM = this.b.zzMM();
            String valueOf2;
            try {
                InputStream zzho = zzMM.zzho(a);
                try {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    zzabt.zzc(zzho, byteArrayOutputStream);
                    Object zzd = zzj.zzd(byteArrayOutputStream.toByteArray());
                    valueOf2 = String.valueOf(zzd);
                    zzbn.v(new StringBuilder(String.valueOf(valueOf2).length() + 43).append("Successfully loaded supplemented resource: ").append(valueOf2).toString());
                    if (zzd.zzjG == null && zzd.zzjF.length == 0) {
                        String str = "No change for container: ";
                        valueOf2 = String.valueOf(this.c);
                        zzbn.v(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
                    }
                    this.e.a(zzd);
                    zzbn.v("Load resource from network finished.");
                } catch (Throwable e) {
                    valueOf = String.valueOf(e.getMessage());
                    zzbn.zzd(new StringBuilder((String.valueOf(a).length() + 51) + String.valueOf(valueOf).length()).append("Error when parsing downloaded resources from url: ").append(a).append(" ").append(valueOf).toString(), e);
                    this.e.a(zza.SERVER_ERROR);
                    zzMM.close();
                }
            } catch (FileNotFoundException e2) {
                valueOf2 = this.c;
                zzbn.zzaW(new StringBuilder((String.valueOf(a).length() + 79) + String.valueOf(valueOf2).length()).append("No data is retrieved from the given url: ").append(a).append(". Make sure container_id: ").append(valueOf2).append(" is correct.").toString());
                this.e.a(zza.SERVER_ERROR);
            } catch (Throwable e3) {
                valueOf = String.valueOf(e3.getMessage());
                zzbn.zzd(new StringBuilder((String.valueOf(a).length() + 40) + String.valueOf(valueOf).length()).append("Error when loading resources from url: ").append(a).append(" ").append(valueOf).toString(), e3);
                this.e.a(zza.IO_ERROR);
            } finally {
                zzMM.close();
            }
        } else {
            this.e.a(zza.NOT_AVAILABLE);
        }
    }

    String a() {
        String valueOf = String.valueOf(this.f.a());
        String str = this.g;
        String valueOf2 = String.valueOf("&v=a65833898");
        valueOf = new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).toString();
        if (!(this.h == null || this.h.trim().equals(""))) {
            valueOf = String.valueOf(valueOf);
            str = String.valueOf("&pv=");
            valueOf2 = this.h;
            valueOf = new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).toString();
        }
        if (!aw.a().b().equals(a.CONTAINER_DEBUG)) {
            return valueOf;
        }
        str = String.valueOf(valueOf);
        valueOf = String.valueOf("&gtm_debug=x");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    void a(zzbm<zzj> com_google_android_gms_tagmanager_zzbm_com_google_android_gms_internal_zzaf_zzj) {
        this.e = com_google_android_gms_tagmanager_zzbm_com_google_android_gms_internal_zzaf_zzj;
    }

    void a(String str) {
        if (str == null) {
            this.g = this.d;
            return;
        }
        String str2 = "Setting CTFE URL path: ";
        String valueOf = String.valueOf(str);
        zzbn.zzaU(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.g = str;
    }

    void b(String str) {
        String str2 = "Setting previous container version: ";
        String valueOf = String.valueOf(str);
        zzbn.zzaU(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.h = str;
    }

    public void run() {
        if (this.e == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        this.e.a();
        c();
    }
}
