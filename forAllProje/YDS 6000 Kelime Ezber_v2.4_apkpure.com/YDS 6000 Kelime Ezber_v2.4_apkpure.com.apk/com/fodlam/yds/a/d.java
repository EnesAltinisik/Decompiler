package com.fodlam.yds.a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.b.l;
import android.support.v4.b.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fodlam.yds.MultipleChoiceActivity;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.f.h;
import com.fodlam.yds.utility.b;
import com.fodlam.yds.utility.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class d extends w {
    public ArrayList<com.fodlam.yds.f.d> a = new ArrayList();
    MultipleChoiceActivity b;

    public static class a extends l {
        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            com.fodlam.yds.f.d dVar = (com.fodlam.yds.f.d) g().getSerializable("question");
            if (dVar.c) {
                ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.advertisementitem, viewGroup, false);
                c.a(i(), (LinearLayout) viewGroup2.findViewById(R.id.advertisement), 400, 400);
                ((TextView) viewGroup2.findViewById(R.id.title_item)).setText(R.string.adds);
                return viewGroup2;
            }
            View view = (ViewGroup) layoutInflater.inflate(R.layout.multiplechoiceitem, viewGroup, false);
            View view2 = (TextView) view.findViewById(R.id.title_item);
            view2.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (OxfordApplication.h != com.fodlam.yds.OxfordApplication.a.FINDWORD) {
                        b.a(this.a.i().getApplicationContext()).b(((h) view.getTag()).h);
                    }
                }
            });
            view2.setTag(dVar.a());
            com.balysv.materialripple.a.a(view2).a(Color.parseColor("#BBDEFB")).a(0.3f).b(true).a();
            if (dVar.a().l.a(OxfordApplication.h.c()) == 1) {
                view.findViewById(R.id.isdone).setVisibility(0);
            } else {
                view.findViewById(R.id.isdone).setVisibility(4);
            }
            if (OxfordApplication.h == com.fodlam.yds.OxfordApplication.a.FINDWORD) {
                view.findViewById(R.id.sound).setVisibility(4);
            }
            view2.setText(dVar.b());
            TextView[] textViewArr = new TextView[]{(TextView) view.findViewById(R.id.txt_item1), (TextView) view.findViewById(R.id.txt_item2), (TextView) view.findViewById(R.id.txt_item3), (TextView) view.findViewById(R.id.txt_item4)};
            for (int i = 0; i < 4; i++) {
                textViewArr[i].setTag(dVar.a(i));
                textViewArr[i].setText(dVar.b(i));
                if (dVar.e[i]) {
                    if (dVar.b == i) {
                        textViewArr[i].setBackgroundColor(Color.argb(255, 122, 178, 147));
                    } else {
                        textViewArr[i].setBackgroundColor(Color.argb(200, 244, 102, 151));
                    }
                    textViewArr[i].setEnabled(false);
                }
            }
            return view;
        }
    }

    public d(MultipleChoiceActivity multipleChoiceActivity, ArrayList<com.fodlam.yds.f.d> arrayList) {
        super(multipleChoiceActivity.e());
        this.b = multipleChoiceActivity;
        this.a = arrayList;
    }

    public l a(int i) {
        Bundle bundle = new Bundle();
        l aVar = new a();
        bundle.putSerializable("question", (Serializable) this.a.get(i));
        aVar.g(bundle);
        return aVar;
    }

    public boolean a(h hVar, int i) {
        return ((com.fodlam.yds.f.d) this.a.get(i)).a(hVar);
    }

    public int b() {
        return this.a.size();
    }

    public boolean b(int i) {
        return ((com.fodlam.yds.f.d) this.a.get(i)).d;
    }

    public int c() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.fodlam.yds.f.d dVar = (com.fodlam.yds.f.d) it.next();
            i = !dVar.c ? dVar.a().l.a(OxfordApplication.h.c()) + i : i;
        }
        return i;
    }

    public void e(int i) {
        ((com.fodlam.yds.f.d) this.a.get(i)).d = true;
    }
}
