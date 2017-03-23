package com.google.android.gms.common.api;

import android.support.v4.i.a;
import android.text.TextUtils;
import com.google.android.gms.b.acb;
import java.util.ArrayList;

public class m extends Exception {
    private final a<acb<?>, com.google.android.gms.common.a> a;

    public m(a<acb<?>, com.google.android.gms.common.a> aVar) {
        this.a = aVar;
    }

    public a<acb<?>, com.google.android.gms.common.a> a() {
        return this.a;
    }

    public String getMessage() {
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (acb com_google_android_gms_b_acb : this.a.keySet()) {
            com.google.android.gms.common.a aVar = (com.google.android.gms.common.a) this.a.get(com_google_android_gms_b_acb);
            if (aVar.b()) {
                obj = null;
            }
            String valueOf = String.valueOf(com_google_android_gms_b_acb.a());
            String valueOf2 = String.valueOf(aVar);
            arrayList.add(new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(": ").append(valueOf2).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (obj != null) {
            stringBuilder.append("None of the queried APIs are available. ");
        } else {
            stringBuilder.append("Some of the queried APIs are unavailable. ");
        }
        stringBuilder.append(TextUtils.join("; ", arrayList));
        return stringBuilder.toString();
    }
}
