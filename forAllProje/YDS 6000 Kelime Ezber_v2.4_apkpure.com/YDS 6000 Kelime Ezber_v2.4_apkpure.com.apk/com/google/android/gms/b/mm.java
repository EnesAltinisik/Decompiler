package com.google.android.gms.b;

import com.google.android.gms.b.aaj.a;
import com.google.android.gms.b.aaj.b;
import com.google.android.gms.b.sv.c;
import java.util.Map;
import org.json.JSONObject;

@vz
public class mm implements mn {
    private final mj a;
    private c b;
    private boolean c;
    private final rq d = new rq(this) {
        final /* synthetic */ mm a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            if (this.a.a.a((Map) map)) {
                this.a.a.a(com_google_android_gms_b_aaq, (Map) map);
            }
        }
    };
    private final rq e = new rq(this) {
        final /* synthetic */ mm a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            if (this.a.a.a((Map) map)) {
                this.a.a.a(this.a, (Map) map);
            }
        }
    };
    private final rq f = new rq(this) {
        final /* synthetic */ mm a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            if (this.a.a.a((Map) map)) {
                this.a.a.b((Map) map);
            }
        }
    };

    public mm(mj mjVar, sv svVar) {
        this.a = mjVar;
        this.b = svVar.a();
        this.b.a(new aaj.c<sw>(this) {
            final /* synthetic */ mm a;

            {
                this.a = r1;
            }

            public void a(sw swVar) {
                this.a.c = true;
                this.a.a(swVar);
            }

            public /* synthetic */ void a(Object obj) {
                a((sw) obj);
            }
        }, new a(this) {
            final /* synthetic */ mm a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.a.b(this.a);
            }
        });
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.a.r().d());
        zy.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    void a(sw swVar) {
        swVar.a("/updateActiveView", this.d);
        swVar.a("/untrackActiveViewUnit", this.e);
        swVar.a("/visibilityChanged", this.f);
    }

    public void a(final JSONObject jSONObject, boolean z) {
        this.b.a(new aaj.c<sw>(this) {
            public void a(sw swVar) {
                swVar.a("AFMA_updateActiveView", jSONObject);
            }

            public /* synthetic */ void a(Object obj) {
                a((sw) obj);
            }
        }, new b());
    }

    public boolean a() {
        return this.c;
    }

    public void b() {
        this.b.a(new aaj.c<sw>(this) {
            final /* synthetic */ mm a;

            {
                this.a = r1;
            }

            public void a(sw swVar) {
                this.a.b(swVar);
            }

            public /* synthetic */ void a(Object obj) {
                a((sw) obj);
            }
        }, new b());
        this.b.g_();
    }

    void b(sw swVar) {
        swVar.b("/visibilityChanged", this.f);
        swVar.b("/untrackActiveViewUnit", this.e);
        swVar.b("/updateActiveView", this.d);
    }
}
