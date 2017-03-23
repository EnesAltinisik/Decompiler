package com.fodlam.yds.d;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.c;
import com.fodlam.yds.f.b;
import com.google.android.gms.ads.i;

public class a extends Dialog {
    public ImageButton a;
    public ImageButton b;
    public ImageButton c;
    int d = 1;
    c e;
    SharedPreferences f;
    private i g = null;

    public a(final c cVar) {
        super(cVar, R.style.myCoolDialog);
        this.e = cVar;
        getWindow().setLayout(-1, -1);
        requestWindowFeature(1);
        setContentView(R.layout.resultdialog);
        this.a = (ImageButton) findViewById(R.id.homeImageButton);
        this.b = (ImageButton) findViewById(R.id.replayImageButton);
        this.c = (ImageButton) findViewById(R.id.gotoImageButton);
        this.a.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ a b;

            public void onClick(View view) {
                cVar.a(1, null);
            }
        });
        this.b.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ a b;

            public void onClick(View view) {
                cVar.a(2, cVar.getClass());
            }
        });
        this.c.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ a b;

            public void onClick(View view) {
                OxfordApplication.a();
                cVar.a(3, null);
            }
        });
        if (OxfordApplication.f) {
            this.g = com.fodlam.yds.utility.c.a(getContext(), (LinearLayout) findViewById(R.id.advertisement), 300, 300);
        }
    }

    public void a(int i) {
        b g = com.fodlam.yds.c.b.a().g();
        CharSequence charSequence = g.a + ": " + OxfordApplication.h.a();
        int a = com.fodlam.yds.utility.c.a(i);
        CharSequence b = com.fodlam.yds.utility.c.b(a);
        this.f = PreferenceManager.getDefaultSharedPreferences(getContext());
        int i2 = i * 100;
        int i3 = this.f.getInt(g.a + OxfordApplication.h.a() + "highscore", 0);
        if (i2 > i3) {
            Editor edit = this.f.edit();
            edit.putInt(g.a + OxfordApplication.h.a() + "highscore", i2);
            edit.commit();
            i3 = i2;
        }
        CharSequence charSequence2 = this.e.getString(R.string.yourscore) + ": " + i2;
        CharSequence charSequence3 = this.e.getString(R.string.highscore) + ": " + i3;
        ((TextView) findViewById(R.id.titleView)).setText(charSequence);
        ((TextView) findViewById(R.id.messageTextView)).setText(b);
        ((TextView) findViewById(R.id.scoreTextView)).setText(charSequence2);
        ((TextView) findViewById(R.id.highScoreTextView)).setText(charSequence3);
        if (a > 0) {
            findViewById(R.id.scoreimageView1).setAlpha(1.0f);
            if (a > 1) {
                findViewById(R.id.scoreimageView2).setAlpha(1.0f);
                if (a > 2) {
                    findViewById(R.id.scoreimageView3).setAlpha(1.0f);
                }
            }
        }
    }

    public void dismiss() {
        if (this.g != null) {
            this.g.c();
        }
        super.dismiss();
    }

    public void onBackPressed() {
    }
}
