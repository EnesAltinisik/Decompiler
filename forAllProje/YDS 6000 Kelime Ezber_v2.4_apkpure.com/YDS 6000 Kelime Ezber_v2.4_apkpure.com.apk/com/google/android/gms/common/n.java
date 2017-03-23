package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.b.at;
import com.google.android.gms.common.internal.c;

public class n {
    private static n a;
    private final Context b;

    private n(Context context) {
        this.b = context.getApplicationContext();
    }

    public static n a(Context context) {
        c.a((Object) context);
        synchronized (n.class) {
            if (a == null) {
                l.a(context);
                a = new n(context);
            }
        }
        return a;
    }

    a a(PackageInfo packageInfo, a... aVarArr) {
        int i = 0;
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        b bVar = new b(packageInfo.signatures[0].toByteArray());
        while (i < aVarArr.length) {
            if (aVarArr[i].equals(bVar)) {
                return aVarArr[i];
            }
            i++;
        }
        return null;
    }

    public boolean a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            a a;
            if (z) {
                a = a(packageInfo, d.a);
            } else {
                a = a(packageInfo, d.a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    public boolean a(PackageManager packageManager, int i) {
        String[] a = at.b(this.b).a(i);
        if (a == null || a.length == 0) {
            return false;
        }
        for (String a2 : a) {
            if (a(packageManager, a2)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m.d(this.b)) {
            return b(packageInfo, true);
        }
        boolean b = b(packageInfo, false);
        if (b || !b(packageInfo, true)) {
            return b;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return b;
    }

    public boolean a(PackageManager packageManager, String str) {
        try {
            return a(packageManager, at.b(this.b).b(str, 64));
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    boolean b(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        a bVar = new b(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        return z ? l.b(str, bVar) : l.a(str, bVar);
    }

    public boolean b(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (a(packageInfo, false)) {
            return true;
        }
        if (!a(packageInfo, true)) {
            return false;
        }
        if (m.d(this.b)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }
}
