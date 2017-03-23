package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Creator<GiftCardWalletObject> CREATOR = new zzg();
    final int mVersionCode;
    String pin;
    CommonWalletObject zzbzg;
    String zzbzh;
    String zzbzi;
    long zzbzj;
    String zzbzk;
    long zzbzl;
    String zzbzm;

    GiftCardWalletObject() {
        this.zzbzg = CommonWalletObject.zzNm().zzNn();
        this.mVersionCode = 1;
    }

    GiftCardWalletObject(int i, CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        this.zzbzg = CommonWalletObject.zzNm().zzNn();
        this.mVersionCode = i;
        this.zzbzg = commonWalletObject;
        this.zzbzh = str;
        this.pin = str2;
        this.zzbzj = j;
        this.zzbzk = str4;
        this.zzbzl = j2;
        this.zzbzm = str5;
        this.zzbzi = str3;
    }

    public String getId() {
        return this.zzbzg.getId();
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
