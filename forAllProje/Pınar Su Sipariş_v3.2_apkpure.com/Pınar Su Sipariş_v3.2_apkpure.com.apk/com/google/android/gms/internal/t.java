package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzq.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzu;

@zzig
class t {
    zzq a;
    zzw b;
    zzhh c;
    zzdg d;
    zzp e;
    zzd f;

    private class a extends zza {
        zzq a;
        final /* synthetic */ t b;

        a(t tVar, zzq com_google_android_gms_ads_internal_client_zzq) {
            this.b = tVar;
            this.a = com_google_android_gms_ads_internal_client_zzq;
        }

        public void onAdClosed() throws RemoteException {
            this.a.onAdClosed();
            zzu.zzcv().zzfi();
        }

        public void onAdFailedToLoad(int i) throws RemoteException {
            this.a.onAdFailedToLoad(i);
        }

        public void onAdLeftApplication() throws RemoteException {
            this.a.onAdLeftApplication();
        }

        public void onAdLoaded() throws RemoteException {
            this.a.onAdLoaded();
        }

        public void onAdOpened() throws RemoteException {
            this.a.onAdOpened();
        }
    }

    t() {
    }

    void a(zzl com_google_android_gms_ads_internal_zzl) {
        if (this.a != null) {
            com_google_android_gms_ads_internal_zzl.zza(new a(this, this.a));
        }
        if (this.b != null) {
            com_google_android_gms_ads_internal_zzl.zza(this.b);
        }
        if (this.c != null) {
            com_google_android_gms_ads_internal_zzl.zza(this.c);
        }
        if (this.d != null) {
            com_google_android_gms_ads_internal_zzl.zza(this.d);
        }
        if (this.e != null) {
            com_google_android_gms_ads_internal_zzl.zza(this.e);
        }
        if (this.f != null) {
            com_google_android_gms_ads_internal_zzl.zza(this.f);
        }
    }
}
