package okhttp3.internal.framed;

import b.f;

public final class Header {
    public static final f RESPONSE_STATUS = f.a(":status");
    public static final f TARGET_AUTHORITY = f.a(":authority");
    public static final f TARGET_HOST = f.a(":host");
    public static final f TARGET_METHOD = f.a(":method");
    public static final f TARGET_PATH = f.a(":path");
    public static final f TARGET_SCHEME = f.a(":scheme");
    public static final f VERSION = f.a(":version");
    final int hpackSize;
    public final f name;
    public final f value;

    public Header(String str, String str2) {
        this(f.a(str), f.a(str2));
    }

    public Header(f fVar, String str) {
        this(fVar, f.a(str));
    }

    public Header(f fVar, f fVar2) {
        this.name = fVar;
        this.value = fVar2;
        this.hpackSize = (fVar.f() + 32) + fVar2.f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (this.name.equals(header.name) && this.value.equals(header.value)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.name.hashCode() + 527) * 31) + this.value.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.name.a(), this.value.a()});
    }
}
