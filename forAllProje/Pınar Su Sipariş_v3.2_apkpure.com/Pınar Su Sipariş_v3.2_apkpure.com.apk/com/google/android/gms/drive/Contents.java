package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Contents extends AbstractSafeParcelable {
    public static final Creator<Contents> CREATOR = new zzb();
    final int mVersionCode;
    final ParcelFileDescriptor zzapH;
    final int zzauX;
    final int zzauY;
    final DriveId zzauZ;
    final boolean zzava;
    final String zzug;

    Contents(int i, ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, DriveId driveId, boolean z, String str) {
        this.mVersionCode = i;
        this.zzapH = parcelFileDescriptor;
        this.zzauX = i2;
        this.zzauY = i3;
        this.zzauZ = driveId;
        this.zzava = z;
        this.zzug = str;
    }

    public DriveId getDriveId() {
        return this.zzauZ;
    }

    public InputStream getInputStream() {
        return new FileInputStream(this.zzapH.getFileDescriptor());
    }

    public int getMode() {
        return this.zzauY;
    }

    public OutputStream getOutputStream() {
        return new FileOutputStream(this.zzapH.getFileDescriptor());
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.zzapH;
    }

    public int getRequestId() {
        return this.zzauX;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public boolean zzvE() {
        return this.zzava;
    }
}
