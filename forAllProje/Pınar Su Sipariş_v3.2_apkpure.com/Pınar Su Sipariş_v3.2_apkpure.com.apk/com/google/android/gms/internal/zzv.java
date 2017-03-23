package com.google.android.gms.internal;

import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.zzb.zza;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class zzv implements zzb {
    private final Map<String, a> zzaw;
    private long zzax;
    private final File zzay;
    private final int zzaz;

    static class a {
        public long a;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public long g;
        public Map<String, String> h;

        private a() {
        }

        public a(String str, zza com_google_android_gms_internal_zzb_zza) {
            this.b = str;
            this.a = (long) com_google_android_gms_internal_zzb_zza.data.length;
            this.c = com_google_android_gms_internal_zzb_zza.zza;
            this.d = com_google_android_gms_internal_zzb_zza.zzb;
            this.e = com_google_android_gms_internal_zzb_zza.zzc;
            this.f = com_google_android_gms_internal_zzb_zza.zzd;
            this.g = com_google_android_gms_internal_zzb_zza.zze;
            this.h = com_google_android_gms_internal_zzb_zza.zzf;
        }

        public static a a(InputStream inputStream) throws IOException {
            a aVar = new a();
            if (zzv.zzb(inputStream) != 538247942) {
                throw new IOException();
            }
            aVar.b = zzv.zzd(inputStream);
            aVar.c = zzv.zzd(inputStream);
            if (aVar.c.equals("")) {
                aVar.c = null;
            }
            aVar.d = zzv.zzc(inputStream);
            aVar.e = zzv.zzc(inputStream);
            aVar.f = zzv.zzc(inputStream);
            aVar.g = zzv.zzc(inputStream);
            aVar.h = zzv.zze(inputStream);
            return aVar;
        }

        public zza a(byte[] bArr) {
            zza com_google_android_gms_internal_zzb_zza = new zza();
            com_google_android_gms_internal_zzb_zza.data = bArr;
            com_google_android_gms_internal_zzb_zza.zza = this.c;
            com_google_android_gms_internal_zzb_zza.zzb = this.d;
            com_google_android_gms_internal_zzb_zza.zzc = this.e;
            com_google_android_gms_internal_zzb_zza.zzd = this.f;
            com_google_android_gms_internal_zzb_zza.zze = this.g;
            com_google_android_gms_internal_zzb_zza.zzf = this.h;
            return com_google_android_gms_internal_zzb_zza;
        }

        public boolean a(OutputStream outputStream) {
            try {
                zzv.zza(outputStream, 538247942);
                zzv.zza(outputStream, this.b);
                zzv.zza(outputStream, this.c == null ? "" : this.c);
                zzv.zza(outputStream, this.d);
                zzv.zza(outputStream, this.e);
                zzv.zza(outputStream, this.f);
                zzv.zza(outputStream, this.g);
                zzv.zza(this.h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                zzs.zzb("%s", e.toString());
                return false;
            }
        }
    }

    private static class b extends FilterInputStream {
        private int a;

        private b(InputStream inputStream) {
            super(inputStream);
            this.a = 0;
        }

        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.a++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.a += read;
            }
            return read;
        }
    }

    public zzv(File file) {
        this(file, 5242880);
    }

    public zzv(File file, int i) {
        this.zzaw = new LinkedHashMap(16, 0.75f, true);
        this.zzax = 0;
        this.zzay = file;
        this.zzaz = i;
    }

    private void removeEntry(String str) {
        a aVar = (a) this.zzaw.get(str);
        if (aVar != null) {
            this.zzax -= aVar.a;
            this.zzaw.remove(str);
        }
    }

    private static int zza(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void zza(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zza(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void zza(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Constants.ENCODING);
        zza(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private void zza(String str, a aVar) {
        if (this.zzaw.containsKey(str)) {
            a aVar2 = (a) this.zzaw.get(str);
            this.zzax = (aVar.a - aVar2.a) + this.zzax;
        } else {
            this.zzax += aVar.a;
        }
        this.zzaw.put(str, aVar);
    }

    static void zza(Map<String, String> map, OutputStream outputStream) throws IOException {
        if (map != null) {
            zza(outputStream, map.size());
            for (Entry entry : map.entrySet()) {
                zza(outputStream, (String) entry.getKey());
                zza(outputStream, (String) entry.getValue());
            }
            return;
        }
        zza(outputStream, 0);
    }

    private static byte[] zza(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    static int zzb(InputStream inputStream) throws IOException {
        return ((((zza(inputStream) << 0) | 0) | (zza(inputStream) << 8)) | (zza(inputStream) << 16)) | (zza(inputStream) << 24);
    }

    static long zzc(InputStream inputStream) throws IOException {
        return (((((((0 | ((((long) zza(inputStream)) & 255) << null)) | ((((long) zza(inputStream)) & 255) << 8)) | ((((long) zza(inputStream)) & 255) << 16)) | ((((long) zza(inputStream)) & 255) << 24)) | ((((long) zza(inputStream)) & 255) << 32)) | ((((long) zza(inputStream)) & 255) << 40)) | ((((long) zza(inputStream)) & 255) << 48)) | ((((long) zza(inputStream)) & 255) << 56);
    }

    private void zzc(int i) {
        if (this.zzax + ((long) i) >= ((long) this.zzaz)) {
            int i2;
            if (zzs.DEBUG) {
                zzs.zza("Pruning old cache entries.", new Object[0]);
            }
            long j = this.zzax;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.zzaw.entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                a aVar = (a) ((Entry) it.next()).getValue();
                if (zzf(aVar.b).delete()) {
                    this.zzax -= aVar.a;
                } else {
                    zzs.zzb("Could not delete cache entry for key=%s, filename=%s", aVar.b, zze(aVar.b));
                }
                it.remove();
                i2 = i3 + 1;
                if (((float) (this.zzax + ((long) i))) < ((float) this.zzaz) * 0.9f) {
                    break;
                }
                i3 = i2;
            }
            i2 = i3;
            if (zzs.DEBUG) {
                zzs.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzax - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    static String zzd(InputStream inputStream) throws IOException {
        return new String(zza(inputStream, (int) zzc(inputStream)), Constants.ENCODING);
    }

    private String zze(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static Map<String, String> zze(InputStream inputStream) throws IOException {
        int zzb = zzb(inputStream);
        Map<String, String> emptyMap = zzb == 0 ? Collections.emptyMap() : new HashMap(zzb);
        for (int i = 0; i < zzb; i++) {
            emptyMap.put(zzd(inputStream).intern(), zzd(inputStream).intern());
        }
        return emptyMap;
    }

    public synchronized void initialize() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        if (this.zzay.exists()) {
            File[] listFiles = this.zzay.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            a a = a.a((InputStream) bufferedInputStream);
                            a.a = file.length();
                            zza(a.b, a);
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e) {
                                }
                            }
                        } catch (IOException e2) {
                            if (file != null) {
                                try {
                                    file.delete();
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    bufferedInputStream2 = bufferedInputStream;
                                    th = th3;
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e3) {
                                }
                            }
                        }
                    } catch (IOException e4) {
                        bufferedInputStream = null;
                        if (file != null) {
                            file.delete();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
        } else if (!this.zzay.mkdirs()) {
            zzs.zzc("Unable to create cache dir %s", this.zzay.getAbsolutePath());
        }
        return;
        if (bufferedInputStream2 != null) {
            try {
                bufferedInputStream2.close();
            } catch (IOException e5) {
            }
        }
        throw th;
        throw th;
    }

    public synchronized void remove(String str) {
        boolean delete = zzf(str).delete();
        removeEntry(str);
        if (!delete) {
            zzs.zzb("Could not delete cache entry for key=%s, filename=%s", str, zze(str));
        }
    }

    public synchronized zza zza(String str) {
        zza com_google_android_gms_internal_zzb_zza;
        b bVar;
        IOException e;
        Throwable th;
        a aVar = (a) this.zzaw.get(str);
        if (aVar == null) {
            com_google_android_gms_internal_zzb_zza = null;
        } else {
            File zzf = zzf(str);
            try {
                bVar = new b(new FileInputStream(zzf));
                try {
                    a.a((InputStream) bVar);
                    com_google_android_gms_internal_zzb_zza = aVar.a(zza((InputStream) bVar, (int) (zzf.length() - ((long) bVar.a))));
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e2) {
                            com_google_android_gms_internal_zzb_zza = null;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        zzs.zzb("%s: %s", zzf.getAbsolutePath(), e.toString());
                        remove(str);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e4) {
                                com_google_android_gms_internal_zzb_zza = null;
                            }
                        }
                        com_google_android_gms_internal_zzb_zza = null;
                        return com_google_android_gms_internal_zzb_zza;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e5) {
                                com_google_android_gms_internal_zzb_zza = null;
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e6) {
                e = e6;
                bVar = null;
                zzs.zzb("%s: %s", zzf.getAbsolutePath(), e.toString());
                remove(str);
                if (bVar != null) {
                    bVar.close();
                }
                com_google_android_gms_internal_zzb_zza = null;
                return com_google_android_gms_internal_zzb_zza;
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        }
        return com_google_android_gms_internal_zzb_zza;
    }

    public synchronized void zza(String str, zza com_google_android_gms_internal_zzb_zza) {
        zzc(com_google_android_gms_internal_zzb_zza.data.length);
        File zzf = zzf(str);
        try {
            OutputStream fileOutputStream = new FileOutputStream(zzf);
            a aVar = new a(str, com_google_android_gms_internal_zzb_zza);
            if (aVar.a(fileOutputStream)) {
                fileOutputStream.write(com_google_android_gms_internal_zzb_zza.data);
                fileOutputStream.close();
                zza(str, aVar);
            } else {
                fileOutputStream.close();
                zzs.zzb("Failed to write header for %s", zzf.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException e) {
            if (!zzf.delete()) {
                zzs.zzb("Could not clean up file %s", zzf.getAbsolutePath());
            }
        }
    }

    public File zzf(String str) {
        return new File(this.zzay, zze(str));
    }
}
