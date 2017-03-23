package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.d;
import java.util.concurrent.Future;

@vz
public class ss {

    private static class a<JavascriptEngine> extends aad<JavascriptEngine> {
        JavascriptEngine a;

        private a() {
        }
    }

    private sr a(Context context, aab com_google_android_gms_b_aab, final a<sr> aVar, dp dpVar, d dVar) {
        sr stVar = new st(context, com_google_android_gms_b_aab, dpVar, dVar);
        aVar.a = stVar;
        stVar.a(new com.google.android.gms.b.sr.a(this) {
            public void a() {
                aVar.b((Object) (sr) aVar.a);
            }
        });
        return stVar;
    }

    public Future<sr> a(Context context, aab com_google_android_gms_b_aab, String str, dp dpVar, d dVar) {
        final Future aVar = new a();
        final Context context2 = context;
        final aab com_google_android_gms_b_aab2 = com_google_android_gms_b_aab;
        final dp dpVar2 = dpVar;
        final d dVar2 = dVar;
        final String str2 = str;
        zi.a.post(new Runnable(this) {
            final /* synthetic */ ss g;

            public void run() {
                this.g.a(context2, com_google_android_gms_b_aab2, aVar, dpVar2, dVar2).b(str2);
            }
        });
        return aVar;
    }
}
