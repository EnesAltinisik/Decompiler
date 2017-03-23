package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzp extends zza<String> {
    public zzp(String str, int i) {
        super(str, i);
    }

    protected /* synthetic */ void zza(Bundle bundle, Object obj) {
        zze(bundle, (String) obj);
    }

    protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        return zzi(dataHolder, i, i2);
    }

    protected void zze(Bundle bundle, String str) {
        bundle.putString(getName(), str);
    }

    protected String zzi(DataHolder dataHolder, int i, int i2) {
        return dataHolder.zzd(getName(), i, i2);
    }

    protected /* synthetic */ Object zzp(Bundle bundle) {
        return zzw(bundle);
    }

    protected String zzw(Bundle bundle) {
        return bundle.getString(getName());
    }
}
