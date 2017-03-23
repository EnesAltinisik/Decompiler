package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

@zzig
public final class zzeq implements zzeh {
    private final Map<zzla, Integer> zzCs = new WeakHashMap();
    private boolean zzCt;

    private static int zza(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                i = zzm.zzdQ().zza(context, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                zzb.zzaW(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Could not parse ").append(str).append(" in a video GMSG: ").append(str2).toString());
            }
        }
        return i;
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        String str = (String) map.get("action");
        if (str == null) {
            zzb.zzaW("Action missing from video GMSG.");
            return;
        }
        if (zzb.zzX(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject.toString());
            zzb.zzaU(new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()).append("Video GMSG: ").append(str).append(" ").append(valueOf).toString());
        }
        if ("background".equals(str)) {
            valueOf = (String) map.get("color");
            if (TextUtils.isEmpty(valueOf)) {
                zzb.zzaW("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                int parseColor = Color.parseColor(valueOf);
                zzkz zzjK = com_google_android_gms_internal_zzla.zzjK();
                if (zzjK != null) {
                    zzk zzjv = zzjK.zzjv();
                    if (zzjv != null) {
                        zzjv.setBackgroundColor(parseColor);
                        return;
                    }
                }
                this.zzCs.put(com_google_android_gms_internal_zzla, Integer.valueOf(parseColor));
                return;
            } catch (IllegalArgumentException e) {
                zzb.zzaW("Invalid color parameter in video GMSG.");
                return;
            }
        }
        zzkz zzjK2 = com_google_android_gms_internal_zzla.zzjK();
        if (zzjK2 == null) {
            zzb.zzaW("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        int zza;
        int zza2;
        if (equals || equals2) {
            int parseInt;
            Context context = com_google_android_gms_internal_zzla.getContext();
            int zza3 = zza(context, map, "x", 0);
            zza = zza(context, map, "y", 0);
            zza2 = zza(context, map, "w", -1);
            int zza4 = zza(context, map, "h", -1);
            try {
                parseInt = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e2) {
                parseInt = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && zzjK2.zzjv() == null) {
                zzjK2.zza(zza3, zza, zza2, zza4, parseInt, parseBoolean);
                if (this.zzCs.containsKey(com_google_android_gms_internal_zzla)) {
                    zzjK2.zzjv().setBackgroundColor(((Integer) this.zzCs.get(com_google_android_gms_internal_zzla)).intValue());
                    return;
                }
                return;
            }
            zzjK2.zze(zza3, zza, zza2, zza4);
            return;
        }
        zzk zzjv2 = zzjK2.zzjv();
        if (zzjv2 == null) {
            zzk.zzh(com_google_android_gms_internal_zzla);
        } else if ("click".equals(str)) {
            r0 = com_google_android_gms_internal_zzla.getContext();
            zza = zza(r0, map, "x", 0);
            zza2 = zza(r0, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) zza, (float) zza2, 0);
            zzjv2.zzd(obtain);
            obtain.recycle();
        } else if ("currentTime".equals(str)) {
            valueOf = (String) map.get("time");
            if (valueOf == null) {
                zzb.zzaW("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzjv2.seekTo((int) (Float.parseFloat(valueOf) * 1000.0f));
            } catch (NumberFormatException e3) {
                str = "Could not parse time parameter from currentTime video GMSG: ";
                valueOf = String.valueOf(valueOf);
                zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if ("hide".equals(str)) {
            zzjv2.setVisibility(4);
        } else if ("load".equals(str)) {
            zzjv2.zzfp();
        } else if ("mimetype".equals(str)) {
            zzjv2.setMimeType((String) map.get("mimetype"));
        } else if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzjv2.zzgi();
            } else {
                zzjv2.zzgj();
            }
        } else if ("pause".equals(str)) {
            zzjv2.pause();
        } else if ("play".equals(str)) {
            zzjv2.play();
        } else if ("show".equals(str)) {
            zzjv2.setVisibility(0);
        } else if ("src".equals(str)) {
            zzjv2.zzav((String) map.get("src"));
        } else if ("touchMove".equals(str)) {
            r0 = com_google_android_gms_internal_zzla.getContext();
            zzjv2.zza((float) zza(r0, map, "dx", 0), (float) zza(r0, map, "dy", 0));
            if (!this.zzCt) {
                com_google_android_gms_internal_zzla.zzjB().zzgv();
                this.zzCt = true;
            }
        } else if ("volume".equals(str)) {
            valueOf = (String) map.get("volume");
            if (valueOf == null) {
                zzb.zzaW("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzjv2.zza(Float.parseFloat(valueOf));
            } catch (NumberFormatException e4) {
                str = "Could not parse volume parameter from volume video GMSG: ";
                valueOf = String.valueOf(valueOf);
                zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if ("watermark".equals(str)) {
            zzjv2.zzgH();
        } else {
            String str2 = "Unknown video action: ";
            valueOf = String.valueOf(str);
            zzb.zzaW(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }
}
