package com.fodlam.yds.d;

import android.app.Dialog;
import android.support.v7.app.e;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.utility.c;
import com.google.android.gms.ads.i;

public class b extends Dialog {
    e a;
    private i b = c.a(getContext(), (LinearLayout) findViewById(R.id.advertisement), 300, 300);

    public b(final com.fodlam.yds.c cVar) {
        super(cVar, R.style.myCoolDialog);
        this.a = cVar;
        getWindow().setLayout(-1, -1);
        requestWindowFeature(1);
        setContentView(R.layout.testresumedialog);
        ((TextView) findViewById(R.id.titleView)).setText(com.fodlam.yds.c.b.a().g().a + ": " + OxfordApplication.h.a());
        findViewById(R.id.homeImageButton).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ b b;

            public void onClick(View view) {
                cVar.a(1, null);
                this.b.a();
            }
        });
        findViewById(R.id.resumeImageButton).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.dismiss();
            }
        });
    }

    private void a() {
        dismiss();
        this.a.finish();
    }

    public void dismiss() {
        if (OxfordApplication.f) {
            this.b.c();
        }
        super.dismiss();
    }

    public void onBackPressed() {
        a();
    }
}
