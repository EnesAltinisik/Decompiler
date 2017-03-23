package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.ArrayList;
import java.util.List;

public class Element implements Text {
    private WordBoxParcel zzbyl;

    Element(WordBoxParcel wordBoxParcel) {
        this.zzbyl = wordBoxParcel;
    }

    public Rect getBoundingBox() {
        return a.a((Text) this);
    }

    public List<? extends Text> getComponents() {
        return new ArrayList();
    }

    public Point[] getCornerPoints() {
        return a.a(this.zzbyl.zzbyx);
    }

    public String getLanguage() {
        return this.zzbyl.zzbyq;
    }

    public String getValue() {
        return this.zzbyl.zzbyA;
    }
}
