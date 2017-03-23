package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@zzig
public class zzkq {

    public interface zza<D, R> {
        R zzg(D d);
    }

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ zzko a;
        final /* synthetic */ zza b;
        final /* synthetic */ zzkr c;

        AnonymousClass1(zzko com_google_android_gms_internal_zzko, zza com_google_android_gms_internal_zzkq_zza, zzkr com_google_android_gms_internal_zzkr) {
            this.a = com_google_android_gms_internal_zzko;
            this.b = com_google_android_gms_internal_zzkq_zza;
            this.c = com_google_android_gms_internal_zzkr;
        }

        public void run() {
            try {
                this.a.zzh(this.b.zzg(this.c.get()));
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
        final /* synthetic */ zzko c;
        final /* synthetic */ List d;

        AnonymousClass2(AtomicInteger atomicInteger, int i, zzko com_google_android_gms_internal_zzko, List list) {
            this.a = atomicInteger;
            this.b = i;
            this.c = com_google_android_gms_internal_zzko;
            this.d = list;
        }

        public void run() {
            Throwable e;
            if (this.a.incrementAndGet() >= this.b) {
                try {
                    this.c.zzh(zzkq.zzo(this.d));
                    return;
                } catch (ExecutionException e2) {
                    e = e2;
                } catch (InterruptedException e3) {
                    e = e3;
                }
            } else {
                return;
            }
            zzb.zzd("Unable to convert list of futures to a future of list", e);
        }
    }

    public static <A, B> zzkr<B> zza(zzkr<A> com_google_android_gms_internal_zzkr_A, zza<A, B> com_google_android_gms_internal_zzkq_zza_A__B) {
        zzkr com_google_android_gms_internal_zzko = new zzko();
        com_google_android_gms_internal_zzkr_A.zzb(new AnonymousClass1(com_google_android_gms_internal_zzko, com_google_android_gms_internal_zzkq_zza_A__B, com_google_android_gms_internal_zzkr_A));
        return com_google_android_gms_internal_zzko;
    }

    public static <V> zzkr<List<V>> zzn(List<zzkr<V>> list) {
        zzkr com_google_android_gms_internal_zzko = new zzko();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzkr zzb : list) {
            zzb.zzb(new AnonymousClass2(atomicInteger, size, com_google_android_gms_internal_zzko, list));
        }
        return com_google_android_gms_internal_zzko;
    }

    private static <V> List<V> zzo(List<zzkr<V>> list) throws ExecutionException, InterruptedException {
        List<V> arrayList = new ArrayList();
        for (zzkr com_google_android_gms_internal_zzkr : list) {
            Object obj = com_google_android_gms_internal_zzkr.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
