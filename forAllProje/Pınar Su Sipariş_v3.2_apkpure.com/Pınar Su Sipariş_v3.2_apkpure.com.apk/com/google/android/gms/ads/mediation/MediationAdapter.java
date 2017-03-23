package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface MediationAdapter {

    public static class zza {
        private int zzTf;

        public zza zzZ(int i) {
            this.zzTf = i;
            return this;
        }

        public Bundle zzki() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.zzTf);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
