package com.nightonke.boommenu.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.nightonke.boommenu.R;
import com.nightonke.boommenu.e;

final class c extends a {
    public c(Context context) {
        super(context);
    }

    public void a(int i) {
        Drawable a = e.a((View) this, R.drawable.piece_ham, null);
        ((GradientDrawable) a).setColor(i);
        e.a((View) this, a);
    }

    public void setColor(int i) {
        ((GradientDrawable) getBackground()).setColor(i);
    }
}
