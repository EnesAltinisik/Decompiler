package com.fodlam.yds.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.fodlam.yds.R;
import com.fodlam.yds.utility.c;
import com.github.mikephil.charting.data.ChartData;

public class d extends c {
    float[] a;

    private static class a {
        TextView a;
        TextView b;
        TextView c;
        TextView d;

        private a() {
        }
    }

    public d(ChartData<?> chartData, float[] fArr) {
        super(chartData);
        this.a = fArr;
    }

    public int a() {
        return 3;
    }

    public View a(int i, View view, Context context) {
        a aVar;
        if (view == null) {
            a aVar2 = new a();
            view = LayoutInflater.from(context).inflate(R.layout.list_item_generalstatitem, null);
            aVar2.a = (TextView) view.findViewById(R.id.todaysLearningWord);
            aVar2.b = (TextView) view.findViewById(R.id.averageDuration);
            aVar2.c = (TextView) view.findViewById(R.id.totalLearningWord);
            aVar2.d = (TextView) view.findViewById(R.id.totalDuration);
            view.setTag(aVar2);
            aVar = aVar2;
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a.setText(((int) this.a[0]) + "");
        aVar.b.setText(c.a(this.a[1]));
        aVar.c.setText(((int) this.a[2]) + "");
        aVar.d.setText(c.a(this.a[3]));
        return view;
    }
}
