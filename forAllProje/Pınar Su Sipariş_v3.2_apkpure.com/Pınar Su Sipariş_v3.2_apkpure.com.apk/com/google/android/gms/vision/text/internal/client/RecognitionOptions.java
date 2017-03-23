package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RecognitionOptions extends AbstractSafeParcelable {
    public static final zzf CREATOR = new zzf();
    final int versionCode;
    public final Rect zzbyH;

    public RecognitionOptions() {
        this.versionCode = 1;
        this.zzbyH = new Rect();
    }

    public RecognitionOptions(int i, Rect rect) {
        this.versionCode = i;
        this.zzbyH = rect;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }
}
