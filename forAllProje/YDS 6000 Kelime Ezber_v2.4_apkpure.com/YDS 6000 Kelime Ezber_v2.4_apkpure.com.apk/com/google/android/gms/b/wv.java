package com.google.android.gms.b;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.b.xi.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@vz
public class wv {
    public Bundle a;
    public Bundle b;
    public List<String> c = new ArrayList();
    public Location d;
    public a e;
    public String f;
    public String g;
    public wf h;
    public xe i;
    public JSONObject j = new JSONObject();

    public wv a(Location location) {
        this.d = location;
        return this;
    }

    public wv a(Bundle bundle) {
        this.b = bundle;
        return this;
    }

    public wv a(wf wfVar) {
        this.h = wfVar;
        return this;
    }

    public wv a(xe xeVar) {
        this.i = xeVar;
        return this;
    }

    public wv a(a aVar) {
        this.e = aVar;
        return this;
    }

    public wv a(String str) {
        this.g = str;
        return this;
    }

    public wv a(List<String> list) {
        if (list == null) {
            this.c.clear();
        }
        this.c = list;
        return this;
    }

    public wv a(JSONObject jSONObject) {
        this.j = jSONObject;
        return this;
    }

    public wv b(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    public wv b(String str) {
        this.f = str;
        return this;
    }
}
