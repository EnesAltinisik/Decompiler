package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo {
    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    public static final long UNKNOWN_DURATION = -1;
    private final String zzafp;
    private int zzafq;
    private String zzafr;
    private MediaMetadata zzafs;
    private long zzaft;
    private List<MediaTrack> zzafu;
    private TextTrackStyle zzafv;
    private JSONObject zzafw;

    public static class Builder {
        private final MediaInfo zzafx;

        public Builder(String str) throws IllegalArgumentException {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Content ID cannot be empty");
            }
            this.zzafx = new MediaInfo(str);
        }

        public MediaInfo build() throws IllegalArgumentException {
            this.zzafx.zzpW();
            return this.zzafx;
        }

        public Builder setContentType(String str) throws IllegalArgumentException {
            this.zzafx.setContentType(str);
            return this;
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.zzafx.setCustomData(jSONObject);
            return this;
        }

        public Builder setMediaTracks(List<MediaTrack> list) {
            this.zzafx.zzw(list);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediaMetadata) {
            this.zzafx.zza(mediaMetadata);
            return this;
        }

        public Builder setStreamDuration(long j) throws IllegalArgumentException {
            this.zzafx.zzz(j);
            return this;
        }

        public Builder setStreamType(int i) throws IllegalArgumentException {
            this.zzafx.setStreamType(i);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle textTrackStyle) {
            this.zzafx.setTextTrackStyle(textTrackStyle);
            return this;
        }
    }

    MediaInfo(String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        this.zzafp = str;
        this.zzafq = -1;
        this.zzaft = -1;
    }

    MediaInfo(JSONObject jSONObject) throws JSONException {
        int i = 0;
        this.zzafp = jSONObject.getString("contentId");
        String string = jSONObject.getString("streamType");
        if ("NONE".equals(string)) {
            this.zzafq = 0;
        } else if ("BUFFERED".equals(string)) {
            this.zzafq = 1;
        } else if ("LIVE".equals(string)) {
            this.zzafq = 2;
        } else {
            this.zzafq = -1;
        }
        this.zzafr = jSONObject.getString("contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            this.zzafs = new MediaMetadata(jSONObject2.getInt("metadataType"));
            this.zzafs.zzi(jSONObject2);
        }
        this.zzaft = -1;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!(Double.isNaN(optDouble) || Double.isInfinite(optDouble))) {
                this.zzaft = zzf.zzg(optDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            this.zzafu = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            while (i < jSONArray.length()) {
                this.zzafu.add(new MediaTrack(jSONArray.getJSONObject(i)));
                i++;
            }
        } else {
            this.zzafu = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.zzi(jSONObject3);
            this.zzafv = textTrackStyle;
        } else {
            this.zzafv = null;
        }
        this.zzafw = jSONObject.optJSONObject("customData");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if ((this.zzafw == null) != (mediaInfo.zzafw == null)) {
            return false;
        }
        if (this.zzafw != null && mediaInfo.zzafw != null && !zzp.zzf(this.zzafw, mediaInfo.zzafw)) {
            return false;
        }
        if (!(zzf.zza(this.zzafp, mediaInfo.zzafp) && this.zzafq == mediaInfo.zzafq && zzf.zza(this.zzafr, mediaInfo.zzafr) && zzf.zza(this.zzafs, mediaInfo.zzafs) && this.zzaft == mediaInfo.zzaft)) {
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

    public List<MediaTrack> getMediaTracks() {
        return this.zzafu;
    }

    public MediaMetadata getMetadata() {
        return this.zzafs;
    }

    public long getStreamDuration() {
        return this.zzaft;
    }

    public int getStreamType() {
        return this.zzafq;
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.zzafv;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzafp, Integer.valueOf(this.zzafq), this.zzafr, this.zzafs, Long.valueOf(this.zzaft), String.valueOf(this.zzafw));
    }

    void setContentType(String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        this.zzafr = str;
    }

    void setCustomData(JSONObject jSONObject) {
        this.zzafw = jSONObject;
    }

    void setStreamType(int i) throws IllegalArgumentException {
        if (i < -1 || i > 2) {
            throw new IllegalArgumentException("invalid stream type");
        }
        this.zzafq = i;
    }

    public void setTextTrackStyle(TextTrackStyle textTrackStyle) {
        this.zzafv = textTrackStyle;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj;
            jSONObject.put("contentId", this.zzafp);
            switch (this.zzafq) {
                case 1:
                    obj = "BUFFERED";
                    break;
                case 2:
                    obj = "LIVE";
                    break;
                default:
                    obj = "NONE";
                    break;
            }
            jSONObject.put("streamType", obj);
            if (this.zzafr != null) {
                jSONObject.put("contentType", this.zzafr);
            }
            if (this.zzafs != null) {
                jSONObject.put("metadata", this.zzafs.toJson());
            }
            if (this.zzaft <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", zzf.zzC(this.zzaft));
            }
            if (this.zzafu != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack toJson : this.zzafu) {
                    jSONArray.put(toJson.toJson());
                }
                jSONObject.put("tracks", jSONArray);
            }
            if (this.zzafv != null) {
                jSONObject.put("textTrackStyle", this.zzafv.toJson());
            }
            if (this.zzafw != null) {
                jSONObject.put("customData", this.zzafw);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    void zza(MediaMetadata mediaMetadata) {
        this.zzafs = mediaMetadata;
    }

    void zzpW() throws IllegalArgumentException {
        if (TextUtils.isEmpty(this.zzafp)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else if (TextUtils.isEmpty(this.zzafr)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else if (this.zzafq == -1) {
            throw new IllegalArgumentException("a valid stream type must be specified");
        }
    }

    void zzw(List<MediaTrack> list) {
        this.zzafu = list;
    }

    void zzz(long j) throws IllegalArgumentException {
        if (j >= 0 || j == -1) {
            this.zzaft = j;
            return;
        }
        throw new IllegalArgumentException("Invalid stream duration");
    }
}
