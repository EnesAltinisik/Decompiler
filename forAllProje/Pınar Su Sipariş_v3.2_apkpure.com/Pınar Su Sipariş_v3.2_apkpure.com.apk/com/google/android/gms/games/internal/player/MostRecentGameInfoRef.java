package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class MostRecentGameInfoRef extends zzc implements MostRecentGameInfo {
    private final PlayerColumnNames zzaJZ;

    public MostRecentGameInfoRef(DataHolder dataHolder, int i, PlayerColumnNames playerColumnNames) {
        super(dataHolder, i);
        this.zzaJZ = playerColumnNames;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return MostRecentGameInfoEntity.zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBh();
    }

    public int hashCode() {
        return MostRecentGameInfoEntity.zza(this);
    }

    public String toString() {
        return MostRecentGameInfoEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MostRecentGameInfoEntity) ((MostRecentGameInfo) freeze())).writeToParcel(parcel, i);
    }

    public String zzBb() {
        return getString(this.zzaJZ.zzaPE);
    }

    public String zzBc() {
        return getString(this.zzaJZ.zzaPF);
    }

    public long zzBd() {
        return getLong(this.zzaJZ.zzaPG);
    }

    public Uri zzBe() {
        return zzcZ(this.zzaJZ.zzaPH);
    }

    public Uri zzBf() {
        return zzcZ(this.zzaJZ.zzaPI);
    }

    public Uri zzBg() {
        return zzcZ(this.zzaJZ.zzaPJ);
    }

    public MostRecentGameInfo zzBh() {
        return new MostRecentGameInfoEntity(this);
    }
}
