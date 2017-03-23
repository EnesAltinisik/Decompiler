package android.support.v7.c;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaRouteSelector */
public final class f {
    public static final f a = new f(new Bundle(), null);
    private final Bundle b;
    private List<String> c;

    /* compiled from: MediaRouteSelector */
    public static final class a {
        private ArrayList<String> a;

        public a(f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            fVar.e();
            if (!fVar.c.isEmpty()) {
                this.a = new ArrayList(fVar.c);
            }
        }

        public a a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.a == null) {
                this.a = new ArrayList();
            }
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            return this;
        }

        public a a(Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                for (String a : collection) {
                    a(a);
                }
            }
            return this;
        }

        public a a(f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            a(fVar.a());
            return this;
        }

        public f a() {
            if (this.a == null) {
                return f.a;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new f(bundle, this.a);
        }
    }

    private f(Bundle bundle, List<String> list) {
        this.b = bundle;
        this.c = list;
    }

    public List<String> a() {
        e();
        return this.c;
    }

    private void e() {
        if (this.c == null) {
            this.c = this.b.getStringArrayList("controlCategories");
            if (this.c == null || this.c.isEmpty()) {
                this.c = Collections.emptyList();
            }
        }
    }

    public boolean a(List<IntentFilter> list) {
        if (list != null) {
            e();
            int size = this.c.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = (IntentFilter) list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory((String) this.c.get(i2))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public boolean a(f fVar) {
        if (fVar == null) {
            return false;
        }
        e();
        fVar.e();
        return this.c.containsAll(fVar.c);
    }

    public boolean b() {
        e();
        return this.c.isEmpty();
    }

    public boolean c() {
        e();
        if (this.c.contains(null)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        e();
        fVar.e();
        return this.c.equals(fVar.c);
    }

    public int hashCode() {
        e();
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteSelector{ ");
        stringBuilder.append("controlCategories=").append(Arrays.toString(a().toArray()));
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public Bundle d() {
        return this.b;
    }

    public static f a(Bundle bundle) {
        return bundle != null ? new f(bundle, null) : null;
    }
}
