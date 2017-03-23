package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.b.un.a;

@vz
public final class um extends c<uo> {
    public um() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public un a(Activity activity) {
        try {
            return a.a(((uo) a((Context) activity)).a(b.a((Object) activity)));
        } catch (Throwable e) {
            zy.c("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            zy.c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    protected /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }

    protected uo b(IBinder iBinder) {
        return uo.a.a(iBinder);
    }
}
