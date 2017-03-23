package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.b.ux.a;

@vz
public final class vc extends c<uy> {
    public vc() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public ux a(Activity activity) {
        try {
            return a.a(((uy) a((Context) activity)).a(b.a((Object) activity)));
        } catch (Throwable e) {
            zy.c("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (Throwable e2) {
            zy.c("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }

    protected /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }

    protected uy b(IBinder iBinder) {
        return uy.a.a(iBinder);
    }
}
