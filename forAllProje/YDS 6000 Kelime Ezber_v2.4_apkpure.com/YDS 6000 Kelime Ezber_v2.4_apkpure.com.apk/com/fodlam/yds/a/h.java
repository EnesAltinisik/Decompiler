package com.fodlam.yds.a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.aa;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.balysv.materialripple.a;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.WordLearningActivity;
import com.fodlam.yds.c.b;
import com.fodlam.yds.utility.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class h extends aa {
    public ArrayList<com.fodlam.yds.f.h> a = null;
    WordLearningActivity b;

    public h(WordLearningActivity wordLearningActivity, Bundle bundle) {
        this.b = wordLearningActivity;
        if (bundle == null) {
            this.a = b.a().b().f();
            Collections.shuffle(this.a);
            if (OxfordApplication.f) {
                this.a.add(this.a.size() / 2, new com.fodlam.yds.f.h());
                return;
            }
            return;
        }
        this.a = (ArrayList) bundle.getSerializable("wordlearninglist");
    }

    public int a(com.fodlam.yds.f.h hVar) {
        for (int i = 0; i < this.a.size(); i++) {
            if (hVar.h.equals(((com.fodlam.yds.f.h) this.a.get(i)).h)) {
                return i;
            }
        }
        return 0;
    }

    public com.fodlam.yds.f.h a(int i) {
        return (com.fodlam.yds.f.h) this.a.get(i);
    }

    public Object a(ViewGroup viewGroup, int i) {
        View view;
        com.fodlam.yds.f.h hVar = (com.fodlam.yds.f.h) this.a.get(i);
        LayoutInflater from = LayoutInflater.from(this.b);
        if (hVar.b) {
            view = (ViewGroup) from.inflate(R.layout.advertisementitem, viewGroup, false);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.advertisement);
            c.a(this.b, linearLayout, 400, 400);
            ((TextView) view.findViewById(R.id.title_item)).setText(R.string.adds);
            linearLayout.setOnTouchListener(new OnTouchListener(this) {
                final /* synthetic */ h a;

                {
                    this.a = r1;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        if (motionEvent.getX() > view.getX() + ((float) ((view.getWidth() * 3) / 4))) {
                            this.a.b.b(1);
                        } else if (motionEvent.getX() < view.getX() + ((float) ((view.getWidth() * 1) / 4))) {
                            this.a.b.b(-1);
                        }
                    }
                    return false;
                }
            });
        } else {
            View view2 = (ViewGroup) from.inflate(R.layout.wordlearningitem, viewGroup, false);
            ((TextView) view2.findViewById(R.id.title_item)).setText(((com.fodlam.yds.f.h) this.a.get(i)).h);
            ((TextView) view2.findViewById(R.id.txt_itemdef)).setText(hVar.b());
            View view3 = (TextView) view2.findViewById(R.id.txt_item);
            view3.setText(hVar.k);
            view3.setTag(hVar.h);
            a.a(view3).a(Color.parseColor("#BBDEFB")).a(0.15f).b(true).a().setOnTouchListener(new OnTouchListener(this) {
                final /* synthetic */ h a;

                {
                    this.a = r1;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        if (motionEvent.getX() > view.getX() + ((float) ((view.getWidth() * 3) / 4))) {
                            this.a.b.b(1);
                        } else if (motionEvent.getX() < view.getX() + ((float) ((view.getWidth() * 1) / 4))) {
                            this.a.b.b(-1);
                        } else {
                            com.fodlam.yds.utility.b.a(this.a.b).b(view.findViewById(R.id.txt_item).getTag().toString());
                        }
                    }
                    return false;
                }
            });
            view = view2;
        }
        viewGroup.addView(view);
        return view;
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public boolean a(View view, Object obj) {
        return view == obj;
    }

    public int b() {
        return this.a.size();
    }

    public int c() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.fodlam.yds.f.h hVar = (com.fodlam.yds.f.h) it.next();
            i = !hVar.b ? hVar.l.a(OxfordApplication.h.c()) + i : i;
        }
        return i;
    }
}
