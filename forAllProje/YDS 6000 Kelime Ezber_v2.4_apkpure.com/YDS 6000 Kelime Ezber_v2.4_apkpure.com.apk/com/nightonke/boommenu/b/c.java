package com.nightonke.boommenu.b;

public enum c {
    Center(0),
    Top(1),
    Bottom(2),
    Left(3),
    Right(4),
    TL(5),
    TR(6),
    BL(7),
    BR(8),
    Unknown(-1);
    
    private final int k;

    private c(int i) {
        this.k = i;
    }

    public static c a(int i) {
        return (i < 0 || i >= values().length) ? Unknown : values()[i];
    }
}
