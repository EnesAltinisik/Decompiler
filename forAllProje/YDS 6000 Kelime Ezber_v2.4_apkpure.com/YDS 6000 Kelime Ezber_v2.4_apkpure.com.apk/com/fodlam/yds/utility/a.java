package com.fodlam.yds.utility;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.Builder;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Build.VERSION;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;

public class a {
    static a a;
    AudioManager b = null;
    SoundPool c;
    int d = -1;
    int e = -1;
    int f = -1;
    int g = -1;
    int h = -1;
    int i = -1;
    Context j;

    private a(Context context) {
        this.j = context;
        this.b = (AudioManager) context.getSystemService("audio");
        if (VERSION.SDK_INT < 21) {
            this.c = new SoundPool(1, 3, 100);
        } else {
            this.c = new Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).setContentType(2).build()).build();
        }
        this.c.setOnLoadCompleteListener(new OnLoadCompleteListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            }
        });
        this.f = a((int) R.raw.accept);
        this.g = a((int) R.raw.correct);
        this.h = a((int) R.raw.incorrect);
        this.e = a((int) R.raw.alkis2);
        this.i = a((int) R.raw.flick);
    }

    public static a a(Context context) {
        if (a == null) {
            a = new a(context.getApplicationContext());
        }
        return a;
    }

    private void b(int i) {
        if (i != -1) {
            float streamVolume = this.b != null ? ((float) this.b.getStreamVolume(3)) / ((float) this.b.getStreamMaxVolume(3)) : 1.0f;
            e();
            this.d = this.c.play(i, streamVolume, streamVolume, 1, 0, 1.0f);
        }
    }

    public int a(int i) {
        return i <= 0 ? -1 : this.c.load(this.j, i, 1);
    }

    public void a() {
        if (OxfordApplication.d) {
            b(this.g);
        }
    }

    public void b() {
        if (OxfordApplication.d) {
            b(this.h);
        }
        c.a(this.j);
    }

    public void c() {
        if (OxfordApplication.d) {
            b(this.e);
        }
    }

    public void d() {
        if (OxfordApplication.d) {
            b(this.i);
        }
    }

    public void e() {
        if (this.d != -1) {
            this.c.stop(this.d);
            this.d = -1;
        }
    }

    public void f() {
        try {
            this.c.release();
        } catch (Exception e) {
        }
        a = null;
        this.c = null;
        this.b = null;
        this.j = null;
    }
}
