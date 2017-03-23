package com.crashlytics.android.answers;

import a.a.a.a.a.b.g;
import a.a.a.a.a.d.f;
import a.a.a.a.a.e.e;
import a.a.a.a.a.g.b;
import a.a.a.a.c;
import a.a.a.a.i;
import android.content.Context;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class EnabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    g apiKey = new g();
    private final Context context;
    boolean customEventsEnabled = true;
    EventFilter eventFilter = new KeepAllEventFilter();
    private final ScheduledExecutorService executorService;
    private final SessionAnalyticsFilesManager filesManager;
    f filesSender;
    private final e httpRequestFactory;
    private final i kit;
    final SessionEventMetadata metadata;
    boolean predefinedEventsEnabled = true;
    private final AtomicReference<ScheduledFuture<?>> rolloverFutureRef = new AtomicReference();
    volatile int rolloverIntervalSeconds = -1;

    public EnabledSessionAnalyticsManagerStrategy(i iVar, Context context, ScheduledExecutorService scheduledExecutorService, SessionAnalyticsFilesManager sessionAnalyticsFilesManager, e eVar, SessionEventMetadata sessionEventMetadata) {
        this.kit = iVar;
        this.context = context;
        this.executorService = scheduledExecutorService;
        this.filesManager = sessionAnalyticsFilesManager;
        this.httpRequestFactory = eVar;
        this.metadata = sessionEventMetadata;
    }

    public void setAnalyticsSettingsData(b bVar, String str) {
        this.filesSender = AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(this.kit, str, bVar.a, this.httpRequestFactory, this.apiKey.a(this.context)));
        this.filesManager.setAnalyticsSettingsData(bVar);
        this.customEventsEnabled = bVar.f;
        c.h().a(Answers.TAG, "Custom event tracking " + (this.customEventsEnabled ? "enabled" : "disabled"));
        this.predefinedEventsEnabled = bVar.g;
        c.h().a(Answers.TAG, "Predefined event tracking " + (this.predefinedEventsEnabled ? "enabled" : "disabled"));
        if (bVar.i > 1) {
            c.h().a(Answers.TAG, "Event sampling enabled");
            this.eventFilter = new SamplingEventFilter(bVar.i);
        }
        this.rolloverIntervalSeconds = bVar.b;
        scheduleTimeBasedFileRollOver(0, (long) this.rolloverIntervalSeconds);
    }

    public void processEvent(Builder builder) {
        SessionEvent build = builder.build(this.metadata);
        if (!this.customEventsEnabled && Type.CUSTOM.equals(build.type)) {
            c.h().a(Answers.TAG, "Custom events tracking disabled - skipping event: " + build);
        } else if (!this.predefinedEventsEnabled && Type.PREDEFINED.equals(build.type)) {
            c.h().a(Answers.TAG, "Predefined events tracking disabled - skipping event: " + build);
        } else if (this.eventFilter.skipEvent(build)) {
            c.h().a(Answers.TAG, "Skipping filtered event: " + build);
        } else {
            try {
                this.filesManager.writeEvent(build);
            } catch (Throwable e) {
                c.h().e(Answers.TAG, "Failed to write event: " + build, e);
            }
            scheduleTimeBasedRollOverIfNeeded();
        }
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
        if ((this.rolloverIntervalSeconds != -1 ? 1 : null) != null) {
            scheduleTimeBasedFileRollOver((long) this.rolloverIntervalSeconds, (long) this.rolloverIntervalSeconds);
        }
    }

    public void sendEvents() {
        if (this.filesSender == null) {
            a.a.a.a.a.b.i.a(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        a.a.a.a.a.b.i.a(this.context, "Sending all files");
        List batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int i = 0;
        while (batchOfFilesToSend.size() > 0) {
            int size;
            a.a.a.a.a.b.i.a(this.context, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(batchOfFilesToSend.size())}));
            boolean send = this.filesSender.send(batchOfFilesToSend);
            if (send) {
                size = batchOfFilesToSend.size() + i;
                try {
                    this.filesManager.deleteSentFiles(batchOfFilesToSend);
                    i = size;
                } catch (Exception e) {
                    Throwable e2 = e;
                }
            }
            if (!send) {
                break;
            }
            try {
                batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
            } catch (Throwable e3) {
                Throwable th = e3;
                size = i;
                e2 = th;
            }
        }
        if (i == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
        a.a.a.a.a.b.i.a(this.context, "Failed to send batch of analytics files to server: " + e2.getMessage(), e2);
        i = size;
        if (i == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    public void cancelTimeBasedFileRollOver() {
        if (this.rolloverFutureRef.get() != null) {
            a.a.a.a.a.b.i.a(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.rolloverFutureRef.get()).cancel(false);
            this.rolloverFutureRef.set(null);
        }
    }

    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        } catch (Throwable e) {
            a.a.a.a.a.b.i.a(this.context, "Failed to roll file over.", e);
            return false;
        }
    }

    void scheduleTimeBasedFileRollOver(long j, long j2) {
        if ((this.rolloverFutureRef.get() == null ? 1 : null) != null) {
            Runnable iVar = new a.a.a.a.a.d.i(this.context, this);
            a.a.a.a.a.b.i.a(this.context, "Scheduling time based file roll over every " + j2 + " seconds");
            try {
                this.rolloverFutureRef.set(this.executorService.scheduleAtFixedRate(iVar, j, j2, TimeUnit.SECONDS));
            } catch (Throwable e) {
                a.a.a.a.a.b.i.a(this.context, "Failed to schedule time based file roll over", e);
            }
        }
    }
}
