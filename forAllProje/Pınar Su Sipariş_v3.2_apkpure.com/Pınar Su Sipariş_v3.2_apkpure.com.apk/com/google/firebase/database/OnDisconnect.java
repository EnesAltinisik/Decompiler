package com.google.firebase.database;

import com.google.android.gms.internal.zzafa;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzahu;
import com.google.android.gms.internal.zzahv;
import com.google.android.gms.internal.zzahy;
import com.google.android.gms.internal.zzais;
import com.google.android.gms.internal.zzaiv;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaix;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference.CompletionListener;
import java.util.Map;

public class OnDisconnect {
    private zzafc zzbHo;
    private zzafa zzbHw;

    OnDisconnect(zzafc com_google_android_gms_internal_zzafc, zzafa com_google_android_gms_internal_zzafa) {
        this.zzbHo = com_google_android_gms_internal_zzafc;
        this.zzbHw = com_google_android_gms_internal_zzafa;
    }

    private Task<Void> zza(CompletionListener completionListener) {
        final zzais zzb = zzaiv.zzb(completionListener);
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ OnDisconnect b;

            public void run() {
                this.b.zzbHo.zza(this.b.zzbHw, (CompletionListener) zzb.zzUj());
            }
        });
        return (Task) zzb.getFirst();
    }

    private Task<Void> zza(final Map<String, Object> map, CompletionListener completionListener) {
        final Map zzc = zzaiw.zzc(this.zzbHw, map);
        final zzais zzb = zzaiv.zzb(completionListener);
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ OnDisconnect d;

            public void run() {
                this.d.zzbHo.zza(this.d.zzbHw, zzc, (CompletionListener) zzb.zzUj(), map);
            }
        });
        return (Task) zzb.getFirst();
    }

    private Task<Void> zzb(Object obj, zzahu com_google_android_gms_internal_zzahu, CompletionListener completionListener) {
        zzaiw.zzQ(this.zzbHw);
        zzafo.zza(this.zzbHw, obj);
        Object zzav = zzaix.zzav(obj);
        zzaiw.zzau(zzav);
        final zzahu zza = zzahv.zza(zzav, com_google_android_gms_internal_zzahu);
        final zzais zzb = zzaiv.zzb(completionListener);
        this.zzbHo.scheduleNow(new Runnable(this) {
            final /* synthetic */ OnDisconnect c;

            public void run() {
                this.c.zzbHo.zzb(this.c.zzbHw, zza, (CompletionListener) zzb.zzUj());
            }
        });
        return (Task) zzb.getFirst();
    }

    public Task<Void> cancel() {
        return zza(null);
    }

    public void cancel(CompletionListener completionListener) {
        zza(completionListener);
    }

    public Task<Void> removeValue() {
        return setValue(null);
    }

    public void removeValue(CompletionListener completionListener) {
        setValue(null, completionListener);
    }

    public Task<Void> setValue(Object obj) {
        return zzb(obj, zzahy.zzTM(), null);
    }

    public Task<Void> setValue(Object obj, double d) {
        return zzb(obj, zzahy.zzar(Double.valueOf(d)), null);
    }

    public Task<Void> setValue(Object obj, String str) {
        return zzb(obj, zzahy.zzar(str), null);
    }

    public void setValue(Object obj, double d, CompletionListener completionListener) {
        zzb(obj, zzahy.zzar(Double.valueOf(d)), completionListener);
    }

    public void setValue(Object obj, CompletionListener completionListener) {
        zzb(obj, zzahy.zzTM(), completionListener);
    }

    public void setValue(Object obj, String str, CompletionListener completionListener) {
        zzb(obj, zzahy.zzar(str), completionListener);
    }

    public void setValue(Object obj, Map map, CompletionListener completionListener) {
        zzb(obj, zzahy.zzar(map), completionListener);
    }

    public Task<Void> updateChildren(Map<String, Object> map) {
        return zza(map, null);
    }

    public void updateChildren(Map<String, Object> map, CompletionListener completionListener) {
        zza(map, completionListener);
    }
}
