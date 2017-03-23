package com.google.firebase.storage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzajp;
import com.google.android.gms.internal.zzajs;
import com.google.android.gms.internal.zzajt;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.firebase.storage.StorageMetadata.Builder;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.http.StatusLine;
import org.json.JSONException;
import org.json.JSONObject;

public class UploadTask extends StorageTask<TaskSnapshot> {
    private volatile int mResultCode;
    private final Uri mUri;
    private final StorageReference zzbTR;
    private zzajk zzbTT;
    private volatile StorageMetadata zzbUw;
    private final byte[] zzbVr;
    private final long zzbVs;
    private final AtomicLong zzbVt;
    private InputStream zzbVu;
    private volatile Uri zzbVv;
    private volatile Exception zzbVw;
    private volatile String zzbVx;
    private final byte[] zzbjm;
    private volatile Exception zzbwC;

    public class TaskSnapshot extends a {
        private final StorageMetadata zzbUw;
        private final long zzbVA;
        private final Uri zzbVv;
        final /* synthetic */ UploadTask zzbVz;

        TaskSnapshot(UploadTask uploadTask, Exception exception, long j, Uri uri, StorageMetadata storageMetadata) {
            this.zzbVz = uploadTask;
            super(uploadTask, exception);
            this.zzbVA = j;
            this.zzbVv = uri;
            this.zzbUw = storageMetadata;
        }

        public long getBytesTransferred() {
            return this.zzbVA;
        }

        public Uri getDownloadUrl() {
            StorageMetadata metadata = getMetadata();
            return metadata != null ? metadata.getDownloadUrl() : null;
        }

        public /* bridge */ /* synthetic */ Exception getError() {
            return super.getError();
        }

        public StorageMetadata getMetadata() {
            return this.zzbUw;
        }

        public /* bridge */ /* synthetic */ StorageReference getStorage() {
            return super.getStorage();
        }

        public /* bridge */ /* synthetic */ StorageTask getTask() {
            return super.getTask();
        }

        public long getTotalByteCount() {
            return this.zzbVz.getTotalByteCount();
        }

        public Uri getUploadSessionUri() {
            return this.zzbVv;
        }
    }

    UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, Uri uri, Uri uri2) {
        long statSize;
        long j;
        Throwable th;
        InputStream openInputStream;
        Exception exception;
        String str;
        String str2;
        String valueOf;
        long j2;
        InputStream inputStream;
        String str3;
        String str4;
        long j3 = -1;
        this.zzbVr = new byte[262144];
        this.zzbVt = new AtomicLong(0);
        this.zzbVv = null;
        this.zzbwC = null;
        this.zzbVw = null;
        this.mResultCode = 0;
        zzaa.zzz(storageReference);
        zzaa.zzz(uri);
        this.zzbjm = null;
        this.zzbTR = storageReference;
        this.zzbUw = storageMetadata;
        this.mUri = uri;
        this.zzbTT = new zzajk(this.zzbTR.getApp(), this.zzbTR.getStorage().getMaxUploadRetryTimeMillis());
        ContentResolver contentResolver = this.zzbTR.getStorage().getApp().getApplicationContext().getContentResolver();
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(this.mUri, "r");
            if (openFileDescriptor != null) {
                statSize = openFileDescriptor.getStatSize();
                try {
                    openFileDescriptor.close();
                } catch (Throwable e) {
                    Throwable th2 = e;
                    j = statSize;
                    th = th2;
                    try {
                        Log.w("UploadTask", "NullPointerException during file size calculation.", th);
                        openInputStream = contentResolver.openInputStream(this.mUri);
                        if (openInputStream == null) {
                            try {
                            } catch (Exception e2) {
                                exception = e2;
                                str = "UploadTask";
                                str2 = "could not locate file for uploading:";
                                valueOf = String.valueOf(this.mUri.toString());
                                Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                                this.zzbwC = exception;
                                j2 = j3;
                                inputStream = openInputStream;
                                statSize = j2;
                                this.zzbVs = statSize;
                                this.zzbVu = inputStream;
                                this.zzbVv = uri2;
                            }
                        }
                        j2 = j3;
                        inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
                        statSize = j2;
                    } catch (Exception e22) {
                        j3 = j;
                        openInputStream = null;
                        exception = e22;
                        str = "UploadTask";
                        str2 = "could not locate file for uploading:";
                        valueOf = String.valueOf(this.mUri.toString());
                        if (valueOf.length() == 0) {
                        }
                        Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                        this.zzbwC = exception;
                        j2 = j3;
                        inputStream = openInputStream;
                        statSize = j2;
                        this.zzbVs = statSize;
                        this.zzbVu = inputStream;
                        this.zzbVv = uri2;
                    }
                    this.zzbVs = statSize;
                    this.zzbVu = inputStream;
                    this.zzbVv = uri2;
                } catch (IOException e3) {
                    j3 = statSize;
                    try {
                        str3 = "UploadTask";
                        str4 = "could not retrieve file size for upload ";
                        valueOf = String.valueOf(this.mUri.toString());
                        Log.w(str3, valueOf.length() == 0 ? str4.concat(valueOf) : new String(str4));
                        openInputStream = contentResolver.openInputStream(this.mUri);
                        j2 = j3;
                        inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
                        statSize = j2;
                    } catch (Exception e222) {
                        exception = e222;
                        openInputStream = null;
                        str = "UploadTask";
                        str2 = "could not locate file for uploading:";
                        valueOf = String.valueOf(this.mUri.toString());
                        if (valueOf.length() == 0) {
                        }
                        Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                        this.zzbwC = exception;
                        j2 = j3;
                        inputStream = openInputStream;
                        statSize = j2;
                        this.zzbVs = statSize;
                        this.zzbVu = inputStream;
                        this.zzbVv = uri2;
                    }
                    this.zzbVs = statSize;
                    this.zzbVu = inputStream;
                    this.zzbVv = uri2;
                } catch (Exception e4) {
                    exception = e4;
                    j3 = statSize;
                    openInputStream = null;
                    str = "UploadTask";
                    str2 = "could not locate file for uploading:";
                    valueOf = String.valueOf(this.mUri.toString());
                    if (valueOf.length() == 0) {
                    }
                    Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                    this.zzbwC = exception;
                    j2 = j3;
                    inputStream = openInputStream;
                    statSize = j2;
                    this.zzbVs = statSize;
                    this.zzbVu = inputStream;
                    this.zzbVv = uri2;
                }
            }
            statSize = -1;
            j3 = statSize;
        } catch (NullPointerException e5) {
            th = e5;
            j = -1;
            Log.w("UploadTask", "NullPointerException during file size calculation.", th);
            openInputStream = contentResolver.openInputStream(this.mUri);
            if (openInputStream == null) {
            }
            j2 = j3;
            inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
            statSize = j2;
            this.zzbVs = statSize;
            this.zzbVu = inputStream;
            this.zzbVv = uri2;
        } catch (IOException e6) {
            str3 = "UploadTask";
            str4 = "could not retrieve file size for upload ";
            valueOf = String.valueOf(this.mUri.toString());
            if (valueOf.length() == 0) {
            }
            Log.w(str3, valueOf.length() == 0 ? str4.concat(valueOf) : new String(str4));
            openInputStream = contentResolver.openInputStream(this.mUri);
            if (openInputStream == null) {
            }
            j2 = j3;
            inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
            statSize = j2;
            this.zzbVs = statSize;
            this.zzbVu = inputStream;
            this.zzbVv = uri2;
        }
        openInputStream = contentResolver.openInputStream(this.mUri);
        if (openInputStream == null) {
        }
        j2 = j3;
        inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
        statSize = j2;
        this.zzbVs = statSize;
        this.zzbVu = inputStream;
        this.zzbVv = uri2;
    }

    UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, InputStream inputStream) {
        this.zzbVr = new byte[262144];
        this.zzbVt = new AtomicLong(0);
        this.zzbVv = null;
        this.zzbwC = null;
        this.zzbVw = null;
        this.mResultCode = 0;
        zzaa.zzz(storageReference);
        zzaa.zzz(inputStream);
        this.zzbVs = -1;
        this.zzbjm = null;
        this.zzbTR = storageReference;
        this.zzbUw = storageMetadata;
        this.zzbVu = new BufferedInputStream(inputStream, 262144);
        this.mUri = null;
        this.zzbTT = new zzajk(this.zzbTR.getApp(), this.zzbTR.getStorage().getMaxUploadRetryTimeMillis());
    }

    UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, byte[] bArr) {
        this.zzbVr = new byte[262144];
        this.zzbVt = new AtomicLong(0);
        this.zzbVv = null;
        this.zzbwC = null;
        this.zzbVw = null;
        this.mResultCode = 0;
        zzaa.zzz(storageReference);
        zzaa.zzz(bArr);
        this.zzbjm = bArr;
        this.zzbVs = (long) this.zzbjm.length;
        this.zzbTR = storageReference;
        this.zzbUw = storageMetadata;
        this.mUri = null;
        this.zzbVu = new BufferedInputStream(new ByteArrayInputStream(this.zzbjm), 262144);
        this.zzbTT = new zzajk(this.zzbTR.getApp(), this.zzbTR.getStorage().getMaxUploadRetryTimeMillis());
    }

    private void zzVg() {
        Throwable e;
        JSONObject jSONObject = null;
        if (this.zzbUw != null) {
            String contentType = this.zzbUw.getContentType();
        } else {
            CharSequence charSequence = null;
        }
        if (this.mUri != null && TextUtils.isEmpty(r0)) {
            contentType = this.zzbTR.getStorage().getApp().getApplicationContext().getContentResolver().getType(this.mUri);
        }
        if (TextUtils.isEmpty(contentType)) {
            contentType = "application/octet-stream";
        }
        try {
            zzajs zzUT = this.zzbTR.zzUT();
            Uri zzUU = this.zzbTR.zzUU();
            if (this.zzbUw != null) {
                jSONObject = this.zzbUw.zzUS();
            }
            zzajt zza = zzUT.zza(zzUU, jSONObject, contentType);
            if (zzb(zza)) {
                Object zziN = zza.zziN("X-Goog-Upload-URL");
                if (!TextUtils.isEmpty(zziN)) {
                    this.zzbVv = Uri.parse(zziN);
                }
            }
        } catch (JSONException e2) {
            e = e2;
            Log.e("UploadTask", "Unable to create a network request from metadata", e);
            this.zzbwC = e;
        } catch (RemoteException e3) {
            e = e3;
            Log.e("UploadTask", "Unable to create a network request from metadata", e);
            this.zzbwC = e;
        }
    }

    private boolean zzVh() {
        if (zzUW() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.zzbwC = new InterruptedException();
            zzi(64, false);
            return false;
        } else if (zzUW() == 32) {
            zzi(256, false);
            return false;
        } else if (zzUW() == 8) {
            zzi(16, false);
            return false;
        } else if (!zzVi()) {
            return false;
        } else {
            if (this.zzbVv == null) {
                if (this.zzbwC == null) {
                    this.zzbwC = new IllegalStateException("Unable to obtain an upload URL.");
                }
                zzi(64, false);
                return false;
            } else if (this.zzbwC != null) {
                zzi(64, false);
                return false;
            } else {
                boolean z = this.zzbVw != null || this.mResultCode < 200 || this.mResultCode >= Strategy.TTL_SECONDS_DEFAULT;
                if (!z || zzaU(true)) {
                    return true;
                }
                if (!zzVi()) {
                    return false;
                }
                zzi(64, false);
                return false;
            }
        }
    }

    private boolean zzVi() {
        if (!"final".equals(this.zzbVx)) {
            return true;
        }
        if (this.zzbwC == null) {
            this.zzbwC = new IOException("The server has terminated the upload session");
        }
        zzi(64, false);
        return false;
    }

    private void zzVj() {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        this.zzbVu.mark(this.zzbVr.length + 1);
        try {
            int read = this.zzbVu.read(this.zzbVr);
            try {
                zzajt zza = this.zzbTR.zzUT().zza(this.zzbTR.zzUU(), this.zzbVv.toString(), this.zzbVr, this.zzbVt.get(), read, ((long) read) != 262144);
                if (zza(zza)) {
                    if (read != -1) {
                        this.zzbVt.getAndAdd((long) read);
                    }
                    if (((long) read) != 262144) {
                        try {
                            this.zzbUw = new Builder(zza.zzVw(), this.zzbTR).build();
                            zzi(4, false);
                            zzi(128, false);
                            return;
                        } catch (JSONException e2) {
                            e = e2;
                            str = "UploadTask";
                            str2 = "Unable to parse resulting metadata from upload:";
                            valueOf = String.valueOf(zza.zzVq());
                            Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                            this.zzbwC = e;
                            return;
                        } catch (RemoteException e3) {
                            e = e3;
                            str = "UploadTask";
                            str2 = "Unable to parse resulting metadata from upload:";
                            valueOf = String.valueOf(zza.zzVq());
                            if (valueOf.length() == 0) {
                            }
                            Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                            this.zzbwC = e;
                            return;
                        }
                    }
                    return;
                }
                try {
                    this.zzbVu.reset();
                } catch (Throwable e4) {
                    Log.w("UploadTask", "Unable to reset the stream for error recovery.", e4);
                    this.zzbwC = e4;
                }
            } catch (Throwable e42) {
                Log.e("UploadTask", "Unable to create chunk upload request", e42);
                this.zzbwC = e42;
            }
        } catch (Throwable e422) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e422);
            this.zzbwC = e422;
        }
    }

    private boolean zza(zzajt com_google_android_gms_internal_zzajt) {
        com_google_android_gms_internal_zzajt.zza(zzajp.zzh(this.zzbTR.getApp()), this.zzbTR.getApp().getApplicationContext());
        return zzc(com_google_android_gms_internal_zzajt);
    }

    private boolean zzaU(boolean z) {
        try {
            zzajt zzb = this.zzbTR.zzUT().zzb(this.zzbTR.zzUU(), this.zzbVv.toString());
            if ("final".equals(this.zzbVx)) {
                return false;
            }
            if (z) {
                if (!zzb(zzb)) {
                    return false;
                }
            } else if (!zza(zzb)) {
                return false;
            }
            if ("final".equals(zzb.zziN("X-Goog-Upload-Status"))) {
                this.zzbwC = new IOException("The server has terminated the upload session");
                return false;
            }
            Object zziN = zzb.zziN("X-Goog-Upload-Size-Received");
            long parseLong = !TextUtils.isEmpty(zziN) ? Long.parseLong(zziN) : 0;
            long j = this.zzbVt.get();
            if (j > parseLong) {
                this.zzbwC = new IOException("Unexpected error. The server lost a chunk update.");
                return false;
            }
            if (j < parseLong) {
                try {
                    if (this.zzbVu.skip(parseLong - j) != parseLong - j) {
                        this.zzbwC = new IOException("Unexpected end of stream encountered.");
                        return false;
                    } else if (!this.zzbVt.compareAndSet(j, parseLong)) {
                        Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                        this.zzbwC = new IllegalStateException("uploaded bytes changed unexpectedly.");
                        return false;
                    }
                } catch (Throwable e) {
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                    this.zzbwC = e;
                    return false;
                }
            }
            return true;
        } catch (Throwable e2) {
            Log.e("UploadTask", "Unable to recover status during resumable upload", e2);
            this.zzbwC = e2;
            return false;
        }
    }

    private boolean zzb(zzajt com_google_android_gms_internal_zzajt) {
        this.zzbTT.zzd(com_google_android_gms_internal_zzajt);
        return zzc(com_google_android_gms_internal_zzajt);
    }

    private boolean zzc(zzajt com_google_android_gms_internal_zzajt) {
        int resultCode = com_google_android_gms_internal_zzajt.getResultCode();
        if (this.zzbTT.zznO(resultCode)) {
            resultCode = -2;
        }
        this.mResultCode = resultCode;
        this.zzbVw = com_google_android_gms_internal_zzajt.getException();
        this.zzbVx = com_google_android_gms_internal_zzajt.zziN("X-Goog-Upload-Status");
        return zznK(this.mResultCode) && this.zzbVw == null;
    }

    private boolean zznK(int i) {
        return i == StatusLine.HTTP_PERM_REDIRECT || (i >= 200 && i < Strategy.TTL_SECONDS_DEFAULT);
    }

    StorageReference getStorage() {
        return this.zzbTR;
    }

    long getTotalByteCount() {
        return this.zzbVs;
    }

    protected void onCanceled() {
        zzajt zza;
        this.zzbTT.cancel();
        try {
            zza = this.zzbTR.zzUT().zza(this.zzbTR.zzUU(), this.zzbVv.toString());
        } catch (Throwable e) {
            Log.e("UploadTask", "Unable to create chunk upload request", e);
            zza = null;
        }
        if (zza != null) {
            zzd.zzVc().zzl(new Runnable(this) {
                final /* synthetic */ UploadTask b;

                public void run() {
                    zza.zza(zzajp.zzh(this.b.zzbTR.getApp()), this.b.zzbTR.getApp().getApplicationContext());
                }
            });
        }
        this.zzbwC = StorageException.fromErrorStatus(Status.zzalA);
        super.onCanceled();
    }

    protected void resetState() {
        this.zzbwC = null;
        this.zzbVw = null;
        this.mResultCode = 0;
        this.zzbVx = null;
    }

    void run() {
        this.zzbTT.reset();
        if (this.zzbTR.getParent() == null) {
            this.zzbwC = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.zzbwC != null) {
            zzi(64, false);
            return;
        }
        if (this.zzbVv == null) {
            zzVg();
        } else {
            zzaU(false);
        }
        while (zzVh()) {
            zzi(4, false);
            zzVj();
        }
    }

    protected void schedule() {
        zzd.zzVc().zzm(zzVa());
    }

    /* synthetic */ ProvideError zzUQ() {
        return zzVk();
    }

    TaskSnapshot zzVk() {
        return new TaskSnapshot(this, StorageException.fromExceptionAndHttpCode(this.zzbwC != null ? this.zzbwC : this.zzbVw, this.mResultCode), this.zzbVt.get(), this.zzbVv, this.zzbUw);
    }
}
