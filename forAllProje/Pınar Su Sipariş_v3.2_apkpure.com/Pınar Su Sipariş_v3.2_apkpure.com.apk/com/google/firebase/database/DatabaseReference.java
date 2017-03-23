package com.google.firebase.database;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.zzaes;
import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzafa;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzafe;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzahi;
import com.google.android.gms.internal.zzahu;
import com.google.android.gms.internal.zzahv;
import com.google.android.gms.internal.zzahy;
import com.google.android.gms.internal.zzais;
import com.google.android.gms.internal.zzaiu;
import com.google.android.gms.internal.zzaiv;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaix;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.Transaction.Handler;
import java.net.URLEncoder;
import java.util.Map;

public class DatabaseReference extends Query {
    private static zzaev zzbHb;

    public interface CompletionListener {
        void onComplete(DatabaseError databaseError, DatabaseReference databaseReference);
    }

    DatabaseReference(zzafc com_google_android_gms_internal_zzafc, zzafa com_google_android_gms_internal_zzafa) {
        super(com_google_android_gms_internal_zzafc, com_google_android_gms_internal_zzafa);
    }

    public static void goOffline() {
        zza(zzPh());
    }

    public static void goOnline() {
        zzb(zzPh());
    }

    private static synchronized zzaev zzPh() {
        zzaev com_google_android_gms_internal_zzaev;
        synchronized (DatabaseReference.class) {
            if (zzbHb == null) {
                zzbHb = new zzaev();
            }
            com_google_android_gms_internal_zzaev = zzbHb;
        }
        return com_google_android_gms_internal_zzaev;
    }

    private Task<Void> zza(final zzahu com_google_android_gms_internal_zzahu, CompletionListener completionListener) {
        zzaiw.zzQ(zzPn());
        final zzais zzb = zzaiv.zzb(completionListener);
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ DatabaseReference c;

            public void run() {
                this.c.zzbHo.zza(this.c.zzPn().zza(zzahi.zzTj()), com_google_android_gms_internal_zzahu, (CompletionListener) zzb.zzUj());
            }
        });
        return (Task) zzb.getFirst();
    }

    private Task<Void> zza(Object obj, zzahu com_google_android_gms_internal_zzahu, CompletionListener completionListener) {
        zzaiw.zzQ(zzPn());
        zzafo.zza(zzPn(), obj);
        Object zzav = zzaix.zzav(obj);
        zzaiw.zzau(zzav);
        final zzahu zza = zzahv.zza(zzav, com_google_android_gms_internal_zzahu);
        final zzais zzb = zzaiv.zzb(completionListener);
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ DatabaseReference c;

            public void run() {
                this.c.zzbHo.zza(this.c.zzPn(), zza, (CompletionListener) zzb.zzUj());
            }
        });
        return (Task) zzb.getFirst();
    }

    private Task<Void> zza(final Map<String, Object> map, CompletionListener completionListener) {
        if (map == null) {
            throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
        }
        final zzaes zzay = zzaes.zzay(zzaiw.zzc(zzPn(), map));
        final zzais zzb = zzaiv.zzb(completionListener);
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ DatabaseReference d;

            public void run() {
                this.d.zzbHo.zza(this.d.zzPn(), zzay, (CompletionListener) zzb.zzUj(), map);
            }
        });
        return (Task) zzb.getFirst();
    }

    static void zza(zzaev com_google_android_gms_internal_zzaev) {
        zzafe.zzd(com_google_android_gms_internal_zzaev);
    }

    static void zzb(zzaev com_google_android_gms_internal_zzaev) {
        zzafe.zze(com_google_android_gms_internal_zzaev);
    }

    public DatabaseReference child(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (zzPn().isEmpty()) {
            zzaiw.zzir(str);
        } else {
            zzaiw.zziq(str);
        }
        return new DatabaseReference(this.zzbHo, zzPn().zzh(new zzafa(str)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof DatabaseReference) && toString().equals(obj.toString());
    }

    public FirebaseDatabase getDatabase() {
        return this.zzbHo.getDatabase();
    }

    public String getKey() {
        return zzPn().isEmpty() ? null : zzPn().zzRw().asString();
    }

    public DatabaseReference getParent() {
        zzafa zzRv = zzPn().zzRv();
        return zzRv != null ? new DatabaseReference(this.zzbHo, zzRv) : null;
    }

    public DatabaseReference getRoot() {
        return new DatabaseReference(this.zzbHo, new zzafa(""));
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public OnDisconnect onDisconnect() {
        zzaiw.zzQ(zzPn());
        return new OnDisconnect(this.zzbHo, zzPn());
    }

    public DatabaseReference push() {
        return new DatabaseReference(this.zzbHo, zzPn().zza(zzahi.zzig(zzaiu.zzaJ(this.zzbHo.zzRA()))));
    }

    public Task<Void> removeValue() {
        return setValue(null);
    }

    public void removeValue(CompletionListener completionListener) {
        setValue(null, completionListener);
    }

    public void runTransaction(Handler handler) {
        runTransaction(handler, true);
    }

    public void runTransaction(final Handler handler, final boolean z) {
        if (handler == null) {
            throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
        }
        zzaiw.zzQ(zzPn());
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ DatabaseReference c;

            public void run() {
                this.c.zzbHo.zza(this.c.zzPn(), handler, z);
            }
        });
    }

    public Task<Void> setPriority(Object obj) {
        return zza(zzahy.zzar(obj), null);
    }

    public void setPriority(Object obj, CompletionListener completionListener) {
        zza(zzahy.zzar(obj), completionListener);
    }

    public Task<Void> setValue(Object obj) {
        return zza(obj, zzahy.zzar(null), null);
    }

    public Task<Void> setValue(Object obj, Object obj2) {
        return zza(obj, zzahy.zzar(obj2), null);
    }

    public void setValue(Object obj, CompletionListener completionListener) {
        zza(obj, zzahy.zzar(null), completionListener);
    }

    public void setValue(Object obj, Object obj2, CompletionListener completionListener) {
        zza(obj, zzahy.zzar(obj2), completionListener);
    }

    public String toString() {
        String valueOf;
        DatabaseReference parent = getParent();
        if (parent == null) {
            return this.zzbHo.toString();
        }
        try {
            valueOf = String.valueOf(parent.toString());
            String valueOf2 = String.valueOf(URLEncoder.encode(getKey(), Constants.ENCODING).replace("+", "%20"));
            return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("/").append(valueOf2).toString();
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Failed to URLEncode key: ";
            valueOf = String.valueOf(getKey());
            throw new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    public Task<Void> updateChildren(Map<String, Object> map) {
        return zza((Map) map, null);
    }

    public void updateChildren(Map<String, Object> map, CompletionListener completionListener) {
        zza((Map) map, completionListener);
    }
}
