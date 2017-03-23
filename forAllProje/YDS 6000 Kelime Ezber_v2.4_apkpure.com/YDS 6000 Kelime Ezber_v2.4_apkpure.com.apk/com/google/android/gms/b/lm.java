package com.google.android.gms.b;

import java.io.IOException;

public class lm extends IOException {
    public lm(String str) {
        super(str);
    }

    static lm a() {
        return new lm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static lm b() {
        return new lm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static lm c() {
        return new lm("CodedInputStream encountered a malformed varint.");
    }

    static lm d() {
        return new lm("Protocol message contained an invalid tag (zero).");
    }

    static lm e() {
        return new lm("Protocol message end-group tag did not match expected tag.");
    }

    static lm f() {
        return new lm("Protocol message tag had invalid wire type.");
    }

    static lm g() {
        return new lm("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
