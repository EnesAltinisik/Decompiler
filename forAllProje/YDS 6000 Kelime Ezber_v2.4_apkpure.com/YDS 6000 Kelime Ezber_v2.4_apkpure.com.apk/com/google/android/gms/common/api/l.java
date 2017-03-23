package com.google.android.gms.common.api;

public class l extends Exception {
    protected final Status a;

    public l(Status status) {
        super(status.c());
        this.a = status;
    }
}
