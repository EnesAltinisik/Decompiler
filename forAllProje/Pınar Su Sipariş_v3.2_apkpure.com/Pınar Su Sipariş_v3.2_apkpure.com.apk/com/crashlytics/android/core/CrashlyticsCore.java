package com.crashlytics.android.core;

import a.a.a.a.a.b.g;
import a.a.a.a.a.b.j;
import a.a.a.a.a.b.n;
import a.a.a.a.a.c.d;
import a.a.a.a.a.c.l;
import a.a.a.a.a.c.m;
import a.a.a.a.a.e.e;
import a.a.a.a.a.f.a;
import a.a.a.a.a.f.b;
import a.a.a.a.a.g.o;
import a.a.a.a.a.g.p;
import a.a.a.a.a.g.q;
import a.a.a.a.a.g.t;
import a.a.a.a.c;
import a.a.a.a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.core.internal.CrashEventDataProvider;
import com.crashlytics.android.core.internal.models.SessionEventData;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

@d(a = {CrashEventDataProvider.class})
public class CrashlyticsCore extends i<Void> {
    static final float CLS_DEFAULT_PROCESS_DELAY = 1.0f;
    static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    private static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    public static final String TAG = "CrashlyticsCore";
    private String apiKey;
    private final ConcurrentHashMap<String, String> attributes;
    private String buildId;
    private CrashlyticsFileMarker crashMarker;
    private float delay;
    private boolean disabled;
    private CrashlyticsExecutorServiceWrapper executorServiceWrapper;
    private CrashEventDataProvider externalCrashEventDataProvider;
    private a fileStore;
    private CrashlyticsUncaughtExceptionHandler handler;
    private e httpRequestFactory;
    private CrashlyticsFileMarker initializationMarker;
    private String installerPackageName;
    private CrashlyticsListener listener;
    private String packageName;
    private final PinningInfoProvider pinningInfo;
    private File sdkDir;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;
    private String versionCode;
    private String versionName;

    public static class Builder {
        private float delay = -1.0f;
        private boolean disabled = false;
        private CrashlyticsListener listener;
        private PinningInfoProvider pinningInfoProvider;

        public Builder delay(float f) {
            if (f <= 0.0f) {
                throw new IllegalArgumentException("delay must be greater than 0");
            } else if (this.delay > 0.0f) {
                throw new IllegalStateException("delay already set.");
            } else {
                this.delay = f;
                return this;
            }
        }

        public Builder listener(CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.listener != null) {
                throw new IllegalStateException("listener already set.");
            } else {
                this.listener = crashlyticsListener;
                return this;
            }
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            if (pinningInfoProvider == null) {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            } else if (this.pinningInfoProvider != null) {
                throw new IllegalStateException("pinningInfoProvider already set.");
            } else {
                this.pinningInfoProvider = pinningInfoProvider;
                return this;
            }
        }

