package com.fodlam.yds.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.fodlam.yds.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment;
import com.github.mikephil.charting.components.Legend.LegendVerticalAlignment;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.formatter.PercentFormatter;

public class e extends c {
    private String a;

    private static class a {
        PieChart a;

        private a() {
        }
    }

    public e(String str, ChartData<?> chartData, Context context) {
        super(chartData);
        this.a = str;
    }

    public int a() {
        return 2;
    }

    public View a(int i, View view, Context context) {
        a aVar;
        if (view == null) {
            aVar = new a();
            view = LayoutInflater.from(context).inflate(R.layout.list_item_piechart, null);
            aVar.a = (PieChart) view.findViewById(R.id.chart);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a.setExtraOffsets(0.0f, 0.0f, 0.0f, 15.0f);
        aVar.a.getDescription().setEnabled(false);
        aVar.a.setHoleRadius(52.0f);
        aVar.a.setTransparentCircleRadius(57.0f);
        aVar.a.setCenterText(this.a);
        aVar.a.setCenterTextColor(-16777216);
        aVar.a.setCenterTextSize(16.0f);
        aVar.a.setUsePercentValues(true);
        aVar.a.setDrawEntryLabels(false);
        this.b.setValueFormatter(new PercentFormatter());
        this.b.setValueTextSize(12.0f);
        this.b.setValueTextColor(-16777216);
        aVar.a.setData((PieData) this.b);
        Legend legend = aVar.a.getLegend();
        legend.setVerticalAlignment(LegendVerticalAlignment.TOP);
        legend.setHorizontalAlignment(LegendHorizontalAlignment.CENTER);
        legend.setTextSize(16.0f);
        legend.setYEntrySpace(0.0f);
        legend.setYOffset(0.0f);
        aVar.a.animateY(900);
        aVar.a.invalidate();
        return view;
    }
}
