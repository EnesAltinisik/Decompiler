package com.google.android.gms.internal;

import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.zzamn.zzb;
import com.google.android.gms.plus.PlusShare;

public class zzqm {
    public static final zzb zzaEA = zzdW("weight");
    public static final zzb zzaEB = zzdW("circumference");
    public static final zzb zzaEC = zzdW("percentage");
    public static final zzb zzaED = zzdW("speed");
    public static final zzb zzaEE = zzdW("rpm");
    public static final zzb zzaEF = zzdU("revolutions");
    public static final zzb zzaEG = zzdW(Field.NUTRIENT_CALORIES);
    public static final zzb zzaEH = zzdW("watts");
    public static final zzb zzaEI = zzdU("meal_type");
    public static final zzb zzaEJ = zzdY("food_item");
    public static final zzb zzaEK = zzea("nutrients");
    public static final zzb zzaEL = zzdW("elevation.change");
    public static final zzb zzaEM = zzea("elevation.gain");
    public static final zzb zzaEN = zzea("elevation.loss");
    public static final zzb zzaEO = zzdW("floors");
    public static final zzb zzaEP = zzea("floor.gain");
    public static final zzb zzaEQ = zzea("floor.loss");
    public static final zzb zzaER = zzdY("exercise");
    public static final zzb zzaES = zzdU("repetitions");
    public static final zzb zzaET = zzdW("resistance");
    public static final zzb zzaEU = zzdU("resistance_type");
    public static final zzb zzaEV = zzdU("num_segments");
    public static final zzb zzaEW = zzdW("average");
    public static final zzb zzaEX = zzdW("max");
    public static final zzb zzaEY = zzdW("min");
    public static final zzb zzaEZ = zzdW("low_latitude");
    public static final zzb zzaEj = zzdU("activity");
    public static final zzb zzaEk = zzdW("confidence");
    public static final zzb zzaEl = zzea("activity_confidence");
    public static final zzb zzaEm = zzdU("steps");
    public static final zzb zzaEn = zzdU("duration");
    public static final zzb zzaEo = zzea("activity_duration");
    public static final zzb zzaEp = zzea("activity_duration.ascending");
    public static final zzb zzaEq = zzea("activity_duration.descending");
    public static final zzb zzaEr = zzdW("bpm");
    public static final zzb zzaEs = zzdW("latitude");
    public static final zzb zzaEt = zzdW("longitude");
    public static final zzb zzaEu = zzdW("accuracy");
    public static final zzb zzaEv = zzdX("altitude");
    public static final zzb zzaEw = zzdW("distance");
    public static final zzb zzaEx = zzed("google.android.fitness.GoalV2");
    public static final zzb zzaEy = zzdW("progress");
    public static final zzb zzaEz = zzdW("height");
    public static final zzb zzaFa = zzdW("low_longitude");
    public static final zzb zzaFb = zzdW("high_latitude");
    public static final zzb zzaFc = zzdW("high_longitude");
    public static final zzb zzaFd = zzdW("x");
    public static final zzb zzaFe = zzdW("y");
    public static final zzb zzaFf = zzdW("z");
    public static final zzb zzaFg = zzeb("timestamps");
    public static final zzb zzaFh = zzec("sensor_values");
    public static final zzb zzaFi = zzdU("sensor_type");
    public static final zzb zzaFj = zzdY("identifier");
    public static final zzb zzaFk = zzdZ("name");
    public static final zzb zzaFl = zzdZ(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
    public static final zzb zzaFm = zzdV("active_time");

    private static zzb zzb(String str, int i, Boolean bool) {
        zzb com_google_android_gms_internal_zzamn_zzb = new zzb();
        com_google_android_gms_internal_zzamn_zzb.name = str;
        com_google_android_gms_internal_zzamn_zzb.zzcav = Integer.valueOf(i);
        if (bool != null) {
            com_google_android_gms_internal_zzamn_zzb.zzcaw = bool;
        }
        return com_google_android_gms_internal_zzamn_zzb;
    }

    private static zzb zzdU(String str) {
        return zzm(str, 1);
    }

    private static zzb zzdV(String str) {
        return zzb(str, 1, Boolean.valueOf(true));
    }

    private static zzb zzdW(String str) {
        return zzm(str, 2);
    }

    private static zzb zzdX(String str) {
        return zzb(str, 2, Boolean.valueOf(true));
    }

    private static zzb zzdY(String str) {
        return zzm(str, 3);
    }

    private static zzb zzdZ(String str) {
        return zzb(str, 3, Boolean.valueOf(true));
    }

    private static zzb zzea(String str) {
        return zzm(str, 4);
    }

    private static zzb zzeb(String str) {
        return zzm(str, 5);
    }

    private static zzb zzec(String str) {
        return zzm(str, 6);
    }

    private static zzb zzed(String str) {
        return zzm(str, 7);
    }

    public static zzb zzm(String str, int i) {
        return zzb(str, i, null);
    }
}