        public Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public CrashlyticsCore build() {
            if (this.delay < 0.0f) {
                this.delay = 1.0f;
            }
            return new CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }
    }

    private static final class CrashMarkerCheck implements Callable<Boolean> {
        private final CrashlyticsFileMarker crashMarker;

        public CrashMarkerCheck(CrashlyticsFileMarker crashlyticsFileMarker) {
            this.crashMarker = crashlyticsFileMarker;
        }

        public Boolean call() throws Exception {
            if (!this.crashMarker.isPresent()) {
                return Boolean.FALSE;
            }
            c.h().a(CrashlyticsCore.TAG, "Found previous crash marker.");
            this.crashMarker.remove();
            return Boolean.TRUE;
        }
    }

    private static final class NoOpListener implements CrashlyticsListener {
        private NoOpListener() {
        }

        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }
    }

    private static class OptInLatch {
        private final CountDownLatch latch;
        private boolean send;

        private OptInLatch() {
            this.send = false;
            this.latch = new CountDownLatch(1);
        }

        void setOptIn(boolean z) {
            this.send = z;
            this.latch.countDown();
        }

        boolean getOptIn() {
            return this.send;
        }

        void await() {
            try {
                this.latch.await();
            } catch (InterruptedException e) {
            }
        }
    }

    public CrashlyticsCore() {
        this(1.0f, null, null, false);
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z) {
        this(f, crashlyticsListener, pinningInfoProvider, z, n.a("Crashlytics Exception Handler"));
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.userId = null;
        this.userEmail = null;
        this.userName = null;
        this.delay = f;
        if (crashlyticsListener == null) {
            crashlyticsListener = new NoOpListener();
        }
        this.listener = crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.executorServiceWrapper = new CrashlyticsExecutorServiceWrapper(executorService);
        this.attributes = new ConcurrentHashMap();
        this.startTime = System.currentTimeMillis();
    }

    protected boolean onPreExecute() {
        return onPreExecute(super.getContext());
    }

    boolean onPreExecute(Context context) {
        if (this.disabled) {
            return false;
        }
        this.apiKey = new g().a(context);
        if (this.apiKey == null) {
            return false;
        }
        c.h().c(TAG, "Initializing Crashlytics " + getVersion());
        this.fileStore = new b(this);
        this.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, this.fileStore);
        this.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, this.fileStore);
        try {
            setAndValidateKitProperties(context, this.apiKey);
            UnityVersionProvider manifestUnityVersionProvider = new ManifestUnityVersionProvider(context, getPackageName());
            boolean didPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            installExceptionHandler(manifestUnityVersionProvider);
            if (!didPreviousInitializationFail || !a.a.a.a.a.b.i.n(context)) {
                return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
            }
            finishInitSynchronously();
            return false;
        } catch (Throwable e) {
            throw new m(e);
        } catch (Throwable e2) {
            c.h().e(TAG, "Crashlytics was not started due to an exception during initialization", e2);
            return false;
        }
    }

    private void setAndValidateKitProperties(Context context, String str) throws NameNotFoundException {
        a.a.a.a.a.e.g crashlyticsPinningInfoProvider = this.pinningInfo != null ? new CrashlyticsPinningInfoProvider(this.pinningInfo) : null;
        this.httpRequestFactory = new a.a.a.a.a.e.b(c.h());
        this.httpRequestFactory.a(crashlyticsPinningInfoProvider);
        this.packageName = context.getPackageName();
        this.installerPackageName = getIdManager().j();
        c.h().a(TAG, "Installer package name is: " + this.installerPackageName);
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.packageName, 0);
        this.versionCode = Integer.toString(packageInfo.versionCode);
        this.versionName = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
        this.buildId = a.a.a.a.a.b.i.m(context);
        getBuildIdValidator(this.buildId, isRequiringBuildId(context)).validate(str, this.packageName);
    }

    private void installExceptionHandler(UnityVersionProvider unityVersionProvider) {
        try {
            c.h().a(TAG, "Installing exception handler...");
            this.handler = new CrashlyticsUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler(), this.executorServiceWrapper, getIdManager(), unityVersionProvider, this.fileStore, this);
            this.handler.openSession();
            Thread.setDefaultUncaughtExceptionHandler(this.handler);
            c.h().a(TAG, "Successfully installed exception handler.");
        } catch (Throwable e) {
            c.h().e(TAG, "There was a problem installing the exception handler.", e);
        }
    }

    protected Void doInBackground() {
        markInitializationStarted();
        this.handler.cleanInvalidTempFiles();
        try {
            t b = q.a().b();
            if (b == null) {
                c.h().d(TAG, "Received null settings, skipping initialization!");
            } else if (b.d.c) {
                this.handler.finalizeSessions();
                CreateReportSpiCall createReportSpiCall = getCreateReportSpiCall(b);
                if (createReportSpiCall == null) {
                    c.h().d(TAG, "Unable to create a call to upload reports.");
                    markInitializationComplete();
                } else {
                    new ReportUploader(createReportSpiCall).uploadReports(this.delay);
                    markInitializationComplete();
                }
            } else {
                c.h().a(TAG, "Collection of crash reports disabled in Crashlytics settings.");
                markInitializationComplete();
            }
        } catch (Throwable e) {
            c.h().e(TAG, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } finally {
            markInitializationComplete();
        }
        return null;
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public String getVersion() {
        return "2.3.8.97";
    }

    public static CrashlyticsCore getInstance() {
        return (CrashlyticsCore) c.a(CrashlyticsCore.class);
    }

    public PinningInfoProvider getPinningInfoProvider() {
        return !this.disabled ? this.pinningInfo : null;
    }

    public void logException(Throwable th) {
        if (this.disabled || !ensureFabricWithCalled("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            c.h().a(5, TAG, "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.handler.writeNonFatalException(Thread.currentThread(), th);
        }
    }

    public void log(String str) {
        doLog(3, TAG, str);
    }

    private void doLog(int i, String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging messages.")) {
            this.handler.writeToLog(System.currentTimeMillis() - this.startTime, formatLogMessage(i, str, str2));
        }
    }

    public void log(int i, String str, String str2) {
        doLog(i, str, str2);
        c.h().a(i, "" + str, "" + str2, CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT);
    }

    public void setUserIdentifier(String str) {
        if (!this.disabled) {
            this.userId = sanitizeAttribute(str);
            this.handler.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserName(String str) {
        if (!this.disabled) {
            this.userName = sanitizeAttribute(str);
            this.handler.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserEmail(String str) {
        if (!this.disabled) {
            this.userEmail = sanitizeAttribute(str);
            this.handler.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setString(String str, String str2) {
        if (!this.disabled) {
            if (str == null) {
                Context context = getContext();
                if (context == null || !a.a.a.a.a.b.i.i(context)) {
                    c.h().e(TAG, "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String sanitizeAttribute = sanitizeAttribute(str);
            if (this.attributes.size() < 64 || this.attributes.containsKey(sanitizeAttribute)) {
                this.attributes.put(sanitizeAttribute, str2 == null ? "" : sanitizeAttribute(str2));
                this.handler.cacheKeyData(this.attributes);
                return;
            }
            c.h().a(TAG, "Exceeded maximum number of custom attributes (64)");
        }
    }

    public void setBool(String str, boolean z) {
        setString(str, Boolean.toString(z));
    }

    public void setDouble(String str, double d) {
        setString(str, Double.toString(d));
    }

    public void setFloat(String str, float f) {
        setString(str, Float.toString(f));
    }

    public void setInt(String str, int i) {
        setString(str, Integer.toString(i));
    }

    public void setLong(String str, long j) {
        setString(str, Long.toString(j));
    }

    public void crash() {
        new CrashTest().indexOutOfBounds();
    }

    public boolean verifyPinning(URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (Throwable e) {
            c.h().e(TAG, "Could not verify SSL pinning", e);
            return false;
        }
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        c.h().d(TAG, "Use of setListener is deprecated.");
        if (crashlyticsListener == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.listener = crashlyticsListener;
    }

    static void recordLoggedExceptionEvent(String str) {
        Answers answers = (Answers) c.a(Answers.class);
        if (answers != null) {
            answers.onException(new j.b(str));
        }
    }

    static void recordFatalExceptionEvent(String str) {
        Answers answers = (Answers) c.a(Answers.class);
        if (answers != null) {
            answers.onException(new j.a(str));
        }
    }

    Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    BuildIdValidator getBuildIdValidator(String str, boolean z) {
        return new BuildIdValidator(str, z);
    }

    String getPackageName() {
        return this.packageName;
    }

    String getApiKey() {
        return this.apiKey;
    }

    String getInstallerPackageName() {
        return this.installerPackageName;
    }

    String getVersionName() {
        return this.versionName;
    }

    String getVersionCode() {
        return this.versionCode;
    }

    String getOverridenSpiEndpoint() {
        return a.a.a.a.a.b.i.b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }

    String getBuildId() {
        return this.buildId;
    }

    CrashlyticsUncaughtExceptionHandler getHandler() {
        return this.handler;
    }

    String getUserIdentifier() {
        return getIdManager().a() ? this.userId : null;
    }

    String getUserEmail() {
        return getIdManager().a() ? this.userEmail : null;
    }

    String getUserName() {
        return getIdManager().a() ? this.userName : null;
    }

    private void finishInitSynchronously() {
        Callable anonymousClass1 = new a.a.a.a.a.c.g<Void>() {
            public Void call() throws Exception {
                return CrashlyticsCore.this.doInBackground();
            }

            public a.a.a.a.a.c.e getPriority() {
                return a.a.a.a.a.c.e.IMMEDIATE;
            }
        };
        for (l addDependency : getDependencies()) {
            anonymousClass1.addDependency(addDependency);
        }
        Future submit = getFabric().f().submit(anonymousClass1);
        c.h().a(TAG, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (Throwable e) {
            c.h().e(TAG, "Crashlytics was interrupted during initialization.", e);
        } catch (Throwable e2) {
            c.h().e(TAG, "Problem encountered during Crashlytics initialization.", e2);
        } catch (Throwable e22) {
            c.h().e(TAG, "Crashlytics timed out during initialization.", e22);
        }
    }

    void markInitializationStarted() {
        this.executorServiceWrapper.executeSyncLoggingException(new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsCore.this.initializationMarker.create();
                c.h().a(CrashlyticsCore.TAG, "Initialization marker file created.");
                return null;
            }
        });
    }

    void markInitializationComplete() {
        this.executorServiceWrapper.executeAsync(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    c.h().a(CrashlyticsCore.TAG, "Initialization marker file removed: " + remove);
                    return Boolean.valueOf(remove);
                } catch (Throwable e) {
                    c.h().e(CrashlyticsCore.TAG, "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.valueOf(false);
                }
            }
        });
    }

    boolean didPreviousInitializationFail() {
        return ((Boolean) this.executorServiceWrapper.executeSyncLoggingException(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return Boolean.valueOf(CrashlyticsCore.this.initializationMarker.isPresent());
            }
        })).booleanValue();
    }

    void setExternalCrashEventDataProvider(CrashEventDataProvider crashEventDataProvider) {
        this.externalCrashEventDataProvider = crashEventDataProvider;
    }

    SessionEventData getExternalCrashEventData() {
        if (this.externalCrashEventDataProvider != null) {
            return this.externalCrashEventDataProvider.getCrashEventData();
        }
        return null;
    }

    boolean internalVerifyPinning(URL url) {
        if (getPinningInfoProvider() == null) {
            return false;
        }
        a.a.a.a.a.e.d a = this.httpRequestFactory.a(a.a.a.a.a.e.c.GET, url.toString());
        ((HttpsURLConnection) a.a()).setInstanceFollowRedirects(false);
        a.b();
        return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
    }

    File getSdkDirectory() {
        if (this.sdkDir == null) {
            this.sdkDir = new b(this).a();
        }
        return this.sdkDir;
    }

    boolean shouldPromptUserBeforeSendingCrashReports() {
        return ((Boolean) q.a().a(new q.b<Boolean>() {
            public Boolean usingSettings(t tVar) {
                boolean z = false;
                if (!tVar.d.a) {
                    return Boolean.valueOf(false);
                }
                if (!CrashlyticsCore.this.shouldSendReportsWithoutPrompting()) {
                    z = CrashlyticsCore.CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
                }
                return Boolean.valueOf(z);
            }
        }, Boolean.valueOf(false))).booleanValue();
    }

    boolean shouldSendReportsWithoutPrompting() {
        return new a.a.a.a.a.f.d(this).a().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false);
    }

    @SuppressLint({"CommitPrefEdits"})
    void setShouldSendUserReportsWithoutPrompting(boolean z) {
        a.a.a.a.a.f.c dVar = new a.a.a.a.a.f.d(this);
        dVar.a(dVar.b().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z));
    }

    boolean canSendWithUserApproval() {
        return ((Boolean) q.a().a(new q.b<Boolean>() {
            public Boolean usingSettings(t tVar) {
                boolean z = CrashlyticsCore.CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
                Activity b = CrashlyticsCore.this.getFabric().b();
                if (!(b == null || b.isFinishing() || !CrashlyticsCore.this.shouldPromptUserBeforeSendingCrashReports())) {
                    z = CrashlyticsCore.this.getSendDecisionFromUser(b, tVar.c);
                }
                return Boolean.valueOf(z);
            }
        }, Boolean.valueOf(CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT))).booleanValue();
    }

    CreateReportSpiCall getCreateReportSpiCall(t tVar) {
        if (tVar != null) {
            return new DefaultCreateReportSpiCall(this, getOverridenSpiEndpoint(), tVar.a.d, this.httpRequestFactory);
        }
        return null;
    }

    private void checkForPreviousCrash() {
        if (Boolean.TRUE.equals((Boolean) this.executorServiceWrapper.executeSyncLoggingException(new CrashMarkerCheck(this.crashMarker)))) {
            try {
                this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (Throwable e) {
                c.h().e(TAG, "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    void createCrashMarker() {
        this.crashMarker.create();
    }

    private boolean getSendDecisionFromUser(Activity activity, o oVar) {
        final DialogStringResolver dialogStringResolver = new DialogStringResolver(activity, oVar);
        final OptInLatch optInLatch = new OptInLatch();
        final Activity activity2 = activity;
        final o oVar2 = oVar;
        activity.runOnUiThread(new Runnable() {
            public void run() {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity2);
                OnClickListener anonymousClass1 = new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        optInLatch.setOptIn(CrashlyticsCore.CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT);
                        dialogInterface.dismiss();
                    }
                };
                float f = activity2.getResources().getDisplayMetrics().density;
                int access$400 = CrashlyticsCore.dipsToPixels(f, 5);
                View textView = new TextView(activity2);
                textView.setAutoLinkMask(15);
                textView.setText(dialogStringResolver.getMessage());
                textView.setTextAppearance(activity2, 16973892);
                textView.setPadding(access$400, access$400, access$400, access$400);
                textView.setFocusable(false);
                View scrollView = new ScrollView(activity2);
                scrollView.setPadding(CrashlyticsCore.dipsToPixels(f, 14), CrashlyticsCore.dipsToPixels(f, 2), CrashlyticsCore.dipsToPixels(f, 10), CrashlyticsCore.dipsToPixels(f, 12));
                scrollView.addView(textView);
                builder.setView(scrollView).setTitle(dialogStringResolver.getTitle()).setCancelable(false).setNeutralButton(dialogStringResolver.getSendButtonTitle(), anonymousClass1);
                if (oVar2.d) {
                    builder.setNegativeButton(dialogStringResolver.getCancelButtonTitle(), new OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            optInLatch.setOptIn(false);
                            dialogInterface.dismiss();
                        }
                    });
                }
                if (oVar2.f) {
                    builder.setPositiveButton(dialogStringResolver.getAlwaysSendButtonTitle(), new OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            CrashlyticsCore.this.setShouldSendUserReportsWithoutPrompting(CrashlyticsCore.CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT);
                            optInLatch.setOptIn(CrashlyticsCore.CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT);
                            dialogInterface.dismiss();
                        }
                    });
                }
                builder.show();
            }
        });
        c.h().a(TAG, "Waiting for user opt-in.");
        optInLatch.await();
        return optInLatch.getOptIn();
    }

    static p getSessionSettingsData() {
        t b = q.a().b();
        return b == null ? null : b.b;
    }

    private static boolean isRequiringBuildId(Context context) {
        return a.a.a.a.a.b.i.a(context, CRASHLYTICS_REQUIRE_BUILD_ID, (boolean) CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT);
    }

    private static String formatLogMessage(int i, String str, String str2) {
        return a.a.a.a.a.b.i.b(i) + "/" + str + " " + str2;
    }

    private static boolean ensureFabricWithCalled(String str) {
        CrashlyticsCore instance = getInstance();
        if (instance != null && instance.handler != null) {
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        }
        c.h().e(TAG, "Crashlytics must be initialized by calling Fabric.with(Context) " + str, null);
        return false;
    }

    private static String sanitizeAttribute(String str) {
        if (str == null) {
            return str;
        }
        str = str.trim();
        if (str.length() > 1024) {
            return str.substring(0, 1024);
        }
        return str;
    }

    private static int dipsToPixels(float f, int i) {
        return (int) (((float) i) * f);
    }
}
