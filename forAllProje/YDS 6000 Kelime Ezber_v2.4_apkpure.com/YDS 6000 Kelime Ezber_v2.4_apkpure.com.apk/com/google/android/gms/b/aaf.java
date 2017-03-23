package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@vz
public class aaf {

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ aad a;
        final /* synthetic */ a b;
        final /* synthetic */ aag c;

        AnonymousClass1(aad com_google_android_gms_b_aad, a aVar, aag com_google_android_gms_b_aag) {
            this.a = com_google_android_gms_b_aad;
            this.b = aVar;
            this.c = com_google_android_gms_b_aag;
        }

        public void run() {
            try {
                this.a.b(this.b.a(this.c.get()));
                return;
            } catch (CancellationException e) {
            } catch (InterruptedException e2) {
            } catch (ExecutionException e3) {
            }
            this.a.cancel(true);
        }
    }

    class AnonymousClass2 implements Runnable {
        final /* synthetic */ AtomicInteger a;
        final /* synthetic */ int b;
        final /* synthetic */ aad c;
        final /* synthetic */ List d;

        AnonymousClass2(AtomicInteger atomicInteger, int i, aad com_google_android_gms_b_aad, List list) {
            this.a = atomicInteger;
            this.b = i;
            this.c = com_google_android_gms_b_aad;
            this.d = list;
        }

        public void run() {
            Throwable e;
            if (this.a.incrementAndGet() >= this.b) {
                try {
                    this.c.b(aaf.c(this.d));
                    return;
                } catch (ExecutionException e2) {
                    e = e2;
                } catch (InterruptedException e3) {
                    e = e3;
                }
            } else {
                return;
            }
            zy.c("Unable to convert list of futures to a future of list", e);
        }
    }

    public interface a<D, R> {
        R a(D d);
    }

    public static <A, B> aag<B> a(aag<A> com_google_android_gms_b_aag_A, a<A, B> aVar) {
        aag com_google_android_gms_b_aad = new aad();
        com_google_android_gms_b_aag_A.a(new AnonymousClass1(com_google_android_gms_b_aad, aVar, com_google_android_gms_b_aag_A));
        return com_google_android_gms_b_aad;
    }

    public static <V> aag<List<V>> a(List<aag<V>> list) {
        aag com_google_android_gms_b_aad = new aad();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (aag a : list) {
            a.a(new AnonymousClass2(atomicInteger, size, com_google_android_gms_b_aad, list));
        }
        return com_google_android_gms_b_aad;
    }

    private static <V> List<V> c(List<aag<V>> list) {
        List<V> arrayList = new ArrayList();
        for (aag com_google_android_gms_b_aag : list) {
            Object obj = com_google_android_gms_b_aag.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
