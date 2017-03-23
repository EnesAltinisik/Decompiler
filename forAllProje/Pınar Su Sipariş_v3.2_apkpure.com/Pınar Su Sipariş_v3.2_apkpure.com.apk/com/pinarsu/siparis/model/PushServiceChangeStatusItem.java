package com.pinarsu.siparis.model;

public class PushServiceChangeStatusItem {
    private String devicetoken;
    private int isActive = 1;

    public PushServiceChangeStatusItem(String str, int i) {
        this.devicetoken = str;
        this.isActive = i;
    }
}
