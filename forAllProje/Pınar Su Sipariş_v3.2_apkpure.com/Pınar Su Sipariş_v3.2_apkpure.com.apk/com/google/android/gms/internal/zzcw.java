package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@zzig
public class zzcw {
    final Context mContext;
    final String zztK;
    String zzzM;
    BlockingQueue<zzdc> zzzO;
    ExecutorService zzzP;
    LinkedHashMap<String, String> zzzQ = new LinkedHashMap();
    Map<String, zzcz> zzzR = new HashMap();
    private AtomicBoolean zzzS;
    private File zzzT;

    public zzcw(Context context, String str, String str2, Map<String, String> map) {
        this.mContext = context;
        this.zztK = str;
        this.zzzM = str2;
        this.zzzS = new AtomicBoolean(false);
        this.zzzS.set(((Boolean) zzcu.zzxH.get()).booleanValue());
        if (this.zzzS.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.zzzT = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.zzzQ.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.zzzO = new ArrayBlockingQueue(30);
        this.zzzP = Executors.newSingleThreadExecutor();
        this.zzzP.execute(new Runnable(this) {
            final /* synthetic */ zzcw a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzew();
            }
        });
        this.zzzR.put("action", zzcz.zzzW);
        this.zzzR.put("ad_format", zzcz.zzzW);
        this.zzzR.put("e", zzcz.zzzX);
    }

    private void zzc(File file, String str) {
        FileOutputStream fileOutputStream;
        Throwable e;
        if (file != null) {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.write(10);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (Throwable e2) {
                            zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                            return;
                        }
                    }
                    return;
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        zzb.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e2);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                return;
                            } catch (Throwable e22) {
                                zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e22);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        e22 = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable e4) {
                                zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            }
                        }
                        throw e22;
                    }
                }
            } catch (IOException e5) {
                e22 = e5;
                fileOutputStream = null;
                zzb.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e22);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                e22 = th2;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw e22;
            }
        }
        zzb.zzaW("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
    }

    private void zzc(Map<String, String> map, String str) {
        String zza = zza(this.zzzM, map, str);
        if (this.zzzS.get()) {
            zzc(this.zzzT, zza);
        } else {
            zzu.zzck().zzc(this.mContext, this.zztK, zza);
        }
    }

    private void zzew() {
        while (true) {
            try {
                zzdc com_google_android_gms_internal_zzdc = (zzdc) this.zzzO.take();
                String zzeC = com_google_android_gms_internal_zzdc.zzeC();
                if (!TextUtils.isEmpty(zzeC)) {
                    zzc(zza(this.zzzQ, com_google_android_gms_internal_zzdc.zzm()), zzeC);
                }
            } catch (Throwable e) {
                zzb.zzd("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    public zzcz zzQ(String str) {
        zzcz com_google_android_gms_internal_zzcz = (zzcz) this.zzzR.get(str);
        return com_google_android_gms_internal_zzcz != null ? com_google_android_gms_internal_zzcz : zzcz.zzzV;
    }

    String zza(String str, Map<String, String> map, String str2) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
        stringBuilder.append("&").append("it").append("=").append(str2);
        return stringBuilder.toString();
    }

    Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        Map<String, String> linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zzQ(str).zze(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public boolean zza(zzdc com_google_android_gms_internal_zzdc) {
        return this.zzzO.offer(com_google_android_gms_internal_zzdc);
    }

    public void zzc(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.zzzQ.put("e", TextUtils.join(",", list));
        }
    }
}
