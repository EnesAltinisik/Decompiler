package com.nightonke.boommenu.a;

public enum f {
    DEFAULT(0),
    REVERSE(1),
    RANDOM(2),
    Unknown(-1);
    
    private final int e;

    private f(int i) {
        this.e = i;
    }

    public static f a(int i) {
        return (i < 0 || i >= values().length) ? Unknown : values()[i];
    }
}
