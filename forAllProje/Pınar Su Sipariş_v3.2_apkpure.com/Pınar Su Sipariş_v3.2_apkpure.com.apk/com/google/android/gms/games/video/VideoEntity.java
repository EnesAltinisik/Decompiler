package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzz;

public final class VideoEntity extends AbstractSafeParcelable implements Video {
    public static final Creator<VideoEntity> CREATOR = new VideoEntityCreator();
    private final int mVersionCode;
    private final long zzFn;
    private final String zzZC;
    private final String zzaSH;
    private final long zzaSI;
    private final int zzapX;

    VideoEntity(int i, int i2, String str, long j, long j2, String str2) {
        this.mVersionCode = i;
        this.zzapX = i2;
        this.zzaSH = str;
        this.zzaSI = j;
        this.zzFn = j2;
        this.zzZC = str2;
    }

    public VideoEntity(Video video) {
        this.mVersionCode = 1;
        this.zzapX = video.getDuration();
        this.zzaSH = video.zzBD();
        this.zzaSI = video.getFileSize();
        this.zzFn = video.getStartTime();
        this.zzZC = video.getPackageName();
        zzb.zzv(this.zzaSH);
        zzb.zzv(this.zzZC);
    }

    static int zza(Video video) {
        return zzz.hashCode(Integer.valueOf(video.getDuration()), video.zzBD(), Long.valueOf(video.getFileSize()), Long.valueOf(video.getStartTime()), video.getPackageName());
    }

    static boolean zza(Video video, Object obj) {
        if (!(obj instanceof Video)) {
            return false;
        }
        if (video == obj) {
            return true;
        }
        Video video2 = (Video) obj;
        return zzz.equal(Integer.valueOf(video2.getDuration()), Integer.valueOf(video.getDuration())) && zzz.equal(video2.zzBD(), video.zzBD()) && zzz.equal(Long.valueOf(video2.getFileSize()), Long.valueOf(video.getFileSize())) && zzz.equal(Long.valueOf(video2.getStartTime()), Long.valueOf(video.getStartTime())) && zzz.equal(video2.getPackageName(), video.getPackageName());
    }

    static String zzb(Video video) {
        return zzz.zzy(video).zzg("Duration", Integer.valueOf(video.getDuration())).zzg("File path", video.zzBD()).zzg("File size", Long.valueOf(video.getFileSize())).zzg("Start time", Long.valueOf(video.getStartTime())).zzg("Package name", video.getPackageName()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBK();
    }

    public int getDuration() {
        return this.zzapX;
    }

    public long getFileSize() {
        return this.zzaSI;
    }

    public String getPackageName() {
        return this.zzZC;
    }

    public long getStartTime() {
        return this.zzFn;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zza(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        VideoEntityCreator.zza(this, parcel, i);
    }

    public String zzBD() {
        return this.zzaSH;
    }

    public Video zzBK() {
        return this;
    }
}
