package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zznf {
    private static final zzl zzaeJ = new zzl("MetadataUtils");
    private static final String[] zzaji = new String[]{"Z", "+hh", "+hhmm", "+hh:mm"};
    private static final String zzajj;

    static {
        String valueOf = String.valueOf("yyyyMMdd'T'HHmmss");
        String valueOf2 = String.valueOf(zzaji[0]);
        zzajj = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String zza(Calendar calendar) {
        if (calendar == null) {
            zzaeJ.zzb("Calendar object cannot be null", new Object[0]);
            return null;
        }
        String str = zzajj;
        if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar.get(13) == 0) {
            str = "yyyyMMdd";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        str = simpleDateFormat.format(calendar.getTime());
        return str.endsWith("+0000") ? str.replace("+0000", zzaji[0]) : str;
    }

    public static void zza(List<WebImage> list, JSONObject jSONObject) {
        try {
            list.clear();
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    list.add(new WebImage(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException e) {
                }
            }
        } catch (JSONException e2) {
        }
    }

    public static void zza(JSONObject jSONObject, List<WebImage> list) {
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (WebImage toJson : list) {
                jSONArray.put(toJson.toJson());
            }
            try {
                jSONObject.put("images", jSONArray);
            } catch (JSONException e) {
            }
        }
    }

    public static Calendar zzcL(String str) {
        if (TextUtils.isEmpty(str)) {
            zzaeJ.zzb("Input string is empty or null", new Object[0]);
            return null;
        }
        String zzcM = zzcM(str);
        if (TextUtils.isEmpty(zzcM)) {
            zzaeJ.zzb("Invalid date format", new Object[0]);
            return null;
        }
        String zzcN = zzcN(str);
        String str2 = "yyyyMMdd";
        if (!TextUtils.isEmpty(zzcN)) {
            str2 = String.valueOf(zzcM);
            zzcM = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(zzcN).length()).append(str2).append("T").append(zzcN).toString();
            str2 = zzcN.length() == "HHmmss".length() ? "yyyyMMdd'T'HHmmss" : zzajj;
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(zzcM));
            return instance;
        } catch (ParseException e) {
            zzaeJ.zzb("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    private static String zzcM(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            zzaeJ.zzb("Input string is empty or null", new Object[0]);
        } else {
            try {
                str2 = str.substring(0, "yyyyMMdd".length());
            } catch (IndexOutOfBoundsException e) {
                zzaeJ.zze("Error extracting the date: %s", e.getMessage());
            }
        }
        return str2;
    }

    private static String zzcN(String str) {
        if (TextUtils.isEmpty(str)) {
            zzaeJ.zzb("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != "yyyyMMdd".length()) {
            zzaeJ.zzb("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == "HHmmss".length()) {
                return substring;
            }
            switch (substring.charAt("HHmmss".length())) {
                case '+':
                case '-':
                    return zzcO(substring) ? substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2") : null;
                case 'Z':
                    if (substring.length() != "HHmmss".length() + zzaji[0].length()) {
                        return null;
                    }
                    substring = String.valueOf(substring.substring(0, substring.length() - 1));
                    String valueOf = String.valueOf("+0000");
                    return valueOf.length() != 0 ? substring.concat(valueOf) : new String(substring);
                default:
                    return null;
            }
        } catch (IndexOutOfBoundsException e) {
            zzaeJ.zzb("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }

    private static boolean zzcO(String str) {
        int length = str.length();
        int length2 = "HHmmss".length();
        return length == zzaji[1].length() + length2 || length == zzaji[2].length() + length2 || length == length2 + zzaji[3].length();
    }
}
