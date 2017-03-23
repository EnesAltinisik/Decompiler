package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.zzk;
import java.util.List;

class a implements SensorEventDispatcher {
    private final zzk a;

    a(zzk com_google_android_gms_fitness_data_zzk) {
        this.a = (zzk) zzaa.zzz(com_google_android_gms_fitness_data_zzk);
    }

    public void publish(DataPoint dataPoint) throws RemoteException {
        dataPoint.zzxs();
        this.a.zzc(dataPoint);
    }

    public void publish(List<DataPoint> list) throws RemoteException {
        for (DataPoint publish : list) {
            publish(publish);
        }
    }
}
