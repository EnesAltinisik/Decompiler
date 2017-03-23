package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.internal.c;
import java.util.List;

@vz
class qi extends RelativeLayout {
    private static final float[] a = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private final RelativeLayout b;
    private AnimationDrawable c;

    public qi(Context context, qh qhVar) {
        super(context);
        c.a((Object) qhVar);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        switch (qhVar.g()) {
            case 0:
                layoutParams.addRule(10);
                layoutParams.addRule(9);
                break;
            case 2:
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                break;
            case 3:
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                break;
            default:
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                break;
        }
        Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(a, null, null));
        shapeDrawable.getPaint().setColor(qhVar.c());
        this.b = new RelativeLayout(context);
        this.b.setLayoutParams(layoutParams);
        v.g().a(this.b, shapeDrawable);
        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(qhVar.a())) {
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            View textView = new TextView(context);
            textView.setLayoutParams(layoutParams2);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(qhVar.a());
            textView.setTextColor(qhVar.d());
            textView.setTextSize((float) qhVar.e());
            textView.setPadding(oc.a().a(context, 4), 0, oc.a().a(context, 4), 0);
            this.b.addView(textView);
            layoutParams.addRule(1, textView.getId());
        }
        View imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setId(1195835394);
        List<Drawable> b = qhVar.b();
        if (b.size() > 1) {
            this.c = new AnimationDrawable();
            for (Drawable addFrame : b) {
                this.c.addFrame(addFrame, qhVar.f());
            }
            v.g().a(imageView, this.c);
        } else if (b.size() == 1) {
            imageView.setImageDrawable((Drawable) b.get(0));
        }
        this.b.addView(imageView);
        addView(this.b);
    }

    public ViewGroup a() {
        return this.b;
    }

    public void onAttachedToWindow() {
        if (this.c != null) {
            this.c.start();
        }
        super.onAttachedToWindow();
    }
}
