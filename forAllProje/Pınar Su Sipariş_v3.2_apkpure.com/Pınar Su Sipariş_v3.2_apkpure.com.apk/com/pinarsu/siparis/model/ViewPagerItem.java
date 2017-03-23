package com.pinarsu.siparis.model;

import com.pinarsu.siparis.ui.fragment.ViewPagerFragment.IMAGE_TYPE;
import java.io.Serializable;

public class ViewPagerItem implements Serializable {
    public int imageDrawable;
    public String imageUrl;
    public String title;
    public IMAGE_TYPE type;

    public ViewPagerItem(String str, String str2, int i, IMAGE_TYPE image_type) {
        this.title = str;
        this.imageUrl = str2;
        this.imageDrawable = i;
        this.type = image_type;
    }
}
