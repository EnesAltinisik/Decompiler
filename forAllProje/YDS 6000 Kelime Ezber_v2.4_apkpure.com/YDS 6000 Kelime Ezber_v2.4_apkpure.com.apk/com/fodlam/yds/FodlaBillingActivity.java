package com.fodlam.yds;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.e;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.b.a.a.a.c;
import com.b.a.a.a.c.b;
import com.b.a.a.a.f;
import com.b.a.a.a.h;

public class FodlaBillingActivity extends e implements b {
    c m;
    boolean n = false;
    Button o;
    Button p;

    private void a(String str) {
        Toast.makeText(this, str, 1).show();
    }

    private void j() {
        if (this.m != null) {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
            if (this.m.a("com.fodlam.yds.full") && this.m.a("com.fodlam.yds.noads")) {
                edit.putString("com.fodlam.yds.full", "com.fodlam.yds").commit();
                edit.putString("com.fodlam.yds.noads", "com.fodlam.yds").commit();
                OxfordApplication.d(this);
                this.p.setEnabled(false);
                this.o.setEnabled(false);
                this.p.setText(R.string.buythisproduct);
                this.o.setText(R.string.buythisproduct);
            } else if (this.m.a("com.fodlam.yds.full")) {
                edit.putString("com.fodlam.yds.full", "com.fodlam.yds").commit();
                OxfordApplication.d(this);
                this.p.setEnabled(false);
                this.o.setEnabled(false);
                this.p.setText(R.string.buythisproduct);
            } else if (this.m.a("com.fodlam.yds.noads")) {
                edit.putString("com.fodlam.yds.noads", "com.fodlam.yds").commit();
                OxfordApplication.d(this);
                this.o.setEnabled(false);
                this.p.setEnabled(true);
                this.o.setText(R.string.buythisproduct);
            } else if (this.n) {
                this.p.setEnabled(true);
                this.o.setEnabled(true);
            }
        }
    }

    public void a(int i, Throwable th) {
        j();
    }

    public void a(String str, h hVar) {
        if (hVar.e.c.e == f.PurchasedSuccessfully) {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
            if (str.equals("com.fodlam.yds.full")) {
                edit.putString("com.fodlam.yds.full", "com.fodlam.yds").commit();
                OxfordApplication.d(this);
                this.p.setEnabled(false);
                this.o.setEnabled(false);
                this.p.setText(R.string.buythisproduct);
            } else if (str.equals("com.fodlam.yds.noads")) {
                edit.putString("com.fodlam.yds.noads", "com.fodlam.yds").commit();
                OxfordApplication.d(this);
                this.o.setEnabled(false);
                this.o.setText(R.string.buythisproduct);
            }
        }
    }

    public void c_() {
        j();
    }

    public void d_() {
        this.n = true;
        if (this.m != null) {
            this.m.e();
        }
        j();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        j();
        if (!this.m.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_fodla_billing);
        ((TextView) findViewById(R.id.productText1)).setText(R.string.removeadsandfull);
        ((TextView) findViewById(R.id.productText2)).setText(R.string.removeadds);
        this.p = (Button) findViewById(R.id.button1);
        this.p.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ FodlaBillingActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.n) {
                    this.a.m.a(this.a, "com.fodlam.yds.full");
                }
            }
        });
        this.o = (Button) findViewById(R.id.button2);
        this.o.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ FodlaBillingActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.n) {
                    this.a.m.a(this.a, "com.fodlam.yds.noads");
                }
            }
        });
        this.m = new c(this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxJvoOSAb8hUKvThiWh0Zc/U7u70eMBMrkrhDIdxvqTftqiOKqHxJJw1cIoOAdYUlBTWgJQnB9tbrZXzRYlPGokXd12L1KanIVc7QuDj2QPHjlfTOGLwD44bKsji1o8NqFmpDrbBieKyVCvffPfs0iCn8KslzwzbodLbaviOfDW0Mi0RGFZwW3WPigmZlHLgcngv9UFHDZuQ6wPNJ8BylsjNBtrwA+mwtkRWSBVkBoZ1p3ts5eWa864fqieqvENRIt2JRa4b+9bM4VX49yVBI1SlGpIAm6CLh6r12TYAIg/pFn7pebnvQxhq7UzG8p15p8lLAXX2EdMC51MNtVRSdpQIDAQAB", "13729865083699685309", this);
    }

    protected void onDestroy() {
        if (this.m != null) {
            this.m.c();
        }
        this.m = null;
        this.o = null;
        this.p = null;
        super.onDestroy();
    }

    protected void onResume() {
        super.onResume();
        if (!c.a((Context) this)) {
            a(getString(R.string.pleaseupdategoogleplay));
        }
        j();
    }
}
