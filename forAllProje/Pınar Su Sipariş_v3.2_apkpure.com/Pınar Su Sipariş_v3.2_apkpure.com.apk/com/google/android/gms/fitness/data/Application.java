package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public final class Application extends AbstractSafeParcelable {
    public static final Creator<Application> CREATOR = new zza();
    public static final Application zzaCO = new Application("com.google.android.gms", String.valueOf(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE), null);
    private final int mVersionCode;
    private final String zzZC;
    private final String zzaCP;
    private final String zzahE;

    Application(int i, String str, String str2, String str3) {
        this.mVersionCode = i;
        this.zzZC = (String) zzaa.zzz(str);
        this.zzahE = "";
        this.zzaCP = str3;
    }

    public Application(String str, String str2, String str3) {
        this(1, str, "", str3);
    }

    private boolean zza(Application application) {
        return this.zzZC.equals(application.zzZC) && zzz.equal(this.zzahE, application.zzahE) && zzz.equal(this.zzaCP, application.zzaCP);
    }

    public static Application zzdO(String str) {
        return zzg(str, null, null);
    }

    public static Application zzg(String str, String str2, String str3) {
        return "com.google.android.gms".equals(str) ? zzaCO : new Application(str, str2, str3);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Application) && zza((Application) obj));
    }

    public String getPackageName() {
        return this.zzZC;
    }

    public String getVersion() {
        return this.zzahE;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzZC, this.zzahE, this.zzaCP);
    }

    public String toString() {
        return String.format("Application{%s:%s:%s}", new Object[]{this.zzZC, this.zzahE, this.zzaCP});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public String zzxk() {
        return this.zzaCP;
    }
}
