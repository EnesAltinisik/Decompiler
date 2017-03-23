package com.nightonke.boommenu.a;

public enum b {
    LINE(0),
    PARABOLA_1(1),
    PARABOLA_2(2),
    PARABOLA_3(3),
    PARABOLA_4(4),
    HORIZONTAL_THROW_1(5),
    HORIZONTAL_THROW_2(6),
    RANDOM(7),
    Unknown(-1);
    
    private final int j;

    private b(int i) {
        this.j = i;
    }

    public static b a(int i) {
        return (i < 0 || i >= values().length) ? Unknown : values()[i];
    }

    public int a() {
        return this.j;
    }
}
