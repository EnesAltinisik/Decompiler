package com.google.firebase.remoteconfig;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.XmlResourceParser;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.internal.zzajc;
import com.google.android.gms.internal.zzajd;
import com.google.android.gms.internal.zzaje;
import com.google.android.gms.internal.zzajf;
import com.google.android.gms.internal.zzajg;
import com.google.android.gms.internal.zzajh;
import com.google.android.gms.internal.zzaji.zza;
import com.google.android.gms.internal.zzaji.zzb;
import com.google.android.gms.internal.zzaji.zzc;
import com.google.android.gms.internal.zzaji.zzd;
import com.google.android.gms.internal.zzaji.zze;
import com.google.android.gms.internal.zzaji.zzf;
import com.google.android.gms.internal.zzamb;
import com.google.android.gms.internal.zzpy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private static FirebaseRemoteConfig zzbTi;
    private final Context mContext;
    private zzaje zzbTj;
    private zzaje zzbTk;
    private zzaje zzbTl;
    private zzajh zzbTm;
    private final ReadWriteLock zzbTn;

    static class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    FirebaseRemoteConfig(Context context) {
        this(context, null, null, null, null);
    }

    private FirebaseRemoteConfig(Context context, zzaje com_google_android_gms_internal_zzaje, zzaje com_google_android_gms_internal_zzaje2, zzaje com_google_android_gms_internal_zzaje3, zzajh com_google_android_gms_internal_zzajh) {
        this.zzbTn = new ReentrantReadWriteLock(true);
        this.mContext = context;
        if (com_google_android_gms_internal_zzajh != null) {
            this.zzbTm = com_google_android_gms_internal_zzajh;
        } else {
            this.zzbTm = new zzajh();
        }
        this.zzbTm.zzaL(zzbE(this.mContext));
        if (com_google_android_gms_internal_zzaje != null) {
            this.zzbTj = com_google_android_gms_internal_zzaje;
        }
        if (com_google_android_gms_internal_zzaje2 != null) {
            this.zzbTk = com_google_android_gms_internal_zzaje2;
        }
        if (com_google_android_gms_internal_zzaje3 != null) {
            this.zzbTl = com_google_android_gms_internal_zzaje3;
        }
    }

    public static FirebaseRemoteConfig getInstance() {
        if (zzbTi != null) {
            return zzbTi;
        }
        FirebaseApp instance = FirebaseApp.getInstance();
        if (instance != null) {
            return zzbD(instance.getApplicationContext());
        }
        throw new IllegalStateException("FirebaseApp has not been initialized.");
    }

    private void zzUy() {
        this.zzbTn.readLock().lock();
        try {
            Runnable com_google_android_gms_internal_zzajd = new zzajd(this.mContext, this.zzbTj, this.zzbTk, this.zzbTl, this.zzbTm);
            if (VERSION.SDK_INT >= 11) {
                AsyncTask.SERIAL_EXECUTOR.execute(com_google_android_gms_internal_zzajd);
            } else {
                new a().execute(com_google_android_gms_internal_zzajd);
            }
            this.zzbTn.readLock().unlock();
        } catch (Throwable th) {
            this.zzbTn.readLock().unlock();
        }
    }

    private static zzaje zza(zza com_google_android_gms_internal_zzaji_zza) {
        if (com_google_android_gms_internal_zzaji_zza == null) {
            return null;
        }
        Map hashMap = new HashMap();
        for (zzd com_google_android_gms_internal_zzaji_zzd : com_google_android_gms_internal_zzaji_zza.zzbTD) {
            String str = com_google_android_gms_internal_zzaji_zzd.zzasB;
            Map hashMap2 = new HashMap();
            for (zzb com_google_android_gms_internal_zzaji_zzb : com_google_android_gms_internal_zzaji_zzd.zzbTJ) {
                hashMap2.put(com_google_android_gms_internal_zzaji_zzb.zzaB, com_google_android_gms_internal_zzaji_zzb.zzbTF);
            }
            hashMap.put(str, hashMap2);
        }
        return new zzaje(hashMap, com_google_android_gms_internal_zzaji_zza.timestamp);
    }

    private static zzajh zza(zzc com_google_android_gms_internal_zzaji_zzc) {
        zzajh com_google_android_gms_internal_zzajh = new zzajh();
        com_google_android_gms_internal_zzajh.zznJ(com_google_android_gms_internal_zzaji_zzc.zzbTG);
        com_google_android_gms_internal_zzajh.zzaT(com_google_android_gms_internal_zzaji_zzc.zzbTH);
        return com_google_android_gms_internal_zzajh;
    }

    private static Map<String, zzajc> zza(zzf[] com_google_android_gms_internal_zzaji_zzfArr) {
        Map<String, zzajc> hashMap = new HashMap();
        for (zzf com_google_android_gms_internal_zzaji_zzf : com_google_android_gms_internal_zzaji_zzfArr) {
            hashMap.put(com_google_android_gms_internal_zzaji_zzf.zzasB, new zzajc(com_google_android_gms_internal_zzaji_zzf.resourceId, com_google_android_gms_internal_zzaji_zzf.zzbTQ));
        }
        return hashMap;
    }

    private static long zzb(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static FirebaseRemoteConfig zzbD(Context context) {
        if (zzbTi == null) {
            zze zzbF = zzbF(context);
            if (zzbF == null) {
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "No persisted config was found. Initializing from scratch.");
                }
                zzbTi = new FirebaseRemoteConfig(context);
            } else {
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "Initializing from persisted config.");
                }
                zzaje zza = zza(zzbF.zzbTK);
                zzaje zza2 = zza(zzbF.zzbTL);
                zzaje zza3 = zza(zzbF.zzbTM);
                zzajh zza4 = zza(zzbF.zzbTN);
                zza4.zzaD(zza(zzbF.zzbTO));
                zzbTi = new FirebaseRemoteConfig(context, zza, zza2, zza3, zza4);
            }
        }
        return zzbTi;
    }

    private long zzbE(Context context) {
        long j = 0;
        try {
            return this.mContext.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("FirebaseRemoteConfig", new StringBuilder(String.valueOf(valueOf).length() + 25).append("Package [").append(valueOf).append("] was not found!").toString());
            return j;
        }
    }

    private static zze zzbF(Context context) {
        Throwable th;
        Throwable th2;
        zze com_google_android_gms_internal_zzaji_zze = null;
        if (context == null) {
            return null;
        }
        try {
            InputStream openFileInput = context.openFileInput("persisted_config");
            zzamb zzN = zzamb.zzN(zzl(openFileInput));
            zze com_google_android_gms_internal_zzaji_zze2 = new zze();
            try {
                com_google_android_gms_internal_zzaji_zze = (zze) com_google_android_gms_internal_zzaji_zze2.mergeFrom(zzN);
                openFileInput.close();
                return com_google_android_gms_internal_zzaji_zze2;
            } catch (Throwable e) {
                th = e;
                com_google_android_gms_internal_zzaji_zze = com_google_android_gms_internal_zzaji_zze2;
                th2 = th;
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    return com_google_android_gms_internal_zzaji_zze;
                }
                Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", th2);
                return com_google_android_gms_internal_zzaji_zze;
            } catch (Throwable e2) {
                th = e2;
                com_google_android_gms_internal_zzaji_zze = com_google_android_gms_internal_zzaji_zze2;
                th2 = th;
                Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", th2);
                return com_google_android_gms_internal_zzaji_zze;
            }
        } catch (FileNotFoundException e3) {
            th2 = e3;
            if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                return com_google_android_gms_internal_zzaji_zze;
            }
            Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", th2);
            return com_google_android_gms_internal_zzaji_zze;
        } catch (IOException e4) {
            th2 = e4;
            Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", th2);
            return com_google_android_gms_internal_zzaji_zze;
        }
    }

    private void zzc(Map<String, Object> map, String str, boolean z) {
        if (str != null) {
            Object obj = (map == null || map.isEmpty()) ? 1 : null;
            Map hashMap = new HashMap();
            if (obj == null) {
                for (String str2 : map.keySet()) {
                    Object obj2 = map.get(str2);
                    if (obj2 instanceof String) {
                        hashMap.put(str2, ((String) obj2).getBytes(zzajg.UTF_8));
                    } else if (obj2 instanceof Long) {
                        hashMap.put(str2, ((Long) obj2).toString().getBytes(zzajg.UTF_8));
                    } else if (obj2 instanceof Integer) {
                        hashMap.put(str2, ((Integer) obj2).toString().getBytes(zzajg.UTF_8));
                    } else if (obj2 instanceof Double) {
                        hashMap.put(str2, ((Double) obj2).toString().getBytes(zzajg.UTF_8));
                    } else if (obj2 instanceof Float) {
                        hashMap.put(str2, ((Float) obj2).toString().getBytes(zzajg.UTF_8));
                    } else if (obj2 instanceof byte[]) {
                        hashMap.put(str2, (byte[]) obj2);
                    } else if (obj2 instanceof Boolean) {
                        hashMap.put(str2, ((Boolean) obj2).toString().getBytes(zzajg.UTF_8));
                    } else {
                        throw new IllegalArgumentException("The type of a default value needs to beone of String, Long, Double, Boolean, or byte[].");
                    }
                }
            }
            this.zzbTn.writeLock().lock();
            if (obj != null) {
                try {
                    if (this.zzbTl == null || !this.zzbTl.zziE(str)) {
                        this.zzbTn.writeLock().unlock();
                        return;
                    } else {
                        this.zzbTl.zzk(null, str);
                        this.zzbTl.setTimestamp(System.currentTimeMillis());
                    }
                } catch (Throwable th) {
                    this.zzbTn.writeLock().unlock();
                }
            } else {
                if (this.zzbTl == null) {
                    this.zzbTl = new zzaje(new HashMap(), System.currentTimeMillis());
                }
                this.zzbTl.zzk(hashMap, str);
                this.zzbTl.setTimestamp(System.currentTimeMillis());
            }
            if (z) {
                this.zzbTm.zziF(str);
            }
            zzUy();
            this.zzbTn.writeLock().unlock();
        }
    }

    private static byte[] zzl(InputStream inputStream) throws IOException {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzb(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean activateFetched() {
        this.zzbTn.writeLock().lock();
        try {
            if (this.zzbTj == null) {
                return false;
            }
            if (this.zzbTk == null || this.zzbTk.getTimestamp() < this.zzbTj.getTimestamp()) {
                long timestamp = this.zzbTj.getTimestamp();
                this.zzbTk = this.zzbTj;
                this.zzbTk.setTimestamp(System.currentTimeMillis());
                this.zzbTj = new zzaje(null, timestamp);
                zzUy();
                this.zzbTn.writeLock().unlock();
                return true;
            }
            this.zzbTn.writeLock().unlock();
            return false;
        } finally {
            this.zzbTn.writeLock().unlock();
        }
    }

    public Task<Void> fetch() {
        return fetch(43200);
    }

    public Task<Void> fetch(long j) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzbTn.writeLock().lock();
        try {
            zzpy.zza.zza com_google_android_gms_internal_zzpy_zza_zza = new zzpy.zza.zza();
            com_google_android_gms_internal_zzpy_zza_zza.zzF(j);
            if (this.zzbTm.isDeveloperModeEnabled()) {
                com_google_android_gms_internal_zzpy_zza_zza.zzF("_rcn_developer", "true");
            }
            new com.google.android.gms.config.internal.zzb(this.mContext).zza(com_google_android_gms_internal_zzpy_zza_zza.zzvs()).setResultCallback(new ResultCallback<zzpy.zzb>(this) {
                final /* synthetic */ FirebaseRemoteConfig b;

                public void a(zzpy.zzb com_google_android_gms_internal_zzpy_zzb) {
                    this.b.zza(taskCompletionSource, com_google_android_gms_internal_zzpy_zzb);
                }

                public /* synthetic */ void onResult(Result result) {
                    a((zzpy.zzb) result);
                }
            });
            return taskCompletionSource.getTask();
        } finally {
            this.zzbTn.writeLock().unlock();
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, "configns:firebase");
    }

    public boolean getBoolean(String str, String str2) {
        Lock lock = true;
        if (str2 == null) {
            return false;
        }
        this.zzbTn.readLock().lock();
        try {
            CharSequence str3;
            if (this.zzbTk != null && this.zzbTk.zzaq(str, str2)) {
                str3 = new String(this.zzbTk.zzar(str, str2), zzajg.UTF_8);
                if (zzajg.zzauD.matcher(str3).matches()) {
                    return lock;
                }
                if (zzajg.zzauE.matcher(str3).matches()) {
                    this.zzbTn.readLock().unlock();
                    return false;
                }
            }
            if (this.zzbTl != null && this.zzbTl.zzaq(str, str2)) {
                str3 = new String(this.zzbTl.zzar(str, str2), zzajg.UTF_8);
                if (zzajg.zzauD.matcher(str3).matches()) {
                    this.zzbTn.readLock().unlock();
                    return true;
                } else if (zzajg.zzauE.matcher(str3).matches()) {
                    this.zzbTn.readLock().unlock();
                    return false;
                }
            }
            this.zzbTn.readLock().unlock();
            return false;
        } finally {
            lock = this.zzbTn.readLock();
            lock.unlock();
        }
    }

    public byte[] getByteArray(String str) {
        return getByteArray(str, "configns:firebase");
    }

    public byte[] getByteArray(String str, String str2) {
        if (str2 == null) {
            return DEFAULT_VALUE_FOR_BYTE_ARRAY;
        }
        this.zzbTn.readLock().lock();
        byte[] bArr;
        if (this.zzbTk == null || !this.zzbTk.zzaq(str, str2)) {
            try {
                if (this.zzbTl == null || !this.zzbTl.zzaq(str, str2)) {
                    bArr = DEFAULT_VALUE_FOR_BYTE_ARRAY;
                    this.zzbTn.readLock().unlock();
                    return bArr;
                }
                bArr = this.zzbTl.zzar(str, str2);
                this.zzbTn.readLock().unlock();
                return bArr;
            } finally {
                this.zzbTn.readLock().unlock();
            }
        } else {
            bArr = this.zzbTk.zzar(str, str2);
            return bArr;
        }
    }

    public double getDouble(String str) {
        return getDouble(str, "configns:firebase");
    }

    public double getDouble(String str, String str2) {
        double d = 0.0d;
        if (str2 != null) {
            this.zzbTn.readLock().lock();
            try {
                if (this.zzbTk != null && this.zzbTk.zzaq(str, str2)) {
                    try {
                        d = Double.valueOf(new String(this.zzbTk.zzar(str, str2), zzajg.UTF_8)).doubleValue();
                    } catch (NumberFormatException e) {
                    }
                }
                if (this.zzbTl != null && this.zzbTl.zzaq(str, str2)) {
                    try {
                        d = Double.valueOf(new String(this.zzbTl.zzar(str, str2), zzajg.UTF_8)).doubleValue();
                        this.zzbTn.readLock().unlock();
                    } catch (NumberFormatException e2) {
                    }
                }
                this.zzbTn.readLock().unlock();
            } finally {
                this.zzbTn.readLock().unlock();
            }
        }
        return d;
    }

    public FirebaseRemoteConfigInfo getInfo() {
        FirebaseRemoteConfigInfo com_google_android_gms_internal_zzajf = new zzajf();
        this.zzbTn.readLock().lock();
        try {
            com_google_android_gms_internal_zzajf.zzaK(this.zzbTj == null ? -1 : this.zzbTj.getTimestamp());
            com_google_android_gms_internal_zzajf.zznJ(this.zzbTm.getLastFetchStatus());
            com_google_android_gms_internal_zzajf.setConfigSettings(new Builder().setDeveloperModeEnabled(this.zzbTm.isDeveloperModeEnabled()).build());
            return com_google_android_gms_internal_zzajf;
        } finally {
            this.zzbTn.readLock().unlock();
        }
    }

    public long getLong(String str) {
        return getLong(str, "configns:firebase");
    }

    public long getLong(String str, String str2) {
        long j = 0;
        if (str2 != null) {
            this.zzbTn.readLock().lock();
            try {
                if (this.zzbTk != null && this.zzbTk.zzaq(str, str2)) {
                    try {
                        j = Long.valueOf(new String(this.zzbTk.zzar(str, str2), zzajg.UTF_8)).longValue();
                    } catch (NumberFormatException e) {
                    }
                }
                if (this.zzbTl != null && this.zzbTl.zzaq(str, str2)) {
                    try {
                        j = Long.valueOf(new String(this.zzbTl.zzar(str, str2), zzajg.UTF_8)).longValue();
                        this.zzbTn.readLock().unlock();
                    } catch (NumberFormatException e2) {
                    }
                }
                this.zzbTn.readLock().unlock();
            } finally {
                this.zzbTn.readLock().unlock();
            }
        }
        return j;
    }

    public String getString(String str) {
        return getString(str, "configns:firebase");
    }

    public String getString(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        this.zzbTn.readLock().lock();
        String str3;
        if (this.zzbTk == null || !this.zzbTk.zzaq(str, str2)) {
            try {
                if (this.zzbTl == null || !this.zzbTl.zzaq(str, str2)) {
                    str3 = "";
                    this.zzbTn.readLock().unlock();
                    return str3;
                }
                str3 = new String(this.zzbTl.zzar(str, str2), zzajg.UTF_8);
                this.zzbTn.readLock().unlock();
                return str3;
            } finally {
                this.zzbTn.readLock().unlock();
            }
        } else {
            str3 = new String(this.zzbTk.zzar(str, str2), zzajg.UTF_8);
            return str3;
        }
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        return getValue(str, "configns:firebase");
    }

    public FirebaseRemoteConfigValue getValue(String str, String str2) {
        if (str2 == null) {
            return new zzajg(DEFAULT_VALUE_FOR_BYTE_ARRAY, 0);
        }
        this.zzbTn.readLock().lock();
        FirebaseRemoteConfigValue com_google_android_gms_internal_zzajg;
        if (this.zzbTk == null || !this.zzbTk.zzaq(str, str2)) {
            try {
                if (this.zzbTl == null || !this.zzbTl.zzaq(str, str2)) {
                    com_google_android_gms_internal_zzajg = new zzajg(DEFAULT_VALUE_FOR_BYTE_ARRAY, 0);
                    this.zzbTn.readLock().unlock();
                    return com_google_android_gms_internal_zzajg;
                }
                com_google_android_gms_internal_zzajg = new zzajg(this.zzbTl.zzar(str, str2), 1);
                this.zzbTn.readLock().unlock();
                return com_google_android_gms_internal_zzajg;
            } finally {
                this.zzbTn.readLock().unlock();
            }
        } else {
            com_google_android_gms_internal_zzajg = new zzajg(this.zzbTk.zzar(str, str2), 2);
            return com_google_android_gms_internal_zzajg;
        }
    }

    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.zzbTn.writeLock().lock();
        try {
            boolean isDeveloperModeEnabled = this.zzbTm.isDeveloperModeEnabled();
            boolean isDeveloperModeEnabled2 = firebaseRemoteConfigSettings == null ? false : firebaseRemoteConfigSettings.isDeveloperModeEnabled();
            this.zzbTm.zzaT(isDeveloperModeEnabled2);
            if (isDeveloperModeEnabled != isDeveloperModeEnabled2) {
                zzUy();
            }
            this.zzbTn.writeLock().unlock();
        } catch (Throwable th) {
            this.zzbTn.writeLock().unlock();
        }
    }

    public void setDefaults(int i) {
        setDefaults(i, "configns:firebase");
    }

    public void setDefaults(int i, String str) {
        if (str != null) {
            this.zzbTn.readLock().lock();
            try {
                if (!(this.zzbTm == null || this.zzbTm.zzUE() == null || this.zzbTm.zzUE().get(str) == null)) {
                    zzajc com_google_android_gms_internal_zzajc = (zzajc) this.zzbTm.zzUE().get(str);
                    if (i == com_google_android_gms_internal_zzajc.zzUz() && this.zzbTm.zzUF() == com_google_android_gms_internal_zzajc.zzUA()) {
                        if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                            Log.d("FirebaseRemoteConfig", "Skipped setting defaults from resource file as this resource file was already applied.");
                        }
                        this.zzbTn.readLock().unlock();
                        return;
                    }
                }
                this.zzbTn.readLock().unlock();
                Map hashMap = new HashMap();
                try {
                    XmlResourceParser xml = this.mContext.getResources().getXml(i);
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            obj2 = xml.getName();
                        } else if (eventType == 3) {
                            if (!(!"entry".equals(xml.getName()) || obj == null || obj3 == null)) {
                                hashMap.put(obj, obj3);
                                obj3 = null;
                                obj = null;
                            }
                            obj2 = null;
                        } else if (eventType == 4) {
                            if ("key".equals(obj2)) {
                                obj = xml.getText();
                            } else if (Param.VALUE.equals(obj2)) {
                                obj3 = xml.getText();
                            }
                        }
                    }
                    this.zzbTm.zza(str, new zzajc(i, this.zzbTm.zzUF()));
                    zzc(hashMap, str, false);
                } catch (Throwable e) {
                    Log.e("FirebaseRemoteConfig", "Caught exception while parsing XML resource. Skipping setDefaults.", e);
                }
            } catch (Throwable th) {
                this.zzbTn.readLock().unlock();
            }
        } else if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
            Log.d("FirebaseRemoteConfig", "namespace cannot be null for setDefaults.");
        }
    }

    public void setDefaults(Map<String, Object> map) {
        setDefaults((Map) map, "configns:firebase");
    }

    public void setDefaults(Map<String, Object> map, String str) {
        zzc(map, str, true);
    }

    void zza(TaskCompletionSource<Void> taskCompletionSource, zzpy.zzb com_google_android_gms_internal_zzpy_zzb) {
        if (com_google_android_gms_internal_zzpy_zzb == null || com_google_android_gms_internal_zzpy_zzb.getStatus() == null) {
            this.zzbTm.zznJ(1);
            taskCompletionSource.setException(new FirebaseRemoteConfigFetchException());
            zzUy();
            return;
        }
        int statusCode = com_google_android_gms_internal_zzpy_zzb.getStatus().getStatusCode();
        Map zzvt;
        Map hashMap;
        Map hashMap2;
        switch (statusCode) {
            case -6508:
            case -6506:
                this.zzbTm.zznJ(-1);
                if (!(this.zzbTj == null || this.zzbTj.zzUC())) {
                    zzvt = com_google_android_gms_internal_zzpy_zzb.zzvt();
                    hashMap = new HashMap();
                    for (String str : zzvt.keySet()) {
                        hashMap2 = new HashMap();
                        for (String str2 : (Set) zzvt.get(str)) {
                            hashMap2.put(str2, com_google_android_gms_internal_zzpy_zzb.zza(str2, null, str));
                        }
                        hashMap.put(str, hashMap2);
                    }
                    this.zzbTj = new zzaje(hashMap, this.zzbTj.getTimestamp());
                }
                taskCompletionSource.setResult(null);
                zzUy();
                return;
            case -6505:
                zzvt = com_google_android_gms_internal_zzpy_zzb.zzvt();
                hashMap = new HashMap();
                for (String str3 : zzvt.keySet()) {
                    hashMap2 = new HashMap();
                    for (String str22 : (Set) zzvt.get(str3)) {
                        hashMap2.put(str22, com_google_android_gms_internal_zzpy_zzb.zza(str22, null, str3));
                    }
                    hashMap.put(str3, hashMap2);
                }
                this.zzbTj = new zzaje(hashMap, System.currentTimeMillis());
                this.zzbTm.zznJ(-1);
                taskCompletionSource.setResult(null);
                zzUy();
                return;
            case GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE /*6500*/:
            case GamesStatusCodes.STATUS_MATCH_ERROR_INACTIVE_MATCH /*6501*/:
            case GamesStatusCodes.STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION /*6503*/:
            case GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS /*6504*/:
                this.zzbTm.zznJ(1);
                taskCompletionSource.setException(new FirebaseRemoteConfigFetchException());
                zzUy();
                return;
            case GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_STATE /*6502*/:
            case GamesStatusCodes.STATUS_MATCH_ERROR_LOCALLY_MODIFIED /*6507*/:
                this.zzbTm.zznJ(2);
                taskCompletionSource.setException(new FirebaseRemoteConfigFetchThrottledException(com_google_android_gms_internal_zzpy_zzb.getThrottleEndTimeMillis()));
                zzUy();
                return;
            default:
                if (com_google_android_gms_internal_zzpy_zzb.getStatus().isSuccess()) {
                    Log.w("FirebaseRemoteConfig", "Unknown (successful) status code: " + statusCode);
                }
                this.zzbTm.zznJ(1);
                taskCompletionSource.setException(new FirebaseRemoteConfigFetchException());
                zzUy();
                return;
        }
    }
}
