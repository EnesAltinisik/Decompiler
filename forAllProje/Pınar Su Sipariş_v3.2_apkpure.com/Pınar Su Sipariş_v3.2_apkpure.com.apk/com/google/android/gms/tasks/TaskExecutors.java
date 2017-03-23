package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    public static final Executor MAIN_THREAD = new a();
    static final Executor zzbwy = new Executor() {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    };

    private static final class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    private TaskExecutors() {
    }
}
