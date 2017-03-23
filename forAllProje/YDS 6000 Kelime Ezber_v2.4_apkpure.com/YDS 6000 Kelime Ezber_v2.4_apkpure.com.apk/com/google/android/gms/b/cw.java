package com.google.android.gms.b;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.b.ck.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.m;
import com.google.android.gms.common.n;
import com.google.android.gms.common.util.o;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class cw extends a {
    private final cv a;
    private Boolean b;
    private String c;

    public cw(cv cvVar) {
        this(cvVar, null);
    }

    public cw(cv cvVar, String str) {
        c.a((Object) cvVar);
        this.a = cvVar;
        this.c = str;
    }

    private void b(bv bvVar, boolean z) {
        c.a((Object) bvVar);
        b(bvVar.b, z);
        this.a.o().f(bvVar.c);
    }

    private void b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.a.f().x().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        try {
            a(str, z);
        } catch (SecurityException e) {
            this.a.f().x().a("Measurement Service called with invalid calling package. appId", co.a(str));
            throw e;
        }
    }

    public List<di> a(final bv bvVar, boolean z) {
        Object e;
        b(bvVar, false);
        try {
            List<dk> list = (List) this.a.h().a(new Callable<List<dk>>(this) {
                final /* synthetic */ cw b;

                public List<dk> a() {
                    this.b.a.N();
                    return this.b.a.p().a(bvVar.b);
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            }).get();
            List<di> arrayList = new ArrayList(list.size());
            for (dk dkVar : list) {
                if (z || !dl.j(dkVar.b)) {
                    arrayList.add(new di(dkVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.a.f().x().a("Failed to get user attributes. appId", co.a(bvVar.b), e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.a.f().x().a("Failed to get user attributes. appId", co.a(bvVar.b), e);
            return null;
        }
    }

    public void a(long j, String str, String str2, String str3) {
        final String str4 = str2;
        final String str5 = str3;
        final String str6 = str;
        final long j2 = j;
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ cw e;

            public void run() {
                if (str4 == null) {
                    this.e.a.u().a(str5, null);
                    return;
                }
                f fVar = new f();
                fVar.b = str6;
                fVar.c = str4;
                fVar.d = j2;
                this.e.a.u().a(str5, fVar);
            }
        });
    }

    public void a(final bv bvVar) {
        b(bvVar, false);
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ cw b;

            public void run() {
                this.b.a.N();
                this.b.a.b(bvVar);
            }
        });
    }

    public void a(final ch chVar, final bv bvVar) {
        c.a((Object) chVar);
        b(bvVar, false);
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ cw c;

            public void run() {
                this.c.a.N();
                this.c.a.a(chVar, bvVar);
            }
        });
    }

    public void a(final ch chVar, final String str, String str2) {
        c.a((Object) chVar);
        c.a(str);
        b(str, true);
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ cw c;

            public void run() {
                this.c.a.N();
                this.c.a.a(chVar, str);
            }
        });
    }

    public void a(final di diVar, final bv bvVar) {
        c.a((Object) diVar);
        b(bvVar, false);
        if (diVar.a() == null) {
            this.a.h().a(new Runnable(this) {
                final /* synthetic */ cw c;

                public void run() {
                    this.c.a.N();
                    this.c.a.b(diVar, bvVar);
                }
            });
        } else {
            this.a.h().a(new Runnable(this) {
                final /* synthetic */ cw c;

                public void run() {
                    this.c.a.N();
                    this.c.a.a(diVar, bvVar);
                }
            });
        }
    }

    protected void a(String str, boolean z) {
        if (z) {
            if (this.b == null) {
                boolean z2 = "com.google.android.gms".equals(this.c) || o.a(this.a.s(), Binder.getCallingUid()) || n.a(this.a.s()).a(this.a.s().getPackageManager(), Binder.getCallingUid());
                this.b = Boolean.valueOf(z2);
            }
            if (this.b.booleanValue()) {
                return;
            }
        }
        if (this.c == null && m.a(this.a.s(), Binder.getCallingUid(), str)) {
            this.c = str;
        }
        if (!str.equals(this.c)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
        }
    }

    public byte[] a(final ch chVar, final String str) {
        Object e;
        c.a(str);
        c.a((Object) chVar);
        b(str, true);
        this.a.f().C().a("Log and bundle. event", chVar.b);
        long c = this.a.t().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.h().b(new Callable<byte[]>(this) {
                final /* synthetic */ cw c;

                public byte[] a() {
                    this.c.a.N();
                    return this.c.a.b(chVar, str);
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            }).get();
            if (bArr == null) {
                this.a.f().x().a("Log and bundle returned null. appId", co.a(str));
                bArr = new byte[0];
            }
            this.a.f().C().a("Log and bundle processed. event, size, time_ms", chVar.b, Integer.valueOf(bArr.length), Long.valueOf((this.a.t().c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            this.a.f().x().a("Failed to log and bundle. appId, event, error", co.a(str), chVar.b, e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.a.f().x().a("Failed to log and bundle. appId, event, error", co.a(str), chVar.b, e);
            return null;
        }
    }

    public void b(final bv bvVar) {
        b(bvVar, false);
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ cw b;

            public void run() {
                this.b.a.N();
                this.b.a.a(bvVar);
            }
        });
    }

    public String c(bv bvVar) {
        b(bvVar, false);
        return this.a.a(bvVar.b);
    }
}
