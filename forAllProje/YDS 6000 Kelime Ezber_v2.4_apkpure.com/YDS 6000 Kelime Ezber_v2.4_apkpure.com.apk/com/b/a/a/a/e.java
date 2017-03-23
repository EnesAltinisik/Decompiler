package com.b.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.Date;
import org.json.JSONObject;

public class e implements Parcelable {
    public static final Creator<e> CREATOR = new Creator<e>() {
        public e a(Parcel parcel) {
            return new e(parcel);
        }

        public e[] a(int i) {
            return new e[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    public final String a;
    public final String b;
    public final d c = a();

    protected e(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Deprecated
    public d a() {
        try {
            JSONObject jSONObject = new JSONObject(this.a);
            d dVar = new d();
            dVar.a = jSONObject.optString("orderId");
            dVar.b = jSONObject.optString("packageName");
            dVar.c = jSONObject.optString("productId");
            long optLong = jSONObject.optLong("purchaseTime", 0);
            dVar.d = optLong != 0 ? new Date(optLong) : null;
            dVar.e = f.values()[jSONObject.optInt("purchaseState", 1)];
            dVar.f = jSONObject.optString("developerPayload");
            dVar.g = jSONObject.getString("purchaseToken");
            dVar.h = jSONObject.optBoolean("autoRenewing");
            return dVar;
        } catch (Throwable e) {
            Log.e("iabv3.purchaseInfo", "Failed to parse response data", e);
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
