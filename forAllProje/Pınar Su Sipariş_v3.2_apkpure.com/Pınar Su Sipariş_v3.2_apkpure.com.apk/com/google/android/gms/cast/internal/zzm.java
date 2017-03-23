package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzm extends zzc {
    private static final String NAMESPACE = zzf.zzcF("com.google.cast.media");
    private final List<zzp> zzahc = new ArrayList();
    private long zzaiO;
    private MediaStatus zzaiP;
    private zza zzaiQ;
    private final zzp zzaiR = new zzp(86400000);
    private final zzp zzaiS = new zzp(86400000);
    private final zzp zzaiT = new zzp(86400000);
    private final zzp zzaiU = new zzp(86400000);
    private final zzp zzaiV = new zzp(86400000);
    private final zzp zzaiW = new zzp(86400000);
    private final zzp zzaiX = new zzp(86400000);
    private final zzp zzaiY = new zzp(86400000);
    private final zzp zzaiZ = new zzp(86400000);
    private final zzp zzaja = new zzp(86400000);
    private final zzp zzajb = new zzp(86400000);
    private final zzp zzajc = new zzp(86400000);
    private final zzp zzajd = new zzp(86400000);
    private final zzp zzaje = new zzp(86400000);

    public interface zza {
        void onMetadataUpdated();

        void onPreloadStatusUpdated();

        void onQueueStatusUpdated();

        void onStatusUpdated();
    }

    public zzm(String str) {
        super(NAMESPACE, "MediaControlChannel", str, 1000);
        this.zzahc.add(this.zzaiR);
        this.zzahc.add(this.zzaiS);
        this.zzahc.add(this.zzaiT);
        this.zzahc.add(this.zzaiU);
        this.zzahc.add(this.zzaiV);
        this.zzahc.add(this.zzaiW);
        this.zzahc.add(this.zzaiX);
        this.zzahc.add(this.zzaiY);
        this.zzahc.add(this.zzaiZ);
        this.zzahc.add(this.zzaja);
        this.zzahc.add(this.zzajb);
        this.zzahc.add(this.zzajc);
        this.zzahc.add(this.zzajd);
        this.zzahc.add(this.zzaje);
        zzqI();
    }

    private void onMetadataUpdated() {
        if (this.zzaiQ != null) {
            this.zzaiQ.onMetadataUpdated();
        }
    }

    private void onPreloadStatusUpdated() {
        if (this.zzaiQ != null) {
            this.zzaiQ.onPreloadStatusUpdated();
        }
    }

    private void onQueueStatusUpdated() {
        if (this.zzaiQ != null) {
            this.zzaiQ.onQueueStatusUpdated();
        }
    }

    private void onStatusUpdated() {
        if (this.zzaiQ != null) {
            this.zzaiQ.onStatusUpdated();
        }
    }

    private void zza(long j, JSONObject jSONObject) throws JSONException {
        int i = 1;
        boolean zzD = this.zzaiR.zzD(j);
        int i2 = (!this.zzaiV.zzqK() || this.zzaiV.zzD(j)) ? 0 : 1;
        if ((!this.zzaiW.zzqK() || this.zzaiW.zzD(j)) && (!this.zzaiX.zzqK() || this.zzaiX.zzD(j))) {
            i = 0;
        }
        i2 = i2 != 0 ? 2 : 0;
        if (i != 0) {
            i2 |= 1;
        }
        if (zzD || this.zzaiP == null) {
            this.zzaiP = new MediaStatus(jSONObject);
            this.zzaiO = SystemClock.elapsedRealtime();
            i2 = 31;
        } else {
            i2 = this.zzaiP.zza(jSONObject, i2);
        }
        if ((i2 & 1) != 0) {
            this.zzaiO = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i2 & 2) != 0) {
            this.zzaiO = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i2 & 4) != 0) {
            onMetadataUpdated();
        }
        if ((i2 & 8) != 0) {
            onQueueStatusUpdated();
        }
        if ((i2 & 16) != 0) {
            onPreloadStatusUpdated();
        }
        for (zzp zzc : this.zzahc) {
            zzc.zzc(j, 0);
        }
    }

    private void zzqI() {
        this.zzaiO = 0;
        this.zzaiP = null;
        for (zzp clear : this.zzahc) {
            clear.clear();
        }
    }

    public long getApproximateStreamPosition() {
        MediaInfo mediaInfo = getMediaInfo();
        if (mediaInfo == null || this.zzaiO == 0) {
            return 0;
        }
        double playbackRate = this.zzaiP.getPlaybackRate();
        long streamPosition = this.zzaiP.getStreamPosition();
        int playerState = this.zzaiP.getPlayerState();
        if (playbackRate == 0.0d || playerState != 2) {
            return streamPosition;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzaiO;
        long j = elapsedRealtime < 0 ? 0 : elapsedRealtime;
        if (j == 0) {
            return streamPosition;
        }
        elapsedRealtime = mediaInfo.getStreamDuration();
        streamPosition += (long) (((double) j) * playbackRate);
        if (elapsedRealtime <= 0 || streamPosition <= elapsedRealtime) {
            elapsedRealtime = streamPosition < 0 ? 0 : streamPosition;
        }
        return elapsedRealtime;
    }

    public MediaInfo getMediaInfo() {
        return this.zzaiP == null ? null : this.zzaiP.getMediaInfo();
    }

    public MediaStatus getMediaStatus() {
        return this.zzaiP;
    }

    public long getStreamDuration() {
        MediaInfo mediaInfo = getMediaInfo();
        return mediaInfo != null ? mediaInfo.getStreamDuration() : 0;
    }

    protected boolean zzB(long j) {
        boolean z;
        for (zzp zzd : this.zzahc) {
            zzd.zzd(j, RemoteMediaPlayer.STATUS_TIMED_OUT);
        }
        synchronized (zzp.zznS) {
            for (zzp zzd2 : this.zzahc) {
                if (zzd2.zzqK()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long zzqp = zzqp();
        this.zzaiY.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject.put("requestId", zzqp);
            jSONObject.put("type", "GET_STATUS");
            if (this.zzaiP != null) {
                jSONObject.put("mediaSessionId", this.zzaiP.zzpX());
            }
        } catch (JSONException e) {
        }
        zza(jSONObject.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, double d, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalArgumentException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzaiW.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzpX());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Param.LEVEL, d);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, int i, long j, MediaQueueItem[] mediaQueueItemArr, int i2, Integer num, JSONObject jSONObject) throws IOException, IllegalStateException {
        if (j == -1 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long zzqp = zzqp();
            this.zzajc.zza(zzqp, com_google_android_gms_cast_internal_zzo);
            zzae(true);
            try {
                jSONObject2.put("requestId", zzqp);
                jSONObject2.put("type", "QUEUE_UPDATE");
                jSONObject2.put("mediaSessionId", zzpX());
                if (i != 0) {
                    jSONObject2.put("currentItemId", i);
                }
                if (i2 != 0) {
                    jSONObject2.put("jump", i2);
                }
                if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                        jSONArray.put(i3, mediaQueueItemArr[i3].toJson());
                    }
                    jSONObject2.put("items", jSONArray);
                }
                if (num != null) {
                    switch (num.intValue()) {
                        case 0:
                            jSONObject2.put("repeatMode", "REPEAT_OFF");
                            break;
                        case 1:
                            jSONObject2.put("repeatMode", "REPEAT_ALL");
                            break;
                        case 2:
                            jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                            break;
                        case 3:
                            jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                            break;
                    }
                }
                if (j != -1) {
                    jSONObject2.put("currentTime", zzf.zzC(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException e) {
            }
            zza(jSONObject2.toString(), zzqp, null);
            return zzqp;
        }
        throw new IllegalArgumentException("playPosition cannot be negative: " + j);
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, long j, int i, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzaiV.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "SEEK");
            jSONObject2.put("mediaSessionId", zzpX());
            jSONObject2.put("currentTime", zzf.zzC(j));
            if (i == 1) {
                jSONObject2.put("resumeState", "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject2.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzaiR.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "LOAD");
            jSONObject2.put("media", mediaInfo.toJson());
            jSONObject2.put("autoplay", z);
            jSONObject2.put("currentTime", zzf.zzC(j));
            if (jArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject2.put("activeTrackIds", jSONArray);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, TextTrackStyle textTrackStyle) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long zzqp = zzqp();
        this.zzaja.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject.put("requestId", zzqp);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.toJson());
            }
            jSONObject.put("mediaSessionId", zzpX());
        } catch (JSONException e) {
        }
        zza(jSONObject.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzaiS.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", zzpX());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, boolean z, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzaiX.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzpX());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, int[] iArr, int i, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalArgumentException {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzaje.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", zzpX());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jSONArray.put(i2, iArr[i2]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i != 0) {
                jSONObject2.put("insertBefore", i);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, int[] iArr, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalArgumentException {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzajd.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", zzpX());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < iArr.length; i++) {
                jSONArray.put(i, iArr[i]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, long[] jArr) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long zzqp = zzqp();
        this.zzaiZ.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject.put("requestId", zzqp);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", zzpX());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException e) {
        }
        zza(jSONObject.toString(), zzqp, null);
        return zzqp;
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, MediaQueueItem[] mediaQueueItemArr, int i, int i2, int i3, long j, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalStateException {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
        } else if (i2 != 0 && i3 != -1) {
            throw new IllegalArgumentException("can not set both currentItemId and currentItemIndexInItemsToInsert");
        } else if (i3 != -1 && (i3 < 0 || i3 >= mediaQueueItemArr.length)) {
            throw new IllegalArgumentException(String.format("currentItemIndexInItemsToInsert %d out of range [0, %d).", new Object[]{Integer.valueOf(i3), Integer.valueOf(mediaQueueItemArr.length)}));
        } else if (j == -1 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long zzqp = zzqp();
            this.zzajb.zza(zzqp, com_google_android_gms_cast_internal_zzo);
            zzae(true);
            try {
                jSONObject2.put("requestId", zzqp);
                jSONObject2.put("type", "QUEUE_INSERT");
                jSONObject2.put("mediaSessionId", zzpX());
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < mediaQueueItemArr.length; i4++) {
                    jSONArray.put(i4, mediaQueueItemArr[i4].toJson());
                }
                jSONObject2.put("items", jSONArray);
                if (i != 0) {
                    jSONObject2.put("insertBefore", i);
                }
                if (i2 != 0) {
                    jSONObject2.put("currentItemId", i2);
                }
                if (i3 != -1) {
                    jSONObject2.put("currentItemIndex", i3);
                }
                if (j != -1) {
                    jSONObject2.put("currentTime", zzf.zzC(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException e) {
            }
            zza(jSONObject2.toString(), zzqp, null);
            return zzqp;
        } else {
            throw new IllegalArgumentException("playPosition can not be negative: " + j);
        }
    }

    public long zza(zzo com_google_android_gms_cast_internal_zzo, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) throws IOException, IllegalArgumentException {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        } else if (i < 0 || i >= mediaQueueItemArr.length) {
            throw new IllegalArgumentException("Invalid startIndex: " + i);
        } else if (j == -1 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long zzqp = zzqp();
            this.zzaiR.zza(zzqp, com_google_android_gms_cast_internal_zzo);
            zzae(true);
            try {
                jSONObject2.put("requestId", zzqp);
                jSONObject2.put("type", "QUEUE_LOAD");
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                    jSONArray.put(i3, mediaQueueItemArr[i3].toJson());
                }
                jSONObject2.put("items", jSONArray);
                switch (i2) {
                    case 0:
                        jSONObject2.put("repeatMode", "REPEAT_OFF");
                        break;
                    case 1:
                        jSONObject2.put("repeatMode", "REPEAT_ALL");
                        break;
                    case 2:
                        jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                        break;
                    case 3:
                        jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid repeat mode: " + i2);
                }
                jSONObject2.put("startIndex", i);
                if (j != -1) {
                    jSONObject2.put("currentTime", zzf.zzC(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException e) {
            }
            zza(jSONObject2.toString(), zzqp, null);
            return zzqp;
        } else {
            throw new IllegalArgumentException("playPosition can not be negative: " + j);
        }
    }

    public void zza(zza com_google_android_gms_cast_internal_zzm_zza) {
        this.zzaiQ = com_google_android_gms_cast_internal_zzm_zza;
    }

    public long zzb(zzo com_google_android_gms_cast_internal_zzo, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzaiU.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", zzpX());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public void zzb(long j, int i) {
        for (zzp zzc : this.zzahc) {
            zzc.zzc(j, i);
        }
    }

    public long zzc(zzo com_google_android_gms_cast_internal_zzo, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long zzqp = zzqp();
        this.zzaiT.zza(zzqp, com_google_android_gms_cast_internal_zzo);
        zzae(true);
        try {
            jSONObject2.put("requestId", zzqp);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", zzpX());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzqp, null);
        return zzqp;
    }

    public final void zzcC(String str) {
        this.zzahW.zzb("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1);
            if (string.equals("MEDIA_STATUS")) {
                JSONArray jSONArray = jSONObject.getJSONArray("status");
                if (jSONArray.length() > 0) {
                    zza(optLong, jSONArray.getJSONObject(0));
                    return;
                }
                this.zzaiP = null;
                onStatusUpdated();
                onMetadataUpdated();
                onQueueStatusUpdated();
                onPreloadStatusUpdated();
                this.zzaiY.zzc(optLong, 0);
            } else if (string.equals("INVALID_PLAYER_STATE")) {
                this.zzahW.zzf("received unexpected error: Invalid Player State.", new Object[0]);
                r1 = jSONObject.optJSONObject("customData");
                for (zzp zzc : this.zzahc) {
                    zzc.zzc(optLong, 2100, r1);
                }
            } else if (string.equals("LOAD_FAILED")) {
                this.zzaiR.zzc(optLong, 2100, jSONObject.optJSONObject("customData"));
            } else if (string.equals("LOAD_CANCELLED")) {
                this.zzaiR.zzc(optLong, RemoteMediaPlayer.STATUS_CANCELED, jSONObject.optJSONObject("customData"));
            } else if (string.equals("INVALID_REQUEST")) {
                this.zzahW.zzf("received unexpected error: Invalid Request.", new Object[0]);
                r1 = jSONObject.optJSONObject("customData");
                for (zzp zzc2 : this.zzahc) {
                    zzc2.zzc(optLong, 2100, r1);
                }
            }
        } catch (JSONException e) {
            this.zzahW.zzf("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    public long zzpX() throws IllegalStateException {
        if (this.zzaiP != null) {
            return this.zzaiP.zzpX();
        }
        throw new IllegalStateException("No current media session");
    }

    public void zzqo() {
        super.zzqo();
        zzqI();
    }
}
