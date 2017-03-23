package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzajz {
    private final ThreadLocal<Map<zzalv<?>, a<?>>> zzbVX;
    private final Map<zzalv<?>, zzakr<?>> zzbVY;
    private final List<zzaks> zzbVZ;
    private final zzakz zzbWa;
    private final boolean zzbWb;
    private final boolean zzbWc;
    private final boolean zzbWd;
    private final boolean zzbWe;
    final zzakd zzbWf;
    final zzakm zzbWg;

    static class a<T> extends zzakr<T> {
        private zzakr<T> a;

        a() {
        }

        public void a(zzakr<T> com_google_android_gms_internal_zzakr_T) {
            if (this.a != null) {
                throw new AssertionError();
            }
            this.a = com_google_android_gms_internal_zzakr_T;
        }

        public void zza(zzaly com_google_android_gms_internal_zzaly, T t) throws IOException {
            if (this.a == null) {
                throw new IllegalStateException();
            }
            this.a.zza(com_google_android_gms_internal_zzaly, t);
        }

        public T zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (this.a != null) {
                return this.a.zzb(com_google_android_gms_internal_zzalw);
            }
            throw new IllegalStateException();
        }
    }

    public zzajz() {
        this(zzala.zzbWT, zzajx.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, zzakp.DEFAULT, Collections.emptyList());
    }

    zzajz(zzala com_google_android_gms_internal_zzala, zzajy com_google_android_gms_internal_zzajy, Map<Type, zzakb<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, zzakp com_google_android_gms_internal_zzakp, List<zzaks> list) {
        this.zzbVX = new ThreadLocal();
        this.zzbVY = Collections.synchronizedMap(new HashMap());
        this.zzbWf = new zzakd(this) {
            final /* synthetic */ zzajz a;

            {
                this.a = r1;
            }
        };
        this.zzbWg = new zzakm(this) {
            final /* synthetic */ zzajz a;

            {
                this.a = r1;
            }
        };
        this.zzbWa = new zzakz(map);
        this.zzbWb = z;
        this.zzbWd = z3;
        this.zzbWc = z4;
        this.zzbWe = z5;
        List arrayList = new ArrayList();
        arrayList.add(zzalu.zzbYW);
        arrayList.add(zzalp.zzbXD);
        arrayList.add(com_google_android_gms_internal_zzala);
        arrayList.addAll(list);
        arrayList.add(zzalu.zzbYD);
        arrayList.add(zzalu.zzbYs);
        arrayList.add(zzalu.zzbYm);
        arrayList.add(zzalu.zzbYo);
        arrayList.add(zzalu.zzbYq);
        arrayList.add(zzalu.zza(Long.TYPE, Long.class, zza(com_google_android_gms_internal_zzakp)));
        arrayList.add(zzalu.zza(Double.TYPE, Double.class, zzaV(z6)));
        arrayList.add(zzalu.zza(Float.TYPE, Float.class, zzaW(z6)));
        arrayList.add(zzalu.zzbYx);
        arrayList.add(zzalu.zzbYz);
        arrayList.add(zzalu.zzbYF);
        arrayList.add(zzalu.zzbYH);
        arrayList.add(zzalu.zza(BigDecimal.class, zzalu.zzbYB));
        arrayList.add(zzalu.zza(BigInteger.class, zzalu.zzbYC));
        arrayList.add(zzalu.zzbYJ);
        arrayList.add(zzalu.zzbYL);
        arrayList.add(zzalu.zzbYP);
        arrayList.add(zzalu.zzbYU);
        arrayList.add(zzalu.zzbYN);
        arrayList.add(zzalu.zzbYj);
        arrayList.add(zzalk.zzbXD);
        arrayList.add(zzalu.zzbYS);
        arrayList.add(zzals.zzbXD);
        arrayList.add(zzalr.zzbXD);
        arrayList.add(zzalu.zzbYQ);
        arrayList.add(zzali.zzbXD);
        arrayList.add(zzalu.zzbYh);
        arrayList.add(new zzalj(this.zzbWa));
        arrayList.add(new zzalo(this.zzbWa, z2));
        arrayList.add(new zzall(this.zzbWa));
        arrayList.add(zzalu.zzbYX);
        arrayList.add(new zzalq(this.zzbWa, com_google_android_gms_internal_zzajy, com_google_android_gms_internal_zzala));
        this.zzbVZ = Collections.unmodifiableList(arrayList);
    }

    private zzakr<Number> zza(zzakp com_google_android_gms_internal_zzakp) {
        return com_google_android_gms_internal_zzakp == zzakp.DEFAULT ? zzalu.zzbYt : new zzakr<Number>(this) {
            final /* synthetic */ zzajz a;

            {
                this.a = r1;
            }

            public Number a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                    return Long.valueOf(com_google_android_gms_internal_zzalw.nextLong());
                }
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }

            public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
                if (number == null) {
                    com_google_android_gms_internal_zzaly.zzWk();
                } else {
                    com_google_android_gms_internal_zzaly.zziU(number.toString());
                }
            }

            public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
                a(com_google_android_gms_internal_zzaly, (Number) obj);
            }

            public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                return a(com_google_android_gms_internal_zzalw);
            }
        };
    }

    private static void zza(Object obj, zzalw com_google_android_gms_internal_zzalw) {
        if (obj != null) {
            try {
                if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.END_DOCUMENT) {
                    throw new zzakg("JSON document was not fully consumed.");
                }
            } catch (Throwable e) {
                throw new zzako(e);
            } catch (Throwable e2) {
                throw new zzakg(e2);
            }
        }
    }

    private zzakr<Number> zzaV(boolean z) {
        return z ? zzalu.zzbYv : new zzakr<Number>(this) {
            final /* synthetic */ zzajz a;

            {
                this.a = r1;
            }

            public Double a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                    return Double.valueOf(com_google_android_gms_internal_zzalw.nextDouble());
                }
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }

            public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
                if (number == null) {
                    com_google_android_gms_internal_zzaly.zzWk();
                    return;
                }
                this.a.zzo(number.doubleValue());
                com_google_android_gms_internal_zzaly.zza(number);
            }

            public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
                a(com_google_android_gms_internal_zzaly, (Number) obj);
            }

            public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                return a(com_google_android_gms_internal_zzalw);
            }
        };
    }

    private zzakr<Number> zzaW(boolean z) {
        return z ? zzalu.zzbYu : new zzakr<Number>(this) {
            final /* synthetic */ zzajz a;

            {
                this.a = r1;
            }

            public Float a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                    return Float.valueOf((float) com_google_android_gms_internal_zzalw.nextDouble());
                }
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }

            public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
                if (number == null) {
                    com_google_android_gms_internal_zzaly.zzWk();
                    return;
                }
                this.a.zzo((double) number.floatValue());
                com_google_android_gms_internal_zzaly.zza(number);
            }

            public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
                a(com_google_android_gms_internal_zzaly, (Number) obj);
            }

            public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                return a(com_google_android_gms_internal_zzalw);
            }
        };
    }

    private void zzo(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.zzbWb + "factories:" + this.zzbVZ + ",instanceCreators:" + this.zzbWa + "}";
    }

    public <T> zzakr<T> zza(zzaks com_google_android_gms_internal_zzaks, zzalv<T> com_google_android_gms_internal_zzalv_T) {
        Object obj = null;
        if (!this.zzbVZ.contains(com_google_android_gms_internal_zzaks)) {
            obj = 1;
        }
        Object obj2 = obj;
        for (zzaks com_google_android_gms_internal_zzaks2 : this.zzbVZ) {
            if (obj2 != null) {
                zzakr<T> zza = com_google_android_gms_internal_zzaks2.zza(this, com_google_android_gms_internal_zzalv_T);
                if (zza != null) {
                    return zza;
                }
            } else if (com_google_android_gms_internal_zzaks2 == com_google_android_gms_internal_zzaks) {
                obj2 = 1;
            }
        }
        String valueOf = String.valueOf(com_google_android_gms_internal_zzalv_T);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("GSON cannot serialize ").append(valueOf).toString());
    }

    public <T> zzakr<T> zza(zzalv<T> com_google_android_gms_internal_zzalv_T) {
        zzakr<T> com_google_android_gms_internal_zzakr_T = (zzakr) this.zzbVY.get(com_google_android_gms_internal_zzalv_T);
        if (com_google_android_gms_internal_zzakr_T == null) {
            Map map;
            Map map2 = (Map) this.zzbVX.get();
            Object obj = null;
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                this.zzbVX.set(hashMap);
                map = hashMap;
                obj = 1;
            } else {
                map = map2;
            }
            a aVar = (a) map.get(com_google_android_gms_internal_zzalv_T);
            if (aVar == null) {
                try {
                    a aVar2 = new a();
                    map.put(com_google_android_gms_internal_zzalv_T, aVar2);
                    for (zzaks zza : this.zzbVZ) {
                        com_google_android_gms_internal_zzakr_T = zza.zza(this, com_google_android_gms_internal_zzalv_T);
                        if (com_google_android_gms_internal_zzakr_T != null) {
                            aVar2.a(com_google_android_gms_internal_zzakr_T);
                            this.zzbVY.put(com_google_android_gms_internal_zzalv_T, com_google_android_gms_internal_zzakr_T);
                            map.remove(com_google_android_gms_internal_zzalv_T);
                            if (obj != null) {
                                this.zzbVX.remove();
                            }
                        }
                    }
                    String valueOf = String.valueOf(com_google_android_gms_internal_zzalv_T);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("GSON cannot handle ").append(valueOf).toString());
                } catch (Throwable th) {
                    map.remove(com_google_android_gms_internal_zzalv_T);
                    if (obj != null) {
                        this.zzbVX.remove();
                    }
                }
            }
        }
        return com_google_android_gms_internal_zzakr_T;
    }

    public zzaly zza(Writer writer) throws IOException {
        if (this.zzbWd) {
            writer.write(")]}'\n");
        }
        zzaly com_google_android_gms_internal_zzaly = new zzaly(writer);
        if (this.zzbWe) {
            com_google_android_gms_internal_zzaly.setIndent("  ");
        }
        com_google_android_gms_internal_zzaly.zzba(this.zzbWb);
        return com_google_android_gms_internal_zzaly;
    }

    public <T> T zza(zzakf com_google_android_gms_internal_zzakf, Class<T> cls) throws zzako {
        return zzalf.zzp(cls).cast(zza(com_google_android_gms_internal_zzakf, (Type) cls));
    }

    public <T> T zza(zzakf com_google_android_gms_internal_zzakf, Type type) throws zzako {
        return com_google_android_gms_internal_zzakf == null ? null : zza(new zzalm(com_google_android_gms_internal_zzakf), type);
    }

    public <T> T zza(zzalw com_google_android_gms_internal_zzalw, Type type) throws zzakg, zzako {
        boolean z = true;
        boolean isLenient = com_google_android_gms_internal_zzalw.isLenient();
        com_google_android_gms_internal_zzalw.setLenient(true);
        try {
            com_google_android_gms_internal_zzalw.zzWa();
            z = false;
            T zzb = zza(zzalv.zzl(type)).zzb(com_google_android_gms_internal_zzalw);
            com_google_android_gms_internal_zzalw.setLenient(isLenient);
            return zzb;
        } catch (Throwable e) {
            if (z) {
                com_google_android_gms_internal_zzalw.setLenient(isLenient);
                return null;
            }
            throw new zzako(e);
        } catch (Throwable e2) {
            throw new zzako(e2);
        } catch (Throwable e22) {
            throw new zzako(e22);
        } catch (Throwable th) {
            com_google_android_gms_internal_zzalw.setLenient(isLenient);
        }
    }

    public <T> T zza(Reader reader, Type type) throws zzakg, zzako {
        zzalw com_google_android_gms_internal_zzalw = new zzalw(reader);
        Object zza = zza(com_google_android_gms_internal_zzalw, type);
        zza(zza, com_google_android_gms_internal_zzalw);
        return zza;
    }

    public <T> T zza(String str, Type type) throws zzako {
        return str == null ? null : zza(new StringReader(str), type);
    }

    public void zza(zzakf com_google_android_gms_internal_zzakf, zzaly com_google_android_gms_internal_zzaly) throws zzakg {
        boolean isLenient = com_google_android_gms_internal_zzaly.isLenient();
        com_google_android_gms_internal_zzaly.setLenient(true);
        boolean zzWw = com_google_android_gms_internal_zzaly.zzWw();
        com_google_android_gms_internal_zzaly.zzaZ(this.zzbWc);
        boolean zzWx = com_google_android_gms_internal_zzaly.zzWx();
        com_google_android_gms_internal_zzaly.zzba(this.zzbWb);
        try {
            zzalg.zzb(com_google_android_gms_internal_zzakf, com_google_android_gms_internal_zzaly);
            com_google_android_gms_internal_zzaly.setLenient(isLenient);
            com_google_android_gms_internal_zzaly.zzaZ(zzWw);
            com_google_android_gms_internal_zzaly.zzba(zzWx);
        } catch (Throwable e) {
            throw new zzakg(e);
        } catch (Throwable th) {
            com_google_android_gms_internal_zzaly.setLenient(isLenient);
            com_google_android_gms_internal_zzaly.zzaZ(zzWw);
            com_google_android_gms_internal_zzaly.zzba(zzWx);
        }
    }

    public void zza(zzakf com_google_android_gms_internal_zzakf, Appendable appendable) throws zzakg {
        try {
            zza(com_google_android_gms_internal_zzakf, zza(zzalg.zza(appendable)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(Object obj, Type type, zzaly com_google_android_gms_internal_zzaly) throws zzakg {
        zzakr zza = zza(zzalv.zzl(type));
        boolean isLenient = com_google_android_gms_internal_zzaly.isLenient();
        com_google_android_gms_internal_zzaly.setLenient(true);
        boolean zzWw = com_google_android_gms_internal_zzaly.zzWw();
        com_google_android_gms_internal_zzaly.zzaZ(this.zzbWc);
        boolean zzWx = com_google_android_gms_internal_zzaly.zzWx();
        com_google_android_gms_internal_zzaly.zzba(this.zzbWb);
        try {
            zza.zza(com_google_android_gms_internal_zzaly, obj);
            com_google_android_gms_internal_zzaly.setLenient(isLenient);
            com_google_android_gms_internal_zzaly.zzaZ(zzWw);
            com_google_android_gms_internal_zzaly.zzba(zzWx);
        } catch (Throwable e) {
            throw new zzakg(e);
        } catch (Throwable th) {
            com_google_android_gms_internal_zzaly.setLenient(isLenient);
            com_google_android_gms_internal_zzaly.zzaZ(zzWw);
            com_google_android_gms_internal_zzaly.zzba(zzWx);
        }
    }

    public void zza(Object obj, Type type, Appendable appendable) throws zzakg {
        try {
            zza(obj, type, zza(zzalg.zza(appendable)));
        } catch (Throwable e) {
            throw new zzakg(e);
        }
    }

    public String zzaH(Object obj) {
        return obj == null ? zzb(zzakh.zzbWr) : zzc(obj, obj.getClass());
    }

    public String zzb(zzakf com_google_android_gms_internal_zzakf) {
        Appendable stringWriter = new StringWriter();
        zza(com_google_android_gms_internal_zzakf, stringWriter);
        return stringWriter.toString();
    }

    public String zzc(Object obj, Type type) {
        Appendable stringWriter = new StringWriter();
        zza(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public <T> T zzf(String str, Class<T> cls) throws zzako {
        return zzalf.zzp(cls).cast(zza(str, (Type) cls));
    }

    public <T> zzakr<T> zzk(Class<T> cls) {
        return zza(zzalv.zzr(cls));
    }
}
