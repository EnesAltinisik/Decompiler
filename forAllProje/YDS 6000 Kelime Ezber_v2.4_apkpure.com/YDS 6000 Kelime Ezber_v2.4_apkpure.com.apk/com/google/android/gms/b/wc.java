package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.common.util.f;

@vz
public final class wc {

    public interface a {
        void a(wi wiVar);
    }

    interface b {
        boolean a(aab com_google_android_gms_b_aab);
    }

    class AnonymousClass1 implements b {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public boolean a(aab com_google_android_gms_b_aab) {
            return com_google_android_gms_b_aab.e || (f.c(this.a) && !((Boolean) pr.P.c()).booleanValue());
        }
    }

    public static zk a(Context context, aab com_google_android_gms_b_aab, aaj<wf> com_google_android_gms_b_aaj_com_google_android_gms_b_wf, a aVar) {
        return a(context, com_google_android_gms_b_aab, com_google_android_gms_b_aaj_com_google_android_gms_b_wf, aVar, new AnonymousClass1(context));
    }

    static zk a(Context context, aab com_google_android_gms_b_aab, aaj<wf> com_google_android_gms_b_aaj_com_google_android_gms_b_wf, a aVar, b bVar) {
        return bVar.a(com_google_android_gms_b_aab) ? a(context, com_google_android_gms_b_aaj_com_google_android_gms_b_wf, aVar) : b(context, com_google_android_gms_b_aab, com_google_android_gms_b_aaj_com_google_android_gms_b_wf, aVar);
    }

    private static zk a(Context context, aaj<wf> com_google_android_gms_b_aaj_com_google_android_gms_b_wf, a aVar) {
        zy.b("Fetching ad response from local ad request service.");
        zk aVar2 = new com.google.android.gms.b.wd.a(context, com_google_android_gms_b_aaj_com_google_android_gms_b_wf, aVar);
        aVar2.e();
        return aVar2;
    }

    private static zk b(Context context, aab com_google_android_gms_b_aab, aaj<wf> com_google_android_gms_b_aaj_com_google_android_gms_b_wf, a aVar) {
        zy.b("Fetching ad response from remote ad request service.");
        if (oc.a().b(context)) {
            return new com.google.android.gms.b.wd.b(context, com_google_android_gms_b_aab, com_google_android_gms_b_aaj_com_google_android_gms_b_wf, aVar);
        }
        zy.e("Failed to connect to remote ad request service.");
        return null;
    }
}
