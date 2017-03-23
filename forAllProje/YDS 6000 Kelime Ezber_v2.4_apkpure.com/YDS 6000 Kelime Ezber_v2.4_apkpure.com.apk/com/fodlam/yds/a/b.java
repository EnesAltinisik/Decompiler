package com.fodlam.yds.a;

import android.content.Context;
import android.support.v4.view.aa;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fodlam.yds.OxfordApplication.a;
import com.fodlam.yds.R;
import com.fodlam.yds.f.h;
import java.util.ArrayList;
import java.util.Iterator;

public class b extends aa {
    ArrayList<h> a = com.fodlam.yds.c.b.a().b().f();
    private Context b;
    private LayoutInflater c;

    public b(Context context) {
        this.b = context;
        this.c = LayoutInflater.from(context);
    }

    private int a(a aVar) {
        String c = aVar.c();
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            i = !hVar.b ? hVar.l.a(c) + i : i;
        }
        return i / 5;
    }

    public int a(Object obj) {
        return -2;
    }

    public Object a(ViewGroup viewGroup, int i) {
        View inflate = this.c.inflate(R.layout.horizantalpageritem, viewGroup, false);
        a aVar = a.values()[i];
        inflate.findViewById(R.id.cardView).setTag(aVar);
        ((TextView) inflate.findViewById(R.id.txt_item)).setText(aVar.a());
        ((ImageView) inflate.findViewById(R.id.img_item)).setImageResource(aVar.b());
        ImageView[] imageViewArr = new ImageView[]{(ImageView) inflate.findViewById(R.id.star1), (ImageView) inflate.findViewById(R.id.star2), (ImageView) inflate.findViewById(R.id.star3)};
        int a = a(aVar);
        for (int i2 = 0; i2 < a; i2++) {
            imageViewArr[i2].setAlpha(1.0f);
        }
        viewGroup.addView(inflate);
        inflate.setTag(aVar);
        return inflate;
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public boolean a(View view, Object obj) {
        int i = 0;
        if (view.equals(obj)) {
            int a = a((a) view.getTag());
            ImageView[] imageViewArr = new ImageView[]{(ImageView) view.findViewById(R.id.star1), (ImageView) view.findViewById(R.id.star2), (ImageView) view.findViewById(R.id.star3)};
            for (int i2 = 0; i2 < imageViewArr.length; i2++) {
                imageViewArr[i2].setAlpha(0.5f);
                imageViewArr[i2].setImageResource(R.drawable.ic_star_48px);
            }
            while (i < a) {
                imageViewArr[i].setAlpha(1.0f);
                imageViewArr[i].setImageResource(R.drawable.ic_star_black_24dp);
                i++;
            }
        }
        return view.equals(obj);
    }

    public int b() {
        return a.values().length;
    }
}
