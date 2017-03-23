package com.fodlam.yds;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.badoualy.stepperindicator.StepperIndicator;
import com.fodlam.yds.a.k;
import com.fodlam.yds.f.h;
import com.fodlam.yds.utility.a;
import com.fodlam.yds.utility.b;

public class WriteWordActivity extends c {
    ViewPager m;
    k n;
    private boolean o = false;

    public void clickCard(View view) {
        b.a(getApplicationContext()).b(((h) view.getTag()).h);
    }

    public void j() {
        if (this.m.getCurrentItem() != this.n.b() - 1) {
            this.m.postDelayed(new Runnable(this) {
                final /* synthetic */ WriteWordActivity a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.m.setCurrentItem(this.a.m.getCurrentItem() + 1);
                }
            }, 400);
        } else if (!this.o) {
            this.o = true;
            a.a(getApplicationContext()).c();
            c(this.n.c());
        }
    }

    protected void onCreate(Bundle bundle) {
        int i = 2;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_write_word);
        a((Toolbar) findViewById(R.id.toolbar));
        setTitle(OxfordApplication.h.a() + " - " + (OxfordApplication.i + 1) + ". " + getString(R.string.test));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ WriteWordActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.n.b(this.a.m.getCurrentItem());
            }
        });
        this.n = new k(this, bundle);
        this.m = (ViewPager) findViewById(R.id.viewPager);
        this.m.setAdapter(this.n);
        this.m.setOffscreenPageLimit(this.n.b());
        final StepperIndicator stepperIndicator = (StepperIndicator) findViewById(R.id.stepIndicator);
        if (this.n.b() / 3 >= 2) {
            i = this.n.b() / 3;
        }
        stepperIndicator.setStepCount(i);
        this.m.a(new f(this) {
            boolean a = false;
            final /* synthetic */ WriteWordActivity c;

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
                    this.c.j();
                }
            }

            public void b(int i) {
                stepperIndicator.setCurrentStep(i / 3);
            }
        });
        if (bundle != null) {
            this.m.setCurrentItem(bundle.getInt("currentItem"));
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m = null;
        this.n = null;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("writewordlist", this.n.a);
        bundle.putInt("currentItem", this.m.getCurrentItem());
    }
}
