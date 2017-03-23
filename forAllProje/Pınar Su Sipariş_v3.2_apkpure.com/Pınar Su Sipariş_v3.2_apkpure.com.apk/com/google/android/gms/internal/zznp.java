package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseException;

public abstract class zznp {
    public final int zzagd;
    public final int zzalC;

    public static final class zza extends zznp {
        public final com.google.android.gms.internal.zznt.zza<? extends Result, com.google.android.gms.common.api.Api.zzb> zzalD;

        public zza(int i, int i2, com.google.android.gms.internal.zznt.zza<? extends Result, com.google.android.gms.common.api.Api.zzb> com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__com_google_android_gms_common_api_Api_zzb) {
            super(i, i2);
            this.zzalD = com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__com_google_android_gms_common_api_Api_zzb;
        }

        public boolean cancel() {
            return this.zzalD.zzrH();
        }

        public void zza(SparseArray<zzpf> sparseArray) {
            zzpf com_google_android_gms_internal_zzpf = (zzpf) sparseArray.get(this.zzalC);
            if (com_google_android_gms_internal_zzpf != null) {
                com_google_android_gms_internal_zzpf.zzg(this.zzalD);
            }
        }

        public void zzb(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws DeadObjectException {
            this.zzalD.zzb(com_google_android_gms_common_api_Api_zzb);
        }

        public void zzv(Status status) {
            this.zzalD.zzx(status);
        }
    }

    public static final class zzb<TResult> extends zznp {
        private static final Status zzalG = new Status(8, "Connection to Google Play services was lost while executing the API call.");
        private final zzpd<com.google.android.gms.common.api.Api.zzb, TResult> zzalE;
        private final TaskCompletionSource<TResult> zzalF;

        public zzb(int i, int i2, zzpd<com.google.android.gms.common.api.Api.zzb, TResult> com_google_android_gms_internal_zzpd_com_google_android_gms_common_api_Api_zzb__TResult, TaskCompletionSource<TResult> taskCompletionSource) {
            super(i, i2);
            this.zzalF = taskCompletionSource;
            this.zzalE = com_google_android_gms_internal_zzpd_com_google_android_gms_common_api_Api_zzb__TResult;
        }

        public void zzb(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws DeadObjectException {
            try {
                this.zzalE.zza(com_google_android_gms_common_api_Api_zzb, this.zzalF);
            } catch (DeadObjectException e) {
                zzv(zzalG);
                throw e;
            } catch (RemoteException e2) {
                zzv(zzalG);
            }
        }

        public void zzv(Status status) {
            if (status.getStatusCode() == 8) {
                this.zzalF.setException(new FirebaseException(status.getStatusMessage()));
            } else {
                this.zzalF.setException(new FirebaseApiNotAvailableException(status.getStatusMessage()));
            }
        }
    }

    public zznp(int i, int i2) {
        this.zzalC = i;
        this.zzagd = i2;
    }

    public boolean cancel() {
        return true;
    }

    public void zza(SparseArray<zzpf> sparseArray) {
    }

    public abstract void zzb(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws DeadObjectException;

    public abstract void zzv(Status status);
}
