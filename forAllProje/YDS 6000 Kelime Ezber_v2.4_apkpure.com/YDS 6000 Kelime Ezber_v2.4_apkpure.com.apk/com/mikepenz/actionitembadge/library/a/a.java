package com.mikepenz.actionitembadge.library.a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import com.mikepenz.actionitembadge.library.R;

public class a {
    private int a = 0;
    private int b = 0;
    private int c = -1;
    private int d = -1;
    private int e = 0;

    public StateListDrawable a(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = (GradientDrawable) android.support.v4.c.a.a(context, R.drawable.action_item_badge);
        GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.getConstantState().newDrawable().mutate();
        gradientDrawable.setColor(this.a);
        gradientDrawable2.setColor(this.b);
        if (this.d > -1) {
            gradientDrawable.setStroke(this.d, this.e);
            gradientDrawable2.setStroke(this.d, this.e);
        }
        if (this.c > -1) {
            gradientDrawable.setCornerRadius((float) this.c);
            gradientDrawable2.setCornerRadius((float) this.c);
        }
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        return stateListDrawable;
    }

    public a a(int i) {
        this.a = i;
        return this;
    }

    public a b(int i) {
        this.b = i;
        return this;
    }

    public a c(int i) {
        this.c = i;
        return this;
    }

    public a d(int i) {
        this.d = i;
        return this;
    }

    public a e(int i) {
        this.e = i;
        return this;
    }
}
