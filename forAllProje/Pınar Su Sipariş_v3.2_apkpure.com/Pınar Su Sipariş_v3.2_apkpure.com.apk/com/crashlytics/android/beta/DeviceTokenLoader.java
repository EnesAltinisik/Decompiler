package com.crashlytics.android.beta;

import a.a.a.a.a.a.d;
import a.a.a.a.c;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DeviceTokenLoader implements d<String> {
    private static final String DIRFACTOR_DEVICE_TOKEN_PREFIX = "assets/com.crashlytics.android.beta/dirfactor-device-token=";

    public String load(Context context) throws Exception {
        long nanoTime = System.nanoTime();
        String str = "";
        ZipInputStream zipInputStream = null;
        try {
            zipInputStream = getZipInputStreamOfAppApkFrom(context);
            str = determineDeviceToken(zipInputStream);
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (Throwable e) {
                    c.h().e(Beta.TAG, "Failed to close the APK file", e);
                }
            }
        } catch (Throwable e2) {
            c.h().e(Beta.TAG, "Failed to find this app in the PackageManager", e2);
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (Throwable e22) {
                    c.h().e(Beta.TAG, "Failed to close the APK file", e22);
                }
            }
        } catch (Throwable e222) {
            c.h().e(Beta.TAG, "Failed to find the APK file", e222);
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (Throwable e2222) {
                    c.h().e(Beta.TAG, "Failed to close the APK file", e2222);
                }
            }
        } catch (Throwable e22222) {
            c.h().e(Beta.TAG, "Failed to read the APK file", e22222);
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (Throwable e222222) {
                    c.h().e(Beta.TAG, "Failed to close the APK file", e222222);
                }
            }
        } catch (Throwable th) {
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (Throwable e2222222) {
                    c.h().e(Beta.TAG, "Failed to close the APK file", e2222222);
                }
            }
        }
        c.h().a(Beta.TAG, "Beta device token load took " + (((double) (System.nanoTime() - nanoTime)) / 1000000.0d) + "ms");
        return str;
    }

    ZipInputStream getZipInputStreamOfAppApkFrom(Context context) throws NameNotFoundException, FileNotFoundException {
        return new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir));
    }

    String determineDeviceToken(ZipInputStream zipInputStream) throws IOException {
        String name;
        do {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return "";
            }
            name = nextEntry.getName();
        } while (!name.startsWith(DIRFACTOR_DEVICE_TOKEN_PREFIX));
        return name.substring(DIRFACTOR_DEVICE_TOKEN_PREFIX.length(), name.length() - 1);
    }
}
