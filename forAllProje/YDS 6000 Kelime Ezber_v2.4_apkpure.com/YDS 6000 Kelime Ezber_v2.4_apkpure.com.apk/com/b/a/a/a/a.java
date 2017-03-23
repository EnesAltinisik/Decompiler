package com.b.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

class a {
    private Context a;

    a(Context context) {
        this.a = context;
    }

    private SharedPreferences c() {
        return PreferenceManager.getDefaultSharedPreferences(a());
    }

    Context a() {
        return this.a;
    }

    boolean a(String str, Boolean bool) {
        SharedPreferences c = c();
        if (c == null) {
            return false;
        }
        Editor edit = c.edit();
        edit.putBoolean(str, bool.booleanValue());
        edit.commit();
        return true;
    }

    boolean a(String str, String str2) {
        SharedPreferences c = c();
        if (c == null) {
            return false;
        }
        Editor edit = c.edit();
        edit.putString(str, str2);
        edit.commit();
        return true;
    }

    boolean a(String str, boolean z) {
        SharedPreferences c = c();
        return c != null ? c.getBoolean(str, z) : z;
    }

    String b() {
        return a().getPackageName() + "_preferences";
    }

    String b(String str, String str2) {
        SharedPreferences c = c();
        return c != null ? c.getString(str, str2) : str2;
    }
}
