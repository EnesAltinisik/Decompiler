package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.b;
import com.google.android.gms.b.bg.a;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

public class bf {
    private boolean a = false;
    private bg b = null;

    public <T> T a(bd<T> bdVar) {
        synchronized (this) {
            if (this.a) {
                return bdVar.a(this.b);
            }
            T b = bdVar.b();
            return b;
        }
    }

    public void a(Context context) {
        Throwable e;
        synchronized (this) {
            if (this.a) {
                return;
            }
            try {
                this.b = a.asInterface(DynamiteModule.a(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.b.init(b.a((Object) context));
                this.a = true;
            } catch (DynamiteModule.a e2) {
                e = e2;
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            } catch (RemoteException e3) {
                e = e3;
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            }
        }
    }
}
