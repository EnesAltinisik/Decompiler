package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzp;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaQueueItem {
    public static final double DEFAULT_PLAYBACK_DURATION = Double.POSITIVE_INFINITY;
    public static final int INVALID_ITEM_ID = 0;
    private MediaInfo zzafF;
    private int zzafG;
    private boolean zzafH;
    private double zzafI;
    private double zzafJ;
    private double zzafK;
    private long[] zzafL;
    private JSONObject zzafw;

    public static class Builder {
        private final MediaQueueItem zzafM;

        public Builder(MediaInfo mediaInfo) throws IllegalArgumentException {
            this.zzafM = new MediaQueueItem(mediaInfo);
        }

        public Builder(MediaQueueItem mediaQueueItem) throws IllegalArgumentException {
            this.zzafM = new MediaQueueItem();
        }

        public Builder(JSONObject jSONObject) throws JSONException {
            this.zzafM = new MediaQueueItem(jSONObject);
        }

        public MediaQueueItem build() {
            this.zzafM.zzpW();
            return this.zzafM;
        }

        public Builder clearItemId() {
            this.zzafM.zzbh(0);
            return this;
        }

        public Builder setActiveTrackIds(long[] jArr) {
            this.zzafM.zza(jArr);
            return this;
        }

        public Builder setAutoplay(boolean z) {
            this.zzafM.zzad(z);
            return this;
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.zzafM.setCustomData(jSONObject);
            return this;
        }

        public Builder setPlaybackDuration(double d) {
            this.zzafM.zzd(d);
            return this;
        }

        public Builder setPreloadTime(double d) throws IllegalArgumentException {
            this.zzafM.zze(d);
            return this;
        }

        public Builder setStartTime(double d) throws IllegalArgumentException {
            this.zzafM.zzc(d);
            return this;
        }
    }

    private MediaQueueItem(MediaInfo mediaInfo) throws IllegalArgumentException {
        this.zzafG = 0;
        this.zzafH = true;
        this.zzafJ = DEFAULT_PLAYBACK_DURATION;
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.zzafF = mediaInfo;
    }

    private MediaQueueItem(MediaQueueItem mediaQueueItem) throws IllegalArgumentException {
        this.zzafG = 0;
        this.zzafH = true;
        this.zzafJ = DEFAULT_PLAYBACK_DURATION;
        this.zzafF = mediaQueueItem.getMedia();
        if (this.zzafF == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.zzafG = mediaQueueItem.getItemId();
        this.zzafH = mediaQueueItem.getAutoplay();
        this.zzafI = mediaQueueItem.getStartTime();
        this.zzafJ = mediaQueueItem.getPlaybackDuration();
        this.zzafK = mediaQueueItem.getPreloadTime();
        this.zzafL = mediaQueueItem.getActiveTrackIds();
        this.zzafw = mediaQueueItem.getCustomData();
    }

    MediaQueueItem(JSONObject jSONObject) throws JSONException {
        this.zzafG = 0;
        this.zzafH = true;
        this.zzafJ = DEFAULT_PLAYBACK_DURATION;
        zzj(jSONObject);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        if ((this.zzafw == null) != (mediaQueueItem.zzafw == null)) {
            return false;
        }
        if (this.zzafw != null && mediaQueueItem.zzafw != null && !zzp.zzf(this.zzafw, mediaQueueItem.zzafw)) {
            return false;
        }
        if (!(zzf.zza(this.zzafF, mediaQueueItem.zzafF) && this.zzafG == mediaQueueItem.zzafG && this.zzafH == mediaQueueItem.zzafH && this.zzafI == mediaQueueItem.zzafI && this.zzafJ == mediaQueueItem.zzafJ && this.zzafK == mediaQueueItem.zzafK && zzf.zza(this.zzafL, mediaQueueItem.zzafL))) {
            z = false;
        }
        return z;
    }

    public long[] getActiveTrackIds() {
        return this.zzafL;
    }

    public boolean getAutoplay() {
        return this.zzafH;
    }

    public JSONObject getCustomData() {
        return this.zzafw;
    }

    public int getItemId() {
        return this.zzafG;
    }

    public MediaInfo getMedia() {
        return this.zzafF;
    }

    public double getPlaybackDuration() {
        return this.zzafJ;
    }

    public double getPreloadTime() {
        return this.zzafK;
    }

    public double getStartTime() {
        return this.zzafI;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzafF, Integer.valueOf(this.zzafG), Boolean.valueOf(this.zzafH), Double.valueOf(this.zzafI), Double.valueOf(this.zzafJ), Double.valueOf(this.zzafK), this.zzafL, String.valueOf(this.zzafw));
    }

    void setCustomData(JSONObject jSONObject) {
        this.zzafw = jSONObject;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("media", this.zzafF.toJson());
            if (this.zzafG != 0) {
                jSONObject.put("itemId", this.zzafG);
            }
            jSONObject.put("autoplay", this.zzafH);
            jSONObject.put("startTime", this.zzafI);
            if (this.zzafJ != DEFAULT_PLAYBACK_DURATION) {
                jSONObject.put("playbackDuration", this.zzafJ);
            }
            jSONObject.put("preloadTime", this.zzafK);
            if (this.zzafL != null) {
                JSONArray jSONArray = new JSONArray();
                for (long put : this.zzafL) {
                    jSONArray.put(put);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            if (this.zzafw != null) {
                jSONObject.put("customData", this.zzafw);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    void zza(long[] jArr) {
        this.zzafL = jArr;
    }

    void zzad(boolean z) {
        this.zzafH = z;
    }

    void zzbh(int i) {
        this.zzafG = i;
    }

    void zzc(double d) throws IllegalArgumentException {
        if (Double.isNaN(d) || d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        this.zzafI = d;
    }

    void zzd(double d) throws IllegalArgumentException {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        this.zzafJ = d;
    }

    void zze(double d) throws IllegalArgumentException {
        if (Double.isNaN(d) || d < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
        }
        this.zzafK = d;
    }

    public boolean zzj(JSONObject jSONObject) throws JSONException {
        boolean z;
        boolean z2;
        double d;
        long[] jArr;
        if (jSONObject.has("media")) {
            this.zzafF = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId")) {
            int i = jSONObject.getInt("itemId");
            if (this.zzafG != i) {
                this.zzafG = i;
                z = true;
            }
        }
        if (jSONObject.has("autoplay")) {
            z2 = jSONObject.getBoolean("autoplay");
            if (this.zzafH != z2) {
                this.zzafH = z2;
                z = true;
            }
        }
        if (jSONObject.has("startTime")) {
            d = jSONObject.getDouble("startTime");
            if (Math.abs(d - this.zzafI) > 1.0E-7d) {
                this.zzafI = d;
                z = true;
            }
        }
        if (jSONObject.has("playbackDuration")) {
            d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.zzafJ) > 1.0E-7d) {
                this.zzafJ = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            d = jSONObject.getDouble("preloadTime");
            if (Math.abs(d - this.zzafK) > 1.0E-7d) {
                this.zzafK = d;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            int i2;
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (i2 = 0; i2 < length; i2++) {
                jArr2[i2] = jSONArray.getLong(i2);
            }
            if (this.zzafL == null) {
                jArr = jArr2;
                z2 = true;
            } else if (this.zzafL.length != length) {
                jArr = jArr2;
                z2 = true;
            } else {
                for (i2 = 0; i2 < length; i2++) {
                    if (this.zzafL[i2] != jArr2[i2]) {
                        jArr = jArr2;
                        z2 = true;
                        break;
                    }
                }
                long[] jArr3 = jArr2;
                z2 = false;
                jArr = jArr3;
            }
        } else {
            z2 = false;
            jArr = null;
        }
        if (z2) {
            this.zzafL = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.zzafw = jSONObject.getJSONObject("customData");
        return true;
    }

    void zzpW() throws IllegalArgumentException {
        if (this.zzafF == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (Double.isNaN(this.zzafI) || this.zzafI < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(this.zzafJ)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (Double.isNaN(this.zzafK) || this.zzafK < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }
}
