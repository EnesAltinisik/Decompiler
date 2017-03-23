package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzajt;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.internal.http.StatusLine;

public class FileDownloadTask extends StorageTask<TaskSnapshot> {
    private int mResultCode;
    private long zzawx = -1;
    private StorageReference zzbTR;
    private zzajk zzbTT;
    private final Uri zzbTU;
    private long zzbTV;
    private String zzbTW = null;
    private long zzbTX = 0;
    private volatile Exception zzbwC = null;

    public class TaskSnapshot extends a {
        private final long zzbTV;
        final /* synthetic */ FileDownloadTask zzbTY;

        TaskSnapshot(FileDownloadTask fileDownloadTask, Exception exception, long j) {
            this.zzbTY = fileDownloadTask;
            super(fileDownloadTask, exception);
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

        public /* bridge */ /* synthetic */ StorageTask getTask() {
            return super.getTask();
        }

        public long getTotalByteCount() {
            return this.zzbTY.getTotalBytes();
        }
    }

    FileDownloadTask(StorageReference storageReference, Uri uri) {
        this.zzbTR = storageReference;
        this.zzbTU = uri;
        this.zzbTT = new zzajk(this.zzbTR.getStorage().getApp(), this.zzbTR.getStorage().getMaxDownloadRetryTimeMillis());
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

    void run() {
        zzi(4, false);
        this.zzbTT.reset();
        try {
            Object zziN;
            zzajt zza = this.zzbTR.zzUT().zza(this.zzbTR.zzUU(), this.zzbTX);
            this.zzbTT.zza(zza, false);
            this.mResultCode = zza.getResultCode();
            this.zzbwC = zza.getException() != null ? zza.getException() : this.zzbwC;
            Object obj = (zznK(this.mResultCode) && this.zzbwC == null && zzUW() == 4) ? 1 : null;
            if (obj != null) {
                this.zzawx = (long) zza.zzVu();
                zziN = zza.zziN("ETag");
                if (TextUtils.isEmpty(zziN) || this.zzbTW == null || this.zzbTW.equals(zziN)) {
                    this.zzbTW = zziN;
                    InputStream stream = zza.getStream();
                    if (stream != null) {
                        try {
                            String str;
                            String valueOf;
                            String str2;
                            OutputStream fileOutputStream;
                            File file = new File(this.zzbTU.getPath());
                            if (!file.exists()) {
                                if (this.zzbTX > 0) {
                                    String str3 = "FileDownloadTask";
                                    str = "The file downloading to has been deleted:";
                                    valueOf = String.valueOf(file.getAbsolutePath());
                                    Log.e(str3, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                    throw new IllegalStateException("expected a file to resume from.");
                                } else if (!file.createNewFile()) {
                                    str = "FileDownloadTask";
                                    str2 = "unable to create file:";
                                    valueOf = String.valueOf(file.getAbsolutePath());
                                    Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                }
                            }
                            if (this.zzbTX > 0) {
                                str = "FileDownloadTask";
                                str2 = "Resuming download file ";
                                valueOf = String.valueOf(file.getAbsolutePath());
                                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                fileOutputStream = new FileOutputStream(file, true);
                            } else {
                                fileOutputStream = new FileOutputStream(file);
                            }
                            byte[] bArr = new byte[262144];
                            do {
                                int read = stream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                this.zzbTV += (long) read;
                            } while (zzi(4, false));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            stream.close();
                        } catch (Throwable e) {
                            Log.e("FileDownloadTask", "Exception occurred during file download", e);
                            this.zzbwC = e;
                        }
                    } else {
                        this.zzbwC = new IllegalStateException("Unable to open Firebase Storage stream.");
                    }
                } else {
                    Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                    this.zzbTX = 0;
                    this.zzbTW = null;
                    zza.zzVn();
                    schedule();
                    return;
                }
            }
            zza.zzVn();
            zziN = (obj != null && this.zzbwC == null && zzUW() == 4) ? 1 : null;
            if (zziN != null) {
                zzi(128, false);
                return;
            }
            File file2 = new File(this.zzbTU.getPath());
            if (file2.exists()) {
                this.zzbTX = file2.length();
            } else {
                this.zzbTX = 0;
            }
            if (zzUW() == 8) {
                zzi(16, false);
                return;
            }
            if (!zzi(zzUW() == 32 ? 256 : 64, false)) {
                Log.w("FileDownloadTask", "Unable to change download task to final state from " + zzUW());
            }
        } catch (Throwable e2) {
            Log.e("FileDownloadTask", "Unable to create firebase storage network request.", e2);
            this.zzbwC = e2;
            zzi(64, false);
        }
    }

    protected void schedule() {
        zzd.zzVc().zzn(zzVa());
    }

    TaskSnapshot zzUP() {
        return new TaskSnapshot(this, StorageException.fromExceptionAndHttpCode(this.zzbwC, this.mResultCode), this.zzbTV);
    }

    /* synthetic */ ProvideError zzUQ() {
        return zzUP();
    }
}
