package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Creator<GameEntity> CREATOR = new a();
    private final int mVersionCode;
    private final boolean zzGX;
    private final String zzVw;
    private final String zzaIR;
    private final String zzaIS;
    private final String zzaIT;
    private final Uri zzaIU;
    private final Uri zzaIV;
    private final Uri zzaIW;
    private final boolean zzaIX;
    private final boolean zzaIY;
    private final String zzaIZ;
    private final int zzaJa;
    private final int zzaJb;
    private final int zzaJc;
    private final boolean zzaJd;
    private final boolean zzaJe;
    private final String zzaJf;
    private final String zzaJg;
    private final String zzaJh;
    private final boolean zzaJi;
    private final boolean zzaJj;
    private final String zzaJk;
    private final boolean zzaJl;
    private final String zzaco;
    private final String zzaeg;

    static final class a extends GameEntityCreator {
        a() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return zzea(parcel);
        }

        public GameEntity zzea(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.zzf(DowngradeableSafeParcel.zztF()) || DowngradeableSafeParcel.zzde(GameEntity.class.getCanonicalName())) {
                return super.zzea(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            readString7 = parcel.readString();
            Uri parse2 = readString7 == null ? null : Uri.parse(readString7);
            readString7 = parcel.readString();
            return new GameEntity(7, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString7 == null ? null : Uri.parse(readString7), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }
    }

    GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
        this.mVersionCode = i;
        this.zzaeg = str;
        this.zzaco = str2;
        this.zzaIR = str3;
        this.zzaIS = str4;
        this.zzVw = str5;
        this.zzaIT = str6;
        this.zzaIU = uri;
        this.zzaJf = str8;
        this.zzaIV = uri2;
        this.zzaJg = str9;
        this.zzaIW = uri3;
        this.zzaJh = str10;
        this.zzaIX = z;
        this.zzaIY = z2;
        this.zzaIZ = str7;
        this.zzaJa = i2;
        this.zzaJb = i3;
        this.zzaJc = i4;
        this.zzaJd = z3;
        this.zzaJe = z4;
        this.zzGX = z5;
        this.zzaJi = z6;
        this.zzaJj = z7;
        this.zzaJk = str11;
        this.zzaJl = z8;
    }

    public GameEntity(Game game) {
        this.mVersionCode = 7;
        this.zzaeg = game.getApplicationId();
        this.zzaIR = game.getPrimaryCategory();
        this.zzaIS = game.getSecondaryCategory();
        this.zzVw = game.getDescription();
        this.zzaIT = game.getDeveloperName();
        this.zzaco = game.getDisplayName();
        this.zzaIU = game.getIconImageUri();
        this.zzaJf = game.getIconImageUrl();
        this.zzaIV = game.getHiResImageUri();
        this.zzaJg = game.getHiResImageUrl();
        this.zzaIW = game.getFeaturedImageUri();
        this.zzaJh = game.getFeaturedImageUrl();
        this.zzaIX = game.zzyJ();
        this.zzaIY = game.zzyL();
        this.zzaIZ = game.zzyM();
        this.zzaJa = 1;
        this.zzaJb = game.getAchievementTotalCount();
        this.zzaJc = game.getLeaderboardCount();
        this.zzaJd = game.isRealTimeMultiplayerEnabled();
        this.zzaJe = game.isTurnBasedMultiplayerEnabled();
        this.zzGX = game.isMuted();
        this.zzaJi = game.zzyK();
        this.zzaJj = game.areSnapshotsEnabled();
        this.zzaJk = game.getThemeColor();
        this.zzaJl = game.hasGamepadSupport();
    }

    static int zza(Game game) {
        return zzz.hashCode(game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.zzyJ()), Boolean.valueOf(game.zzyL()), game.zzyM(), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.zzyK()), Boolean.valueOf(game.areSnapshotsEnabled()), game.getThemeColor(), Boolean.valueOf(game.hasGamepadSupport()));
    }

    static boolean zza(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        if (zzz.equal(game2.getApplicationId(), game.getApplicationId()) && zzz.equal(game2.getDisplayName(), game.getDisplayName()) && zzz.equal(game2.getPrimaryCategory(), game.getPrimaryCategory()) && zzz.equal(game2.getSecondaryCategory(), game.getSecondaryCategory()) && zzz.equal(game2.getDescription(), game.getDescription()) && zzz.equal(game2.getDeveloperName(), game.getDeveloperName()) && zzz.equal(game2.getIconImageUri(), game.getIconImageUri()) && zzz.equal(game2.getHiResImageUri(), game.getHiResImageUri()) && zzz.equal(game2.getFeaturedImageUri(), game.getFeaturedImageUri()) && zzz.equal(Boolean.valueOf(game2.zzyJ()), Boolean.valueOf(game.zzyJ())) && zzz.equal(Boolean.valueOf(game2.zzyL()), Boolean.valueOf(game.zzyL())) && zzz.equal(game2.zzyM(), game.zzyM()) && zzz.equal(Integer.valueOf(game2.getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) && zzz.equal(Integer.valueOf(game2.getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) && zzz.equal(Boolean.valueOf(game2.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()))) {
            Boolean valueOf = Boolean.valueOf(game2.isTurnBasedMultiplayerEnabled());
            boolean z = game.isTurnBasedMultiplayerEnabled() && zzz.equal(Boolean.valueOf(game2.isMuted()), Boolean.valueOf(game.isMuted())) && zzz.equal(Boolean.valueOf(game2.zzyK()), Boolean.valueOf(game.zzyK()));
            if (zzz.equal(valueOf, Boolean.valueOf(z)) && zzz.equal(Boolean.valueOf(game2.areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled())) && zzz.equal(game2.getThemeColor(), game.getThemeColor()) && zzz.equal(Boolean.valueOf(game2.hasGamepadSupport()), Boolean.valueOf(game.hasGamepadSupport()))) {
                return true;
            }
        }
        return false;
    }

    static String zzb(Game game) {
        return zzz.zzy(game).zzg("ApplicationId", game.getApplicationId()).zzg("DisplayName", game.getDisplayName()).zzg("PrimaryCategory", game.getPrimaryCategory()).zzg("SecondaryCategory", game.getSecondaryCategory()).zzg("Description", game.getDescription()).zzg("DeveloperName", game.getDeveloperName()).zzg("IconImageUri", game.getIconImageUri()).zzg("IconImageUrl", game.getIconImageUrl()).zzg("HiResImageUri", game.getHiResImageUri()).zzg("HiResImageUrl", game.getHiResImageUrl()).zzg("FeaturedImageUri", game.getFeaturedImageUri()).zzg("FeaturedImageUrl", game.getFeaturedImageUrl()).zzg("PlayEnabledGame", Boolean.valueOf(game.zzyJ())).zzg("InstanceInstalled", Boolean.valueOf(game.zzyL())).zzg("InstancePackageName", game.zzyM()).zzg("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).zzg("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).zzg("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).zzg("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).zzg("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).zzg("ThemeColor", game.getThemeColor()).zzg("HasGamepadSupport", Boolean.valueOf(game.hasGamepadSupport())).toString();
    }

    public boolean areSnapshotsEnabled() {
        return this.zzaJj;
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public Game freeze() {
        return this;
    }

    public int getAchievementTotalCount() {
        return this.zzaJb;
    }

    public String getApplicationId() {
        return this.zzaeg;
    }

    public String getDescription() {
        return this.zzVw;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzVw, charArrayBuffer);
    }

    public String getDeveloperName() {
        return this.zzaIT;
    }

    public void getDeveloperName(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzaIT, charArrayBuffer);
    }

    public String getDisplayName() {
        return this.zzaco;
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzaco, charArrayBuffer);
    }

    public Uri getFeaturedImageUri() {
        return this.zzaIW;
    }

    public String getFeaturedImageUrl() {
        return this.zzaJh;
    }

    public Uri getHiResImageUri() {
        return this.zzaIV;
    }

    public String getHiResImageUrl() {
        return this.zzaJg;
    }

    public Uri getIconImageUri() {
        return this.zzaIU;
    }

    public String getIconImageUrl() {
        return this.zzaJf;
    }

    public int getLeaderboardCount() {
        return this.zzaJc;
    }

    public String getPrimaryCategory() {
        return this.zzaIR;
    }

    public String getSecondaryCategory() {
        return this.zzaIS;
    }

    public String getThemeColor() {
        return this.zzaJk;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean hasGamepadSupport() {
        return this.zzaJl;
    }

    public int hashCode() {
        return zza(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isMuted() {
        return this.zzGX;
    }

    public boolean isRealTimeMultiplayerEnabled() {
        return this.zzaJd;
    }

    public boolean isTurnBasedMultiplayerEnabled() {
        return this.zzaJe;
    }

    public String toString() {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        String str = null;
        if (zztG()) {
            parcel.writeString(this.zzaeg);
            parcel.writeString(this.zzaco);
            parcel.writeString(this.zzaIR);
            parcel.writeString(this.zzaIS);
            parcel.writeString(this.zzVw);
            parcel.writeString(this.zzaIT);
            parcel.writeString(this.zzaIU == null ? null : this.zzaIU.toString());
            parcel.writeString(this.zzaIV == null ? null : this.zzaIV.toString());
            if (this.zzaIW != null) {
                str = this.zzaIW.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.zzaIX ? 1 : 0);
            if (!this.zzaIY) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.zzaIZ);
            parcel.writeInt(this.zzaJa);
            parcel.writeInt(this.zzaJb);
            parcel.writeInt(this.zzaJc);
            return;
        }
        GameEntityCreator.zza(this, parcel, i);
    }

    public boolean zzyJ() {
        return this.zzaIX;
    }

    public boolean zzyK() {
        return this.zzaJi;
    }

    public boolean zzyL() {
        return this.zzaIY;
    }

    public String zzyM() {
        return this.zzaIZ;
    }

    public int zzyN() {
        return this.zzaJa;
    }
}
