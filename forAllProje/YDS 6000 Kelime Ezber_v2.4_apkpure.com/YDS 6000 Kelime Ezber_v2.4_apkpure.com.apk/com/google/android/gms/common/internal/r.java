package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.b.w;

public abstract class r implements OnClickListener {

    class AnonymousClass1 extends r {
        final /* synthetic */ Intent a;
        final /* synthetic */ Activity b;
        final /* synthetic */ int c;

        AnonymousClass1(Intent intent, Activity activity, int i) {
            this.a = intent;
            this.b = activity;
            this.c = i;
        }

        public void a() {
            if (this.a != null) {
                this.b.startActivityForResult(this.a, this.c);
            }
        }
    }

    class AnonymousClass2 extends r {
        final /* synthetic */ Intent a;
        final /* synthetic */ w b;
        final /* synthetic */ int c;

        AnonymousClass2(Intent intent, w wVar, int i) {
            this.a = intent;
            this.b = wVar;
            this.c = i;
        }

        @TargetApi(11)
        public void a() {
            if (this.a != null) {
                this.b.startActivityForResult(this.a, this.c);
            }
        }
    }

    public static r a(Activity activity, Intent intent, int i) {
        return new AnonymousClass1(intent, activity, i);
    }

    public static r a(w wVar, Intent intent, int i) {
        return new AnonymousClass2(intent, wVar, i);
    }

    protected abstract void a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
