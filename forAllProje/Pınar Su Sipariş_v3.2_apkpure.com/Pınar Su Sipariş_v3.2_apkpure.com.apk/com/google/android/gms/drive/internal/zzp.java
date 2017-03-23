package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzp extends Metadata {
    private final MetadataBundle zzaxb;

    public zzp(MetadataBundle metadataBundle) {
        this.zzaxb = metadataBundle;
    }

    public /* synthetic */ Object freeze() {
        return zzvT();
    }

    public boolean isDataValid() {
        return this.zzaxb != null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzaxb);
        return new StringBuilder(String.valueOf(valueOf).length() + 17).append("Metadata [mImpl=").append(valueOf).append("]").toString();
    }

    public <T> T zza(MetadataField<T> metadataField) {
        return this.zzaxb.zza(metadataField);
    }

    public Metadata zzvT() {
        return new zzp(this.zzaxb.zzwO());
    }
}
