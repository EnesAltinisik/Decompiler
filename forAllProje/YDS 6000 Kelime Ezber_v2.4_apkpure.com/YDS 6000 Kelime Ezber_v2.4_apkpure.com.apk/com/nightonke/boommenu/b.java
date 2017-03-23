package com.nightonke.boommenu;

public enum b {
    SimpleCircle(0),
    TextInsideCircle(1),
    TextOutsideCircle(2),
    Ham(3),
    Unknown(-1);
    
    private final int f;

    private b(int i) {
        this.f = i;
    }

    public static b a(int i) {
        return (i < 0 || i > values().length) ? Unknown : values()[i];
    }
}
