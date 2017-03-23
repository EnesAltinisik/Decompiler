package com.google.firebase.database;

import com.google.android.gms.internal.zzafa;
import com.google.android.gms.internal.zzahp;
import com.google.android.gms.internal.zzaht;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaix;
import java.util.Iterator;

public class DataSnapshot {
    private final zzahp zzbGS;
    private final DatabaseReference zzbGT;

    DataSnapshot(DatabaseReference databaseReference, zzahp com_google_android_gms_internal_zzahp) {
        this.zzbGS = com_google_android_gms_internal_zzahp;
        this.zzbGT = databaseReference;
    }

    public DataSnapshot child(String str) {
        return new DataSnapshot(this.zzbGT.child(str), zzahp.zzm(this.zzbGS.zzPj().zzO(new zzafa(str))));
    }

    public boolean exists() {
        return !this.zzbGS.zzPj().isEmpty();
    }

    public Iterable<DataSnapshot> getChildren() {
        final Iterator it = this.zzbGS.iterator();
        return new Iterable<DataSnapshot>(this) {
            final /* synthetic */ DataSnapshot b;

            public Iterator<DataSnapshot> iterator() {
                return new Iterator<DataSnapshot>(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public DataSnapshot a() {
                        zzaht com_google_android_gms_internal_zzaht = (zzaht) it.next();
                        return new DataSnapshot(this.a.b.zzbGT.child(com_google_android_gms_internal_zzaht.zzTK().asString()), zzahp.zzm(com_google_android_gms_internal_zzaht.zzPj()));
                    }

                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public /* synthetic */ Object next() {
                        return a();
                    }

                    public void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }
                };
            }
        };
    }

    public long getChildrenCount() {
        return (long) this.zzbGS.zzPj().getChildCount();
    }

    public String getKey() {
        return this.zzbGT.getKey();
    }

    public Object getPriority() {
        Object value = this.zzbGS.zzPj().zzTp().getValue();
        return value instanceof Long ? Double.valueOf((double) ((Long) value).longValue()) : value;
    }

    public DatabaseReference getRef() {
        return this.zzbGT;
    }

    public Object getValue() {
        return this.zzbGS.zzPj().getValue();
    }

    public <T> T getValue(GenericTypeIndicator<T> genericTypeIndicator) {
        return zzaix.zza(this.zzbGS.zzPj().getValue(), (GenericTypeIndicator) genericTypeIndicator);
    }

    public <T> T getValue(Class<T> cls) {
        return zzaix.zza(this.zzbGS.zzPj().getValue(), (Class) cls);
    }

    public Object getValue(boolean z) {
        return this.zzbGS.zzPj().getValue(z);
    }

    public boolean hasChild(String str) {
        if (this.zzbGT.getParent() == null) {
            zzaiw.zzir(str);
        } else {
            zzaiw.zziq(str);
        }
        return !this.zzbGS.zzPj().zzO(new zzafa(str)).isEmpty();
    }

    public boolean hasChildren() {
        return this.zzbGS.zzPj().getChildCount() > 0;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbGT.getKey());
        String valueOf2 = String.valueOf(this.zzbGS.zzPj().getValue(true));
        return new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("DataSnapshot { key = ").append(valueOf).append(", value = ").append(valueOf2).append(" }").toString();
    }
}
