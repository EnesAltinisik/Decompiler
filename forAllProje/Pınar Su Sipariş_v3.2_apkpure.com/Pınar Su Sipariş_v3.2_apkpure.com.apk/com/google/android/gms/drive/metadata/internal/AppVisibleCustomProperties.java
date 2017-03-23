package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppVisibleCustomProperties extends AbstractSafeParcelable implements Iterable<CustomProperty> {
    public static final Creator<AppVisibleCustomProperties> CREATOR = new zza();
    public static final AppVisibleCustomProperties zzazl = new zza().zzwJ();
    final int mVersionCode;
    final List<CustomProperty> zzazm;

    public static class zza {
        private final Map<CustomPropertyKey, CustomProperty> zzazn = new HashMap();

        public zza zza(CustomPropertyKey customPropertyKey, String str) {
            zzaa.zzb((Object) customPropertyKey, (Object) "key");
            this.zzazn.put(customPropertyKey, new CustomProperty(customPropertyKey, str));
            return this;
        }

        public zza zza(CustomProperty customProperty) {
            zzaa.zzb((Object) customProperty, (Object) "property");
            this.zzazn.put(customProperty.zzwK(), customProperty);
            return this;
        }

        public AppVisibleCustomProperties zzwJ() {
            return new AppVisibleCustomProperties(this.zzazn.values());
        }
    }

    AppVisibleCustomProperties(int i, Collection<CustomProperty> collection) {
        this.mVersionCode = i;
        zzaa.zzz(collection);
        this.zzazm = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection<CustomProperty> collection) {
        this(1, (Collection) collection);
    }

    public boolean equals(Object obj) {
        return this == obj ? true : (obj == null || obj.getClass() != getClass()) ? false : zzwI().equals(((AppVisibleCustomProperties) obj).zzwI());
    }

    public int hashCode() {
        return zzz.hashCode(this.zzazm);
    }

    public Iterator<CustomProperty> iterator() {
        return this.zzazm.iterator();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public Map<CustomPropertyKey, String> zzwI() {
        Map hashMap = new HashMap(this.zzazm.size());
        for (CustomProperty customProperty : this.zzazm) {
            hashMap.put(customProperty.zzwK(), customProperty.getValue());
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
