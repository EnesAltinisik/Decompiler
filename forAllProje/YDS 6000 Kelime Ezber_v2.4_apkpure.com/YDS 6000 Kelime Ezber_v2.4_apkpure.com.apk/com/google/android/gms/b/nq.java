package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.b.oi.a;

@vz
public final class nq extends c<oj> {
    public nq() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public oi a(Context context, String str, tn tnVar) {
        try {
            return a.a(((oj) a(context)).a(b.a((Object) context), str, tnVar, 10084000));
        } catch (Throwable e) {
            zy.c("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (Throwable e2) {
            zy.c("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    protected /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }

    protected oj b(IBinder iBinder) {
        return oj.a.a(iBinder);
    }
}
