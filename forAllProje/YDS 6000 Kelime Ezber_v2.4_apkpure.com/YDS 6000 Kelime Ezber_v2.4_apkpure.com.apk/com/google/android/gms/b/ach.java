package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;

public class ach implements b, c {
    public final a<?> a;
    private final int b;
    private aci c;

    public ach(a<?> aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    private void a() {
        com.google.android.gms.common.internal.c.a(this.c, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public void a(int i) {
        a();
        this.c.a(i);
    }

    public void a(Bundle bundle) {
        a();
        this.c.a(bundle);
    }

    public void a(aci com_google_android_gms_b_aci) {
        this.c = com_google_android_gms_b_aci;
    }

    public void a(com.google.android.gms.common.a aVar) {
        a();
        this.c.a(aVar, this.a, this.b);
    }
}
