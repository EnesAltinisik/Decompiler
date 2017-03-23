package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Map;

public final class b extends a {
    public static final Creator<b> CREATOR = new f();
    final int a;
    Bundle b;
    private Map<String, String> c;

    b(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    b(Bundle bundle) {
        this(1, bundle);
    }

    public Map<String, String> a() {
        if (this.c == null) {
            this.c = new android.support.v4.i.a();
            for (String str : this.b.keySet()) {
                Object obj = this.b.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!(str.startsWith("google.") || str.startsWith("gcm.") || str.equals("from") || str.equals("message_type") || str.equals("collapse_key"))) {
                        this.c.put(str, str2);
                    }
                }
            }
        }
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
