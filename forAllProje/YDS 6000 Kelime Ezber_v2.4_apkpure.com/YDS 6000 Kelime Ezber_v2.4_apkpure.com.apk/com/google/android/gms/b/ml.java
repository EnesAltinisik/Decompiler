package com.google.android.gms.b;

import java.util.Map;
import org.json.JSONObject;

@vz
public class ml implements mn {
    private final mj a;
    private final sw b;
    private final rq c = new rq(this) {
        final /* synthetic */ ml a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            this.a.a.a(com_google_android_gms_b_aaq, (Map) map);
        }
    };
    private final rq d = new rq(this) {
        final /* synthetic */ ml a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            this.a.a.a(this.a, (Map) map);
        }
    };
    private final rq e = new rq(this) {
        final /* synthetic */ ml a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            this.a.a.b((Map) map);
        }
    };

    public ml(mj mjVar, sw swVar) {
        this.a = mjVar;
        this.b = swVar;
        a(this.b);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.a.r().d());
        zy.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    void a(sw swVar) {
        swVar.a("/updateActiveView", this.c);
        swVar.a("/untrackActiveViewUnit", this.d);
        swVar.a("/visibilityChanged", this.e);
    }

    public void a(JSONObject jSONObject, boolean z) {
        if (z) {
            this.a.b((mn) this);
        } else {
            this.b.a("AFMA_updateActiveView", jSONObject);
        }
    }

    public boolean a() {
        return true;
    }

    public void b() {
        b(this.b);
    }

    void b(sw swVar) {
        swVar.b("/visibilityChanged", this.e);
        swVar.b("/untrackActiveViewUnit", this.d);
        swVar.b("/updateActiveView", this.c);
    }
}
