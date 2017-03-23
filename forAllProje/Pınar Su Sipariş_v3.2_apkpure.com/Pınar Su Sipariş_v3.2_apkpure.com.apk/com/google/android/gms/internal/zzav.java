package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import com.google.ads.afma.nano.Google3NanoAfmaSignals.Cache;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.clearcut.zzb;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzas.zza;
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

public class zzav {
    private static final String TAG = zzav.class.getSimpleName();
    protected static final Object zzoF = new Object();
    private static zzc zzoH = null;
    private volatile AdvertisingIdClient zzoA = null;
    private Future zzoB = null;
    private zzak zzoC;
    private GoogleApiClient zzoD = null;
    protected boolean zzoE = false;
    protected boolean zzoG = false;
    protected boolean zzoI = false;
    private Map<Pair<String, String>, zzbl> zzoJ;
    private volatile boolean zzod = false;
    protected Context zzov;
    private ExecutorService zzow;
    private DexClassLoader zzox;
    private zzas zzoy;
    private byte[] zzoz;

    private zzav(Context context) {
        this.zzov = context;
        this.zzoJ = new HashMap();
    }

    public static zzav zza(Context context, String str, String str2, boolean z) {
        zzav com_google_android_gms_internal_zzav = new zzav(context);
        try {
            if (com_google_android_gms_internal_zzav.zzc(str, str2, z)) {
                return com_google_android_gms_internal_zzav;
            }
        } catch (zzau e) {
        }
        return null;
    }

    private File zza(String str, File file, String str2) throws zza, IOException {
        File file2 = new File(String.format("%s/%s.jar", new Object[]{file, str2}));
        if (!file2.exists()) {
            byte[] zzc = this.zzoy.zzc(this.zzoz, str);
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(zzc, 0, zzc.length);
            fileOutputStream.close();
        }
        return file2;
    }

