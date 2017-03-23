package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache {
    final Object zzaOP = new Object();
    private Handler zzaOQ;
    private boolean zzaOR;
    private HashMap<String, AtomicInteger> zzaOS;
    private int zzaOT;

    public EventIncrementCache(Looper looper, int i) {
        this.zzaOQ = new Handler(looper);
        this.zzaOS = new HashMap();
        this.zzaOT = i;
    }

    private void zzAF() {
        synchronized (this.zzaOP) {
            this.zzaOR = false;
            flush();
        }
    }

    public void flush() {
        synchronized (this.zzaOP) {
            for (Entry entry : this.zzaOS.entrySet()) {
                zzq((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
            }
            this.zzaOS.clear();
        }
    }

    protected abstract void zzq(String str, int i);

    public void zzu(String str, int i) {
        synchronized (this.zzaOP) {
            if (!this.zzaOR) {
                this.zzaOR = true;
                this.zzaOQ.postDelayed(new Runnable(this) {
                    final /* synthetic */ EventIncrementCache a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.zzAF();
                    }
                }, (long) this.zzaOT);
            }
            AtomicInteger atomicInteger = (AtomicInteger) this.zzaOS.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                this.zzaOS.put(str, atomicInteger);
            }
            atomicInteger.addAndGet(i);
        }
    }
}
