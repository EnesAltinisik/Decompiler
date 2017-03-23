package com.fodlam.yds;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.e;
import android.view.Menu;
import com.fodlam.yds.d.b;
import com.fodlam.yds.f.f;
import com.google.android.gms.ads.g;
import com.google.firebase.a.a;

public class c extends e {
    private int m = 0;
    public a s = null;
    g t;
    com.fodlam.yds.d.a u;
    long v;
    int w;
    Class x;

    private void j() {
        this.t.a(new com.google.android.gms.ads.c.a().b(com.google.android.gms.ads.c.a).b("C9B31154FD5A55FF4A275F4A3F3BB278").b("59D066C8530C98987ECD6E439C59A14F").b("A9D382793880830FCEED935DA3BBFA59").a());
    }

    public void a(int i, Class cls) {
        this.w = i;
        this.x = cls;
        if (this.t == null || !this.t.a()) {
            k();
        } else {
            this.t.b();
        }
    }

    protected void c(int i) {
        this.u.a(i);
        this.u.show();
    }

    public void k() {
        if (this.u != null && this.u.isShowing()) {
            this.u.dismiss();
        }
        if (this.w == 2) {
            startActivity(new Intent(this, this.x));
        } else if (this.w == 3) {
            startActivity(new Intent(this, OxfordApplication.h.i));
        }
        finish();
    }

    public void onBackPressed() {
        int i = this.m + 1;
        this.m = i;
        if (i == 1) {
            new b(this).show();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OxfordApplication.e(getApplicationContext());
        getWindow().addFlags(128);
        if (OxfordApplication.f && Math.random() <= 0.3d) {
            this.t = new g(this);
            this.t.a(getString(R.string.interstial_ad_unit_id));
            this.t.a(new com.google.android.gms.ads.a(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void b() {
                    this.a.j();
                    this.a.k();
                }
            });
            j();
        }
        this.u = new com.fodlam.yds.d.a(this);
        com.fodlam.yds.utility.b.a(getApplicationContext());
        if (this.s == null) {
            this.s = a.a(this);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.v = System.currentTimeMillis();
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        com.fodlam.yds.c.a a = com.fodlam.yds.c.a.a((Context) this);
        f f = a.f();
        f.b += ((int) (System.currentTimeMillis() - this.v)) / 1000;
        a.b(f);
        super.onDestroy();
    }

    protected void onResume() {
        super.onResume();
        if (this.s != null) {
            this.s.a(this, OxfordApplication.h.name(), null);
        }
        this.m = 0;
    }
}
