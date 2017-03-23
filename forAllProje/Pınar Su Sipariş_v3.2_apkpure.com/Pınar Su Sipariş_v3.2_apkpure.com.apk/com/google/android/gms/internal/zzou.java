package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.zzaa;

public final class zzou<L> {
    private volatile L mListener;
    private final a zzaov;

    public interface zzb<L> {
        void zzrV();

        void zzt(L l);
    }

    private final class a extends Handler {
        final /* synthetic */ zzou a;

        public a(zzou com_google_android_gms_internal_zzou, Looper looper) {
            this.a = com_google_android_gms_internal_zzou;
            super(looper);
        }

        public void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            zzaa.zzaj(z);
            this.a.zzb((zzb) message.obj);
        }
    }

    zzou(Looper looper, L l) {
        this.zzaov = new a(this, looper);
        this.mListener = zzaa.zzb((Object) l, (Object) "Listener must not be null");
    }

    public void clear() {
        this.mListener = null;
    }

    public void zza(zzb<? super L> com_google_android_gms_internal_zzou_zzb__super_L) {
        zzaa.zzb((Object) com_google_android_gms_internal_zzou_zzb__super_L, (Object) "Notifier must not be null");
        this.zzaov.sendMessage(this.zzaov.obtainMessage(1, com_google_android_gms_internal_zzou_zzb__super_L));
    }

    void zzb(zzb<? super L> com_google_android_gms_internal_zzou_zzb__super_L) {
        Object obj = this.mListener;
        if (obj == null) {
            com_google_android_gms_internal_zzou_zzb__super_L.zzrV();
            return;
        }
        try {
            com_google_android_gms_internal_zzou_zzb__super_L.zzt(obj);
        } catch (RuntimeException e) {
            com_google_android_gms_internal_zzou_zzb__super_L.zzrV();
            throw e;
        }
    }
}
