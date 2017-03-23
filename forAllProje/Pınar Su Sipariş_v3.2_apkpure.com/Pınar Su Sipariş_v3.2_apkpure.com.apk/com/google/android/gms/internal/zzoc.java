package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.internal.zznt.zza;

public class zzoc implements zzog {
    private final zzoh zzamB;
    private boolean zzamC = false;

    public zzoc(zzoh com_google_android_gms_internal_zzoh) {
        this.zzamB = com_google_android_gms_internal_zzoh;
    }

    private <A extends zzb> void zzf(zza<? extends Result, A> com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A) throws DeadObjectException {
        this.zzamB.zzamm.zzant.zzg(com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A);
        zzb zzb = this.zzamB.zzamm.zzb(com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A.zzre());
        if (zzb.isConnected() || !this.zzamB.zzanC.containsKey(com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A.zzre())) {
            if (zzb instanceof zzag) {
                zzb = ((zzag) zzb).zztX();
            }
            com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A.zzb(zzb);
            return;
        }
        com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A.zzx(new Status(17));
    }

    public void begin() {
    }

    public void connect() {
        if (this.zzamC) {
            this.zzamC = false;
            this.zzamB.zza(new a(this, this) {
                final /* synthetic */ zzoc a;

                public void a() {
                    this.a.zzamB.zzanG.zzk(null);
                }
            });
        }
    }

    public boolean disconnect() {
        if (this.zzamC) {
            return false;
        }
        if (this.zzamB.zzamm.zzsk()) {
            this.zzamC = true;
            for (zzpe zzsJ : this.zzamB.zzamm.zzans) {
                zzsJ.zzsJ();
            }
            return false;
        }
        this.zzamB.zzi(null);
        return true;
    }

    public void onConnected(Bundle bundle) {
    }

    public void onConnectionSuspended(int i) {
        this.zzamB.zzi(null);
        this.zzamB.zzanG.zzc(i, this.zzamC);
    }

    public void zza(ConnectionResult connectionResult, Api<?> api, int i) {
    }

    public <A extends zzb, R extends Result, T extends zza<R, A>> T zzc(T t) {
        return zzd(t);
    }

    public <A extends zzb, T extends zza<? extends Result, A>> T zzd(T t) {
        try {
            zzf(t);
        } catch (DeadObjectException e) {
            this.zzamB.zza(new a(this, this) {
                final /* synthetic */ zzoc a;

                public void a() {
                    this.a.onConnectionSuspended(1);
                }
            });
        }
        return t;
    }

    void zzrW() {
        if (this.zzamC) {
            this.zzamC = false;
            this.zzamB.zzamm.zzant.release();
            disconnect();
        }
    }
}
