package com.google.firebase.database;

import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzafa;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzafd;
import com.google.android.gms.internal.zzafe;
import com.google.android.gms.internal.zzait;
import com.google.android.gms.internal.zzaiv;
import com.google.android.gms.internal.zzaiw;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.Logger.Level;
import java.util.HashMap;
import java.util.Map;

public class FirebaseDatabase {
    private static final Map<String, FirebaseDatabase> zzbHk = new HashMap();
    private final FirebaseApp zzbHl;
    private final zzafd zzbHm;
    private final zzaev zzbHn;
    private zzafc zzbHo;

    private FirebaseDatabase(FirebaseApp firebaseApp, zzafd com_google_android_gms_internal_zzafd, zzaev com_google_android_gms_internal_zzaev) {
        this.zzbHl = firebaseApp;
        this.zzbHm = com_google_android_gms_internal_zzafd;
        this.zzbHn = com_google_android_gms_internal_zzaev;
    }

    public static FirebaseDatabase getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static synchronized FirebaseDatabase getInstance(FirebaseApp firebaseApp) {
        FirebaseDatabase firebaseDatabase;
        synchronized (FirebaseDatabase.class) {
            if (!zzbHk.containsKey(firebaseApp.getName())) {
                String databaseUrl = firebaseApp.getOptions().getDatabaseUrl();
                if (databaseUrl == null) {
                    throw new DatabaseException("Failed to get FirebaseDatabase instance: FirebaseApp object has no DatabaseURL in its FirebaseOptions object.");
                }
                zzait zzil = zzaiv.zzil(databaseUrl);
                if (zzil.zzbHw.isEmpty()) {
                    zzaev com_google_android_gms_internal_zzaev = new zzaev();
                    if (!firebaseApp.zzNU()) {
                        com_google_android_gms_internal_zzaev.zzie(firebaseApp.getName());
                    }
                    com_google_android_gms_internal_zzaev.zze(firebaseApp);
                    zzbHk.put(firebaseApp.getName(), new FirebaseDatabase(firebaseApp, zzil.zzbHm, com_google_android_gms_internal_zzaev));
                } else {
                    String valueOf = String.valueOf(zzil.zzbHw.toString());
                    throw new DatabaseException(new StringBuilder((String.valueOf(databaseUrl).length() + 114) + String.valueOf(valueOf).length()).append("Configured Database URL '").append(databaseUrl).append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ").append(valueOf).toString());
                }
            }
            firebaseDatabase = (FirebaseDatabase) zzbHk.get(firebaseApp.getName());
        }
        return firebaseDatabase;
    }

    public static String getSdkVersion() {
        return "3.0.0";
    }

    private synchronized void zzPi() {
        if (this.zzbHo == null) {
            this.zzbHo = zzafe.zza(this.zzbHn, this.zzbHm, this);
        }
    }

    private void zzhM(String str) {
        if (this.zzbHo != null) {
            throw new DatabaseException(new StringBuilder(String.valueOf(str).length() + 77).append("Calls to ").append(str).append("() must be made before any other usage of FirebaseDatabase instance.").toString());
        }
    }

    public FirebaseApp getApp() {
        return this.zzbHl;
    }

    public DatabaseReference getReference() {
        zzPi();
        return new DatabaseReference(this.zzbHo, zzafa.zzRq());
    }

    public DatabaseReference getReference(String str) {
        zzPi();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        zzaiw.zzir(str);
        return new DatabaseReference(this.zzbHo, new zzafa(str));
    }

    public DatabaseReference getReferenceFromUrl(String str) {
        zzPi();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'url' in FirebaseDatabase.getReferenceFromUrl()");
        }
        zzait zzil = zzaiv.zzil(str);
        if (zzil.zzbHm.zzbJa.equals(this.zzbHo.zzRz().zzbJa)) {
            return new DatabaseReference(this.zzbHo, zzil.zzbHw);
        }
        String valueOf = String.valueOf(getReference().toString());
        throw new DatabaseException(new StringBuilder((String.valueOf(str).length() + 93) + String.valueOf(valueOf).length()).append("Invalid URL (").append(str).append(") passed to getReference().  URL was expected to match configured Database URL: ").append(valueOf).toString());
    }

    public void goOffline() {
        zzPi();
        zzafe.zzk(this.zzbHo);
    }

    public void goOnline() {
        zzPi();
        zzafe.zzl(this.zzbHo);
    }

    public void purgeOutstandingWrites() {
        zzPi();
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ FirebaseDatabase a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzbHo.purgeOutstandingWrites();
            }
        });
    }

    public synchronized void setLogLevel(Level level) {
        zzhM("setLogLevel");
        this.zzbHn.setLogLevel(level);
    }

    public synchronized void setPersistenceEnabled(boolean z) {
        zzhM("setPersistenceEnabled");
        this.zzbHn.setPersistenceEnabled(z);
    }
}
