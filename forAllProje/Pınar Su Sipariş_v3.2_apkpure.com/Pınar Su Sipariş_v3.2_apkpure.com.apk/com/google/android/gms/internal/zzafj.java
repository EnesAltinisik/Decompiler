package com.google.android.gms.internal;

import com.google.android.gms.internal.zzadx.zzb;
import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class zzafj {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzafj.class.desiredAssertionStatus());
    private final zzahf zzbHV;
    private final zzagd zzbNk;
    private zzagi<zzafi> zzbNl = zzagi.zzSo();
    private final zzafq zzbNm = new zzafq();
    private final Map<zzafk, zzagu> zzbNn = new HashMap();
    private final Map<zzagu, zzafk> zzbNo = new HashMap();
    private final Set<zzagu> zzbNp = new HashSet();
    private final zzd zzbNq;
    private long zzbNr = 1;

    public interface zzd {
        void zza(zzagu com_google_android_gms_internal_zzagu, zzafk com_google_android_gms_internal_zzafk);

        void zza(zzagu com_google_android_gms_internal_zzagu, zzafk com_google_android_gms_internal_zzafk, zzaei com_google_android_gms_internal_zzaei, zza com_google_android_gms_internal_zzafj_zza);
    }

    private static class a extends zzaew {
        private zzagu a;

        public a(zzagu com_google_android_gms_internal_zzagu) {
            this.a = com_google_android_gms_internal_zzagu;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public zzagu zzQM() {
            return this.a;
        }

        public zzaew zza(zzagu com_google_android_gms_internal_zzagu) {
            return new a(com_google_android_gms_internal_zzagu);
        }

        public zzagp zza(zzago com_google_android_gms_internal_zzago, zzagu com_google_android_gms_internal_zzagu) {
            return null;
        }

        public void zza(zzagp com_google_android_gms_internal_zzagp) {
        }

        public void zza(DatabaseError databaseError) {
        }

        public boolean zza(com.google.android.gms.internal.zzagq.zza com_google_android_gms_internal_zzagq_zza) {
            return false;
        }

        public boolean zzc(zzaew com_google_android_gms_internal_zzaew) {
            return com_google_android_gms_internal_zzaew instanceof a;
        }
    }

    public interface zza {
        List<? extends zzagq> zzb(DatabaseError databaseError);
    }

    private class b implements zzaei, zza {
        final /* synthetic */ zzafj a;
        private final zzagv b;
        private final zzafk c;

        public b(zzafj com_google_android_gms_internal_zzafj, zzagv com_google_android_gms_internal_zzagv) {
            this.a = com_google_android_gms_internal_zzafj;
            this.b = com_google_android_gms_internal_zzagv;
            this.c = com_google_android_gms_internal_zzafj.zze(com_google_android_gms_internal_zzagv.zzSS());
        }

        public String zzPY() {
            return this.b.zzST().zzTn();
        }

        public boolean zzPZ() {
            return zzaiq.zzs(this.b.zzST()) > 1024;
        }

        public zzaec zzQa() {
            zzahk zzh = zzahk.zzh(this.b.zzST());
            List<zzafa> zzPR = zzh.zzPR();
            List arrayList = new ArrayList(zzPR.size());
            for (zzafa zzRs : zzPR) {
                arrayList.add(zzRs.zzRs());
            }
            return new zzaec(arrayList, zzh.zzPS());
        }

        public List<? extends zzagq> zzb(DatabaseError databaseError) {
            if (databaseError == null) {
                return this.c != null ? this.a.zza(this.c) : this.a.zzt(this.b.zzSS().zzPn());
            } else {
                zzahf zza = this.a.zzbHV;
                String valueOf = String.valueOf(this.b.zzSS().zzPn());
                String valueOf2 = String.valueOf(databaseError.toString());
                zza.warn(new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("Listen at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
                return this.a.zza(this.b.zzSS(), databaseError);
            }
        }
    }

    public zzafj(zzaeu com_google_android_gms_internal_zzaeu, zzagd com_google_android_gms_internal_zzagd, zzd com_google_android_gms_internal_zzafj_zzd) {
        this.zzbNq = com_google_android_gms_internal_zzafj_zzd;
        this.zzbNk = com_google_android_gms_internal_zzagd;
        this.zzbHV = com_google_android_gms_internal_zzaeu.zzib("SyncTree");
    }

    private zzafk zzRL() {
        long j = this.zzbNr;
        this.zzbNr = 1 + j;
        return new zzafk(j);
    }

    private void zzT(List<zzagu> list) {
        for (zzagu com_google_android_gms_internal_zzagu : list) {
            if (!com_google_android_gms_internal_zzagu.zzSO()) {
                zzafk zze = zze(com_google_android_gms_internal_zzagu);
                if ($assertionsDisabled || zze != null) {
                    this.zzbNo.remove(com_google_android_gms_internal_zzagu);
                    this.zzbNn.remove(zze);
                } else {
                    throw new AssertionError();
                }
            }
        }
    }

    private List<zzagq> zza(zzafw com_google_android_gms_internal_zzafw) {
        return zza(com_google_android_gms_internal_zzafw, this.zzbNl, null, this.zzbNm.zzu(zzafa.zzRq()));
    }

    private List<zzagq> zza(zzafw com_google_android_gms_internal_zzafw, zzagi<zzafi> com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi, zzahu com_google_android_gms_internal_zzahu, zzafr com_google_android_gms_internal_zzafr) {
        if (com_google_android_gms_internal_zzafw.zzPn().isEmpty()) {
            return zzb(com_google_android_gms_internal_zzafw, com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzafr);
        }
        zzafi com_google_android_gms_internal_zzafi = (zzafi) com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi.getValue();
        if (com_google_android_gms_internal_zzahu == null && com_google_android_gms_internal_zzafi != null) {
            com_google_android_gms_internal_zzahu = com_google_android_gms_internal_zzafi.zzs(zzafa.zzRq());
        }
        List<zzagq> arrayList = new ArrayList();
        zzahi zzRt = com_google_android_gms_internal_zzafw.zzPn().zzRt();
        zzafw zzc = com_google_android_gms_internal_zzafw.zzc(zzRt);
        zzagi com_google_android_gms_internal_zzagi = (zzagi) com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi.zzSp().get(zzRt);
        if (!(com_google_android_gms_internal_zzagi == null || zzc == null)) {
            arrayList.addAll(zza(zzc, com_google_android_gms_internal_zzagi, com_google_android_gms_internal_zzahu != null ? com_google_android_gms_internal_zzahu.zzm(zzRt) : null, com_google_android_gms_internal_zzafr.zzb(zzRt)));
        }
        if (com_google_android_gms_internal_zzafi != null) {
            arrayList.addAll(com_google_android_gms_internal_zzafi.zza(com_google_android_gms_internal_zzafw, com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu));
        }
        return arrayList;
    }

    private List<zzagv> zza(zzagi<zzafi> com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi) {
        List arrayList = new ArrayList();
        zza((zzagi) com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi, arrayList);
        return arrayList;
    }

    private List<? extends zzagq> zza(zzagu com_google_android_gms_internal_zzagu, zzafw com_google_android_gms_internal_zzafw) {
        zzafa zzPn = com_google_android_gms_internal_zzagu.zzPn();
        zzafi com_google_android_gms_internal_zzafi = (zzafi) this.zzbNl.zzK(zzPn);
        if ($assertionsDisabled || com_google_android_gms_internal_zzafi != null) {
            return com_google_android_gms_internal_zzafi.zza(com_google_android_gms_internal_zzafw, this.zzbNm.zzu(zzPn), null);
        }
        throw new AssertionError("Missing sync point for query tag that we're tracking");
    }

    private void zza(zzagi<zzafi> com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi, List<zzagv> list) {
        zzafi com_google_android_gms_internal_zzafi = (zzafi) com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi.getValue();
        if (com_google_android_gms_internal_zzafi == null || !com_google_android_gms_internal_zzafi.zzRI()) {
            if (com_google_android_gms_internal_zzafi != null) {
                list.addAll(com_google_android_gms_internal_zzafi.zzRH());
            }
            Iterator it = com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi.zzSp().iterator();
            while (it.hasNext()) {
                zza((zzagi) ((Entry) it.next()).getValue(), (List) list);
            }
            return;
        }
        list.add(com_google_android_gms_internal_zzafi.zzRJ());
    }

    private void zza(zzagu com_google_android_gms_internal_zzagu, zzagv com_google_android_gms_internal_zzagv) {
        zzafa zzPn = com_google_android_gms_internal_zzagu.zzPn();
        zzafk zze = zze(com_google_android_gms_internal_zzagu);
        Object bVar = new b(this, com_google_android_gms_internal_zzagv);
        this.zzbNq.zza(zzd(com_google_android_gms_internal_zzagu), zze, bVar, bVar);
        zzagi zzI = this.zzbNl.zzI(zzPn);
        if (zze == null) {
            zzI.zza(new com.google.android.gms.internal.zzagi.zza<zzafi, Void>(this) {
                final /* synthetic */ zzafj a;

                {
                    this.a = r1;
                }

                public Void a(zzafa com_google_android_gms_internal_zzafa, zzafi com_google_android_gms_internal_zzafi, Void voidR) {
                    zzagu zzSS;
                    if (com_google_android_gms_internal_zzafa.isEmpty() || !com_google_android_gms_internal_zzafi.zzRI()) {
                        for (zzagv zzSS2 : com_google_android_gms_internal_zzafi.zzRH()) {
                            zzSS = zzSS2.zzSS();
                            this.a.zzbNq.zza(this.a.zzd(zzSS), this.a.zze(zzSS));
                        }
                    } else {
                        zzSS = com_google_android_gms_internal_zzafi.zzRJ().zzSS();
                        this.a.zzbNq.zza(this.a.zzd(zzSS), this.a.zze(zzSS));
                    }
                    return null;
                }

                public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                    return a(com_google_android_gms_internal_zzafa, (zzafi) obj, (Void) obj2);
                }
            });
        } else if (!$assertionsDisabled && ((zzafi) zzI.getValue()).zzRI()) {
            throw new AssertionError("If we're adding a query, it shouldn't be shadowed");
        }
    }

    private zzagu zzb(zzafk com_google_android_gms_internal_zzafk) {
        return (zzagu) this.zzbNn.get(com_google_android_gms_internal_zzafk);
    }

    private List<zzagq> zzb(zzafw com_google_android_gms_internal_zzafw, zzagi<zzafi> com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi, zzahu com_google_android_gms_internal_zzahu, zzafr com_google_android_gms_internal_zzafr) {
        zzafi com_google_android_gms_internal_zzafi = (zzafi) com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi.getValue();
        final zzahu zzs = (com_google_android_gms_internal_zzahu != null || com_google_android_gms_internal_zzafi == null) ? com_google_android_gms_internal_zzahu : com_google_android_gms_internal_zzafi.zzs(zzafa.zzRq());
        final List<zzagq> arrayList = new ArrayList();
        final zzafr com_google_android_gms_internal_zzafr2 = com_google_android_gms_internal_zzafr;
        final zzafw com_google_android_gms_internal_zzafw2 = com_google_android_gms_internal_zzafw;
        com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi.zzSp().zza(new zzb<zzahi, zzagi<zzafi>>(this) {
            final /* synthetic */ zzafj e;

            public void a(zzahi com_google_android_gms_internal_zzahi, zzagi<zzafi> com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi) {
                zzahu com_google_android_gms_internal_zzahu = null;
                if (zzs != null) {
                    com_google_android_gms_internal_zzahu = zzs.zzm(com_google_android_gms_internal_zzahi);
                }
                zzafr zzb = com_google_android_gms_internal_zzafr2.zzb(com_google_android_gms_internal_zzahi);
                zzafw zzc = com_google_android_gms_internal_zzafw2.zzc(com_google_android_gms_internal_zzahi);
                if (zzc != null) {
                    arrayList.addAll(this.e.zzb(zzc, com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzafi, com_google_android_gms_internal_zzahu, zzb));
                }
            }

            public /* synthetic */ void zzk(Object obj, Object obj2) {
                a((zzahi) obj, (zzagi) obj2);
            }
        });
        if (com_google_android_gms_internal_zzafi != null) {
            arrayList.addAll(com_google_android_gms_internal_zzafi.zza(com_google_android_gms_internal_zzafw, com_google_android_gms_internal_zzafr, zzs));
        }
        return arrayList;
    }

    private List<zzagq> zzb(final zzagu com_google_android_gms_internal_zzagu, final zzaew com_google_android_gms_internal_zzaew, final DatabaseError databaseError) {
        return (List) this.zzbNk.zzf(new Callable<List<zzagq>>(this) {
            static final /* synthetic */ boolean a = (!zzafj.class.desiredAssertionStatus());
            final /* synthetic */ zzafj e;

            public List<zzagq> a() {
                zzafa zzPn = com_google_android_gms_internal_zzagu.zzPn();
                zzafi com_google_android_gms_internal_zzafi = (zzafi) this.e.zzbNl.zzK(zzPn);
                List<zzagq> arrayList = new ArrayList();
                if (com_google_android_gms_internal_zzafi != null && (com_google_android_gms_internal_zzagu.isDefault() || com_google_android_gms_internal_zzafi.zzc(com_google_android_gms_internal_zzagu))) {
                    Object obj;
                    zzais zza = com_google_android_gms_internal_zzafi.zza(com_google_android_gms_internal_zzagu, com_google_android_gms_internal_zzaew, databaseError);
                    if (com_google_android_gms_internal_zzafi.isEmpty()) {
                        this.e.zzbNl = this.e.zzbNl.zzJ(zzPn);
                    }
                    List<zzagu> list = (List) zza.getFirst();
                    arrayList = (List) zza.zzUj();
                    Object obj2 = null;
                    for (zzagu com_google_android_gms_internal_zzagu : list) {
                        this.e.zzbNk.zzh(com_google_android_gms_internal_zzagu);
                        obj = (obj2 != null || com_google_android_gms_internal_zzagu.zzSO()) ? 1 : null;
                        obj2 = obj;
                    }
                    zzagi zzd = this.e.zzbNl;
                    obj = (zzd.getValue() == null || !((zzafi) zzd.getValue()).zzRI()) ? null : 1;
                    Iterator it = zzPn.iterator();
                    zzagi com_google_android_gms_internal_zzagi = zzd;
                    Object obj3 = obj;
                    while (it.hasNext()) {
                        com_google_android_gms_internal_zzagi = com_google_android_gms_internal_zzagi.zze((zzahi) it.next());
                        obj = (obj3 != null || (com_google_android_gms_internal_zzagi.getValue() != null && ((zzafi) com_google_android_gms_internal_zzagi.getValue()).zzRI())) ? 1 : null;
                        if (obj != null) {
                            obj3 = obj;
                            break;
                        } else if (com_google_android_gms_internal_zzagi.isEmpty()) {
                            obj3 = obj;
                            break;
                        } else {
                            obj3 = obj;
                        }
                    }
                    if (obj2 != null && obj3 == null) {
                        zzagi zzI = this.e.zzbNl.zzI(zzPn);
                        if (!zzI.isEmpty()) {
                            for (zzagv com_google_android_gms_internal_zzagv : this.e.zza(zzI)) {
                                Object bVar = new b(this.e, com_google_android_gms_internal_zzagv);
                                this.e.zzbNq.zza(this.e.zzd(com_google_android_gms_internal_zzagv.zzSS()), bVar.c, bVar, bVar);
                            }
                        }
                    }
                    if (obj3 == null && !list.isEmpty() && databaseError == null) {
                        if (obj2 != null) {
                            this.e.zzbNq.zza(this.e.zzd(com_google_android_gms_internal_zzagu), null);
                        } else {
                            for (zzagu com_google_android_gms_internal_zzagu2 : list) {
                                zzafk zza2 = this.e.zze(com_google_android_gms_internal_zzagu2);
                                if (a || zza2 != null) {
                                    this.e.zzbNq.zza(this.e.zzd(com_google_android_gms_internal_zzagu2), zza2);
                                } else {
                                    throw new AssertionError();
                                }
                            }
                        }
                    }
                    this.e.zzT(list);
                }
                return arrayList;
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    private zzagu zzd(zzagu com_google_android_gms_internal_zzagu) {
        return (!com_google_android_gms_internal_zzagu.zzSO() || com_google_android_gms_internal_zzagu.isDefault()) ? com_google_android_gms_internal_zzagu : zzagu.zzN(com_google_android_gms_internal_zzagu.zzPn());
    }

    private zzafk zze(zzagu com_google_android_gms_internal_zzagu) {
        return (zzafk) this.zzbNo.get(com_google_android_gms_internal_zzagu);
    }

    public boolean isEmpty() {
        return this.zzbNl.isEmpty();
    }

    public List<? extends zzagq> zzRK() {
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj a;

            {
                this.a = r1;
            }

            public List<? extends zzagq> a() throws Exception {
                this.a.zzbNk.zzPs();
                if (this.a.zzbNm.zzRT().isEmpty()) {
                    return Collections.emptyList();
                }
                return this.a.zza(new zzaft(zzafa.zzRq(), new zzagi(Boolean.valueOf(true)), true));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<? extends zzagq> zza(long j, boolean z, boolean z2, zzain com_google_android_gms_internal_zzain) {
        final boolean z3 = z2;
        final long j2 = j;
        final boolean z4 = z;
        final zzain com_google_android_gms_internal_zzain2 = com_google_android_gms_internal_zzain;
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj e;

            public List<? extends zzagq> a() {
                if (z3) {
                    this.e.zzbNk.zzat(j2);
                }
                zzafn zzaE = this.e.zzbNm.zzaE(j2);
                boolean zzaF = this.e.zzbNm.zzaF(j2);
                if (zzaE.isVisible() && !z4) {
                    Map zza = zzaff.zza(com_google_android_gms_internal_zzain2);
                    if (zzaE.zzRQ()) {
                        this.e.zzbNk.zzk(zzaE.zzPn(), zzaff.zza(zzaE.zzRO(), zza));
                    } else {
                        this.e.zzbNk.zzc(zzaE.zzPn(), zzaff.zza(zzaE.zzRP(), zza));
                    }
                }
                if (!zzaF) {
                    return Collections.emptyList();
                }
                zzagi zzb;
                zzagi zzSo = zzagi.zzSo();
                if (zzaE.zzRQ()) {
                    zzb = zzSo.zzb(zzafa.zzRq(), Boolean.valueOf(true));
                } else {
                    Iterator it = zzaE.zzRP().iterator();
                    zzb = zzSo;
                    while (it.hasNext()) {
                        zzb = zzb.zzb((zzafa) ((Entry) it.next()).getKey(), Boolean.valueOf(true));
                    }
                }
                return this.e.zza(new zzaft(zzaE.zzPn(), zzb, z4));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<? extends zzagq> zza(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes, zzaes com_google_android_gms_internal_zzaes2, long j, boolean z) {
        final boolean z2 = z;
        final zzafa com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa;
        final zzaes com_google_android_gms_internal_zzaes3 = com_google_android_gms_internal_zzaes;
        final long j2 = j;
        final zzaes com_google_android_gms_internal_zzaes4 = com_google_android_gms_internal_zzaes2;
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj f;

            public List<? extends zzagq> a() throws Exception {
                if (z2) {
                    this.f.zzbNk.zza(com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzaes3, j2);
                }
                this.f.zzbNm.zza(com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzaes4, Long.valueOf(j2));
                return this.f.zza(new zzafv(zzafx.zzbOu, com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzaes4));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<? extends zzagq> zza(final zzafa com_google_android_gms_internal_zzafa, final zzahu com_google_android_gms_internal_zzahu, final zzafk com_google_android_gms_internal_zzafk) {
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj d;

            public List<? extends zzagq> a() {
                zzagu zza = this.d.zzb(com_google_android_gms_internal_zzafk);
                if (zza == null) {
                    return Collections.emptyList();
                }
                zzafa zza2 = zzafa.zza(zza.zzPn(), com_google_android_gms_internal_zzafa);
                this.d.zzbNk.zza(zza2.isEmpty() ? zza : zzagu.zzN(com_google_android_gms_internal_zzafa), com_google_android_gms_internal_zzahu);
                return this.d.zza(zza, new zzafy(zzafx.zzc(zza.zzSR()), zza2, com_google_android_gms_internal_zzahu));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<? extends zzagq> zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, zzahu com_google_android_gms_internal_zzahu2, long j, boolean z, boolean z2) {
        boolean z3 = z || !z2;
        zzaiv.zzb(z3, "We shouldn't be persisting non-visible writes.");
        final boolean z4 = z2;
        final zzafa com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa;
        final zzahu com_google_android_gms_internal_zzahu3 = com_google_android_gms_internal_zzahu;
        final long j2 = j;
        final zzahu com_google_android_gms_internal_zzahu4 = com_google_android_gms_internal_zzahu2;
        final boolean z5 = z;
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj g;

            public List<? extends zzagq> a() {
                if (z4) {
                    this.g.zzbNk.zza(com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzahu3, j2);
                }
                this.g.zzbNm.zza(com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzahu4, Long.valueOf(j2), z5);
                return !z5 ? Collections.emptyList() : this.g.zza(new zzafy(zzafx.zzbOu, com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzahu4));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<? extends zzagq> zza(zzafa com_google_android_gms_internal_zzafa, List<zzahz> list, zzafk com_google_android_gms_internal_zzafk) {
        zzagu zzb = zzb(com_google_android_gms_internal_zzafk);
        if (zzb == null) {
            return Collections.emptyList();
        }
        if ($assertionsDisabled || com_google_android_gms_internal_zzafa.equals(zzb.zzPn())) {
            zzafi com_google_android_gms_internal_zzafi = (zzafi) this.zzbNl.zzK(zzb.zzPn());
            if ($assertionsDisabled || com_google_android_gms_internal_zzafi != null) {
                zzagv zzb2 = com_google_android_gms_internal_zzafi.zzb(zzb);
                if ($assertionsDisabled || zzb2 != null) {
                    zzahu zzST = zzb2.zzST();
                    zzahu com_google_android_gms_internal_zzahu = zzST;
                    for (zzahz zzq : list) {
                        com_google_android_gms_internal_zzahu = zzq.zzq(com_google_android_gms_internal_zzahu);
                    }
                    return zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzafk);
                }
                throw new AssertionError("Missing view for query tag that we're tracking");
            }
            throw new AssertionError("Missing sync point for query tag that we're tracking");
        }
        throw new AssertionError();
    }

    public List<? extends zzagq> zza(final zzafa com_google_android_gms_internal_zzafa, final Map<zzafa, zzahu> map) {
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj c;

            public List<? extends zzagq> a() {
                zzaes zzay = zzaes.zzay(map);
                this.c.zzbNk.zzd(com_google_android_gms_internal_zzafa, zzay);
                return this.c.zza(new zzafv(zzafx.zzbOv, com_google_android_gms_internal_zzafa, zzay));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<? extends zzagq> zza(final zzafa com_google_android_gms_internal_zzafa, final Map<zzafa, zzahu> map, final zzafk com_google_android_gms_internal_zzafk) {
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj d;

            public List<? extends zzagq> a() {
                zzagu zza = this.d.zzb(com_google_android_gms_internal_zzafk);
                if (zza == null) {
                    return Collections.emptyList();
                }
                zzafa zza2 = zzafa.zza(zza.zzPn(), com_google_android_gms_internal_zzafa);
                zzaes zzay = zzaes.zzay(map);
                this.d.zzbNk.zzd(com_google_android_gms_internal_zzafa, zzay);
                return this.d.zza(zza, new zzafv(zzafx.zzc(zza.zzSR()), zza2, zzay));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<? extends zzagq> zza(final zzafk com_google_android_gms_internal_zzafk) {
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj b;

            public List<? extends zzagq> a() {
                zzagu zza = this.b.zzb(com_google_android_gms_internal_zzafk);
                if (zza == null) {
                    return Collections.emptyList();
                }
                this.b.zzbNk.zzi(zza);
                return this.b.zza(zza, new zzafu(zzafx.zzc(zza.zzSR()), zzafa.zzRq()));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<zzagq> zza(zzagu com_google_android_gms_internal_zzagu, DatabaseError databaseError) {
        return zzb(com_google_android_gms_internal_zzagu, null, databaseError);
    }

    public void zza(zzagu com_google_android_gms_internal_zzagu, boolean z) {
        if (z && !this.zzbNp.contains(com_google_android_gms_internal_zzagu)) {
            zzg(new a(com_google_android_gms_internal_zzagu));
            this.zzbNp.add(com_google_android_gms_internal_zzagu);
        } else if (!z && this.zzbNp.contains(com_google_android_gms_internal_zzagu)) {
            zzh(new a(com_google_android_gms_internal_zzagu));
            this.zzbNp.remove(com_google_android_gms_internal_zzagu);
        }
    }

    public List<? extends zzagq> zzb(zzafa com_google_android_gms_internal_zzafa, List<zzahz> list) {
        zzafi com_google_android_gms_internal_zzafi = (zzafi) this.zzbNl.zzK(com_google_android_gms_internal_zzafa);
        if (com_google_android_gms_internal_zzafi == null) {
            return Collections.emptyList();
        }
        zzagv zzRJ = com_google_android_gms_internal_zzafi.zzRJ();
        if (zzRJ == null) {
            return Collections.emptyList();
        }
        zzahu zzST = zzRJ.zzST();
        zzahu com_google_android_gms_internal_zzahu = zzST;
        for (zzahz zzq : list) {
            com_google_android_gms_internal_zzahu = zzq.zzq(com_google_android_gms_internal_zzahu);
        }
        return zzi(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu);
    }

    public zzahu zzc(zzafa com_google_android_gms_internal_zzafa, List<Long> list) {
        zzahu zzs;
        zzagi com_google_android_gms_internal_zzagi = this.zzbNl;
        zzafi com_google_android_gms_internal_zzafi = (zzafi) com_google_android_gms_internal_zzagi.getValue();
        zzahu com_google_android_gms_internal_zzahu = null;
        zzafa zzRq = zzafa.zzRq();
        zzagi com_google_android_gms_internal_zzagi2 = com_google_android_gms_internal_zzagi;
        zzafa com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa;
        while (true) {
            zzahi zzRt = com_google_android_gms_internal_zzafa2.zzRt();
            zzafa zzRu = com_google_android_gms_internal_zzafa2.zzRu();
            com_google_android_gms_internal_zzafa2 = zzRq.zza(zzRt);
            zzafa zza = zzafa.zza(com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzafa);
            com_google_android_gms_internal_zzagi2 = zzRt != null ? com_google_android_gms_internal_zzagi2.zze(zzRt) : zzagi.zzSo();
            com_google_android_gms_internal_zzafi = (zzafi) com_google_android_gms_internal_zzagi2.getValue();
            zzs = com_google_android_gms_internal_zzafi != null ? com_google_android_gms_internal_zzafi.zzs(zza) : com_google_android_gms_internal_zzahu;
            if (!zzRu.isEmpty() && zzs == null) {
                com_google_android_gms_internal_zzahu = zzs;
                zzRq = com_google_android_gms_internal_zzafa2;
                com_google_android_gms_internal_zzafa2 = zzRu;
            }
        }
        return this.zzbNm.zza(com_google_android_gms_internal_zzafa, zzs, (List) list, true);
    }

    public List<? extends zzagq> zzg(final zzaew com_google_android_gms_internal_zzaew) {
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            static final /* synthetic */ boolean a = (!zzafj.class.desiredAssertionStatus());
            final /* synthetic */ zzafj c;

            public List<? extends zzagq> a() {
                zzafi com_google_android_gms_internal_zzafi;
                zzahu com_google_android_gms_internal_zzahu;
                zzafi com_google_android_gms_internal_zzafi2;
                zzagm com_google_android_gms_internal_zzagm;
                zzagu zzQM = com_google_android_gms_internal_zzaew.zzQM();
                zzafa zzPn = zzQM.zzPn();
                zzahu com_google_android_gms_internal_zzahu2 = null;
                zzafa com_google_android_gms_internal_zzafa = zzPn;
                zzagi zzd = this.c.zzbNl;
                boolean z = false;
                while (!zzd.isEmpty()) {
                    boolean z2;
                    zzahu com_google_android_gms_internal_zzahu3;
                    com_google_android_gms_internal_zzafi = (zzafi) zzd.getValue();
                    if (com_google_android_gms_internal_zzafi != null) {
                        if (com_google_android_gms_internal_zzahu2 == null) {
                            com_google_android_gms_internal_zzahu2 = com_google_android_gms_internal_zzafi.zzs(com_google_android_gms_internal_zzafa);
                        }
                        z2 = z || com_google_android_gms_internal_zzafi.zzRI();
                        com_google_android_gms_internal_zzahu3 = com_google_android_gms_internal_zzahu2;
                    } else {
                        z2 = z;
                        com_google_android_gms_internal_zzahu3 = com_google_android_gms_internal_zzahu2;
                    }
                    zzd = zzd.zze(com_google_android_gms_internal_zzafa.isEmpty() ? zzahi.zzig("") : com_google_android_gms_internal_zzafa.zzRt());
                    com_google_android_gms_internal_zzafa = com_google_android_gms_internal_zzafa.zzRu();
                    com_google_android_gms_internal_zzahu2 = com_google_android_gms_internal_zzahu3;
                    z = z2;
                }
                com_google_android_gms_internal_zzafi = (zzafi) this.c.zzbNl.zzK(zzPn);
                zzafi com_google_android_gms_internal_zzafi3;
                boolean z3;
                if (com_google_android_gms_internal_zzafi == null) {
                    com_google_android_gms_internal_zzafi = new zzafi(this.c.zzbNk);
                    this.c.zzbNl = this.c.zzbNl.zzb(zzPn, (Object) com_google_android_gms_internal_zzafi);
                    com_google_android_gms_internal_zzafi3 = com_google_android_gms_internal_zzafi;
                    com_google_android_gms_internal_zzahu = com_google_android_gms_internal_zzahu2;
                    z3 = z;
                    com_google_android_gms_internal_zzafi2 = com_google_android_gms_internal_zzafi3;
                } else {
                    z = z || com_google_android_gms_internal_zzafi.zzRI();
                    if (com_google_android_gms_internal_zzahu2 == null) {
                        com_google_android_gms_internal_zzahu2 = com_google_android_gms_internal_zzafi.zzs(zzafa.zzRq());
                    }
                    com_google_android_gms_internal_zzafi3 = com_google_android_gms_internal_zzafi;
                    com_google_android_gms_internal_zzahu = com_google_android_gms_internal_zzahu2;
                    z3 = z;
                    com_google_android_gms_internal_zzafi2 = com_google_android_gms_internal_zzafi3;
                }
                this.c.zzbNk.zzg(zzQM);
                if (com_google_android_gms_internal_zzahu != null) {
                    com_google_android_gms_internal_zzagm = new zzagm(zzahp.zza(com_google_android_gms_internal_zzahu, zzQM.zzSK()), true, false);
                } else {
                    zzagm zzf = this.c.zzbNk.zzf(zzQM);
                    if (zzf.zzSr()) {
                        com_google_android_gms_internal_zzagm = zzf;
                    } else {
                        zzahu zzTA = zzahn.zzTA();
                        Iterator it = this.c.zzbNl.zzI(zzPn).zzSp().iterator();
                        while (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            zzafi com_google_android_gms_internal_zzafi4 = (zzafi) ((zzagi) entry.getValue()).getValue();
                            if (com_google_android_gms_internal_zzafi4 != null) {
                                zzahu zzs = com_google_android_gms_internal_zzafi4.zzs(zzafa.zzRq());
                                if (zzs != null) {
                                    com_google_android_gms_internal_zzahu = zzTA.zze((zzahi) entry.getKey(), zzs);
                                    zzTA = com_google_android_gms_internal_zzahu;
                                }
                            }
                            com_google_android_gms_internal_zzahu = zzTA;
                            zzTA = com_google_android_gms_internal_zzahu;
                        }
                        for (zzaht com_google_android_gms_internal_zzaht : zzf.zzPj()) {
                            if (!zzTA.zzk(com_google_android_gms_internal_zzaht.zzTK())) {
                                zzTA = zzTA.zze(com_google_android_gms_internal_zzaht.zzTK(), com_google_android_gms_internal_zzaht.zzPj());
                            }
                        }
                        com_google_android_gms_internal_zzagm = new zzagm(zzahp.zza(zzTA, zzQM.zzSK()), false, false);
                    }
                }
                boolean zzc = com_google_android_gms_internal_zzafi2.zzc(zzQM);
                if (!(zzc || zzQM.zzSO())) {
                    if (a || !this.c.zzbNo.containsKey(zzQM)) {
                        zzafk zzf2 = this.c.zzRL();
                        this.c.zzbNo.put(zzQM, zzf2);
                        this.c.zzbNn.put(zzf2, zzQM);
                    } else {
                        throw new AssertionError("View does not exist but we have a tag");
                    }
                }
                List<? extends zzagq> zza = com_google_android_gms_internal_zzafi2.zza(com_google_android_gms_internal_zzaew, this.c.zzbNm.zzu(zzPn), com_google_android_gms_internal_zzagm);
                if (!(zzc || r4)) {
                    this.c.zza(zzQM, com_google_android_gms_internal_zzafi2.zzb(zzQM));
                }
                return zza;
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<zzagq> zzh(zzaew com_google_android_gms_internal_zzaew) {
        return zzb(com_google_android_gms_internal_zzaew.zzQM(), com_google_android_gms_internal_zzaew, null);
    }

    public List<? extends zzagq> zzi(final zzafa com_google_android_gms_internal_zzafa, final zzahu com_google_android_gms_internal_zzahu) {
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj c;

            public List<? extends zzagq> a() {
                this.c.zzbNk.zza(zzagu.zzN(com_google_android_gms_internal_zzafa), com_google_android_gms_internal_zzahu);
                return this.c.zza(new zzafy(zzafx.zzbOv, com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    public List<? extends zzagq> zzt(final zzafa com_google_android_gms_internal_zzafa) {
        return (List) this.zzbNk.zzf(new Callable<List<? extends zzagq>>(this) {
            final /* synthetic */ zzafj b;

            public List<? extends zzagq> a() {
                this.b.zzbNk.zzi(zzagu.zzN(com_google_android_gms_internal_zzafa));
                return this.b.zza(new zzafu(zzafx.zzbOv, com_google_android_gms_internal_zzafa));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }
}
