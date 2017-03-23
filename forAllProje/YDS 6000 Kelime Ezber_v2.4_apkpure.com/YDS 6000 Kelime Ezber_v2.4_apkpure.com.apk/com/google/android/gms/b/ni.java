package com.google.android.gms.b;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

@vz
public class ni extends a {
    public static final Creator<ni> CREATOR = new nj();
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;
    public final boolean h;

    ni(int i, String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        if (str2 == null) {
            str2 = "";
        }
        this.d = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.e = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.g = bundle;
        this.h = z;
    }

    public static ni a(Uri uri) {
        Throwable e;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                zy.e("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String queryParameter22 : v.g().a(uri)) {
                if (queryParameter22.startsWith("tag.")) {
                    bundle.putString(queryParameter22.substring("tag.".length()), uri.getQueryParameter(queryParameter22));
                }
            }
            return new ni(1, queryParameter, parseLong, host, str, str2, bundle, equals);
        } catch (NullPointerException e2) {
            e = e2;
            zy.c("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e3) {
            e = e3;
            zy.c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public static ni a(String str) {
        return a(Uri.parse(str));
    }

    public void writeToParcel(Parcel parcel, int i) {
        nj.a(this, parcel, i);
    }
}
