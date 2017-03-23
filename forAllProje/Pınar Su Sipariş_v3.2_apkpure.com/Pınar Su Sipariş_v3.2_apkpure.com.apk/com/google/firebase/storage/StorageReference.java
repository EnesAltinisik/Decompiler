package com.google.firebase.storage;

import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzajl;
import com.google.android.gms.internal.zzajs;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.StreamDownloadTask.StreamProcessor;
import com.google.firebase.storage.StreamDownloadTask.TaskSnapshot;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StorageReference {
    static final /* synthetic */ boolean $assertionsDisabled = (!StorageReference.class.desiredAssertionStatus());
    private final Uri zzbUy;
    private final FirebaseStorage zzbUz;

    StorageReference(Uri uri, FirebaseStorage firebaseStorage) {
        boolean z = true;
        zzaa.zzb(uri != null, (Object) "storageUri cannot be null");
        if (firebaseStorage == null) {
            z = false;
        }
        zzaa.zzb(z, (Object) "FirebaseApp cannot be null");
        this.zzbUy = uri;
        this.zzbUz = firebaseStorage;
    }

    public StorageReference child(String str) {
        zzaa.zzb(!TextUtils.isEmpty(str), (Object) "childName cannot be null or empty");
        String zziJ = zzajl.zziJ(str);
        try {
            return new StorageReference(this.zzbUy.buildUpon().appendEncodedPath(zzajl.zziH(zziJ)).build(), this.zzbUz);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "StorageReference";
            String str3 = "Unable to create a valid default Uri. ";
            String valueOf = String.valueOf(zziJ);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            throw new IllegalArgumentException("childName");
        }
    }

    public Task<Void> delete() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzd.zzVc().zzl(new a(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        return !(obj instanceof StorageReference) ? false : ((StorageReference) obj).toString().equals(toString());
    }

    public List<FileDownloadTask> getActiveDownloadTasks() {
        return c.a().b(this);
    }

    public List<UploadTask> getActiveUploadTasks() {
        return c.a().a(this);
    }

    FirebaseApp getApp() {
        return getStorage().getApp();
    }

    public String getBucket() {
        return this.zzbUy.getAuthority();
    }

    public Task<byte[]> getBytes(final long j) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        StorageTask storageTask = (StorageTask) ((StorageTask) streamDownloadTask.zza(new StreamProcessor(this) {
            final /* synthetic */ StorageReference c;

            public void doInBackground(TaskSnapshot taskSnapshot, InputStream inputStream) throws IOException {
                int i = 0;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 16384);
                        if (read == -1) {
                            break;
                        }
                        i += read;
                        if (((long) i) > j) {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    taskCompletionSource.setResult(byteArrayOutputStream.toByteArray());
                } finally {
                    inputStream.close();
                }
            }
        }).addOnSuccessListener(new OnSuccessListener<TaskSnapshot>(this) {
            final /* synthetic */ StorageReference b;

            public void a(TaskSnapshot taskSnapshot) {
                if (!taskCompletionSource.getTask().isComplete()) {
                    Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
                    taskCompletionSource.setException(StorageException.fromErrorStatus(Status.zzaly));
                }
            }

            public /* synthetic */ void onSuccess(Object obj) {
                a((TaskSnapshot) obj);
            }
        })).addOnFailureListener(new OnFailureListener(this) {
            static final /* synthetic */ boolean a = (!StorageReference.class.desiredAssertionStatus());
            final /* synthetic */ StorageReference c;

            public void onFailure(Exception exception) {
                Exception fromExceptionAndHttpCode = StorageException.fromExceptionAndHttpCode(exception, 0);
                if (a || fromExceptionAndHttpCode != null) {
                    taskCompletionSource.setException(fromExceptionAndHttpCode);
                    return;
                }
                throw new AssertionError();
            }
        });
        streamDownloadTask.zzUV();
        return taskCompletionSource.getTask();
    }

    public Task<Uri> getDownloadUrl() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task metadata = getMetadata();
        metadata.addOnSuccessListener(new OnSuccessListener<StorageMetadata>(this) {
            final /* synthetic */ StorageReference b;

            public void a(StorageMetadata storageMetadata) {
                taskCompletionSource.setResult(storageMetadata.getDownloadUrl());
            }

            public /* synthetic */ void onSuccess(Object obj) {
                a((StorageMetadata) obj);
            }
        });
        metadata.addOnFailureListener(new OnFailureListener(this) {
            final /* synthetic */ StorageReference b;

            public void onFailure(Exception exception) {
                taskCompletionSource.setException(exception);
            }
        });
        return taskCompletionSource.getTask();
    }

    public FileDownloadTask getFile(Uri uri) {
        FileDownloadTask fileDownloadTask = new FileDownloadTask(this, uri);
        fileDownloadTask.zzUV();
        return fileDownloadTask;
    }

    public FileDownloadTask getFile(File file) {
        return getFile(Uri.fromFile(file));
    }

    public Task<StorageMetadata> getMetadata() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzd.zzVc().zzl(new b(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public String getName() {
        String path = this.zzbUy.getPath();
        if ($assertionsDisabled || path != null) {
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        } else {
            throw new AssertionError();
        }
    }

    public StorageReference getParent() {
        String path = this.zzbUy.getPath();
        if (path == null || path.equals("/")) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        return new StorageReference(this.zzbUy.buildUpon().path(lastIndexOf == -1 ? "/" : path.substring(0, lastIndexOf)).build(), this.zzbUz);
    }

    public String getPath() {
        String path = this.zzbUy.getPath();
        if ($assertionsDisabled || path != null) {
            return path;
        }
        throw new AssertionError();
    }

    public StorageReference getRoot() {
        return new StorageReference(this.zzbUy.buildUpon().path("").build(), this.zzbUz);
    }

    public FirebaseStorage getStorage() {
        return this.zzbUz;
    }

    public StreamDownloadTask getStream() {
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        streamDownloadTask.zzUV();
        return streamDownloadTask;
    }

    public StreamDownloadTask getStream(StreamProcessor streamProcessor) {
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        streamDownloadTask.zza(streamProcessor);
        streamDownloadTask.zzUV();
        return streamDownloadTask;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public UploadTask putBytes(byte[] bArr) {
        zzaa.zzb(bArr != null, (Object) "bytes cannot be null");
        UploadTask uploadTask = new UploadTask(this, null, bArr);
        uploadTask.zzUV();
        return uploadTask;
    }

    public UploadTask putBytes(byte[] bArr, StorageMetadata storageMetadata) {
        boolean z = true;
        zzaa.zzb(bArr != null, (Object) "bytes cannot be null");
        if (storageMetadata == null) {
            z = false;
        }
        zzaa.zzb(z, (Object) "metadata cannot be null");
        UploadTask uploadTask = new UploadTask(this, storageMetadata, bArr);
        uploadTask.zzUV();
        return uploadTask;
    }

    public UploadTask putFile(Uri uri) {
        zzaa.zzb(uri != null, (Object) "uri cannot be null");
        UploadTask uploadTask = new UploadTask(this, null, uri, null);
        uploadTask.zzUV();
        return uploadTask;
    }

    public UploadTask putFile(Uri uri, StorageMetadata storageMetadata) {
        boolean z = true;
        zzaa.zzb(uri != null, (Object) "uri cannot be null");
        if (storageMetadata == null) {
            z = false;
        }
        zzaa.zzb(z, (Object) "metadata cannot be null");
        UploadTask uploadTask = new UploadTask(this, storageMetadata, uri, null);
        uploadTask.zzUV();
        return uploadTask;
    }

    public UploadTask putFile(Uri uri, StorageMetadata storageMetadata, Uri uri2) {
        boolean z = true;
        zzaa.zzb(uri != null, (Object) "uri cannot be null");
        if (storageMetadata == null) {
            z = false;
        }
        zzaa.zzb(z, (Object) "metadata cannot be null");
        UploadTask uploadTask = new UploadTask(this, storageMetadata, uri, uri2);
        uploadTask.zzUV();
        return uploadTask;
    }

    public UploadTask putStream(InputStream inputStream) {
        zzaa.zzb(inputStream != null, (Object) "stream cannot be null");
        UploadTask uploadTask = new UploadTask(this, null, inputStream);
        uploadTask.zzUV();
        return uploadTask;
    }

    public UploadTask putStream(InputStream inputStream, StorageMetadata storageMetadata) {
        boolean z = true;
        zzaa.zzb(inputStream != null, (Object) "stream cannot be null");
        if (storageMetadata == null) {
            z = false;
        }
        zzaa.zzb(z, (Object) "metadata cannot be null");
        UploadTask uploadTask = new UploadTask(this, storageMetadata, inputStream);
        uploadTask.zzUV();
        return uploadTask;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbUy.getAuthority());
        String valueOf2 = String.valueOf(this.zzbUy.getPath());
        return new StringBuilder((String.valueOf(valueOf).length() + 5) + String.valueOf(valueOf2).length()).append("gs://").append(valueOf).append(valueOf2).toString();
    }

    public Task<StorageMetadata> updateMetadata(StorageMetadata storageMetadata) {
        zzaa.zzz(storageMetadata);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzd.zzVc().zzl(new d(this, taskCompletionSource, storageMetadata));
        return taskCompletionSource.getTask();
    }

    zzajs zzUT() throws RemoteException {
        return zzajs.zzi(getApp());
    }

    Uri zzUU() {
        return this.zzbUy;
    }
}
