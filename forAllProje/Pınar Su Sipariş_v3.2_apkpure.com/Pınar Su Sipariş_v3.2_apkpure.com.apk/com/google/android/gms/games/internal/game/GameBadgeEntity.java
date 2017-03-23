package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final GameBadgeEntityCreator CREATOR = new a();
    private final int mVersionCode;
    private String zzVw;
    private Uri zzaIU;
    private int zzagd;
    private String zzavG;

    static final class a extends GameBadgeEntityCreator {
        a() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return zzeo(parcel);
        }

        public GameBadgeEntity zzeo(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.zzf(DowngradeableSafeParcel.zztF()) || DowngradeableSafeParcel.zzde(GameBadgeEntity.class.getCanonicalName())) {
                return super.zzeo(parcel);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            return new GameBadgeEntity(1, readInt, readString, readString2, readString3 == null ? null : Uri.parse(readString3));
        }
    }

    GameBadgeEntity(int i, int i2, String str, String str2, Uri uri) {
        this.mVersionCode = i;
        this.zzagd = i2;
        this.zzavG = str;
        this.zzVw = str2;
        this.zzaIU = uri;
    }

    public GameBadgeEntity(GameBadge gameBadge) {
        this.mVersionCode = 1;
        this.zzagd = gameBadge.getType();
        this.zzavG = gameBadge.getTitle();
        this.zzVw = gameBadge.getDescription();
        this.zzaIU = gameBadge.getIconImageUri();
    }

    static int zza(GameBadge gameBadge) {
        return zzz.hashCode(Integer.valueOf(gameBadge.getType()), gameBadge.getTitle(), gameBadge.getDescription(), gameBadge.getIconImageUri());
    }

    static boolean zza(GameBadge gameBadge, Object obj) {
        if (!(obj instanceof GameBadge)) {
            return false;
        }
        if (gameBadge == obj) {
            return true;
        }
        GameBadge gameBadge2 = (GameBadge) obj;
        return zzz.equal(Integer.valueOf(gameBadge2.getType()), gameBadge.getTitle()) && zzz.equal(gameBadge2.getDescription(), gameBadge.getIconImageUri());
    }

    static String zzb(GameBadge gameBadge) {
        return zzz.zzy(gameBadge).zzg("Type", Integer.valueOf(gameBadge.getType())).zzg("Title", gameBadge.getTitle()).zzg("Description", gameBadge.getDescription()).zzg("IconImageUri", gameBadge.getIconImageUri()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzAO();
    }

    public String getDescription() {
        return this.zzVw;
    }

    public Uri getIconImageUri() {
        return this.zzaIU;
    }

    public String getTitle() {
        return this.zzavG;
    }

    public int getType() {
        return this.zzagd;
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
        if (zztG()) {
            parcel.writeInt(this.zzagd);
            parcel.writeString(this.zzavG);
            parcel.writeString(this.zzVw);
            parcel.writeString(this.zzaIU == null ? null : this.zzaIU.toString());
            return;
        }
        GameBadgeEntityCreator.zza(this, parcel, i);
    }

    public GameBadge zzAO() {
        return this;
    }
}
