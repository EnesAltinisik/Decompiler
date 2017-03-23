package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zzqd;
import com.google.android.gms.internal.zzqe;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqh;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zze {
    private static final Map<String, MetadataField<?>> zzazp = new HashMap();
    private static final Map<String, zza> zzazq = new HashMap();

    public interface zza {
        void zzb(DataHolder dataHolder);

        String zzwM();
    }

    static {
        zzb(zzqd.zzazv);
        zzb(zzqd.zzaAb);
        zzb(zzqd.zzazS);
        zzb(zzqd.zzazZ);
        zzb(zzqd.zzaAc);
        zzb(zzqd.zzazI);
        zzb(zzqd.zzazH);
        zzb(zzqd.zzazJ);
        zzb(zzqd.zzazK);
        zzb(zzqd.zzazL);
        zzb(zzqd.zzazF);
        zzb(zzqd.zzazN);
        zzb(zzqd.zzazO);
        zzb(zzqd.zzazP);
        zzb(zzqd.zzazX);
        zzb(zzqd.zzazw);
        zzb(zzqd.zzazU);
        zzb(zzqd.zzazy);
        zzb(zzqd.zzazG);
        zzb(zzqd.zzazz);
        zzb(zzqd.zzazA);
        zzb(zzqd.zzazB);
        zzb(zzqd.zzazC);
        zzb(zzqd.zzazR);
        zzb(zzqd.zzazM);
        zzb(zzqd.zzazT);
        zzb(zzqd.zzazV);
        zzb(zzqd.zzazW);
        zzb(zzqd.zzazY);
        zzb(zzqd.zzaAd);
        zzb(zzqd.zzaAe);
        zzb(zzqd.zzazE);
        zzb(zzqd.zzazD);
        zzb(zzqd.zzaAa);
        zzb(zzqd.zzazQ);
        zzb(zzqd.zzazx);
        zzb(zzqd.zzaAf);
        zzb(zzqd.zzaAg);
        zzb(zzqd.zzaAh);
        zzb(zzqd.zzaAi);
        zzb(zzqd.zzaAj);
        zzb(zzqd.zzaAk);
        zzb(zzqd.zzaAl);
        zzb(zzqf.zzaAn);
        zzb(zzqf.zzaAp);
        zzb(zzqf.zzaAq);
        zzb(zzqf.zzaAr);
        zzb(zzqf.zzaAo);
        zzb(zzqf.zzaAs);
        zzb(zzqh.zzaAu);
        zzb(zzqh.zzaAv);
        zzm com_google_android_gms_drive_metadata_internal_zzm = zzqd.zzazX;
        zza(zzm.zzazu);
        zza(zzqe.zzaAm);
    }

    public static void zza(DataHolder dataHolder) {
        for (zza zzb : zzazq.values()) {
            zzb.zzb(dataHolder);
        }
    }

    private static void zza(zza com_google_android_gms_drive_metadata_internal_zze_zza) {
        if (zzazq.put(com_google_android_gms_drive_metadata_internal_zze_zza.zzwM(), com_google_android_gms_drive_metadata_internal_zze_zza) != null) {
            String valueOf = String.valueOf(com_google_android_gms_drive_metadata_internal_zze_zza.zzwM());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("A cleaner for key ").append(valueOf).append(" has already been registered").toString());
        }
    }

    private static void zzb(MetadataField<?> metadataField) {
        if (zzazp.containsKey(metadataField.getName())) {
            String str = "Duplicate field name registered: ";
            String valueOf = String.valueOf(metadataField.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        zzazp.put(metadataField.getName(), metadataField);
    }

    public static MetadataField<?> zzdC(String str) {
        return (MetadataField) zzazp.get(str);
    }

    public static Collection<MetadataField<?>> zzwL() {
        return Collections.unmodifiableCollection(zzazp.values());
    }
}
