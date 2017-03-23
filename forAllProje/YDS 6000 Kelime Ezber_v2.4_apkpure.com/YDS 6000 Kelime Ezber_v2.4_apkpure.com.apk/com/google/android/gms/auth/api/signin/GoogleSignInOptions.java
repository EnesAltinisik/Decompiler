package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.a.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInOptions extends com.google.android.gms.common.internal.safeparcel.a implements d, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new b();
    public static final Scope a = new Scope("profile");
    public static final Scope b = new Scope("email");
    public static final Scope c = new Scope("openid");
    public static final GoogleSignInOptions d = new a().a().b().c();
    private static Comparator<Scope> m = new Comparator<Scope>() {
        public int a(Scope scope, Scope scope2) {
            return scope.a().compareTo(scope2.a());
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((Scope) obj, (Scope) obj2);
        }
    };
    final int e;
    private final ArrayList<Scope> f;
    private Account g;
    private boolean h;
    private final boolean i;
    private final boolean j;
    private String k;
    private String l;

    public static final class a {
        private Set<Scope> a = new HashSet();
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;

        public a a() {
            this.a.add(GoogleSignInOptions.c);
            return this;
        }

        public a b() {
            this.a.add(GoogleSignInOptions.a);
            return this;
        }

        public GoogleSignInOptions c() {
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                a();
            }
            return new GoogleSignInOptions(this.a, this.f, this.d, this.b, this.c, this.e, this.g);
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.e = i;
        this.f = arrayList;
        this.g = account;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = str;
        this.l = str2;
    }

    private GoogleSignInOptions(Set<Scope> set, Account account, boolean z, boolean z2, boolean z3, String str, String str2) {
        this(2, new ArrayList(set), account, z, z2, z3, str, str2);
    }

    public static GoogleSignInOptions a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Set hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        Object optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(hashSet, !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null));
    }

    public ArrayList<Scope> a() {
        return new ArrayList(this.f);
    }

    public Account b() {
        return this.g;
    }

    public boolean c() {
        return this.h;
    }

    public boolean d() {
        return this.i;
    }

    public boolean e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f.size() != googleSignInOptions.a().size() || !this.f.containsAll(googleSignInOptions.a())) {
                return false;
            }
            if (this.g == null) {
                if (googleSignInOptions.b() != null) {
                    return false;
                }
            } else if (!this.g.equals(googleSignInOptions.b())) {
                return false;
            }
            if (TextUtils.isEmpty(this.k)) {
                if (!TextUtils.isEmpty(googleSignInOptions.f())) {
                    return false;
                }
            } else if (!this.k.equals(googleSignInOptions.f())) {
                return false;
            }
            return this.j == googleSignInOptions.e() && this.h == googleSignInOptions.c() && this.i == googleSignInOptions.d();
        } catch (ClassCastException e) {
            return false;
        }
    }

    public String f() {
        return this.k;
    }

    public String g() {
        return this.l;
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            arrayList.add(((Scope) it.next()).a());
        }
        Collections.sort(arrayList);
        return new com.google.android.gms.auth.api.signin.a.a().a(arrayList).a(this.g).a(this.k).a(this.j).a(this.h).a(this.i).a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
