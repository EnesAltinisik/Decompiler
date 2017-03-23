package com.pinarsu.siparis.tools;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.app.ActivityCompat;
import android.support.v4.b.b;

public class PermissionHelper {
    private final int REQUEST_CODE = 111;
    private Activity activity;

    public PermissionHelper(Activity activity) {
        this.activity = activity;
    }

    public boolean checkPermissionGranted(String[] strArr) {
        for (String checkSelfPermission : strArr) {
            if (b.checkSelfPermission(this.activity, checkSelfPermission) != 0) {
                return false;
            }
        }
        return true;
    }

    public void requestPermissions(String[] strArr) {
        ActivityCompat.requestPermissions(this.activity, strArr, 111);
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAndroidVersion6AndGreater() {
        if (VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }
}
