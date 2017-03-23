package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

class ae implements ProxyResult {
    private Status a;
    private ProxyResponse b;

    public ae(ProxyResponse proxyResponse) {
        this.b = proxyResponse;
        this.a = Status.zzalw;
    }

    public ae(Status status) {
        this.a = status;
    }

    public ProxyResponse getResponse() {
        return this.b;
    }

    public Status getStatus() {
        return this.a;
    }
}
