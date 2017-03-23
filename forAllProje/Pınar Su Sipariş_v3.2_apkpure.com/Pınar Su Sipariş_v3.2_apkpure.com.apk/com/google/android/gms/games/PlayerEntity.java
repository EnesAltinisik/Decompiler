package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Creator<PlayerEntity> CREATOR = new a();
    private final String mName;
    private final int mVersionCode;
    private final boolean zzST;
    private final Uri zzaIU;
    private final Uri zzaIV;
    private final long zzaJE;
    private final int zzaJF;
    private final long zzaJG;
    private final MostRecentGameInfoEntity zzaJH;
    private final PlayerLevelInfo zzaJI;
    private final boolean zzaJJ;
    private final boolean zzaJK;
    private final String zzaJL;
    private final Uri zzaJM;
    private final String zzaJN;
    private final Uri zzaJO;
    private final String zzaJP;
    private final int zzaJQ;
    private final long zzaJR;
    private final String zzaJf;
    private final String zzaJg;
    private String zzaco;
    private String zzahz;
    private final String zzavG;

    static final class a extends PlayerEntityCreator {
        a() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return zzeb(parcel);
        }

        public PlayerEntity zzeb(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.zzf(DowngradeableSafeParcel.zztF()) || DowngradeableSafeParcel.zzde(PlayerEntity.class.getCanonicalName())) {
                return super.zzeb(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            return new PlayerEntity(14, readString, readString2, readString3 == null ? null : Uri.parse(readString3), readString4 == null ? null : Uri.parse(readString4), parcel.readLong(), -1, -1, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1, -1, false);
        }
    }

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j, int i2, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, int i3, long j3, boolean z3) {
        this.mVersionCode = i;
        this.zzahz = str;
        this.zzaco = str2;
        this.zzaIU = uri;
        this.zzaJf = str3;
        this.zzaIV = uri2;
        this.zzaJg = str4;
        this.zzaJE = j;
        this.zzaJF = i2;
        this.zzaJG = j2;
        this.zzavG = str5;
        this.zzaJJ = z;
        this.zzaJH = mostRecentGameInfoEntity;
        this.zzaJI = playerLevelInfo;
        this.zzaJK = z2;
        this.zzaJL = str6;
        this.mName = str7;
        this.zzaJM = uri3;
        this.zzaJN = str8;
        this.zzaJO = uri4;
        this.zzaJP = str9;
        this.zzaJQ = i3;
        this.zzaJR = j3;
        this.zzST = z3;
    }

    public PlayerEntity(Player player) {
        this(player, true);
    }

    public PlayerEntity(Player player, boolean z) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        this.mVersionCode = 14;
        this.zzahz = z ? player.getPlayerId() : null;
        this.zzaco = player.getDisplayName();
        this.zzaIU = player.getIconImageUri();
        this.zzaJf = player.getIconImageUrl();
        this.zzaIV = player.getHiResImageUri();
        this.zzaJg = player.getHiResImageUrl();
        this.zzaJE = player.getRetrievedTimestamp();
        this.zzaJF = player.zzyS();
        this.zzaJG = player.getLastPlayedWithTimestamp();
        this.zzavG = player.getTitle();
        this.zzaJJ = player.zzyT();
        MostRecentGameInfo zzyU = player.zzyU();
        if (zzyU != null) {
            mostRecentGameInfoEntity = new MostRecentGameInfoEntity(zzyU);
        }
        this.zzaJH = mostRecentGameInfoEntity;
        this.zzaJI = player.getLevelInfo();
        this.zzaJK = player.zzyR();
        this.zzaJL = player.zzyQ();
        this.mName = player.getName();
        this.zzaJM = player.getBannerImageLandscapeUri();
        this.zzaJN = player.getBannerImageLandscapeUrl();
        this.zzaJO = player.getBannerImagePortraitUri();
        this.zzaJP = player.getBannerImagePortraitUrl();
        this.zzaJQ = player.zzyV();
        this.zzaJR = player.zzyW();
        this.zzST = player.isMuted();
        if (z) {
            zzb.zzv(this.zzahz);
        }
        zzb.zzv(this.zzaco);
        zzb.zzai(this.zzaJE > 0);
    }

    static boolean zza(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return zzz.equal(player2.getPlayerId(), player.getPlayerId()) && zzz.equal(player2.getDisplayName(), player.getDisplayName()) && zzz.equal(Boolean.valueOf(player2.zzyR()), Boolean.valueOf(player.zzyR())) && zzz.equal(player2.getIconImageUri(), player.getIconImageUri()) && zzz.equal(player2.getHiResImageUri(), player.getHiResImageUri()) && zzz.equal(Long.valueOf(player2.getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) && zzz.equal(player2.getTitle(), player.getTitle()) && zzz.equal(player2.getLevelInfo(), player.getLevelInfo()) && zzz.equal(player2.zzyQ(), player.zzyQ()) && zzz.equal(player2.getName(), player.getName()) && zzz.equal(player2.getBannerImageLandscapeUri(), player.getBannerImageLandscapeUri()) && zzz.equal(player2.getBannerImagePortraitUri(), player.getBannerImagePortraitUri()) && zzz.equal(Integer.valueOf(player2.zzyV()), Integer.valueOf(player.zzyV())) && zzz.equal(Long.valueOf(player2.zzyW()), Long.valueOf(player.zzyW())) && zzz.equal(Boolean.valueOf(player2.isMuted()), Boolean.valueOf(player.isMuted()));
    }

    static int zzb(Player player) {
        return zzz.hashCode(player.getPlayerId(), player.getDisplayName(), Boolean.valueOf(player.zzyR()), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo(), player.zzyQ(), player.getName(), player.getBannerImageLandscapeUri(), player.getBannerImagePortraitUri(), Integer.valueOf(player.zzyV()), Long.valueOf(player.zzyW()), Boolean.valueOf(player.isMuted()));
    }

    static String zzc(Player player) {
        return zzz.zzy(player).zzg("PlayerId", player.getPlayerId()).zzg("DisplayName", player.getDisplayName()).zzg("HasDebugAccess", Boolean.valueOf(player.zzyR())).zzg("IconImageUri", player.getIconImageUri()).zzg("IconImageUrl", player.getIconImageUrl()).zzg("HiResImageUri", player.getHiResImageUri()).zzg("HiResImageUrl", player.getHiResImageUrl()).zzg("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).zzg("Title", player.getTitle()).zzg("LevelInfo", player.getLevelInfo()).zzg("GamerTag", player.zzyQ()).zzg("Name", player.getName()).zzg("BannerImageLandscapeUri", player.getBannerImageLandscapeUri()).zzg("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).zzg("BannerImagePortraitUri", player.getBannerImagePortraitUri()).zzg("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).zzg("GamerFriendStatus", Integer.valueOf(player.zzyV())).zzg("GamerFriendUpdateTimestamp", Long.valueOf(player.zzyW())).zzg("IsMuted", Boolean.valueOf(player.isMuted())).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public Player freeze() {
        return this;
    }

    public Uri getBannerImageLandscapeUri() {
        return this.zzaJM;
    }

    public String getBannerImageLandscapeUrl() {
        return this.zzaJN;
    }

    public Uri getBannerImagePortraitUri() {
        return this.zzaJO;
    }

    public String getBannerImagePortraitUrl() {
        return this.zzaJP;
    }

    public String getDisplayName() {
        return this.zzaco;
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzaco, charArrayBuffer);
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

    public long getLastPlayedWithTimestamp() {
        return this.zzaJG;
    }

    public PlayerLevelInfo getLevelInfo() {
        return this.zzaJI;
    }

    public String getName() {
        return this.mName;
    }

    public String getPlayerId() {
        return this.zzahz;
    }

    public long getRetrievedTimestamp() {
        return this.zzaJE;
    }

    public String getTitle() {
        return this.zzavG;
    }

    public void getTitle(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzavG, charArrayBuffer);
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return zzb(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isMuted() {
        return this.zzST;
    }

    public String toString() {
        return zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        if (zztG()) {
            parcel.writeString(this.zzahz);
            parcel.writeString(this.zzaco);
            parcel.writeString(this.zzaIU == null ? null : this.zzaIU.toString());
            if (this.zzaIV != null) {
                str = this.zzaIV.toString();
            }
            parcel.writeString(str);
            parcel.writeLong(this.zzaJE);
            return;
        }
        PlayerEntityCreator.zza(this, parcel, i);
    }

    public String zzyQ() {
        return this.zzaJL;
    }

    public boolean zzyR() {
        return this.zzaJK;
    }

    public int zzyS() {
        return this.zzaJF;
    }

    public boolean zzyT() {
        return this.zzaJJ;
    }

    public MostRecentGameInfo zzyU() {
        return this.zzaJH;
    }

    public int zzyV() {
        return this.zzaJQ;
    }

    public long zzyW() {
        return this.zzaJR;
    }
}
