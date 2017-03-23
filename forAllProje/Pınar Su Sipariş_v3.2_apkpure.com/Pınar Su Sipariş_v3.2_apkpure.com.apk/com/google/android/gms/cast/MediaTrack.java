package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzp;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack {
    public static final int SUBTYPE_CAPTIONS = 2;
    public static final int SUBTYPE_CHAPTERS = 4;
    public static final int SUBTYPE_DESCRIPTIONS = 3;
    public static final int SUBTYPE_METADATA = 5;
    public static final int SUBTYPE_NONE = 0;
    public static final int SUBTYPE_SUBTITLES = 1;
    public static final int SUBTYPE_UNKNOWN = -1;
    public static final int TYPE_AUDIO = 2;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIDEO = 3;
    private String mName;
    private String zzVp;
    private long zzaaQ;
    private String zzafp;
    private String zzafr;
    private JSONObject zzafw;
    private int zzagd;
    private int zzage;

    public static class Builder {
        private final MediaTrack zzagf;

        public Builder(long j, int i) throws IllegalArgumentException {
            this.zzagf = new MediaTrack(j, i);
        }

        public MediaTrack build() {
            return this.zzagf;
        }

        public Builder setContentId(String str) {
            this.zzagf.setContentId(str);
            return this;
        }

        public Builder setContentType(String str) {
            this.zzagf.setContentType(str);
            return this;
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.zzagf.setCustomData(jSONObject);
            return this;
        }

        public Builder setLanguage(String str) {
            this.zzagf.setLanguage(str);
            return this;
        }

        public Builder setLanguage(Locale locale) {
            this.zzagf.setLanguage(zzf.zzb(locale));
            return this;
        }

        public Builder setName(String str) {
            this.zzagf.setName(str);
            return this;
        }

        public Builder setSubtype(int i) throws IllegalArgumentException {
            this.zzagf.zzbl(i);
            return this;
        }
    }

    MediaTrack(long j, int i) throws IllegalArgumentException {
        clear();
        this.zzaaQ = j;
        if (i <= 0 || i > 3) {
            throw new IllegalArgumentException("invalid type " + i);
        }
        this.zzagd = i;
    }

    MediaTrack(JSONObject jSONObject) throws JSONException {
        zzi(jSONObject);
    }

    private void clear() {
        this.zzaaQ = 0;
        this.zzagd = 0;
        this.zzafp = null;
        this.mName = null;
        this.zzVp = null;
        this.zzage = -1;
        this.zzafw = null;
    }

    private void zzi(JSONObject jSONObject) throws JSONException {
        clear();
        this.zzaaQ = jSONObject.getLong("trackId");
        String string = jSONObject.getString("type");
        if ("TEXT".equals(string)) {
            this.zzagd = 1;
        } else if ("AUDIO".equals(string)) {
            this.zzagd = 2;
        } else if ("VIDEO".equals(string)) {
            this.zzagd = 3;
        } else {
            String str = "invalid type: ";
            string = String.valueOf(string);
            throw new JSONException(string.length() != 0 ? str.concat(string) : new String(str));
        }
        this.zzafp = jSONObject.optString("trackContentId", null);
        this.zzafr = jSONObject.optString("trackContentType", null);
        this.mName = jSONObject.optString("name", null);
        this.zzVp = jSONObject.optString("language", null);
        if (jSONObject.has("subtype")) {
            string = jSONObject.getString("subtype");
            if ("SUBTITLES".equals(string)) {
                this.zzage = 1;
            } else if ("CAPTIONS".equals(string)) {
                this.zzage = 2;
            } else if ("DESCRIPTIONS".equals(string)) {
                this.zzage = 3;
            } else if ("CHAPTERS".equals(string)) {
                this.zzage = 4;
            } else if ("METADATA".equals(string)) {
                this.zzage = 5;
            } else {
                str = "invalid subtype: ";
                string = String.valueOf(string);
                throw new JSONException(string.length() != 0 ? str.concat(string) : new String(str));
            }
        }
        this.zzage = 0;
        this.zzafw = jSONObject.optJSONObject("customData");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        if ((this.zzafw == null) != (mediaTrack.zzafw == null)) {
            return false;
        }
        if (this.zzafw != null && mediaTrack.zzafw != null && !zzp.zzf(this.zzafw, mediaTrack.zzafw)) {
            return false;
        }
        if (!(this.zzaaQ == mediaTrack.zzaaQ && this.zzagd == mediaTrack.zzagd && zzf.zza(this.zzafp, mediaTrack.zzafp) && zzf.zza(this.zzafr, mediaTrack.zzafr) && zzf.zza(this.mName, mediaTrack.mName) && zzf.zza(this.zzVp, mediaTrack.zzVp) && this.zzage == mediaTrack.zzage)) {
            z = false;
        }
        return z;
    }

    public String getContentId() {
        return this.zzafp;
    }

    public String getContentType() {
        return this.zzafr;
    }

    public JSONObject getCustomData() {
        return this.zzafw;
    }

    public long getId() {
        return this.zzaaQ;
    }

    public String getLanguage() {
        return this.zzVp;
    }

    public String getName() {
        return this.mName;
    }

    public int getSubtype() {
        return this.zzage;
    }

    public int getType() {
        return this.zzagd;
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzaaQ), Integer.valueOf(this.zzagd), this.zzafp, this.zzafr, this.mName, this.zzVp, Integer.valueOf(this.zzage), this.zzafw);
    }

    public void setContentId(String str) {
        this.zzafp = str;
    }

    public void setContentType(String str) {
        this.zzafr = str;
    }

    void setCustomData(JSONObject jSONObject) {
        this.zzafw = jSONObject;
    }

    void setLanguage(String str) {
        this.zzVp = str;
    }

    void setName(String str) {
        this.mName = str;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.zzaaQ);
            switch (this.zzagd) {
                case 1:
                    jSONObject.put("type", "TEXT");
                    break;
                case 2:
                    jSONObject.put("type", "AUDIO");
                    break;
                case 3:
                    jSONObject.put("type", "VIDEO");
                    break;
            }
            if (this.zzafp != null) {
                jSONObject.put("trackContentId", this.zzafp);
            }
            if (this.zzafr != null) {
                jSONObject.put("trackContentType", this.zzafr);
            }
            if (this.mName != null) {
                jSONObject.put("name", this.mName);
            }
            if (!TextUtils.isEmpty(this.zzVp)) {
                jSONObject.put("language", this.zzVp);
            }
            switch (this.zzage) {
                case 1:
                    jSONObject.put("subtype", "SUBTITLES");
                    break;
                case 2:
                    jSONObject.put("subtype", "CAPTIONS");
                    break;
                case 3:
                    jSONObject.put("subtype", "DESCRIPTIONS");
                    break;
                case 4:
                    jSONObject.put("subtype", "CHAPTERS");
                    break;
                case 5:
                    jSONObject.put("subtype", "METADATA");
                    break;
            }
            if (this.zzafw != null) {
                jSONObject.put("customData", this.zzafw);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    void zzbl(int i) throws IllegalArgumentException {
        if (i <= -1 || i > 5) {
            throw new IllegalArgumentException("invalid subtype " + i);
        } else if (i == 0 || this.zzagd == 1) {
            this.zzage = i;
        } else {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        }
    }
}
