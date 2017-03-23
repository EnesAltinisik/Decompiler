package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.ArrayList;
import java.util.List;

public class Line implements Text {
    private LineBoxParcel zzbym;
    private List<Element> zzbyn;

    Line(LineBoxParcel lineBoxParcel) {
        this.zzbym = lineBoxParcel;
    }

    public float getAngle() {
        return this.zzbym.zzbyx.zzbyv;
    }

    public Rect getBoundingBox() {
        return a.a((Text) this);
    }

    public List<? extends Text> getComponents() {
        return zzMZ();
    }

    public Point[] getCornerPoints() {
        return a.a(this.zzbym.zzbyx);
    }

    public String getLanguage() {
        return this.zzbym.zzbyq;
    }

    public String getValue() {
        return this.zzbym.zzbyA;
    }

    public boolean isVertical() {
        return this.zzbym.zzbyD;
    }

    List<Element> zzMZ() {
        if (this.zzbym.zzbyw.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzbyn == null) {
            this.zzbyn = new ArrayList(this.zzbym.zzbyw.length);
            for (WordBoxParcel element : this.zzbym.zzbyw) {
                this.zzbyn.add(new Element(element));
            }
        }
        return this.zzbyn;
    }
}
