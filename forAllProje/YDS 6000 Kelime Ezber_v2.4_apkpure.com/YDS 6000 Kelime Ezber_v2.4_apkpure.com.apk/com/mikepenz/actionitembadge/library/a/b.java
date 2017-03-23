package com.mikepenz.actionitembadge.library.a;

public class b {
    private a a;
    private int b;
    private int c;
    private int d;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private int h = -65536;

    public enum a {
        DEFAULT(1),
        LARGE(2);
        
        private int c;

        private a(int i) {
            this.c = i;
        }
    }

    public b(a aVar, int i, int i2, int i3, int i4) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }
}
