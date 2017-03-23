package com.google.android.gms.drive;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.zzp;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.zze;
import com.google.android.gms.internal.zzqd;

public final class MetadataBuffer extends AbstractDataBuffer<Metadata> {
    private a zzavB;

    private static class a extends Metadata {
        private final DataHolder a;
        private final int b;
        private final int c;

        public a(DataHolder dataHolder, int i) {
            this.a = dataHolder;
            this.b = i;
            this.c = dataHolder.zzbP(i);
        }

        public Metadata a() {
            MetadataBundle zzwN = MetadataBundle.zzwN();
            for (MetadataField metadataField : zze.zzwL()) {
                if (metadataField != zzqd.zzaAa) {
                    metadataField.zza(this.a, zzwN, this.b, this.c);
                }
            }
            return new zzp(zzwN);
        }

        public /* synthetic */ Object freeze() {
            return a();
        }

        public boolean isDataValid() {
            return !this.a.isClosed();
        }

        public <T> T zza(MetadataField<T> metadataField) {
            return metadataField.zza(this.a, this.b, this.c);
        }
    }

    public MetadataBuffer(DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.zzsO().setClassLoader(MetadataBuffer.class.getClassLoader());
    }

    public Metadata get(int i) {
        Metadata metadata = this.zzavB;
        if (metadata != null && metadata.b == i) {
            return metadata;
        }
        metadata = new a(this.zzamz, i);
        this.zzavB = metadata;
        return metadata;
    }

    @Deprecated
    public String getNextPageToken() {
        return null;
    }

    public void release() {
        if (this.zzamz != null) {
            zze.zza(this.zzamz);
        }
        super.release();
    }
}
