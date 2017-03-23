package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzao;
import com.google.android.gms.analytics.internal.zzc;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzln;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlp;
import com.google.android.gms.internal.zzlq;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzls;
import com.google.android.gms.internal.zzlt;
import com.google.android.gms.internal.zzlu;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzlw;
import com.google.android.gms.internal.zzlx;
import com.google.android.gms.internal.zzly;
import com.google.android.gms.internal.zzlz;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzb extends zzc implements zzk {
    private static DecimalFormat zzTI;
    private final zzf zzTE;
    private final String zzTJ;
    private final Uri zzTK;
    private final boolean zzTL;
    private final boolean zzTM;

    public zzb(zzf com_google_android_gms_analytics_internal_zzf, String str) {
        this(com_google_android_gms_analytics_internal_zzf, str, true, false);
    }

    public zzb(zzf com_google_android_gms_analytics_internal_zzf, String str, boolean z, boolean z2) {
        super(com_google_android_gms_analytics_internal_zzf);
        zzaa.zzdl(str);
        this.zzTE = com_google_android_gms_analytics_internal_zzf;
        this.zzTJ = str;
        this.zzTL = z;
        this.zzTM = z2;
        this.zzTK = zzbh(this.zzTJ);
    }

    private static String zzN(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("=");
            stringBuilder.append((String) entry.getValue());
        }
        return stringBuilder.toString();
    }

    private static void zza(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, zzb(d));
        }
    }

    private static void zza(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            map.put(str, i + "x" + i2);
        }
    }

    private static void zza(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    static String zzb(double d) {
        if (zzTI == null) {
            zzTI = new DecimalFormat("0.######");
        }
        return zzTI.format(d);
    }

    private static void zzb(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    static Uri zzbh(String str) {
        zzaa.zzdl(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    public static Map<String, String> zzc(zze com_google_android_gms_analytics_zze) {
        CharSequence zzab;
        Map hashMap = new HashMap();
        zzlr com_google_android_gms_internal_zzlr = (zzlr) com_google_android_gms_analytics_zze.zza(zzlr.class);
        if (com_google_android_gms_internal_zzlr != null) {
            for (Entry entry : com_google_android_gms_internal_zzlr.zzlf().entrySet()) {
                String zzi = zzi(entry.getValue());
                if (zzi != null) {
                    hashMap.put((String) entry.getKey(), zzi);
                }
            }
        }
        zzlw com_google_android_gms_internal_zzlw = (zzlw) com_google_android_gms_analytics_zze.zza(zzlw.class);
        if (com_google_android_gms_internal_zzlw != null) {
            zzb(hashMap, "t", com_google_android_gms_internal_zzlw.zzlr());
            zzb(hashMap, "cid", com_google_android_gms_internal_zzlw.zzku());
            zzb(hashMap, "uid", com_google_android_gms_internal_zzlw.getUserId());
            zzb(hashMap, "sc", com_google_android_gms_internal_zzlw.zzlu());
            zza(hashMap, "sf", com_google_android_gms_internal_zzlw.zzlw());
            zza(hashMap, "ni", com_google_android_gms_internal_zzlw.zzlv());
            zzb(hashMap, "adid", com_google_android_gms_internal_zzlw.zzls());
            zza(hashMap, "ate", com_google_android_gms_internal_zzlw.zzlt());
        }
        zzlx com_google_android_gms_internal_zzlx = (zzlx) com_google_android_gms_analytics_zze.zza(zzlx.class);
        if (com_google_android_gms_internal_zzlx != null) {
            zzb(hashMap, "cd", com_google_android_gms_internal_zzlx.zzly());
            zza(hashMap, "a", (double) com_google_android_gms_internal_zzlx.zzlz());
            zzb(hashMap, "dr", com_google_android_gms_internal_zzlx.zzlA());
        }
        zzlu com_google_android_gms_internal_zzlu = (zzlu) com_google_android_gms_analytics_zze.zza(zzlu.class);
        if (com_google_android_gms_internal_zzlu != null) {
            zzb(hashMap, "ec", com_google_android_gms_internal_zzlu.zzlp());
            zzb(hashMap, "ea", com_google_android_gms_internal_zzlu.getAction());
            zzb(hashMap, "el", com_google_android_gms_internal_zzlu.getLabel());
            zza(hashMap, "ev", (double) com_google_android_gms_internal_zzlu.getValue());
        }
        zzlo com_google_android_gms_internal_zzlo = (zzlo) com_google_android_gms_analytics_zze.zza(zzlo.class);
        if (com_google_android_gms_internal_zzlo != null) {
            zzb(hashMap, "cn", com_google_android_gms_internal_zzlo.getName());
            zzb(hashMap, "cs", com_google_android_gms_internal_zzlo.getSource());
            zzb(hashMap, "cm", com_google_android_gms_internal_zzlo.zzkX());
            zzb(hashMap, "ck", com_google_android_gms_internal_zzlo.zzkY());
            zzb(hashMap, "cc", com_google_android_gms_internal_zzlo.getContent());
            zzb(hashMap, "ci", com_google_android_gms_internal_zzlo.getId());
            zzb(hashMap, "anid", com_google_android_gms_internal_zzlo.zzkZ());
            zzb(hashMap, "gclid", com_google_android_gms_internal_zzlo.zzla());
            zzb(hashMap, "dclid", com_google_android_gms_internal_zzlo.zzlb());
            zzb(hashMap, "aclid", com_google_android_gms_internal_zzlo.zzlc());
        }
        zzlv com_google_android_gms_internal_zzlv = (zzlv) com_google_android_gms_analytics_zze.zza(zzlv.class);
        if (com_google_android_gms_internal_zzlv != null) {
            zzb(hashMap, "exd", com_google_android_gms_internal_zzlv.getDescription());
            zza(hashMap, "exf", com_google_android_gms_internal_zzlv.zzlq());
        }
        zzly com_google_android_gms_internal_zzly = (zzly) com_google_android_gms_analytics_zze.zza(zzly.class);
        if (com_google_android_gms_internal_zzly != null) {
            zzb(hashMap, "sn", com_google_android_gms_internal_zzly.zzlC());
            zzb(hashMap, "sa", com_google_android_gms_internal_zzly.getAction());
            zzb(hashMap, "st", com_google_android_gms_internal_zzly.getTarget());
        }
        zzlz com_google_android_gms_internal_zzlz = (zzlz) com_google_android_gms_analytics_zze.zza(zzlz.class);
        if (com_google_android_gms_internal_zzlz != null) {
            zzb(hashMap, "utv", com_google_android_gms_internal_zzlz.zzlD());
            zza(hashMap, "utt", (double) com_google_android_gms_internal_zzlz.getTimeInMillis());
            zzb(hashMap, "utc", com_google_android_gms_internal_zzlz.zzlp());
            zzb(hashMap, "utl", com_google_android_gms_internal_zzlz.getLabel());
        }
        zzlp com_google_android_gms_internal_zzlp = (zzlp) com_google_android_gms_analytics_zze.zza(zzlp.class);
        if (com_google_android_gms_internal_zzlp != null) {
            for (Entry entry2 : com_google_android_gms_internal_zzlp.zzld().entrySet()) {
                zzab = zzc.zzab(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(zzab)) {
                    hashMap.put(zzab, (String) entry2.getValue());
                }
            }
        }
        zzlq com_google_android_gms_internal_zzlq = (zzlq) com_google_android_gms_analytics_zze.zza(zzlq.class);
        if (com_google_android_gms_internal_zzlq != null) {
            for (Entry entry22 : com_google_android_gms_internal_zzlq.zzle().entrySet()) {
                zzab = zzc.zzad(((Integer) entry22.getKey()).intValue());
                if (!TextUtils.isEmpty(zzab)) {
                    hashMap.put(zzab, zzb(((Double) entry22.getValue()).doubleValue()));
                }
            }
        }
        zzlt com_google_android_gms_internal_zzlt = (zzlt) com_google_android_gms_analytics_zze.zza(zzlt.class);
        if (com_google_android_gms_internal_zzlt != null) {
            ProductAction zzll = com_google_android_gms_internal_zzlt.zzll();
            if (zzll != null) {
                for (Entry entry3 : zzll.build().entrySet()) {
                    if (((String) entry3.getKey()).startsWith("&")) {
                        hashMap.put(((String) entry3.getKey()).substring(1), (String) entry3.getValue());
                    } else {
                        hashMap.put((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
            }
            int i = 1;
            for (Promotion zzbD : com_google_android_gms_internal_zzlt.zzlo()) {
                hashMap.putAll(zzbD.zzbD(zzc.zzah(i)));
                i++;
            }
            i = 1;
            for (Product zzbD2 : com_google_android_gms_internal_zzlt.zzlm()) {
                hashMap.putAll(zzbD2.zzbD(zzc.zzaf(i)));
                i++;
            }
            i = 1;
            for (Entry entry222 : com_google_android_gms_internal_zzlt.zzln().entrySet()) {
                List<Product> list = (List) entry222.getValue();
                String zzak = zzc.zzak(i);
                int i2 = 1;
                for (Product zzbD22 : list) {
                    String valueOf = String.valueOf(zzak);
                    String valueOf2 = String.valueOf(zzc.zzai(i2));
                    hashMap.putAll(zzbD22.zzbD(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i2++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry222.getKey())) {
                    String valueOf3 = String.valueOf(zzak);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry222.getKey());
                }
                i++;
            }
        }
        zzls com_google_android_gms_internal_zzls = (zzls) com_google_android_gms_analytics_zze.zza(zzls.class);
        if (com_google_android_gms_internal_zzls != null) {
            zzb(hashMap, "ul", com_google_android_gms_internal_zzls.getLanguage());
            zza(hashMap, "sd", (double) com_google_android_gms_internal_zzls.zzlg());
            zza(hashMap, "sr", com_google_android_gms_internal_zzls.zzlh(), com_google_android_gms_internal_zzls.zzli());
            zza(hashMap, "vp", com_google_android_gms_internal_zzls.zzlj(), com_google_android_gms_internal_zzls.zzlk());
        }
        zzln com_google_android_gms_internal_zzln = (zzln) com_google_android_gms_analytics_zze.zza(zzln.class);
        if (com_google_android_gms_internal_zzln != null) {
            zzb(hashMap, "an", com_google_android_gms_internal_zzln.zzkU());
            zzb(hashMap, "aid", com_google_android_gms_internal_zzln.zziC());
            zzb(hashMap, "aiid", com_google_android_gms_internal_zzln.zzkW());
            zzb(hashMap, "av", com_google_android_gms_internal_zzln.zzkV());
        }
        return hashMap;
    }

    private static String zzi(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return TextUtils.isEmpty(str) ? null : str;
        } else if (!(obj instanceof Double)) {
            return obj instanceof Boolean ? obj != Boolean.FALSE ? "1" : null : String.valueOf(obj);
        } else {
            Double d = (Double) obj;
            return d.doubleValue() != 0.0d ? zzb(d.doubleValue()) : null;
        }
    }

    public void zzb(zze com_google_android_gms_analytics_zze) {
        zzaa.zzz(com_google_android_gms_analytics_zze);
        zzaa.zzb(com_google_android_gms_analytics_zze.zzkD(), (Object) "Can't deliver not submitted measurement");
        zzaa.zzdd("deliver should be called on worker thread");
        zze zzky = com_google_android_gms_analytics_zze.zzky();
        zzlw com_google_android_gms_internal_zzlw = (zzlw) zzky.zzb(zzlw.class);
        if (TextUtils.isEmpty(com_google_android_gms_internal_zzlw.zzlr())) {
            zzlR().zzh(zzc(zzky), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(com_google_android_gms_internal_zzlw.zzku())) {
            zzlR().zzh(zzc(zzky), "Ignoring measurement without client id");
        } else if (!this.zzTE.zzme().getAppOptOut()) {
            double zzlw = com_google_android_gms_internal_zzlw.zzlw();
            if (zzao.zza(zzlw, com_google_android_gms_internal_zzlw.zzku())) {
                zzb("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(zzlw));
                return;
            }
            Map zzc = zzc(zzky);
            zzc.put("v", "1");
            zzc.put("_v", zze.zzWi);
            zzc.put("tid", this.zzTJ);
            if (this.zzTE.zzme().isDryRunEnabled()) {
                zzc("Dry run is enabled. GoogleAnalytics would have sent", zzN(zzc));
                return;
            }
            Map hashMap = new HashMap();
            zzao.zzc(hashMap, "uid", com_google_android_gms_internal_zzlw.getUserId());
            zzln com_google_android_gms_internal_zzln = (zzln) com_google_android_gms_analytics_zze.zza(zzln.class);
            if (com_google_android_gms_internal_zzln != null) {
                zzao.zzc(hashMap, "an", com_google_android_gms_internal_zzln.zzkU());
                zzao.zzc(hashMap, "aid", com_google_android_gms_internal_zzln.zziC());
                zzao.zzc(hashMap, "av", com_google_android_gms_internal_zzln.zzkV());
                zzao.zzc(hashMap, "aiid", com_google_android_gms_internal_zzln.zzkW());
            }
            zzc.put("_s", String.valueOf(zzkw().zza(new zzh(0, com_google_android_gms_internal_zzlw.zzku(), this.zzTJ, !TextUtils.isEmpty(com_google_android_gms_internal_zzlw.zzls()), 0, hashMap))));
            zzkw().zza(new zzab(zzlR(), zzc, com_google_android_gms_analytics_zze.zzkB(), true));
        }
    }

    public Uri zzkn() {
        return this.zzTK;
    }
}
