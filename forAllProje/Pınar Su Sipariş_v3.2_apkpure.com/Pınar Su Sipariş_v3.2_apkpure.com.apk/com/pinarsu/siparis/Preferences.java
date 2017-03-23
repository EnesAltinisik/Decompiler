package com.pinarsu.siparis;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.gson.Gson;
import com.pinarsu.siparis.model.data.ADRES;

public class Preferences {
    public static ADRES ADDRESS = null;
    private static final String HOME_LAST_ORDER_POPUP_VIEWED_KEY = "home_last_order_popup_viewed";
    public static boolean HOME_ORDER_POPUP_VIEWED = false;
    public static boolean LAST_ORDER_POPUP_VIEWED = false;
    private static final String LAST_ORDER_POPUP_VIEWED_KEY = "last_order_popup_viewed";
    public static String PHONE_NUMBER = "";
    private static final String PHONE_NUMBER_KEY = "phone_number";
    private static final String PREFERENCES_KEY = "preferences";
    public static String PUSH_TOKEN = "";
    private static final String PUSH_TOKEN_KEY = "gcm_token";
    private static final String USER_INFO_KEY = "user_info";
    public static boolean isFIRST_OPEN_APP = true;
    private static final String isFIRST_OPEN_APP_KEY = "tutorial";
    public static boolean isPUSH = true;
    private static final String isPUSH_KEY = "push";
    public static boolean isPinningAllowed = true;
    private SharedPreferences prefs;

    public Preferences(Context context) {
        this.prefs = context.getSharedPreferences(PREFERENCES_KEY, 0);
    }

    public void save() {
        Editor edit = this.prefs.edit();
        edit.putBoolean(isFIRST_OPEN_APP_KEY, isFIRST_OPEN_APP);
        edit.putBoolean(isPUSH_KEY, isPUSH);
        edit.putString(PUSH_TOKEN_KEY, PUSH_TOKEN);
        String str = "";
        Gson gson = new Gson();
        if (ADDRESS != null) {
            str = gson.toJson(ADDRESS);
        }
        edit.putString(USER_INFO_KEY, str);
        edit.putString(PHONE_NUMBER_KEY, PHONE_NUMBER);
        edit.putBoolean(LAST_ORDER_POPUP_VIEWED_KEY, LAST_ORDER_POPUP_VIEWED);
        edit.putBoolean(HOME_LAST_ORDER_POPUP_VIEWED_KEY, HOME_ORDER_POPUP_VIEWED);
        edit.commit();
        Log.d("MNTTAG", "save() isFIRST_OPEN_APP : " + isFIRST_OPEN_APP);
        Log.d("MNTTAG", "save() JSON_ADDRESS : " + str);
        Log.d("MNTTAG", "save() PHONE_NUMBER : " + PHONE_NUMBER);
    }

    public void read() {
        isFIRST_OPEN_APP = this.prefs.getBoolean(isFIRST_OPEN_APP_KEY, true);
        isPUSH = this.prefs.getBoolean(isPUSH_KEY, true);
        String string = this.prefs.getString(USER_INFO_KEY, "");
        if (string == null || string.isEmpty()) {
            ADDRESS = null;
        } else {
            try {
                ADDRESS = (ADRES) new Gson().fromJson(string, ADRES.class);
            } catch (Exception e) {
                ADDRESS = null;
            }
        }
        PHONE_NUMBER = this.prefs.getString(PHONE_NUMBER_KEY, "");
        PUSH_TOKEN = this.prefs.getString(PUSH_TOKEN_KEY, "");
        LAST_ORDER_POPUP_VIEWED = this.prefs.getBoolean(LAST_ORDER_POPUP_VIEWED_KEY, false);
        HOME_ORDER_POPUP_VIEWED = this.prefs.getBoolean(HOME_LAST_ORDER_POPUP_VIEWED_KEY, false);
        Log.d("MNTTAG", "read() isFIRST_OPEN_APP : " + isFIRST_OPEN_APP);
        Log.d("MNTTAG", "read() JSON_ADDRESS : " + string);
        Log.d("MNTTAG", "read() PHONE_NUMBER : " + PHONE_NUMBER);
        Log.d("MNTTAG", "read() PUSH_TOKEN : " + PUSH_TOKEN);
    }

    public void clear() {
        Editor edit = this.prefs.edit();
        edit.clear();
        edit.commit();
    }
}
