package com.fodlam.yds;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.e;
import android.view.View;
import com.afollestad.materialdialogs.b;
import com.afollestad.materialdialogs.f;
import com.afollestad.materialdialogs.f.a;
import com.afollestad.materialdialogs.f.j;
import com.afollestad.materialdialogs.h;
import com.badoualy.stepperindicator.StepperIndicator;
import com.fodlam.yds.a.g;

public class TestLevelActivity extends e {
    ViewPager m;
    g n;

    private void j() {
        new a(this).a((int) R.string.alerttesttitle).c((int) R.string.alerttesttitlecontent).f(R.string.ok).g(R.string.gotomarket).a(h.LIGHT).b((int) R.drawable.ic_alert).i(R.color.colorAccent).d(-12303292).b(new j(this) {
            final /* synthetic */ TestLevelActivity a;

            {
                this.a = r1;
            }

            public void a(f fVar, b bVar) {
                this.a.startActivity(new Intent(this.a, FodlaBillingActivity.class));
                fVar.dismiss();
            }
        }).c();
    }

    public void clickCard(View view) {
        com.fodlam.yds.f.g gVar = (com.fodlam.yds.f.g) view.getTag();
        if (gVar.c()) {
            j();
            return;
        }
        OxfordApplication.i = gVar.a;
        startActivity(new Intent(this, TestTypeSelectionActivity.class));
    }

    protected void onCreate(Bundle bundle) {
        int i = 2;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_level);
        this.m = (ViewPager) findViewById(R.id.viewPager);
        this.n = new g(this);
        this.m.setAdapter(this.n);
        this.m.setOffscreenPageLimit(this.n.b());
        setTitle(com.fodlam.yds.c.b.a().g().a + ": " + getString(R.string.testselection));
        final StepperIndicator stepperIndicator = (StepperIndicator) findViewById(R.id.stepIndicator);
        if (this.n.b() >= 2) {
            i = this.n.b();
        }
        stepperIndicator.setStepCount(i);
        this.m.a(new ViewPager.f(this) {
            final /* synthetic */ TestLevelActivity b;

            public void a(int i) {
            }

            public void a(int i, float f, int i2) {
            }

            public void b(int i) {
                stepperIndicator.setCurrentStep(i);
            }
        });
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m = null;
        this.n = null;
    }

    protected void onResume() {
        if (!(this.n == null || this.m == null)) {
            com.fodlam.yds.f.b g = com.fodlam.yds.c.b.a().g();
            OxfordApplication.j = g.i().a;
            PreferenceManager.getDefaultSharedPreferences(this).edit().putInt(g.b + ".LatestTestId", OxfordApplication.j).apply();
            this.n.c();
        }
        super.onResume();
    }
}
