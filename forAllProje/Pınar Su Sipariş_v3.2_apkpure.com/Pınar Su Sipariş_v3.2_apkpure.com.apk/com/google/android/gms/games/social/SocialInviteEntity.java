package com.google.android.gms.games.social;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public class SocialInviteEntity extends AbstractSafeParcelable implements SocialInvite {
    public static final Creator<SocialInviteEntity> CREATOR = new SocialInviteEntityCreator();
    private final int mVersionCode;
    private final PlayerEntity zzaKi;
    private final long zzaRW;
    private final String zzaSe;
    private final int zzaSf;
    private final int zzagd;

    SocialInviteEntity(int i, String str, PlayerEntity playerEntity, int i2, int i3, long j) {
        this.mVersionCode = i;
        this.zzaSe = str;
        this.zzaKi = playerEntity;
        this.zzagd = i2;
        this.zzaSf = i3;
        this.zzaRW = j;
    }

    public SocialInviteEntity(SocialInvite socialInvite) {
        this.mVersionCode = 1;
        this.zzaSe = socialInvite.zzBz();
        Player player = socialInvite.getPlayer();
        this.zzaKi = player == null ? null : (PlayerEntity) player.freeze();
        this.zzagd = socialInvite.getType();
        this.zzaSf = socialInvite.getDirection();
        this.zzaRW = socialInvite.getLastModifiedTimestamp();
    }

    static boolean zza(SocialInvite socialInvite, Object obj) {
        if (!(obj instanceof SocialInvite)) {
            return false;
        }
        if (socialInvite == obj) {
            return true;
        }
        SocialInvite socialInvite2 = (SocialInvite) obj;
        return zzz.equal(socialInvite2.zzBz(), socialInvite.zzBz()) && zzz.equal(socialInvite2.getPlayer(), socialInvite.getPlayer()) && zzz.equal(Integer.valueOf(socialInvite2.getType()), Integer.valueOf(socialInvite.getType())) && zzz.equal(Integer.valueOf(socialInvite2.getDirection()), Integer.valueOf(socialInvite.getDirection())) && zzz.equal(Long.valueOf(socialInvite2.getLastModifiedTimestamp()), Long.valueOf(socialInvite.getLastModifiedTimestamp()));
    }

    static int zzc(SocialInvite socialInvite) {
        return zzz.hashCode(socialInvite.zzBz(), socialInvite.getPlayer(), Integer.valueOf(socialInvite.getType()), Integer.valueOf(socialInvite.getDirection()), Long.valueOf(socialInvite.getLastModifiedTimestamp()));
    }

    static String zzd(SocialInvite socialInvite) {
        return zzz.zzy(socialInvite).zzg("Social Invite ID", socialInvite.zzBz()).zzg("Player", socialInvite.getPlayer()).zzg("Type", Integer.valueOf(socialInvite.getType())).zzg("Direction", Integer.valueOf(socialInvite.getDirection())).zzg("Last Modified Timestamp", Long.valueOf(socialInvite.getLastModifiedTimestamp())).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBA();
    }

    public int getDirection() {
        return this.zzaSf;
    }

    public long getLastModifiedTimestamp() {
        return this.zzaRW;
    }

    public Player getPlayer() {
        return this.zzaKi;
    }

    public int getType() {
        return this.zzagd;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzc(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzd(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        SocialInviteEntityCreator.zza(this, parcel, i);
    }

    public SocialInvite zzBA() {
        return this;
    }

    public String zzBz() {
        return this.zzaSe;
    }
}
