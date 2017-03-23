package com.fodlam.yds;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.b.l;
import android.support.v4.b.q;
import android.support.v4.b.u;
import android.support.v4.view.ViewPager;
import android.support.v7.app.e;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.fodlam.yds.b.d;
import com.fodlam.yds.utility.c;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatisticActivity extends e {
    Toolbar m;
    TabLayout n;
    private b o;
    private ViewPager p;

    public static class a extends l {
        private PieData a(float f, float f2, String str, String str2, int i) {
            List arrayList = new ArrayList();
            arrayList.add(new PieEntry(f, str));
            arrayList.add(new PieEntry(f2, str2));
            PieDataSet pieDataSet = new PieDataSet(arrayList, null);
            pieDataSet.setSliceSpace(3.0f);
            pieDataSet.setSelectionShift(5.0f);
            if (i == 0) {
                pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
            } else if (i == 1) {
                pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
            } else if (i == 2) {
                pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
            }
            PieData pieData = new PieData(pieDataSet);
            pieData.setValueFormatter(new PercentFormatter());
            pieData.setValueTextSize(11.0f);
            pieData.setValueTextColor(-16777216);
            return pieData;
        }

        public static a d(int i) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putInt("section_number", i);
            aVar.g(bundle);
            return aVar;
        }

        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(R.layout.activity_listview_chart, viewGroup, false);
            ListView listView = (ListView) inflate.findViewById(R.id.listView1);
            com.fodlam.yds.c.a a = com.fodlam.yds.c.a.a(null);
            com.fodlam.yds.c.b a2 = com.fodlam.yds.c.b.a();
            List arrayList;
            BarDataSet barDataSet;
            List arrayList2;
            ChartData barData;
            if (g().getInt("section_number") == 1) {
                int i;
                List arrayList3 = new ArrayList();
                float b = a.b(c.a(new Date()));
                arrayList3.add(new com.fodlam.yds.b.e(a((int) R.string.todaysanswer), a(b == -1.0f ? 0.0f : 100.0f * b, b == -1.0f ? 0.0f : 100.0f * (1.0f - b), a((int) R.string.correctanswer), a((int) R.string.wronganswer), 1), i()));
                arrayList3.add(new d(null, a.g()));
                float[] a3 = a.a(30);
                arrayList = new ArrayList();
                for (i = 0; i < a3.length; i++) {
                    arrayList.add(new BarEntry((float) i, a3[i]));
                }
                barDataSet = new BarDataSet(arrayList, a((int) R.string.last30dayslearnedwordcount));
                barDataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
                barDataSet.setBarShadowColor(Color.rgb(203, 203, 203));
                barDataSet.setDrawValues(false);
                arrayList2 = new ArrayList();
                arrayList2.add(barDataSet);
                barData = new BarData(arrayList2);
                barData.setBarWidth(0.9f);
                arrayList3.add(new com.fodlam.yds.b.a(barData, h(), true));
                a3 = a.b(30);
                arrayList = new ArrayList();
                for (i = 0; i < a3.length; i++) {
                    arrayList.add(new BarEntry((float) i, a3[i]));
                }
                barDataSet = new BarDataSet(arrayList, a((int) R.string.last30daystudyduration));
                barDataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
                barDataSet.setBarShadowColor(Color.rgb(203, 203, 203));
                barDataSet.setDrawValues(false);
                arrayList2 = new ArrayList();
                arrayList2.add(barDataSet);
                barData = new BarData(arrayList2);
                barData.setBarWidth(0.9f);
                arrayList3.add(new com.fodlam.yds.b.a(barData, h(), true));
                listView.setAdapter(new com.fodlam.yds.b.b(i(), arrayList3));
            } else if (g().getInt("section_number") == 2) {
                com.fodlam.yds.f.b c = a2.c(0);
                com.fodlam.yds.f.b c2 = a2.c(1);
                com.fodlam.yds.f.b c3 = a2.c(2);
                List arrayList4 = new ArrayList();
                float h = (100.0f * ((float) c.h())) / ((float) c.a());
                arrayList4.add(new com.fodlam.yds.b.e(c.a + a((int) R.string.level), a(h, 100.0f - h, a((int) R.string.learnedwords), a((int) R.string.remainingwords), 0), i()));
                h = (100.0f * ((float) c2.h())) / ((float) c2.a());
                arrayList4.add(new com.fodlam.yds.b.e(c2.a + a((int) R.string.level), a(h, 100.0f - h, a((int) R.string.learnedwords), a((int) R.string.remainingwords), 1), i()));
                h = (100.0f * ((float) c3.h())) / ((float) c3.a());
                arrayList4.add(new com.fodlam.yds.b.e(c3.a + a((int) R.string.level), a(h, 100.0f - h, a((int) R.string.learnedwords), a((int) R.string.remainingwords), 2), i()));
                listView.setAdapter(new com.fodlam.yds.b.b(i(), arrayList4));
            } else if (g().getInt("section_number") == 3) {
                float[] h2 = a.h();
                arrayList2 = new ArrayList();
                arrayList = new ArrayList();
                arrayList.add(new BarEntry(1.0f, h2[0]));
                BarDataSet barDataSet2 = new BarDataSet(arrayList, a((int) R.string.reading));
                barDataSet2.setColors(ColorTemplate.VORDIPLOM_COLORS);
                barDataSet2.setBarShadowColor(Color.rgb(203, 203, 203));
                barDataSet2.setDrawValues(false);
                arrayList = new ArrayList();
                arrayList.add(barDataSet2);
                List arrayList5 = new ArrayList();
                arrayList5.add(new BarEntry(2.0f, h2[1]));
                BarDataSet barDataSet3 = new BarDataSet(arrayList5, a((int) R.string.listening));
                barDataSet3.setColors(ColorTemplate.COLORFUL_COLORS);
                barDataSet3.setBarShadowColor(Color.rgb(203, 203, 203));
                barDataSet3.setDrawValues(false);
                arrayList.add(barDataSet3);
                arrayList5 = new ArrayList();
                arrayList5.add(new BarEntry(3.0f, h2[2]));
                barDataSet3 = new BarDataSet(arrayList5, a((int) R.string.translate));
                barDataSet3.setColors(ColorTemplate.MATERIAL_COLORS);
                barDataSet3.setBarShadowColor(Color.rgb(203, 203, 203));
                barDataSet3.setDrawValues(false);
                arrayList.add(barDataSet3);
                arrayList5 = new ArrayList();
                arrayList5.add(new BarEntry(4.0f, h2[3]));
                barDataSet = new BarDataSet(arrayList5, a((int) R.string.writing));
                barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
                barDataSet.setBarShadowColor(Color.rgb(203, 203, 203));
                barDataSet.setDrawValues(false);
                arrayList.add(barDataSet);
                new BarData(arrayList).setBarWidth(0.9f);
                barData = new BarData(arrayList);
                barData.setBarWidth(0.9f);
                arrayList2.add(new com.fodlam.yds.b.a(barData, h(), false));
                listView.setAdapter(new com.fodlam.yds.b.b(i(), arrayList2));
            }
            return inflate;
        }
    }

    public class b extends u {
        final /* synthetic */ StatisticActivity a;

        public b(StatisticActivity statisticActivity, q qVar) {
            this.a = statisticActivity;
            super(qVar);
        }

        public l a(int i) {
            return a.d(i + 1);
        }

        public int b() {
            return 3;
        }

        public CharSequence c(int i) {
            switch (i) {
                case 0:
                    return this.a.getString(R.string.generalstatistic);
                case 1:
                    return this.a.getString(R.string.finishedcategories);
                case 2:
                    return this.a.getString(R.string.yourability);
                default:
                    return null;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_statistic);
        this.m = (Toolbar) findViewById(R.id.toolbar);
        a(this.m);
        this.o = new b(this, e());
        this.p = (ViewPager) findViewById(R.id.container);
        this.p.setAdapter(this.o);
        this.n = (TabLayout) findViewById(R.id.tabs);
        this.n.setupWithViewPager(this.p);
        Utils.init((Context) this);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.n = null;
        this.m = null;
    }
}
