package com.google.android.gms.tagmanager;

import android.content.Context;

public class zzz implements zzas {
    private static final Object zzbnE = new Object();
    private static zzz zzboR;
    private r zzboS;
    private ay zzboh;

    private zzz(Context context) {
        this(s.a(context), new bn());
    }

    zzz(r rVar, ay ayVar) {
        this.zzboS = rVar;
        this.zzboh = ayVar;
    }

    public static zzas zzbh(Context context) {
        zzas com_google_android_gms_tagmanager_zzas;
        synchronized (zzbnE) {
            if (zzboR == null) {
                zzboR = new zzz(context);
            }
            com_google_android_gms_tagmanager_zzas = zzboR;
        }
        return com_google_android_gms_tagmanager_zzas;
    }

    public boolean zzgw(String str) {
        if (this.zzboh.a()) {
            this.zzboS.a(str);
            return true;
        }
        zzbn.zzaW("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
        return false;
    }
}
