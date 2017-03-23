package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.wk;
import com.google.android.gms.b.yu.a;
import com.google.android.gms.b.zy;

@vz
public class e {
    private final Context a;
    private final wk b;
    private boolean c;

    public e(Context context) {
        this(context, false);
    }

    public e(Context context, a aVar) {
        this.a = context;
        if (aVar == null || aVar.b.G == null) {
            this.b = new wk();
        } else {
            this.b = aVar.b.G;
        }
    }

    public e(Context context, boolean z) {
        this.a = context;
        this.b = new wk(z);
    }

    public void a() {
        this.c = true;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        zy.d("Action was blocked because no touch was detected.");
        if (this.b.b && this.b.c != null) {
            for (String str2 : this.b.c) {
                if (!TextUtils.isEmpty(str2)) {
                    v.e().a(this.a, "", str2.replace("{NAVIGATION_URL}", Uri.encode(str)));
                }
            }
        }
    }

    public boolean b() {
        return !this.b.b || this.c;
    }
}
