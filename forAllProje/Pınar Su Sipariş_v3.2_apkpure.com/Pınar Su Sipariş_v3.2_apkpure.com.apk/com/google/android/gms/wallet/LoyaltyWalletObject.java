package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Creator<LoyaltyWalletObject> CREATOR = new zzk();
    String id;
    private final int mVersionCode;
    int state;
    String zzaYp;
    String zzbzA;
    String zzbzB;
    ArrayList<WalletObjectMessage> zzbzC;
    TimeInterval zzbzD;
    ArrayList<LatLng> zzbzE;
    String zzbzF;
    String zzbzG;
    ArrayList<LabelValueRow> zzbzH;
    boolean zzbzI;
    ArrayList<UriData> zzbzJ;
    ArrayList<TextModuleData> zzbzK;
    ArrayList<UriData> zzbzL;
    LoyaltyPoints zzbzM;
    String zzbzu;
    String zzbzv;
    String zzbzw;
    String zzbzx;
    String zzbzy;
    String zzbzz;

    LoyaltyWalletObject() {
        this.mVersionCode = 4;
        this.zzbzC = zzb.zzuT();
        this.zzbzE = zzb.zzuT();
        this.zzbzH = zzb.zzuT();
        this.zzbzJ = zzb.zzuT();
        this.zzbzK = zzb.zzuT();
        this.zzbzL = zzb.zzuT();
    }

    LoyaltyWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str11, String str12, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6, LoyaltyPoints loyaltyPoints) {
        this.mVersionCode = i;
        this.id = str;
        this.zzbzu = str2;
        this.zzbzv = str3;
        this.zzbzw = str4;
        this.zzaYp = str5;
        this.zzbzx = str6;
        this.zzbzy = str7;
        this.zzbzz = str8;
        this.zzbzA = str9;
        this.zzbzB = str10;
        this.state = i2;
        this.zzbzC = arrayList;
        this.zzbzD = timeInterval;
        this.zzbzE = arrayList2;
        this.zzbzF = str11;
        this.zzbzG = str12;
        this.zzbzH = arrayList3;
        this.zzbzI = z;
        this.zzbzJ = arrayList4;
        this.zzbzK = arrayList5;
        this.zzbzL = arrayList6;
        this.zzbzM = loyaltyPoints;
    }

    public String getAccountId() {
        return this.zzbzu;
    }

    public String getAccountName() {
        return this.zzaYp;
    }

    public String getBarcodeAlternateText() {
        return this.zzbzx;
    }

    public String getBarcodeType() {
        return this.zzbzy;
    }

    public String getBarcodeValue() {
        return this.zzbzz;
    }

    public String getId() {
        return this.id;
    }

    public String getIssuerName() {
        return this.zzbzv;
    }

    public String getProgramName() {
        return this.zzbzw;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }
}
