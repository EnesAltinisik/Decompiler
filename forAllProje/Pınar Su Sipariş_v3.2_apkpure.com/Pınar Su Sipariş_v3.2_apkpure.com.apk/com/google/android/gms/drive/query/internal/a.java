package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

class a {
    static MetadataField<?> a(MetadataBundle metadataBundle) {
        Set zzwP = metadataBundle.zzwP();
        if (zzwP.size() == 1) {
            return (MetadataField) zzwP.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
