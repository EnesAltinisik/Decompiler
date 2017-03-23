package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzajt;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.http.StatusLine;

public class StreamDownloadTask extends StorageTask<TaskSnapshot> {
    private volatile int mResultCode = 0;
    private long zzawx;
    private InputStream zzbCO;
    private StorageReference zzbTR;
    private zzajk zzbTT;
    private long zzbTV;
    private StreamProcessor zzbVa;
    private long zzbVb;
    private zzajt zzbVc;
    private volatile Exception zzbwC = null;

    public interface StreamProcessor {
        void doInBackground(TaskSnapshot taskSnapshot, InputStream inputStream) throws IOException;
    }

    public class TaskSnapshot extends a {
        private final long zzbTV;
        final /* synthetic */ StreamDownloadTask zzbVg;

        TaskSnapshot(StreamDownloadTask streamDownloadTask, Exception exception, long j) {
            this.zzbVg = streamDownloadTask;
            super(streamDownloadTask, exception);
            this.zzbTV = j;
        }

        public long getBytesTransferred() {
            return this.zzbTV;
        }

        public /* bridge */ /* synthetic */ Exception getError() {
            return super.getError();
        }

        public /* bridge */ /* synthetic */ StorageReference getStorage() {
            return super.getStorage();
        }

        public InputStream getStream() {
            return this.zzbVg.zzbCO;
        }

        public /* bridge */ /* synthetic */ StorageTask getTask() {
            return super.getTask();
        }

        public long getTotalByteCount() {
            return this.zzbVg.getTotalBytes();
        }
    }

    private static class a extends InputStream {
        private StreamDownloadTask a;
        private InputStream b;
        private int c;

        public a(StreamDownloadTask streamDownloadTask, InputStream inputStream) {
            this.a = streamDownloadTask;
            this.b = inputStream;
        }

        private void a() throws IOException {
            if (this.a.zzUW() == 32) {
                throw StorageException.zzbUe;
            }
        }

        public int available() throws IOException {
            a();
            return this.b.available();
        }

        public void close() throws IOException {
            this.b.close();
            if (this.a.zzbVc != null) {
                this.a.zzbVc.zzVn();
            }
            a();
        }

        public void mark(int i) {
            this.c = i;
            this.b.mark(i);
        }

        public boolean markSupported() {
            return this.b.markSupported();
        }

        public int read() throws IOException {
            a();
            int read = this.b.read();
            if (read != -1) {
                this.a.zzaM(1);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            a();
            int i3 = 0;
            int i4 = i2;
            int i5 = i;
            while (((long) i4) > 262144) {
                int read = this.b.read(bArr, i5, 262144);
                if (read != -1) {
                    i3 += read;
                    i5 += read;
                    i4 -= read;
                    this.a.zzaM((long) read);
                    a();
                    if (((long) read) < 262144) {
                        break;
                    }
                }
                return i3 == 0 ? -1 : i3;
            }
            if (i4 > 0) {
                i4 = this.b.read(bArr, i5, i4);
                if (i4 == -1) {
                    return i3 != 0 ? i3 : -1;
                } else {
                    i3 += i4;
                    this.a.zzaM((long) i4);
                }
            }
            return i3;
        }

        public synchronized void reset() throws IOException {
            a();
            this.a.zzaM((long) (-this.c));
            this.b.reset();
        }

        public long skip(long j) throws IOException {
            long skip;
            a();
            int i = 0;
            while (j > 262144) {
                skip = this.b.skip(262144);
                i = (int) (((long) i) + skip);
                if (skip < 262144) {
                    this.a.zzaM(skip);
                    return (long) i;
                }
                this.a.zzaM(262144);
                j -= 262144;
                a();
            }
            skip = this.b.skip(j);
            i = (int) (((long) i) + skip);
            this.a.zzaM(skip);
            return (long) i;
        }
    }

    StreamDownloadTask(StorageReference storageReference) {
        this.zzbTR = storageReference;
        this.zzbTT = new zzajk(this.zzbTR.getApp(), this.zzbTR.getStorage().getMaxDownloadRetryTimeMillis());
    }

    private void zzaM(long j) {
        this.zzbTV += j;
        if (this.zzbVb + 262144 <= this.zzbTV) {
            zzi(4, false);
        }
    }

    private boolean zznK(int i) {
        return i == StatusLine.HTTP_PERM_REDIRECT || (i >= 200 && i < Strategy.TTL_SECONDS_DEFAULT);
    }

    StorageReference getStorage() {
        return this.zzbTR;
    }

    long getTotalBytes() {
        return this.zzawx;
    }

    protected void onCanceled() {
        this.zzbTT.cancel();
    }

    protected void onProgress() {
        this.zzbVb = this.zzbTV;
    }

    public boolean pause() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    public boolean resume() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    void run() {
        this.zzbTT.reset();
        if (this.zzbwC != null) {
            zzi(64, false);
        } else if (zzi(4, false)) {
            try {
                this.zzbVc = this.zzbTR.zzUT().zza(this.zzbTR.zzUU(), 0);
                this.zzbTT.zza(this.zzbVc, false);
                this.mResultCode = this.zzbVc.getResultCode();
                this.zzbwC = this.zzbVc.getException() != null ? this.zzbVc.getException() : this.zzbwC;
                boolean z = zznK(this.mResultCode) && this.zzbwC == null && zzUW() == 4;
                if (z) {
                    this.zzawx = (long) this.zzbVc.zzVu();
                    InputStream stream = this.zzbVc.getStream();
                    if (stream != null) {
                        this.zzbCO = new a(this, stream);
                        if (this.zzbVa != null) {
                            try {
                                this.zzbVa.doInBackground((TaskSnapshot) zzUY(), this.zzbCO);
                            } catch (Throwable e) {
                                Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e);
                                this.zzbwC = e;
                            }
                        }
                    } else {
                        this.zzbwC = new IOException("Could not open resulting stream.");
                    }
                }
                if (this.zzbCO == null) {
                    this.zzbVc.zzVn();
                }
                boolean z2 = z && this.zzbwC == null && zzUW() == 4;
                if (z2) {
                    zzi(4, false);
                    zzi(128, false);
                    return;
                }
                if (!zzi(zzUW() == 32 ? 256 : 64, false)) {
                    Log.w("StreamDownloadTask", "Unable to change download task to final state from " + zzUW());
                }
            } catch (Throwable e2) {
                Log.e("StreamDownloadTask", "Unable to create firebase storage network request.", e2);
                this.zzbwC = e2;
                zzi(64, false);
            }
        }
    }

    protected void schedule() {
        zzd.zzVc().zzn(zzVa());
    }

    /* synthetic */ ProvideError zzUQ() {
        return zzVd();
    }

    TaskSnapshot zzVd() {
        return new TaskSnapshot(this, StorageException.fromExceptionAndHttpCode(this.zzbwC, this.mResultCode), this.zzbVb);
    }

    StreamDownloadTask zza(StreamProcessor streamProcessor) {
        zzaa.zzz(streamProcessor);
        zzaa.zzai(this.zzbVa == null);
        this.zzbVa = streamProcessor;
        return this;
    }
}
