package android.support.v4.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.i.k;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class p<E> extends n {
    private final Activity a;
    final Context b;
    final int c;
    final r d;
    private final Handler e;
    private k<String, aa> f;
    private boolean g;
    private ab h;
    private boolean i;
    private boolean j;

    p(Activity activity, Context context, Handler handler, int i) {
        this.d = new r();
        this.a = activity;
        this.b = context;
        this.e = handler;
        this.c = i;
    }

    p(m mVar) {
        this(mVar, mVar, mVar.c, 0);
    }

    ab a(String str, boolean z, boolean z2) {
        if (this.f == null) {
            this.f = new k();
        }
        ab abVar = (ab) this.f.get(str);
        if (abVar != null) {
            abVar.a(this);
            return abVar;
        } else if (!z2) {
            return abVar;
        } else {
            abVar = new ab(str, this, z);
            this.f.put(str, abVar);
            return abVar;
        }
    }

    public View a(int i) {
        return null;
    }

    public void a(l lVar, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.b.startActivity(intent);
    }

    void a(k<String, aa> kVar) {
        this.f = kVar;
    }

    void a(String str) {
        if (this.f != null) {
            ab abVar = (ab) this.f.get(str);
            if (abVar != null && !abVar.f) {
                abVar.h();
                this.f.remove(str);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    void a(boolean z) {
        this.g = z;
        if (this.h != null && this.j) {
            this.j = false;
            if (z) {
                this.h.d();
            } else {
                this.h.c();
            }
        }
    }

    public boolean a() {
        return true;
    }

    public boolean a(l lVar) {
        return true;
    }

    public LayoutInflater b() {
        return (LayoutInflater) this.b.getSystemService("layout_inflater");
    }

    void b(l lVar) {
    }

    void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.j);
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
            printWriter.println(":");
            this.h.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void c() {
    }

    public boolean d() {
        return true;
    }

    public int e() {
        return this.c;
    }

    Activity f() {
        return this.a;
    }

    Context g() {
        return this.b;
    }

    Handler h() {
        return this.e;
    }

    r i() {
        return this.d;
    }

    boolean j() {
        return this.g;
    }

    void k() {
        if (!this.j) {
            this.j = true;
            if (this.h != null) {
                this.h.b();
            } else if (!this.i) {
                this.h = a("(root)", this.j, false);
                if (!(this.h == null || this.h.e)) {
                    this.h.b();
                }
            }
            this.i = true;
        }
    }

    void l() {
        if (this.h != null) {
            this.h.h();
        }
    }

    void m() {
        if (this.f != null) {
            int size = this.f.size();
            ab[] abVarArr = new ab[size];
            for (int i = size - 1; i >= 0; i--) {
                abVarArr[i] = (ab) this.f.c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                ab abVar = abVarArr[i2];
                abVar.e();
                abVar.g();
            }
        }
    }

    k<String, aa> n() {
        int i;
        int i2 = 0;
        if (this.f != null) {
            int size = this.f.size();
            ab[] abVarArr = new ab[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                abVarArr[i3] = (ab) this.f.c(i3);
            }
            boolean j = j();
            i = 0;
            while (i2 < size) {
                ab abVar = abVarArr[i2];
                if (!abVar.f && j) {
                    if (!abVar.e) {
                        abVar.b();
                    }
                    abVar.d();
                }
                if (abVar.f) {
                    i = 1;
                } else {
                    abVar.h();
                    this.f.remove(abVar.d);
                }
                i2++;
            }
        } else {
            i = 0;
        }
        return i != 0 ? this.f : null;
    }
}
