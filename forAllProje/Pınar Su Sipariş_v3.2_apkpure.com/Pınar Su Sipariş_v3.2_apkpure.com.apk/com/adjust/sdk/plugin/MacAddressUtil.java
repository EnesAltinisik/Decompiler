package com.adjust.sdk.plugin;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class MacAddressUtil {
    public static String getMacAddress(Context context) {
        String rawMacAddress = getRawMacAddress(context);
        if (rawMacAddress == null) {
            return null;
        }
        return removeSpaceString(rawMacAddress.toUpperCase(Locale.US));
    }

    private static String getRawMacAddress(Context context) {
        String loadAddress = loadAddress("wlan0");
        if (loadAddress != null) {
            return loadAddress;
        }
        loadAddress = loadAddress("eth0");
        if (loadAddress != null) {
            return loadAddress;
        }
        try {
            loadAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (loadAddress != null) {
                return loadAddress;
            }
        } catch (Exception e) {
        }
        return null;
    }

    private static String loadAddress(String str) {
        try {
            String str2 = "/sys/class/net/" + str + "/address";
            StringBuilder stringBuilder = new StringBuilder(1000);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str2), 1024);
            char[] cArr = new char[1024];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read != -1) {
                    stringBuilder.append(String.valueOf(cArr, 0, read));
                } else {
                    bufferedReader.close();
                    return stringBuilder.toString();
                }
            }
        } catch (IOException e) {
            return null;
        }
    }

    private static String removeSpaceString(String str) {
        if (str == null) {
            return null;
        }
        CharSequence replaceAll = str.replaceAll("\\s", "");
        if (TextUtils.isEmpty(replaceAll)) {
            return null;
        }
        return replaceAll;
    }
}
