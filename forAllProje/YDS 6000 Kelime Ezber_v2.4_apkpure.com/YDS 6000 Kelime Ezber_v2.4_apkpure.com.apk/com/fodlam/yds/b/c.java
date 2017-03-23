package com.fodlam.yds.b;

import android.content.Context;
import android.view.View;
import com.github.mikephil.charting.data.ChartData;

public abstract class c {
    protected ChartData<?> b;

    public c(ChartData<?> chartData) {
        this.b = chartData;
    }

    public abstract int a();

    public abstract View a(int i, View view, Context context);
}
