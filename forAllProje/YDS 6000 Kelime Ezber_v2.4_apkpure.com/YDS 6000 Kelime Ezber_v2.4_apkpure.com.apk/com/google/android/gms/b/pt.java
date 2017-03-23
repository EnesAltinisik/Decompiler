package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
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

@vz
public class pt {
    BlockingQueue<qa> a;
    ExecutorService b;
    LinkedHashMap<String, String> c = new LinkedHashMap();
    Map<String, px> d = new HashMap();
    String e;
    final Context f;
    final String g;
    private AtomicBoolean h;
    private File i;

    public pt(Context context, String str, String str2, Map<String, String> map) {
        this.f = context;
        this.g = str;
        this.e = str2;
        this.h = new AtomicBoolean(false);
        this.h.set(((Boolean) pr.W.c()).booleanValue());
        if (this.h.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.c.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.a = new ArrayBlockingQueue(30);
        this.b = Executors.newSingleThreadExecutor();
        this.b.execute(new Runnable(this) {
            final /* synthetic */ pt a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a();
            }
        });
        this.d.put("action", px.b);
        this.d.put("ad_format", px.b);
        this.d.put("e", px.c);
    }

    private void a() {
        while (true) {
            try {
                qa qaVar = (qa) this.a.take();
                String c = qaVar.c();
                if (!TextUtils.isEmpty(c)) {
                    a(a(this.c, qaVar.d()), c);
                }
            } catch (Throwable e) {
                zy.c("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private void a(File file, String str) {
        FileOutputStream fileOutputStream;
        Throwable e;
        if (file != null) {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                        return;
                    } catch (Throwable e2) {
                        zy.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                        return;
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        zy.c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e2);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                return;
                            } catch (Throwable e22) {
                                zy.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e22);
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
                                zy.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            }
                        }
                        throw e22;
                    }
                }
            } catch (IOException e5) {
                e22 = e5;
                fileOutputStream = null;
                zy.c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e22);
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
        zy.e("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
    }

    private void a(Map<String, String> map, String str) {
        String a = a(this.e, map, str);
        if (this.h.get()) {
            a(this.i, a);
        } else {
            v.e().a(this.f, this.g, a);
        }
    }

    public px a(String str) {
        px pxVar = (px) this.d.get(str);
        return pxVar != null ? pxVar : px.a;
    }

    String a(String str, Map<String, String> map, String str2) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
        stringBuilder.append("&").append("it").append("=").append(str2);
        return stringBuilder.toString();
    }

    Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        Map<String, String> linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, a(str).a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.c.put("e", TextUtils.join(",", list));
        }
    }

    public boolean a(qa qaVar) {
        return this.a.offer(qaVar);
    }
}
