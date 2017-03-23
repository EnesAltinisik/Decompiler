package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzd.zzc;
import com.google.android.gms.internal.zzcn;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzii;
import com.google.android.gms.internal.zzkc;
import com.google.android.gms.internal.zzkt;

@zzig
public abstract class zzd implements com.google.android.gms.ads.internal.request.zzc.zza, zzkc<Void> {
    private final zzkt<AdRequestInfoParcel> zzLa;
    private final com.google.android.gms.ads.internal.request.zzc.zza zzLb;
    private final Object zzpp = new Object();

    @zzig
    public static final class zza extends zzd {
        private final Context mContext;

        public zza(Context context, zzkt<AdRequestInfoParcel> com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com.google.android.gms.ads.internal.request.zzc.zza com_google_android_gms_ads_internal_request_zzc_zza) {
            super(com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com_google_android_gms_ads_internal_request_zzc_zza);
            this.mContext = context;
        }

        public void zzhQ() {
        }

        public zzk zzhR() {
            return zzii.zza(this.mContext, new zzcn((String) zzcu.zzwZ.get()), zzih.zzhZ());
        }

        public /* synthetic */ Object zzhs() {
            return super.zzhp();
        }
    }

    @zzig
    public static class zzb extends zzd implements com.google.android.gms.common.internal.zzd.zzb, zzc {
        private Context mContext;
        private zzkt<AdRequestInfoParcel> zzLa;
        private final com.google.android.gms.ads.internal.request.zzc.zza zzLb;
        protected zze zzLe;
        private boolean zzLf;
        private final Object zzpp = new Object();
        private VersionInfoParcel zzqP;

        public zzb(Context context, VersionInfoParcel versionInfoParcel, zzkt<AdRequestInfoParcel> com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com.google.android.gms.ads.internal.request.zzc.zza com_google_android_gms_ads_internal_request_zzc_zza) {
            Looper zzjl;
            super(com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com_google_android_gms_ads_internal_request_zzc_zza);
            this.mContext = context;
            this.zzqP = versionInfoParcel;
            this.zzLa = com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel;
            this.zzLb = com_google_android_gms_ads_internal_request_zzc_zza;
            if (((Boolean) zzcu.zzxz.get()).booleanValue()) {
                this.zzLf = true;
                zzjl = zzu.zzcw().zzjl();
            } else {
                zzjl = context.getMainLooper();
            }
            this.zzLe = new zze(context, zzjl, this, this, this.zzqP.zzRD);
            connect();
        }

        protected void connect() {
            this.zzLe.zztj();
        }

        public void onConnected(Bundle bundle) {
            Void voidR = (Void) zzhs();
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaU("Cannot connect to remote service, fallback to local instance.");
            zzhS().zzhs();
            Bundle bundle = new Bundle();
            bundle.putString("action", "gms_connection_failed_fallback_to_local");
            zzu.zzck().zzb(this.mContext, this.zzqP.afmaVersion, "gmob-apps", bundle, true);
        }

        public void onConnectionSuspended(int i) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaU("Disconnected from remote ad request service.");
        }

        public void zzhQ() {
            synchronized (this.zzpp) {
                if (this.zzLe.isConnected() || this.zzLe.isConnecting()) {
                    this.zzLe.disconnect();
                }
                Binder.flushPendingCommands();
                if (this.zzLf) {
                    zzu.zzcw().zzjm();
                    this.zzLf = false;
                }
            }
        }

        public zzk zzhR() {
            zzk zzhV;
            synchronized (this.zzpp) {
                try {
                    zzhV = this.zzLe.zzhV();
                } catch (IllegalStateException e) {
                    zzhV = null;
                    return zzhV;
                } catch (DeadObjectException e2) {
                    zzhV = null;
                    return zzhV;
                }
            }
            return zzhV;
        }

        zzkc zzhS() {
            return new zza(this.mContext, this.zzLa, this.zzLb);
        }

        public /* synthetic */ Object zzhs() {
            return super.zzhp();
        }
    }

    public zzd(zzkt<AdRequestInfoParcel> com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com.google.android.gms.ads.internal.request.zzc.zza com_google_android_gms_ads_internal_request_zzc_zza) {
        this.zzLa = com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel;
        this.zzLb = com_google_android_gms_ads_internal_request_zzc_zza;
    }

    public void cancel() {
        zzhQ();
    }

    boolean zza(zzk com_google_android_gms_ads_internal_request_zzk, AdRequestInfoParcel adRequestInfoParcel) {
        try {
            com_google_android_gms_ads_internal_request_zzk.zza(adRequestInfoParcel, new zzg(this));
            return true;
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service.", e);
            zzu.zzcn().zzb(e, true);
        } catch (Throwable e2) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", e2);
            zzu.zzcn().zzb(e2, true);
        } catch (Throwable e22) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", e22);
            zzu.zzcn().zzb(e22, true);
        } catch (Throwable e222) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", e222);
            zzu.zzcn().zzb(e222, true);
        }
        this.zzLb.zzb(new AdResponseParcel(0));
        return false;
    }

    public void zzb(AdResponseParcel adResponseParcel) {
        synchronized (this.zzpp) {
            this.zzLb.zzb(adResponseParcel);
            zzhQ();
        }
    }

    public abstract void zzhQ();

    public abstract zzk zzhR();

    public Void zzhp() {
        final zzk zzhR = zzhR();
        if (zzhR == null) {
            this.zzLb.zzb(new AdResponseParcel(0));
            zzhQ();
        } else {
            this.zzLa.zza(new zzkt.zzc<AdRequestInfoParcel>(this) {
                final /* synthetic */ zzd b;

                public void a(AdRequestInfoParcel adRequestInfoParcel) {
                    if (!this.b.zza(zzhR, adRequestInfoParcel)) {
                        this.b.zzhQ();
                    }
                }

                public /* synthetic */ void zzc(Object obj) {
                    a((AdRequestInfoParcel) obj);
                }
            }, new com.google.android.gms.internal.zzkt.zza(this) {
                final /* synthetic */ zzd a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.zzhQ();
                }
            });
        }
        return null;
    }

    public /* synthetic */ Object zzhs() {
        return zzhp();
    }
}
