package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public interface t {

    public interface a {
        void a(int i, boolean z);

        void a(Bundle bundle);

        void a(com.google.android.gms.common.a aVar);
    }

    <A extends c, T extends com.google.android.gms.b.ace.a<? extends g, A>> T a(T t);

    void a();

    void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void b();

    boolean c();

    void d();
}
