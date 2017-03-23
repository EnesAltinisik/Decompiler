package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzs.zza;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzdt;
import com.google.android.gms.internal.zzdu;
import com.google.android.gms.internal.zzdv;
import com.google.android.gms.internal.zzdw;

public class zzaj extends zza {
    private zzq zzqG;

    private class a extends zzr.zza {
        final /* synthetic */ zzaj a;

        private a(zzaj com_google_android_gms_ads_internal_client_zzaj) {
            this.a = com_google_android_gms_ads_internal_client_zzaj;
        }

        public String getMediationAdapterClassName() throws RemoteException {
            return null;
        }

        public boolean isLoading() throws RemoteException {
            return false;
        }

        public void zzf(AdRequestParcel adRequestParcel) throws RemoteException {
            zzb.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
            com.google.android.gms.ads.internal.util.client.zza.zzRt.post(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.a.zzqG != null) {
                        try {
                            this.a.a.zzqG.onAdFailedToLoad(1);
                        } catch (Throwable e) {
                            zzb.zzd("Could not notify onAdFailedToLoad event.", e);
                        }
                    }
                }
            });
        }
    }

    public void zza(NativeAdOptionsParcel nativeAdOptionsParcel) throws RemoteException {
    }

    public void zza(zzdt com_google_android_gms_internal_zzdt) throws RemoteException {
    }

    public void zza(zzdu com_google_android_gms_internal_zzdu) throws RemoteException {
    }

    public void zza(String str, zzdw com_google_android_gms_internal_zzdw, zzdv com_google_android_gms_internal_zzdv) throws RemoteException {
    }

    public void zzb(zzq com_google_android_gms_ads_internal_client_zzq) throws RemoteException {
        this.zzqG = com_google_android_gms_ads_internal_client_zzq;
    }

    public void zzb(zzy com_google_android_gms_ads_internal_client_zzy) throws RemoteException {
    }

    public zzr zzbM() throws RemoteException {
        return new a();
    }
}
