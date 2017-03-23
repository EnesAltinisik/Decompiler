package com.google.android.gms.b;

public class ha {
    public String a;
    public boolean b;
    public String c;
    public String d;

    public String toString() {
        String str = this.b ? "s" : "";
        String str2 = this.a;
        return new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append("http").append(str).append("://").append(str2).toString();
    }
}
