package com.google.android.gms.b;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.c.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class acc extends acf {
    private final SparseArray<a> e = new SparseArray();

    private class a implements c {
        public final int a;
        public final com.google.android.gms.common.api.c b;
        public final c c;
        final /* synthetic */ acc d;

        public a(acc com_google_android_gms_b_acc, int i, com.google.android.gms.common.api.c cVar, c cVar2) {
            this.d = com_google_android_gms_b_acc;
            this.a = i;
            this.b = cVar;
            this.c = cVar2;
            cVar.a((c) this);
        }

        public void a() {
            this.b.b((c) this);
            this.b.c();
        }

        public void a(com.google.android.gms.common.a aVar) {
            String valueOf = String.valueOf(aVar);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf).toString());
            this.d.b(aVar, this.a);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.append(str).append("GoogleApiClient #").print(this.a);
            printWriter.println(":");
            this.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    private acc(w wVar) {
        super(wVar);
        this.a.a("AutoManageHelper", (v) this);
    }

    public static acc b(u uVar) {
        w a = v.a(uVar);
        acc com_google_android_gms_b_acc = (acc) a.a("AutoManageHelper", acc.class);
        return com_google_android_gms_b_acc != null ? com_google_android_gms_b_acc : new acc(a);
    }

    public void a() {
        super.a();
        boolean z = this.b;
        String valueOf = String.valueOf(this.e);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf).toString());
        if (!this.c) {
            for (int i = 0; i < this.e.size(); i++) {
                ((a) this.e.valueAt(i)).b.b();
            }
        }
    }

    public void a(int i) {
        a aVar = (a) this.e.get(i);
        this.e.remove(i);
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(int i, com.google.android.gms.common.api.c cVar, c cVar2) {
        com.google.android.gms.common.internal.c.a((Object) cVar, (Object) "GoogleApiClient instance cannot be null");
        com.google.android.gms.common.internal.c.a(this.e.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        Log.d("AutoManageHelper", "starting AutoManage for client " + i + " " + this.b + " " + this.c);
        this.e.put(i, new a(this, i, cVar, cVar2));
        if (this.b && !this.c) {
            String valueOf = String.valueOf(cVar);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 11).append("connecting ").append(valueOf).toString());
            cVar.b();
        }
    }

    protected void a(com.google.android.gms.common.a aVar, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar2 = (a) this.e.get(i);
        if (aVar2 != null) {
            a(i);
            c cVar = aVar2.c;
            if (cVar != null) {
                cVar.a(aVar);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.e.size(); i++) {
            ((a) this.e.valueAt(i)).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void b() {
        super.b();
        for (int i = 0; i < this.e.size(); i++) {
            ((a) this.e.valueAt(i)).b.c();
        }
    }

    protected void c() {
        for (int i = 0; i < this.e.size(); i++) {
            ((a) this.e.valueAt(i)).b.b();
        }
    }
}
