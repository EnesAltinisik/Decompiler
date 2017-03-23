package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class l {
    private static String a = null;
    private static final int b = Process.myPid();

    public static String a() {
        if (a == null) {
            a = a(b);
        }
        return a;
    }

    static String a(int i) {
        Closeable bufferedReader;
        Throwable th;
        String str = null;
        if (i > 0) {
            ThreadPolicy allowThreadDiskReads;
            try {
                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
                try {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    str = bufferedReader.readLine().trim();
                    i.a(bufferedReader);
                } catch (IOException e) {
                    i.a(bufferedReader);
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    i.a(bufferedReader);
                    throw th;
                }
            } catch (IOException e2) {
                bufferedReader = str;
                i.a(bufferedReader);
                return str;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = str;
                th = th4;
                i.a(bufferedReader);
                throw th;
            }
        }
        return str;
    }
}
