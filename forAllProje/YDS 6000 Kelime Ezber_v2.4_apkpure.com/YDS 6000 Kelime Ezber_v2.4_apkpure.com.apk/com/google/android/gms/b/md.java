package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.common.k;

public final class md extends c<mf> {
    private static final md a = new md();

    private md() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static me a(String str, Context context, boolean z) {
        if (k.b().a(context) == 0) {
            me b = a.b(str, context, z);
            if (b != null) {
                return b;
            }
        }
        return new mc(str, context, z);
    }

    private me b(String str, Context context, boolean z) {
        IBinder a;
        a a2 = b.a((Object) context);
        if (z) {
            try {
                a = ((mf) a(context)).a(str, a2);
            } catch (RemoteException e) {
                return null;
            } catch (c.a e2) {
                return null;
            }
        }
        a = ((mf) a(context)).b(str, a2);
        return me.a.a(a);
    }

    protected /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }

    protected mf b(IBinder iBinder) {
        return mf.a.a(iBinder);
    }
}
