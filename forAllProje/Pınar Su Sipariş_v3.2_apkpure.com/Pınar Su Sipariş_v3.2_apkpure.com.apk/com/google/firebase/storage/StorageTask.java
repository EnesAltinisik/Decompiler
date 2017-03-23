package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.firebase.storage.zze.zza;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

public abstract class StorageTask<TResult extends ProvideError> extends ControllableTask<TResult> {
    private static final HashMap<Integer, HashSet<Integer>> zzbUE = new HashMap();
    private static final HashMap<Integer, HashSet<Integer>> zzbUF = new HashMap();
    protected final Object mSyncObject = new Object();
    private int zzGN = 1;
    private final zze<OnSuccessListener<? super TResult>, TResult> zzbUG = new zze(this, 128, new zza<OnSuccessListener<? super TResult>, TResult>(this) {
        final /* synthetic */ StorageTask a;

        {
            this.a = r1;
        }

        public void a(OnSuccessListener<? super TResult> onSuccessListener, TResult tResult) {
            c.a().b(this.a);
            onSuccessListener.onSuccess(tResult);
        }

        public /* synthetic */ void zzl(Object obj, Object obj2) {
            a((OnSuccessListener) obj, (ProvideError) obj2);
        }
    });
    private final zze<OnFailureListener, TResult> zzbUH = new zze(this, 320, new zza<OnFailureListener, TResult>(this) {
        final /* synthetic */ StorageTask a;

        {
            this.a = r1;
        }

        public void a(OnFailureListener onFailureListener, TResult tResult) {
            c.a().b(this.a);
            onFailureListener.onFailure(tResult.getError());
        }

        public /* synthetic */ void zzl(Object obj, Object obj2) {
            a((OnFailureListener) obj, (ProvideError) obj2);
        }
    });
    private final zze<OnProgressListener<? super TResult>, TResult> zzbUI = new zze(this, -465, new zza<OnProgressListener<? super TResult>, TResult>(this) {
        final /* synthetic */ StorageTask a;

        {
            this.a = r1;
        }

        public void a(OnProgressListener<? super TResult> onProgressListener, TResult tResult) {
            onProgressListener.onProgress(tResult);
        }

        public /* synthetic */ void zzl(Object obj, Object obj2) {
            a((OnProgressListener) obj, (ProvideError) obj2);
        }
    });
    private final zze<OnPausedListener<? super TResult>, TResult> zzbUJ = new zze(this, 16, new zza<OnPausedListener<? super TResult>, TResult>(this) {
        final /* synthetic */ StorageTask a;

        {
            this.a = r1;
        }

        public void a(OnPausedListener<? super TResult> onPausedListener, TResult tResult) {
            onPausedListener.onPaused(tResult);
        }

        public /* synthetic */ void zzl(Object obj, Object obj2) {
            a((OnPausedListener) obj, (ProvideError) obj2);
        }
    });
    private TResult zzbUK;

    protected interface ProvideError {
        Exception getError();
    }

    class a implements ProvideError {
        final /* synthetic */ StorageTask zzbUL;
        private final Exception zzbUM;

        public a(StorageTask storageTask, Exception exception) {
            this.zzbUL = storageTask;
            this.zzbUM = exception;
        }

        public Exception getError() {
            return this.zzbUM;
        }

        public StorageReference getStorage() {
            return getTask().getStorage();
        }

        public StorageTask<TResult> getTask() {
            return this.zzbUL;
        }
    }

