package com.google.android.gms.internal;

public class zzafx {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzafx.class.desiredAssertionStatus());
    public static final zzafx zzbOu = new zzafx(a.User, null, false);
    public static final zzafx zzbOv = new zzafx(a.Server, null, false);
    private final a zzbOw;
    private final zzagt zzbOx;
    private final boolean zzbOy;

    private enum a {
        User,
        Server
    }

    public zzafx(a aVar, zzagt com_google_android_gms_internal_zzagt, boolean z) {
        this.zzbOw = aVar;
        this.zzbOx = com_google_android_gms_internal_zzagt;
        this.zzbOy = z;
        if (!$assertionsDisabled && z && !zzSc()) {
            throw new AssertionError();
        }
    }

    public static zzafx zzc(zzagt com_google_android_gms_internal_zzagt) {
        return new zzafx(a.Server, com_google_android_gms_internal_zzagt, true);
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbOw);
        String valueOf2 = String.valueOf(this.zzbOx);
        return new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()).append("OperationSource{source=").append(valueOf).append(", queryParams=").append(valueOf2).append(", tagged=").append(this.zzbOy).append("}").toString();
    }

    public boolean zzSb() {
        return this.zzbOw == a.User;
    }

    public boolean zzSc() {
        return this.zzbOw == a.Server;
    }

    public boolean zzSd() {
        return this.zzbOy;
    }

    public zzagt zzSe() {
        return this.zzbOx;
    }
}
