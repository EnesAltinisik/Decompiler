package com.fodlam.yds;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fodlam.yds.utility.b;
import com.google.android.gms.ads.h;
import java.util.Locale;

public class OxfordApplication extends Application {
    public static int a = 8;
    public static boolean b = false;
    public static String c = "tr";
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static int g = 0;
    public static a h = a.LEARNING;
    public static int i = 0;
    public static int j = 0;
    public static Boolean k = Boolean.valueOf(true);

    public enum a {
        LEARNING("Kelime Öğrenme", R.drawable.ic_learning, WordLearningActivity.class),
        CHOOSEWORD("Kelime Seçme", R.drawable.ic_mult, MultipleChoiceActivity.class),
        FINDWORD("Kelime Bulma", R.drawable.ic_mult, MultipleChoiceActivity.class),
        LISTEN("Dinleme ve Bulma", R.drawable.ic_listen, MultipleChoiceActivity.class),
        LISTENANDCHOOSE("Dinleme ve Seçme", R.drawable.ic_listen, MultipleChoiceActivity.class),
        MATCHWORD("Kelime Eşleştirme", R.drawable.ic_match, MatchWordActivity.class),
        LISTENANDWRITE("Dinleme ve Yazma I", R.drawable.ic_write, WriteWordActivity.class),
        WRITEWORD("Dinleme ve Yazma II", R.drawable.ic_write, WriteWordActivity.class);
        
        public Class i;
        private String j;
        private int k;

        private a(String str, int i, Class cls) {
            this.j = str;
            this.k = i;
            this.i = cls;
        }

        public String a() {
            return this.j;
        }

        public int b() {
            return this.k;
        }

        public String c() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }

    public static void a() {
        a[] values = a.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i] == h) {
                h = values[(i + 1) % values.length];
                return;
            }
        }
    }

    public static void a(Context context) {
        b.a(context);
        com.fodlam.yds.utility.a.a(context);
        if (com.fodlam.yds.c.b.a() == null) {
            com.fodlam.yds.c.a.a(context);
            com.fodlam.yds.c.b.a(context, true);
            b(context);
            c(context);
            com.fodlam.yds.alarms.a.a(context);
        }
        h.a(context, context.getString(R.string.banner_ad_unit_id));
    }

    public static void b() {
        try {
            b.a(null).b();
        } catch (Exception e) {
        }
        try {
            com.fodlam.yds.utility.a.a(null).f();
        } catch (Exception e2) {
        }
        try {
            com.fodlam.yds.c.a.a(null).a();
        } catch (Exception e3) {
        }
        try {
            com.fodlam.yds.c.b.a().h();
        } catch (Exception e4) {
        }
    }

    public static void b(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        g = defaultSharedPreferences.getInt("CurrentCategory", 0);
        h = a.valueOf(defaultSharedPreferences.getString("CurrentTest", "LEARNING"));
        i = defaultSharedPreferences.getInt("CurrentTestId", 0);
        j = defaultSharedPreferences.getInt(g + ".LatestTestId", 0);
        e = defaultSharedPreferences.getBoolean("test_wrong_vibrate", true);
        k = Boolean.valueOf(defaultSharedPreferences.getBoolean("remind_me", true));
        d = defaultSharedPreferences.getBoolean("test_sound_on", true);
        a = Integer.parseInt(defaultSharedPreferences.getString("testthreshold", "8"));
    }

    public static void c(Context context) {
        d(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        com.fodlam.yds.c.b a = com.fodlam.yds.c.b.a();
        if (b) {
            a.b(1);
            a.b(2);
            defaultSharedPreferences.edit().putBoolean("is_intermediate_enabled", true).apply();
            defaultSharedPreferences.edit().putBoolean("is_advanced_enabled", true).apply();
        }
    }

    public static void d(Context context) {
        com.fodlam.yds.c.b a = com.fodlam.yds.c.b.a();
        if (a != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            String string = defaultSharedPreferences.getString("com.fodlam.yds.noads", "noone");
            if (defaultSharedPreferences.getString("com.fodlam.yds.full", "noone").equals("com.fodlam.yds")) {
                f = false;
                b = true;
                a.b(0);
                a.b(1);
                a.b(2);
                defaultSharedPreferences.edit().putBoolean("is_intermediate_enabled", true).commit();
                defaultSharedPreferences.edit().putBoolean("is_advanced_enabled", true).commit();
            } else if (string.equals("com.fodlam.yds")) {
                f = false;
            }
        }
    }

    public static void e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.edit().putString("CurrentTest", h.name()).apply();
        defaultSharedPreferences.edit().putInt("CurrentTestId", i).apply();
    }

    public void onCreate() {
        super.onCreate();
        android.support.b.a.a((Context) this);
        registerActivityLifecycleCallbacks(new b());
    }
}
