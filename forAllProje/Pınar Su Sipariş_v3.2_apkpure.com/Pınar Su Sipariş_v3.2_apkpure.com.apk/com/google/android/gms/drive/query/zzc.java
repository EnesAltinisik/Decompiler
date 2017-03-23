package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.zzf;
import java.util.List;

public class zzc implements zzf<String> {
    public /* synthetic */ Object zzC(Object obj) {
        return zzdH((String) obj);
    }

    public <T> String zza(zzb<T> com_google_android_gms_drive_metadata_zzb_T, T t) {
        return String.format("contains(%s,%s)", new Object[]{com_google_android_gms_drive_metadata_zzb_T.getName(), t});
    }

    public <T> String zza(Operator operator, MetadataField<T> metadataField, T t) {
        return String.format("cmp(%s,%s,%s)", new Object[]{operator.getTag(), metadataField.getName(), t});
    }

    public String zza(Operator operator, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(operator.getTag()).concat("("));
        String str = "";
        for (String str2 : list) {
            stringBuilder.append(str);
            stringBuilder.append(str2);
            str = ",";
        }
        return stringBuilder.append(")").toString();
    }

    public /* synthetic */ Object zzb(zzb com_google_android_gms_drive_metadata_zzb, Object obj) {
        return zza(com_google_android_gms_drive_metadata_zzb, obj);
    }

    public /* synthetic */ Object zzb(Operator operator, MetadataField metadataField, Object obj) {
        return zza(operator, metadataField, obj);
    }

    public /* synthetic */ Object zzb(Operator operator, List list) {
        return zza(operator, list);
    }

    public String zzd(MetadataField<?> metadataField) {
        return String.format("fieldOnly(%s)", new Object[]{metadataField.getName()});
    }

    public <T> String zzd(MetadataField<T> metadataField, T t) {
        return String.format("has(%s,%s)", new Object[]{metadataField.getName(), t});
    }

    public String zzdH(String str) {
        return String.format("not(%s)", new Object[]{str});
    }

    public String zzdI(String str) {
        return String.format("fullTextSearch(%s)", new Object[]{str});
    }

    public /* synthetic */ Object zzdJ(String str) {
        return zzdI(str);
    }

    public /* synthetic */ Object zze(MetadataField metadataField) {
        return zzd(metadataField);
    }

    public /* synthetic */ Object zze(MetadataField metadataField, Object obj) {
        return zzd(metadataField, obj);
    }

    public String zzwW() {
        return "all()";
    }

    public String zzwX() {
        return "ownedByMe()";
    }

    public /* synthetic */ Object zzwY() {
        return zzwX();
    }

    public /* synthetic */ Object zzwZ() {
        return zzwW();
    }
}
