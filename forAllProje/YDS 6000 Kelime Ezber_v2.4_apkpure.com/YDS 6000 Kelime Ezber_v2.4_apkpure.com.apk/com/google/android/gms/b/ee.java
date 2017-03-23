package com.google.android.gms.b;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;

public class ee extends a {
    public static final Creator<ee> CREATOR = new ef();
    final int a;
    private final Account b;
    private final Scope[] c;
    private final String d;

    ee(int i, Account account, Scope[] scopeArr, String str) {
        this.a = i;
        this.b = account;
        this.c = scopeArr;
        this.d = str;
    }

    public Account a() {
        return this.b;
    }

    public Scope[] b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ef.a(this, parcel, i);
    }
}
