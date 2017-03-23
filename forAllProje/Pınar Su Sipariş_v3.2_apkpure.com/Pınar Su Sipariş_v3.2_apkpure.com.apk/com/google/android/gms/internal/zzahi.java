package com.google.android.gms.internal;

public class zzahi implements Comparable<zzahi> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzahi.class.desiredAssertionStatus());
    private static final zzahi zzbQA = new zzahi("[MAX_KEY]");
    private static final zzahi zzbQB = new zzahi(".priority");
    private static final zzahi zzbQC = new zzahi(".info");
    private static final zzahi zzbQz = new zzahi("[MIN_KEY]");
    private final String zzaB;

    private static class a extends zzahi {
        private final int a;

        a(String str, int i) {
            super(str);
            this.a = i;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return super.zzi((zzahi) obj);
        }

        protected int intValue() {
            return this.a;
        }

        public String toString() {
            String zzj = this.zzaB;
            return new StringBuilder(String.valueOf(zzj).length() + 20).append("IntegerChildName(\"").append(zzj).append("\")").toString();
        }

        protected boolean zzTm() {
            return true;
        }
    }

    private zzahi(String str) {
        this.zzaB = str;
    }

    public static zzahi zzTh() {
        return zzbQz;
    }

    public static zzahi zzTi() {
        return zzbQA;
    }

    public static zzahi zzTj() {
        return zzbQB;
    }

    public static zzahi zzTk() {
        return zzbQC;
    }

    public static zzahi zzig(String str) {
        Integer zzio = zzaiv.zzio(str);
        if (zzio != null) {
            return new a(str, zzio.intValue());
        }
        if (str.equals(".priority")) {
            return zzbQB;
        }
        if ($assertionsDisabled || !str.contains("/")) {
            return new zzahi(str);
        }
        throw new AssertionError();
    }

    public String asString() {
        return this.zzaB;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzi((zzahi) obj);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzahi)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.zzaB.equals(((zzahi) obj).zzaB);
    }

    public int hashCode() {
        return this.zzaB.hashCode();
    }

    protected int intValue() {
        return 0;
    }

    public String toString() {
        String str = this.zzaB;
        return new StringBuilder(String.valueOf(str).length() + 12).append("ChildKey(\"").append(str).append("\")").toString();
    }

    public boolean zzTl() {
        return this == zzbQB;
    }

    protected boolean zzTm() {
        return false;
    }

    public int zzi(zzahi com_google_android_gms_internal_zzahi) {
        if (this == com_google_android_gms_internal_zzahi) {
            return 0;
        }
        if (this == zzbQz || com_google_android_gms_internal_zzahi == zzbQA) {
            return -1;
        }
        if (com_google_android_gms_internal_zzahi == zzbQz || this == zzbQA) {
            return 1;
        }
        if (!zzTm()) {
            return com_google_android_gms_internal_zzahi.zzTm() ? 1 : this.zzaB.compareTo(com_google_android_gms_internal_zzahi.zzaB);
        } else {
            if (!com_google_android_gms_internal_zzahi.zzTm()) {
                return -1;
            }
            int zzC = zzaiv.zzC(intValue(), com_google_android_gms_internal_zzahi.intValue());
            return zzC == 0 ? zzaiv.zzC(this.zzaB.length(), com_google_android_gms_internal_zzahi.zzaB.length()) : zzC;
        }
    }
}
