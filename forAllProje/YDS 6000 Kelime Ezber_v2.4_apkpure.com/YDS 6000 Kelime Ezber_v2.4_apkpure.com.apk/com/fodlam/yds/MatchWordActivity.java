package com.fodlam.yds;

import android.content.ClipData;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.badoualy.stepperindicator.StepperIndicator;
import com.fodlam.yds.c.b;
import com.fodlam.yds.f.f;
import com.fodlam.yds.f.h;
import com.fodlam.yds.utility.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MatchWordActivity extends c implements OnDragListener, OnTouchListener {
    ArrayList<h> m = new ArrayList();
    ArrayList<h> n = new ArrayList();
    TextView[] o;
    StepperIndicator p;
    int q = 0;
    View r = null;
    private boolean y = false;
    private int z = 4;

    private void a(Bundle bundle) {
        int i;
        int i2;
        if (bundle != null) {
            this.z = bundle.getInt("TARGET_COUNT");
        } else {
            this.z = this.m.size() >= 4 ? 4 : this.m.size();
        }
        h[] hVarArr = new h[(this.z - (this.q % this.z))];
        if (this.m.isEmpty() || hVarArr.length > this.m.size()) {
            finish();
        }
        for (i = 0; i < hVarArr.length; i++) {
            hVarArr[i] = (h) this.m.get(i);
        }
        ArrayList arrayList = new ArrayList();
        for (i2 = 0; i2 < hVarArr.length * 2; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        Collections.shuffle(arrayList);
        for (i = 0; i < arrayList.size(); i++) {
            i2 = ((Integer) arrayList.get(i)).intValue();
            if (i < hVarArr.length) {
                this.o[i2].setText(hVarArr[i].h, BufferType.SPANNABLE);
                this.o[i2].setTag(hVarArr[i]);
            } else {
                this.o[i2].setText(hVarArr[i - hVarArr.length].k, BufferType.SPANNABLE);
                this.o[i2].setTag(hVarArr[i - hVarArr.length]);
            }
            this.o[i2].setOnTouchListener(this);
            this.o[i2].setOnDragListener(this);
            ((View) this.o[i2].getParent()).setVisibility(0);
        }
        for (i = arrayList.size(); i < 8; i++) {
            ((View) this.o[i].getParent()).setVisibility(4);
        }
    }

    private void l() {
        if (!this.y) {
            this.y = true;
            a.a(getApplicationContext()).c();
            c(j());
        }
    }

    public int j() {
        Iterator it = this.n.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((h) it.next()).l.a(OxfordApplication.h.c()) + i;
        }
        return i;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_match_word);
        a((Toolbar) findViewById(R.id.toolbar));
        setTitle(OxfordApplication.h.a() + " - " + (OxfordApplication.i + 1) + ". Test");
        this.o = new TextView[8];
        this.o[0] = (TextView) findViewById(R.id.txt_item1);
        this.o[1] = (TextView) findViewById(R.id.txt_item2);
        this.o[2] = (TextView) findViewById(R.id.txt_item3);
        this.o[3] = (TextView) findViewById(R.id.txt_item4);
        this.o[4] = (TextView) findViewById(R.id.txt_item5);
        this.o[5] = (TextView) findViewById(R.id.txt_item6);
        this.o[6] = (TextView) findViewById(R.id.txt_item7);
        this.o[7] = (TextView) findViewById(R.id.txt_item8);
        this.p = (StepperIndicator) findViewById(R.id.stepIndicator);
        if (bundle != null) {
            this.n = (ArrayList) bundle.getSerializable("matchtestlistorigin");
            this.m = (ArrayList) bundle.getSerializable("matchtestlist");
            this.q = bundle.getInt("stepCount");
        } else {
            this.n = b.a().b().f();
            this.m.addAll(this.n);
            Collections.shuffle(this.m);
        }
        this.p.setStepCount(this.n.size() / 3 >= 2 ? this.n.size() / 3 : 2);
        this.p.setCurrentStep(this.q / 3);
        a(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.r = null;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        com.fodlam.yds.c.a a = com.fodlam.yds.c.a.a(getApplicationContext());
        switch (dragEvent.getAction()) {
            case 1:
                return dragEvent.getClipDescription().hasMimeType("text/plain");
            case 2:
                return true;
            case 3:
                view.setBackgroundColor(-1);
                view.invalidate();
                f f;
                if (this.r != null && this.r.getTag() == view.getTag() && this.r != view) {
                    h hVar = (h) this.r.getTag();
                    hVar.l.b(OxfordApplication.h.c(), 1);
                    a.a(hVar.l);
                    f = a.f();
                    f.d++;
                    a.b(f);
                    ((View) this.r.getParent()).setVisibility(4);
                    ((View) view.getParent()).setVisibility(4);
                    this.m.remove(this.r.getTag());
                    a.a(getApplicationContext()).a();
                    this.r.setOnDragListener(null);
                    view.setOnDragListener(null);
                    this.r.setOnTouchListener(null);
                    view.setOnTouchListener(null);
                    this.q++;
                    this.p.setCurrentStep(this.q / 3);
                    if (this.m.isEmpty()) {
                        ((LinearLayout) this.r.getParent().getParent()).removeView((View) this.r.getParent());
                        ((LinearLayout) view.getParent().getParent()).removeView((View) view.getParent());
                    }
                    if (this.q % this.z == 0) {
                        if (this.m.isEmpty()) {
                            l();
                        } else {
                            a(null);
                        }
                    }
                } else if (this.r != view) {
                    a.a(getApplicationContext()).b();
                    f = a.f();
                    f.e++;
                    a.b(f);
                }
                this.r = null;
                return true;
            case 4:
                view.setBackgroundColor(-1);
                view.invalidate();
                return true;
            case 5:
                if (view != this.r) {
                    view.setBackgroundColor(-16711936);
                    view.invalidate();
                }
                return true;
            case 6:
                view.setBackgroundColor(-1);
                view.invalidate();
                return true;
            default:
                return false;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("matchtestlistorigin", this.n);
        bundle.putSerializable("matchtestlist", this.m);
        bundle.putInt("stepCount", this.q);
        bundle.putInt("TARGET_COUNT", this.z);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ClipData newPlainText = ClipData.newPlainText("", "");
        DragShadowBuilder dragShadowBuilder = new DragShadowBuilder((CardView) view.getParent());
        if (VERSION.SDK_INT >= 24) {
            view.startDragAndDrop(newPlainText, dragShadowBuilder, null, 0);
        } else {
            view.startDrag(newPlainText, dragShadowBuilder, null, 0);
        }
        this.r = view;
        return false;
    }
}
