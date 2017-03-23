package com.google.android.gms.b;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@vz
public class sy implements sx {
    private final sw a;
    private final HashSet<SimpleEntry<String, rq>> b = new HashSet();

    public sy(sw swVar) {
        this.a = swVar;
    }

    public void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((rq) simpleEntry.getValue()).toString());
            ze.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.a.b((String) simpleEntry.getKey(), (rq) simpleEntry.getValue());
        }
        this.b.clear();
    }

    public void a(String str, rq rqVar) {
        this.a.a(str, rqVar);
        this.b.add(new SimpleEntry(str, rqVar));
    }

    public void a(String str, String str2) {
        this.a.a(str, str2);
    }

    public void a(String str, JSONObject jSONObject) {
        this.a.a(str, jSONObject);
    }

    public void b(String str, rq rqVar) {
        this.a.b(str, rqVar);
        this.b.remove(new SimpleEntry(str, rqVar));
    }

    public void b(String str, JSONObject jSONObject) {
        this.a.b(str, jSONObject);
    }
}
