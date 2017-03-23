package com.fodlam.yds.utility;

import android.content.Context;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.EngineInfo;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import java.util.List;
import java.util.Locale;

public class b implements OnInitListener {
    static b a = null;
    Context b;
    private TextToSpeech c;

    private b(Context context) {
        this.b = context;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("ttsengine", null);
        if (string != null) {
            this.c = new TextToSpeech(context, this, string);
        } else {
            this.c = new TextToSpeech(context, this);
        }
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (a == null && context != null) {
                a = new b(context);
            }
            bVar = a;
        }
        return bVar;
    }

    public List<EngineInfo> a() {
        return this.c.getEngines();
    }

    public void a(String str) {
        if (str == null) {
            str = "com.google.android.tts";
        }
        if (this.c != null) {
            this.c.stop();
            this.c.shutdown();
            this.c = null;
        }
        this.c = new TextToSpeech(this.b, this, str);
    }

    public void b() {
        if (this.c != null) {
            this.c.shutdown();
            this.c = null;
            a = null;
        }
    }

    public void b(String str) {
        if (VERSION.SDK_INT >= 21) {
            this.c.speak(str, 0, null, null);
        } else {
            this.c.speak(str, 0, null);
        }
    }

    public void onInit(int i) {
        if (i != 0 || this.c == null) {
            Log.e("Oxford", "TTS: Initilization Failed!");
            return;
        }
        int language = this.c.isLanguageAvailable(Locale.US) == 0 ? this.c.setLanguage(Locale.US) : this.c.isLanguageAvailable(Locale.ENGLISH) == 0 ? this.c.setLanguage(Locale.ENGLISH) : -1;
        if (language == -1 || language == -2) {
            Log.e("Oxford", "TTS: This Language is not supported");
        } else {
            b("");
        }
    }
}
