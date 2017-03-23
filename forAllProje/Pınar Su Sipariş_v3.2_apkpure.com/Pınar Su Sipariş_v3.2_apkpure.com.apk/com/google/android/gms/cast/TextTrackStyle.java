package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzp;
import com.google.android.gms.common.util.zzs;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle {
    public static final int COLOR_UNSPECIFIED = 0;
    public static final float DEFAULT_FONT_SCALE = 1.0f;
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int EDGE_TYPE_UNSPECIFIED = -1;
    public static final int FONT_FAMILY_CASUAL = 4;
    public static final int FONT_FAMILY_CURSIVE = 5;
    public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
    public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
    public static final int FONT_FAMILY_SANS_SERIF = 0;
    public static final int FONT_FAMILY_SERIF = 2;
    public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
    public static final int FONT_FAMILY_UNSPECIFIED = -1;
    public static final int FONT_STYLE_BOLD = 1;
    public static final int FONT_STYLE_BOLD_ITALIC = 3;
    public static final int FONT_STYLE_ITALIC = 2;
    public static final int FONT_STYLE_NORMAL = 0;
    public static final int FONT_STYLE_UNSPECIFIED = -1;
    public static final int WINDOW_TYPE_NONE = 0;
    public static final int WINDOW_TYPE_NORMAL = 1;
    public static final int WINDOW_TYPE_ROUNDED = 2;
    public static final int WINDOW_TYPE_UNSPECIFIED = -1;
    private int mBackgroundColor;
    private JSONObject zzafw;
    private float zzagQ;
    private int zzagR;
    private int zzagS;
    private int zzagT;
    private int zzagU;
    private int zzagV;
    private int zzagW;
    private String zzagX;
    private int zzagY;
    private int zzagZ;

    public TextTrackStyle() {
        clear();
    }

    private void clear() {
        this.zzagQ = DEFAULT_FONT_SCALE;
        this.zzagR = 0;
        this.mBackgroundColor = 0;
        this.zzagS = -1;
        this.zzagT = 0;
        this.zzagU = -1;
        this.zzagV = 0;
        this.zzagW = 0;
        this.zzagX = null;
        this.zzagY = -1;
        this.zzagZ = -1;
        this.zzafw = null;
    }

    @TargetApi(19)
    public static TextTrackStyle fromSystemSettings(Context context) {
        TextTrackStyle textTrackStyle = new TextTrackStyle();
        if (!zzs.zzve()) {
            return textTrackStyle;
        }
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        textTrackStyle.setFontScale(captioningManager.getFontScale());
        CaptionStyle userStyle = captioningManager.getUserStyle();
        textTrackStyle.setBackgroundColor(userStyle.backgroundColor);
        textTrackStyle.setForegroundColor(userStyle.foregroundColor);
        switch (userStyle.edgeType) {
            case 1:
                textTrackStyle.setEdgeType(1);
                break;
            case 2:
                textTrackStyle.setEdgeType(2);
                break;
            default:
                textTrackStyle.setEdgeType(0);
                break;
        }
        textTrackStyle.setEdgeColor(userStyle.edgeColor);
        Typeface typeface = userStyle.getTypeface();
        if (typeface != null) {
            if (Typeface.MONOSPACE.equals(typeface)) {
                textTrackStyle.setFontGenericFamily(1);
            } else if (Typeface.SANS_SERIF.equals(typeface)) {
                textTrackStyle.setFontGenericFamily(0);
            } else if (Typeface.SERIF.equals(typeface)) {
                textTrackStyle.setFontGenericFamily(2);
            } else {
                textTrackStyle.setFontGenericFamily(0);
            }
            boolean isBold = typeface.isBold();
            boolean isItalic = typeface.isItalic();
            if (isBold && isItalic) {
                textTrackStyle.setFontStyle(3);
            } else if (isBold) {
                textTrackStyle.setFontStyle(1);
            } else if (isItalic) {
                textTrackStyle.setFontStyle(2);
            } else {
                textTrackStyle.setFontStyle(0);
            }
        }
        return textTrackStyle;
    }

    private String zzS(int i) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))});
    }

    private int zzcA(String str) {
        int i = 0;
        if (str != null && str.length() == 9 && str.charAt(i) == '#') {
            try {
                i = Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        if ((this.zzafw == null) != (textTrackStyle.zzafw == null)) {
            return false;
        }
        if (this.zzafw != null && textTrackStyle.zzafw != null && !zzp.zzf(this.zzafw, textTrackStyle.zzafw)) {
            return false;
        }
        if (!(this.zzagQ == textTrackStyle.zzagQ && this.zzagR == textTrackStyle.zzagR && this.mBackgroundColor == textTrackStyle.mBackgroundColor && this.zzagS == textTrackStyle.zzagS && this.zzagT == textTrackStyle.zzagT && this.zzagU == textTrackStyle.zzagU && this.zzagW == textTrackStyle.zzagW && zzf.zza(this.zzagX, textTrackStyle.zzagX) && this.zzagY == textTrackStyle.zzagY && this.zzagZ == textTrackStyle.zzagZ)) {
            z = false;
        }
        return z;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public JSONObject getCustomData() {
        return this.zzafw;
    }

    public int getEdgeColor() {
        return this.zzagT;
    }

    public int getEdgeType() {
        return this.zzagS;
    }

    public String getFontFamily() {
        return this.zzagX;
    }

    public int getFontGenericFamily() {
        return this.zzagY;
    }

    public float getFontScale() {
        return this.zzagQ;
    }

    public int getFontStyle() {
        return this.zzagZ;
    }

    public int getForegroundColor() {
        return this.zzagR;
    }

    public int getWindowColor() {
        return this.zzagV;
    }

    public int getWindowCornerRadius() {
        return this.zzagW;
    }

    public int getWindowType() {
        return this.zzagU;
    }

    public int hashCode() {
        return zzz.hashCode(Float.valueOf(this.zzagQ), Integer.valueOf(this.zzagR), Integer.valueOf(this.mBackgroundColor), Integer.valueOf(this.zzagS), Integer.valueOf(this.zzagT), Integer.valueOf(this.zzagU), Integer.valueOf(this.zzagV), Integer.valueOf(this.zzagW), this.zzagX, Integer.valueOf(this.zzagY), Integer.valueOf(this.zzagZ), this.zzafw);
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public void setCustomData(JSONObject jSONObject) {
        this.zzafw = jSONObject;
    }

    public void setEdgeColor(int i) {
        this.zzagT = i;
    }

    public void setEdgeType(int i) {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("invalid edgeType");
        }
        this.zzagS = i;
    }

    public void setFontFamily(String str) {
        this.zzagX = str;
    }

    public void setFontGenericFamily(int i) {
        if (i < 0 || i > 6) {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        }
        this.zzagY = i;
    }

    public void setFontScale(float f) {
        this.zzagQ = f;
    }

    public void setFontStyle(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("invalid fontStyle");
        }
        this.zzagZ = i;
    }

    public void setForegroundColor(int i) {
        this.zzagR = i;
    }

    public void setWindowColor(int i) {
        this.zzagV = i;
    }

    public void setWindowCornerRadius(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("invalid windowCornerRadius");
        }
        this.zzagW = i;
    }

    public void setWindowType(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid windowType");
        }
        this.zzagU = i;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", (double) this.zzagQ);
            if (this.zzagR != 0) {
                jSONObject.put("foregroundColor", zzS(this.zzagR));
            }
            if (this.mBackgroundColor != 0) {
                jSONObject.put("backgroundColor", zzS(this.mBackgroundColor));
            }
            switch (this.zzagS) {
                case 0:
                    jSONObject.put("edgeType", "NONE");
                    break;
                case 1:
                    jSONObject.put("edgeType", "OUTLINE");
                    break;
                case 2:
                    jSONObject.put("edgeType", "DROP_SHADOW");
                    break;
                case 3:
                    jSONObject.put("edgeType", "RAISED");
                    break;
                case 4:
                    jSONObject.put("edgeType", "DEPRESSED");
                    break;
            }
            if (this.zzagT != 0) {
                jSONObject.put("edgeColor", zzS(this.zzagT));
            }
            switch (this.zzagU) {
                case 0:
                    jSONObject.put("windowType", "NONE");
                    break;
                case 1:
                    jSONObject.put("windowType", "NORMAL");
                    break;
                case 2:
                    jSONObject.put("windowType", "ROUNDED_CORNERS");
                    break;
            }
            if (this.zzagV != 0) {
                jSONObject.put("windowColor", zzS(this.zzagV));
            }
            if (this.zzagU == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.zzagW);
            }
            if (this.zzagX != null) {
                jSONObject.put("fontFamily", this.zzagX);
            }
            switch (this.zzagY) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            switch (this.zzagZ) {
                case 0:
                    jSONObject.put("fontStyle", "NORMAL");
                    break;
                case 1:
                    jSONObject.put("fontStyle", "BOLD");
                    break;
                case 2:
                    jSONObject.put("fontStyle", "ITALIC");
                    break;
                case 3:
                    jSONObject.put("fontStyle", "BOLD_ITALIC");
                    break;
            }
            if (this.zzafw != null) {
                jSONObject.put("customData", this.zzafw);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public void zzi(JSONObject jSONObject) throws JSONException {
        String string;
        clear();
        this.zzagQ = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.zzagR = zzcA(jSONObject.optString("foregroundColor"));
        this.mBackgroundColor = zzcA(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.zzagS = 0;
            } else if ("OUTLINE".equals(string)) {
                this.zzagS = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.zzagS = 2;
            } else if ("RAISED".equals(string)) {
                this.zzagS = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.zzagS = 4;
            }
        }
        this.zzagT = zzcA(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            string = jSONObject.getString("windowType");
            if ("NONE".equals(string)) {
                this.zzagU = 0;
            } else if ("NORMAL".equals(string)) {
                this.zzagU = 1;
            } else if ("ROUNDED_CORNERS".equals(string)) {
                this.zzagU = 2;
            }
        }
        this.zzagV = zzcA(jSONObject.optString("windowColor"));
        if (this.zzagU == 2) {
            this.zzagW = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.zzagX = jSONObject.optString("fontFamily", null);
        if (jSONObject.has("fontGenericFamily")) {
            string = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string)) {
                this.zzagY = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string)) {
                this.zzagY = 1;
            } else if ("SERIF".equals(string)) {
                this.zzagY = 2;
            } else if ("MONOSPACED_SERIF".equals(string)) {
                this.zzagY = 3;
            } else if ("CASUAL".equals(string)) {
                this.zzagY = 4;
            } else if ("CURSIVE".equals(string)) {
                this.zzagY = 5;
            } else if ("SMALL_CAPITALS".equals(string)) {
                this.zzagY = 6;
            }
        }
        if (jSONObject.has("fontStyle")) {
            string = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string)) {
                this.zzagZ = 0;
            } else if ("BOLD".equals(string)) {
                this.zzagZ = 1;
            } else if ("ITALIC".equals(string)) {
                this.zzagZ = 2;
            } else if ("BOLD_ITALIC".equals(string)) {
                this.zzagZ = 3;
            }
        }
        this.zzafw = jSONObject.optJSONObject("customData");
    }
}
