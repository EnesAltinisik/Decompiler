package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class PlayerStatsEntity extends AbstractSafeParcelable implements PlayerStats {
    public static final Creator<PlayerStatsEntity> CREATOR = new PlayerStatsEntityCreator();
    private final int mVersionCode;
    private final float zzaSh;
    private final float zzaSi;
    private final int zzaSj;
    private final int zzaSk;
    private final int zzaSl;
    private final float zzaSm;
    private final float zzaSn;
    private final Bundle zzaSo;
    private final float zzaSp;
    private final float zzaSq;
    private final float zzaSr;

    PlayerStatsEntity(int i, float f, float f2, int i2, int i3, int i4, float f3, float f4, Bundle bundle, float f5, float f6, float f7) {
        this.mVersionCode = i;
        this.zzaSh = f;
        this.zzaSi = f2;
        this.zzaSj = i2;
        this.zzaSk = i3;
        this.zzaSl = i4;
        this.zzaSm = f3;
        this.zzaSn = f4;
        this.zzaSo = bundle;
        this.zzaSp = f5;
        this.zzaSq = f6;
        this.zzaSr = f7;
    }

    public PlayerStatsEntity(PlayerStats playerStats) {
        this.mVersionCode = 4;
        this.zzaSh = playerStats.getAverageSessionLength();
        this.zzaSi = playerStats.getChurnProbability();
        this.zzaSj = playerStats.getDaysSinceLastPlayed();
        this.zzaSk = playerStats.getNumberOfPurchases();
        this.zzaSl = playerStats.getNumberOfSessions();
        this.zzaSm = playerStats.getSessionPercentile();
        this.zzaSn = playerStats.getSpendPercentile();
        this.zzaSp = playerStats.getSpendProbability();
        this.zzaSq = playerStats.getHighSpenderProbability();
        this.zzaSr = playerStats.getTotalSpendNext28Days();
        this.zzaSo = playerStats.zzBB();
    }

    static int zza(PlayerStats playerStats) {
        return zzz.hashCode(Float.valueOf(playerStats.getAverageSessionLength()), Float.valueOf(playerStats.getChurnProbability()), Integer.valueOf(playerStats.getDaysSinceLastPlayed()), Integer.valueOf(playerStats.getNumberOfPurchases()), Integer.valueOf(playerStats.getNumberOfSessions()), Float.valueOf(playerStats.getSessionPercentile()), Float.valueOf(playerStats.getSpendPercentile()), Float.valueOf(playerStats.getSpendProbability()), Float.valueOf(playerStats.getHighSpenderProbability()), Float.valueOf(playerStats.getTotalSpendNext28Days()));
    }

    static boolean zza(PlayerStats playerStats, Object obj) {
        if (!(obj instanceof PlayerStats)) {
            return false;
        }
        if (playerStats == obj) {
            return true;
        }
        PlayerStats playerStats2 = (PlayerStats) obj;
        return zzz.equal(Float.valueOf(playerStats2.getAverageSessionLength()), Float.valueOf(playerStats.getAverageSessionLength())) && zzz.equal(Float.valueOf(playerStats2.getChurnProbability()), Float.valueOf(playerStats.getChurnProbability())) && zzz.equal(Integer.valueOf(playerStats2.getDaysSinceLastPlayed()), Integer.valueOf(playerStats.getDaysSinceLastPlayed())) && zzz.equal(Integer.valueOf(playerStats2.getNumberOfPurchases()), Integer.valueOf(playerStats.getNumberOfPurchases())) && zzz.equal(Integer.valueOf(playerStats2.getNumberOfSessions()), Integer.valueOf(playerStats.getNumberOfSessions())) && zzz.equal(Float.valueOf(playerStats2.getSessionPercentile()), Float.valueOf(playerStats.getSessionPercentile())) && zzz.equal(Float.valueOf(playerStats2.getSpendPercentile()), Float.valueOf(playerStats.getSpendPercentile())) && zzz.equal(Float.valueOf(playerStats2.getSpendProbability()), Float.valueOf(playerStats.getSpendProbability())) && zzz.equal(Float.valueOf(playerStats2.getHighSpenderProbability()), Float.valueOf(playerStats.getHighSpenderProbability())) && zzz.equal(Float.valueOf(playerStats2.getTotalSpendNext28Days()), Float.valueOf(playerStats.getTotalSpendNext28Days()));
    }

    static String zzb(PlayerStats playerStats) {
        return zzz.zzy(playerStats).zzg("AverageSessionLength", Float.valueOf(playerStats.getAverageSessionLength())).zzg("ChurnProbability", Float.valueOf(playerStats.getChurnProbability())).zzg("DaysSinceLastPlayed", Integer.valueOf(playerStats.getDaysSinceLastPlayed())).zzg("NumberOfPurchases", Integer.valueOf(playerStats.getNumberOfPurchases())).zzg("NumberOfSessions", Integer.valueOf(playerStats.getNumberOfSessions())).zzg("SessionPercentile", Float.valueOf(playerStats.getSessionPercentile())).zzg("SpendPercentile", Float.valueOf(playerStats.getSpendPercentile())).zzg("SpendProbability", Float.valueOf(playerStats.getSpendProbability())).zzg("HighSpenderProbability", Float.valueOf(playerStats.getHighSpenderProbability())).zzg("TotalSpendNext28Days", Float.valueOf(playerStats.getTotalSpendNext28Days())).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBC();
    }

    public float getAverageSessionLength() {
        return this.zzaSh;
    }

    public float getChurnProbability() {
        return this.zzaSi;
    }

    public int getDaysSinceLastPlayed() {
        return this.zzaSj;
    }

    public float getHighSpenderProbability() {
        return this.zzaSq;
    }

    public int getNumberOfPurchases() {
        return this.zzaSk;
    }

    public int getNumberOfSessions() {
        return this.zzaSl;
    }

    public float getSessionPercentile() {
        return this.zzaSm;
    }

    public float getSpendPercentile() {
        return this.zzaSn;
    }

    public float getSpendProbability() {
        return this.zzaSp;
    }

    public float getTotalSpendNext28Days() {
        return this.zzaSr;
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
        PlayerStatsEntityCreator.zza(this, parcel, i);
    }

    public Bundle zzBB() {
        return this.zzaSo;
    }

    public PlayerStats zzBC() {
        return this;
    }
}
