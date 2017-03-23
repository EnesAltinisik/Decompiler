package com.pinarsu.siparis.model;

public class PushServiceSaveTokenItem {
    private String devicetoken;
    private int isIOS = 0;
    private String phone = "";
    private String uniqueid;

    public PushServiceSaveTokenItem(String str, String str2, String str3) {
        this.uniqueid = str;
        this.devicetoken = str2;
        this.phone = str3;
    }
}
