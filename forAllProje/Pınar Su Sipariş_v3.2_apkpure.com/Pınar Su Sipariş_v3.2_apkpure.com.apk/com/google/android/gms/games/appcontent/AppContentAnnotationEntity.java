package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class AppContentAnnotationEntity extends AbstractSafeParcelable implements AppContentAnnotation {
    public static final AppContentAnnotationEntityCreator CREATOR = new AppContentAnnotationEntityCreator();
    private final int mVersionCode;
    private final String zzBc;
    private final String zzVw;
    private final Uri zzaKr;
    private final String zzaKs;
    private final String zzaKt;
    private final int zzaKu;
    private final int zzaKv;
    private final Bundle zzaKw;
    private final String zzavG;

    AppContentAnnotationEntity(int i, String str, Uri uri, String str2, String str3, String str4, String str5, int i2, int i3, Bundle bundle) {
        this.mVersionCode = i;
        this.zzVw = str;
        this.zzBc = str3;
        this.zzaKt = str5;
        this.zzaKu = i2;
        this.zzaKr = uri;
        this.zzaKv = i3;
        this.zzaKs = str4;
        this.zzaKw = bundle;
        this.zzavG = str2;
    }

    public AppContentAnnotationEntity(AppContentAnnotation appContentAnnotation) {
        this.mVersionCode = 4;
        this.zzVw = appContentAnnotation.getDescription();
        this.zzBc = appContentAnnotation.getId();
        this.zzaKt = appContentAnnotation.zzzm();
        this.zzaKu = appContentAnnotation.zzzn();
        this.zzaKr = appContentAnnotation.zzzo();
        this.zzaKv = appContentAnnotation.zzzq();
        this.zzaKs = appContentAnnotation.zzzr();
        this.zzaKw = appContentAnnotation.zzzp();
        this.zzavG = appContentAnnotation.getTitle();
    }

    static int zza(AppContentAnnotation appContentAnnotation) {
        return zzz.hashCode(appContentAnnotation.getDescription(), appContentAnnotation.getId(), appContentAnnotation.zzzm(), Integer.valueOf(appContentAnnotation.zzzn()), appContentAnnotation.zzzo(), Integer.valueOf(appContentAnnotation.zzzq()), appContentAnnotation.zzzr(), appContentAnnotation.zzzp(), appContentAnnotation.getTitle());
    }

    static boolean zza(AppContentAnnotation appContentAnnotation, Object obj) {
        if (!(obj instanceof AppContentAnnotation)) {
            return false;
        }
        if (appContentAnnotation == obj) {
            return true;
        }
        AppContentAnnotation appContentAnnotation2 = (AppContentAnnotation) obj;
        return zzz.equal(appContentAnnotation2.getDescription(), appContentAnnotation.getDescription()) && zzz.equal(appContentAnnotation2.getId(), appContentAnnotation.getId()) && zzz.equal(appContentAnnotation2.zzzm(), appContentAnnotation.zzzm()) && zzz.equal(Integer.valueOf(appContentAnnotation2.zzzn()), Integer.valueOf(appContentAnnotation.zzzn())) && zzz.equal(appContentAnnotation2.zzzo(), appContentAnnotation.zzzo()) && zzz.equal(Integer.valueOf(appContentAnnotation2.zzzq()), Integer.valueOf(appContentAnnotation.zzzq())) && zzz.equal(appContentAnnotation2.zzzr(), appContentAnnotation.zzzr()) && zzz.equal(appContentAnnotation2.zzzp(), appContentAnnotation.zzzp()) && zzz.equal(appContentAnnotation2.getTitle(), appContentAnnotation.getTitle());
    }

    static String zzb(AppContentAnnotation appContentAnnotation) {
        return zzz.zzy(appContentAnnotation).zzg("Description", appContentAnnotation.getDescription()).zzg("Id", appContentAnnotation.getId()).zzg("ImageDefaultId", appContentAnnotation.zzzm()).zzg("ImageHeight", Integer.valueOf(appContentAnnotation.zzzn())).zzg("ImageUri", appContentAnnotation.zzzo()).zzg("ImageWidth", Integer.valueOf(appContentAnnotation.zzzq())).zzg("LayoutSlot", appContentAnnotation.zzzr()).zzg("Modifiers", appContentAnnotation.zzzp()).zzg("Title", appContentAnnotation.getTitle()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzzs();
    }

    public String getDescription() {
        return this.zzVw;
    }

    public String getId() {
        return this.zzBc;
    }

    public String getTitle() {
        return this.zzavG;
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
        AppContentAnnotationEntityCreator.zza(this, parcel, i);
    }

    public String zzzm() {
        return this.zzaKt;
    }

    public int zzzn() {
        return this.zzaKu;
    }

    public Uri zzzo() {
        return this.zzaKr;
    }

    public Bundle zzzp() {
        return this.zzaKw;
    }

    public int zzzq() {
        return this.zzaKv;
    }

    public String zzzr() {
        return this.zzaKs;
    }

    public AppContentAnnotation zzzs() {
        return this;
    }
}
