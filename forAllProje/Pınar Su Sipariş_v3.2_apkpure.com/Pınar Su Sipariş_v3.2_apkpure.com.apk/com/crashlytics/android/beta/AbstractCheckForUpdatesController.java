package com.crashlytics.android.beta;

import a.a.a.a.a.b.g;
import a.a.a.a.a.b.k;
import a.a.a.a.a.b.o;
import a.a.a.a.a.b.o.a;
import a.a.a.a.a.e.e;
import a.a.a.a.a.f.c;
import a.a.a.a.a.g.f;
import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class AbstractCheckForUpdatesController implements UpdatesController {
    static final long LAST_UPDATE_CHECK_DEFAULT = 0;
    static final String LAST_UPDATE_CHECK_KEY = "last_update_check";
    private static final long MILLIS_PER_SECOND = 1000;
    private Beta beta;
    private f betaSettings;
    private BuildProperties buildProps;
    private Context context;
    private k currentTimeProvider;
    private final AtomicBoolean externallyReady;
    private e httpRequestFactory;
    private o idManager;
    private final AtomicBoolean initialized;
    private long lastCheckTimeMillis;
    private c preferenceStore;

    public AbstractCheckForUpdatesController() {
        this(false);
    }

    public AbstractCheckForUpdatesController(boolean z) {
        this.initialized = new AtomicBoolean();
        this.lastCheckTimeMillis = 0;
        this.externallyReady = new AtomicBoolean(z);
    }

    public void initialize(Context context, Beta beta, o oVar, f fVar, BuildProperties buildProperties, c cVar, k kVar, e eVar) {
        this.context = context;
        this.beta = beta;
        this.idManager = oVar;
        this.betaSettings = fVar;
        this.buildProps = buildProperties;
        this.preferenceStore = cVar;
        this.currentTimeProvider = kVar;
        this.httpRequestFactory = eVar;
        if (signalInitialized()) {
            checkForUpdates();
        }
    }

    protected boolean signalExternallyReady() {
        this.externallyReady.set(true);
        return this.initialized.get();
    }

    boolean signalInitialized() {
        this.initialized.set(true);
        return this.externallyReady.get();
    }

    @SuppressLint({"CommitPrefEdits"})
    protected void checkForUpdates() {
        synchronized (this.preferenceStore) {
            if (this.preferenceStore.a().contains(LAST_UPDATE_CHECK_KEY)) {
                this.preferenceStore.a(this.preferenceStore.b().remove(LAST_UPDATE_CHECK_KEY));
            }
        }
        long a = this.currentTimeProvider.a();
        long j = ((long) this.betaSettings.b) * MILLIS_PER_SECOND;
        a.a.a.a.c.h().a(Beta.TAG, "Check for updates delay: " + j);
        a.a.a.a.c.h().a(Beta.TAG, "Check for updates last check time: " + getLastCheckTimeMillis());
        j += getLastCheckTimeMillis();
        a.a.a.a.c.h().a(Beta.TAG, "Check for updates current time: " + a + ", next check time: " + j);
        if (a >= j) {
            try {
                performUpdateCheck();
            } finally {
                setLastCheckTimeMillis(a);
            }
        } else {
            a.a.a.a.c.h().a(Beta.TAG, "Check for updates next check time was not passed");
        }
    }

    private void performUpdateCheck() {
        a.a.a.a.c.h().a(Beta.TAG, "Performing update check");
        new CheckForUpdatesRequest(this.beta, this.beta.getOverridenSpiEndpoint(), this.betaSettings.a, this.httpRequestFactory, new CheckForUpdatesResponseTransform()).invoke(new g().a(this.context), (String) this.idManager.i().get(a.FONT_TOKEN), this.buildProps);
    }

    void setLastCheckTimeMillis(long j) {
        this.lastCheckTimeMillis = j;
    }

    long getLastCheckTimeMillis() {
        return this.lastCheckTimeMillis;
    }
}
