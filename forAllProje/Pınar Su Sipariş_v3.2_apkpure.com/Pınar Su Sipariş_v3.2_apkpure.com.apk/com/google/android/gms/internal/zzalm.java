package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class zzalm extends zzalw {
    private static final Reader zzbXI = new Reader() {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object zzbXJ = new Object();
    private final List<Object> zzbXK = new ArrayList();

    public zzalm(zzakf com_google_android_gms_internal_zzakf) {
        super(zzbXI);
        this.zzbXK.add(com_google_android_gms_internal_zzakf);
    }

    private Object zzWb() {
        return this.zzbXK.get(this.zzbXK.size() - 1);
    }

    private Object zzWc() {
        return this.zzbXK.remove(this.zzbXK.size() - 1);
    }

    private void zza(zzalx com_google_android_gms_internal_zzalx) throws IOException {
        if (zzWa() != com_google_android_gms_internal_zzalx) {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzalx);
            String valueOf2 = String.valueOf(zzWa());
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
        }
    }

    public void beginArray() throws IOException {
        zza(zzalx.BEGIN_ARRAY);
        this.zzbXK.add(((zzakc) zzWb()).iterator());
    }

    public void beginObject() throws IOException {
        zza(zzalx.BEGIN_OBJECT);
        this.zzbXK.add(((zzaki) zzWb()).entrySet().iterator());
    }

    public void close() throws IOException {
        this.zzbXK.clear();
        this.zzbXK.add(zzbXJ);
    }

    public void endArray() throws IOException {
        zza(zzalx.END_ARRAY);
        zzWc();
        zzWc();
    }

    public void endObject() throws IOException {
        zza(zzalx.END_OBJECT);
        zzWc();
        zzWc();
    }

    public boolean hasNext() throws IOException {
        zzalx zzWa = zzWa();
        return (zzWa == zzalx.END_OBJECT || zzWa == zzalx.END_ARRAY) ? false : true;
    }

    public boolean nextBoolean() throws IOException {
        zza(zzalx.BOOLEAN);
        return ((zzakl) zzWc()).zzVE();
    }

    public double nextDouble() throws IOException {
        zzalx zzWa = zzWa();
        if (zzWa == zzalx.NUMBER || zzWa == zzalx.STRING) {
            double zzVB = ((zzakl) zzWb()).zzVB();
            if (isLenient() || !(Double.isNaN(zzVB) || Double.isInfinite(zzVB))) {
                zzWc();
                return zzVB;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + zzVB);
        }
        String valueOf = String.valueOf(zzalx.NUMBER);
        String valueOf2 = String.valueOf(zzWa);
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    public int nextInt() throws IOException {
        zzalx zzWa = zzWa();
        if (zzWa == zzalx.NUMBER || zzWa == zzalx.STRING) {
            int zzVD = ((zzakl) zzWb()).zzVD();
            zzWc();
            return zzVD;
        }
        String valueOf = String.valueOf(zzalx.NUMBER);
        String valueOf2 = String.valueOf(zzWa);
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    public long nextLong() throws IOException {
        zzalx zzWa = zzWa();
        if (zzWa == zzalx.NUMBER || zzWa == zzalx.STRING) {
            long zzVC = ((zzakl) zzWb()).zzVC();
            zzWc();
            return zzVC;
        }
        String valueOf = String.valueOf(zzalx.NUMBER);
        String valueOf2 = String.valueOf(zzWa);
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    public String nextName() throws IOException {
        zza(zzalx.NAME);
        Entry entry = (Entry) ((Iterator) zzWb()).next();
        this.zzbXK.add(entry.getValue());
        return (String) entry.getKey();
    }

    public void nextNull() throws IOException {
        zza(zzalx.NULL);
        zzWc();
    }

    public String nextString() throws IOException {
        zzalx zzWa = zzWa();
        if (zzWa == zzalx.STRING || zzWa == zzalx.NUMBER) {
            return ((zzakl) zzWc()).zzVA();
        }
        String valueOf = String.valueOf(zzalx.STRING);
        String valueOf2 = String.valueOf(zzWa);
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    public void skipValue() throws IOException {
        if (zzWa() == zzalx.NAME) {
            nextName();
        } else {
            zzWc();
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public zzalx zzWa() throws IOException {
        if (this.zzbXK.isEmpty()) {
            return zzalx.END_DOCUMENT;
        }
        Object zzWb = zzWb();
        if (zzWb instanceof Iterator) {
            boolean z = this.zzbXK.get(this.zzbXK.size() - 2) instanceof zzaki;
            Iterator it = (Iterator) zzWb;
            if (!it.hasNext()) {
                return z ? zzalx.END_OBJECT : zzalx.END_ARRAY;
            } else {
                if (z) {
                    return zzalx.NAME;
                }
                this.zzbXK.add(it.next());
                return zzWa();
            }
        } else if (zzWb instanceof zzaki) {
            return zzalx.BEGIN_OBJECT;
        } else {
            if (zzWb instanceof zzakc) {
                return zzalx.BEGIN_ARRAY;
            }
            if (zzWb instanceof zzakl) {
                zzakl com_google_android_gms_internal_zzakl = (zzakl) zzWb;
                if (com_google_android_gms_internal_zzakl.zzVP()) {
                    return zzalx.STRING;
                }
                if (com_google_android_gms_internal_zzakl.zzVN()) {
                    return zzalx.BOOLEAN;
                }
                if (com_google_android_gms_internal_zzakl.zzVO()) {
                    return zzalx.NUMBER;
                }
                throw new AssertionError();
            } else if (zzWb instanceof zzakh) {
                return zzalx.NULL;
            } else {
                if (zzWb == zzbXJ) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void zzWd() throws IOException {
        zza(zzalx.NAME);
        Entry entry = (Entry) ((Iterator) zzWb()).next();
        this.zzbXK.add(entry.getValue());
        this.zzbXK.add(new zzakl((String) entry.getKey()));
    }
}
