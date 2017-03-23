package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzoq {
    protected final zzor zzaop;

    protected zzoq(zzor com_google_android_gms_internal_zzor) {
        this.zzaop = com_google_android_gms_internal_zzor;
    }

    protected static zzor zzc(zzop com_google_android_gms_internal_zzop) {
        return com_google_android_gms_internal_zzop.zzsC() ? zzpc.zza(com_google_android_gms_internal_zzop.zzsE()) : zzos.zzt(com_google_android_gms_internal_zzop.zzsD());
    }

    protected static zzor zzs(Activity activity) {
        return zzc(new zzop(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        return this.zzaop.zzsF();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}
