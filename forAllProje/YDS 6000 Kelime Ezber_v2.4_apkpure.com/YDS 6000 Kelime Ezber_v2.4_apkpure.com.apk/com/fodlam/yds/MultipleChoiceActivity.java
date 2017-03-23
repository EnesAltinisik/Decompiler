package com.fodlam.yds;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.badoualy.stepperindicator.StepperIndicator;
import com.fodlam.yds.a.d;
import com.fodlam.yds.c.b;
import com.fodlam.yds.f.f;
import com.fodlam.yds.f.h;
import com.fodlam.yds.utility.a;
import java.util.ArrayList;

public class MultipleChoiceActivity extends c {
    ViewPager m;
    d n;
    boolean o = false;

    public void b(final int i) {
        if (this.m.getCurrentItem() != this.n.b() - 1) {
            this.m.postDelayed(new Runnable(this) {
                final /* synthetic */ MultipleChoiceActivity b;

                public void run() {
                    this.b.m.setCurrentItem(this.b.m.getCurrentItem() + i);
                }
            }, 400);
        } else if (!this.o) {
            this.o = true;
            a.a(getApplicationContext()).c();
            c(this.n.c());
        }
    }

    public void clickCard(View view) {
        if (view != null) {
            h hVar = (h) view.getTag();
            if (hVar != null && this.n != null) {
                String c = OxfordApplication.h.c();
                com.fodlam.yds.c.a a = com.fodlam.yds.c.a.a(getApplicationContext());
                if (this.n.a(hVar, this.m.getCurrentItem())) {
                    if (!this.n.b(this.m.getCurrentItem())) {
                        if (hVar.l.a(c) == 0) {
                            hVar.l.b(c, 1);
                            a.a(hVar.l);
                        }
                        f f = a.f();
                        f.d++;
                        a.b(f);
                    }
                    a.a(getApplicationContext()).a();
                    view.setBackgroundColor(Color.argb(255, 122, 178, 147));
                    b(1);
                } else {
                    if (!this.n.b(this.m.getCurrentItem())) {
                        f f2 = a.f();
                        f2.e++;
                        a.b(f2);
                        hVar.l.b(c, 0);
                        a.a(hVar.l);
                        this.n.e(this.m.getCurrentItem());
                    }
                    a.a(getApplicationContext()).b();
                    view.setBackgroundColor(Color.argb(200, 244, 102, 151));
                }
                view.setEnabled(false);
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        int i = 2;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_multiple_choice);
        a((Toolbar) findViewById(R.id.toolbar));
        setTitle(OxfordApplication.h.a() + " - " + (OxfordApplication.i + 1) + getString(R.string.dottest));
        if (bundle != null) {
            this.n = new d(this, (ArrayList) bundle.getSerializable("questions"));
        } else {
            this.n = new d(this, b.a().i());
        }
        this.m = (ViewPager) findViewById(R.id.viewPager);
        this.m.setAdapter(this.n);
        this.m.setOffscreenPageLimit(this.n.b());
        final StepperIndicator stepperIndicator = (StepperIndicator) findViewById(R.id.stepIndicator);
        if (this.n.b() / 3 >= 2) {
            i = this.n.b() / 3;
        }
        stepperIndicator.setStepCount(i);
        this.m.a(new ViewPager.f(this) {
            boolean a = false;
            final /* synthetic */ MultipleChoiceActivity c;

            public void a(int i) {
                boolean z = true;
                if (!(this.c.m.getCurrentItem() == this.c.n.b() - 1 && i == 1)) {
                    z = false;
                }
                this.a = z;
            }

            public void a(int i, float f, int i2) {
                int b = this.c.n.b() - 1;
                if (this.a && i == b) {
                    this.c.b(1);
                }
            }

            public void b(int i) {
                stepperIndicator.setCurrentStep(i / 3);
            }
        });
        if (bundle != null) {
            this.m.setCurrentItem(bundle.getInt("CurrentItem", 0));
        }
    }

    protected void onDestroy() {
        this.m = null;
        this.n = null;
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("questions", this.n.a);
        bundle.putInt("CurrentItem", this.m.getCurrentItem());
    }
}
