package com.google.firebase.storage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzajt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageMetadata.Builder;
import org.json.JSONException;

class b implements Runnable {
    private StorageReference a;
    private TaskCompletionSource<StorageMetadata> b;
    private StorageMetadata c;
    private zzajk d = new zzajk(this.a.getApp(), this.a.getStorage().getMaxOperationRetryTimeMillis());

    public b(StorageReference storageReference, TaskCompletionSource<StorageMetadata> taskCompletionSource) {
        zzaa.zzz(storageReference);
        zzaa.zzz(taskCompletionSource);
        this.a = storageReference;
        this.b = taskCompletionSource;
    }

    public void run() {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        try {
            zzajt zzz = this.a.zzUT().zzz(this.a.zzUU());
            this.d.zzd(zzz);
            if (zzz.zzVt()) {
                try {
                    this.c = new Builder(zzz.zzVw(), this.a).build();
                } catch (JSONException e2) {
                    e = e2;
                    str = "GetMetadataTask";
                    str2 = "Unable to parse resulting metadata. ";
                    valueOf = String.valueOf(zzz.zzVq());
                    Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                    this.b.setException(StorageException.fromException(e));
                    return;
                } catch (RemoteException e3) {
                    e = e3;
                    str = "GetMetadataTask";
                    str2 = "Unable to parse resulting metadata. ";
                    valueOf = String.valueOf(zzz.zzVq());
                    if (valueOf.length() == 0) {
                    }
                    Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                    this.b.setException(StorageException.fromException(e));
                    return;
                }
            }
            if (this.b != null) {
                zzz.zza(this.b, this.c);
            }
        } catch (Throwable e4) {
            Log.e("GetMetadataTask", "Unable to create firebase storage network request.", e4);
            this.b.setException(StorageException.fromException(e4));
        }
    }
}
