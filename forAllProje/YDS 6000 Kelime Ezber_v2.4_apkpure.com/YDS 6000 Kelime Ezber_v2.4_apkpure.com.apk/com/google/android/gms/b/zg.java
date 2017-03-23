package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.concurrent.Future;

@vz
public final class zg {

    public interface b {
        void a(Bundle bundle);
    }

    private static abstract class a extends zd {
        private a() {
        }

        public void b() {
        }
    }

    class AnonymousClass10 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ b b;

        AnonymousClass10(Context context, b bVar) {
            this.a = context;
            this.b = bVar;
            super();
        }

        public void a() {
            SharedPreferences a = zg.a(this.a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", a.getBoolean("auto_collect_location", false));
            if (this.b != null) {
                this.b.a(bundle);
            }
        }
    }

    class AnonymousClass11 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        AnonymousClass11(Context context, String str, long j) {
            this.a = context;
            this.b = str;
            this.c = j;
            super();
        }

        public void a() {
            Editor edit = zg.a(this.a).edit();
            edit.putString("app_settings_json", this.b);
            edit.putLong("app_settings_last_update_ms", this.c);
            edit.apply();
        }
    }

    class AnonymousClass12 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ b b;

        AnonymousClass12(Context context, b bVar) {
            this.a = context;
            this.b = bVar;
            super();
        }

        public void a() {
            SharedPreferences a = zg.a(this.a);
            Bundle bundle = new Bundle();
            bundle.putString("app_settings_json", a.getString("app_settings_json", ""));
            bundle.putLong("app_settings_last_update_ms", a.getLong("app_settings_last_update_ms", 0));
            if (this.b != null) {
                this.b.a(bundle);
            }
        }
    }

    class AnonymousClass13 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ long b;

        AnonymousClass13(Context context, long j) {
            this.a = context;
            this.b = j;
            super();
        }

        public void a() {
            Editor edit = zg.a(this.a).edit();
            edit.putLong("app_last_background_time_ms", this.b);
            edit.apply();
        }
    }

    class AnonymousClass14 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ b b;

        AnonymousClass14(Context context, b bVar) {
            this.a = context;
            this.b = bVar;
            super();
        }

        public void a() {
            SharedPreferences a = zg.a(this.a);
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", a.getLong("app_last_background_time_ms", 0));
            if (this.b != null) {
                this.b.a(bundle);
            }
        }
    }

    class AnonymousClass15 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ int b;

        AnonymousClass15(Context context, int i) {
            this.a = context;
            this.b = i;
            super();
        }

        public void a() {
            Editor edit = zg.a(this.a).edit();
            edit.putInt("request_in_session_count", this.b);
            edit.apply();
        }
    }

    class AnonymousClass1 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ boolean b;

        AnonymousClass1(Context context, boolean z) {
            this.a = context;
            this.b = z;
            super();
        }

        public void a() {
            Editor edit = zg.a(this.a).edit();
            edit.putBoolean("use_https", this.b);
            edit.apply();
        }
    }

    class AnonymousClass2 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ b b;

        AnonymousClass2(Context context, b bVar) {
            this.a = context;
            this.b = bVar;
            super();
        }

        public void a() {
            SharedPreferences a = zg.a(this.a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("use_https", a.getBoolean("use_https", true));
            if (this.b != null) {
                this.b.a(bundle);
            }
        }
    }

    class AnonymousClass3 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ b b;

        AnonymousClass3(Context context, b bVar) {
            this.a = context;
            this.b = bVar;
            super();
        }

        public void a() {
            SharedPreferences a = zg.a(this.a);
            Bundle bundle = new Bundle();
            bundle.putInt("webview_cache_version", a.getInt("webview_cache_version", 0));
            if (this.b != null) {
                this.b.a(bundle);
            }
        }
    }

    class AnonymousClass4 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ boolean b;

        AnonymousClass4(Context context, boolean z) {
            this.a = context;
            this.b = z;
            super();
        }

        public void a() {
            Editor edit = zg.a(this.a).edit();
            edit.putBoolean("content_url_opted_out", this.b);
            edit.apply();
        }
    }

    class AnonymousClass5 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ b b;

        AnonymousClass5(Context context, b bVar) {
            this.a = context;
            this.b = bVar;
            super();
        }

        public void a() {
            SharedPreferences a = zg.a(this.a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", a.getBoolean("content_url_opted_out", true));
            if (this.b != null) {
                this.b.a(bundle);
            }
        }
    }

    class AnonymousClass6 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        AnonymousClass6(Context context, String str) {
            this.a = context;
            this.b = str;
            super();
        }

        public void a() {
            Editor edit = zg.a(this.a).edit();
            edit.putString("content_url_hashes", this.b);
            edit.apply();
        }
    }

    class AnonymousClass7 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ b b;

        AnonymousClass7(Context context, b bVar) {
            this.a = context;
            this.b = bVar;
            super();
        }

        public void a() {
            SharedPreferences a = zg.a(this.a);
            Bundle bundle = new Bundle();
            bundle.putString("content_url_hashes", a.getString("content_url_hashes", ""));
            if (this.b != null) {
                this.b.a(bundle);
            }
        }
    }

    class AnonymousClass8 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        AnonymousClass8(Context context, String str) {
            this.a = context;
            this.b = str;
            super();
        }

        public void a() {
            Editor edit = zg.a(this.a).edit();
            edit.putString("content_vertical_hashes", this.b);
            edit.apply();
        }
    }

    class AnonymousClass9 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ boolean b;

        AnonymousClass9(Context context, boolean z) {
            this.a = context;
            this.b = z;
            super();
        }

        public void a() {
            Editor edit = zg.a(this.a).edit();
            edit.putBoolean("auto_collect_location", this.b);
            edit.apply();
        }
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("admob", 0);
    }

    public static Future a(Context context, int i) {
        return (Future) new AnonymousClass15(context, i).e();
    }

    public static Future a(Context context, long j) {
        return (Future) new AnonymousClass13(context, j).e();
    }

    public static Future a(Context context, b bVar) {
        return (Future) new AnonymousClass2(context, bVar).e();
    }

    public static Future a(Context context, String str) {
        return (Future) new AnonymousClass6(context, str).e();
    }

    public static Future a(Context context, String str, long j) {
        return (Future) new AnonymousClass11(context, str, j).e();
    }

    public static Future a(Context context, boolean z) {
        return (Future) new AnonymousClass1(context, z).e();
    }

    public static Future b(Context context, b bVar) {
        return (Future) new AnonymousClass3(context, bVar).e();
    }

    public static Future b(Context context, String str) {
        return (Future) new AnonymousClass8(context, str).e();
    }

    public static Future b(Context context, boolean z) {
        return (Future) new AnonymousClass4(context, z).e();
    }

    public static Future c(Context context, b bVar) {
        return (Future) new AnonymousClass5(context, bVar).e();
    }

    public static Future c(Context context, boolean z) {
        return (Future) new AnonymousClass9(context, z).e();
    }

    public static Future d(Context context, b bVar) {
        return (Future) new AnonymousClass7(context, bVar).e();
    }

    public static Future e(Context context, b bVar) {
        return (Future) new AnonymousClass10(context, bVar).e();
    }

    public static Future f(Context context, b bVar) {
        return (Future) new AnonymousClass12(context, bVar).e();
    }

    public static Future g(Context context, b bVar) {
        return (Future) new AnonymousClass14(context, bVar).e();
    }
}
