package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.internal.zzz.zza;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class AchievementEntity extends AbstractSafeParcelable implements Achievement {
    public static final Creator<AchievementEntity> CREATOR = new AchievementEntityCreator();
    private final String mName;
    private final int mState;
    private final int mVersionCode;
    private final String zzVw;
    private final String zzaKb;
    private final Uri zzaKc;
    private final String zzaKd;
    private final Uri zzaKe;
    private final String zzaKf;
    private final int zzaKg;
    private final String zzaKh;
    private final PlayerEntity zzaKi;
    private final int zzaKj;
    private final String zzaKk;
    private final long zzaKl;
    private final long zzaKm;
    private final int zzagd;

    AchievementEntity(int i, String str, int i2, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i3, String str6, PlayerEntity playerEntity, int i4, int i5, String str7, long j, long j2) {
        this.mVersionCode = i;
        this.zzaKb = str;
        this.zzagd = i2;
        this.mName = str2;
        this.zzVw = str3;
        this.zzaKc = uri;
        this.zzaKd = str4;
        this.zzaKe = uri2;
        this.zzaKf = str5;
        this.zzaKg = i3;
        this.zzaKh = str6;
        this.zzaKi = playerEntity;
        this.mState = i4;
        this.zzaKj = i5;
        this.zzaKk = str7;
        this.zzaKl = j;
        this.zzaKm = j2;
    }

    public AchievementEntity(Achievement achievement) {
        this.mVersionCode = 1;
        this.zzaKb = achievement.getAchievementId();
        this.zzagd = achievement.getType();
        this.mName = achievement.getName();
        this.zzVw = achievement.getDescription();
        this.zzaKc = achievement.getUnlockedImageUri();
        this.zzaKd = achievement.getUnlockedImageUrl();
        this.zzaKe = achievement.getRevealedImageUri();
        this.zzaKf = achievement.getRevealedImageUrl();
        this.zzaKi = (PlayerEntity) achievement.getPlayer().freeze();
        this.mState = achievement.getState();
        this.zzaKl = achievement.getLastUpdatedTimestamp();
        this.zzaKm = achievement.getXpValue();
        if (achievement.getType() == 1) {
            this.zzaKg = achievement.getTotalSteps();
            this.zzaKh = achievement.getFormattedTotalSteps();
            this.zzaKj = achievement.getCurrentSteps();
            this.zzaKk = achievement.getFormattedCurrentSteps();
        } else {
            this.zzaKg = 0;
            this.zzaKh = null;
            this.zzaKj = 0;
            this.zzaKk = null;
        }
        zzb.zzv(this.zzaKb);
        zzb.zzv(this.zzVw);
    }

    static int zza(Achievement achievement) {
        int currentSteps;
        int totalSteps;
        if (achievement.getType() == 1) {
            currentSteps = achievement.getCurrentSteps();
            totalSteps = achievement.getTotalSteps();
        } else {
            totalSteps = 0;
            currentSteps = 0;
        }
        return zzz.hashCode(achievement.getAchievementId(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.getXpValue()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.getLastUpdatedTimestamp()), achievement.getPlayer(), Integer.valueOf(currentSteps), Integer.valueOf(totalSteps));
    }

    static boolean zza(Achievement achievement, Object obj) {
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        boolean equal;
        boolean equal2;
        Achievement achievement2 = (Achievement) obj;
        if (achievement.getType() == 1) {
            equal = zzz.equal(Integer.valueOf(achievement2.getCurrentSteps()), Integer.valueOf(achievement.getCurrentSteps()));
            equal2 = zzz.equal(Integer.valueOf(achievement2.getTotalSteps()), Integer.valueOf(achievement.getTotalSteps()));
        } else {
            equal2 = true;
            equal = true;
        }
        return zzz.equal(achievement2.getAchievementId(), achievement.getAchievementId()) && zzz.equal(achievement2.getName(), achievement.getName()) && zzz.equal(Integer.valueOf(achievement2.getType()), Integer.valueOf(achievement.getType())) && zzz.equal(achievement2.getDescription(), achievement.getDescription()) && zzz.equal(Long.valueOf(achievement2.getXpValue()), Long.valueOf(achievement.getXpValue())) && zzz.equal(Integer.valueOf(achievement2.getState()), Integer.valueOf(achievement.getState())) && zzz.equal(Long.valueOf(achievement2.getLastUpdatedTimestamp()), Long.valueOf(achievement.getLastUpdatedTimestamp())) && zzz.equal(achievement2.getPlayer(), achievement.getPlayer()) && equal && equal2;
    }

    static String zzb(Achievement achievement) {
        zza zzg = zzz.zzy(achievement).zzg("Id", achievement.getAchievementId()).zzg("Type", Integer.valueOf(achievement.getType())).zzg("Name", achievement.getName()).zzg("Description", achievement.getDescription()).zzg("Player", achievement.getPlayer()).zzg("State", Integer.valueOf(achievement.getState()));
        if (achievement.getType() == 1) {
            zzg.zzg("CurrentSteps", Integer.valueOf(achievement.getCurrentSteps()));
            zzg.zzg("TotalSteps", Integer.valueOf(achievement.getTotalSteps()));
        }
        return zzg.toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public Achievement freeze() {
        return this;
    }

    public String getAchievementId() {
        return this.zzaKb;
    }

    public int getCurrentSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        zzb.zzai(z);
        return zzzf();
    }

    public String getDescription() {
        return this.zzVw;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzVw, charArrayBuffer);
    }

    public String getFormattedCurrentSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        zzb.zzai(z);
        return zzzg();
    }

    public void getFormattedCurrentSteps(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        zzb.zzai(z);
        zzg.zzb(this.zzaKk, charArrayBuffer);
    }

    public String getFormattedTotalSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        zzb.zzai(z);
        return zzze();
    }

    public void getFormattedTotalSteps(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        zzb.zzai(z);
        zzg.zzb(this.zzaKh, charArrayBuffer);
    }

    public long getLastUpdatedTimestamp() {
        return this.zzaKl;
    }

    public String getName() {
        return this.mName;
    }

    public void getName(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.mName, charArrayBuffer);
    }

    public Player getPlayer() {
        return this.zzaKi;
    }

    public Uri getRevealedImageUri() {
        return this.zzaKe;
    }

    public String getRevealedImageUrl() {
        return this.zzaKf;
    }

    public int getState() {
        return this.mState;
    }

    public int getTotalSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        zzb.zzai(z);
        return zzzd();
    }

    public int getType() {
        return this.zzagd;
    }

    public Uri getUnlockedImageUri() {
        return this.zzaKc;
    }

    public String getUnlockedImageUrl() {
        return this.zzaKd;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public long getXpValue() {
        return this.zzaKm;
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
        AchievementEntityCreator.zza(this, parcel, i);
    }

    public int zzzd() {
        return this.zzaKg;
    }

    public String zzze() {
        return this.zzaKh;
    }

    public int zzzf() {
        return this.zzaKj;
    }

    public String zzzg() {
        return this.zzaKk;
    }
}
