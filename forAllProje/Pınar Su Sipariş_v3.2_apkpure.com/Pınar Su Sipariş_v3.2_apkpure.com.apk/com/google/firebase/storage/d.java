package com.google.firebase.storage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzajt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageMetadata.Builder;
import org.json.JSONException;

class d implements Runnable {
    private final StorageReference a;
    private final TaskCompletionSource<StorageMetadata> b;
    private final StorageMetadata c;
    private StorageMetadata d = null;
    private zzajk e;

    public d(StorageReference storageReference, TaskCompletionSource<StorageMetadata> taskCompletionSource, StorageMetadata storageMetadata) {
        this.a = storageReference;
        this.b = taskCompletionSource;
        this.c = storageMetadata;
        this.e = new zzajk(this.a.getApp(), this.a.getStorage().getMaxOperationRetryTimeMillis());
    }

    public void run() {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        try {
            zzajt zza = this.a.zzUT().zza(this.a.zzUU(), this.c.zzUS());
            this.e.zzd(zza);
            if (zza.zzVt()) {
                try {
                    this.d = new Builder(zza.zzVw(), this.a).build();
                } catch (JSONException e2) {
                    e = e2;
                    str = "UpdateMetadataTask";
                    str2 = "Unable to parse a valid JSON object from resulting metadata:";
                    valueOf = String.valueOf(zza.zzVq());
                    Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                    this.b.setException(StorageException.fromException(e));
                    return;
                } catch (RemoteException e3) {
                    e = e3;
                    str = "UpdateMetadataTask";
                    str2 = "Unable to parse a valid JSON object from resulting metadata:";
                    valueOf = String.valueOf(zza.zzVq());
                    if (valueOf.length() == 0) {
                    }
                    Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                    this.b.setException(StorageException.fromException(e));
                    return;
                }
            }
            if (this.b != null) {
                zza.zza(this.b, this.d);
            }
        } catch (JSONException e4) {
            e = e4;
            Log.e("UpdateMetadataTask", "Unable to create the request from metadata.", e);
            this.b.setException(StorageException.fromException(e));
        } catch (RemoteException e5) {
            e = e5;
            Log.e("UpdateMetadataTask", "Unable to create the request from metadata.", e);
            this.b.setException(StorageException.fromException(e));
        }
    }
}
