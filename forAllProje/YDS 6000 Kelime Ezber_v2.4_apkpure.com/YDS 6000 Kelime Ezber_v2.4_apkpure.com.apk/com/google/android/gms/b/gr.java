package com.google.android.gms.b;

import com.google.firebase.b;

public class gr extends gq {
    public synchronized void a(b bVar) {
        this.j = bVar;
    }

    public synchronized void c(String str) {
        d();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.e = str;
    }
}
