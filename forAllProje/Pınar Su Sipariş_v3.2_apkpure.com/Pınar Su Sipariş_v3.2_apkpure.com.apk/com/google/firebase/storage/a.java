package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzajt;
import com.google.android.gms.tasks.TaskCompletionSource;

class a implements Runnable {
    private StorageReference a;
    private TaskCompletionSource<Void> b;
    private zzajk c = new zzajk(this.a.getStorage().getApp(), this.a.getStorage().getMaxOperationRetryTimeMillis());

    public a(StorageReference storageReference, TaskCompletionSource<Void> taskCompletionSource) {
        zzaa.zzz(storageReference);
        zzaa.zzz(taskCompletionSource);
        this.a = storageReference;
        this.b = taskCompletionSource;
    }

    public void run() {
        try {
            zzajt zzy = this.a.zzUT().zzy(this.a.zzUU());
            this.c.zzd(zzy);
            zzy.zza(this.b, null);
        } catch (Throwable e) {
            Log.e("DeleteStorageTask", "Unable to create Firebase Storage network request.", e);
            this.b.setException(StorageException.fromException(e));
        }
    }
}
