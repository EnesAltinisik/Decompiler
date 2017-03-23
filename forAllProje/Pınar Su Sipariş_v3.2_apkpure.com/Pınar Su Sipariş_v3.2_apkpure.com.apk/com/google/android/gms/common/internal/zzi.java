package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.internal.zzor;

public abstract class zzi implements OnClickListener {

    class AnonymousClass1 extends zzi {
        final /* synthetic */ Activity a;
        final /* synthetic */ Intent b;
        final /* synthetic */ int c;

        AnonymousClass1(Activity activity, Intent intent, int i) {
            this.a = activity;
            this.b = intent;
            this.c = i;
        }

        public void zztD() {
            this.a.startActivityForResult(this.b, this.c);
        }
    }

    class AnonymousClass2 extends zzi {
        final /* synthetic */ Fragment a;
        final /* synthetic */ Intent b;
        final /* synthetic */ int c;

        AnonymousClass2(Fragment fragment, Intent intent, int i) {
            this.a = fragment;
            this.b = intent;
            this.c = i;
        }

        public void zztD() {
            this.a.startActivityForResult(this.b, this.c);
        }
    }

    class AnonymousClass3 extends zzi {
        final /* synthetic */ zzor a;
        final /* synthetic */ Intent b;
        final /* synthetic */ int c;

        AnonymousClass3(zzor com_google_android_gms_internal_zzor, Intent intent, int i) {
            this.a = com_google_android_gms_internal_zzor;
            this.b = intent;
            this.c = i;
        }

        @TargetApi(11)
        public void zztD() {
            this.a.startActivityForResult(this.b, this.c);
        }
    }

    public static zzi zza(Activity activity, Intent intent, int i) {
        return new AnonymousClass1(activity, intent, i);
    }

    public static zzi zza(Fragment fragment, Intent intent, int i) {
        return new AnonymousClass2(fragment, intent, i);
    }

    public static zzi zza(zzor com_google_android_gms_internal_zzor, Intent intent, int i) {
        return new AnonymousClass3(com_google_android_gms_internal_zzor, intent, i);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            zztD();
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Can't redirect to app settings for Google Play services");
        }
    }

    public abstract void zztD();
}
