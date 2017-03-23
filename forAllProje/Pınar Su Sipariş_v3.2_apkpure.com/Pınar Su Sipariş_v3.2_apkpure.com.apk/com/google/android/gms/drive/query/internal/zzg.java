package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.Filter;
import java.util.List;

public class zzg implements zzf<Boolean> {
    private Boolean zzaAU = Boolean.valueOf(false);

    private zzg() {
    }

    public static boolean zza(Filter filter) {
        return filter == null ? false : ((Boolean) filter.zza(new zzg())).booleanValue();
    }

    public /* synthetic */ Object zzC(Object obj) {
        return zzd((Boolean) obj);
    }

    public /* synthetic */ Object zzb(zzb com_google_android_gms_drive_metadata_zzb, Object obj) {
        return zzc(com_google_android_gms_drive_metadata_zzb, obj);
    }

    public /* synthetic */ Object zzb(Operator operator, MetadataField metadataField, Object obj) {
        return zzc(operator, metadataField, obj);
    }

    public /* synthetic */ Object zzb(Operator operator, List list) {
        return zzc(operator, list);
    }

    public <T> Boolean zzc(zzb<T> com_google_android_gms_drive_metadata_zzb_T, T t) {
        return this.zzaAU;
    }

    public <T> Boolean zzc(Operator operator, MetadataField<T> metadataField, T t) {
        return this.zzaAU;
    }

    public Boolean zzc(Operator operator, List<Boolean> list) {
        return this.zzaAU;
    }

    public Boolean zzd(Boolean bool) {
        return this.zzaAU;
    }

    public /* synthetic */ Object zzdJ(String str) {
        return zzdK(str);
    }

    public Boolean zzdK(String str) {
        if (!str.isEmpty()) {
            this.zzaAU = Boolean.valueOf(true);
        }
        return this.zzaAU;
    }

    public /* synthetic */ Object zze(MetadataField metadataField) {
        return zzf(metadataField);
    }

    public /* synthetic */ Object zze(MetadataField metadataField, Object obj) {
        return zzf(metadataField, obj);
    }

    public Boolean zzf(MetadataField<?> metadataField) {
        return this.zzaAU;
    }

    public <T> Boolean zzf(MetadataField<T> metadataField, T t) {
        return this.zzaAU;
    }

    public /* synthetic */ Object zzwY() {
        return zzxb();
    }

    public /* synthetic */ Object zzwZ() {
        return zzxa();
    }

    public Boolean zzxa() {
        return this.zzaAU;
    }

    public Boolean zzxb() {
        return this.zzaAU;
    }
}
