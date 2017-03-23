package com.google.android.gms.ads.internal.formats;

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
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzig;
import java.util.List;

@zzig
class a extends RelativeLayout {
    private static final float[] a = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private final RelativeLayout b;
    private AnimationDrawable c;

    public a(Context context, zza com_google_android_gms_ads_internal_formats_zza) {
        super(context);
        zzaa.zzz(com_google_android_gms_ads_internal_formats_zza);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(a, null, null));
        shapeDrawable.getPaint().setColor(com_google_android_gms_ads_internal_formats_zza.getBackgroundColor());
        this.b = new RelativeLayout(context);
        this.b.setLayoutParams(layoutParams);
        zzu.zzcm().zza(this.b, shapeDrawable);
        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(com_google_android_gms_ads_internal_formats_zza.getText())) {
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            View textView = new TextView(context);
            textView.setLayoutParams(layoutParams2);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(com_google_android_gms_ads_internal_formats_zza.getText());
            textView.setTextColor(com_google_android_gms_ads_internal_formats_zza.getTextColor());
            textView.setTextSize((float) com_google_android_gms_ads_internal_formats_zza.getTextSize());
            textView.setPadding(zzm.zzdQ().zza(context, 4), 0, zzm.zzdQ().zza(context, 4), 0);
            this.b.addView(textView);
            layoutParams.addRule(1, textView.getId());
        }
        View imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setId(1195835394);
        List<Drawable> zzeJ = com_google_android_gms_ads_internal_formats_zza.zzeJ();
        if (zzeJ.size() > 1) {
            this.c = new AnimationDrawable();
            for (Drawable addFrame : zzeJ) {
                this.c.addFrame(addFrame, com_google_android_gms_ads_internal_formats_zza.zzeK());
            }
            zzu.zzcm().zza(imageView, this.c);
        } else if (zzeJ.size() == 1) {
            imageView.setImageDrawable((Drawable) zzeJ.get(0));
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
