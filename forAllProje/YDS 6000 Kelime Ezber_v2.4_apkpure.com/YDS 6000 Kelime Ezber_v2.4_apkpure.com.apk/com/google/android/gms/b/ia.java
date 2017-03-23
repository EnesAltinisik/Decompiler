package com.google.android.gms.b;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class ia implements ib {
    private boolean a = false;

    private void b() {
        kt.a(this.a, "Transaction expected to already be in progress.");
    }

    public <T> T a(Callable<T> callable) {
        kt.a(!this.a, "runInTransaction called when an existing transaction is already in progress.");
        this.a = true;
        try {
            T call = callable.call();
            this.a = false;
            return call;
        } catch (Throwable th) {
            this.a = false;
        }
    }

    public List<hl> a() {
        return Collections.emptyList();
    }

    public void a(long j) {
        b();
    }

    public void a(gx gxVar, go goVar) {
        b();
    }

    public void a(gx gxVar, go goVar, long j) {
        b();
    }

    public void a(gx gxVar, jr jrVar) {
        b();
    }

    public void a(gx gxVar, jr jrVar, long j) {
        b();
    }

    public void a(it itVar) {
        b();
    }

    public void a(it itVar, jr jrVar) {
        b();
    }

    public void a(it itVar, Set<je> set, Set<je> set2) {
        b();
    }

    public void b(gx gxVar, go goVar) {
        b();
    }

    public void b(it itVar) {
        b();
    }
}
