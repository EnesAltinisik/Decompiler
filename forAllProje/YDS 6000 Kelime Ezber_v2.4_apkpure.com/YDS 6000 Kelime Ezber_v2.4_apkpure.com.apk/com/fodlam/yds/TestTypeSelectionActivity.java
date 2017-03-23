package com.fodlam.yds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.e;
import android.view.View;
import com.fodlam.yds.OxfordApplication.a;
import com.fodlam.yds.a.c;
import com.fodlam.yds.c.b;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

public class TestTypeSelectionActivity extends e {
    HorizontalInfiniteCycleViewPager m;

    public void clickCardView(View view) {
        OxfordApplication.h = (a) view.getTag();
        startActivity(new Intent(this, OxfordApplication.h.i));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_tests);
        this.m = (HorizontalInfiniteCycleViewPager) findViewById(R.id.hicvpgr);
        this.m.setAdapter(new c(e()));
        this.m.setOffscreenPageLimit(2);
        setTitle(b.a().g().a + ": " + (OxfordApplication.i + 1) + ". " + getString(R.string.testgroup));
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m = null;
    }
}
