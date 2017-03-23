package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.AddressConstants.Extras;

public final class UserAddress extends AbstractSafeParcelable {
    public static final Creator<UserAddress> CREATOR = new zzb();
    private final int mVersionCode;
    String name;
    String phoneNumber;
    String zzNZ;
    String zzaTN;
    String zzaTO;
    String zzaTP;
    String zzaTQ;
    String zzaTR;
    String zzaTS;
    String zzaTT;
    String zzaTU;
    String zzaTV;
    boolean zzaTW;
    String zzaTX;
    String zzaTY;

    UserAddress() {
        this.mVersionCode = 1;
    }

    UserAddress(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.mVersionCode = i;
        this.name = str;
        this.zzaTN = str2;
        this.zzaTO = str3;
        this.zzaTP = str4;
        this.zzaTQ = str5;
        this.zzaTR = str6;
        this.zzaTS = str7;
        this.zzaTT = str8;
        this.zzNZ = str9;
        this.zzaTU = str10;
        this.zzaTV = str11;
        this.phoneNumber = str12;
        this.zzaTW = z;
        this.zzaTX = str13;
        this.zzaTY = str14;
    }

    public static UserAddress fromIntent(Intent intent) {
        return (intent == null || !intent.hasExtra(Extras.EXTRA_ADDRESS)) ? null : (UserAddress) intent.getParcelableExtra(Extras.EXTRA_ADDRESS);
    }

    public String getAddress1() {
        return this.zzaTN;
    }

    public String getAddress2() {
        return this.zzaTO;
    }

    public String getAddress3() {
        return this.zzaTP;
    }

    public String getAddress4() {
        return this.zzaTQ;
    }

    public String getAddress5() {
        return this.zzaTR;
    }

    public String getAdministrativeArea() {
        return this.zzaTS;
    }

    public String getCompanyName() {
        return this.zzaTX;
    }

    public String getCountryCode() {
        return this.zzNZ;
    }

    public String getEmailAddress() {
        return this.zzaTY;
    }

    public String getLocality() {
        return this.zzaTT;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPostalCode() {
        return this.zzaTU;
    }

    public String getSortingCode() {
        return this.zzaTV;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean isPostBox() {
        return this.zzaTW;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
