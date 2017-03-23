package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public final class PlayerLevel implements SafeParcelable {
    public static final Creator<PlayerLevel> CREATOR = new PlayerLevelCreator();
    private final int mVersionCode;
    private final int zzaJS;
    private final long zzaJT;
    private final long zzaJU;

    PlayerLevel(int i, int i2, long j, long j2) {
        boolean z = true;
        zzaa.zza(j >= 0, (Object) "Min XP must be positive!");
        if (j2 <= j) {
            z = false;
        }
        zzaa.zza(z, (Object) "Max XP must be more than min XP!");
        this.mVersionCode = i;
        this.zzaJS = i2;
        this.zzaJT = j;
        this.zzaJU = j2;
    }

    public PlayerLevel(int i, long j, long j2) {
        this(1, i, j, j2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return zzz.equal(Integer.valueOf(playerLevel.getLevelNumber()), Integer.valueOf(getLevelNumber())) && zzz.equal(Long.valueOf(playerLevel.getMinXp()), Long.valueOf(getMinXp())) && zzz.equal(Long.valueOf(playerLevel.getMaxXp()), Long.valueOf(getMaxXp()));
    }

    public int getLevelNumber() {
        return this.zzaJS;
    }

    public long getMaxXp() {
        return this.zzaJU;
    }

    public long getMinXp() {
        return this.zzaJT;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzaJS), Long.valueOf(this.zzaJT), Long.valueOf(this.zzaJU));
    }

    public String toString() {
        return zzz.zzy(this).zzg("LevelNumber", Integer.valueOf(getLevelNumber())).zzg("MinXp", Long.valueOf(getMinXp())).zzg("MaxXp", Long.valueOf(getMaxXp())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        PlayerLevelCreator.zza(this, parcel, i);
    }
}
