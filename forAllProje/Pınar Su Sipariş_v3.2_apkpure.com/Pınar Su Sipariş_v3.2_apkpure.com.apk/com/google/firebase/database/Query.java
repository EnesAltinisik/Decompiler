package com.google.firebase.database;

import com.google.android.gms.internal.zzaer;
import com.google.android.gms.internal.zzaew;
import com.google.android.gms.internal.zzafa;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzafs;
import com.google.android.gms.internal.zzagt;
import com.google.android.gms.internal.zzagu;
import com.google.android.gms.internal.zzahh;
import com.google.android.gms.internal.zzahi;
import com.google.android.gms.internal.zzahm;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzahq;
import com.google.android.gms.internal.zzahu;
import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzahx;
import com.google.android.gms.internal.zzahy;
import com.google.android.gms.internal.zzaia;
import com.google.android.gms.internal.zzaib;
import com.google.android.gms.internal.zzaiv;
import com.google.android.gms.internal.zzaiw;

public class Query {
    static final /* synthetic */ boolean $assertionsDisabled = (!Query.class.desiredAssertionStatus());
    private final boolean zzbHA;
    protected final zzafc zzbHo;
    protected final zzafa zzbHw;
    protected final zzagt zzbHz;

    Query(zzafc com_google_android_gms_internal_zzafc, zzafa com_google_android_gms_internal_zzafa) {
        this.zzbHo = com_google_android_gms_internal_zzafc;
        this.zzbHw = com_google_android_gms_internal_zzafa;
        this.zzbHz = zzagt.zzbPK;
        this.zzbHA = false;
    }

    Query(zzafc com_google_android_gms_internal_zzafc, zzafa com_google_android_gms_internal_zzafa, zzagt com_google_android_gms_internal_zzagt, boolean z) throws DatabaseException {
        this.zzbHo = com_google_android_gms_internal_zzafc;
        this.zzbHw = com_google_android_gms_internal_zzafa;
        this.zzbHz = com_google_android_gms_internal_zzagt;
        this.zzbHA = z;
        zzaiv.zzb(com_google_android_gms_internal_zzagt.isValid(), "Validation of queries failed.");
    }

    private void zzPl() {
        if (this.zzbHz.zzSC()) {
            throw new IllegalArgumentException("Can't call equalTo() and startAt() combined");
        } else if (this.zzbHz.zzSF()) {
            throw new IllegalArgumentException("Can't call equalTo() and endAt() combined");
        }
    }

