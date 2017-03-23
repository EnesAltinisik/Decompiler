package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzfj.zzc;
import java.util.Map;
import java.util.concurrent.Future;

@zzig
public final class zzik {
    private String zzII;
    private String zzNe;
    private zzko<x> zzNf = new zzko();
    zzc zzNg;
    public final zzeh zzNh = new zzeh(this) {
        final /* synthetic */ zzik a;

        {
            this.a = r1;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            synchronized (this.a.zzpp) {
                if (this.a.zzNf.isDone()) {
                } else if (this.a.zzII.equals(map.get("request_id"))) {
                    x xVar = new x(1, map);
                    String valueOf = String.valueOf(xVar.e());
                    String valueOf2 = String.valueOf(xVar.b());
                    zzb.zzaW(new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append("Invalid ").append(valueOf).append(" request error: ").append(valueOf2).toString());
                    this.a.zzNf.zzh(xVar);
                }
            }
        }
    };
    public final zzeh zzNi = new zzeh(this) {
        final /* synthetic */ zzik a;

        {
            this.a = r1;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            synchronized (this.a.zzpp) {
                if (this.a.zzNf.isDone()) {
                    return;
                }
                x xVar = new x(-2, map);
                if (this.a.zzII.equals(xVar.g())) {
                    String d = xVar.d();
                    if (d == null) {
                        zzb.zzaW("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (d.contains("%40mediation_adapters%40")) {
                        String replaceAll = d.replaceAll("%40mediation_adapters%40", zzju.zza(com_google_android_gms_internal_zzla.getContext(), (String) map.get("check_adapters"), this.a.zzNe));
                        xVar.a(replaceAll);
                        d = "Ad request URL modified to ";
                        replaceAll = String.valueOf(replaceAll);
                        zzjw.v(replaceAll.length() != 0 ? d.concat(replaceAll) : new String(d));
                    }
                    this.a.zzNf.zzh(xVar);
                    return;
                }
            }
        }
    };
    public final zzeh zzNj = new zzeh(this) {
        final /* synthetic */ zzik a;

        {
            this.a = r1;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            synchronized (this.a.zzpp) {
                if (this.a.zzNf.isDone()) {
                    return;
                }
                x xVar = new x(-2, map);
                if (this.a.zzII.equals(xVar.g())) {
                    xVar.i();
                    this.a.zzNf.zzh(xVar);
                    return;
                }
            }
        }
    };
    private final Object zzpp = new Object();

    public zzik(String str, String str2) {
        this.zzNe = str2;
        this.zzII = str;
    }

    public void zzb(zzc com_google_android_gms_internal_zzfj_zzc) {
        this.zzNg = com_google_android_gms_internal_zzfj_zzc;
    }

    public zzc zzia() {
        return this.zzNg;
    }

    public Future<x> zzib() {
        return this.zzNf;
    }

    public void zzic() {
    }
}
