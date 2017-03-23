package com.google.android.gms.b;

abstract class cy extends cx {
    private boolean a;

    cy(cv cvVar) {
        super(cvVar);
        this.n.a(this);
    }

    boolean P() {
        return this.a;
    }

    protected void Q() {
        if (!P()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void R() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        a();
        this.n.M();
        this.a = true;
    }

    protected abstract void a();
}
