package com.google.android.gms.common.util;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class zzt {
    private static String zzauo = null;

    private static String zzcz(int i) {
        Throwable e;
        Throwable th;
        String str = null;
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                str = bufferedReader.readLine().trim();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable e2) {
                        Log.w("ProcessUtils", e2.getMessage(), e2);
                    }
                }
            } catch (IOException e3) {
                e2 = e3;
                try {
                    Log.e("ProcessUtils", e2.getMessage(), e2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable e22) {
                            Log.w("ProcessUtils", e22.getMessage(), e22);
                        }
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable e222) {
                            Log.w("ProcessUtils", e222.getMessage(), e222);
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e4) {
            e222 = e4;
            bufferedReader = str;
            Log.e("ProcessUtils", e222.getMessage(), e222);
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return str;
        } catch (Throwable e2222) {
            bufferedReader = str;
            th = e2222;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
        return str;
    }

    public static String zzvi() {
        return zzcz(Binder.getCallingPid());
    }

    public static String zzvj() {
        if (zzauo == null) {
            zzauo = zzcz(Process.myPid());
        }
        return zzauo;
    }
}
