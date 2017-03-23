package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.h.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class zzpc extends Fragment implements zzor {
    private static WeakHashMap<FragmentActivity, WeakReference<zzpc>> zzaoq = new WeakHashMap();
    private int zzDO = 0;
    private Map<String, zzoq> zzaor = new a();
    private Bundle zzaos;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.zzpc zza(android.support.v4.app.FragmentActivity r3) {
        /*
        r0 = zzaoq;
        r0 = r0.get(r3);
        r0 = (java.lang.ref.WeakReference) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r0.get();
        r0 = (com.google.android.gms.internal.zzpc) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r3.getSupportFragmentManager();	 Catch:{ ClassCastException -> 0x0048 }
        r1 = "SupportLifecycleFragmentImpl";
        r0 = r0.findFragmentByTag(r1);	 Catch:{ ClassCastException -> 0x0048 }
        r0 = (com.google.android.gms.internal.zzpc) r0;	 Catch:{ ClassCastException -> 0x0048 }
        if (r0 == 0) goto L_0x0027;
    L_0x0021:
        r1 = r0.isRemoving();
        if (r1 == 0) goto L_0x003d;
    L_0x0027:
        r0 = new com.google.android.gms.internal.zzpc;
        r0.<init>();
        r1 = r3.getSupportFragmentManager();
        r1 = r1.beginTransaction();
        r2 = "SupportLifecycleFragmentImpl";
        r1 = r1.add(r0, r2);
        r1.commitAllowingStateLoss();
    L_0x003d:
        r1 = zzaoq;
        r2 = new java.lang.ref.WeakReference;
        r2.<init>(r0);
        r1.put(r3, r2);
        goto L_0x0012;
    L_0x0048:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzpc.zza(android.support.v4.app.FragmentActivity):com.google.android.gms.internal.zzpc");
    }

    private void zzb(final String str, final zzoq com_google_android_gms_internal_zzoq) {
        if (this.zzDO > 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                final /* synthetic */ zzpc c;

                public void run() {
                    if (this.c.zzDO >= 1) {
                        com_google_android_gms_internal_zzoq.onCreate(this.c.zzaos != null ? this.c.zzaos.getBundle(str) : null);
                    }
                    if (this.c.zzDO >= 2) {
                        com_google_android_gms_internal_zzoq.onStart();
                    }
                    if (this.c.zzDO >= 3) {
                        com_google_android_gms_internal_zzoq.onStop();
                    }
                }
            });
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (zzoq dump : this.zzaor.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (zzoq onActivityResult : this.zzaor.values()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzDO = 1;
        this.zzaos = bundle;
        for (Entry entry : this.zzaor.entrySet()) {
            ((zzoq) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.zzaor.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((zzoq) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void onStart() {
        super.onStop();
        this.zzDO = 2;
        for (zzoq onStart : this.zzaor.values()) {
            onStart.onStart();
        }
    }

    public void onStop() {
        super.onStop();
        this.zzDO = 3;
        for (zzoq onStop : this.zzaor.values()) {
            onStop.onStop();
        }
    }

    public <T extends zzoq> T zza(String str, Class<T> cls) {
        return (zzoq) cls.cast(this.zzaor.get(str));
    }

    public void zza(String str, zzoq com_google_android_gms_internal_zzoq) {
        if (this.zzaor.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.zzaor.put(str, com_google_android_gms_internal_zzoq);
        zzb(str, com_google_android_gms_internal_zzoq);
    }

    public /* synthetic */ Activity zzsF() {
        return zzsH();
    }

    public FragmentActivity zzsH() {
        return getActivity();
    }
}
