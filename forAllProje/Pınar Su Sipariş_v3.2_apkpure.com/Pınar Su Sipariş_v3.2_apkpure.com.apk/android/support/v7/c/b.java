package android.support.v7.c;

import android.os.Bundle;

/* compiled from: MediaRouteDiscoveryRequest */
public final class b {
    private final Bundle a;
    private f b;

    public b(f fVar, boolean z) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        this.a = new Bundle();
        this.b = fVar;
        this.a.putBundle("selector", fVar.d());
        this.a.putBoolean("activeScan", z);
    }

    public f a() {
        e();
        return this.b;
    }

    private void e() {
        if (this.b == null) {
            this.b = f.a(this.a.getBundle("selector"));
            if (this.b == null) {
                this.b = f.a;
            }
        }
    }

    public boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public boolean c() {
        e();
        return this.b.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (a().equals(bVar.a()) && b() == bVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (b() ? 1 : 0) ^ a().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiscoveryRequest{ selector=").append(a());
        stringBuilder.append(", activeScan=").append(b());
        stringBuilder.append(", isValid=").append(c());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public Bundle d() {
        return this.a;
    }
}
