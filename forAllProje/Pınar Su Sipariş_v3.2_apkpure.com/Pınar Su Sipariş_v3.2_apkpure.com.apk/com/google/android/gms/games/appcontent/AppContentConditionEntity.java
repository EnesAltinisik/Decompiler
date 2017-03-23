package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class AppContentConditionEntity extends AbstractSafeParcelable implements AppContentCondition {
    public static final AppContentConditionEntityCreator CREATOR = new AppContentConditionEntityCreator();
    private final int mVersionCode;
    private final String zzaKB;
    private final String zzaKC;
    private final String zzaKD;
    private final Bundle zzaKE;

    AppContentConditionEntity(int i, String str, String str2, String str3, Bundle bundle) {
        this.mVersionCode = i;
        this.zzaKB = str;
        this.zzaKC = str2;
        this.zzaKD = str3;
        this.zzaKE = bundle;
    }

    public AppContentConditionEntity(AppContentCondition appContentCondition) {
        this.mVersionCode = 1;
        this.zzaKB = appContentCondition.zzzy();
        this.zzaKC = appContentCondition.zzzz();
        this.zzaKD = appContentCondition.zzzA();
        this.zzaKE = appContentCondition.zzzB();
    }

    static int zza(AppContentCondition appContentCondition) {
        return zzz.hashCode(appContentCondition.zzzy(), appContentCondition.zzzz(), appContentCondition.zzzA(), appContentCondition.zzzB());
    }

    static boolean zza(AppContentCondition appContentCondition, Object obj) {
        if (!(obj instanceof AppContentCondition)) {
            return false;
        }
        if (appContentCondition == obj) {
            return true;
        }
        AppContentCondition appContentCondition2 = (AppContentCondition) obj;
        return zzz.equal(appContentCondition2.zzzy(), appContentCondition.zzzy()) && zzz.equal(appContentCondition2.zzzz(), appContentCondition.zzzz()) && zzz.equal(appContentCondition2.zzzA(), appContentCondition.zzzA()) && zzz.equal(appContentCondition2.zzzB(), appContentCondition.zzzB());
    }

    static String zzb(AppContentCondition appContentCondition) {
        return zzz.zzy(appContentCondition).zzg("DefaultValue", appContentCondition.zzzy()).zzg("ExpectedValue", appContentCondition.zzzz()).zzg("Predicate", appContentCondition.zzzA()).zzg("PredicateParameters", appContentCondition.zzzB()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzzC();
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
        AppContentConditionEntityCreator.zza(this, parcel, i);
    }

    public String zzzA() {
        return this.zzaKD;
    }

    public Bundle zzzB() {
        return this.zzaKE;
    }

    public AppContentCondition zzzC() {
        return this;
    }

    public String zzzy() {
        return this.zzaKB;
    }

    public String zzzz() {
        return this.zzaKC;
    }
}
