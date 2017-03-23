package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionEntity extends AbstractSafeParcelable implements AppContentSection {
    public static final AppContentSectionEntityCreator CREATOR = new AppContentSectionEntityCreator();
    private final ArrayList<AppContentActionEntity> mActions;
    private final Bundle mExtras;
    private final int mVersionCode;
    private final String zzBc;
    private final String zzNR;
    private final ArrayList<AppContentCardEntity> zzaKF;
    private final String zzaKG;
    private final String zzaKo;
    private final ArrayList<AppContentAnnotationEntity> zzaKx;
    private final String zzaKz;
    private final String zzavG;

    AppContentSectionEntity(int i, ArrayList<AppContentActionEntity> arrayList, ArrayList<AppContentCardEntity> arrayList2, String str, Bundle bundle, String str2, String str3, String str4, String str5, String str6, ArrayList<AppContentAnnotationEntity> arrayList3) {
        this.mVersionCode = i;
        this.mActions = arrayList;
        this.zzaKx = arrayList3;
        this.zzaKF = arrayList2;
        this.zzaKG = str6;
        this.zzaKo = str;
        this.mExtras = bundle;
        this.zzBc = str5;
        this.zzaKz = str2;
        this.zzavG = str3;
        this.zzNR = str4;
    }

    public AppContentSectionEntity(AppContentSection appContentSection) {
        int i;
        int i2 = 0;
        this.mVersionCode = 5;
        this.zzaKG = appContentSection.zzzE();
        this.zzaKo = appContentSection.zzzj();
        this.mExtras = appContentSection.getExtras();
        this.zzBc = appContentSection.getId();
        this.zzaKz = appContentSection.zzzv();
        this.zzavG = appContentSection.getTitle();
        this.zzNR = appContentSection.getType();
        List actions = appContentSection.getActions();
        int size = actions.size();
        this.mActions = new ArrayList(size);
        for (i = 0; i < size; i++) {
            this.mActions.add((AppContentActionEntity) ((AppContentAction) actions.get(i)).freeze());
        }
        actions = appContentSection.zzzD();
        size = actions.size();
        this.zzaKF = new ArrayList(size);
        for (i = 0; i < size; i++) {
            this.zzaKF.add((AppContentCardEntity) ((AppContentCard) actions.get(i)).freeze());
        }
        List zzzt = appContentSection.zzzt();
        int size2 = zzzt.size();
        this.zzaKx = new ArrayList(size2);
        while (i2 < size2) {
            this.zzaKx.add((AppContentAnnotationEntity) ((AppContentAnnotation) zzzt.get(i2)).freeze());
            i2++;
        }
    }

    static int zza(AppContentSection appContentSection) {
        return zzz.hashCode(appContentSection.getActions(), appContentSection.zzzt(), appContentSection.zzzD(), appContentSection.zzzE(), appContentSection.zzzj(), appContentSection.getExtras(), appContentSection.getId(), appContentSection.zzzv(), appContentSection.getTitle(), appContentSection.getType());
    }

    static boolean zza(AppContentSection appContentSection, Object obj) {
        if (!(obj instanceof AppContentSection)) {
            return false;
        }
        if (appContentSection == obj) {
            return true;
        }
        AppContentSection appContentSection2 = (AppContentSection) obj;
        return zzz.equal(appContentSection2.getActions(), appContentSection.getActions()) && zzz.equal(appContentSection2.zzzt(), appContentSection.zzzt()) && zzz.equal(appContentSection2.zzzD(), appContentSection.zzzD()) && zzz.equal(appContentSection2.zzzE(), appContentSection.zzzE()) && zzz.equal(appContentSection2.zzzj(), appContentSection.zzzj()) && zzz.equal(appContentSection2.getExtras(), appContentSection.getExtras()) && zzz.equal(appContentSection2.getId(), appContentSection.getId()) && zzz.equal(appContentSection2.zzzv(), appContentSection.zzzv()) && zzz.equal(appContentSection2.getTitle(), appContentSection.getTitle()) && zzz.equal(appContentSection2.getType(), appContentSection.getType());
    }

    static String zzb(AppContentSection appContentSection) {
        return zzz.zzy(appContentSection).zzg("Actions", appContentSection.getActions()).zzg("Annotations", appContentSection.zzzt()).zzg("Cards", appContentSection.zzzD()).zzg("CardType", appContentSection.zzzE()).zzg("ContentDescription", appContentSection.zzzj()).zzg("Extras", appContentSection.getExtras()).zzg("Id", appContentSection.getId()).zzg("Subtitle", appContentSection.zzzv()).zzg("Title", appContentSection.getTitle()).zzg("Type", appContentSection.getType()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzzF();
    }

    public List<AppContentAction> getActions() {
        return new ArrayList(this.mActions);
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
        AppContentSectionEntityCreator.zza(this, parcel, i);
    }

    public List<AppContentCard> zzzD() {
        return new ArrayList(this.zzaKF);
    }

    public String zzzE() {
        return this.zzaKG;
    }

    public AppContentSection zzzF() {
        return this;
    }

    public String zzzj() {
        return this.zzaKo;
    }

    public List<AppContentAnnotation> zzzt() {
        return new ArrayList(this.zzaKx);
    }

    public String zzzv() {
        return this.zzaKz;
    }
}
