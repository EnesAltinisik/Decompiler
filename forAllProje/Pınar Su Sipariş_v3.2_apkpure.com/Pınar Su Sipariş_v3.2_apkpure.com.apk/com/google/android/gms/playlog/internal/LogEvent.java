package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class LogEvent extends AbstractSafeParcelable {
    public static final zzc CREATOR = new zzc();
    public final String tag;
    public final int versionCode;
    public final long zzbkO;
    public final long zzbkP;
    public final byte[] zzbkQ;
    public final Bundle zzbkR;

    LogEvent(int i, long j, long j2, String str, byte[] bArr, Bundle bundle) {
        this.versionCode = i;
        this.zzbkO = j;
        this.zzbkP = j2;
        this.tag = str;
        this.zzbkQ = bArr;
        this.zzbkR = bundle;
    }

    public LogEvent(long j, long j2, String str, byte[] bArr, String... strArr) {
        this.versionCode = 1;
        this.zzbkO = j;
        this.zzbkP = j2;
        this.tag = str;
        this.zzbkQ = bArr;
        this.zzbkR = zzf(strArr);
    }

    private static Bundle zzf(String... strArr) {
        Bundle bundle = null;
        if (strArr != null) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("extras must have an even number of elements");
            }
            int length = strArr.length / 2;
            if (length != 0) {
                bundle = new Bundle(length);
                for (int i = 0; i < length; i++) {
                    bundle.putString(strArr[i * 2], strArr[(i * 2) + 1]);
                }
            }
        }
        return bundle;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tag=").append(this.tag).append(",");
        stringBuilder.append("eventTime=").append(this.zzbkO).append(",");
        stringBuilder.append("eventUptime=").append(this.zzbkP).append(",");
        if (!(this.zzbkR == null || this.zzbkR.isEmpty())) {
            stringBuilder.append("keyValues=");
            for (String str : this.zzbkR.keySet()) {
                stringBuilder.append("(").append(str).append(",");
                stringBuilder.append(this.zzbkR.getString(str)).append(")");
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
