package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

@SuppressLint({"ParcelCreator"})
public class RadarEntry extends Entry {
    public RadarEntry(float f) {
        super(0.0f, f);
    }

    public RadarEntry(float f, Object obj) {
        super(0.0f, f, obj);
    }

    public RadarEntry copy() {
        return new RadarEntry(getY(), getData());
    }

    public float getValue() {
        return getY();
    }

    @Deprecated
    public float getX() {
        return super.getX();
    }

    @Deprecated
    public void setX(float f) {
        super.setX(f);
    }
}
