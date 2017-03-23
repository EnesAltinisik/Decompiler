package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@zzig
class w {
    final AdRequestParcel a;
    final String b;
    final int c;

    w(AdRequestParcel adRequestParcel, String str, int i) {
        this.a = adRequestParcel;
        this.b = str;
        this.c = i;
    }

    w(v vVar) {
        this(vVar.a(), vVar.c(), vVar.b());
    }

    w(String str) throws IOException {
        String[] split = str.split("\u0000");
        if (split.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel obtain = Parcel.obtain();
        try {
            this.b = new String(Base64.decode(split[0], 0), Constants.ENCODING);
            this.c = Integer.parseInt(split[1]);
            byte[] decode = Base64.decode(split[2], 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            this.a = (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        } catch (IllegalArgumentException e) {
            throw new IOException("Malformed QueueSeed encoding.");
        } catch (Throwable th) {
            obtain.recycle();
        }
    }

    String a() {
        String encodeToString;
        Parcel obtain = Parcel.obtain();
        try {
            encodeToString = Base64.encodeToString(this.b.getBytes(Constants.ENCODING), 0);
            String num = Integer.toString(this.c);
            this.a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            encodeToString = new StringBuilder(((String.valueOf(encodeToString).length() + 2) + String.valueOf(num).length()) + String.valueOf(encodeToString2).length()).append(encodeToString).append("\u0000").append(num).append("\u0000").append(encodeToString2).toString();
            return encodeToString;
        } catch (UnsupportedEncodingException e) {
            encodeToString = "QueueSeed encode failed because UTF-8 is not available.";
            zzb.e(encodeToString);
            return "";
        } finally {
            obtain.recycle();
        }
    }
}
