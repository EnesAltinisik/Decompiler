package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.Value;
import com.google.android.gms.internal.zzqq.zza;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class zzqp {
    private static final Set<String> zzaGq = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{zzqm.zzaEv.name, zzqm.zzaEJ.name})));

    public static String zzd(DataPoint dataPoint) {
        DataType dataType = dataPoint.getDataType();
        if (!zzqn.zzee(dataType.getName())) {
            return null;
        }
        for (Field field : dataType.getFields()) {
            Value value = dataPoint.getValue(field);
            if (value.isSet()) {
                double asInt;
                if (field.getFormat() == 1) {
                    asInt = (double) value.asInt();
                } else if (field.getFormat() == 2) {
                    asInt = (double) value.asFloat();
                } else {
                    continue;
                }
                zza zzef = zzqq.zzxQ().zzef(field.getName());
                if (zzef != null && !zzef.zzh(asInt)) {
                    return "Field out of range";
                }
                zza zzI = zzqq.zzxQ().zzI(dataType.getName(), field.getName());
                if (zzI != null) {
                    long timestampNanos = dataPoint.getTimestampNanos() - dataPoint.zzxt();
                    if (timestampNanos == 0) {
                        return asInt == 0.0d ? null : "DataPoint out of range";
                    } else {
                        if (!zzI.zzh(asInt / ((double) timestampNanos))) {
                            return "DataPoint out of range";
                        }
                    }
                } else {
                    continue;
                }
            } else if (!zzaGq.contains(field.getName())) {
                return String.valueOf(field.getName()).concat(" not set");
            }
        }
        return null;
    }

    public static void zze(DataPoint dataPoint) throws IllegalArgumentException {
        String zzd = zzd(dataPoint);
        if (zzd != null) {
            String valueOf = String.valueOf(dataPoint);
            Log.w("Fitness", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid data point: ").append(valueOf).toString());
            throw new IllegalArgumentException(zzd);
        }
    }
}
