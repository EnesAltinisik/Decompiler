package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PersonEntity extends FastSafeParcelableJsonResponse implements Person {
    public static final zza CREATOR = new zza();
    private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
    final int mVersionCode;
    String zzBc;
    String zzE;
    String zzVp;
    String zzaco;
    final Set<Integer> zzblS;
    String zzblT;
    AgeRangeEntity zzblU;
    String zzblV;
    String zzblW;
    int zzblX;
    CoverEntity zzblY;
    String zzblZ;
    ImageEntity zzbma;
    boolean zzbmb;
    NameEntity zzbmc;
    String zzbmd;
    int zzbme;
    List<OrganizationsEntity> zzbmf;
    List<PlacesLivedEntity> zzbmg;
    int zzbmh;
    int zzbmi;
    String zzbmj;
    List<UrlsEntity> zzbmk;
    boolean zzbml;
    int zzve;

    public static final class AgeRangeEntity extends FastSafeParcelableJsonResponse implements AgeRange {
        public static final zzb CREATOR = new zzb();
        private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
        final int mVersionCode;
        final Set<Integer> zzblS;
        int zzbmm;
        int zzbmn;

        static {
            zzblR.put("max", Field.zzi("max", 2));
            zzblR.put("min", Field.zzi("min", 3));
        }

        public AgeRangeEntity() {
            this.mVersionCode = 1;
            this.zzblS = new HashSet();
        }

        AgeRangeEntity(Set<Integer> set, int i, int i2, int i3) {
            this.zzblS = set;
            this.mVersionCode = i;
            this.zzbmm = i2;
            this.zzbmn = i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AgeRangeEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            AgeRangeEntity ageRangeEntity = (AgeRangeEntity) obj;
            for (Field field : zzblR.values()) {
                if (zza(field)) {
                    if (!ageRangeEntity.zza(field)) {
                        return false;
                    }
                    if (!zzb(field).equals(ageRangeEntity.zzb(field))) {
                        return false;
                    }
                } else if (ageRangeEntity.zza(field)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzIz();
        }

        public int getMax() {
            return this.zzbmm;
        }

        public int getMin() {
            return this.zzbmn;
        }

        public boolean hasMax() {
            return this.zzblS.contains(Integer.valueOf(2));
        }

        public boolean hasMin() {
            return this.zzblS.contains(Integer.valueOf(3));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : zzblR.values()) {
                int hashCode;
                if (zza(field)) {
                    hashCode = zzb(field).hashCode() + (i + field.zzul());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzb com_google_android_gms_plus_internal_model_people_zzb = CREATOR;
            zzb.zza(this, parcel, i);
        }

        public HashMap<String, Field<?, ?>> zzIx() {
            return zzblR;
        }

        public AgeRangeEntity zzIz() {
            return this;
        }

        protected boolean zza(Field field) {
            return this.zzblS.contains(Integer.valueOf(field.zzul()));
        }

        protected Object zzb(Field field) {
            switch (field.zzul()) {
                case 2:
                    return Integer.valueOf(this.zzbmm);
                case 3:
                    return Integer.valueOf(this.zzbmn);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
            }
        }

        public /* synthetic */ Map zzuf() {
            return zzIx();
        }
    }

    public static final class CoverEntity extends FastSafeParcelableJsonResponse implements Cover {
        public static final zzc CREATOR = new zzc();
        private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
        final int mVersionCode;
        final Set<Integer> zzblS;
        CoverInfoEntity zzbmo;
        CoverPhotoEntity zzbmp;
        int zzbmq;

        public static final class CoverInfoEntity extends FastSafeParcelableJsonResponse implements CoverInfo {
            public static final zzd CREATOR = new zzd();
            private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
            final int mVersionCode;
            final Set<Integer> zzblS;
            int zzbmr;
            int zzbms;

            static {
                zzblR.put("leftImageOffset", Field.zzi("leftImageOffset", 2));
                zzblR.put("topImageOffset", Field.zzi("topImageOffset", 3));
            }

            public CoverInfoEntity() {
                this.mVersionCode = 1;
                this.zzblS = new HashSet();
            }

            CoverInfoEntity(Set<Integer> set, int i, int i2, int i3) {
                this.zzblS = set;
                this.mVersionCode = i;
                this.zzbmr = i2;
                this.zzbms = i3;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof CoverInfoEntity)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                CoverInfoEntity coverInfoEntity = (CoverInfoEntity) obj;
                for (Field field : zzblR.values()) {
                    if (zza(field)) {
                        if (!coverInfoEntity.zza(field)) {
                            return false;
                        }
                        if (!zzb(field).equals(coverInfoEntity.zzb(field))) {
                            return false;
                        }
                    } else if (coverInfoEntity.zza(field)) {
                        return false;
                    }
                }
                return true;
            }

            public /* synthetic */ Object freeze() {
                return zzIB();
            }

            public int getLeftImageOffset() {
                return this.zzbmr;
            }

            public int getTopImageOffset() {
                return this.zzbms;
            }

            public boolean hasLeftImageOffset() {
                return this.zzblS.contains(Integer.valueOf(2));
            }

            public boolean hasTopImageOffset() {
                return this.zzblS.contains(Integer.valueOf(3));
            }

            public int hashCode() {
                int i = 0;
                for (Field field : zzblR.values()) {
                    int hashCode;
                    if (zza(field)) {
                        hashCode = zzb(field).hashCode() + (i + field.zzul());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public boolean isDataValid() {
                return true;
            }

            public void writeToParcel(Parcel parcel, int i) {
                zzd com_google_android_gms_plus_internal_model_people_zzd = CREATOR;
                zzd.zza(this, parcel, i);
            }

            public CoverInfoEntity zzIB() {
                return this;
            }

            public HashMap<String, Field<?, ?>> zzIx() {
                return zzblR;
            }

            protected boolean zza(Field field) {
                return this.zzblS.contains(Integer.valueOf(field.zzul()));
            }

            protected Object zzb(Field field) {
                switch (field.zzul()) {
                    case 2:
                        return Integer.valueOf(this.zzbmr);
                    case 3:
                        return Integer.valueOf(this.zzbms);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
                }
            }

            public /* synthetic */ Map zzuf() {
                return zzIx();
            }
        }

        public static final class CoverPhotoEntity extends FastSafeParcelableJsonResponse implements CoverPhoto {
            public static final zze CREATOR = new zze();
            private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
            final int mVersionCode;
            String zzE;
            final Set<Integer> zzblS;
            int zzpi;
            int zzpj;

            static {
                zzblR.put("height", Field.zzi("height", 2));
                zzblR.put(PlusShare.KEY_CALL_TO_ACTION_URL, Field.zzk(PlusShare.KEY_CALL_TO_ACTION_URL, 3));
                zzblR.put("width", Field.zzi("width", 4));
            }

            public CoverPhotoEntity() {
                this.mVersionCode = 1;
                this.zzblS = new HashSet();
            }

            CoverPhotoEntity(Set<Integer> set, int i, int i2, String str, int i3) {
                this.zzblS = set;
                this.mVersionCode = i;
                this.zzpj = i2;
                this.zzE = str;
                this.zzpi = i3;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof CoverPhotoEntity)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                CoverPhotoEntity coverPhotoEntity = (CoverPhotoEntity) obj;
                for (Field field : zzblR.values()) {
                    if (zza(field)) {
                        if (!coverPhotoEntity.zza(field)) {
                            return false;
                        }
                        if (!zzb(field).equals(coverPhotoEntity.zzb(field))) {
                            return false;
                        }
                    } else if (coverPhotoEntity.zza(field)) {
                        return false;
                    }
                }
                return true;
            }

            public /* synthetic */ Object freeze() {
                return zzIC();
            }

            public int getHeight() {
                return this.zzpj;
            }

            public String getUrl() {
                return this.zzE;
            }

            public int getWidth() {
                return this.zzpi;
            }

            public boolean hasHeight() {
                return this.zzblS.contains(Integer.valueOf(2));
            }

            public boolean hasUrl() {
                return this.zzblS.contains(Integer.valueOf(3));
            }

            public boolean hasWidth() {
                return this.zzblS.contains(Integer.valueOf(4));
            }

            public int hashCode() {
                int i = 0;
                for (Field field : zzblR.values()) {
                    int hashCode;
                    if (zza(field)) {
                        hashCode = zzb(field).hashCode() + (i + field.zzul());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public boolean isDataValid() {
                return true;
            }

            public void writeToParcel(Parcel parcel, int i) {
                zze com_google_android_gms_plus_internal_model_people_zze = CREATOR;
                zze.zza(this, parcel, i);
            }

            public CoverPhotoEntity zzIC() {
                return this;
            }

            public HashMap<String, Field<?, ?>> zzIx() {
                return zzblR;
            }

            protected boolean zza(Field field) {
                return this.zzblS.contains(Integer.valueOf(field.zzul()));
            }

            protected Object zzb(Field field) {
                switch (field.zzul()) {
                    case 2:
                        return Integer.valueOf(this.zzpj);
                    case 3:
                        return this.zzE;
                    case 4:
                        return Integer.valueOf(this.zzpi);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
                }
            }

            public /* synthetic */ Map zzuf() {
                return zzIx();
            }
        }

        static {
            zzblR.put("coverInfo", Field.zza("coverInfo", 2, CoverInfoEntity.class));
            zzblR.put("coverPhoto", Field.zza("coverPhoto", 3, CoverPhotoEntity.class));
            zzblR.put("layout", Field.zza("layout", 4, new StringToIntConverter().zzh("banner", 0), false));
        }

        public CoverEntity() {
            this.mVersionCode = 1;
            this.zzblS = new HashSet();
        }

        CoverEntity(Set<Integer> set, int i, CoverInfoEntity coverInfoEntity, CoverPhotoEntity coverPhotoEntity, int i2) {
            this.zzblS = set;
            this.mVersionCode = i;
            this.zzbmo = coverInfoEntity;
            this.zzbmp = coverPhotoEntity;
            this.zzbmq = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CoverEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            CoverEntity coverEntity = (CoverEntity) obj;
            for (Field field : zzblR.values()) {
                if (zza(field)) {
                    if (!coverEntity.zza(field)) {
                        return false;
                    }
                    if (!zzb(field).equals(coverEntity.zzb(field))) {
                        return false;
                    }
                } else if (coverEntity.zza(field)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzIA();
        }

        public CoverInfo getCoverInfo() {
            return this.zzbmo;
        }

        public CoverPhoto getCoverPhoto() {
            return this.zzbmp;
        }

        public int getLayout() {
            return this.zzbmq;
        }

        public boolean hasCoverInfo() {
            return this.zzblS.contains(Integer.valueOf(2));
        }

        public boolean hasCoverPhoto() {
            return this.zzblS.contains(Integer.valueOf(3));
        }

        public boolean hasLayout() {
            return this.zzblS.contains(Integer.valueOf(4));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : zzblR.values()) {
                int hashCode;
                if (zza(field)) {
                    hashCode = zzb(field).hashCode() + (i + field.zzul());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzc com_google_android_gms_plus_internal_model_people_zzc = CREATOR;
            zzc.zza(this, parcel, i);
        }

        public CoverEntity zzIA() {
            return this;
        }

        public HashMap<String, Field<?, ?>> zzIx() {
            return zzblR;
        }

        protected boolean zza(Field field) {
            return this.zzblS.contains(Integer.valueOf(field.zzul()));
        }

        protected Object zzb(Field field) {
            switch (field.zzul()) {
                case 2:
                    return this.zzbmo;
                case 3:
                    return this.zzbmp;
                case 4:
                    return Integer.valueOf(this.zzbmq);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
            }
        }

        public /* synthetic */ Map zzuf() {
            return zzIx();
        }
    }

    public static final class ImageEntity extends FastSafeParcelableJsonResponse implements Image {
        public static final zzf CREATOR = new zzf();
        private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
        final int mVersionCode;
        String zzE;
        final Set<Integer> zzblS;

        static {
            zzblR.put(PlusShare.KEY_CALL_TO_ACTION_URL, Field.zzk(PlusShare.KEY_CALL_TO_ACTION_URL, 2));
        }

        public ImageEntity() {
            this.mVersionCode = 1;
            this.zzblS = new HashSet();
        }

        public ImageEntity(String str) {
            this.zzblS = new HashSet();
            this.mVersionCode = 1;
            this.zzE = str;
            this.zzblS.add(Integer.valueOf(2));
        }

        ImageEntity(Set<Integer> set, int i, String str) {
            this.zzblS = set;
            this.mVersionCode = i;
            this.zzE = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ImageEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ImageEntity imageEntity = (ImageEntity) obj;
            for (Field field : zzblR.values()) {
                if (zza(field)) {
                    if (!imageEntity.zza(field)) {
                        return false;
                    }
                    if (!zzb(field).equals(imageEntity.zzb(field))) {
                        return false;
                    }
                } else if (imageEntity.zza(field)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzID();
        }

        public String getUrl() {
            return this.zzE;
        }

        public boolean hasUrl() {
            return this.zzblS.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : zzblR.values()) {
                int hashCode;
                if (zza(field)) {
                    hashCode = zzb(field).hashCode() + (i + field.zzul());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzf com_google_android_gms_plus_internal_model_people_zzf = CREATOR;
            zzf.zza(this, parcel, i);
        }

        public ImageEntity zzID() {
            return this;
        }

        public HashMap<String, Field<?, ?>> zzIx() {
            return zzblR;
        }

        protected boolean zza(Field field) {
            return this.zzblS.contains(Integer.valueOf(field.zzul()));
        }

        protected Object zzb(Field field) {
            switch (field.zzul()) {
                case 2:
                    return this.zzE;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
            }
        }

        public /* synthetic */ Map zzuf() {
            return zzIx();
        }
    }

    public static final class NameEntity extends FastSafeParcelableJsonResponse implements Name {
        public static final zzg CREATOR = new zzg();
        private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
        final int mVersionCode;
        String zzact;
        String zzacu;
        final Set<Integer> zzblS;
        String zzbmt;
        String zzbmu;
        String zzbmv;
        String zzbmw;

        static {
            zzblR.put("familyName", Field.zzk("familyName", 2));
            zzblR.put("formatted", Field.zzk("formatted", 3));
            zzblR.put("givenName", Field.zzk("givenName", 4));
            zzblR.put("honorificPrefix", Field.zzk("honorificPrefix", 5));
            zzblR.put("honorificSuffix", Field.zzk("honorificSuffix", 6));
            zzblR.put("middleName", Field.zzk("middleName", 7));
        }

        public NameEntity() {
            this.mVersionCode = 1;
            this.zzblS = new HashSet();
        }

        NameEntity(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.zzblS = set;
            this.mVersionCode = i;
            this.zzacu = str;
            this.zzbmt = str2;
            this.zzact = str3;
            this.zzbmu = str4;
            this.zzbmv = str5;
            this.zzbmw = str6;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof NameEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            NameEntity nameEntity = (NameEntity) obj;
            for (Field field : zzblR.values()) {
                if (zza(field)) {
                    if (!nameEntity.zza(field)) {
                        return false;
                    }
                    if (!zzb(field).equals(nameEntity.zzb(field))) {
                        return false;
                    }
                } else if (nameEntity.zza(field)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzIE();
        }

        public String getFamilyName() {
            return this.zzacu;
        }

        public String getFormatted() {
            return this.zzbmt;
        }

        public String getGivenName() {
            return this.zzact;
        }

        public String getHonorificPrefix() {
            return this.zzbmu;
        }

        public String getHonorificSuffix() {
            return this.zzbmv;
        }

        public String getMiddleName() {
            return this.zzbmw;
        }

        public boolean hasFamilyName() {
            return this.zzblS.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted() {
            return this.zzblS.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName() {
            return this.zzblS.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix() {
            return this.zzblS.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix() {
            return this.zzblS.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName() {
            return this.zzblS.contains(Integer.valueOf(7));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : zzblR.values()) {
                int hashCode;
                if (zza(field)) {
                    hashCode = zzb(field).hashCode() + (i + field.zzul());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzg com_google_android_gms_plus_internal_model_people_zzg = CREATOR;
            zzg.zza(this, parcel, i);
        }

        public NameEntity zzIE() {
            return this;
        }

        public HashMap<String, Field<?, ?>> zzIx() {
            return zzblR;
        }

        protected boolean zza(Field field) {
            return this.zzblS.contains(Integer.valueOf(field.zzul()));
        }

        protected Object zzb(Field field) {
            switch (field.zzul()) {
                case 2:
                    return this.zzacu;
                case 3:
                    return this.zzbmt;
                case 4:
                    return this.zzact;
                case 5:
                    return this.zzbmu;
                case 6:
                    return this.zzbmv;
                case 7:
                    return this.zzbmw;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
            }
        }

        public /* synthetic */ Map zzuf() {
            return zzIx();
        }
    }

    public static final class OrganizationsEntity extends FastSafeParcelableJsonResponse implements Organizations {
        public static final zzh CREATOR = new zzh();
        private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
        String mName;
        final int mVersionCode;
        String zzVw;
        int zzagd;
        String zzavG;
        final Set<Integer> zzblS;
        boolean zzbmA;
        String zzbmB;
        String zzbmx;
        String zzbmy;
        String zzbmz;

        static {
            zzblR.put("department", Field.zzk("department", 2));
            zzblR.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, Field.zzk(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 3));
            zzblR.put("endDate", Field.zzk("endDate", 4));
            zzblR.put(Param.LOCATION, Field.zzk(Param.LOCATION, 5));
            zzblR.put("name", Field.zzk("name", 6));
            zzblR.put("primary", Field.zzj("primary", 7));
            zzblR.put("startDate", Field.zzk("startDate", 8));
            zzblR.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, Field.zzk(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, 9));
            zzblR.put("type", Field.zza("type", 10, new StringToIntConverter().zzh("work", 0).zzh("school", 1), false));
        }

        public OrganizationsEntity() {
            this.mVersionCode = 1;
            this.zzblS = new HashSet();
        }

        OrganizationsEntity(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.zzblS = set;
            this.mVersionCode = i;
            this.zzbmx = str;
            this.zzVw = str2;
            this.zzbmy = str3;
            this.zzbmz = str4;
            this.mName = str5;
            this.zzbmA = z;
            this.zzbmB = str6;
            this.zzavG = str7;
            this.zzagd = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OrganizationsEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            OrganizationsEntity organizationsEntity = (OrganizationsEntity) obj;
            for (Field field : zzblR.values()) {
                if (zza(field)) {
                    if (!organizationsEntity.zza(field)) {
                        return false;
                    }
                    if (!zzb(field).equals(organizationsEntity.zzb(field))) {
                        return false;
                    }
                } else if (organizationsEntity.zza(field)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzIF();
        }

        public String getDepartment() {
            return this.zzbmx;
        }

        public String getDescription() {
            return this.zzVw;
        }

        public String getEndDate() {
            return this.zzbmy;
        }

        public String getLocation() {
            return this.zzbmz;
        }

        public String getName() {
            return this.mName;
        }

        public String getStartDate() {
            return this.zzbmB;
        }

        public String getTitle() {
            return this.zzavG;
        }

        public int getType() {
            return this.zzagd;
        }

        public boolean hasDepartment() {
            return this.zzblS.contains(Integer.valueOf(2));
        }

        public boolean hasDescription() {
            return this.zzblS.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate() {
            return this.zzblS.contains(Integer.valueOf(4));
        }

        public boolean hasLocation() {
            return this.zzblS.contains(Integer.valueOf(5));
        }

        public boolean hasName() {
            return this.zzblS.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary() {
            return this.zzblS.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate() {
            return this.zzblS.contains(Integer.valueOf(8));
        }

        public boolean hasTitle() {
            return this.zzblS.contains(Integer.valueOf(9));
        }

        public boolean hasType() {
            return this.zzblS.contains(Integer.valueOf(10));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : zzblR.values()) {
                int hashCode;
                if (zza(field)) {
                    hashCode = zzb(field).hashCode() + (i + field.zzul());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.zzbmA;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzh com_google_android_gms_plus_internal_model_people_zzh = CREATOR;
            zzh.zza(this, parcel, i);
        }

        public OrganizationsEntity zzIF() {
            return this;
        }

        public HashMap<String, Field<?, ?>> zzIx() {
            return zzblR;
        }

        protected boolean zza(Field field) {
            return this.zzblS.contains(Integer.valueOf(field.zzul()));
        }

        protected Object zzb(Field field) {
            switch (field.zzul()) {
                case 2:
                    return this.zzbmx;
                case 3:
                    return this.zzVw;
                case 4:
                    return this.zzbmy;
                case 5:
                    return this.zzbmz;
                case 6:
                    return this.mName;
                case 7:
                    return Boolean.valueOf(this.zzbmA);
                case 8:
                    return this.zzbmB;
                case 9:
                    return this.zzavG;
                case 10:
                    return Integer.valueOf(this.zzagd);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
            }
        }

        public /* synthetic */ Map zzuf() {
            return zzIx();
        }
    }

    public static final class PlacesLivedEntity extends FastSafeParcelableJsonResponse implements PlacesLived {
        public static final zzi CREATOR = new zzi();
        private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
        String mValue;
        final int mVersionCode;
        final Set<Integer> zzblS;
        boolean zzbmA;

        static {
            zzblR.put("primary", Field.zzj("primary", 2));
            zzblR.put(Param.VALUE, Field.zzk(Param.VALUE, 3));
        }

        public PlacesLivedEntity() {
            this.mVersionCode = 1;
            this.zzblS = new HashSet();
        }

        PlacesLivedEntity(Set<Integer> set, int i, boolean z, String str) {
            this.zzblS = set;
            this.mVersionCode = i;
            this.zzbmA = z;
            this.mValue = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PlacesLivedEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            PlacesLivedEntity placesLivedEntity = (PlacesLivedEntity) obj;
            for (Field field : zzblR.values()) {
                if (zza(field)) {
                    if (!placesLivedEntity.zza(field)) {
                        return false;
                    }
                    if (!zzb(field).equals(placesLivedEntity.zzb(field))) {
                        return false;
                    }
                } else if (placesLivedEntity.zza(field)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzIG();
        }

        public String getValue() {
            return this.mValue;
        }

        public boolean hasPrimary() {
            return this.zzblS.contains(Integer.valueOf(2));
        }

        public boolean hasValue() {
            return this.zzblS.contains(Integer.valueOf(3));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : zzblR.values()) {
                int hashCode;
                if (zza(field)) {
                    hashCode = zzb(field).hashCode() + (i + field.zzul());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.zzbmA;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzi com_google_android_gms_plus_internal_model_people_zzi = CREATOR;
            zzi.zza(this, parcel, i);
        }

        public PlacesLivedEntity zzIG() {
            return this;
        }

        public HashMap<String, Field<?, ?>> zzIx() {
            return zzblR;
        }

        protected boolean zza(Field field) {
            return this.zzblS.contains(Integer.valueOf(field.zzul()));
        }

        protected Object zzb(Field field) {
            switch (field.zzul()) {
                case 2:
                    return Boolean.valueOf(this.zzbmA);
                case 3:
                    return this.mValue;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
            }
        }

        public /* synthetic */ Map zzuf() {
            return zzIx();
        }
    }

    public static final class UrlsEntity extends FastSafeParcelableJsonResponse implements Urls {
        public static final zzj CREATOR = new zzj();
        private static final HashMap<String, Field<?, ?>> zzblR = new HashMap();
        String mValue;
        final int mVersionCode;
        String zzVu;
        int zzagd;
        final Set<Integer> zzblS;
        private final int zzbmC;

        static {
            zzblR.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, Field.zzk(PlusShare.KEY_CALL_TO_ACTION_LABEL, 5));
            zzblR.put("type", Field.zza("type", 6, new StringToIntConverter().zzh("home", 0).zzh("work", 1).zzh("blog", 2).zzh(Scopes.PROFILE, 3).zzh(FitnessActivities.OTHER, 4).zzh("otherProfile", 5).zzh("contributor", 6).zzh("website", 7), false));
            zzblR.put(Param.VALUE, Field.zzk(Param.VALUE, 4));
        }

        public UrlsEntity() {
            this.zzbmC = 4;
            this.mVersionCode = 1;
            this.zzblS = new HashSet();
        }

        UrlsEntity(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
            this.zzbmC = 4;
            this.zzblS = set;
            this.mVersionCode = i;
            this.zzVu = str;
            this.zzagd = i2;
            this.mValue = str2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof UrlsEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            UrlsEntity urlsEntity = (UrlsEntity) obj;
            for (Field field : zzblR.values()) {
                if (zza(field)) {
                    if (!urlsEntity.zza(field)) {
                        return false;
                    }
                    if (!zzb(field).equals(urlsEntity.zzb(field))) {
                        return false;
                    }
                } else if (urlsEntity.zza(field)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzII();
        }

        public String getLabel() {
            return this.zzVu;
        }

        public int getType() {
            return this.zzagd;
        }

        public String getValue() {
            return this.mValue;
        }

        public boolean hasLabel() {
            return this.zzblS.contains(Integer.valueOf(5));
        }

        public boolean hasType() {
            return this.zzblS.contains(Integer.valueOf(6));
        }

        public boolean hasValue() {
            return this.zzblS.contains(Integer.valueOf(4));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : zzblR.values()) {
                int hashCode;
                if (zza(field)) {
                    hashCode = zzb(field).hashCode() + (i + field.zzul());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzj com_google_android_gms_plus_internal_model_people_zzj = CREATOR;
            zzj.zza(this, parcel, i);
        }

        @Deprecated
        public int zzIH() {
            return 4;
        }

        public UrlsEntity zzII() {
            return this;
        }

        public HashMap<String, Field<?, ?>> zzIx() {
            return zzblR;
        }

        protected boolean zza(Field field) {
            return this.zzblS.contains(Integer.valueOf(field.zzul()));
        }

        protected Object zzb(Field field) {
            switch (field.zzul()) {
                case 4:
                    return this.mValue;
                case 5:
                    return this.zzVu;
                case 6:
                    return Integer.valueOf(this.zzagd);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
            }
        }

        public /* synthetic */ Map zzuf() {
            return zzIx();
        }
    }

    public static class zza {
        public static int zzgb(String str) {
            if (str.equals("person")) {
                return 0;
            }
            if (str.equals("page")) {
                return 1;
            }
            String str2 = "Unknown objectType string: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    static {
        zzblR.put("aboutMe", Field.zzk("aboutMe", 2));
        zzblR.put("ageRange", Field.zza("ageRange", 3, AgeRangeEntity.class));
        zzblR.put("birthday", Field.zzk("birthday", 4));
        zzblR.put("braggingRights", Field.zzk("braggingRights", 5));
        zzblR.put("circledByCount", Field.zzi("circledByCount", 6));
        zzblR.put("cover", Field.zza("cover", 7, CoverEntity.class));
        zzblR.put("currentLocation", Field.zzk("currentLocation", 8));
        zzblR.put("displayName", Field.zzk("displayName", 9));
        zzblR.put("gender", Field.zza("gender", 12, new StringToIntConverter().zzh("male", 0).zzh("female", 1).zzh(FitnessActivities.OTHER, 2), false));
        zzblR.put("id", Field.zzk("id", 14));
        zzblR.put("image", Field.zza("image", 15, ImageEntity.class));
        zzblR.put("isPlusUser", Field.zzj("isPlusUser", 16));
        zzblR.put("language", Field.zzk("language", 18));
        zzblR.put("name", Field.zza("name", 19, NameEntity.class));
        zzblR.put("nickname", Field.zzk("nickname", 20));
        zzblR.put("objectType", Field.zza("objectType", 21, new StringToIntConverter().zzh("person", 0).zzh("page", 1), false));
        zzblR.put("organizations", Field.zzb("organizations", 22, OrganizationsEntity.class));
        zzblR.put("placesLived", Field.zzb("placesLived", 23, PlacesLivedEntity.class));
        zzblR.put("plusOneCount", Field.zzi("plusOneCount", 24));
        zzblR.put("relationshipStatus", Field.zza("relationshipStatus", 25, new StringToIntConverter().zzh("single", 0).zzh("in_a_relationship", 1).zzh("engaged", 2).zzh("married", 3).zzh("its_complicated", 4).zzh("open_relationship", 5).zzh("widowed", 6).zzh("in_domestic_partnership", 7).zzh("in_civil_union", 8), false));
        zzblR.put("tagline", Field.zzk("tagline", 26));
        zzblR.put(PlusShare.KEY_CALL_TO_ACTION_URL, Field.zzk(PlusShare.KEY_CALL_TO_ACTION_URL, 27));
        zzblR.put("urls", Field.zzb("urls", 28, UrlsEntity.class));
        zzblR.put("verified", Field.zzj("verified", 29));
    }

    public PersonEntity() {
        this.mVersionCode = 1;
        this.zzblS = new HashSet();
    }

    public PersonEntity(String str, String str2, ImageEntity imageEntity, int i, String str3) {
        this.mVersionCode = 1;
        this.zzblS = new HashSet();
        this.zzaco = str;
        this.zzblS.add(Integer.valueOf(9));
        this.zzBc = str2;
        this.zzblS.add(Integer.valueOf(14));
        this.zzbma = imageEntity;
        this.zzblS.add(Integer.valueOf(15));
        this.zzbme = i;
        this.zzblS.add(Integer.valueOf(21));
        this.zzE = str3;
        this.zzblS.add(Integer.valueOf(27));
    }

    PersonEntity(Set<Integer> set, int i, String str, AgeRangeEntity ageRangeEntity, String str2, String str3, int i2, CoverEntity coverEntity, String str4, String str5, int i3, String str6, ImageEntity imageEntity, boolean z, String str7, NameEntity nameEntity, String str8, int i4, List<OrganizationsEntity> list, List<PlacesLivedEntity> list2, int i5, int i6, String str9, String str10, List<UrlsEntity> list3, boolean z2) {
        this.zzblS = set;
        this.mVersionCode = i;
        this.zzblT = str;
        this.zzblU = ageRangeEntity;
        this.zzblV = str2;
        this.zzblW = str3;
        this.zzblX = i2;
        this.zzblY = coverEntity;
        this.zzblZ = str4;
        this.zzaco = str5;
        this.zzve = i3;
        this.zzBc = str6;
        this.zzbma = imageEntity;
        this.zzbmb = z;
        this.zzVp = str7;
        this.zzbmc = nameEntity;
        this.zzbmd = str8;
        this.zzbme = i4;
        this.zzbmf = list;
        this.zzbmg = list2;
        this.zzbmh = i5;
        this.zzbmi = i6;
        this.zzbmj = str9;
        this.zzE = str10;
        this.zzbmk = list3;
        this.zzbml = z2;
    }

    public static PersonEntity zzx(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        PersonEntity personEntity = (PersonEntity) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return personEntity;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonEntity personEntity = (PersonEntity) obj;
        for (Field field : zzblR.values()) {
            if (zza(field)) {
                if (!personEntity.zza(field)) {
                    return false;
                }
                if (!zzb(field).equals(personEntity.zzb(field))) {
                    return false;
                }
            } else if (personEntity.zza(field)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ Object freeze() {
        return zzIy();
    }

    public String getAboutMe() {
        return this.zzblT;
    }

    public AgeRange getAgeRange() {
        return this.zzblU;
    }

    public String getBirthday() {
        return this.zzblV;
    }

    public String getBraggingRights() {
        return this.zzblW;
    }

    public int getCircledByCount() {
        return this.zzblX;
    }

    public Cover getCover() {
        return this.zzblY;
    }

    public String getCurrentLocation() {
        return this.zzblZ;
    }

    public String getDisplayName() {
        return this.zzaco;
    }

    public int getGender() {
        return this.zzve;
    }

    public String getId() {
        return this.zzBc;
    }

    public Image getImage() {
        return this.zzbma;
    }

    public String getLanguage() {
        return this.zzVp;
    }

    public Name getName() {
        return this.zzbmc;
    }

    public String getNickname() {
        return this.zzbmd;
    }

    public int getObjectType() {
        return this.zzbme;
    }

    public List<Organizations> getOrganizations() {
        return (ArrayList) this.zzbmf;
    }

    public List<PlacesLived> getPlacesLived() {
        return (ArrayList) this.zzbmg;
    }

    public int getPlusOneCount() {
        return this.zzbmh;
    }

    public int getRelationshipStatus() {
        return this.zzbmi;
    }

    public String getTagline() {
        return this.zzbmj;
    }

    public String getUrl() {
        return this.zzE;
    }

    public List<Urls> getUrls() {
        return (ArrayList) this.zzbmk;
    }

    public boolean hasAboutMe() {
        return this.zzblS.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange() {
        return this.zzblS.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday() {
        return this.zzblS.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights() {
        return this.zzblS.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount() {
        return this.zzblS.contains(Integer.valueOf(6));
    }

    public boolean hasCover() {
        return this.zzblS.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation() {
        return this.zzblS.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName() {
        return this.zzblS.contains(Integer.valueOf(9));
    }

    public boolean hasGender() {
        return this.zzblS.contains(Integer.valueOf(12));
    }

    public boolean hasId() {
        return this.zzblS.contains(Integer.valueOf(14));
    }

    public boolean hasImage() {
        return this.zzblS.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser() {
        return this.zzblS.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage() {
        return this.zzblS.contains(Integer.valueOf(18));
    }

    public boolean hasName() {
        return this.zzblS.contains(Integer.valueOf(19));
    }

    public boolean hasNickname() {
        return this.zzblS.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType() {
        return this.zzblS.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations() {
        return this.zzblS.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived() {
        return this.zzblS.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount() {
        return this.zzblS.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus() {
        return this.zzblS.contains(Integer.valueOf(25));
    }

    public boolean hasTagline() {
        return this.zzblS.contains(Integer.valueOf(26));
    }

    public boolean hasUrl() {
        return this.zzblS.contains(Integer.valueOf(27));
    }

    public boolean hasUrls() {
        return this.zzblS.contains(Integer.valueOf(28));
    }

    public boolean hasVerified() {
        return this.zzblS.contains(Integer.valueOf(29));
    }

    public int hashCode() {
        int i = 0;
        for (Field field : zzblR.values()) {
            int hashCode;
            if (zza(field)) {
                hashCode = zzb(field).hashCode() + (i + field.zzul());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isPlusUser() {
        return this.zzbmb;
    }

    public boolean isVerified() {
        return this.zzbml;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza com_google_android_gms_plus_internal_model_people_zza = CREATOR;
        zza.zza(this, parcel, i);
    }

    public HashMap<String, Field<?, ?>> zzIx() {
        return zzblR;
    }

    public PersonEntity zzIy() {
        return this;
    }

    protected boolean zza(Field field) {
        return this.zzblS.contains(Integer.valueOf(field.zzul()));
    }

    protected Object zzb(Field field) {
        switch (field.zzul()) {
            case 2:
                return this.zzblT;
            case 3:
                return this.zzblU;
            case 4:
                return this.zzblV;
            case 5:
                return this.zzblW;
            case 6:
                return Integer.valueOf(this.zzblX);
            case 7:
                return this.zzblY;
            case 8:
                return this.zzblZ;
            case 9:
                return this.zzaco;
            case 12:
                return Integer.valueOf(this.zzve);
            case 14:
                return this.zzBc;
            case 15:
                return this.zzbma;
            case 16:
                return Boolean.valueOf(this.zzbmb);
            case 18:
                return this.zzVp;
            case 19:
                return this.zzbmc;
            case 20:
                return this.zzbmd;
            case 21:
                return Integer.valueOf(this.zzbme);
            case 22:
                return this.zzbmf;
            case 23:
                return this.zzbmg;
            case 24:
                return Integer.valueOf(this.zzbmh);
            case 25:
                return Integer.valueOf(this.zzbmi);
            case 26:
                return this.zzbmj;
            case 27:
                return this.zzE;
            case 28:
                return this.zzbmk;
            case 29:
                return Boolean.valueOf(this.zzbml);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + field.zzul());
        }
    }

    public /* synthetic */ Map zzuf() {
        return zzIx();
    }
}
