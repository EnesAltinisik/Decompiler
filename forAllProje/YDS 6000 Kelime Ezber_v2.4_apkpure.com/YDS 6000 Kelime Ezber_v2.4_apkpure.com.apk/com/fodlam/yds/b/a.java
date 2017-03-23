package com.fodlam.yds.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.fodlam.yds.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.XAxis.XAxisPosition;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.ChartData;

public class a extends c {
    boolean a;

    private static class a {
        BarChart a;

        private a() {
        }
    }

    public a(ChartData<?> chartData, Context context, boolean z) {
        super(chartData);
        this.a = z;
    }

    public int a() {
        return 0;
    }

    public View a(int i, View view, Context context) {
        a aVar;
        if (view == null) {
            aVar = new a();
            view = LayoutInflater.from(context).inflate(R.layout.list_item_barchart, null);
            aVar.a = (BarChart) view.findViewById(R.id.chart);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a.getDescription().setEnabled(false);
        aVar.a.setDrawGridBackground(false);
        aVar.a.setDrawBarShadow(false);
        aVar.a.setExtraBottomOffset(20.0f);
        aVar.a.getLegend().setTextSize(12.0f);
        XAxis xAxis = aVar.a.getXAxis();
        xAxis.setPosition(XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawLabels(this.a);
        YAxis axisLeft = aVar.a.getAxisLeft();
        axisLeft.setLabelCount(5, false);
        axisLeft.setSpaceTop(20.0f);
        if (!this.a) {
            axisLeft.setAxisMaximum(100.0f);
            aVar.a.getAxisRight().setAxisMaximum(100.0f);
        }
        axisLeft.setAxisMinimum(0.0f);
        axisLeft = aVar.a.getAxisRight();
        axisLeft.setLabelCount(5, false);
        axisLeft.setSpaceTop(20.0f);
        axisLeft.setAxisMinimum(0.0f);
        aVar.a.setData((BarData) this.b);
        aVar.a.setFitBars(true);
        aVar.a.animateY(700);
        return view;
    }
}
