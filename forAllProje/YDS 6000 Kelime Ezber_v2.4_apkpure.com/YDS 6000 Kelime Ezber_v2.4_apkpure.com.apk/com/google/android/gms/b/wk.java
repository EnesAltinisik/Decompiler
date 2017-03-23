package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@vz
public final class wk extends a {
    public static final Creator<wk> CREATOR = new wl();
    public final int a;
    public final boolean b;
    public final List<String> c;

    public wk() {
        this(1, false, Collections.emptyList());
    }

    public wk(int i, boolean z, List<String> list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    public wk(boolean z) {
        this(1, z, Collections.emptyList());
    }

    public wk(boolean z, List<String> list) {
        this(1, z, list);
    }

    public static wk a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new wk();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        List arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (Throwable e) {
                    zy.c("Error grabbing url from json.", e);
                }
            }
        }
        return new wk(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        wl.a(this, parcel, i);
    }
}
