package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zzqd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MetadataBundle extends AbstractSafeParcelable {
    public static final Creator<MetadataBundle> CREATOR = new zzh();
    final int mVersionCode;
    final Bundle zzazr;

    MetadataBundle(int i, Bundle bundle) {
        this.mVersionCode = i;
        this.zzazr = (Bundle) zzaa.zzz(bundle);
        this.zzazr.setClassLoader(getClass().getClassLoader());
        List<String> arrayList = new ArrayList();
        for (String str : this.zzazr.keySet()) {
            String str2;
            if (zze.zzdC(str2) == null) {
                arrayList.add(str2);
                String str3 = "MetadataBundle";
                String str4 = "Ignored unknown metadata field in bundle: ";
                str2 = String.valueOf(str2);
                zzz.zzD(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4));
            }
        }
        for (String str22 : arrayList) {
            this.zzazr.remove(str22);
        }
    }

    private MetadataBundle(Bundle bundle) {
        this(1, bundle);
    }

    public static <T> MetadataBundle zzb(MetadataField<T> metadataField, T t) {
        MetadataBundle zzwN = zzwN();
        zzwN.zzc(metadataField, t);
        return zzwN;
    }

    public static MetadataBundle zzwN() {
        return new MetadataBundle(new Bundle());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataBundle)) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> keySet = this.zzazr.keySet();
        if (!keySet.equals(metadataBundle.zzazr.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!com.google.android.gms.common.internal.zzz.equal(this.zzazr.get(str), metadataBundle.zzazr.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (String str : this.zzazr.keySet()) {
            i *= 31;
            i = this.zzazr.get(str).hashCode() + i;
        }
        return i;
    }

    public void setContext(Context context) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) zza(zzqd.zzaAa);
        if (bitmapTeleporter != null) {
            bitmapTeleporter.zzd(context.getCacheDir());
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzazr);
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("MetadataBundle [values=").append(valueOf).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }

    public <T> T zza(MetadataField<T> metadataField) {
        return metadataField.zzo(this.zzazr);
    }

    public <T> void zzc(MetadataField<T> metadataField, T t) {
        if (zze.zzdC(metadataField.getName()) == null) {
            String str = "Unregistered field: ";
            String valueOf = String.valueOf(metadataField.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        metadataField.zza(t, this.zzazr);
    }

    public boolean zzc(MetadataField<?> metadataField) {
        return this.zzazr.containsKey(metadataField.getName());
    }

    public MetadataBundle zzwO() {
        return new MetadataBundle(new Bundle(this.zzazr));
    }

    public Set<MetadataField<?>> zzwP() {
        Set<MetadataField<?>> hashSet = new HashSet();
        for (String zzdC : this.zzazr.keySet()) {
            hashSet.add(zze.zzdC(zzdC));
        }
        return hashSet;
    }
}
