package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class uw {
    private AtomicInteger a;
    private final Map<String, Queue<tv<?>>> b;
    private final Set<tv<?>> c;
    private final PriorityBlockingQueue<tv<?>> d;
    private final PriorityBlockingQueue<tv<?>> e;
    private final en f;
    private final ov g;
    private final wy h;
    private pu[] i;
    private lz j;
    private List<Object> k;

    public uw(en enVar, ov ovVar) {
        this(enVar, ovVar, 4);
    }

    public uw(en enVar, ov ovVar, int i) {
        this(enVar, ovVar, i, new nu(new Handler(Looper.getMainLooper())));
    }

    public uw(en enVar, ov ovVar, int i, wy wyVar) {
        this.a = new AtomicInteger();
        this.b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue();
        this.e = new PriorityBlockingQueue();
        this.k = new ArrayList();
        this.f = enVar;
        this.g = ovVar;
        this.i = new pu[i];
        this.h = wyVar;
    }

    public <T> tv<T> a(tv<T> tvVar) {
        tvVar.a(this);
        synchronized (this.c) {
            this.c.add(tvVar);
        }
        tvVar.a(c());
        tvVar.b("add-to-queue");
        if (tvVar.l()) {
            synchronized (this.b) {
                String d = tvVar.d();
                if (this.b.containsKey(d)) {
                    Queue queue = (Queue) this.b.get(d);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(tvVar);
                    this.b.put(d, queue);
                    if (abg.b) {
                        abg.a("Request for cacheKey=%s is in flight, putting on hold.", d);
                    }
                } else {
                    this.b.put(d, null);
                    this.d.add(tvVar);
                }
            }
        } else {
            this.e.add(tvVar);
        }
        return tvVar;
    }

    public void a() {
        b();
        this.j = new lz(this.d, this.e, this.f, this.h);
        this.j.start();
        for (int i = 0; i < this.i.length; i++) {
            pu puVar = new pu(this.e, this.g, this.f, this.h);
            this.i[i] = puVar;
            puVar.start();
        }
    }

    public void b() {
        if (this.j != null) {
            this.j.a();
        }
        for (int i = 0; i < this.i.length; i++) {
            if (this.i[i] != null) {
                this.i[i].a();
            }
        }
    }

    <T> void b(tv<T> tvVar) {
        synchronized (this.c) {
            this.c.remove(tvVar);
        }
        synchronized (this.k) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (tvVar.l()) {
            synchronized (this.b) {
                Queue queue = (Queue) this.b.remove(tvVar.d());
                if (queue != null) {
                    if (abg.b) {
                        abg.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                    }
                    this.d.addAll(queue);
                }
            }
        }
    }

    public int c() {
        return this.a.incrementAndGet();
    }
}
