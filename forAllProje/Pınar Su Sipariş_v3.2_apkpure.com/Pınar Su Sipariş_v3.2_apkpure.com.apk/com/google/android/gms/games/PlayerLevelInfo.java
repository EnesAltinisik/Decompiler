package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public final class PlayerLevelInfo implements SafeParcelable {
    public static final Creator<PlayerLevelInfo> CREATOR = new PlayerLevelInfoCreator();
    private final int mVersionCode;
    private final long zzaJV;
    private final long zzaJW;
    private final PlayerLevel zzaJX;
    private final PlayerLevel zzaJY;

    PlayerLevelInfo(int i, long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        zzaa.zzai(j != -1);
        zzaa.zzz(playerLevel);
        zzaa.zzz(playerLevel2);
        this.mVersionCode = i;
        this.zzaJV = j;
        this.zzaJW = j2;
        this.zzaJX = playerLevel;
        this.zzaJY = playerLevel2;
    }

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        this(1, j, j2, playerLevel, playerLevel2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return zzz.equal(Long.valueOf(this.zzaJV), Long.valueOf(playerLevelInfo.zzaJV)) && zzz.equal(Long.valueOf(this.zzaJW), Long.valueOf(playerLevelInfo.zzaJW)) && zzz.equal(this.zzaJX, playerLevelInfo.zzaJX) && zzz.equal(this.zzaJY, playerLevelInfo.zzaJY);
    }

    public PlayerLevel getCurrentLevel() {
        return this.zzaJX;
    }

    public long getCurrentXpTotal() {
        return this.zzaJV;
    }

    public long getLastLevelUpTimestamp() {
        return this.zzaJW;
    }

    public PlayerLevel getNextLevel() {
        return this.zzaJY;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzaJV), Long.valueOf(this.zzaJW), this.zzaJX, this.zzaJY);
    }

    public boolean isMaxLevel() {
        return this.zzaJX.equals(this.zzaJY);
    }

    public void writeToParcel(Parcel parcel, int i) {
        PlayerLevelInfoCreator.zza(this, parcel, i);
    }
}
