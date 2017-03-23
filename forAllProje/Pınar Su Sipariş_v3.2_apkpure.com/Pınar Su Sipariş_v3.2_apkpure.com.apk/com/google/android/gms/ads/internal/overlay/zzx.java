package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcy;
import com.google.android.gms.internal.zzda;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzkf;
import com.google.android.gms.internal.zzkf.zza;
import com.google.android.gms.internal.zzkf.zzb;
import java.util.concurrent.TimeUnit;

@zzig
public class zzx {
    private final Context mContext;
    private final String zzII;
    private final zzda zzIJ;
    private final zzdc zzIK;
    private final zzkf zzIL = new zzb().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzjj();
    private final long[] zzIM;
    private final String[] zzIN;
    private zzda zzIO;
    private zzda zzIP;
    private zzda zzIQ;
    private zzda zzIR;
    private boolean zzIS;
    private zzi zzIT;
    private boolean zzIU;
    private boolean zzIV;
    private long zzIW = -1;
    private final VersionInfoParcel zzrx;

    public zzx(Context context, VersionInfoParcel versionInfoParcel, String str, zzdc com_google_android_gms_internal_zzdc, zzda com_google_android_gms_internal_zzda) {
        this.mContext = context;
        this.zzrx = versionInfoParcel;
        this.zzII = str;
        this.zzIK = com_google_android_gms_internal_zzdc;
        this.zzIJ = com_google_android_gms_internal_zzda;
        String str2 = (String) zzcu.zzxu.get();
        if (str2 == null) {
            this.zzIN = new String[0];
            this.zzIM = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.zzIN = new String[split.length];
        this.zzIM = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzIM[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Unable to parse frame hash target time number.", e);
                this.zzIM[i] = -1;
            }
        }
    }

    private void zzc(zzi com_google_android_gms_ads_internal_overlay_zzi) {
        long longValue = ((Long) zzcu.zzxv.get()).longValue();
        long currentPosition = (long) com_google_android_gms_ads_internal_overlay_zzi.getCurrentPosition();
        int i = 0;
        while (i < this.zzIN.length) {
            if (this.zzIN[i] == null && longValue > Math.abs(currentPosition - this.zzIM[i])) {
                this.zzIN[i] = zza((TextureView) com_google_android_gms_ads_internal_overlay_zzi);
                return;
            }
            i++;
        }
    }

    private void zzhc() {
        if (this.zzIQ != null && this.zzIR == null) {
            zzcy.zza(this.zzIK, this.zzIQ, "vff");
            zzcy.zza(this.zzIK, this.zzIJ, "vtt");
            this.zzIR = zzcy.zzb(this.zzIK);
        }
        long nanoTime = zzu.zzco().nanoTime();
        if (this.zzIS && this.zzIV && this.zzIW != -1) {
            this.zzIL.zza(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (nanoTime - this.zzIW)));
        }
        this.zzIV = this.zzIS;
        this.zzIW = nanoTime;
    }

    public void onStop() {
        if (((Boolean) zzcu.zzxt.get()).booleanValue() && !this.zzIU) {
            String valueOf;
            String valueOf2;
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzII);
            bundle.putString("player", this.zzIT.zzgc());
            for (zza com_google_android_gms_internal_zzkf_zza : this.zzIL.getBuckets()) {
                valueOf = String.valueOf("fps_c_");
                valueOf2 = String.valueOf(com_google_android_gms_internal_zzkf_zza.name);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(com_google_android_gms_internal_zzkf_zza.count));
                valueOf = String.valueOf("fps_p_");
                valueOf2 = String.valueOf(com_google_android_gms_internal_zzkf_zza.name);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Double.toString(com_google_android_gms_internal_zzkf_zza.zzQQ));
            }
            for (int i = 0; i < this.zzIM.length; i++) {
                valueOf2 = this.zzIN[i];
                if (valueOf2 != null) {
                    String valueOf3 = String.valueOf("fh_");
                    valueOf = String.valueOf(Long.valueOf(this.zzIM[i]));
                    bundle.putString(new StringBuilder((String.valueOf(valueOf3).length() + 0) + String.valueOf(valueOf).length()).append(valueOf3).append(valueOf).toString(), valueOf2);
                }
            }
            zzu.zzck().zza(this.mContext, this.zzrx.afmaVersion, "gmob-apps", bundle, true);
            this.zzIU = true;
        }
    }

    String zza(TextureView textureView) {
        Bitmap bitmap = textureView.getBitmap(8, 8);
        long j = 0;
        long j2 = 63;
        int i = 0;
        while (i < 8) {
            long j3 = j;
            j = j2;
            for (int i2 = 0; i2 < 8; i2++) {
                int pixel = bitmap.getPixel(i2, i);
                j3 |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > 128 ? 1 : 0) << ((int) j);
                j--;
            }
            i++;
            j2 = j;
            j = j3;
        }
        return String.format("%016X", new Object[]{Long.valueOf(j)});
    }

    public void zza(zzi com_google_android_gms_ads_internal_overlay_zzi) {
        zzcy.zza(this.zzIK, this.zzIJ, "vpc");
        this.zzIO = zzcy.zzb(this.zzIK);
        if (this.zzIK != null) {
            this.zzIK.zzf("vpn", com_google_android_gms_ads_internal_overlay_zzi.zzgc());
        }
        this.zzIT = com_google_android_gms_ads_internal_overlay_zzi;
    }

    public void zzb(zzi com_google_android_gms_ads_internal_overlay_zzi) {
        zzhc();
        zzc(com_google_android_gms_ads_internal_overlay_zzi);
    }

    public void zzgD() {
        if (this.zzIO != null && this.zzIP == null) {
            zzcy.zza(this.zzIK, this.zzIO, "vfr");
            this.zzIP = zzcy.zzb(this.zzIK);
        }
    }

    public void zzhd() {
        this.zzIS = true;
        if (this.zzIP != null && this.zzIQ == null) {
            zzcy.zza(this.zzIK, this.zzIP, "vfp");
            this.zzIQ = zzcy.zzb(this.zzIK);
        }
    }

    public void zzhe() {
        this.zzIS = false;
    }
}
