package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

public final class zzp extends InputStream {
    private final InputStream zzbCQ;
    private volatile f zzbCR;

    public zzp(InputStream inputStream) {
        this.zzbCQ = (InputStream) zzaa.zzz(inputStream);
    }

    private int zzmF(int i) throws ChannelIOException {
        if (i == -1) {
            f fVar = this.zzbCR;
            if (fVar != null) {
                throw new ChannelIOException("Channel closed unexpectedly before stream was finished", fVar.a, fVar.b);
            }
        }
        return i;
    }

    public int available() throws IOException {
        return this.zzbCQ.available();
    }

    public void close() throws IOException {
        this.zzbCQ.close();
    }

    public void mark(int i) {
        this.zzbCQ.mark(i);
    }

    public boolean markSupported() {
        return this.zzbCQ.markSupported();
    }

    public int read() throws IOException {
        return zzmF(this.zzbCQ.read());
    }

    public int read(byte[] bArr) throws IOException {
        return zzmF(this.zzbCQ.read(bArr));
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return zzmF(this.zzbCQ.read(bArr, i, i2));
    }

    public void reset() throws IOException {
        this.zzbCQ.reset();
    }

    public long skip(long j) throws IOException {
        return this.zzbCQ.skip(j);
    }

    g zzNE() {
        return new g(this) {
            final /* synthetic */ zzp a;

            {
                this.a = r1;
            }

            public void a(f fVar) {
                this.a.zza(fVar);
            }
        };
    }

    void zza(f fVar) {
        this.zzbCR = (f) zzaa.zzz(fVar);
    }
}
