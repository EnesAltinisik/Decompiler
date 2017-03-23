package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcl.zza;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@zzig
public class zzci {
    private final int zzuB;
    private final int zzuC;
    private final int zzuD;
    private final zzch zzuE = new zzck();

    static class a {
        ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
        Base64OutputStream b = new Base64OutputStream(this.a, 10);

        public void a(byte[] bArr) throws IOException {
            this.b.write(bArr);
        }

        public String toString() {
            String byteArrayOutputStream;
            try {
                this.b.close();
            } catch (Throwable e) {
                zzb.zzb("HashManager: Unable to convert to Base64.", e);
            }
            try {
                this.a.close();
                byteArrayOutputStream = this.a.toString();
            } catch (Throwable e2) {
                zzb.zzb("HashManager: Unable to convert to Base64.", e2);
                byteArrayOutputStream = "";
            } finally {
                this.a = null;
                this.b = null;
            }
            return byteArrayOutputStream;
        }
    }

    public zzci(int i) {
        this.zzuC = i;
        this.zzuB = 6;
        this.zzuD = 0;
    }

    String zzB(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        a zzdz = zzdz();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzuC, new Comparator<zza>(this) {
            final /* synthetic */ zzci a;

            {
                this.a = r1;
            }

            public int a(zza com_google_android_gms_internal_zzcl_zza, zza com_google_android_gms_internal_zzcl_zza2) {
                int i = com_google_android_gms_internal_zzcl_zza.zzuK - com_google_android_gms_internal_zzcl_zza2.zzuK;
                return i != 0 ? i : (int) (com_google_android_gms_internal_zzcl_zza.value - com_google_android_gms_internal_zzcl_zza2.value);
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((zza) obj, (zza) obj2);
            }
        });
        for (String zzD : split) {
            String[] zzD2 = zzcj.zzD(zzD);
            if (zzD2.length != 0) {
                zzcl.zza(zzD2, this.zzuC, this.zzuB, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzdz.a(this.zzuE.zzA(((zza) it.next()).zzuJ));
            } catch (Throwable e) {
                zzb.zzb("Error while writing hash to byteStream", e);
            }
        }
        return zzdz.toString();
    }

    public String zza(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return zzB(stringBuffer.toString());
    }

    a zzdz() {
        return new a();
    }
}
