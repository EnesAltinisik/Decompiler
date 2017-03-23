package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

public final class PlayerRef extends zzc implements Player {
    private final PlayerLevelInfo zzaJI;
    private final PlayerColumnNames zzaJZ;
    private final MostRecentGameInfoRef zzaKa;

    public PlayerRef(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    public PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        this.zzaJZ = new PlayerColumnNames(str);
        this.zzaKa = new MostRecentGameInfoRef(dataHolder, i, this.zzaJZ);
        if (zzyX()) {
            PlayerLevel playerLevel;
            int integer = getInteger(this.zzaJZ.zzaPw);
            int integer2 = getInteger(this.zzaJZ.zzaPz);
            PlayerLevel playerLevel2 = new PlayerLevel(integer, getLong(this.zzaJZ.zzaPx), getLong(this.zzaJZ.zzaPy));
            if (integer != integer2) {
                playerLevel = new PlayerLevel(integer2, getLong(this.zzaJZ.zzaPy), getLong(this.zzaJZ.zzaPA));
            } else {
                playerLevel = playerLevel2;
            }
            this.zzaJI = new PlayerLevelInfo(getLong(this.zzaJZ.zzaPv), getLong(this.zzaJZ.zzaPB), playerLevel2, playerLevel);
            return;
        }
        this.zzaJI = null;
    }

    private boolean zzyX() {
        return (zzda(this.zzaJZ.zzaPv) || getLong(this.zzaJZ.zzaPv) == -1) ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return PlayerEntity.zza(this, obj);
    }

    public Player freeze() {
        return new PlayerEntity(this);
    }

    public Uri getBannerImageLandscapeUri() {
        return zzcZ(this.zzaJZ.zzaPM);
    }

    public String getBannerImageLandscapeUrl() {
        return getString(this.zzaJZ.zzaPN);
    }

    public Uri getBannerImagePortraitUri() {
        return zzcZ(this.zzaJZ.zzaPO);
    }

    public String getBannerImagePortraitUrl() {
        return getString(this.zzaJZ.zzaPP);
    }

    public String getDisplayName() {
        return getString(this.zzaJZ.zzaPn);
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        zza(this.zzaJZ.zzaPn, charArrayBuffer);
    }

    public Uri getHiResImageUri() {
        return zzcZ(this.zzaJZ.zzaPq);
    }

    public String getHiResImageUrl() {
        return getString(this.zzaJZ.zzaPr);
    }

    public Uri getIconImageUri() {
        return zzcZ(this.zzaJZ.zzaPo);
    }

    public String getIconImageUrl() {
        return getString(this.zzaJZ.zzaPp);
    }

    public long getLastPlayedWithTimestamp() {
        return (!zzcY(this.zzaJZ.zzaPu) || zzda(this.zzaJZ.zzaPu)) ? -1 : getLong(this.zzaJZ.zzaPu);
    }

    public PlayerLevelInfo getLevelInfo() {
        return this.zzaJI;
    }

    public String getName() {
        return getString(this.zzaJZ.name);
    }

    public String getPlayerId() {
        return getString(this.zzaJZ.zzaPm);
    }

    public long getRetrievedTimestamp() {
        return getLong(this.zzaJZ.zzaPs);
    }

    public String getTitle() {
        return getString(this.zzaJZ.title);
    }

    public void getTitle(CharArrayBuffer charArrayBuffer) {
        zza(this.zzaJZ.title, charArrayBuffer);
    }

    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return PlayerEntity.zzb(this);
    }

    public boolean isMuted() {
        return getBoolean(this.zzaJZ.zzaPS);
    }

    public String toString() {
        return PlayerEntity.zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) ((Player) freeze())).writeToParcel(parcel, i);
    }

    public String zzyQ() {
        return getString(this.zzaJZ.zzaPL);
    }

    public boolean zzyR() {
        return getBoolean(this.zzaJZ.zzaPK);
    }

    public int zzyS() {
        return getInteger(this.zzaJZ.zzaPt);
    }

    public boolean zzyT() {
        return getBoolean(this.zzaJZ.zzaPD);
    }

    public MostRecentGameInfo zzyU() {
        return zzda(this.zzaJZ.zzaPE) ? null : this.zzaKa;
    }

    public int zzyV() {
        return getInteger(this.zzaJZ.zzaPQ);
    }

    public long zzyW() {
        return getLong(this.zzaJZ.zzaPR);
    }
}
