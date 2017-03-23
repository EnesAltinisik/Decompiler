package com.google.android.gms.b;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

@vz
public final class nt {
    private long a;
    private Bundle b;
    private int c;
    private List<String> d;
    private boolean e;
    private int f;
    private boolean g;
    private String h;
    private pd i;
    private Location j;
    private String k;
    private Bundle l;
    private Bundle m;
    private List<String> n;
    private String o;
    private String p;
    private boolean q;

    public nt() {
        this.a = -1;
        this.b = new Bundle();
        this.c = -1;
        this.d = new ArrayList();
        this.e = false;
        this.f = -1;
        this.g = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = new Bundle();
        this.m = new Bundle();
        this.n = new ArrayList();
        this.o = null;
        this.p = null;
        this.q = false;
    }

    public nt(ns nsVar) {
        this.a = nsVar.b;
        this.b = nsVar.c;
        this.c = nsVar.d;
        this.d = nsVar.e;
        this.e = nsVar.f;
        this.f = nsVar.g;
        this.g = nsVar.h;
        this.h = nsVar.i;
        this.i = nsVar.j;
        this.j = nsVar.k;
        this.k = nsVar.l;
        this.l = nsVar.m;
        this.m = nsVar.n;
        this.n = nsVar.o;
        this.o = nsVar.p;
        this.p = nsVar.q;
    }

    public ns a() {
        return new ns(7, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, false);
    }

    public nt a(Location location) {
        this.j = location;
        return this;
    }
}
