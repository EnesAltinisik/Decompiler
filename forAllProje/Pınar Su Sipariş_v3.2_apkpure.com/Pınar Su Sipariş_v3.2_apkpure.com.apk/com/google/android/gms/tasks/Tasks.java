package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.zzaa;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ h a;
        final /* synthetic */ Callable b;

        AnonymousClass1(h hVar, Callable callable) {
            this.a = hVar;
            this.b = callable;
        }

        public void run() {
            try {
                this.a.a(this.b.call());
            } catch (Exception e) {
                this.a.a(e);
            }
        }
    }

    interface b extends OnFailureListener, OnSuccessListener<Object> {
    }

    private static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        public void a() throws InterruptedException {
            this.a.await();
        }

        public boolean a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.a.await(j, timeUnit);
        }

        public void onFailure(Exception exception) {
            this.a.countDown();
        }

        public void onSuccess(Object obj) {
            this.a.countDown();
        }
    }

    private static final class c implements b {
        private final Object a = new Object();
        private final int b;
        private final h<Void> c;
        private int d;
        private int e;
        private Exception f;

        public c(int i, h<Void> hVar) {
            this.b = i;
            this.c = hVar;
        }

        private void a() {
            if (this.d + this.e != this.b) {
                return;
            }
            if (this.f == null) {
                this.c.a(null);
                return;
            }
            h hVar = this.c;
            int i = this.e;
            hVar.a(new ExecutionException(i + " out of " + this.b + " underlying tasks failed", this.f));
        }

        public void onFailure(Exception exception) {
            synchronized (this.a) {
                this.e++;
                this.f = exception;
                a();
            }
        }

        public void onSuccess(Object obj) {
            synchronized (this.a) {
                this.d++;
                a();
            }
        }
    }

    private Tasks() {
    }

    public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
        zzaa.zztO();
        zzaa.zzb((Object) task, (Object) "Task must not be null");
        if (task.isComplete()) {
            return zzb(task);
        }
        Object aVar = new a();
        zza(task, aVar);
        aVar.a();
        return zzb(task);
    }

    public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        zzaa.zztO();
        zzaa.zzb((Object) task, (Object) "Task must not be null");
        zzaa.zzb((Object) timeUnit, (Object) "TimeUnit must not be null");
        if (task.isComplete()) {
            return zzb(task);
        }
        Object aVar = new a();
        zza(task, aVar);
        if (aVar.a(j, timeUnit)) {
            return zzb(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
        zzaa.zzb((Object) executor, (Object) "Executor must not be null");
        zzaa.zzb((Object) callable, (Object) "Callback must not be null");
        Task hVar = new h();
        executor.execute(new AnonymousClass1(hVar, callable));
        return hVar;
    }

    public static <TResult> Task<TResult> forException(Exception exception) {
        Task hVar = new h();
        hVar.a(exception);
        return hVar;
    }

    public static <TResult> Task<TResult> forResult(TResult tResult) {
        Task hVar = new h();
        hVar.a((Object) tResult);
        return hVar;
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.isEmpty()) {
            return forResult(null);
        }
        for (Task task : collection) {
            if (task == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        Task hVar = new h();
        b cVar = new c(collection.size(), hVar);
        for (Task task2 : collection) {
            zza(task2, cVar);
        }
        return hVar;
    }

    public static Task<Void> whenAll(Task<?>... taskArr) {
        return taskArr.length == 0 ? forResult(null) : whenAll(Arrays.asList(taskArr));
    }

    private static void zza(Task<?> task, b bVar) {
        task.addOnSuccessListener(TaskExecutors.zzbwy, (OnSuccessListener) bVar);
        task.addOnFailureListener(TaskExecutors.zzbwy, (OnFailureListener) bVar);
    }

    private static <TResult> TResult zzb(Task<TResult> task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }
}