    static {
        zzbUE.put(Integer.valueOf(1), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(16), Integer.valueOf(256)})));
        zzbUE.put(Integer.valueOf(2), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(8), Integer.valueOf(32)})));
        zzbUE.put(Integer.valueOf(4), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(8), Integer.valueOf(32)})));
        zzbUE.put(Integer.valueOf(16), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(2), Integer.valueOf(256)})));
        zzbUE.put(Integer.valueOf(64), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(2), Integer.valueOf(256)})));
        zzbUF.put(Integer.valueOf(1), new HashSet(Collections.singletonList(Integer.valueOf(2))));
        zzbUF.put(Integer.valueOf(2), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(4), Integer.valueOf(64), Integer.valueOf(128)})));
        zzbUF.put(Integer.valueOf(4), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(4), Integer.valueOf(64), Integer.valueOf(128)})));
        zzbUF.put(Integer.valueOf(8), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(16), Integer.valueOf(64), Integer.valueOf(128)})));
        zzbUF.put(Integer.valueOf(32), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(256), Integer.valueOf(64), Integer.valueOf(128)})));
    }

    protected StorageTask() {
    }

    private TResult zzUZ() {
        if (this.zzbUK != null) {
            return this.zzbUK;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.zzbUK == null) {
            this.zzbUK = zzUY();
        }
        return this.zzbUK;
    }

    private String zznN(int i) {
        switch (i) {
            case 1:
                return "INTERNAL_STATE_NOT_STARTED";
            case 2:
                return "INTERNAL_STATE_QUEUED";
            case 4:
                return "INTERNAL_STATE_IN_PROGRESS";
            case 8:
                return "INTERNAL_STATE_PAUSING";
            case 16:
                return "INTERNAL_STATE_PAUSED";
            case 32:
                return "INTERNAL_STATE_CANCELING";
            case 64:
                return "INTERNAL_STATE_FAILURE";
            case 128:
                return "INTERNAL_STATE_SUCCESS";
            case 256:
                return "INTERNAL_STATE_CANCELED";
            default:
                return "Unknown Internal State!";
        }
    }

    public StorageTask<TResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        zzaa.zzz(onFailureListener);
        zzaa.zzz(activity);
        this.zzbUH.a(activity, null, onFailureListener);
        return this;
    }

    public StorageTask<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        zzaa.zzz(onFailureListener);
        this.zzbUH.a(null, null, onFailureListener);
        return this;
    }

    public StorageTask<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        zzaa.zzz(onFailureListener);
        zzaa.zzz(executor);
        this.zzbUH.a(null, executor, onFailureListener);
        return this;
    }

    public StorageTask<TResult> addOnPausedListener(Activity activity, OnPausedListener<? super TResult> onPausedListener) {
        zzaa.zzz(onPausedListener);
        zzaa.zzz(activity);
        this.zzbUJ.a(activity, null, onPausedListener);
        return this;
    }

    public StorageTask<TResult> addOnPausedListener(OnPausedListener<? super TResult> onPausedListener) {
        zzaa.zzz(onPausedListener);
        this.zzbUJ.a(null, null, onPausedListener);
        return this;
    }

    public StorageTask<TResult> addOnPausedListener(Executor executor, OnPausedListener<? super TResult> onPausedListener) {
        zzaa.zzz(onPausedListener);
        zzaa.zzz(executor);
        this.zzbUJ.a(null, executor, onPausedListener);
        return this;
    }

    public StorageTask<TResult> addOnProgressListener(Activity activity, OnProgressListener<? super TResult> onProgressListener) {
        zzaa.zzz(onProgressListener);
        zzaa.zzz(activity);
        this.zzbUI.a(activity, null, onProgressListener);
        return this;
    }

    public StorageTask<TResult> addOnProgressListener(OnProgressListener<? super TResult> onProgressListener) {
        zzaa.zzz(onProgressListener);
        this.zzbUI.a(null, null, onProgressListener);
        return this;
    }

    public StorageTask<TResult> addOnProgressListener(Executor executor, OnProgressListener<? super TResult> onProgressListener) {
        zzaa.zzz(onProgressListener);
        zzaa.zzz(executor);
        this.zzbUI.a(null, executor, onProgressListener);
        return this;
    }

    public StorageTask<TResult> addOnSuccessListener(Activity activity, OnSuccessListener<? super TResult> onSuccessListener) {
        zzaa.zzz(activity);
        zzaa.zzz(onSuccessListener);
        this.zzbUG.a(activity, null, onSuccessListener);
        return this;
    }

    public StorageTask<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> onSuccessListener) {
        zzaa.zzz(onSuccessListener);
        this.zzbUG.a(null, null, onSuccessListener);
        return this;
    }

    public StorageTask<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        zzaa.zzz(executor);
        zzaa.zzz(onSuccessListener);
        this.zzbUG.a(null, executor, onSuccessListener);
        return this;
    }

    public boolean cancel() {
        return zzi(256, true) || zzi(32, true);
    }

    public Exception getException() {
        return zzUZ() == null ? null : zzUZ().getError();
    }

    public TResult getResult() {
        if (zzUZ() == null) {
            throw new IllegalStateException();
        }
        Throwable error = zzUZ().getError();
        if (error == null) {
            return zzUZ();
        }
        throw new RuntimeExecutionException(error);
    }

    public <X extends Throwable> TResult getResult(Class<X> cls) throws Throwable {
        if (zzUZ() == null) {
            throw new IllegalStateException();
        } else if (cls.isInstance(zzUZ().getError())) {
            throw ((Throwable) cls.cast(zzUZ().getError()));
        } else {
            Throwable error = zzUZ().getError();
            if (error == null) {
                return zzUZ();
            }
            throw new RuntimeExecutionException(error);
        }
    }

    public TResult getSnapshot() {
        return zzUY();
    }

    abstract StorageReference getStorage();

    public boolean isCanceled() {
        return zzUW() == 256;
    }

    public boolean isComplete() {
        return ((zzUW() & 128) == 0 && (zzUW() & 320) == 0) ? false : true;
    }

    public boolean isInProgress() {
        return (zzUW() & -465) != 0;
    }

    public boolean isPaused() {
        return (zzUW() & 16) != 0;
    }

    public boolean isSuccessful() {
        return (zzUW() & 128) != 0;
    }

    protected void onCanceled() {
    }

    protected void onFailure() {
    }

    protected void onPaused() {
    }

    protected void onProgress() {
    }

    protected void onQueued() {
    }

    protected void onSuccess() {
    }

    public boolean pause() {
        return zzi(16, true) || zzi(8, true);
    }

    public StorageTask<TResult> removeOnFailureListener(OnFailureListener onFailureListener) {
        zzaa.zzz(onFailureListener);
        this.zzbUH.a((Object) onFailureListener);
        return this;
    }

    public StorageTask<TResult> removeOnPausedListener(OnPausedListener<? super TResult> onPausedListener) {
        zzaa.zzz(onPausedListener);
        this.zzbUJ.a((Object) onPausedListener);
        return this;
    }

    public StorageTask<TResult> removeOnProgressListener(OnProgressListener<? super TResult> onProgressListener) {
        zzaa.zzz(onProgressListener);
        this.zzbUI.a((Object) onProgressListener);
        return this;
    }

    public StorageTask<TResult> removeOnSuccessListener(OnSuccessListener<? super TResult> onSuccessListener) {
        zzaa.zzz(onSuccessListener);
        this.zzbUG.a((Object) onSuccessListener);
        return this;
    }

    void resetState() {
    }

    public boolean resume() {
        if (!zzi(2, true)) {
            return false;
        }
        resetState();
        schedule();
        return true;
    }

    abstract void run();

    abstract void schedule();

    abstract TResult zzUQ();

    boolean zzUV() {
        if (!zzi(2, false)) {
            return false;
        }
        schedule();
        return true;
    }

    int zzUW() {
        return this.zzGN;
    }

    Object zzUX() {
        return this.mSyncObject;
    }

    TResult zzUY() {
        TResult zzUQ;
        synchronized (this.mSyncObject) {
            zzUQ = zzUQ();
        }
        return zzUQ;
    }

    Runnable zzVa() {
        return new Runnable(this) {
            final /* synthetic */ StorageTask a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.run();
            }
        };
    }

    boolean zzi(int i, boolean z) {
        boolean z2;
        if (Log.isLoggable("StorageTask", 3)) {
            String valueOf = String.valueOf(zznN(i));
            String valueOf2 = String.valueOf(zznN(this.zzGN));
            Log.d("StorageTask", new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(valueOf2).length()).append("changing internal state to: ").append(valueOf).append(" isUser: ").append(z).append(" from state:").append(valueOf2).toString());
        }
        synchronized (this.mSyncObject) {
            HashSet hashSet = (HashSet) (z ? zzbUE : zzbUF).get(Integer.valueOf(zzUW()));
            if (hashSet == null || !hashSet.contains(Integer.valueOf(i))) {
                valueOf2 = String.valueOf(zznN(i));
                String valueOf3 = String.valueOf(zznN(this.zzGN));
                Log.w("StorageTask", new StringBuilder((String.valueOf(valueOf2).length() + 62) + String.valueOf(valueOf3).length()).append("unable to change internal state to: ").append(valueOf2).append(" isUser: ").append(z).append(" from state:").append(valueOf3).toString());
                z2 = false;
            } else {
                this.zzGN = i;
                switch (this.zzGN) {
                    case 2:
                        c.a().a(this);
                        onQueued();
                        break;
                    case 4:
                        onProgress();
                        break;
                    case 16:
                        onPaused();
                        break;
                    case 64:
                        onFailure();
                        break;
                    case 128:
                        onSuccess();
                        break;
                    case 256:
                        onCanceled();
                        break;
                }
                this.zzbUG.a();
                this.zzbUH.a();
                this.zzbUJ.a();
                this.zzbUI.a();
                z2 = true;
            }
        }
        return z2;
    }
}
