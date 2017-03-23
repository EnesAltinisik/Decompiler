package a.a.a.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ActivityLifecycleManager */
public class a {
    private final Application a;
    private a b;

    /* compiled from: ActivityLifecycleManager */
    private static class a {
        private final Set<ActivityLifecycleCallbacks> a = new HashSet();
        private final Application b;

        a(Application application) {
            this.b = application;
        }

        @TargetApi(14)
        private void a() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.a) {
                this.b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        @TargetApi(14)
        private boolean a(final b bVar) {
            if (this.b == null) {
                return false;
            }
            ActivityLifecycleCallbacks anonymousClass1 = new ActivityLifecycleCallbacks(this) {
                final /* synthetic */ a b;

                public void onActivityCreated(Activity activity, Bundle bundle) {
                    bVar.onActivityCreated(activity, bundle);
                }

                public void onActivityStarted(Activity activity) {
                    bVar.onActivityStarted(activity);
                }

                public void onActivityResumed(Activity activity) {
                    bVar.onActivityResumed(activity);
                }

                public void onActivityPaused(Activity activity) {
                    bVar.onActivityPaused(activity);
                }

                public void onActivityStopped(Activity activity) {
                    bVar.onActivityStopped(activity);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    bVar.onActivitySaveInstanceState(activity, bundle);
                }

                public void onActivityDestroyed(Activity activity) {
                    bVar.onActivityDestroyed(activity);
                }
            };
            this.b.registerActivityLifecycleCallbacks(anonymousClass1);
            this.a.add(anonymousClass1);
            return true;
        }
    }

    /* compiled from: ActivityLifecycleManager */
    public static abstract class b {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }
    }

    public a(Context context) {
        this.a = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.b = new a(this.a);
        }
    }

    public boolean a(b bVar) {
        return this.b != null && this.b.a(bVar);
    }

    public void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
}
