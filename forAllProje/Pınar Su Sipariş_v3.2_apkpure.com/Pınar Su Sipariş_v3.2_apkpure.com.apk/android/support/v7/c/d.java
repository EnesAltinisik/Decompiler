package android.support.v7.c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaRouteProviderDescriptor */
public final class d {
    private final Bundle a;
    private List<a> b;

    /* compiled from: MediaRouteProviderDescriptor */
    public static final class a {
        private final Bundle a = new Bundle();
        private ArrayList<a> b;

        public a a(a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (this.b == null) {
                this.b = new ArrayList();
            } else if (this.b.contains(aVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.b.add(aVar);
            return this;
        }

        public d a() {
            if (this.b != null) {
                int size = this.b.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(((a) this.b.get(i)).q());
                }
                this.a.putParcelableArrayList("routes", arrayList);
            }
            return new d(this.a, this.b);
        }
    }

    private d(Bundle bundle, List<a> list) {
        this.a = bundle;
        this.b = list;
    }

    public List<a> a() {
        c();
        return this.b;
    }

    private void c() {
        if (this.b == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList("routes");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                this.b = Collections.emptyList();
                return;
            }
            int size = parcelableArrayList.size();
            this.b = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                this.b.add(a.a((Bundle) parcelableArrayList.get(i)));
            }
        }
    }

    public boolean b() {
        c();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.b.get(i);
            if (aVar == null || !aVar.p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteProviderDescriptor{ ");
        stringBuilder.append("routes=").append(Arrays.toString(a().toArray()));
        stringBuilder.append(", isValid=").append(b());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public static d a(Bundle bundle) {
        return bundle != null ? new d(bundle, null) : null;
    }
}