    private void zza(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(TAG, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    private void zza(File file, String str) {
        Throwable th;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
            if (file3.exists()) {
                FileInputStream fileInputStream = null;
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[((int) length)];
                    FileInputStream fileInputStream2;
                    try {
                        fileInputStream2 = new FileInputStream(file3);
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e) {
                                    }
                                }
                                zza(file3);
                                return;
                            }
                            zzamj cache = new Cache();
                            cache.osVersion = VERSION.SDK.getBytes();
                            cache.timestamp = str.getBytes();
                            bArr = this.zzoy.zzd(this.zzoz, bArr).getBytes();
                            cache.data = bArr;
                            cache.hash = h.a(bArr);
                            file2.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            byte[] toByteArray = zzamj.toByteArray(cache);
                            fileOutputStream.write(toByteArray, 0, toByteArray.length);
                            fileOutputStream.close();
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e2) {
                                }
                            }
                            zza(file3);
                        } catch (IOException e3) {
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e4) {
                                }
                            }
                            zza(file3);
                        } catch (NoSuchAlgorithmException e5) {
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            zza(file3);
                        } catch (zza e6) {
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            zza(file3);
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            fileInputStream = fileInputStream2;
                            th = th3;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e7) {
                                }
                            }
                            zza(file3);
                            throw th;
                        }
                    } catch (IOException e8) {
                        fileInputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        zza(file3);
                    } catch (NoSuchAlgorithmException e9) {
                        fileInputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        zza(file3);
                    } catch (zza e10) {
                        fileInputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        zza(file3);
                    } catch (Throwable th4) {
                        th = th4;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        zza(file3);
                        throw th;
                    }
                }
            }
        }
    }

    private void zzaL() {
        try {
            if (this.zzoA == null) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzov);
                advertisingIdClient.start();
                this.zzoA = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException e) {
            this.zzoA = null;
        } catch (IOException e2) {
            this.zzoA = null;
        } catch (GooglePlayServicesRepairableException e3) {
            this.zzoA = null;
        }
    }

    private void zzaM() {
        boolean z = true;
        zzoH = zzc.zzqV();
        this.zzoE = zzoH.zzae(this.zzov) > 0;
        if (zzoH.isGooglePlayServicesAvailable(this.zzov) != 0) {
            z = false;
        }
        this.zzoG = z;
        if (this.zzov.getApplicationContext() != null) {
            this.zzoD = new Builder(this.zzov).addApi(zzb.API).build();
        }
        zzcu.initialize(this.zzov);
    }

    private void zzb(boolean z) {
        this.zzod = z;
        if (z) {
            this.zzoB = this.zzow.submit(new Runnable(this) {
                final /* synthetic */ zzav a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.zzaL();
                }
            });
        }
    }

    private boolean zzb(File file, String str) {
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
                zza(file2);
                return false;
            }
            byte[] bArr = new byte[((int) length)];
            if (new FileInputStream(file2).read(bArr) <= 0) {
                Log.d(TAG, "Cannot read the cache data.");
                zza(file2);
                return false;
            }
            Cache parseFrom = Cache.parseFrom(bArr);
            if (str.equals(new String(parseFrom.timestamp)) && Arrays.equals(parseFrom.hash, h.a(parseFrom.data)) && Arrays.equals(parseFrom.osVersion, VERSION.SDK.getBytes())) {
                byte[] zzc = this.zzoy.zzc(this.zzoz, new String(parseFrom.data));
                file3.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(zzc, 0, zzc.length);
                fileOutputStream.close();
                return true;
            }
            zza(file2);
            return false;
        } catch (IOException e) {
            return false;
        } catch (NoSuchAlgorithmException e2) {
            return false;
        } catch (zza e3) {
            return false;
        }
    }

    private boolean zzc(String str, String str2, boolean z) throws zzau {
        this.zzow = Executors.newCachedThreadPool();
        zzb(z);
        zzaM();
        this.zzoy = new zzas(null);
        try {
            this.zzoz = this.zzoy.zzl(str);
            boolean zzm = zzm(str2);
            this.zzoC = new zzak(this);
            return zzm;
        } catch (Throwable e) {
            throw new zzau(e);
        }
    }

    private boolean zzm(String str) throws zzau {
        File file;
        String zzX;
        File zza;
        try {
            File cacheDir = this.zzov.getCacheDir();
            if (cacheDir == null) {
                cacheDir = this.zzov.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new zzau();
                }
            }
            file = cacheDir;
            zzX = zzat.zzX();
            zza = zza(str, file, zzX);
            zzb(file, zzX);
            this.zzox = new DexClassLoader(zza.getAbsolutePath(), file.getAbsolutePath(), null, this.zzov.getClassLoader());
            zza(zza);
            zza(file, zzX);
            zzn(String.format("%s/%s.dex", new Object[]{file, zzX}));
            return true;
        } catch (Throwable e) {
            throw new zzau(e);
        } catch (Throwable e2) {
            throw new zzau(e2);
        } catch (Throwable e22) {
            throw new zzau(e22);
        } catch (Throwable e222) {
            throw new zzau(e222);
        } catch (Throwable th) {
            zza(zza);
            zza(file, zzX);
            zzn(String.format("%s/%s.dex", new Object[]{file, zzX}));
        }
    }

    private void zzn(String str) {
        zza(new File(str));
    }

    public Context getContext() {
        return this.zzov;
    }

    public int zzT() {
        zzak zzaK = zzaK();
        return zzaK != null ? zzaK.zzT() : zzamj.UNSET_ENUM_VALUE;
    }

    public boolean zza(String str, String str2, List<Class> list) {
        if (this.zzoJ.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzoJ.put(new Pair(str, str2), new zzbl(this, str, str2, list));
        return true;
    }

    public ExecutorService zzaD() {
        return this.zzow;
    }

    public DexClassLoader zzaE() {
        return this.zzox;
    }

    public zzas zzaF() {
        return this.zzoy;
    }

    public byte[] zzaG() {
        return this.zzoz;
    }

    public GoogleApiClient zzaH() {
        return this.zzoD;
    }

    public boolean zzaI() {
        return this.zzoE;
    }

    public boolean zzaJ() {
        return this.zzoI;
    }

    public zzak zzaK() {
        return this.zzoC;
    }

    public AdvertisingIdClient zzaN() {
        if (!this.zzod) {
            return null;
        }
        if (this.zzoA != null) {
            return this.zzoA;
        }
        if (this.zzoB != null) {
            try {
                this.zzoB.get(2000, TimeUnit.MILLISECONDS);
                this.zzoB = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.zzoB.cancel(true);
            }
        }
        return this.zzoA;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzaO() {
        /*
        r2 = this;
        r1 = zzoF;
        monitor-enter(r1);
        r0 = r2.zzoI;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.zzoG;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x001e;
    L_0x000d:
        r0 = r2.zzoD;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x001e;
    L_0x0011:
        r0 = r2.zzoD;	 Catch:{ all -> 0x001b }
        r0.connect();	 Catch:{ all -> 0x001b }
        r0 = 1;
        r2.zzoI = r0;	 Catch:{ all -> 0x001b }
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0008;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
    L_0x001e:
        r0 = 0;
        r2.zzoI = r0;	 Catch:{ all -> 0x001b }
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzav.zzaO():void");
    }

    public void zzaP() {
        synchronized (zzoF) {
            if (this.zzoI && this.zzoD != null) {
                this.zzoD.disconnect();
                this.zzoI = false;
            }
        }
    }

    public Method zzc(String str, String str2) {
        zzbl com_google_android_gms_internal_zzbl = (zzbl) this.zzoJ.get(new Pair(str, str2));
        return com_google_android_gms_internal_zzbl == null ? null : com_google_android_gms_internal_zzbl.zzaU();
    }
}
