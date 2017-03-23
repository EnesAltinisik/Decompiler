package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@vz
public final class yj extends a {
    public static final Creator<yj> CREATOR = new yk();
    public final int a;
    public final String b;
    public final int c;

    public yj(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public yj(com.google.android.gms.ads.d.a aVar) {
        this(1, aVar.a(), aVar.b());
    }

    public yj(String str, int i) {
        this(1, str, i);
    }

    public static yj a(String str) {
        yj yjVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                yjVar = a(new JSONArray(str));
            } catch (JSONException e) {
            }
        }
        return yjVar;
    }

    public static yj a(JSONArray jSONArray) {
        return (jSONArray == null || jSONArray.length() == 0) ? null : new yj(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public JSONArray a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rb_type", this.b);
        jSONObject.put("rb_amount", this.c);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof yj)) {
            return false;
        }
        yj yjVar = (yj) obj;
        return b.a(this.b, yjVar.b) && b.a(Integer.valueOf(this.c), Integer.valueOf(yjVar.c));
    }

    public int hashCode() {
        return b.a(this.b, Integer.valueOf(this.c));
    }

    public void writeToParcel(Parcel parcel, int i) {
        yk.a(this, parcel, i);
    }
}
