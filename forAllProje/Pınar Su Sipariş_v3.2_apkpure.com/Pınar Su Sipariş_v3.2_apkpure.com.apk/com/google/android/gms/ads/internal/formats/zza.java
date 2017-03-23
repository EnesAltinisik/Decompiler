package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.zzig;
import java.util.List;

@zzig
public class zza {
    private static final int zzAp = Color.rgb(12, 174, 206);
    private static final int zzAq = Color.rgb(204, 204, 204);
    static final int zzAr = zzAq;
    static final int zzAs = zzAp;
    private final int mBackgroundColor;
    private final int mTextColor;
    private final String zzAt;
    private final List<Drawable> zzAu;
    private final int zzAv;
    private final int zzAw;

    public zza(String str, List<Drawable> list, Integer num, Integer num2, Integer num3, int i) {
        this.zzAt = str;
        this.zzAu = list;
        this.mBackgroundColor = num != null ? num.intValue() : zzAr;
        this.mTextColor = num2 != null ? num2.intValue() : zzAs;
        this.zzAv = num3 != null ? num3.intValue() : 12;
        this.zzAw = i;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public String getText() {
        return this.zzAt;
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    public int getTextSize() {
        return this.zzAv;
    }

    public List<Drawable> zzeJ() {
        return this.zzAu;
    }

    public int zzeK() {
        return this.zzAw;
    }
}
