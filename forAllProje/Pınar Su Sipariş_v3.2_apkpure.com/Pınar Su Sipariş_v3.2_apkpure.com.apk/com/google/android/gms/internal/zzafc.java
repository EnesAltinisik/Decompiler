package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaej.zza;
import com.google.android.gms.internal.zzafh.zzb;
import com.google.android.gms.internal.zzafj.zzd;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.DatabaseReference.CompletionListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.Transaction.Handler;
import com.google.firebase.database.Transaction.Result;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzafc implements zza {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzafc.class.desiredAssertionStatus());
    private final zzafd zzbHm;
    private final zzaej zzbKx;
    private final zzair zzbLN = new zzair(new zzaio(), 0);
    private zzafg zzbLO;
    private zzafh zzbLP;
    private zzagk<List<a>> zzbLQ;
    private boolean zzbLR = false;
    private final zzags zzbLS;
    private final zzaeu zzbLT;
    private final zzahf zzbLU;
    private final zzahf zzbLV;
    private final zzahf zzbLW;
    public long zzbLX = 0;
    private long zzbLY = 1;
    private zzafj zzbLZ;
    private zzafj zzbMa;
    private FirebaseDatabase zzbMb;
    private boolean zzbMc = false;
    private long zzbMd = 0;

    private static class a implements Comparable<a> {
        private zzafa a;
        private Handler b;
        private ValueEventListener c;
        private b d;
        private long e;
        private boolean f;
        private int g;
        private DatabaseError h;
        private long i;
        private zzahu j;
        private zzahu k;
        private zzahu l;

        private a(zzafa com_google_android_gms_internal_zzafa, Handler handler, ValueEventListener valueEventListener, b bVar, boolean z, long j) {
            this.a = com_google_android_gms_internal_zzafa;
            this.b = handler;
            this.c = valueEventListener;
            this.d = bVar;
            this.g = 0;
            this.f = z;
            this.e = j;
            this.h = null;
            this.j = null;
            this.k = null;
            this.l = null;
        }

        public int a(a aVar) {
            return this.e < aVar.e ? -1 : this.e == aVar.e ? 0 : 1;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return a((a) obj);
        }
    }

    private enum b {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    zzafc(zzafd com_google_android_gms_internal_zzafd, zzaeu com_google_android_gms_internal_zzaeu, FirebaseDatabase firebaseDatabase) {
        this.zzbHm = com_google_android_gms_internal_zzafd;
        this.zzbLT = com_google_android_gms_internal_zzaeu;
        this.zzbMb = firebaseDatabase;
        this.zzbLU = this.zzbLT.zzib("RepoOperation");
        this.zzbLV = this.zzbLT.zzib("Transaction");
        this.zzbLW = this.zzbLT.zzib("DataOperation");
        this.zzbLS = new zzags(this.zzbLT);
        this.zzbKx = com_google_android_gms_internal_zzaeu.zza(new zzaeh(com_google_android_gms_internal_zzafd.zzbJa, com_google_android_gms_internal_zzafd.zzasB, com_google_android_gms_internal_zzafd.zzbJb), this);
        scheduleNow(new Runnable(this) {
            final /* synthetic */ zzafc a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzRy();
            }
        });
    }

    private long zzRC() {
        long j = this.zzbLY;
        this.zzbLY = 1 + j;
        return j;
    }

    private void zzRD() {
        zzafh zza = zzaff.zza(this.zzbLP, zzaff.zza(this.zzbLN));
        final List arrayList = new ArrayList();
        zza.a(zzafa.zzRq(), new zzb(this) {
            final /* synthetic */ zzafc b;

            public void zzf(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
                arrayList.addAll(this.b.zzbMa.zzi(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu));
                this.b.zzo(this.b.zzb(com_google_android_gms_internal_zzafa, -9));
            }
        });
        this.zzbLP = new zzafh();
        zzS(arrayList);
    }

    private void zzRE() {
        zzagk com_google_android_gms_internal_zzagk = this.zzbLQ;
        zzb(com_google_android_gms_internal_zzagk);
        zza(com_google_android_gms_internal_zzagk);
    }

    private long zzRF() {
        long j = this.zzbMd;
        this.zzbMd = 1 + j;
        return j;
    }

    private void zzRy() {
        this.zzbLT.zzRe().zza(new zzaeq.zzb(this) {
            final /* synthetic */ zzafc a;

            {
                this.a = r1;
            }

            public void zzQL() {
                this.a.zzbLU.zzh("Auth token changed, triggering auth token refresh", new Object[0]);
                this.a.zzbKx.refreshAuthToken();
            }
        });
        this.zzbKx.initialize();
        zzagd zzic = this.zzbLT.zzic(this.zzbHm.zzbJa);
        this.zzbLO = new zzafg();
        this.zzbLP = new zzafh();
        this.zzbLQ = new zzagk();
        this.zzbLZ = new zzafj(this.zzbLT, new zzagc(), new zzd(this) {
            final /* synthetic */ zzafc a;

            {
                this.a = r1;
            }

            public void zza(zzagu com_google_android_gms_internal_zzagu, zzafk com_google_android_gms_internal_zzafk) {
            }

            public void zza(final zzagu com_google_android_gms_internal_zzagu, zzafk com_google_android_gms_internal_zzafk, zzaei com_google_android_gms_internal_zzaei, final zzafj.zza com_google_android_gms_internal_zzafj_zza) {
                this.a.scheduleNow(new Runnable(this) {
                    final /* synthetic */ AnonymousClass9 c;

                    public void run() {
                        zzahu zzq = this.c.a.zzbLO.zzq(com_google_android_gms_internal_zzagu.zzPn());
                        if (!zzq.isEmpty()) {
                            this.c.a.zzS(this.c.a.zzbLZ.zzi(com_google_android_gms_internal_zzagu.zzPn(), zzq));
                            com_google_android_gms_internal_zzafj_zza.zzb(null);
                        }
                    }
                });
            }
        });
        this.zzbMa = new zzafj(this.zzbLT, zzic, new zzd(this) {
            final /* synthetic */ zzafc a;

            {
                this.a = r1;
            }

            public void zza(zzagu com_google_android_gms_internal_zzagu, zzafk com_google_android_gms_internal_zzafk) {
                this.a.zzbKx.zza(com_google_android_gms_internal_zzagu.zzPn().zzRs(), com_google_android_gms_internal_zzagu.zzSR().zzSN());
            }

            public void zza(zzagu com_google_android_gms_internal_zzagu, zzafk com_google_android_gms_internal_zzafk, zzaei com_google_android_gms_internal_zzaei, final zzafj.zza com_google_android_gms_internal_zzafj_zza) {
                this.a.zzbKx.zza(com_google_android_gms_internal_zzagu.zzPn().zzRs(), com_google_android_gms_internal_zzagu.zzSR().zzSN(), com_google_android_gms_internal_zzaei, com_google_android_gms_internal_zzafk != null ? Long.valueOf(com_google_android_gms_internal_zzafk.zzRM()) : null, new zzaem(this) {
                    final /* synthetic */ AnonymousClass10 b;

                    public void zzaj(String str, String str2) {
                        this.b.a.zzS(com_google_android_gms_internal_zzafj_zza.zzb(zzafc.zzak(str, str2)));
                    }
                });
            }
        });
        zza(zzic);
        zzb(zzaet.zzbLn, Boolean.valueOf(false));
        zzb(zzaet.zzbLo, Boolean.valueOf(false));
    }

    private void zzS(List<? extends zzagq> list) {
        if (!list.isEmpty()) {
            this.zzbLS.zzU(list);
        }
    }

    private zzahu zza(zzafa com_google_android_gms_internal_zzafa, List<Long> list) {
        zzahu zzc = this.zzbMa.zzc(com_google_android_gms_internal_zzafa, list);
        return zzc == null ? zzahn.zzTA() : zzc;
    }

    private void zza(long j, zzafa com_google_android_gms_internal_zzafa, DatabaseError databaseError) {
        if (databaseError == null || databaseError.getCode() != -25) {
            List zza = this.zzbMa.zza(j, !(databaseError == null), true, this.zzbLN);
            if (zza.size() > 0) {
                zzo(com_google_android_gms_internal_zzafa);
            }
            zzS(zza);
        }
    }

    private void zza(zzagd com_google_android_gms_internal_zzagd) {
        List<zzafn> zzPp = com_google_android_gms_internal_zzagd.zzPp();
        Map zza = zzaff.zza(this.zzbLN);
        long j = Long.MIN_VALUE;
        for (final zzafn com_google_android_gms_internal_zzafn : zzPp) {
            zzaem anonymousClass11 = new zzaem(this) {
                final /* synthetic */ zzafc b;

                public void zzaj(String str, String str2) {
                    DatabaseError zzal = zzafc.zzak(str, str2);
                    this.b.zza("Persisted write", com_google_android_gms_internal_zzafn.zzPn(), zzal);
                    this.b.zza(com_google_android_gms_internal_zzafn.zzRN(), com_google_android_gms_internal_zzafn.zzPn(), zzal);
                }
            };
            if (j >= com_google_android_gms_internal_zzafn.zzRN()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            long zzRN = com_google_android_gms_internal_zzafn.zzRN();
            this.zzbLY = com_google_android_gms_internal_zzafn.zzRN() + 1;
            if (com_google_android_gms_internal_zzafn.zzRQ()) {
                if (this.zzbLU.zzTe()) {
                    this.zzbLU.zzh("Restoring overwrite with id " + com_google_android_gms_internal_zzafn.zzRN(), new Object[0]);
                }
                this.zzbKx.zza(com_google_android_gms_internal_zzafn.zzPn().zzRs(), com_google_android_gms_internal_zzafn.zzRO().getValue(true), anonymousClass11);
                this.zzbMa.zza(com_google_android_gms_internal_zzafn.zzPn(), com_google_android_gms_internal_zzafn.zzRO(), zzaff.zza(com_google_android_gms_internal_zzafn.zzRO(), zza), com_google_android_gms_internal_zzafn.zzRN(), true, false);
            } else {
                if (this.zzbLU.zzTe()) {
                    this.zzbLU.zzh("Restoring merge with id " + com_google_android_gms_internal_zzafn.zzRN(), new Object[0]);
                }
                this.zzbKx.zza(com_google_android_gms_internal_zzafn.zzPn().zzRs(), com_google_android_gms_internal_zzafn.zzRP().zzaQ(true), anonymousClass11);
                this.zzbMa.zza(com_google_android_gms_internal_zzafn.zzPn(), com_google_android_gms_internal_zzafn.zzRP(), zzaff.zza(com_google_android_gms_internal_zzafn.zzRP(), zza), com_google_android_gms_internal_zzafn.zzRN(), false);
            }
            j = zzRN;
        }
    }

    private void zza(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
        if (((List) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.getValue()) != null) {
            List<a> zzc = zzc((zzagk) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a);
            if ($assertionsDisabled || zzc.size() > 0) {
                Boolean valueOf;
                Boolean valueOf2 = Boolean.valueOf(true);
                for (a d : zzc) {
                    if (d.d != b.RUN) {
                        valueOf = Boolean.valueOf(false);
                        break;
                    }
                }
                valueOf = valueOf2;
                if (valueOf.booleanValue()) {
                    zza((List) zzc, com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.zzPn());
                    return;
                }
                return;
            }
            throw new AssertionError();
        } else if (com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.hasChildren()) {
            com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.zzb(new zzagk.zzb<List<a>>(this) {
                final /* synthetic */ zzafc a;

                {
                    this.a = r1;
                }

                public void zzd(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
                    this.a.zza((zzagk) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a);
                }
            });
        }
    }

    private void zza(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a, int i) {
        List list = (List) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.getValue();
        List arrayList = new ArrayList();
        if (list != null) {
            DatabaseError zzhL;
            List<Runnable> arrayList2 = new ArrayList();
            if (i == -9) {
                zzhL = DatabaseError.zzhL("overriddenBySet");
            } else {
                zzaiv.zzb(i == -25, "Unknown transaction abort reason: " + i);
                zzhL = DatabaseError.zznw(-25);
            }
            int i2 = 0;
            int i3 = -1;
            while (i2 < list.size()) {
                int i4;
                final a aVar = (a) list.get(i2);
                if (aVar.d == b.SENT_NEEDS_ABORT) {
                    i4 = i3;
                } else if (aVar.d == b.SENT) {
                    if ($assertionsDisabled || i3 == i2 - 1) {
                        aVar.d = b.SENT_NEEDS_ABORT;
                        aVar.h = zzhL;
                        i4 = i2;
                    } else {
                        throw new AssertionError();
                    }
                } else if ($assertionsDisabled || aVar.d == b.RUN) {
                    zze(new zzafp(this, aVar.c, zzagu.zzN(aVar.a)));
                    if (i == -9) {
                        arrayList.addAll(this.zzbMa.zza(aVar.i, true, false, this.zzbLN));
                    } else {
                        zzaiv.zzb(i == -25, "Unknown transaction abort reason: " + i);
                    }
                    arrayList2.add(new Runnable(this) {
                        final /* synthetic */ zzafc c;

                        public void run() {
                            aVar.b.onComplete(zzhL, false, null);
                        }
                    });
                    i4 = i3;
                } else {
                    throw new AssertionError();
                }
                i2++;
                i3 = i4;
            }
            if (i3 == -1) {
                com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.setValue(null);
            } else {
                com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.setValue(list.subList(0, i3 + 1));
            }
            zzS(arrayList);
            for (Runnable postEvent : arrayList2) {
                postEvent(postEvent);
            }
        }
    }

    private void zza(String str, zzafa com_google_android_gms_internal_zzafa, DatabaseError databaseError) {
        if (databaseError != null && databaseError.getCode() != -1 && databaseError.getCode() != -25) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbLU;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzafa.toString());
            String valueOf2 = String.valueOf(databaseError.toString());
            com_google_android_gms_internal_zzahf.warn(new StringBuilder(((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(" at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
        }
    }

    private void zza(final List<a> list, final zzafa com_google_android_gms_internal_zzafa) {
        List arrayList = new ArrayList();
        for (a c : list) {
            arrayList.add(Long.valueOf(c.i));
        }
        zzahu zza = zza(com_google_android_gms_internal_zzafa, arrayList);
        String str = "badhash";
        String zzTn = zza.zzTn();
        for (a c2 : list) {
            if ($assertionsDisabled || c2.d == b.RUN) {
                c2.d = b.SENT;
                c2.g = c2.g + 1;
                zza = zza.zzl(zzafa.zza(com_google_android_gms_internal_zzafa, c2.a), c2.k);
            } else {
                throw new AssertionError();
            }
        }
        Object value = zza.getValue(true);
        zzRC();
        this.zzbKx.zza(com_google_android_gms_internal_zzafa.zzRs(), value, zzTn, new zzaem(this) {
            final /* synthetic */ zzafc d;

            public void zzaj(String str, String str2) {
                int i = 0;
                DatabaseError zzal = zzafc.zzak(str, str2);
                this.d.zza("Transaction", com_google_android_gms_internal_zzafa, zzal);
                List arrayList = new ArrayList();
                if (zzal == null) {
                    List arrayList2 = new ArrayList();
                    for (final a aVar : list) {
                        aVar.d = b.COMPLETED;
                        arrayList.addAll(this.d.zzbMa.zza(aVar.i, false, false, this.d.zzbLN));
                        final DataSnapshot zza = com.google.firebase.database.zza.zza(com.google.firebase.database.zza.zza(this, aVar.a), zzahp.zzm(aVar.l));
                        arrayList2.add(new Runnable(this) {
                            final /* synthetic */ AnonymousClass22 c;

                            public void run() {
                                aVar.b.onComplete(null, true, zza);
                            }
                        });
                        this.d.zze(new zzafp(this.d, aVar.c, zzagu.zzN(aVar.a)));
                    }
                    this.d.zzb(this.d.zzbLQ.zzL(com_google_android_gms_internal_zzafa));
                    this.d.zzRE();
                    this.zzS(arrayList);
                    while (i < arrayList2.size()) {
                        this.d.postEvent((Runnable) arrayList2.get(i));
                        i++;
                    }
                    return;
                }
                if (zzal.getCode() == -1) {
                    for (a aVar2 : list) {
                        if (aVar2.d == b.SENT_NEEDS_ABORT) {
                            aVar2.d = b.NEEDS_ABORT;
                        } else {
                            aVar2.d = b.RUN;
                        }
                    }
                } else {
                    for (a aVar22 : list) {
                        aVar22.d = b.NEEDS_ABORT;
                        aVar22.h = zzal;
                    }
                }
                this.d.zzo(com_google_android_gms_internal_zzafa);
            }
        });
    }

    private void zza(final List<a> list, zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
        List list2 = (List) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.getValue();
        if (list2 != null) {
            list.addAll(list2);
        }
        com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.zzb(new zzagk.zzb<List<a>>(this) {
            final /* synthetic */ zzafc b;

            public void zzd(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
                this.b.zza(list, (zzagk) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a);
            }
        });
    }

    private static DatabaseError zzak(String str, String str2) {
        return str != null ? DatabaseError.zzah(str, str2) : null;
    }

    private zzafa zzb(zzafa com_google_android_gms_internal_zzafa, final int i) {
        zzafa zzPn = zzp(com_google_android_gms_internal_zzafa).zzPn();
        if (this.zzbLV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbLU;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            String valueOf2 = String.valueOf(zzPn);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()).append("Aborting transactions for path: ").append(valueOf).append(". Affected: ").append(valueOf2).toString(), new Object[0]);
        }
        zzagk zzL = this.zzbLQ.zzL(com_google_android_gms_internal_zzafa);
        zzL.zza(new zzagk.zza<List<a>>(this) {
            final /* synthetic */ zzafc b;

            public boolean zze(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
                this.b.zza((zzagk) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a, i);
                return false;
            }
        });
        zza(zzL, i);
        zzL.zza(new zzagk.zzb<List<a>>(this) {
            final /* synthetic */ zzafc b;

            public void zzd(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
                this.b.zza((zzagk) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a, i);
            }
        });
        return zzPn;
    }

    private void zzb(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
        List list = (List) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.getValue();
        if (list != null) {
            int i = 0;
            while (i < list.size()) {
                int i2;
                if (((a) list.get(i)).d == b.COMPLETED) {
                    list.remove(i);
                    i2 = i;
                } else {
                    i2 = i + 1;
                }
                i = i2;
            }
            if (list.size() > 0) {
                com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.setValue(list);
            } else {
                com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.setValue(null);
            }
        }
        com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.zzb(new zzagk.zzb<List<a>>(this) {
            final /* synthetic */ zzafc a;

            {
                this.a = r1;
            }

            public void zzd(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
                this.a.zzb((zzagk) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a);
            }
        });
    }

    private void zzb(zzahi com_google_android_gms_internal_zzahi, Object obj) {
        if (com_google_android_gms_internal_zzahi.equals(zzaet.zzbLm)) {
            this.zzbLN.zzaI(((Long) obj).longValue());
        }
        zzafa com_google_android_gms_internal_zzafa = new zzafa(zzaet.zzbLl, com_google_android_gms_internal_zzahi);
        try {
            zzahu zzaq = zzahv.zzaq(obj);
            this.zzbLO.zzg(com_google_android_gms_internal_zzafa, zzaq);
            zzS(this.zzbLZ.zzi(com_google_android_gms_internal_zzafa, zzaq));
        } catch (Throwable e) {
            this.zzbLU.zze("Failed to parse info update", e);
        }
    }

    private void zzb(List<a> list, zzafa com_google_android_gms_internal_zzafa) {
        if (!list.isEmpty()) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (a c : list) {
                arrayList2.add(Long.valueOf(c.i));
            }
            for (final a aVar : list) {
                zzafa zza = zzafa.zza(com_google_android_gms_internal_zzafa, aVar.a);
                ArrayList arrayList3 = new ArrayList();
                if ($assertionsDisabled || zza != null) {
                    Object obj;
                    DatabaseError k;
                    if (aVar.d == b.NEEDS_ABORT) {
                        obj = 1;
                        k = aVar.h;
                        if (k.getCode() != -25) {
                            arrayList3.addAll(this.zzbMa.zza(aVar.i, true, false, this.zzbLN));
                        }
                    } else if (aVar.d != b.RUN) {
                        k = null;
                        obj = null;
                    } else if (aVar.g >= 25) {
                        obj = 1;
                        k = DatabaseError.zzhL("maxretries");
                        arrayList3.addAll(this.zzbMa.zza(aVar.i, true, false, this.zzbLN));
                    } else {
                        Result doTransaction;
                        zzahu zza2 = zza(aVar.a, arrayList2);
                        aVar.j = zza2;
                        try {
                            doTransaction = aVar.b.doTransaction(com.google.firebase.database.zza.zza(zza2));
                            k = null;
                        } catch (Throwable th) {
                            DatabaseError fromException = DatabaseError.fromException(th);
                            doTransaction = Transaction.abort();
                            k = fromException;
                        }
                        if (doTransaction.isSuccess()) {
                            Long valueOf = Long.valueOf(aVar.i);
                            Map zza3 = zzaff.zza(this.zzbLN);
                            zzahu zzPj = doTransaction.zzPj();
                            zzahu zza4 = zzaff.zza(zzPj, zza3);
                            aVar.k = zzPj;
                            aVar.l = zza4;
                            aVar.i = zzRC();
                            arrayList2.remove(valueOf);
                            arrayList3.addAll(this.zzbMa.zza(aVar.a, zzPj, zza4, aVar.i, aVar.f, false));
                            arrayList3.addAll(this.zzbMa.zza(valueOf.longValue(), true, false, this.zzbLN));
                            k = null;
                            obj = null;
                        } else {
                            obj = 1;
                            arrayList3.addAll(this.zzbMa.zza(aVar.i, true, false, this.zzbLN));
                        }
                    }
                    zzS(arrayList3);
                    if (obj != null) {
                        aVar.d = b.COMPLETED;
                        final DataSnapshot zza5 = com.google.firebase.database.zza.zza(com.google.firebase.database.zza.zza(this, aVar.a), zzahp.zzm(aVar.j));
                        scheduleNow(new Runnable(this) {
                            final /* synthetic */ zzafc b;

                            public void run() {
                                this.b.zze(new zzafp(this.b, aVar.c, zzagu.zzN(aVar.a)));
                            }
                        });
                        arrayList.add(new Runnable(this) {
                            final /* synthetic */ zzafc d;

                            public void run() {
                                aVar.b.onComplete(k, false, zza5);
                            }
                        });
                    }
                } else {
                    throw new AssertionError();
                }
            }
            zzb(this.zzbLQ);
            for (int i = 0; i < arrayList.size(); i++) {
                postEvent((Runnable) arrayList.get(i));
            }
            zzRE();
        }
    }

    private List<a> zzc(zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a) {
        List arrayList = new ArrayList();
        zza(arrayList, (zzagk) com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a);
        Collections.sort(arrayList);
        return arrayList;
    }

    private zzahu zzn(zzafa com_google_android_gms_internal_zzafa) {
        return zza(com_google_android_gms_internal_zzafa, new ArrayList());
    }

    private zzafa zzo(zzafa com_google_android_gms_internal_zzafa) {
        zzagk zzp = zzp(com_google_android_gms_internal_zzafa);
        zzafa zzPn = zzp.zzPn();
        zzb(zzc(zzp), zzPn);
        return zzPn;
    }

    private zzagk<List<a>> zzp(zzafa com_google_android_gms_internal_zzafa) {
        zzagk<List<a>> com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a = this.zzbLQ;
        while (!com_google_android_gms_internal_zzafa.isEmpty() && com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.getValue() == null) {
            com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a = com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a.zzL(new zzafa(com_google_android_gms_internal_zzafa.zzRt()));
            com_google_android_gms_internal_zzafa = com_google_android_gms_internal_zzafa.zzRu();
        }
        return com_google_android_gms_internal_zzagk_java_util_List_com_google_android_gms_internal_zzafc_a;
    }

    public FirebaseDatabase getDatabase() {
        return this.zzbMb;
    }

    void interrupt() {
        this.zzbKx.interrupt("repo_interrupt");
    }

    public void onDisconnect() {
        zza(zzaet.zzbLo, Boolean.valueOf(false));
        zzRD();
    }

    public void postEvent(Runnable runnable) {
        this.zzbLT.zzQU();
        this.zzbLT.zzRb().postEvent(runnable);
    }

    public void purgeOutstandingWrites() {
        if (this.zzbLU.zzTe()) {
            this.zzbLU.zzh("Purging writes", new Object[0]);
        }
        zzS(this.zzbMa.zzRK());
        zzb(zzafa.zzRq(), -25);
        this.zzbKx.purgeOutstandingWrites();
    }

    void resume() {
        this.zzbKx.resume("repo_interrupt");
    }

    public void scheduleNow(Runnable runnable) {
        this.zzbLT.zzQU();
        this.zzbLT.zzRc().scheduleNow(runnable);
    }

    public String toString() {
        return this.zzbHm.toString();
    }

    public void zzQb() {
        zza(zzaet.zzbLo, Boolean.valueOf(true));
    }

    public long zzRA() {
        return this.zzbLN.zzUi();
    }

    boolean zzRB() {
        return (this.zzbLZ.isEmpty() && this.zzbMa.isEmpty()) ? false : true;
    }

    public zzafd zzRz() {
        return this.zzbHm;
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes, CompletionListener completionListener, Map<String, Object> map) {
        if (this.zzbLU.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbLU;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 8).append("update: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzbLW.zzTe()) {
            com_google_android_gms_internal_zzahf = this.zzbLW;
            valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            String valueOf2 = String.valueOf(map);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append("update: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        if (com_google_android_gms_internal_zzaes.isEmpty()) {
            if (this.zzbLU.zzTe()) {
                this.zzbLU.zzh("update called with no changes. No-op", new Object[0]);
            }
            zza(completionListener, null, com_google_android_gms_internal_zzafa);
            return;
        }
        zzaes zza = zzaff.zza(com_google_android_gms_internal_zzaes, zzaff.zza(this.zzbLN));
        final long zzRC = zzRC();
        zzS(this.zzbMa.zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzaes, zza, zzRC, true));
        final zzafa com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa;
        final CompletionListener completionListener2 = completionListener;
        this.zzbKx.zza(com_google_android_gms_internal_zzafa.zzRs(), (Map) map, new zzaem(this) {
            final /* synthetic */ zzafc d;

            public void zzaj(String str, String str2) {
                DatabaseError zzal = zzafc.zzak(str, str2);
                this.d.zza("updateChildren", com_google_android_gms_internal_zzafa2, zzal);
                this.d.zza(zzRC, com_google_android_gms_internal_zzafa2, zzal);
                this.d.zza(completionListener2, zzal, com_google_android_gms_internal_zzafa2);
            }
        });
        zzo(zzb(com_google_android_gms_internal_zzafa, -9));
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, CompletionListener completionListener) {
        if (this.zzbLU.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbLU;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 5).append("set: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzbLW.zzTe()) {
            com_google_android_gms_internal_zzahf = this.zzbLW;
            valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            String valueOf2 = String.valueOf(com_google_android_gms_internal_zzahu);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length()).append("set: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        zzahu zza = zzaff.zza(com_google_android_gms_internal_zzahu, zzaff.zza(this.zzbLN));
        final long zzRC = zzRC();
        zzS(this.zzbMa.zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu, zza, zzRC, true, true));
        final zzafa com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa;
        final CompletionListener completionListener2 = completionListener;
        this.zzbKx.zza(com_google_android_gms_internal_zzafa.zzRs(), com_google_android_gms_internal_zzahu.getValue(true), new zzaem(this) {
            final /* synthetic */ zzafc d;

            public void zzaj(String str, String str2) {
                DatabaseError zzal = zzafc.zzak(str, str2);
                this.d.zza("setValue", com_google_android_gms_internal_zzafa2, zzal);
                this.d.zza(zzRC, com_google_android_gms_internal_zzafa2, zzal);
                this.d.zza(completionListener2, zzal, com_google_android_gms_internal_zzafa2);
            }
        });
        zzo(zzb(com_google_android_gms_internal_zzafa, -9));
    }

    public void zza(final zzafa com_google_android_gms_internal_zzafa, final CompletionListener completionListener) {
        this.zzbKx.zza(com_google_android_gms_internal_zzafa.zzRs(), new zzaem(this) {
            final /* synthetic */ zzafc c;

            public void zzaj(String str, String str2) {
                DatabaseError zzal = zzafc.zzak(str, str2);
                if (zzal == null) {
                    this.c.zzbLP.a(com_google_android_gms_internal_zzafa);
                }
                this.c.zza(completionListener, zzal, com_google_android_gms_internal_zzafa);
            }
        });
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, final Handler handler, boolean z) {
        if (this.zzbLU.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbLU;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 13).append("transaction: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzbLW.zzTe()) {
            com_google_android_gms_internal_zzahf = this.zzbLU;
            valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 13).append("transaction: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzbLT.zzPW() && !this.zzbMc) {
            this.zzbMc = true;
            this.zzbLV.info("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        DatabaseReference zza = com.google.firebase.database.zza.zza(this, com_google_android_gms_internal_zzafa);
        ValueEventListener anonymousClass19 = new ValueEventListener(this) {
            final /* synthetic */ zzafc a;

            {
                this.a = r1;
            }

            public void onCancelled(DatabaseError databaseError) {
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
            }
        };
        zzf(new zzafp(this, anonymousClass19, zza.zzPo()));
        a aVar = new a(com_google_android_gms_internal_zzafa, handler, anonymousClass19, b.INITIALIZING, z, zzRF());
        zzahu zzn = zzn(com_google_android_gms_internal_zzafa);
        aVar.j = zzn;
        Result result;
        DatabaseError databaseError;
        try {
            Result doTransaction = handler.doTransaction(com.google.firebase.database.zza.zza(zzn));
            if (doTransaction == null) {
                throw new NullPointerException("Transaction returned null as result");
            }
            result = doTransaction;
            databaseError = null;
            if (result.isSuccess()) {
                aVar.d = b.RUN;
                zzagk zzL = this.zzbLQ.zzL(com_google_android_gms_internal_zzafa);
                List list = (List) zzL.getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(aVar);
                zzL.setValue(list);
                Map zza2 = zzaff.zza(this.zzbLN);
                zzahu zzPj = result.zzPj();
                zzahu zza3 = zzaff.zza(zzPj, zza2);
                aVar.k = zzPj;
                aVar.l = zza3;
                aVar.i = zzRC();
                zzS(this.zzbMa.zza(com_google_android_gms_internal_zzafa, zzPj, zza3, aVar.i, z, false));
                zzRE();
                return;
            }
            aVar.k = null;
            aVar.l = null;
            final DataSnapshot zza4 = com.google.firebase.database.zza.zza(zza, zzahp.zzm(aVar.j));
            postEvent(new Runnable(this) {
                final /* synthetic */ zzafc d;

                public void run() {
                    handler.onComplete(databaseError, false, zza4);
                }
            });
        } catch (Throwable th) {
            DatabaseError fromException = DatabaseError.fromException(th);
            databaseError = fromException;
            result = Transaction.abort();
        }
    }

    public void zza(final zzafa com_google_android_gms_internal_zzafa, final Map<zzafa, zzahu> map, final CompletionListener completionListener, Map<String, Object> map2) {
        this.zzbKx.zzb(com_google_android_gms_internal_zzafa.zzRs(), (Map) map2, new zzaem(this) {
            final /* synthetic */ zzafc d;

            public void zzaj(String str, String str2) {
                DatabaseError zzal = zzafc.zzak(str, str2);
                this.d.zza("onDisconnect().updateChildren", com_google_android_gms_internal_zzafa, zzal);
                if (zzal == null) {
                    for (Entry entry : map.entrySet()) {
                        this.d.zzbLP.a(com_google_android_gms_internal_zzafa.zzh((zzafa) entry.getKey()), (zzahu) entry.getValue());
                    }
                }
                this.d.zza(completionListener, zzal, com_google_android_gms_internal_zzafa);
            }
        });
    }

    public void zza(zzagu com_google_android_gms_internal_zzagu, boolean z) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzagu.zzPn().isEmpty() || !com_google_android_gms_internal_zzagu.zzPn().zzRt().equals(zzaet.zzbLl)) {
            this.zzbMa.zza(com_google_android_gms_internal_zzagu, z);
            return;
        }
        throw new AssertionError();
    }

    public void zza(zzahi com_google_android_gms_internal_zzahi, Object obj) {
        zzb(com_google_android_gms_internal_zzahi, obj);
    }

    void zza(final CompletionListener completionListener, final DatabaseError databaseError, zzafa com_google_android_gms_internal_zzafa) {
        if (completionListener != null) {
            zzahi zzRw = com_google_android_gms_internal_zzafa.zzRw();
            final DatabaseReference zza = (zzRw == null || !zzRw.zzTl()) ? com.google.firebase.database.zza.zza(this, com_google_android_gms_internal_zzafa) : com.google.firebase.database.zza.zza(this, com_google_android_gms_internal_zzafa.zzRv());
            postEvent(new Runnable(this) {
                final /* synthetic */ zzafc d;

                public void run() {
                    completionListener.onComplete(databaseError, zza);
                }
            });
        }
    }

    public void zza(List<String> list, Object obj, boolean z, Long l) {
        List zza;
        zzafa com_google_android_gms_internal_zzafa = new zzafa((List) list);
        if (this.zzbLU.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbLU;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 14).append("onDataUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzbLW.zzTe()) {
            com_google_android_gms_internal_zzahf = this.zzbLU;
            valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            String valueOf2 = String.valueOf(obj);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(valueOf2).length()).append("onDataUpdate: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        this.zzbLX++;
        if (l != null) {
            try {
                zzafk com_google_android_gms_internal_zzafk = new zzafk(l.longValue());
                if (z) {
                    Map hashMap = new HashMap();
                    for (Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new zzafa((String) entry.getKey()), zzahv.zzaq(entry.getValue()));
                    }
                    zza = this.zzbMa.zza(com_google_android_gms_internal_zzafa, hashMap, com_google_android_gms_internal_zzafk);
                } else {
                    zza = this.zzbMa.zza(com_google_android_gms_internal_zzafa, zzahv.zzaq(obj), com_google_android_gms_internal_zzafk);
                }
            } catch (Throwable e) {
                this.zzbLU.zze("FIREBASE INTERNAL ERROR", e);
                return;
            }
        } else if (z) {
            Map hashMap2 = new HashMap();
            for (Entry entry2 : ((Map) obj).entrySet()) {
                hashMap2.put(new zzafa((String) entry2.getKey()), zzahv.zzaq(entry2.getValue()));
            }
            zza = this.zzbMa.zza(com_google_android_gms_internal_zzafa, hashMap2);
        } else {
            zza = this.zzbMa.zzi(com_google_android_gms_internal_zzafa, zzahv.zzaq(obj));
        }
        if (zza.size() > 0) {
            zzo(com_google_android_gms_internal_zzafa);
        }
        zzS(zza);
    }

    public void zza(List<String> list, List<zzael> list2, Long l) {
        zzafa com_google_android_gms_internal_zzafa = new zzafa((List) list);
        if (this.zzbLU.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbLU;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 20).append("onRangeMergeUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzbLW.zzTe()) {
            com_google_android_gms_internal_zzahf = this.zzbLU;
            valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
            String valueOf2 = String.valueOf(list2);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append("onRangeMergeUpdate: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        this.zzbLX++;
        List arrayList = new ArrayList(list2.size());
        for (zzael com_google_android_gms_internal_zzahz : list2) {
            arrayList.add(new zzahz(com_google_android_gms_internal_zzahz));
        }
        List zza = l != null ? this.zzbMa.zza(com_google_android_gms_internal_zzafa, arrayList, new zzafk(l.longValue())) : this.zzbMa.zzb(com_google_android_gms_internal_zzafa, arrayList);
        if (zza.size() > 0) {
            zzo(com_google_android_gms_internal_zzafa);
        }
        zzS(zza);
    }

    public void zzaO(boolean z) {
        zza(zzaet.zzbLn, Boolean.valueOf(z));
    }

    public void zzat(Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            zzb(zzahi.zzig((String) entry.getKey()), entry.getValue());
        }
    }

    public void zzb(final zzafa com_google_android_gms_internal_zzafa, final zzahu com_google_android_gms_internal_zzahu, final CompletionListener completionListener) {
        this.zzbKx.zzb(com_google_android_gms_internal_zzafa.zzRs(), com_google_android_gms_internal_zzahu.getValue(true), new zzaem(this) {
            final /* synthetic */ zzafc d;

            public void zzaj(String str, String str2) {
                DatabaseError zzal = zzafc.zzak(str, str2);
                this.d.zza("onDisconnect().setValue", com_google_android_gms_internal_zzafa, zzal);
                if (zzal == null) {
                    this.d.zzbLP.a(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu);
                }
                this.d.zza(completionListener, zzal, com_google_android_gms_internal_zzafa);
            }
        });
    }

    public void zze(zzaew com_google_android_gms_internal_zzaew) {
        zzS(zzaet.zzbLl.equals(com_google_android_gms_internal_zzaew.zzQM().zzPn().zzRt()) ? this.zzbLZ.zzh(com_google_android_gms_internal_zzaew) : this.zzbMa.zzh(com_google_android_gms_internal_zzaew));
    }

    public void zzf(zzaew com_google_android_gms_internal_zzaew) {
        zzahi zzRt = com_google_android_gms_internal_zzaew.zzQM().zzPn().zzRt();
        List zzg = (zzRt == null || !zzRt.equals(zzaet.zzbLl)) ? this.zzbMa.zzg(com_google_android_gms_internal_zzaew) : this.zzbLZ.zzg(com_google_android_gms_internal_zzaew);
        zzS(zzg);
    }
}
