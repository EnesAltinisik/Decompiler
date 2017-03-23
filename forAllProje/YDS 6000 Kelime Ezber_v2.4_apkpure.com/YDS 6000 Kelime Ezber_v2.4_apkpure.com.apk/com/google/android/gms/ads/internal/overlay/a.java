package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.ze;
import com.google.android.gms.b.zy;

@vz
public class a {
    public boolean a(Context context, Intent intent, s sVar) {
        try {
            String str = "Launching an intent: ";
            String valueOf = String.valueOf(intent.toURI());
            ze.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            v.e().a(context, intent);
            if (sVar != null) {
                sVar.f();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zy.e(e.getMessage());
            return false;
        }
    }

    public boolean a(Context context, e eVar, s sVar) {
        if (eVar == null) {
            zy.e("No intent data for launcher overlay.");
            return false;
        } else if (eVar.i != null) {
            return a(context, eVar.i, sVar);
        } else {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(eVar.c)) {
                zy.e("Open GMSG did not contain a URL.");
                return false;
            }
            if (TextUtils.isEmpty(eVar.d)) {
                intent.setData(Uri.parse(eVar.c));
            } else {
                intent.setDataAndType(Uri.parse(eVar.c), eVar.d);
            }
            intent.setAction("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(eVar.e)) {
                intent.setPackage(eVar.e);
            }
            if (!TextUtils.isEmpty(eVar.f)) {
                String[] split = eVar.f.split("/", 2);
                if (split.length < 2) {
                    String str = "Could not parse component name from open GMSG: ";
                    String valueOf = String.valueOf(eVar.f);
                    zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return false;
                }
                intent.setClassName(split[0], split[1]);
            }
            Object obj = eVar.g;
            if (!TextUtils.isEmpty(obj)) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(obj);
                } catch (NumberFormatException e) {
                    zy.e("Could not parse intent flags.");
                    parseInt = 0;
                }
                intent.addFlags(parseInt);
            }
            return a(context, intent, sVar);
        }
    }
}
