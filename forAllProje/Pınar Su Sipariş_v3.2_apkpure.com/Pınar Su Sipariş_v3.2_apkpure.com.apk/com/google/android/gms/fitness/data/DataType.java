package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.common.util.zzf;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class DataType extends AbstractSafeParcelable {
    public static final DataType AGGREGATE_ACTIVITY_SUMMARY = new DataType("com.google.activity.summary", Field.FIELD_ACTIVITY, Field.FIELD_DURATION, Field.FIELD_NUM_SEGMENTS);
    public static final DataType AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY = new DataType("com.google.calories.bmr.summary", Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN);
    public static final DataType AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY = new DataType("com.google.body.fat.percentage.summary", Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN);
    @Deprecated
    public static final DataType AGGREGATE_CALORIES_CONSUMED = TYPE_CALORIES_CONSUMED;
    public static final DataType AGGREGATE_CALORIES_EXPENDED = TYPE_CALORIES_EXPENDED;
    public static final DataType AGGREGATE_DISTANCE_DELTA = TYPE_DISTANCE_DELTA;
    public static final DataType AGGREGATE_HEART_RATE_SUMMARY = new DataType("com.google.heart_rate.summary", Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN);
    public static final Set<DataType> AGGREGATE_INPUT_TYPES = zzf.zzc(TYPE_STEP_COUNT_DELTA, TYPE_DISTANCE_DELTA, TYPE_ACTIVITY_SEGMENT, zzaDj, TYPE_SPEED, TYPE_HEART_RATE_BPM, TYPE_WEIGHT, TYPE_LOCATION_SAMPLE, TYPE_CALORIES_CONSUMED, TYPE_CALORIES_EXPENDED, TYPE_BODY_FAT_PERCENTAGE, zzaDm, zzaDl, TYPE_NUTRITION);
    public static final DataType AGGREGATE_LOCATION_BOUNDING_BOX = new DataType("com.google.location.bounding_box", Field.FIELD_LOW_LATITUDE, Field.FIELD_LOW_LONGITUDE, Field.FIELD_HIGH_LATITUDE, Field.FIELD_HIGH_LONGITUDE);
    public static final DataType AGGREGATE_NUTRITION_SUMMARY = new DataType("com.google.nutrition.summary", Field.FIELD_NUTRIENTS, Field.FIELD_MEAL_TYPE);
    public static final DataType AGGREGATE_POWER_SUMMARY = new DataType("com.google.power.summary", Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN);
    public static final DataType AGGREGATE_SPEED_SUMMARY = new DataType("com.google.speed.summary", Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN);
    public static final DataType AGGREGATE_STEP_COUNT_DELTA = TYPE_STEP_COUNT_DELTA;
    public static final DataType AGGREGATE_WEIGHT_SUMMARY = new DataType("com.google.weight.summary", Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN);
    public static final Creator<DataType> CREATOR = new zzg();
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";
    public static final DataType TYPE_ACTIVITY_SAMPLE = new DataType("com.google.activity.sample", Field.FIELD_ACTIVITY, Field.FIELD_CONFIDENCE);
    public static final DataType TYPE_ACTIVITY_SEGMENT = new DataType("com.google.activity.segment", Field.FIELD_ACTIVITY);
    public static final DataType TYPE_BASAL_METABOLIC_RATE = new DataType("com.google.calories.bmr", Field.FIELD_CALORIES);
    public static final DataType TYPE_BODY_FAT_PERCENTAGE = new DataType("com.google.body.fat.percentage", Field.FIELD_PERCENTAGE);
    @Deprecated
    public static final DataType TYPE_CALORIES_CONSUMED = new DataType("com.google.calories.consumed", Field.FIELD_CALORIES);
    public static final DataType TYPE_CALORIES_EXPENDED = new DataType("com.google.calories.expended", Field.FIELD_CALORIES);
    public static final DataType TYPE_CYCLING_PEDALING_CADENCE = new DataType("com.google.cycling.pedaling.cadence", Field.FIELD_RPM);
    public static final DataType TYPE_CYCLING_PEDALING_CUMULATIVE = new DataType("com.google.cycling.pedaling.cumulative", Field.FIELD_REVOLUTIONS);
    public static final DataType TYPE_CYCLING_WHEEL_REVOLUTION = new DataType("com.google.cycling.wheel_revolution.cumulative", Field.FIELD_REVOLUTIONS);
    public static final DataType TYPE_CYCLING_WHEEL_RPM = new DataType("com.google.cycling.wheel_revolution.rpm", Field.FIELD_RPM);
    @KeepName
    public static final DataType TYPE_DISTANCE_CUMULATIVE = new DataType("com.google.distance.cumulative", Field.FIELD_DISTANCE);
    public static final DataType TYPE_DISTANCE_DELTA = new DataType("com.google.distance.delta", Field.FIELD_DISTANCE);
    public static final DataType TYPE_HEART_RATE_BPM = new DataType("com.google.heart_rate.bpm", Field.FIELD_BPM);
    public static final DataType TYPE_HEIGHT = new DataType("com.google.height", Field.FIELD_HEIGHT);
    public static final DataType TYPE_LOCATION_SAMPLE = new DataType("com.google.location.sample", Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE);
    public static final DataType TYPE_LOCATION_TRACK = new DataType("com.google.location.track", Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE);
    public static final DataType TYPE_NUTRITION = new DataType("com.google.nutrition", Field.FIELD_NUTRIENTS, Field.FIELD_MEAL_TYPE, Field.FIELD_FOOD_ITEM);
    public static final DataType TYPE_POWER_SAMPLE = new DataType("com.google.power.sample", Field.FIELD_WATTS);
    public static final DataType TYPE_SPEED = new DataType("com.google.speed", Field.FIELD_SPEED);
    public static final DataType TYPE_STEP_COUNT_CADENCE = new DataType("com.google.step_count.cadence", Field.FIELD_RPM);
    @KeepName
    public static final DataType TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", Field.FIELD_STEPS);
    public static final DataType TYPE_STEP_COUNT_DELTA = new DataType("com.google.step_count.delta", Field.FIELD_STEPS);
    public static final DataType TYPE_WEIGHT = new DataType("com.google.weight", Field.FIELD_WEIGHT);
    public static final DataType TYPE_WORKOUT_EXERCISE = new DataType("com.google.activity.exercise", Field.FIELD_EXERCISE, Field.FIELD_REPETITIONS, Field.FIELD_DURATION, Field.FIELD_RESISTANCE_TYPE, Field.FIELD_RESISTANCE);
    public static final DataType zzaDj = new DataType("com.google.floor_change", Field.FIELD_ACTIVITY, Field.FIELD_CONFIDENCE, Field.zzaDE, Field.zzaDH);
    public static final DataType zzaDk = new DataType("com.google.accelerometer", Field.zzaDK, Field.zzaDL, Field.zzaDM);
    public static final DataType zzaDl = new DataType("com.google.body.waist.circumference", Field.FIELD_CIRCUMFERENCE);
    public static final DataType zzaDm = new DataType("com.google.body.hip.circumference", Field.FIELD_CIRCUMFERENCE);
    public static final DataType zzaDn = new DataType("com.google.floor_change.summary", Field.zzaDC, Field.zzaDD, Field.zzaDF, Field.zzaDG, Field.zzaDI, Field.zzaDJ);
    public static final DataType zzaDo = new DataType("com.google.body.hip.circumference.summary", Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN);
    public static final DataType zzaDp = new DataType("com.google.body.waist.circumference.summary", Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN);
    private static final Map<DataType, List<DataType>> zzaDq = new HashMap();
    public static final DataType[] zzaDr = new DataType[]{zzaDk, TYPE_WORKOUT_EXERCISE, TYPE_ACTIVITY_SAMPLE, TYPE_ACTIVITY_SEGMENT, AGGREGATE_ACTIVITY_SUMMARY, TYPE_BODY_FAT_PERCENTAGE, AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY, zzaDm, zzaDo, zzaDl, zzaDp, TYPE_BASAL_METABOLIC_RATE, AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY, TYPE_CALORIES_CONSUMED, TYPE_CALORIES_EXPENDED, TYPE_CYCLING_PEDALING_CADENCE, TYPE_CYCLING_PEDALING_CUMULATIVE, TYPE_CYCLING_WHEEL_REVOLUTION, TYPE_CYCLING_WHEEL_RPM, TYPE_DISTANCE_CUMULATIVE, TYPE_DISTANCE_DELTA, zzaDj, zzaDn, TYPE_HEART_RATE_BPM, AGGREGATE_HEART_RATE_SUMMARY, TYPE_HEIGHT, AGGREGATE_LOCATION_BOUNDING_BOX, TYPE_LOCATION_SAMPLE, TYPE_LOCATION_TRACK, TYPE_NUTRITION, AGGREGATE_NUTRITION_SUMMARY, TYPE_POWER_SAMPLE, AGGREGATE_POWER_SUMMARY, TYPE_SPEED, AGGREGATE_SPEED_SUMMARY, TYPE_STEP_COUNT_CADENCE, TYPE_STEP_COUNT_CUMULATIVE, TYPE_STEP_COUNT_DELTA, TYPE_WEIGHT, AGGREGATE_WEIGHT_SUMMARY};
    private final String mName;
    private final int mVersionCode;
    private final List<Field> zzaDs;

    static {
        zzaDq.put(TYPE_ACTIVITY_SEGMENT, Collections.singletonList(AGGREGATE_ACTIVITY_SUMMARY));
        zzaDq.put(TYPE_BASAL_METABOLIC_RATE, Collections.singletonList(AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY));
        zzaDq.put(TYPE_BODY_FAT_PERCENTAGE, Collections.singletonList(AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY));
        zzaDq.put(zzaDm, Collections.singletonList(zzaDo));
        zzaDq.put(zzaDl, Collections.singletonList(zzaDp));
        zzaDq.put(TYPE_CALORIES_CONSUMED, Collections.singletonList(AGGREGATE_CALORIES_CONSUMED));
        zzaDq.put(TYPE_CALORIES_EXPENDED, Collections.singletonList(AGGREGATE_CALORIES_EXPENDED));
        zzaDq.put(TYPE_DISTANCE_DELTA, Collections.singletonList(AGGREGATE_DISTANCE_DELTA));
        zzaDq.put(zzaDj, Collections.singletonList(zzaDn));
        zzaDq.put(TYPE_LOCATION_SAMPLE, Collections.singletonList(AGGREGATE_LOCATION_BOUNDING_BOX));
        zzaDq.put(TYPE_NUTRITION, Collections.singletonList(AGGREGATE_NUTRITION_SUMMARY));
        zzaDq.put(TYPE_POWER_SAMPLE, Collections.singletonList(AGGREGATE_POWER_SUMMARY));
        zzaDq.put(TYPE_HEART_RATE_BPM, Collections.singletonList(AGGREGATE_HEART_RATE_SUMMARY));
        zzaDq.put(TYPE_SPEED, Collections.singletonList(AGGREGATE_SPEED_SUMMARY));
        zzaDq.put(TYPE_STEP_COUNT_DELTA, Collections.singletonList(AGGREGATE_STEP_COUNT_DELTA));
        zzaDq.put(TYPE_WEIGHT, Collections.singletonList(AGGREGATE_WEIGHT_SUMMARY));
    }

    DataType(int i, String str, List<Field> list) {
        this.mVersionCode = i;
        this.mName = str;
        this.zzaDs = Collections.unmodifiableList(list);
    }

    public DataType(String str, Field... fieldArr) {
        this(1, str, zzb.zzb(fieldArr));
    }

    public static List<DataType> getAggregatesForInput(DataType dataType) {
        List list = (List) zzaDq.get(dataType);
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public static String getMimeType(DataType dataType) {
        String valueOf = String.valueOf(MIME_TYPE_PREFIX);
        String valueOf2 = String.valueOf(dataType.getName());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private boolean zza(DataType dataType) {
        return this.mName.equals(dataType.mName) && this.zzaDs.equals(dataType.zzaDs);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataType) && zza((DataType) obj));
    }

    public List<Field> getFields() {
        return this.zzaDs;
    }

    public String getName() {
        return this.mName;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return this.mName.hashCode();
    }

    public int indexOf(Field field) {
        int indexOf = this.zzaDs.indexOf(field);
        if (indexOf >= 0) {
            return indexOf;
        }
        throw new IllegalArgumentException(String.format("%s not a field of %s", new Object[]{field, this}));
    }

    public String toString() {
        return String.format("DataType{%s%s}", new Object[]{this.mName, this.zzaDs});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }

    public String zzxy() {
        return this.mName.startsWith("com.google.") ? this.mName.substring(11) : this.mName;
    }
}
