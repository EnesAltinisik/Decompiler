package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

public abstract class EventIncrementManager {
    private final AtomicReference<EventIncrementCache> zzaOV = new AtomicReference();

    public void flush() {
        EventIncrementCache eventIncrementCache = (EventIncrementCache) this.zzaOV.get();
        if (eventIncrementCache != null) {
            eventIncrementCache.flush();
        }
    }

    protected abstract EventIncrementCache zzAn();

    public void zzn(String str, int i) {
        EventIncrementCache eventIncrementCache = (EventIncrementCache) this.zzaOV.get();
        if (eventIncrementCache == null) {
            eventIncrementCache = zzAn();
            if (!this.zzaOV.compareAndSet(null, eventIncrementCache)) {
                eventIncrementCache = (EventIncrementCache) this.zzaOV.get();
            }
        }
        eventIncrementCache.zzu(str, i);
    }
}
