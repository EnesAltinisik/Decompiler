package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.b.k;
import android.support.v4.b.q;
import com.google.android.gms.common.internal.c;

public class g extends k {
    private Dialog aa = null;
    private OnCancelListener ab = null;

    public static g a(Dialog dialog, OnCancelListener onCancelListener) {
        g gVar = new g();
        Dialog dialog2 = (Dialog) c.a((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        gVar.aa = dialog2;
        if (onCancelListener != null) {
            gVar.ab = onCancelListener;
        }
        return gVar;
    }

    public void a(q qVar, String str) {
        super.a(qVar, str);
    }

    public Dialog c(Bundle bundle) {
        if (this.aa == null) {
            b(false);
        }
        return this.aa;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.ab != null) {
            this.ab.onCancel(dialogInterface);
        }
    }
}