    private void zzPm() {
        if (this.zzbHA) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    private Query zza(zzahu com_google_android_gms_internal_zzahu, String str) {
        zzaiw.zziu(str);
        if (!com_google_android_gms_internal_zzahu.zzTo() && !com_google_android_gms_internal_zzahu.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt()");
        } else if (this.zzbHz.zzSC()) {
            throw new IllegalArgumentException("Can't call startAt() or equalTo() multiple times");
        } else {
            zzagt zza = this.zzbHz.zza(com_google_android_gms_internal_zzahu, str != null ? zzahi.zzig(str) : null);
            zzb(zza);
            zza(zza);
            if ($assertionsDisabled || zza.isValid()) {
                return new Query(this.zzbHo, this.zzbHw, zza, this.zzbHA);
            }
            throw new AssertionError();
        }
    }

    private void zza(final zzaew com_google_android_gms_internal_zzaew) {
        zzafs.zzRV().zzk(com_google_android_gms_internal_zzaew);
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ Query b;

            public void run() {
                this.b.zzbHo.zze(com_google_android_gms_internal_zzaew);
            }
        });
    }

    private void zza(zzagt com_google_android_gms_internal_zzagt) {
        if (com_google_android_gms_internal_zzagt.zzSK().equals(zzahq.zzTH())) {
            zzahu zzSD;
            String str = "You must use startAt(String value), endAt(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported";
            if (com_google_android_gms_internal_zzagt.zzSC()) {
                zzSD = com_google_android_gms_internal_zzagt.zzSD();
                if (!(com_google_android_gms_internal_zzagt.zzSE() == zzahi.zzTh() && (zzSD instanceof zzaia))) {
                    throw new IllegalArgumentException(str);
                }
            }
            if (com_google_android_gms_internal_zzagt.zzSF()) {
                zzSD = com_google_android_gms_internal_zzagt.zzSG();
                if (com_google_android_gms_internal_zzagt.zzSH() != zzahi.zzTi() || !(zzSD instanceof zzaia)) {
                    throw new IllegalArgumentException(str);
                }
            }
        } else if (!com_google_android_gms_internal_zzagt.zzSK().equals(zzahx.zzTL())) {
        } else {
            if ((com_google_android_gms_internal_zzagt.zzSC() && !zzahy.zzp(com_google_android_gms_internal_zzagt.zzSD())) || (com_google_android_gms_internal_zzagt.zzSF() && !zzahy.zzp(com_google_android_gms_internal_zzagt.zzSG()))) {
                throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), endAt(), or equalTo() must be valid priorities.");
            }
        }
    }

    private Query zzb(zzahu com_google_android_gms_internal_zzahu, String str) {
        zzaiw.zziu(str);
        if (com_google_android_gms_internal_zzahu.zzTo() || com_google_android_gms_internal_zzahu.isEmpty()) {
            zzahi zzig = str != null ? zzahi.zzig(str) : null;
            if (this.zzbHz.zzSF()) {
                throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
            }
            zzagt zzb = this.zzbHz.zzb(com_google_android_gms_internal_zzahu, zzig);
            zzb(zzb);
            zza(zzb);
            if ($assertionsDisabled || zzb.isValid()) {
                return new Query(this.zzbHo, this.zzbHw, zzb, this.zzbHA);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("Can only use simple values for endAt()");
    }

    private void zzb(final zzaew com_google_android_gms_internal_zzaew) {
        zzafs.zzRV().zzi(com_google_android_gms_internal_zzaew);
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ Query b;

            public void run() {
                this.b.zzbHo.zzf(com_google_android_gms_internal_zzaew);
            }
        });
    }

    private void zzb(zzagt com_google_android_gms_internal_zzagt) {
        if (com_google_android_gms_internal_zzagt.zzSC() && com_google_android_gms_internal_zzagt.zzSF() && com_google_android_gms_internal_zzagt.zzSI() && !com_google_android_gms_internal_zzagt.zzSJ()) {
            throw new IllegalArgumentException("Can't combine startAt(), endAt() and limit(). Use limitToFirst() or limitToLast() instead");
        }
    }

    public ChildEventListener addChildEventListener(ChildEventListener childEventListener) {
        zzb(new zzaer(this.zzbHo, childEventListener, zzPo()));
        return childEventListener;
    }

    public void addListenerForSingleValueEvent(final ValueEventListener valueEventListener) {
        zzb(new zzafp(this.zzbHo, new ValueEventListener(this) {
            final /* synthetic */ Query b;

            public void onCancelled(DatabaseError databaseError) {
                valueEventListener.onCancelled(databaseError);
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
                this.b.removeEventListener((ValueEventListener) this);
                valueEventListener.onDataChange(dataSnapshot);
            }
        }, zzPo()));
    }

    public ValueEventListener addValueEventListener(ValueEventListener valueEventListener) {
        zzb(new zzafp(this.zzbHo, valueEventListener, zzPo()));
        return valueEventListener;
    }

    public Query endAt(double d) {
        return endAt(d, null);
    }

    public Query endAt(double d, String str) {
        return zzb(new zzahm(Double.valueOf(d), zzahy.zzTM()), str);
    }

    public Query endAt(String str) {
        return endAt(str, null);
    }

    public Query endAt(String str, String str2) {
        return zzb(str != null ? new zzaia(str, zzahy.zzTM()) : zzahn.zzTA(), str2);
    }

    public Query endAt(boolean z) {
        return endAt(z, null);
    }

    public Query endAt(boolean z, String str) {
        return zzb(new zzahh(Boolean.valueOf(z), zzahy.zzTM()), str);
    }

    public Query equalTo(double d) {
        zzPl();
        return startAt(d).endAt(d);
    }

    public Query equalTo(double d, String str) {
        zzPl();
        return startAt(d, str).endAt(d, str);
    }

    public Query equalTo(String str) {
        zzPl();
        return startAt(str).endAt(str);
    }

    public Query equalTo(String str, String str2) {
        zzPl();
        return startAt(str, str2).endAt(str, str2);
    }

    public Query equalTo(boolean z) {
        zzPl();
        return startAt(z).endAt(z);
    }

    public Query equalTo(boolean z, String str) {
        zzPl();
        return startAt(z, str).endAt(z, str);
    }

    public DatabaseReference getRef() {
        return new DatabaseReference(this.zzbHo, zzPn());
    }

    public void keepSynced(final boolean z) {
        if (this.zzbHw.isEmpty() || !this.zzbHw.zzRt().equals(zzahi.zzTk())) {
            this.zzbHo.scheduleNow(new Runnable(this) {
                final /* synthetic */ Query b;

                public void run() {
                    this.b.zzbHo.zza(this.b.zzPo(), z);
                }
            });
            return;
        }
        throw new DatabaseException("Can't call keepSynced() on .info paths.");
    }

    public Query limitToFirst(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        } else if (!this.zzbHz.zzSI()) {
            return new Query(this.zzbHo, this.zzbHw, this.zzbHz.zznC(i), this.zzbHA);
        } else {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
    }

    public Query limitToLast(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        } else if (!this.zzbHz.zzSI()) {
            return new Query(this.zzbHo, this.zzbHw, this.zzbHz.zznD(i), this.zzbHA);
        } else {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
    }

    public Query orderByChild(String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        } else if (str.equals("$key") || str.equals(".key")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 54).append("Can't use '").append(str).append("' as path, please use orderByKey() instead!").toString());
        } else if (str.equals("$priority") || str.equals(".priority")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("Can't use '").append(str).append("' as path, please use orderByPriority() instead!").toString());
        } else if (str.equals("$value") || str.equals(".value")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 56).append("Can't use '").append(str).append("' as path, please use orderByValue() instead!").toString());
        } else {
            zzaiw.zziq(str);
            zzPm();
            zzafa com_google_android_gms_internal_zzafa = new zzafa(str);
            if (com_google_android_gms_internal_zzafa.size() == 0) {
                throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
            }
            return new Query(this.zzbHo, this.zzbHw, this.zzbHz.zza(new zzahw(com_google_android_gms_internal_zzafa)), true);
        }
    }

    public Query orderByKey() {
        zzPm();
        zzagt zza = this.zzbHz.zza(zzahq.zzTH());
        zza(zza);
        return new Query(this.zzbHo, this.zzbHw, zza, true);
    }

    public Query orderByPriority() {
        zzPm();
        zzagt zza = this.zzbHz.zza(zzahx.zzTL());
        zza(zza);
        return new Query(this.zzbHo, this.zzbHw, zza, true);
    }

    public Query orderByValue() {
        zzPm();
        return new Query(this.zzbHo, this.zzbHw, this.zzbHz.zza(zzaib.zzTN()), true);
    }

    public void removeEventListener(ChildEventListener childEventListener) {
        if (childEventListener == null) {
            throw new NullPointerException("listener must not be null");
        }
        zza(new zzaer(this.zzbHo, childEventListener, zzPo()));
    }

    public void removeEventListener(ValueEventListener valueEventListener) {
        if (valueEventListener == null) {
            throw new NullPointerException("listener must not be null");
        }
        zza(new zzafp(this.zzbHo, valueEventListener, zzPo()));
    }

    public Query startAt(double d) {
        return startAt(d, null);
    }

    public Query startAt(double d, String str) {
        return zza(new zzahm(Double.valueOf(d), zzahy.zzTM()), str);
    }

    public Query startAt(String str) {
        return startAt(str, null);
    }

    public Query startAt(String str, String str2) {
        return zza(str != null ? new zzaia(str, zzahy.zzTM()) : zzahn.zzTA(), str2);
    }

    public Query startAt(boolean z) {
        return startAt(z, null);
    }

    public Query startAt(boolean z, String str) {
        return zza(new zzahh(Boolean.valueOf(z), zzahy.zzTM()), str);
    }

    public zzafa zzPn() {
        return this.zzbHw;
    }

    public zzagu zzPo() {
        return new zzagu(this.zzbHw, this.zzbHz);
    }
}
