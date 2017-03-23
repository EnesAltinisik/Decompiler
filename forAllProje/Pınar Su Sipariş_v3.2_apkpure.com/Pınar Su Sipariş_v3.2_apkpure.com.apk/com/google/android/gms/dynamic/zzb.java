package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.zzc.zza;

@SuppressLint({"NewApi"})
public final class zzb extends zza {
    private Fragment zzaCi;

    private zzb(Fragment fragment) {
        this.zzaCi = fragment;
    }

    public static zzb zza(Fragment fragment) {
        return fragment != null ? new zzb(fragment) : null;
    }

    public Bundle getArguments() {
        return this.zzaCi.getArguments();
    }

    public int getId() {
        return this.zzaCi.getId();
    }

    public boolean getRetainInstance() {
        return this.zzaCi.getRetainInstance();
    }

    public String getTag() {
        return this.zzaCi.getTag();
    }

    public int getTargetRequestCode() {
        return this.zzaCi.getTargetRequestCode();
    }

    public boolean getUserVisibleHint() {
        return this.zzaCi.getUserVisibleHint();
    }

    public zzd getView() {
        return zze.zzD(this.zzaCi.getView());
    }

    public boolean isAdded() {
        return this.zzaCi.isAdded();
    }

    public boolean isDetached() {
        return this.zzaCi.isDetached();
    }

    public boolean isHidden() {
        return this.zzaCi.isHidden();
    }

    public boolean isInLayout() {
        return this.zzaCi.isInLayout();
    }

    public boolean isRemoving() {
        return this.zzaCi.isRemoving();
    }

    public boolean isResumed() {
        return this.zzaCi.isResumed();
    }

    public boolean isVisible() {
        return this.zzaCi.isVisible();
    }

    public void setHasOptionsMenu(boolean z) {
        this.zzaCi.setHasOptionsMenu(z);
    }

    public void setMenuVisibility(boolean z) {
        this.zzaCi.setMenuVisibility(z);
    }

    public void setRetainInstance(boolean z) {
        this.zzaCi.setRetainInstance(z);
    }

    public void setUserVisibleHint(boolean z) {
        this.zzaCi.setUserVisibleHint(z);
    }

    public void startActivity(Intent intent) {
        this.zzaCi.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.zzaCi.startActivityForResult(intent, i);
    }

    public void zzv(zzd com_google_android_gms_dynamic_zzd) {
        this.zzaCi.registerForContextMenu((View) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public void zzw(zzd com_google_android_gms_dynamic_zzd) {
        this.zzaCi.unregisterForContextMenu((View) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public zzd zzxe() {
        return zze.zzD(this.zzaCi.getActivity());
    }

    public zzc zzxf() {
        return zza(this.zzaCi.getParentFragment());
    }

    public zzd zzxg() {
        return zze.zzD(this.zzaCi.getResources());
    }

    public zzc zzxh() {
        return zza(this.zzaCi.getTargetFragment());
    }
}
