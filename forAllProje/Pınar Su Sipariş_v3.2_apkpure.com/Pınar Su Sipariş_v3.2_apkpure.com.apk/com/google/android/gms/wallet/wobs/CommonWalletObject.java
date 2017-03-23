package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

@KeepName
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Creator<CommonWalletObject> CREATOR = new zza();
    String id;
    private final int mVersionCode;
    String name;
    int state;
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
    String zzbzv;
    String zzbzx;
    String zzbzy;
    String zzbzz;

    public final class zza {
        final /* synthetic */ CommonWalletObject zzbBj;

        private zza(CommonWalletObject commonWalletObject) {
            this.zzbBj = commonWalletObject;
        }

        public CommonWalletObject zzNn() {
            return this.zzbBj;
        }

        public zza zzhC(String str) {
            this.zzbBj.id = str;
            return this;
        }
    }

    CommonWalletObject() {
        this.mVersionCode = 1;
        this.zzbzC = zzb.zzuT();
        this.zzbzE = zzb.zzuT();
        this.zzbzH = zzb.zzuT();
        this.zzbzJ = zzb.zzuT();
        this.zzbzK = zzb.zzuT();
        this.zzbzL = zzb.zzuT();
    }

    CommonWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str9, String str10, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6) {
        this.mVersionCode = i;
        this.id = str;
        this.zzbzB = str2;
        this.name = str3;
        this.zzbzv = str4;
        this.zzbzx = str5;
        this.zzbzy = str6;
        this.zzbzz = str7;
        this.zzbzA = str8;
        this.state = i2;
        this.zzbzC = arrayList;
        this.zzbzD = timeInterval;
        this.zzbzE = arrayList2;
        this.zzbzF = str9;
        this.zzbzG = str10;
        this.zzbzH = arrayList3;
        this.zzbzI = z;
        this.zzbzJ = arrayList4;
        this.zzbzK = arrayList5;
        this.zzbzL = arrayList6;
    }

    public static zza zzNm() {
        CommonWalletObject commonWalletObject = new CommonWalletObject();
        commonWalletObject.getClass();
        return new zza();
    }

    public String getId() {
        return this.id;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
