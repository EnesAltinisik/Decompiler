package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zzab.zza;
import com.google.android.gms.ads.internal.client.zzac;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.zzf;
import java.util.HashMap;
import java.util.Map;

@zzig
public class zzlf extends zza {
    private final zzla zzBb;
    private final float zzSP;
    private int zzSQ;
    private zzac zzSR;
    private boolean zzSS;
    private boolean zzST;
    private float zzSU;
    private final Object zzpp = new Object();
    private boolean zzps = true;

    public zzlf(zzla com_google_android_gms_internal_zzla, float f) {
        this.zzBb = com_google_android_gms_internal_zzla;
        this.zzSP = f;
    }

    private void zzbc(String str) {
        zzc(str, null);
    }

    private void zzc(String str, Map<String, String> map) {
        final Map hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzu.zzck().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzlf b;

            public void run() {
                this.b.zzBb.zza("pubVideoCmd", hashMap);
            }
        });
    }

    private void zzi(final int i, final int i2) {
        zzu.zzck().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzlf c;

            public void run() {
                boolean z = false;
                synchronized (this.c.zzpp) {
                    boolean z2 = i != i2;
                    boolean z3 = !this.c.zzSS && i2 == 1;
                    boolean z4 = z2 && i2 == 1;
                    boolean z5 = z2 && i2 == 2;
                    z2 = z2 && i2 == 3;
                    zzlf com_google_android_gms_internal_zzlf = this.c;
                    if (this.c.zzSS || z3) {
                        z = true;
                    }
                    com_google_android_gms_internal_zzlf.zzSS = z;
                    if (this.c.zzSR == null) {
                        return;
                    }
                    if (z3) {
                        try {
                            this.c.zzSR.zzdV();
                        } catch (Throwable e) {
                            zzb.zzd("Unable to call onVideoStart()", e);
                        }
                    }
                    if (z4) {
                        try {
                            this.c.zzSR.zzdW();
                        } catch (Throwable e2) {
                            zzb.zzd("Unable to call onVideoPlay()", e2);
                        }
                    }
                    if (z5) {
                        try {
                            this.c.zzSR.zzdX();
                        } catch (Throwable e22) {
                            zzb.zzd("Unable to call onVideoPause()", e22);
                        }
                    }
                    if (z2) {
                        try {
                            this.c.zzSR.onVideoEnd();
                        } catch (Throwable e222) {
                            zzb.zzd("Unable to call onVideoEnd()", e222);
                        }
                    }
                }
            }
        });
    }

    public int getPlaybackState() {
        int i;
        synchronized (this.zzpp) {
            i = this.zzSQ;
        }
        return i;
    }

    public boolean isMuted() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzST;
        }
        return z;
    }

    public void pause() {
        zzbc("pause");
    }

    public void play() {
        zzbc("play");
    }

    public void zzL(boolean z) {
        synchronized (this.zzpp) {
            this.zzps = z;
        }
        zzc("initialState", zzf.zze("muteStart", z ? "1" : "0"));
    }

    public void zza(float f, int i, boolean z) {
        int i2;
        synchronized (this.zzpp) {
            this.zzSU = f;
            this.zzST = z;
            i2 = this.zzSQ;
            this.zzSQ = i;
        }
        zzi(i2, i);
    }

    public void zza(zzac com_google_android_gms_ads_internal_client_zzac) {
        synchronized (this.zzpp) {
            this.zzSR = com_google_android_gms_ads_internal_client_zzac;
        }
    }

    public float zzdT() {
        return this.zzSP;
    }

    public float zzdU() {
        float f;
        synchronized (this.zzpp) {
            f = this.zzSU;
        }
        return f;
    }

    public void zzl(boolean z) {
        zzbc(z ? "mute" : "unmute");
    }
}
