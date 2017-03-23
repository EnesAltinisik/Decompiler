package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;
import java.util.List;

public class MPPointD extends Poolable {
    private static ObjectPool<MPPointD> pool = ObjectPool.create(64, new MPPointD(0.0d, 0.0d));
    public double x;
    public double y;

    static {
        pool.setReplenishPercentage(0.5f);
    }

    private MPPointD(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public static MPPointD getInstance(double d, double d2) {
        MPPointD mPPointD = (MPPointD) pool.get();
        mPPointD.x = d;
        mPPointD.y = d2;
        return mPPointD;
    }

    public static void recycleInstance(MPPointD mPPointD) {
        pool.recycle((Poolable) mPPointD);
    }

    public static void recycleInstances(List<MPPointD> list) {
        pool.recycle((List) list);
    }

    protected Poolable instantiate() {
        return new MPPointD(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.x + ", y: " + this.y;
    }
}
