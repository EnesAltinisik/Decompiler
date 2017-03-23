package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class zza<T> implements MetadataField<T> {
    private final String zzazg;
    private final Set<String> zzazh;
    private final Set<String> zzazi;
    private final int zzazj;

    protected zza(String str, int i) {
        this.zzazg = (String) zzaa.zzb((Object) str, (Object) "fieldName");
        this.zzazh = Collections.singleton(str);
        this.zzazi = Collections.emptySet();
        this.zzazj = i;
    }

    protected zza(String str, Collection<String> collection, Collection<String> collection2, int i) {
        this.zzazg = (String) zzaa.zzb((Object) str, (Object) "fieldName");
        this.zzazh = Collections.unmodifiableSet(new HashSet(collection));
        this.zzazi = Collections.unmodifiableSet(new HashSet(collection2));
        this.zzazj = i;
    }

    public final String getName() {
        return this.zzazg;
    }

    public String toString() {
        return this.zzazg;
    }

    public final T zza(DataHolder dataHolder, int i, int i2) {
        return zzb(dataHolder, i, i2) ? zzc(dataHolder, i, i2) : null;
    }

    protected abstract void zza(Bundle bundle, T t);

    public final void zza(DataHolder dataHolder, MetadataBundle metadataBundle, int i, int i2) {
        zzaa.zzb((Object) dataHolder, (Object) "dataHolder");
        zzaa.zzb((Object) metadataBundle, (Object) "bundle");
        if (zzb(dataHolder, i, i2)) {
            metadataBundle.zzc(this, zzc(dataHolder, i, i2));
        }
    }

    public final void zza(T t, Bundle bundle) {
        zzaa.zzb((Object) bundle, (Object) "bundle");
        if (t == null) {
            bundle.putString(getName(), null);
        } else {
            zza(bundle, (Object) t);
        }
    }

    protected boolean zzb(DataHolder dataHolder, int i, int i2) {
        for (String str : this.zzazh) {
            if (dataHolder.zzcY(str)) {
                if (dataHolder.zzi(str, i, i2)) {
                }
            }
            return false;
        }
        return true;
    }

    protected abstract T zzc(DataHolder dataHolder, int i, int i2);

    public final T zzo(Bundle bundle) {
        zzaa.zzb((Object) bundle, (Object) "bundle");
        return bundle.get(getName()) != null ? zzp(bundle) : null;
    }

    protected abstract T zzp(Bundle bundle);

    public final Collection<String> zzwH() {
        return this.zzazh;
    }
}
