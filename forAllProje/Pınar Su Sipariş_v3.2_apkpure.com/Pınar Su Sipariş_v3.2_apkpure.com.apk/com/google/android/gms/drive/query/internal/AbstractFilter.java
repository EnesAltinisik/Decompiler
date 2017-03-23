package com.google.android.gms.drive.query.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.zzc;

public abstract class AbstractFilter extends AbstractSafeParcelable implements Filter {
    public String toString() {
        return String.format("Filter[%s]", new Object[]{zza(new zzc())});
    }
}
