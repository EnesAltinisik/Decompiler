package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahg.zza;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.EventTarget;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.RunLoop;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class zzaeu {
    private static zzafb zzbLv;
    protected long cacheSize = 10485760;
    protected FirebaseApp zzbHJ;
    protected zzahg zzbIW;
    protected boolean zzbIX;
    protected String zzbIZ;
    private boolean zzbLb = false;
    protected EventTarget zzbLp;
    protected zzaeq zzbLq;
    protected RunLoop zzbLr;
    protected String zzbLs;
    protected zza zzbLt = zza.INFO;
    private boolean zzbLu = false;

    class AnonymousClass1 implements zzaee {
        final /* synthetic */ zzaeq a;

        AnonymousClass1(zzaeq com_google_android_gms_internal_zzaeq) {
            this.a = com_google_android_gms_internal_zzaeq;
        }

        public void zza(boolean z, final zzaee.zza com_google_android_gms_internal_zzaee_zza) {
            this.a.zza(z, new zzaeq.zza(this) {
                final /* synthetic */ AnonymousClass1 b;

                public void onError(String str) {
                    com_google_android_gms_internal_zzaee_zza.onError(str);
                }

                public void zzhT(String str) {
                    com_google_android_gms_internal_zzaee_zza.zzhT(str);
                }
            });
        }
    }

    private ScheduledExecutorService zzPV() {
        RunLoop zzRc = zzRc();
        if (zzRc instanceof zzaip) {
            return ((zzaip) zzRc).zzPV();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    private zzafb zzQR() {
        if (zzbLv == null) {
            if (zzail.zzUh()) {
                zzQS();
            } else if (e.a()) {
                zzafb com_google_android_gms_internal_zzafb = e.INSTANCE;
                com_google_android_gms_internal_zzafb.b();
                zzbLv = com_google_android_gms_internal_zzafb;
            } else {
                zzbLv = f.INSTANCE;
            }
        }
        return zzbLv;
    }

    private synchronized void zzQS() {
        zzbLv = new zzadp(this.zzbHJ);
    }

    private void zzQV() {
        zzRf();
        zzQR();
        zzRi();
        zzRh();
        zzRg();
        zzRk();
        zzRj();
    }

    private void zzQW() {
        this.zzbLp.restart();
        this.zzbLr.restart();
    }

    private void zzRf() {
        if (this.zzbIW == null) {
            this.zzbIW = zzQR().zza(this, this.zzbLt, null);
        }
    }

    private void zzRg() {
        if (this.zzbLr == null) {
            this.zzbLr = zzbLv.zzb(this);
        }
    }

    private void zzRh() {
        if (this.zzbLp == null) {
            this.zzbLp = zzQR().zza(this);
        }
    }

    private void zzRi() {
        if (this.zzbIZ == null) {
            this.zzbIZ = zzid(zzQR().zzc(this));
        }
    }

    private void zzRj() {
        if (this.zzbLq == null) {
            this.zzbLq = zzQR().zza(zzPV());
        }
    }

    private void zzRk() {
        if (this.zzbLs == null) {
            this.zzbLs = "default";
        }
    }

    private static zzaee zza(zzaeq com_google_android_gms_internal_zzaeq) {
        return new AnonymousClass1(com_google_android_gms_internal_zzaeq);
    }

    private String zzid(String str) {
        return "Firebase/" + "5" + "/" + FirebaseDatabase.getSdkVersion() + "/" + str;
    }

    void stop() {
        this.zzbLu = true;
        this.zzbLp.shutdown();
        this.zzbLr.shutdown();
    }

    public zzahg zzPT() {
        return this.zzbIW;
    }

    public boolean zzPW() {
        return this.zzbIX;
    }

    public zza zzQD() {
        return this.zzbLt;
    }

    synchronized void zzQH() {
        if (!this.zzbLb) {
            this.zzbLb = true;
            zzQV();
        }
    }

    public boolean zzQT() {
        return this.zzbLb;
    }

    public void zzQU() {
        if (this.zzbLu) {
            zzQW();
            this.zzbLu = false;
        }
    }

    protected void zzQX() {
        if (zzQT()) {
            throw new DatabaseException("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public List<String> zzQY() {
        return null;
    }

    public zzaef zzQZ() {
        return new zzaef(zzPT(), zza(zzRe()), zzPV(), zzPW(), FirebaseDatabase.getSdkVersion(), zziJ());
    }

    public long zzRa() {
        return this.cacheSize;
    }

    public EventTarget zzRb() {
        return this.zzbLp;
    }

    public RunLoop zzRc() {
        return this.zzbLr;
    }

    public String zzRd() {
        return this.zzbLs;
    }

    public zzaeq zzRe() {
        return this.zzbLq;
    }

    public zzaej zza(zzaeh com_google_android_gms_internal_zzaeh, zzaej.zza com_google_android_gms_internal_zzaej_zza) {
        return zzQR().zza(this, zzQZ(), com_google_android_gms_internal_zzaeh, com_google_android_gms_internal_zzaej_zza);
    }

    public String zziJ() {
        return this.zzbIZ;
    }

    public zzahf zzib(String str) {
        return new zzahf(this.zzbIW, str);
    }

    zzagd zzic(String str) {
        if (!this.zzbIX) {
            return new zzagc();
        }
        zzagd zza = zzbLv.zza(this, str);
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }
}
