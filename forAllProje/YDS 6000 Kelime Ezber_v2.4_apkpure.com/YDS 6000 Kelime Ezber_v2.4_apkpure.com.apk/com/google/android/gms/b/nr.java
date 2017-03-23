package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.b.ok.a;

@vz
public class nr extends c<ol> {
    public nr() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public ok a(Context context, nx nxVar, String str, tn tnVar, int i) {
        Throwable e;
        try {
            return a.a(((ol) a(context)).a(b.a((Object) context), nxVar, str, tnVar, 10084000, i));
        } catch (RemoteException e2) {
            e = e2;
            zy.a("Could not create remote AdManager.", e);
            return null;
        } catch (c.a e3) {
            e = e3;
            zy.a("Could not create remote AdManager.", e);
            return null;
        }
    }

    protected /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }

    protected ol b(IBinder iBinder) {
        return ol.a.a(iBinder);
    }
}
