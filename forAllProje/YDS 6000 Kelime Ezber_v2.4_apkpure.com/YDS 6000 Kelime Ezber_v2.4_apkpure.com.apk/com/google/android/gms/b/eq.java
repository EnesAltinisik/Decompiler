package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.b.aw.d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.e;
import com.google.android.gms.common.k;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class eq {
    protected static final Object c = new Object();
    protected static final Object e = new Object();
    private static final String h = eq.class.getSimpleName();
    private static k u = null;
    protected Context a;
    protected Context b;
    protected boolean d = false;
    protected boolean f = false;
    protected boolean g = false;
    private ExecutorService i;
    private DexClassLoader j;
    private dt k;
    private byte[] l;
    private volatile a m = null;
    private volatile boolean n = false;
    private Future o = null;
    private volatile aw.a p = null;
    private Future q = null;
    private volatile boolean r = false;
    private bc s;
    private c t = null;
    private Map<Pair<String, String>, lx> v;

    private eq(Context context) {
        this.a = context;
        this.b = context.getApplicationContext();
        this.v = new HashMap();
    }

    public static eq a(Context context, String str, String str2, boolean z) {
        eq eqVar = new eq(context);
        try {
            eqVar.a(str, str2, z);
            return eqVar;
        } catch (em e) {
            return null;
        }
    }

    private File a(String str, File file, String str2) {
        File file2 = new File(String.format("%s/%s.jar", new Object[]{file, str2}));
        if (!file2.exists()) {
            byte[] a = this.k.a(this.l, str);
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(a, 0, a.length);
            fileOutputStream.close();
        }
        return file2;
    }

    private void a(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(h, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    private void a(File file, String str) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
            if (file3.exists()) {
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[((int) length)];
                    FileInputStream fileInputStream2;
                    try {
                        fileInputStream2 = new FileInputStream(file3);
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e) {
                                }
                                a(file3);
                                return;
                            }
                            ln dVar = new d();
                            dVar.d = VERSION.SDK.getBytes();
                            dVar.c = str.getBytes();
                            bArr = this.k.a(this.l, bArr).getBytes();
                            dVar.a = bArr;
                            dVar.b = ba.a(bArr);
                            file2.createNewFile();
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] a = ln.a(dVar);
                                fileOutputStream.write(a, 0, a.length);
                                fileOutputStream.close();
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e2) {
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                }
                                a(file3);
                            } catch (IOException e4) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                a(file3);
                            } catch (NoSuchAlgorithmException e7) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                a(file3);
                            } catch (dt.a e8) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                a(file3);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                fileOutputStream2 = fileOutputStream;
                                th = th3;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e9) {
                                    }
                                }
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e10) {
                                    }
                                }
                                a(file3);
                                throw th;
                            }
                        } catch (IOException e11) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            a(file3);
                        } catch (NoSuchAlgorithmException e12) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            a(file3);
                        } catch (dt.a e13) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            a(file3);
                        } catch (Throwable th4) {
                            th = th4;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            a(file3);
                            throw th;
                        }
                    } catch (IOException e14) {
                        fileOutputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        a(file3);
                    } catch (NoSuchAlgorithmException e15) {
                        fileOutputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        a(file3);
                    } catch (dt.a e16) {
                        fileOutputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        a(file3);
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        a(file3);
                        throw th;
                    }
                }
            }
        }
    }

    private void a(String str) {
        this.k = new dt(null);
        try {
            this.l = this.k.a(str);
        } catch (Throwable e) {
            throw new em(e);
        }
    }

    private void a(boolean z) {
        this.n = z;
        if (z) {
            this.o = this.i.submit(new Runnable(this) {
                final /* synthetic */ eq a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.s();
                }
            });
        }
    }

    private boolean a(String str, String str2, boolean z) {
        this.i = Executors.newCachedThreadPool();
        a(z);
        v();
        t();
        if (es.b() && ((Boolean) pr.bL.c()).booleanValue()) {
            throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
        }
        a(str);
        b(str2);
        this.s = new bc(this);
        return true;
    }

    private boolean b(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
        if (file3.exists()) {
            return false;
        }
        try {
            long length = file2.length();
            if (length <= 0) {
                a(file2);
                return false;
            }
            byte[] bArr = new byte[((int) length)];
            fileInputStream = new FileInputStream(file2);
            try {
                if (fileInputStream.read(bArr) <= 0) {
                    Log.d(h, "Cannot read the cache data.");
                    a(file2);
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                    }
                    return false;
                }
                d a = d.a(bArr);
                if (str.equals(new String(a.c)) && Arrays.equals(a.b, ba.a(a.a)) && Arrays.equals(a.d, VERSION.SDK.getBytes())) {
                    bArr = this.k.a(this.l, new String(a.a));
                    file3.createNewFile();
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    try {
                        fileOutputStream3.write(bArr, 0, bArr.length);
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                        }
                        try {
                            fileOutputStream3.close();
                            return true;
                        } catch (IOException e3) {
                            return true;
                        }
                    } catch (IOException e4) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        return false;
                    } catch (NoSuchAlgorithmException e7) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (dt.a e8) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e10) {
                            }
                        }
                        throw th;
                    }
                }
                a(file2);
                try {
                    fileInputStream.close();
                } catch (IOException e11) {
                }
                return false;
            } catch (IOException e12) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (NoSuchAlgorithmException e13) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (dt.a e14) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (IOException e15) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (NoSuchAlgorithmException e16) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (dt.a e17) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    private boolean b(String str) {
        File file;
        String b;
        File a;
        try {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                cacheDir = this.a.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new em();
                }
            }
            file = cacheDir;
            b = ei.b();
            a = a(str, file, b);
            b(file, b);
            this.j = new DexClassLoader(a.getAbsolutePath(), file.getAbsolutePath(), null, this.a.getClassLoader());
            a(a);
            a(file, b);
            c(String.format("%s/%s.dex", new Object[]{file, b}));
            return true;
        } catch (Throwable e) {
            throw new em(e);
        } catch (Throwable e2) {
            throw new em(e2);
        } catch (Throwable e22) {
            throw new em(e22);
        } catch (Throwable e222) {
            throw new em(e222);
        } catch (Throwable th) {
            a(a);
            a(file, b);
            c(String.format("%s/%s.dex", new Object[]{file, b}));
        }
    }

    private void c(String str) {
        a(new File(str));
    }

    private void s() {
        try {
            if (this.m == null && this.b != null) {
                a aVar = new a(this.b);
                aVar.a();
                this.m = aVar;
            }
        } catch (com.google.android.gms.common.d e) {
            this.m = null;
        } catch (IOException e2) {
            this.m = null;
        } catch (e e3) {
            this.m = null;
        }
    }

    private void t() {
        if (((Boolean) pr.bN.c()).booleanValue()) {
            n();
        }
    }

    private void u() {
        if (this.f) {
            try {
                this.p = bj.a(this.a, this.a.getPackageName(), Integer.toString(this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode));
            } catch (NameNotFoundException e) {
            }
        }
    }

    private void v() {
        boolean z = true;
        this.i.execute(new Runnable(this) {
            final /* synthetic */ eq a;

            {
                this.a = r1;
            }

            public void run() {
                pr.a(this.a.a);
            }
        });
        u = k.b();
        this.d = u.b(this.a) > 0;
        if (u.a(this.a) != 0) {
            z = false;
        }
        this.f = z;
        if (this.a.getApplicationContext() != null) {
            this.t = new c.a(this.a).a(abo.c).b();
        }
    }

    public Context a() {
        return this.a;
    }

    public Method a(String str, String str2) {
        lx lxVar = (lx) this.v.get(new Pair(str, str2));
        return lxVar == null ? null : lxVar.a();
    }

    public boolean a(String str, String str2, List<Class> list) {
        if (this.v.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.v.put(new Pair(str, str2), new lx(this, str, str2, list));
        return true;
    }

    public Context b() {
        return this.b;
    }

    public ExecutorService c() {
        return this.i;
    }

    public DexClassLoader d() {
        return this.j;
    }

    public dt e() {
        return this.k;
    }

    public byte[] f() {
        return this.l;
    }

    public c g() {
        return this.t;
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return this.g;
    }

    public bc j() {
        return this.s;
    }

    public boolean k() {
        return this.f;
    }

    public aw.a l() {
        return this.p;
    }

    public Future m() {
        return this.q;
    }

    public void n() {
        synchronized (c) {
            if (!this.r) {
                this.q = this.i.submit(new Runnable(this) {
                    final /* synthetic */ eq a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.u();
                        synchronized (eq.c) {
                            this.a.r = false;
                        }
                    }
                });
                this.r = true;
            }
        }
    }

    public a o() {
        if (!this.n) {
            return null;
        }
        if (this.m != null) {
            return this.m;
        }
        if (this.o != null) {
            try {
                this.o.get(2000, TimeUnit.MILLISECONDS);
                this.o = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.o.cancel(true);
            }
        }
        return this.m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p() {
        /*
        r2 = this;
        r1 = e;
        monitor-enter(r1);
        r0 = r2.g;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.f;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x001e;
    L_0x000d:
        r0 = r2.t;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x001e;
    L_0x0011:
        r0 = r2.t;	 Catch:{ all -> 0x001b }
        r0.b();	 Catch:{ all -> 0x001b }
        r0 = 1;
        r2.g = r0;	 Catch:{ all -> 0x001b }
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0008;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
    L_0x001e:
        r0 = 0;
        r2.g = r0;	 Catch:{ all -> 0x001b }
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.eq.p():void");
    }

    public void q() {
        synchronized (e) {
            if (this.g && this.t != null) {
                this.t.c();
                this.g = false;
            }
        }
    }

    public int r() {
        bc j = j();
        return j != null ? j.a() : Integer.MIN_VALUE;
    }
}
