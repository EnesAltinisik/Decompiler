package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionEntity extends AbstractSafeParcelable implements AppContentAction {
    public static final AppContentActionEntityCreator CREATOR = new AppContentActionEntityCreator();
    private final Bundle mExtras;
    private final int mVersionCode;
    private final String zzBc;
    private final String zzNR;
    private final ArrayList<AppContentConditionEntity> zzaKn;
    private final String zzaKo;
    private final AppContentAnnotationEntity zzaKp;
    private final String zzaKq;

    AppContentActionEntity(int i, ArrayList<AppContentConditionEntity> arrayList, String str, Bundle bundle, String str2, String str3, AppContentAnnotationEntity appContentAnnotationEntity, String str4) {
        this.mVersionCode = i;
        this.zzaKp = appContentAnnotationEntity;
        this.zzaKn = arrayList;
        this.zzaKo = str;
        this.mExtras = bundle;
        this.zzBc = str3;
        this.zzaKq = str4;
        this.zzNR = str2;
    }

    public AppContentActionEntity(AppContentAction appContentAction) {
        this.mVersionCode = 5;
        this.zzaKp = (AppContentAnnotationEntity) appContentAction.zzzh().freeze();
        this.zzaKo = appContentAction.zzzj();
        this.mExtras = appContentAction.getExtras();
        this.zzBc = appContentAction.getId();
        this.zzaKq = appContentAction.zzzk();
        this.zzNR = appContentAction.getType();
        List zzzi = appContentAction.zzzi();
        int size = zzzi.size();
        this.zzaKn = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.zzaKn.add((AppContentConditionEntity) ((AppContentCondition) zzzi.get(i)).freeze());
        }
    }

    static int zza(AppContentAction appContentAction) {
        return zzz.hashCode(appContentAction.zzzh(), appContentAction.zzzi(), appContentAction.zzzj(), appContentAction.getExtras(), appContentAction.getId(), appContentAction.zzzk(), appContentAction.getType());
    }

    static boolean zza(AppContentAction appContentAction, Object obj) {
        if (!(obj instanceof AppContentAction)) {
            return false;
        }
        if (appContentAction == obj) {
            return true;
        }
        AppContentAction appContentAction2 = (AppContentAction) obj;
        return zzz.equal(appContentAction2.zzzh(), appContentAction.zzzh()) && zzz.equal(appContentAction2.zzzi(), appContentAction.zzzi()) && zzz.equal(appContentAction2.zzzj(), appContentAction.zzzj()) && zzz.equal(appContentAction2.getExtras(), appContentAction.getExtras()) && zzz.equal(appContentAction2.getId(), appContentAction.getId()) && zzz.equal(appContentAction2.zzzk(), appContentAction.zzzk()) && zzz.equal(appContentAction2.getType(), appContentAction.getType());
    }

    static String zzb(AppContentAction appContentAction) {
        return zzz.zzy(appContentAction).zzg("Annotation", appContentAction.zzzh()).zzg("Conditions", appContentAction.zzzi()).zzg("ContentDescription", appContentAction.zzzj()).zzg("Extras", appContentAction.getExtras()).zzg("Id", appContentAction.getId()).zzg("OverflowText", appContentAction.zzzk()).zzg("Type", appContentAction.getType()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzzl();
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getId() {
        return this.zzBc;
    }

    public String getType() {
        return this.zzNR;
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
        AppContentActionEntityCreator.zza(this, parcel, i);
    }

    public AppContentAnnotation zzzh() {
        return this.zzaKp;
    }

    public List<AppContentCondition> zzzi() {
        return new ArrayList(this.zzaKn);
    }

    public String zzzj() {
        return this.zzaKo;
    }

    public String zzzk() {
        return this.zzaKq;
    }

    public AppContentAction zzzl() {
        return this;
    }
}
