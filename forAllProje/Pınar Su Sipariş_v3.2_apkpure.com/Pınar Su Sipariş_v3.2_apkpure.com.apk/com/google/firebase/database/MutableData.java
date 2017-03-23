package com.google.firebase.database;

import com.google.android.gms.internal.zzafa;
import com.google.android.gms.internal.zzafg;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzahi;
import com.google.android.gms.internal.zzahp;
import com.google.android.gms.internal.zzaht;
import com.google.android.gms.internal.zzahu;
import com.google.android.gms.internal.zzahv;
import com.google.android.gms.internal.zzahy;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaix;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MutableData {
    private final zzafg zzbHr;
    private final zzafa zzbHs;

    private MutableData(zzafg com_google_android_gms_internal_zzafg, zzafa com_google_android_gms_internal_zzafa) {
        this.zzbHr = com_google_android_gms_internal_zzafg;
        this.zzbHs = com_google_android_gms_internal_zzafa;
        zzafo.zza(this.zzbHs, getValue());
    }

    MutableData(zzahu com_google_android_gms_internal_zzahu) {
        this(new zzafg(com_google_android_gms_internal_zzahu), new zzafa(""));
    }

    public MutableData child(String str) {
        zzaiw.zziq(str);
        return new MutableData(this.zzbHr, this.zzbHs.zzh(new zzafa(str)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableData) && this.zzbHr.equals(((MutableData) obj).zzbHr) && this.zzbHs.equals(((MutableData) obj).zzbHs);
    }

    public Iterable<MutableData> getChildren() {
        zzahu zzPj = zzPj();
        if (zzPj.isEmpty() || zzPj.zzTo()) {
            return new Iterable<MutableData>(this) {
                final /* synthetic */ MutableData a;

                {
                    this.a = r1;
                }

                public Iterator<MutableData> iterator() {
                    return new Iterator<MutableData>(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public MutableData a() {
                            throw new NoSuchElementException();
                        }

                        public boolean hasNext() {
                            return false;
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
        final Iterator it = zzahp.zzm(zzPj).iterator();
        return new Iterable<MutableData>(this) {
            final /* synthetic */ MutableData b;

            public Iterator<MutableData> iterator() {
                return new Iterator<MutableData>(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public MutableData a() {
                        return new MutableData(this.a.b.zzbHr, this.a.b.zzbHs.zza(((zzaht) it.next()).zzTK()));
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
        return (long) zzPj().getChildCount();
    }

    public String getKey() {
        return this.zzbHs.zzRw() != null ? this.zzbHs.zzRw().asString() : null;
    }

    public Object getPriority() {
        return zzPj().zzTp().getValue();
    }

    public Object getValue() {
        return zzPj().getValue();
    }

    public <T> T getValue(GenericTypeIndicator<T> genericTypeIndicator) {
        return zzaix.zza(zzPj().getValue(), (GenericTypeIndicator) genericTypeIndicator);
    }

    public <T> T getValue(Class<T> cls) {
        return zzaix.zza(zzPj().getValue(), (Class) cls);
    }

    public boolean hasChild(String str) {
        return !zzPj().zzO(new zzafa(str)).isEmpty();
    }

    public boolean hasChildren() {
        zzahu zzPj = zzPj();
        return (zzPj.zzTo() || zzPj.isEmpty()) ? false : true;
    }

    public void setPriority(Object obj) {
        this.zzbHr.zzg(this.zzbHs, zzPj().zzf(zzahy.zzar(obj)));
    }

    public void setValue(Object obj) throws DatabaseException {
        zzafo.zza(this.zzbHs, obj);
        Object zzav = zzaix.zzav(obj);
        zzaiw.zzau(zzav);
        this.zzbHr.zzg(this.zzbHs, zzahv.zzaq(zzav));
    }

    public String toString() {
        zzahi zzRt = this.zzbHs.zzRt();
        String asString = zzRt != null ? zzRt.asString() : "<none>";
        String valueOf = String.valueOf(this.zzbHr.zzRG().getValue(true));
        return new StringBuilder((String.valueOf(asString).length() + 32) + String.valueOf(valueOf).length()).append("MutableData { key = ").append(asString).append(", value = ").append(valueOf).append(" }").toString();
    }

    zzahu zzPj() {
        return this.zzbHr.zzq(this.zzbHs);
    }
}
