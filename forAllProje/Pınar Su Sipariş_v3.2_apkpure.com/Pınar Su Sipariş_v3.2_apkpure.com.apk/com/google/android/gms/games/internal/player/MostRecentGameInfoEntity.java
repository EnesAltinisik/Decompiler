package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class MostRecentGameInfoEntity extends AbstractSafeParcelable implements MostRecentGameInfo {
    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
    private final int mVersionCode;
    private final String zzaPg;
    private final String zzaPh;
    private final long zzaPi;
    private final Uri zzaPj;
    private final Uri zzaPk;
    private final Uri zzaPl;

    MostRecentGameInfoEntity(int i, String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.mVersionCode = i;
        this.zzaPg = str;
        this.zzaPh = str2;
        this.zzaPi = j;
        this.zzaPj = uri;
        this.zzaPk = uri2;
        this.zzaPl = uri3;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostRecentGameInfo) {
        this.mVersionCode = 2;
        this.zzaPg = mostRecentGameInfo.zzBb();
        this.zzaPh = mostRecentGameInfo.zzBc();
        this.zzaPi = mostRecentGameInfo.zzBd();
        this.zzaPj = mostRecentGameInfo.zzBe();
        this.zzaPk = mostRecentGameInfo.zzBf();
        this.zzaPl = mostRecentGameInfo.zzBg();
    }

    static int zza(MostRecentGameInfo mostRecentGameInfo) {
        return zzz.hashCode(mostRecentGameInfo.zzBb(), mostRecentGameInfo.zzBc(), Long.valueOf(mostRecentGameInfo.zzBd()), mostRecentGameInfo.zzBe(), mostRecentGameInfo.zzBf(), mostRecentGameInfo.zzBg());
    }

    static boolean zza(MostRecentGameInfo mostRecentGameInfo, Object obj) {
        if (!(obj instanceof MostRecentGameInfo)) {
            return false;
        }
        if (mostRecentGameInfo == obj) {
            return true;
        }
        MostRecentGameInfo mostRecentGameInfo2 = (MostRecentGameInfo) obj;
        return zzz.equal(mostRecentGameInfo2.zzBb(), mostRecentGameInfo.zzBb()) && zzz.equal(mostRecentGameInfo2.zzBc(), mostRecentGameInfo.zzBc()) && zzz.equal(Long.valueOf(mostRecentGameInfo2.zzBd()), Long.valueOf(mostRecentGameInfo.zzBd())) && zzz.equal(mostRecentGameInfo2.zzBe(), mostRecentGameInfo.zzBe()) && zzz.equal(mostRecentGameInfo2.zzBf(), mostRecentGameInfo.zzBf()) && zzz.equal(mostRecentGameInfo2.zzBg(), mostRecentGameInfo.zzBg());
    }

    static String zzb(MostRecentGameInfo mostRecentGameInfo) {
        return zzz.zzy(mostRecentGameInfo).zzg("GameId", mostRecentGameInfo.zzBb()).zzg("GameName", mostRecentGameInfo.zzBc()).zzg("ActivityTimestampMillis", Long.valueOf(mostRecentGameInfo.zzBd())).zzg("GameIconUri", mostRecentGameInfo.zzBe()).zzg("GameHiResUri", mostRecentGameInfo.zzBf()).zzg("GameFeaturedUri", mostRecentGameInfo.zzBg()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBh();
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
        MostRecentGameInfoEntityCreator.zza(this, parcel, i);
    }

    public String zzBb() {
        return this.zzaPg;
    }

    public String zzBc() {
        return this.zzaPh;
    }

    public long zzBd() {
        return this.zzaPi;
    }

    public Uri zzBe() {
        return this.zzaPj;
    }

    public Uri zzBf() {
        return this.zzaPk;
    }

    public Uri zzBg() {
        return this.zzaPl;
    }

    public MostRecentGameInfo zzBh() {
        return this;
    }
}
