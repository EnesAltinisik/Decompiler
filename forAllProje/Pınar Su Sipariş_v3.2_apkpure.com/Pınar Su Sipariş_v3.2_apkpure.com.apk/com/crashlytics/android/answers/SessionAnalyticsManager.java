package com.crashlytics.android.answers;

import a.a.a.a.a;
import a.a.a.a.a.b.n;
import a.a.a.a.a.b.o;
import a.a.a.a.a.e.e;
import a.a.a.a.a.f.b;
import a.a.a.a.c;
import a.a.a.a.i;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.BackgroundManager.Listener;
import java.util.concurrent.ScheduledExecutorService;

class SessionAnalyticsManager implements Listener {
    static final String EXECUTOR_SERVICE = "Answers Events Handler";
    static final long FIRST_LAUNCH_INTERVAL_IN_MS = 3600000;
    static final String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
    final BackgroundManager backgroundManager;
    final AnswersEventsHandler eventsHandler;
    private final long installedAt;
    final a lifecycleManager;
    final AnswersPreferenceManager preferenceManager;

    public static SessionAnalyticsManager build(i iVar, Context context, o oVar, String str, String str2, long j) {
        SessionMetadataCollector sessionMetadataCollector = new SessionMetadataCollector(context, oVar, str, str2);
        AnswersFilesManagerProvider answersFilesManagerProvider = new AnswersFilesManagerProvider(context, new b(iVar));
        e bVar = new a.a.a.a.a.e.b(c.h());
        a aVar = new a(context);
        ScheduledExecutorService b = n.b(EXECUTOR_SERVICE);
        BackgroundManager backgroundManager = new BackgroundManager(b);
        return new SessionAnalyticsManager(new AnswersEventsHandler(iVar, context, answersFilesManagerProvider, sessionMetadataCollector, bVar, b), aVar, backgroundManager, AnswersPreferenceManager.build(context), j);
    }

    SessionAnalyticsManager(AnswersEventsHandler answersEventsHandler, a aVar, BackgroundManager backgroundManager, AnswersPreferenceManager answersPreferenceManager, long j) {
        this.eventsHandler = answersEventsHandler;
        this.lifecycleManager = aVar;
        this.backgroundManager = backgroundManager;
        this.preferenceManager = answersPreferenceManager;
        this.installedAt = j;
    }

    public void enable() {
        this.eventsHandler.enable();
        this.lifecycleManager.a(new AnswersLifecycleCallbacks(this, this.backgroundManager));
        this.backgroundManager.registerListener(this);
        if (isFirstLaunch(this.installedAt)) {
            onInstall();
            this.preferenceManager.setAnalyticsLaunched();
        }
    }

    public void disable() {
        this.lifecycleManager.a();
        this.eventsHandler.disable();
    }

    public void onCustom(CustomEvent customEvent) {
        c.h().a(Answers.TAG, "Logged custom event: " + customEvent);
        this.eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customEvent));
    }

    public void onPredefined(PredefinedEvent predefinedEvent) {
        c.h().a(Answers.TAG, "Logged predefined event: " + predefinedEvent);
        this.eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedEvent));
    }

    public void onCrash(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(ON_CRASH_ERROR_MSG);
        }
        c.h().a(Answers.TAG, "Logged crash");
        this.eventsHandler.processEventSync(SessionEvent.crashEventBuilder(str));
    }

    public void onError(String str) {
    }

    public void onInstall() {
        c.h().a(Answers.TAG, "Logged install");
        this.eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder());
    }

    public void onLifecycle(Activity activity, Type type) {
        c.h().a(Answers.TAG, "Logged lifecycle event: " + type.name());
        this.eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
    }

    public void onBackground() {
        c.h().a(Answers.TAG, "Flush events when app is backgrounded");
        this.eventsHandler.flushEvents();
    }

    public void setAnalyticsSettingsData(a.a.a.a.a.g.b bVar, String str) {
        this.backgroundManager.setFlushOnBackground(bVar.h);
        this.eventsHandler.setAnalyticsSettingsData(bVar, str);
    }

    boolean isFirstLaunch(long j) {
        return !this.preferenceManager.hasAnalyticsLaunched() && installedRecently(j);
    }

    boolean installedRecently(long j) {
        return System.currentTimeMillis() - j < FIRST_LAUNCH_INTERVAL_IN_MS;
    }
}
