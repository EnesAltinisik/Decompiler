package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardEntity extends AbstractSafeParcelable implements AppContentCard {
    public static final AppContentCardEntityCreator CREATOR = new AppContentCardEntityCreator();
    private final ArrayList<AppContentActionEntity> mActions;
    private final Bundle mExtras;
    private final int mVersionCode;
    private final String zzBc;
    private final String zzNR;
    private final String zzVw;
    private final int zzaKA;
    private final ArrayList<AppContentConditionEntity> zzaKn;
    private final String zzaKo;
    private final ArrayList<AppContentAnnotationEntity> zzaKx;
    private final int zzaKy;
    private final String zzaKz;
    private final String zzavG;

    AppContentCardEntity(int i, ArrayList<AppContentActionEntity> arrayList, ArrayList<AppContentAnnotationEntity> arrayList2, ArrayList<AppContentConditionEntity> arrayList3, String str, int i2, String str2, Bundle bundle, String str3, String str4, int i3, String str5, String str6) {
        this.mVersionCode = i;
        this.mActions = arrayList;
        this.zzaKx = arrayList2;
        this.zzaKn = arrayList3;
        this.zzaKo = str;
        this.zzaKy = i2;
        this.zzVw = str2;
        this.mExtras = bundle;
        this.zzBc = str6;
        this.zzaKz = str3;
        this.zzavG = str4;
        this.zzaKA = i3;
        this.zzNR = str5;
    }

    public AppContentCardEntity(AppContentCard appContentCard) {
        int i;
        int i2 = 0;
        this.mVersionCode = 4;
        this.zzaKo = appContentCard.zzzj();
        this.zzaKy = appContentCard.zzzu();
        this.zzVw = appContentCard.getDescription();
        this.mExtras = appContentCard.getExtras();
        this.zzBc = appContentCard.getId();
        this.zzavG = appContentCard.getTitle();
        this.zzaKz = appContentCard.zzzv();
        this.zzaKA = appContentCard.zzzw();
        this.zzNR = appContentCard.getType();
        List actions = appContentCard.getActions();
        int size = actions.size();
        this.mActions = new ArrayList(size);
        for (i = 0; i < size; i++) {
            this.mActions.add((AppContentActionEntity) ((AppContentAction) actions.get(i)).freeze());
        }
        actions = appContentCard.zzzt();
        size = actions.size();
        this.zzaKx = new ArrayList(size);
        for (i = 0; i < size; i++) {
            this.zzaKx.add((AppContentAnnotationEntity) ((AppContentAnnotation) actions.get(i)).freeze());
        }
        List zzzi = appContentCard.zzzi();
        int size2 = zzzi.size();
        this.zzaKn = new ArrayList(size2);
        while (i2 < size2) {
            this.zzaKn.add((AppContentConditionEntity) ((AppContentCondition) zzzi.get(i2)).freeze());
            i2++;
        }
    }

    static int zza(AppContentCard appContentCard) {
        return zzz.hashCode(appContentCard.getActions(), appContentCard.zzzt(), appContentCard.zzzi(), appContentCard.zzzj(), Integer.valueOf(appContentCard.zzzu()), appContentCard.getDescription(), appContentCard.getExtras(), appContentCard.getId(), appContentCard.zzzv(), appContentCard.getTitle(), Integer.valueOf(appContentCard.zzzw()), appContentCard.getType());
    }

    static boolean zza(AppContentCard appContentCard, Object obj) {
        if (!(obj instanceof AppContentCard)) {
            return false;
        }
        if (appContentCard == obj) {
            return true;
        }
        AppContentCard appContentCard2 = (AppContentCard) obj;
        return zzz.equal(appContentCard2.getActions(), appContentCard.getActions()) && zzz.equal(appContentCard2.zzzt(), appContentCard.zzzt()) && zzz.equal(appContentCard2.zzzi(), appContentCard.zzzi()) && zzz.equal(appContentCard2.zzzj(), appContentCard.zzzj()) && zzz.equal(Integer.valueOf(appContentCard2.zzzu()), Integer.valueOf(appContentCard.zzzu())) && zzz.equal(appContentCard2.getDescription(), appContentCard.getDescription()) && zzz.equal(appContentCard2.getExtras(), appContentCard.getExtras()) && zzz.equal(appContentCard2.getId(), appContentCard.getId()) && zzz.equal(appContentCard2.zzzv(), appContentCard.zzzv()) && zzz.equal(appContentCard2.getTitle(), appContentCard.getTitle()) && zzz.equal(Integer.valueOf(appContentCard2.zzzw()), Integer.valueOf(appContentCard.zzzw())) && zzz.equal(appContentCard2.getType(), appContentCard.getType());
    }

    static String zzb(AppContentCard appContentCard) {
        return zzz.zzy(appContentCard).zzg("Actions", appContentCard.getActions()).zzg("Annotations", appContentCard.zzzt()).zzg("Conditions", appContentCard.zzzi()).zzg("ContentDescription", appContentCard.zzzj()).zzg("CurrentSteps", Integer.valueOf(appContentCard.zzzu())).zzg("Description", appContentCard.getDescription()).zzg("Extras", appContentCard.getExtras()).zzg("Id", appContentCard.getId()).zzg("Subtitle", appContentCard.zzzv()).zzg("Title", appContentCard.getTitle()).zzg("TotalSteps", Integer.valueOf(appContentCard.zzzw())).zzg("Type", appContentCard.getType()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzzx();
    }

    public List<AppContentAction> getActions() {
        return new ArrayList(this.mActions);
    }

    public String getDescription() {
        return this.zzVw;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getId() {
        return this.zzBc;
    }

    public String getTitle() {
        return this.zzavG;
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
        AppContentCardEntityCreator.zza(this, parcel, i);
    }

    public List<AppContentCondition> zzzi() {
        return new ArrayList(this.zzaKn);
    }

    public String zzzj() {
        return this.zzaKo;
    }

    public List<AppContentAnnotation> zzzt() {
        return new ArrayList(this.zzaKx);
    }

    public int zzzu() {
        return this.zzaKy;
    }

    public String zzzv() {
        return this.zzaKz;
    }

    public int zzzw() {
        return this.zzaKA;
    }

    public AppContentCard zzzx() {
        return this;
    }
}
