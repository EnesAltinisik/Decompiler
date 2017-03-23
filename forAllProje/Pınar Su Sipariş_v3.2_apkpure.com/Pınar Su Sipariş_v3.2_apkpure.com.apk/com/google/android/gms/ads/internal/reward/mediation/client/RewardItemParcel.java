package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public final class RewardItemParcel extends AbstractSafeParcelable {
    public static final zzc CREATOR = new zzc();
    public final String type;
    public final int versionCode;
    public final int zzOV;

    public RewardItemParcel(int i, String str, int i2) {
        this.versionCode = i;
        this.type = str;
        this.zzOV = i2;
    }

    public RewardItemParcel(RewardItem rewardItem) {
        this(1, rewardItem.getType(), rewardItem.getAmount());
    }

    public RewardItemParcel(String str, int i) {
        this(1, str, i);
    }

    public static RewardItemParcel zza(JSONArray jSONArray) throws JSONException {
        return (jSONArray == null || jSONArray.length() == 0) ? null : new RewardItemParcel(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public static RewardItemParcel zzaG(String str) {
        RewardItemParcel rewardItemParcel = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                rewardItemParcel = zza(new JSONArray(str));
            } catch (JSONException e) {
            }
        }
        return rewardItemParcel;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RewardItemParcel)) {
            return false;
        }
        RewardItemParcel rewardItemParcel = (RewardItemParcel) obj;
        return zzz.equal(this.type, rewardItemParcel.type) && zzz.equal(Integer.valueOf(this.zzOV), Integer.valueOf(rewardItemParcel.zzOV));
    }

    public int hashCode() {
        return zzz.hashCode(this.type, Integer.valueOf(this.zzOV));
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public JSONArray zzir() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rb_type", this.type);
        jSONObject.put("rb_amount", this.zzOV);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return jSONArray;
    }
}
