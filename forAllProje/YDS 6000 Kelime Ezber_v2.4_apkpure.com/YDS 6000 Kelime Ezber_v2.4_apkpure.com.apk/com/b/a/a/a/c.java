package com.b.a.a.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends a {
    private static final Date a = new Date(2012, 12, 5);
    private static final Date b = new Date(2015, 7, 20);
    private com.a.a.a.a c;
    private String d;
    private String e;
    private b f;
    private b g;
    private b h;
    private String i;
    private ServiceConnection j = new ServiceConnection(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.a.c = com.a.a.a.a.a.a(iBinder);
            new a().execute(new Void[0]);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.a.c = null;
        }
    };

    private class a extends AsyncTask<Void, Void, Boolean> {
        final /* synthetic */ c a;

        private a(c cVar) {
            this.a = cVar;
        }

        protected Boolean a(Void... voidArr) {
            if (this.a.h()) {
                return Boolean.valueOf(false);
            }
            this.a.e();
            return Boolean.valueOf(true);
        }

        protected void a(Boolean bool) {
            if (bool.booleanValue()) {
                this.a.i();
                if (this.a.h != null) {
                    this.a.h.c_();
                }
            }
            if (this.a.h != null) {
                this.a.h.d_();
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((Boolean) obj);
        }
    }

    public interface b {
        void a(int i, Throwable th);

        void a(String str, h hVar);

        void c_();

        void d_();
    }

    public c(Context context, String str, String str2, b bVar) {
        super(context.getApplicationContext());
        this.e = str;
        this.h = bVar;
        this.d = a().getPackageName();
        this.f = new b(a(), ".products.cache.v2_6");
        this.g = new b(a(), ".subscriptions.cache.v2_6");
        this.i = str2;
        g();
    }

    private String a(JSONObject jSONObject) {
        String str = null;
        try {
            if (jSONObject.has("developerPayload")) {
                str = jSONObject.getString("developerPayload");
            }
        } catch (JSONException e) {
            Log.e("iabv3", "Failed to extract developer payload value!");
        }
        return str != null ? str : "";
    }

    private boolean a(Activity activity, String str, String str2, String str3) {
        return a(activity, null, str, str2, str3);
    }

    private boolean a(Activity activity, List<String> list, String str, String str2, String str3) {
        if (!d() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            String str4 = str2 + ":" + str;
            if (!str2.equals("subs")) {
                str4 = str4 + ":" + UUID.randomUUID().toString();
            }
            if (str3 != null) {
                str4 = str4 + ":" + str3;
            }
            e(str4);
            Bundle a = (list == null || !str2.equals("subs")) ? this.c.a(3, this.d, str, str2, str4) : this.c.a(5, this.d, list, str, str2, str4);
            if (a != null) {
                int i = a.getInt("RESPONSE_CODE");
                if (i == 0) {
                    PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
                    if (activity != null && pendingIntent != null) {
                        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 32459, new Intent(), 0, 0, 0);
                    } else if (this.h != null) {
                        this.h.a(103, null);
                    }
                } else if (i == 7) {
                    if (!(a(str) || b(str))) {
                        e();
                    }
                    h c = c(str);
                    if (!a(c)) {
                        Log.i("iabv3", "Invalid or tampered merchant id!");
                        if (this.h != null) {
                            this.h.a(104, null);
                        }
                        return false;
                    } else if (this.h != null) {
                        if (c == null) {
                            c = d(str);
                        }
                        this.h.a(str, c);
                    }
                } else if (this.h != null) {
                    this.h.a(101, null);
                }
            }
            return true;
        } catch (Throwable e) {
            Log.e("iabv3", "Error in purchase", e);
            if (this.h != null) {
                this.h.a(110, e);
            }
            return false;
        }
    }

    public static boolean a(Context context) {
        List queryIntentServices = context.getPackageManager().queryIntentServices(f(), 0);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }

    private boolean a(h hVar) {
        if (this.i == null || hVar.d.before(a) || hVar.d.after(b)) {
            return true;
        }
        if (hVar.b == null || hVar.b.trim().length() == 0) {
            return false;
        }
        int indexOf = hVar.b.indexOf(46);
        return indexOf <= 0 ? false : hVar.b.substring(0, indexOf).compareTo(this.i) == 0;
    }

    private boolean a(String str, b bVar) {
        if (!d()) {
            return false;
        }
        try {
            Bundle a = this.c.a(3, this.d, str, null);
            if (a.getInt("RESPONSE_CODE") == 0) {
                bVar.c();
                ArrayList stringArrayList = a.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList2 = a.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList != null) {
                    int i = 0;
                    while (i < stringArrayList.size()) {
                        String str2 = (String) stringArrayList.get(i);
                        if (!TextUtils.isEmpty(str2)) {
                            JSONObject jSONObject = new JSONObject(str2);
                            String str3 = (stringArrayList2 == null || stringArrayList2.size() <= i) ? null : (String) stringArrayList2.get(i);
                            bVar.a(jSONObject.getString("productId"), str2, str3);
                        }
                        i++;
                    }
                }
            }
            return true;
        } catch (Throwable e) {
            if (this.h != null) {
                this.h.a(100, e);
            }
            Log.e("iabv3", "Error in loadPurchasesByType", e);
            return false;
        }
    }

    private boolean a(String str, String str2, String str3) {
        try {
            return TextUtils.isEmpty(this.e) || g.a(str, this.e, str2, str3);
        } catch (Exception e) {
            return false;
        }
    }

    private h b(String str, b bVar) {
        e b = bVar.b(str);
        if (!(b == null || TextUtils.isEmpty(b.a))) {
            try {
                return new h(b);
            } catch (Throwable e) {
                Log.e("iabv3", "Failed to load saved purchase details for " + str, e);
            }
        }
        return null;
    }

    private boolean c(String str, String str2) {
        return str.equals(str2);
    }

    private void e(String str) {
        a(b() + ".purchase.last.v2_6", str);
    }

    private static Intent f() {
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        return intent;
    }

    private void g() {
        try {
            a().bindService(f(), this.j, 1);
        } catch (Throwable e) {
            Log.e("iabv3", "error in bindPlayServices", e);
            if (this.h != null) {
                this.h.a(113, e);
            }
        }
    }

    private boolean h() {
        return a(b() + ".products.restored.v2_6", false);
    }

    private void i() {
        a(b() + ".products.restored.v2_6", Boolean.valueOf(true));
    }

    private String j() {
        return b(b() + ".purchase.last.v2_6", null);
    }

    public boolean a(int i, int i2, Intent intent) {
        if (i != 32459) {
            return false;
        }
        if (intent == null) {
            Log.e("iabv3", "handleActivityResult: data is null!");
            return false;
        }
        int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
        Log.d("iabv3", String.format("resultCode = %d, responseCode = %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(intExtra)}));
        String j = j();
        if (i2 == -1 && intExtra == 0 && !TextUtils.isEmpty(j)) {
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            try {
                JSONObject jSONObject = new JSONObject(stringExtra);
                String string = jSONObject.getString("productId");
                String a = a(jSONObject);
                boolean startsWith = j.startsWith("subs");
                if (!c(j, a)) {
                    Log.e("iabv3", String.format("Payload mismatch: %s != %s", new Object[]{j, a}));
                    if (this.h != null) {
                        this.h.a(105, null);
                    }
                } else if (a(string, stringExtra, stringExtra2)) {
                    (startsWith ? this.g : this.f).a(string, stringExtra, stringExtra2);
                    if (this.h != null) {
                        this.h.a(string, new h(new e(stringExtra, stringExtra2)));
                    }
                } else {
                    Log.e("iabv3", "Public key signature doesn't match!");
                    if (this.h != null) {
                        this.h.a(102, null);
                    }
                }
            } catch (Throwable e) {
                Log.e("iabv3", "Error in handleActivityResult", e);
                if (this.h != null) {
                    this.h.a(110, e);
                }
            }
        } else if (this.h != null) {
            this.h.a(intExtra, null);
        }
        return true;
    }

    public boolean a(Activity activity, String str) {
        return a(activity, str, "inapp", null);
    }

    public boolean a(String str) {
        return this.f.a(str);
    }

    public boolean b(String str) {
        return this.g.a(str);
    }

    public h c(String str) {
        return b(str, this.f);
    }

    public void c() {
        if (d() && this.j != null) {
            try {
                a().unbindService(this.j);
            } catch (Throwable e) {
                Log.e("iabv3", "Error in release", e);
            }
            this.c = null;
        }
    }

    public h d(String str) {
        return b(str, this.g);
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return d() && a("inapp", this.f) && a("subs", this.g);
    }
}
