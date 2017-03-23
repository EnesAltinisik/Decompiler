package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActivityRecognitionRequest extends AbstractSafeParcelable {
    public static final Creator<ActivityRecognitionRequest> CREATOR = new zza();
    private String mTag;
    private final int mVersionCode;
    private long zzaUE;
    private boolean zzaUF;
    private WorkSource zzaUG;
    private int[] zzaUH;
    private boolean zzaUI;
    private String zzaaR;

    ActivityRecognitionRequest(int i, long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2) {
        this.mVersionCode = i;
        this.zzaUE = j;
        this.zzaUF = z;
        this.zzaUG = workSource;
        this.mTag = str;
        this.zzaUH = iArr;
        this.zzaUI = z2;
        this.zzaaR = str2;
    }

    public String getAccountName() {
        return this.zzaaR;
    }

    public long getIntervalMillis() {
        return this.zzaUE;
    }

    public String getTag() {
        return this.mTag;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public boolean zzCm() {
        return this.zzaUF;
    }

    public WorkSource zzCn() {
        return this.zzaUG;
    }

    public int[] zzCo() {
        return this.zzaUH;
    }

    public boolean zzCp() {
        return this.zzaUI;
    }
}
