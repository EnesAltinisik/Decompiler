package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

public final class zzq extends OutputStream {
    private volatile f zzbCR;
    private final OutputStream zzbCT;

    public zzq(OutputStream outputStream) {
        this.zzbCT = (OutputStream) zzaa.zzz(outputStream);
    }

    private IOException zza(IOException iOException) {
        f fVar = this.zzbCR;
        if (fVar == null) {
            return iOException;
        }
        if (Log.isLoggable("ChannelOutputStream", 2)) {
            Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException);
        }
        return new ChannelIOException("Channel closed unexpectedly before stream was finished", fVar.a, fVar.b);
    }

    public void close() throws IOException {
        try {
            this.zzbCT.close();
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public void flush() throws IOException {
        try {
            this.zzbCT.flush();
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public void write(int i) throws IOException {
        try {
            this.zzbCT.write(i);
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public void write(byte[] bArr) throws IOException {
        try {
            this.zzbCT.write(bArr);
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.zzbCT.write(bArr, i, i2);
        } catch (IOException e) {
            throw zza(e);
        }
    }

    g zzNE() {
        return new g(this) {
            final /* synthetic */ zzq a;

            {
                this.a = r1;
            }

            public void a(f fVar) {
                this.a.zzc(fVar);
            }
        };
    }

    void zzc(f fVar) {
        this.zzbCR = fVar;
    }
}
