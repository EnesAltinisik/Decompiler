package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

public class BarBuffer extends AbstractBuffer<IBarDataSet> {
    protected float mBarWidth = 1.0f;
    protected boolean mContainsStacks = false;
    protected int mDataSetCount = 1;
    protected int mDataSetIndex = 0;
    protected boolean mInverted = false;

    public BarBuffer(int i, int i2, boolean z) {
        super(i);
        this.mDataSetCount = i2;
        this.mContainsStacks = z;
    }

    protected void addBar(float f, float f2, float f3, float f4) {
        float[] fArr = this.buffer;
        int i = this.index;
        this.index = i + 1;
        fArr[i] = f;
        fArr = this.buffer;
        i = this.index;
        this.index = i + 1;
        fArr[i] = f2;
        fArr = this.buffer;
        i = this.index;
        this.index = i + 1;
        fArr[i] = f3;
        fArr = this.buffer;
        i = this.index;
        this.index = i + 1;
        fArr[i] = f4;
    }

    public void feed(IBarDataSet iBarDataSet) {
        float entryCount = ((float) iBarDataSet.getEntryCount()) * this.phaseX;
        float f = this.mBarWidth / 2.0f;
        for (int i = 0; ((float) i) < entryCount; i++) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
            if (barEntry != null) {
                float x = barEntry.getX();
                float y = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                float f2;
                float f3;
                float f4;
                if (!this.mContainsStacks || yVals == null) {
                    float f5;
                    f2 = x - f;
                    f3 = x + f;
                    if (this.mInverted) {
                        f4 = y >= 0.0f ? y : 0.0f;
                        f5 = y <= 0.0f ? y : 0.0f;
                        y = f4;
                    } else {
                        f5 = y >= 0.0f ? y : 0.0f;
                        if (y > 0.0f) {
                            y = 0.0f;
                        }
                    }
                    if (f5 > 0.0f) {
                        f5 *= this.phaseY;
                    } else {
                        y *= this.phaseY;
                    }
                    addBar(f2, f5, f3, y);
                } else {
                    f4 = 0.0f;
                    y = -barEntry.getNegativeSum();
                    for (float f32 : yVals) {
                        if (f32 >= 0.0f) {
                            f2 = f4 + f32;
                            f32 = f4;
                            f4 = f2;
                        } else {
                            f2 = Math.abs(f32) + y;
                            float abs = Math.abs(f32) + y;
                            f32 = y;
                            y = abs;
                        }
                        float f6 = x - f;
                        float f7 = x + f;
                        float f8;
                        if (this.mInverted) {
                            f8 = f32 >= f2 ? f32 : f2;
                            if (f32 > f2) {
                                f32 = f2;
                            }
                            f2 = f8;
                        } else {
                            f8 = f32 >= f2 ? f32 : f2;
                            if (f32 > f2) {
                                f32 = f2;
                            }
                            f2 = f32;
                            f32 = f8;
                        }
                        addBar(f6, f32 * this.phaseY, f7, f2 * this.phaseY);
                    }
                }
            }
        }
        reset();
    }

    public void setBarWidth(float f) {
        this.mBarWidth = f;
    }

    public void setDataSet(int i) {
        this.mDataSetIndex = i;
    }

    public void setInverted(boolean z) {
        this.mInverted = z;
    }
}
