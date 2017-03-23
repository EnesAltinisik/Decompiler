package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahj.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class zzahk {
    private final List<zzafa> zzbIH;
    private final List<String> zzbII;

    class AnonymousClass1 extends zza {
        final /* synthetic */ a a;

        AnonymousClass1(a aVar) {
            this.a = aVar;
        }

        public void zzb(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
            this.a.a(com_google_android_gms_internal_zzahi);
            zzahk.zza(com_google_android_gms_internal_zzahu, this.a);
            this.a.e();
        }
    }

    static class a {
        private StringBuilder a = null;
        private Stack<zzahi> b = new Stack();
        private int c = -1;
        private int d;
        private boolean e = true;
        private final List<zzafa> f = new ArrayList();
        private final List<String> g = new ArrayList();
        private final zzc h;

        public a(zzc com_google_android_gms_internal_zzahk_zzc) {
            this.h = com_google_android_gms_internal_zzahk_zzc;
        }

        private zzafa a(int i) {
            zzahi[] com_google_android_gms_internal_zzahiArr = new zzahi[i];
            for (int i2 = 0; i2 < i; i2++) {
                com_google_android_gms_internal_zzahiArr[i2] = (zzahi) this.b.get(i2);
            }
            return new zzafa(com_google_android_gms_internal_zzahiArr);
        }

        private void a(zzahi com_google_android_gms_internal_zzahi) {
            d();
            if (this.e) {
                this.a.append(",");
            }
            a(this.a, com_google_android_gms_internal_zzahi);
            this.a.append(":(");
            if (this.d == this.b.size()) {
                this.b.add(com_google_android_gms_internal_zzahi);
            } else {
                this.b.set(this.d, com_google_android_gms_internal_zzahi);
            }
            this.d++;
            this.e = false;
        }

        private void a(zzahr<?> com_google_android_gms_internal_zzahr_) {
            d();
            this.c = this.d;
            this.a.append(com_google_android_gms_internal_zzahr_.zza(zzahu.zza.V2));
            this.e = true;
            if (this.h.zze(this)) {
                g();
            }
        }

        private void a(StringBuilder stringBuilder, zzahi com_google_android_gms_internal_zzahi) {
            stringBuilder.append(zzaiv.zzin(com_google_android_gms_internal_zzahi.asString()));
        }

        private void d() {
            if (!a()) {
                this.a = new StringBuilder();
                this.a.append("(");
                Iterator it = a(this.d).iterator();
                while (it.hasNext()) {
                    a(this.a, (zzahi) it.next());
                    this.a.append(":(");
                }
                this.e = false;
            }
        }

        private void e() {
            this.d--;
            if (a()) {
                this.a.append(")");
            }
            this.e = true;
        }

        private void f() {
            zzaiv.zzb(this.d == 0, "Can't finish hashing in the middle processing a child");
            if (a()) {
                g();
            }
            this.g.add("");
        }

        private void g() {
            zzaiv.zzb(a(), "Can't end range without starting a range!");
            for (int i = 0; i < this.d; i++) {
                this.a.append(")");
            }
            this.a.append(")");
            zzafa a = a(this.c);
            this.g.add(zzaiv.zzim(this.a.toString()));
            this.f.add(a);
            this.a = null;
        }

        public boolean a() {
            return this.a != null;
        }

        public int b() {
            return this.a.length();
        }

        public zzafa c() {
            return a(this.d);
        }
    }

    public interface zzc {
        boolean zze(a aVar);
    }

    private static class b implements zzc {
        private final long a;

        public b(zzahu com_google_android_gms_internal_zzahu) {
            this.a = Math.max(512, (long) Math.sqrt((double) (zzaiq.zzs(com_google_android_gms_internal_zzahu) * 100)));
        }

        public boolean zze(a aVar) {
            return ((long) aVar.b()) > this.a && (aVar.c().isEmpty() || !aVar.c().zzRw().equals(zzahi.zzTj()));
        }
    }

    private zzahk(List<zzafa> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.zzbIH = list;
        this.zzbII = list2;
    }

    public static zzahk zza(zzahu com_google_android_gms_internal_zzahu, zzc com_google_android_gms_internal_zzahk_zzc) {
        if (com_google_android_gms_internal_zzahu.isEmpty()) {
            return new zzahk(Collections.emptyList(), Collections.singletonList(""));
        }
        a aVar = new a(com_google_android_gms_internal_zzahk_zzc);
        zza(com_google_android_gms_internal_zzahu, aVar);
        aVar.f();
        return new zzahk(aVar.f, aVar.g);
    }

    private static void zza(zzahu com_google_android_gms_internal_zzahu, a aVar) {
        if (com_google_android_gms_internal_zzahu.zzTo()) {
            aVar.a((zzahr) com_google_android_gms_internal_zzahu);
        } else if (com_google_android_gms_internal_zzahu.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        } else if (com_google_android_gms_internal_zzahu instanceof zzahj) {
            ((zzahj) com_google_android_gms_internal_zzahu).zza(new AnonymousClass1(aVar), true);
        } else {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzahu);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Expected children node, but got: ").append(valueOf).toString());
        }
    }

    public static zzahk zzh(zzahu com_google_android_gms_internal_zzahu) {
        return zza(com_google_android_gms_internal_zzahu, new b(com_google_android_gms_internal_zzahu));
    }

    public List<zzafa> zzPR() {
        return Collections.unmodifiableList(this.zzbIH);
    }

    public List<String> zzPS() {
        return Collections.unmodifiableList(this.zzbII);
    }
}
