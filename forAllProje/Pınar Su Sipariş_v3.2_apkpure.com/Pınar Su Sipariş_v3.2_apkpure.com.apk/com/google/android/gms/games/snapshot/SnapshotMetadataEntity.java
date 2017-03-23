package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class SnapshotMetadataEntity extends AbstractSafeParcelable implements SnapshotMetadata {
    public static final Creator<SnapshotMetadataEntity> CREATOR = new SnapshotMetadataEntityCreator();
    private final int mVersionCode;
    private final String zzVw;
    private final String zzaLo;
    private final GameEntity zzaOX;
    private final Uri zzaRR;
    private final PlayerEntity zzaRU;
    private final String zzaRV;
    private final long zzaRW;
    private final long zzaRX;
    private final float zzaRY;
    private final String zzaRZ;
    private final boolean zzaSa;
    private final long zzaSb;
    private final String zzaSc;
    private final String zzavG;

    SnapshotMetadataEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z, long j3, String str6) {
        this.mVersionCode = i;
        this.zzaOX = gameEntity;
        this.zzaRU = playerEntity;
        this.zzaLo = str;
        this.zzaRR = uri;
        this.zzaRV = str2;
        this.zzaRY = f;
        this.zzavG = str3;
        this.zzVw = str4;
        this.zzaRW = j;
        this.zzaRX = j2;
        this.zzaRZ = str5;
        this.zzaSa = z;
        this.zzaSb = j3;
        this.zzaSc = str6;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        this.mVersionCode = 6;
        this.zzaOX = new GameEntity(snapshotMetadata.getGame());
        this.zzaRU = new PlayerEntity(snapshotMetadata.getOwner());
        this.zzaLo = snapshotMetadata.getSnapshotId();
        this.zzaRR = snapshotMetadata.getCoverImageUri();
        this.zzaRV = snapshotMetadata.getCoverImageUrl();
        this.zzaRY = snapshotMetadata.getCoverImageAspectRatio();
        this.zzavG = snapshotMetadata.getTitle();
        this.zzVw = snapshotMetadata.getDescription();
        this.zzaRW = snapshotMetadata.getLastModifiedTimestamp();
        this.zzaRX = snapshotMetadata.getPlayedTime();
        this.zzaRZ = snapshotMetadata.getUniqueName();
        this.zzaSa = snapshotMetadata.hasChangePending();
        this.zzaSb = snapshotMetadata.getProgressValue();
        this.zzaSc = snapshotMetadata.getDeviceName();
    }

    static int zza(SnapshotMetadata snapshotMetadata) {
        return zzz.hashCode(snapshotMetadata.getGame(), snapshotMetadata.getOwner(), snapshotMetadata.getSnapshotId(), snapshotMetadata.getCoverImageUri(), Float.valueOf(snapshotMetadata.getCoverImageAspectRatio()), snapshotMetadata.getTitle(), snapshotMetadata.getDescription(), Long.valueOf(snapshotMetadata.getLastModifiedTimestamp()), Long.valueOf(snapshotMetadata.getPlayedTime()), snapshotMetadata.getUniqueName(), Boolean.valueOf(snapshotMetadata.hasChangePending()), Long.valueOf(snapshotMetadata.getProgressValue()), snapshotMetadata.getDeviceName());
    }

    static boolean zza(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return zzz.equal(snapshotMetadata2.getGame(), snapshotMetadata.getGame()) && zzz.equal(snapshotMetadata2.getOwner(), snapshotMetadata.getOwner()) && zzz.equal(snapshotMetadata2.getSnapshotId(), snapshotMetadata.getSnapshotId()) && zzz.equal(snapshotMetadata2.getCoverImageUri(), snapshotMetadata.getCoverImageUri()) && zzz.equal(Float.valueOf(snapshotMetadata2.getCoverImageAspectRatio()), Float.valueOf(snapshotMetadata.getCoverImageAspectRatio())) && zzz.equal(snapshotMetadata2.getTitle(), snapshotMetadata.getTitle()) && zzz.equal(snapshotMetadata2.getDescription(), snapshotMetadata.getDescription()) && zzz.equal(Long.valueOf(snapshotMetadata2.getLastModifiedTimestamp()), Long.valueOf(snapshotMetadata.getLastModifiedTimestamp())) && zzz.equal(Long.valueOf(snapshotMetadata2.getPlayedTime()), Long.valueOf(snapshotMetadata.getPlayedTime())) && zzz.equal(snapshotMetadata2.getUniqueName(), snapshotMetadata.getUniqueName()) && zzz.equal(Boolean.valueOf(snapshotMetadata2.hasChangePending()), Boolean.valueOf(snapshotMetadata.hasChangePending())) && zzz.equal(Long.valueOf(snapshotMetadata2.getProgressValue()), Long.valueOf(snapshotMetadata.getProgressValue())) && zzz.equal(snapshotMetadata2.getDeviceName(), snapshotMetadata.getDeviceName());
    }

    static String zzb(SnapshotMetadata snapshotMetadata) {
        return zzz.zzy(snapshotMetadata).zzg("Game", snapshotMetadata.getGame()).zzg("Owner", snapshotMetadata.getOwner()).zzg("SnapshotId", snapshotMetadata.getSnapshotId()).zzg("CoverImageUri", snapshotMetadata.getCoverImageUri()).zzg("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).zzg("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.getCoverImageAspectRatio())).zzg("Description", snapshotMetadata.getDescription()).zzg("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.getLastModifiedTimestamp())).zzg("PlayedTime", Long.valueOf(snapshotMetadata.getPlayedTime())).zzg("UniqueName", snapshotMetadata.getUniqueName()).zzg("ChangePending", Boolean.valueOf(snapshotMetadata.hasChangePending())).zzg("ProgressValue", Long.valueOf(snapshotMetadata.getProgressValue())).zzg("DeviceName", snapshotMetadata.getDeviceName()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public SnapshotMetadata freeze() {
        return this;
    }

    public float getCoverImageAspectRatio() {
        return this.zzaRY;
    }

    public Uri getCoverImageUri() {
        return this.zzaRR;
    }

    public String getCoverImageUrl() {
        return this.zzaRV;
    }

    public String getDescription() {
        return this.zzVw;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzVw, charArrayBuffer);
    }

    public String getDeviceName() {
        return this.zzaSc;
    }

    public Game getGame() {
        return this.zzaOX;
    }

    public long getLastModifiedTimestamp() {
        return this.zzaRW;
    }

    public Player getOwner() {
        return this.zzaRU;
    }

    public long getPlayedTime() {
        return this.zzaRX;
    }

    public long getProgressValue() {
        return this.zzaSb;
    }

    public String getSnapshotId() {
        return this.zzaLo;
    }

    public String getTitle() {
        return this.zzavG;
    }

    public String getUniqueName() {
        return this.zzaRZ;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean hasChangePending() {
        return this.zzaSa;
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
        SnapshotMetadataEntityCreator.zza(this, parcel, i);
    }
}
