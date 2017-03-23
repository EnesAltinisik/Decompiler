package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzoq;
import com.google.android.gms.internal.zzor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class h<TResult> extends Task<TResult> {
    private final Object a = new Object();
    private final g<TResult> b = new g();
    private boolean c;
    private TResult d;
    private Exception e;

    private static class a extends zzoq {
        private final List<WeakReference<f<?>>> a = new ArrayList();

        private a(zzor com_google_android_gms_internal_zzor) {
            super(com_google_android_gms_internal_zzor);
            this.zzaop.zza("TaskOnStopCallback", (zzoq) this);
        }

        public static a a(Activity activity) {
            zzor zzs = zzoq.zzs(activity);
            a aVar = (a) zzs.zza("TaskOnStopCallback", a.class);
            return aVar == null ? new a(zzs) : aVar;
        }

        public <T> void a(f<T> fVar) {
            synchronized (this.a) {
                this.a.add(new WeakReference(fVar));
            }
        }

        public void onStop() {
            synchronized (this.a) {
                for (WeakReference weakReference : this.a) {
                    f fVar = (f) weakReference.get();
                    if (fVar != null) {
                        fVar.a();
                    }
                }
                this.a.clear();
            }
        }
    }

    h() {
    }

    private void a() {
        zzaa.zza(this.c, (Object) "Task is not yet complete");
    }

    private void b() {
        zzaa.zza(!this.c, (Object) "Task is already complete");
    }

    private void c() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((Task) this);
                return;
            }
        }
    }

    public void a(Exception exception) {
        zzaa.zzb((Object) exception, (Object) "Exception must not be null");
        synchronized (this.a) {
            b();
            this.c = true;
            this.e = exception;
        }
        this.b.a((Task) this);
    }

    public void a(TResult tResult) {
        synchronized (this.a) {
            b();
            this.c = true;
            this.d = tResult;
        }
        this.b.a((Task) this);
    }

    public Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        f cVar = new c(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.b.a(cVar);
        a.a(activity).a(cVar);
        c();
        return this;
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        return addOnCompleteListener(TaskExecutors.MAIN_THREAD, (OnCompleteListener) onCompleteListener);
    }

    public Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.b.a(new c(executor, onCompleteListener));
        c();
        return this;
    }

    public Task<TResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        f dVar = new d(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.b.a(dVar);
        a.a(activity).a(dVar);
        c();
        return this;
    }

    public Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        return addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
    }

    public Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.b.a(new d(executor, onFailureListener));
        c();
        return this;
    }

    public Task<TResult> addOnSuccessListener(Activity activity, OnSuccessListener<? super TResult> onSuccessListener) {
        f eVar = new e(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.b.a(eVar);
        a.a(activity).a(eVar);
        c();
        return this;
    }

    public Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> onSuccessListener) {
        return addOnSuccessListener(TaskExecutors.MAIN_THREAD, (OnSuccessListener) onSuccessListener);
    }

    public Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.b.a(new e(executor, onSuccessListener));
        c();
        return this;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        Task hVar = new h();
        this.b.a(new a(executor, continuation, hVar));
        c();
        return hVar;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        Task hVar = new h();
        this.b.a(new b(executor, continuation, hVar));
        c();
        return hVar;
    }

    public Exception getException() {
        Exception exception;
        synchronized (this.a) {
            exception = this.e;
        }
        return exception;
    }

    public TResult getResult() {
        TResult tResult;
        synchronized (this.a) {
            a();
            if (this.e != null) {
                throw new RuntimeExecutionException(this.e);
            }
            tResult = this.d;
        }
        return tResult;
    }

    public <X extends Throwable> TResult getResult(Class<X> cls) throws Throwable {
        TResult tResult;
        synchronized (this.a) {
            a();
            if (cls.isInstance(this.e)) {
                throw ((Throwable) cls.cast(this.e));
            } else if (this.e != null) {
                throw new RuntimeExecutionException(this.e);
            } else {
                tResult = this.d;
            }
        }
        return tResult;
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public boolean isSuccessful() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.e == null;
        }
        return z;
    }
}
