package com.pinarsu.siparis;

import a.a.a.a.c;
import a.a.a.a.c.a;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.b.b;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adjust.sdk.OnDeeplinkResponseListener;
import com.adjust.sdk.OnEventTrackingFailedListener;
import com.adjust.sdk.OnEventTrackingSucceededListener;
import com.adjust.sdk.OnSessionTrackingFailedListener;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.crashlytics.android.Crashlytics;
import com.pinarsu.siparis.adapter.TutorialViewPagerAdapter;

public class MyApplication extends b {
    public static int SCREEN_HEIGHT;
    public static int SCREEN_WIDTH;
    private static MyApplication instance;
    public static boolean isBackground = false;
    private AppCompatActivity activity;
    private Preferences preferences;

    private static final class AdjustLifecycleCallbacks implements ActivityLifecycleCallbacks {
        private AdjustLifecycleCallbacks() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            Adjust.onResume();
        }

        public void onActivityPaused(Activity activity) {
            Adjust.onPause();
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }
    }

    public static MyApplication getInstance() {
        return instance;
    }

    public void onCreate() {
        super.onCreate();
        instance = this;
        c.a(new a(this).a(new Crashlytics()).a(true).a());
        String str = "u0bnc59dltkw";
        AdjustConfig adjustConfig = new AdjustConfig(this, "u0bnc59dltkw", AdjustConfig.ENVIRONMENT_PRODUCTION);
        adjustConfig.setLogLevel(LogLevel.VERBOSE);
        adjustConfig.setOnAttributionChangedListener(new OnAttributionChangedListener() {
            public void onAttributionChanged(AdjustAttribution adjustAttribution) {
                Log.d("example", "attribution: " + adjustAttribution.toString());
            }
        });
        adjustConfig.setOnEventTrackingSucceededListener(new OnEventTrackingSucceededListener() {
            public void onFinishedEventTrackingSucceeded(AdjustEventSuccess adjustEventSuccess) {
                Log.d("example", "success event tracking: " + adjustEventSuccess.toString());
            }
        });
        adjustConfig.setOnEventTrackingFailedListener(new OnEventTrackingFailedListener() {
            public void onFinishedEventTrackingFailed(AdjustEventFailure adjustEventFailure) {
                Log.d("example", "failed event tracking: " + adjustEventFailure.toString());
            }
        });
        adjustConfig.setOnSessionTrackingSucceededListener(new OnSessionTrackingSucceededListener() {
            public void onFinishedSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
                Log.d("example", "success session tracking: " + adjustSessionSuccess.toString());
            }
        });
        adjustConfig.setOnSessionTrackingFailedListener(new OnSessionTrackingFailedListener() {
            public void onFinishedSessionTrackingFailed(AdjustSessionFailure adjustSessionFailure) {
                Log.d("example", "failed session tracking: " + adjustSessionFailure.toString());
            }
        });
        adjustConfig.setOnDeeplinkResponseListener(new OnDeeplinkResponseListener() {
            public boolean launchReceivedDeeplink(Uri uri) {
                Log.d("example", "deeplink to open: " + uri);
                return true;
            }
        });
        adjustConfig.setSendInBackground(true);
        Adjust.onCreate(adjustConfig);
        registerActivityLifecycleCallbacks(new AdjustLifecycleCallbacks());
        Adjust.setEnabled(true);
        this.preferences = new Preferences(this);
        this.preferences.read();
        getDisplayWidthHeight();
        TutorialViewPagerAdapter.isFromMain = false;
    }

    public AppCompatActivity getActivity() {
        return this.activity;
    }

    public void setActivity(AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
    }

    public Preferences getPreferences() {
        return this.preferences;
    }

    public String getServiceNamespace() {
        return getString(R.string.service_namespace);
    }

    public String getServiceTestURLHost() {
        return getString(R.string.service_test_url_host);
    }

    public String getServiceTestURLPort() {
        return getString(R.string.service_test_url_port);
    }

    public String getServiceTestURLFile() {
        return getString(R.string.service_test_url_file);
    }

    public String getServiceLiveURLHost() {
        return getString(R.string.service_live_url_host);
    }

    public String getServiceLiveURLPort() {
        return getString(R.string.service_live_url_port);
    }

    public String getServiceLiveURLFile() {
        return getString(R.string.service_live_url_file);
    }

    public String getServiceTestUserName() {
        return getString(R.string.service_test_username);
    }

    public String getServiceTestUserPass() {
        return getString(R.string.service_test_userpass);
    }

    public String getServiceLiveUserName() {
        return getString(R.string.service_live_username);
    }

    public String getServiceLiveUserPass() {
        return getString(R.string.service_live_userpass);
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public void getDisplayWidthHeight() {
        Display defaultDisplay = ((WindowManager) getApplicationContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        SCREEN_WIDTH = point.x;
        SCREEN_HEIGHT = point.y;
    }

    public boolean isConnected() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (!activeNetworkInfo.isConnected()) {
            return false;
        }
        if (activeNetworkInfo.isAvailable()) {
            return true;
        }
        return false;
    }

    public String getDeviceId() {
        return Secure.getString(getContentResolver(), "android_id");
    }
}
