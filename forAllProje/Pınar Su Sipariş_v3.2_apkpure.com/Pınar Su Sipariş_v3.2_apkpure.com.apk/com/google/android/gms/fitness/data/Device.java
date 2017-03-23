package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzqo;
import com.google.android.gms.internal.zzrs;

public final class Device extends AbstractSafeParcelable {
    public static final Creator<Device> CREATOR = new zzi();
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;
    private final int mVersionCode;
    private final String zzaDw;
    private final String zzaDx;
    private final String zzaDy;
    private final int zzaDz;
    private final int zzagd;
    private final String zzahE;

    Device(int i, String str, String str2, String str3, String str4, int i2, int i3) {
        this.mVersionCode = i;
        this.zzaDw = (String) zzaa.zzz(str);
        this.zzaDx = (String) zzaa.zzz(str2);
        this.zzahE = "";
        this.zzaDy = (String) zzaa.zzz(str4);
        this.zzagd = i2;
        this.zzaDz = i3;
    }

    public Device(String str, String str2, String str3, int i) {
        this(str, str2, "", str3, i, 0);
    }

    public Device(String str, String str2, String str3, String str4, int i, int i2) {
        this(1, str, str2, "", str4, i, i2);
    }

    public static Device getLocalDevice(Context context) {
        int zzaO = zzqo.zzaO(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, VERSION.RELEASE, zzaK(context), zzaO, 2);
    }

    private boolean zza(Device device) {
        return zzz.equal(this.zzaDw, device.zzaDw) && zzz.equal(this.zzaDx, device.zzaDx) && zzz.equal(this.zzahE, device.zzahE) && zzz.equal(this.zzaDy, device.zzaDy) && this.zzagd == device.zzagd && this.zzaDz == device.zzaDz;
    }

    private static String zzaK(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    private boolean zzxC() {
        return zzxB() == 1;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Device) && zza((Device) obj));
    }

    public String getManufacturer() {
        return this.zzaDw;
    }

    public String getModel() {
        return this.zzaDx;
    }

    String getStreamIdentifier() {
        return String.format("%s:%s:%s", new Object[]{this.zzaDw, this.zzaDx, this.zzaDy});
    }

    public int getType() {
        return this.zzagd;
    }

    public String getUid() {
        return this.zzaDy;
    }

    public String getVersion() {
        return this.zzahE;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaDw, this.zzaDx, this.zzahE, this.zzaDy, Integer.valueOf(this.zzagd));
    }

    public String toString() {
        return String.format("Device{%s:%s:%s:%s}", new Object[]{getStreamIdentifier(), this.zzahE, Integer.valueOf(this.zzagd), Integer.valueOf(this.zzaDz)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    public int zzxB() {
        return this.zzaDz;
    }

    public String zzxD() {
        return zzxC() ? this.zzaDy : zzrs.zzeg(this.zzaDy);
    }
}
