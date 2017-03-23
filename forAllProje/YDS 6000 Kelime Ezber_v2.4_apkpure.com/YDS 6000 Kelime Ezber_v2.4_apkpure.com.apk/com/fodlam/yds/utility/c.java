package com.fodlam.yds.utility;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.fodlam.yds.FodlaBillingActivity;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.i;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public final class c {
    static SimpleDateFormat a = new SimpleDateFormat("dd.MM.yyyy");
    static Random b = new Random();
    static DecimalFormat c = new DecimalFormat("#.##");
    private static String[] d = new String[]{"#F44336", "#E91E63", "#9C27B0", "#2196F3", "#03A9F4", "#00BCD4", "#009688", "#4CAF50", "#8BC34A", "#CDDC39", "#FFEB3B", "#FFC107", "#FF9800", "#FF5722", "#795548", "#9E9E9E", "#607D8B"};

    public static int a() {
        return (VERSION.SDK_INT >= 21 ? 1 : null) != null ? R.drawable.ic_notification : R.mipmap.ic_launcher;
    }

    public static int a(int i) {
        return i > 10 ? 3 : i > 5 ? 2 : 1;
    }

    public static i a(final Context context, final ViewGroup viewGroup, int i, int i2) {
        if (!OxfordApplication.f) {
            return null;
        }
        final View iVar = new i(context);
        iVar.setAdSize(new d(i, i2));
        iVar.setAdUnitId(context.getString(R.string.banner_ad_unit_id));
        a aVar = new a();
        aVar.b(com.google.android.gms.ads.c.a);
        aVar.b("C9B31154FD5A55FF4A275F4A3F3BB278");
        aVar.b("59D066C8530C98987ECD6E439C59A14F");
        aVar.b("A9D382793880830FCEED935DA3BBFA59");
        viewGroup.addView(iVar);
        iVar.a(aVar.a());
        iVar.setAdListener(new com.google.android.gms.ads.a() {
            public void a() {
                super.a();
                viewGroup.findViewById(R.id.adsLinearLayout).setVisibility(8);
                iVar.setVisibility(0);
                ObjectAnimator.ofFloat(viewGroup, "scaleX", new float[]{0.1f, 1.0f}).setDuration(400).start();
                ObjectAnimator.ofFloat(viewGroup, "scaleY", new float[]{0.1f, 1.0f}).setDuration(400).start();
            }

            public void a(int i) {
                super.a(i);
                viewGroup.findViewById(R.id.adsLinearLayout).setVisibility(0);
                iVar.setVisibility(8);
                ObjectAnimator.ofFloat(viewGroup, "scaleX", new float[]{0.1f, 1.0f}).setDuration(400).start();
                ObjectAnimator.ofFloat(viewGroup, "scaleY", new float[]{0.1f, 1.0f}).setDuration(400).start();
            }
        });
        viewGroup.findViewById(R.id.adsLinearLayout).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                context.startActivity(new Intent(context, FodlaBillingActivity.class));
            }
        });
        return iVar;
    }

    public static String a(float f) {
        return c.format((double) f);
    }

    public static String a(Date date) {
        return a.format(date);
    }

    public static void a(Context context) {
        if (context != null && OxfordApplication.e) {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(500);
            }
        }
    }

    public static String b(int i) {
        switch (i) {
            case 1:
                return "İYİ!";
            case 2:
                return "HARİKA!";
            default:
                return "MÜKEMMEL!";
        }
    }

    public static int c(int i) {
        return b.nextInt(i);
    }
}
