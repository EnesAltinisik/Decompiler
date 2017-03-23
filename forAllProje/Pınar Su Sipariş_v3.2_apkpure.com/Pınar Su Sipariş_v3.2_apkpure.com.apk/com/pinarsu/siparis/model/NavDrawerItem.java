package com.pinarsu.siparis.model;

public class NavDrawerItem {
    public Integer drawableId;
    public boolean isActive;

    public NavDrawerItem(int i, boolean z) {
        this.drawableId = Integer.valueOf(i);
        this.isActive = z;
    }
}
