package android.support.v7.c;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaRouteDescriptor */
public final class a {
    private final Bundle a;
    private List<IntentFilter> b;

    /* compiled from: MediaRouteDescriptor */
    public static final class a {
        private final Bundle a;
        private ArrayList<IntentFilter> b;

        public a(String str, String str2) {
            this.a = new Bundle();
            a(str);
            b(str2);
        }

        public a(a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            this.a = new Bundle(aVar.a);
            aVar.r();
            if (!aVar.b.isEmpty()) {
                this.b = new ArrayList(aVar.b);
            }
        }

        public a a(String str) {
            this.a.putString("id", str);
            return this;
        }

        public a b(String str) {
            this.a.putString("name", str);
            return this;
        }

        public a c(String str) {
            this.a.putString("status", str);
            return this;
        }

        public a a(boolean z) {
            this.a.putBoolean("enabled", z);
            return this;
        }

        public a b(boolean z) {
            this.a.putBoolean("connecting", z);
            return this;
        }

        public a a(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (!this.b.contains(intentFilter)) {
                this.b.add(intentFilter);
            }
            return this;
        }

        public a a(Collection<IntentFilter> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                for (IntentFilter a : collection) {
                    a(a);
                }
            }
            return this;
        }

        public a a(int i) {
            this.a.putInt("playbackType", i);
            return this;
        }

        public a b(int i) {
            this.a.putInt("playbackStream", i);
            return this;
        }

        public a c(int i) {
            this.a.putInt("volume", i);
            return this;
        }

        public a d(int i) {
            this.a.putInt("volumeMax", i);
            return this;
        }

        public a e(int i) {
            this.a.putInt("volumeHandling", i);
            return this;
        }

        public a f(int i) {
            this.a.putInt("presentationDisplayId", i);
            return this;
        }

        public a a() {
            if (this.b != null) {
                this.a.putParcelableArrayList("controlFilters", this.b);
            }
            return new a(this.a, this.b);
        }
    }

    private a(Bundle bundle, List<IntentFilter> list) {
        this.a = bundle;
        this.b = list;
    }

    public String a() {
        return this.a.getString("id");
    }

    public String b() {
        return this.a.getString("name");
    }

    public String c() {
        return this.a.getString("status");
    }

    public boolean d() {
        return this.a.getBoolean("enabled", true);
    }

    public boolean e() {
        return this.a.getBoolean("connecting", false);
    }

    public boolean f() {
        return this.a.getBoolean("canDisconnect", false);
    }

    public IntentSender g() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public List<IntentFilter> h() {
        r();
        return this.b;
    }

    private void r() {
        if (this.b == null) {
            this.b = this.a.getParcelableArrayList("controlFilters");
            if (this.b == null) {
                this.b = Collections.emptyList();
            }
        }
    }

    public int i() {
        return this.a.getInt("playbackType", 1);
    }

    public int j() {
        return this.a.getInt("playbackStream", -1);
    }

    public int k() {
        return this.a.getInt("volume");
    }

    public int l() {
        return this.a.getInt("volumeMax");
    }

    public int m() {
        return this.a.getInt("volumeHandling", 0);
    }

    public int n() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public Bundle o() {
        return this.a.getBundle("extras");
    }

    public boolean p() {
        r();
        if (TextUtils.isEmpty(a()) || TextUtils.isEmpty(b()) || this.b.contains(null)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteDescriptor{ ");
        stringBuilder.append("id=").append(a());
        stringBuilder.append(", name=").append(b());
        stringBuilder.append(", description=").append(c());
        stringBuilder.append(", isEnabled=").append(d());
        stringBuilder.append(", isConnecting=").append(e());
        stringBuilder.append(", controlFilters=").append(Arrays.toString(h().toArray()));
        stringBuilder.append(", playbackType=").append(i());
        stringBuilder.append(", playbackStream=").append(j());
        stringBuilder.append(", volume=").append(k());
        stringBuilder.append(", volumeMax=").append(l());
        stringBuilder.append(", volumeHandling=").append(m());
        stringBuilder.append(", presentationDisplayId=").append(n());
        stringBuilder.append(", extras=").append(o());
        stringBuilder.append(", isValid=").append(p());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public Bundle q() {
        return this.a;
    }

    public static a a(Bundle bundle) {
        return bundle != null ? new a(bundle, null) : null;
    }
}
