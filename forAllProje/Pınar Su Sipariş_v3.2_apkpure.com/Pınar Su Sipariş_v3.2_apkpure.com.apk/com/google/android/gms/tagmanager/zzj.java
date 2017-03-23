package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzj extends bu {
    static final String a;
    private static final String b = zzad.ARBITRARY_PIXEL.toString();
    private static final String c = zzae.URL.toString();
    private static final String d = zzae.ADDITIONAL_PARAMS.toString();
    private static final String e = zzae.UNREPEATABLE.toString();
    private static final Set<String> f = new HashSet();
    private final zza g;
    private final Context h;

    public interface zza {
        zzas zzJg();
    }

    class AnonymousClass1 implements zza {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public zzas zzJg() {
            return zzz.zzbh(this.a);
        }
    }

    static {
        String str = b;
        a = new StringBuilder(String.valueOf(str).length() + 17).append("gtm_").append(str).append("_unrepeatable").toString();
    }

    public zzj(Context context) {
        this(context, new AnonymousClass1(context));
    }

    zzj(Context context, zza com_google_android_gms_tagmanager_zzj_zza) {
        super(b, c);
        this.g = com_google_android_gms_tagmanager_zzj_zza;
        this.h = context;
    }

    private synchronized boolean c(String str) {
        boolean z = true;
        synchronized (this) {
            if (!b(str)) {
                if (a(str)) {
                    f.add(str);
                } else {
                    z = false;
                }
            }
        }
        return z;
    }

    boolean a(String str) {
        return this.h.getSharedPreferences(a, 0).contains(str);
    }

    boolean b(String str) {
        return f.contains(str);
    }

    public void zzX(Map<String, com.google.android.gms.internal.zzag.zza> map) {
        String zzg = map.get(e) != null ? zzdl.zzg((com.google.android.gms.internal.zzag.zza) map.get(e)) : null;
        if (zzg == null || !c(zzg)) {
            String valueOf;
            Builder buildUpon = Uri.parse(zzdl.zzg((com.google.android.gms.internal.zzag.zza) map.get(c))).buildUpon();
            com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza = (com.google.android.gms.internal.zzag.zza) map.get(d);
            if (com_google_android_gms_internal_zzag_zza != null) {
                Object zzl = zzdl.zzl(com_google_android_gms_internal_zzag_zza);
                if (zzl instanceof List) {
                    for (Object zzl2 : (List) zzl2) {
                        if (zzl2 instanceof Map) {
                            for (Entry entry : ((Map) zzl2).entrySet()) {
                                buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                            }
                        } else {
                            zzg = "ArbitraryPixel: additional params contains non-map: not sending partial hit: ";
                            valueOf = String.valueOf(buildUpon.build().toString());
                            zzbn.e(valueOf.length() != 0 ? zzg.concat(valueOf) : new String(zzg));
                            return;
                        }
                    }
                }
                zzg = "ArbitraryPixel: additional params not a list: not sending partial hit: ";
                valueOf = String.valueOf(buildUpon.build().toString());
                zzbn.e(valueOf.length() != 0 ? zzg.concat(valueOf) : new String(zzg));
                return;
            }
            valueOf = buildUpon.build().toString();
            this.g.zzJg().zzgw(valueOf);
            String str = "ArbitraryPixel: url = ";
            valueOf = String.valueOf(valueOf);
            zzbn.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            if (zzg != null) {
                synchronized (zzj.class) {
                    f.add(zzg);
                    bp.a(this.h, a, zzg, "true");
                }
            }
        }
    }
}
