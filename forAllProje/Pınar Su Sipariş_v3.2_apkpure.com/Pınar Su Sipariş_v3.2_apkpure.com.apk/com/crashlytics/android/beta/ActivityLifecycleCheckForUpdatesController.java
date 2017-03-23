package com.crashlytics.android.beta;

import a.a.a.a.a;
import a.a.a.a.a.b;
import android.annotation.TargetApi;
import android.app.Activity;
import java.util.concurrent.ExecutorService;

@TargetApi(14)
class ActivityLifecycleCheckForUpdatesController extends AbstractCheckForUpdatesController {
    private final b callbacks = new b() {
        public void onActivityStarted(Activity activity) {
            if (ActivityLifecycleCheckForUpdatesController.this.signalExternallyReady()) {
                ActivityLifecycleCheckForUpdatesController.this.executorService.submit(new Runnable() {
                    public void run() {
                        ActivityLifecycleCheckForUpdatesController.this.checkForUpdates();
                    }
                });
            }
        }
    };
    private final ExecutorService executorService;

    public ActivityLifecycleCheckForUpdatesController(a aVar, ExecutorService executorService) {
        this.executorService = executorService;
        aVar.a(this.callbacks);
    }

    public boolean isActivityLifecycleTriggered() {
        return true;
    }
}
