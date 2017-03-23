package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.k;
import java.util.Collection;

public class s extends a {
    public static final Creator<s> CREATOR = new t();
    final int a;
    final int b;
    int c;
    String d;
    IBinder e;
    Scope[] f;
    Bundle g;
    Account h;
    long i;

    public s(int i) {
        this.a = 3;
        this.c = k.b;
        this.b = i;
    }

    s(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            this.h = a(iBinder);
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = j;
    }

    private Account a(IBinder iBinder) {
        return iBinder != null ? a.a(z.a.a(iBinder)) : null;
    }

    public s a(Account account) {
        this.h = account;
        return this;
    }

    public s a(Bundle bundle) {
        this.g = bundle;
        return this;
    }

    public s a(z zVar) {
        if (zVar != null) {
            this.e = zVar.asBinder();
        }
        return this;
    }

    public s a(String str) {
        this.d = str;
        return this;
    }

    public s a(Collection<Scope> collection) {
        this.f = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
