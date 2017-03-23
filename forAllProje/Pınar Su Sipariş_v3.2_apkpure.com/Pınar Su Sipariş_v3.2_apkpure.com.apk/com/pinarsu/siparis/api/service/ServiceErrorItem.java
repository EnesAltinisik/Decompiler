package com.pinarsu.siparis.api.service;

public class ServiceErrorItem {
    public String detail;
    public boolean isCrashed = true;
    public String title;

    public ServiceErrorItem(String str, String str2) {
        this.title = str;
        this.detail = str2;
    }
}
