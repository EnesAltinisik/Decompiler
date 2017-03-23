package com.google.android.gms.b;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@vz
public class my {
    private final int a;
    private final int b;
    private final int c;
    private final mx d = new na();

    static class a {
        ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
        Base64OutputStream b = new Base64OutputStream(this.a, 10);

        public void a(byte[] bArr) {
            this.b.write(bArr);
        }

        public String toString() {
            String byteArrayOutputStream;
            try {
                this.b.close();
            } catch (Throwable e) {
                zy.b("HashManager: Unable to convert to Base64.", e);
            }
            try {
                this.a.close();
                byteArrayOutputStream = this.a.toString();
            } catch (Throwable e2) {
                zy.b("HashManager: Unable to convert to Base64.", e2);
                byteArrayOutputStream = "";
            } finally {
                this.a = null;
                this.b = null;
            }
            return byteArrayOutputStream;
        }
    }

    public my(int i) {
        this.b = i;
        this.a = 6;
        this.c = 0;
    }

    a a() {
        return new a();
    }

    String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        a a = a();
        PriorityQueue priorityQueue = new PriorityQueue(this.b, new Comparator<com.google.android.gms.b.nb.a>(this) {
            public int a(com.google.android.gms.b.nb.a aVar, com.google.android.gms.b.nb.a aVar2) {
                int i = aVar.c - aVar2.c;
                return i != 0 ? i : (int) (aVar.a - aVar2.a);
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((com.google.android.gms.b.nb.a) obj, (com.google.android.gms.b.nb.a) obj2);
            }
        });
        for (String b : split) {
            String[] b2 = mz.b(b);
            if (b2.length != 0) {
                nb.a(b2, this.b, this.a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                a.a(this.d.a(((com.google.android.gms.b.nb.a) it.next()).b));
            } catch (Throwable e) {
                zy.b("Error while writing hash to byteStream", e);
            }
        }
        return a.toString();
    }

    public String a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return a(stringBuffer.toString());
    }
}
