package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzro;
import com.google.android.gms.internal.zzro.zza;

public class SessionStopRequest extends AbstractSafeParcelable {
    public static final Creator<SessionStopRequest> CREATOR = new zzab();
    private final String mName;
    private final int mVersionCode;
    private final String zzaDY;
    private final zzro zzaIm;

    SessionStopRequest(int i, String str, String str2, IBinder iBinder) {
        this.mVersionCode = i;
        this.mName = str;
        this.zzaDY = str2;
        this.zzaIm = zza.zzbY(iBinder);
    }

    public SessionStopRequest(String str, String str2, zzro com_google_android_gms_internal_zzro) {
        this.mVersionCode = 3;
        this.mName = str;
        this.zzaDY = str2;
        this.zzaIm = com_google_android_gms_internal_zzro;
    }

    private boolean zzb(SessionStopRequest sessionStopRequest) {
        return zzz.equal(this.mName, sessionStopRequest.mName) && zzz.equal(this.zzaDY, sessionStopRequest.zzaDY);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionStopRequest) && zzb((SessionStopRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaIm == null ? null : this.zzaIm.asBinder();
    }

    public String getIdentifier() {
        return this.zzaDY;
    }

    public String getName() {
        return this.mName;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.mName, this.zzaDY);
    }

    public String toString() {
        return zzz.zzy(this).zzg("name", this.mName).zzg("identifier", this.zzaDY).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzab.zza(this, parcel, i);
    }
}
