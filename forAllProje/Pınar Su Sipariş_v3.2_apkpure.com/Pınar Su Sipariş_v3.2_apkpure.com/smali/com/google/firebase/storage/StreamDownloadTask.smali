.class public Lcom/google/firebase/storage/StreamDownloadTask;
.super Lcom/google/firebase/storage/StorageTask;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;,
        Lcom/google/firebase/storage/StreamDownloadTask$a;,
        Lcom/google/firebase/storage/StreamDownloadTask$StreamProcessor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/StorageTask",
        "<",
        "Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;",
        ">;"
    }
.end annotation


# instance fields
.field private volatile mResultCode:I

.field private zzawx:J

.field private zzbCO:Ljava/io/InputStream;

.field private zzbTR:Lcom/google/firebase/storage/StorageReference;

.field private zzbTT:Lcom/google/android/gms/internal/zzajk;

.field private zzbTV:J

.field private zzbVa:Lcom/google/firebase/storage/StreamDownloadTask$StreamProcessor;

.field private zzbVb:J

.field private zzbVc:Lcom/google/android/gms/internal/zzajt;

.field private volatile zzbwC:Ljava/lang/Exception;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/StorageReference;)V
    .locals 4

    invoke-direct {p0}, Lcom/google/firebase/storage/StorageTask;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->mResultCode:I

    iput-object p1, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTR:Lcom/google/firebase/storage/StorageReference;

    new-instance v0, Lcom/google/android/gms/internal/zzajk;

    iget-object v1, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTR:Lcom/google/firebase/storage/StorageReference;

    invoke-virtual {v1}, Lcom/google/firebase/storage/StorageReference;->getApp()Lcom/google/firebase/FirebaseApp;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTR:Lcom/google/firebase/storage/StorageReference;

    invoke-virtual {v2}, Lcom/google/firebase/storage/StorageReference;->getStorage()Lcom/google/firebase/storage/FirebaseStorage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/storage/FirebaseStorage;->getMaxDownloadRetryTimeMillis()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzajk;-><init>(Lcom/google/firebase/FirebaseApp;J)V

    iput-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTT:Lcom/google/android/gms/internal/zzajk;

    return-void
.end method

.method static synthetic zza(Lcom/google/firebase/storage/StreamDownloadTask;)Lcom/google/android/gms/internal/zzajt;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;

    return-object v0
.end method

.method static synthetic zza(Lcom/google/firebase/storage/StreamDownloadTask;J)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/StreamDownloadTask;->zzaM(J)V

    return-void
.end method

.method private zzaM(J)V
    .locals 5

    iget-wide v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTV:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTV:J

    iget-wide v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVb:J

    const-wide/32 v2, 0x40000

    add-long/2addr v0, v2

    iget-wide v2, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTV:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/storage/StreamDownloadTask;->zzi(IZ)Z

    :cond_0
    return-void
.end method

.method static synthetic zzb(Lcom/google/firebase/storage/StreamDownloadTask;)Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbCO:Ljava/io/InputStream;

    return-object v0
.end method

.method private zznK(I)Z
    .locals 1

    const/16 v0, 0x134

    if-eq p1, v0, :cond_0

    const/16 v0, 0xc8

    if-lt p1, v0, :cond_1

    const/16 v0, 0x12c

    if-ge p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method getStorage()Lcom/google/firebase/storage/StorageReference;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTR:Lcom/google/firebase/storage/StorageReference;

    return-object v0
.end method

.method getTotalBytes()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzawx:J

    return-wide v0
.end method

.method protected onCanceled()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTT:Lcom/google/android/gms/internal/zzajk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajk;->cancel()V

    return-void
.end method

.method protected onProgress()V
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTV:J

    iput-wide v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVb:J

    return-void
.end method

.method public pause()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public resume()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method run()V
    .locals 9

    const/4 v2, 0x1

    const/16 v1, 0x40

    const/4 v8, 0x4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTT:Lcom/google/android/gms/internal/zzajk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajk;->reset()V

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zzi(IZ)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, v8, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zzi(IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTR:Lcom/google/firebase/storage/StorageReference;

    invoke-virtual {v0}, Lcom/google/firebase/storage/StorageReference;->zzUT()Lcom/google/android/gms/internal/zzajs;

    move-result-object v0

    iget-object v4, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTR:Lcom/google/firebase/storage/StorageReference;

    invoke-virtual {v4}, Lcom/google/firebase/storage/StorageReference;->zzUU()Landroid/net/Uri;

    move-result-object v4

    const-wide/16 v6, 0x0

    invoke-virtual {v0, v4, v6, v7}, Lcom/google/android/gms/internal/zzajs;->zza(Landroid/net/Uri;J)Lcom/google/android/gms/internal/zzajt;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbTT:Lcom/google/android/gms/internal/zzajk;

    iget-object v4, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;

    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/internal/zzajk;->zza(Lcom/google/android/gms/internal/zzajt;Z)V

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajt;->getResultCode()I

    move-result v0

    iput v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->mResultCode:I

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajt;->getException()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajt;->getException()Ljava/lang/Exception;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    iget v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->mResultCode:I

    invoke-direct {p0, v0}, Lcom/google/firebase/storage/StreamDownloadTask;->zznK(I)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/google/firebase/storage/StreamDownloadTask;->zzUW()I

    move-result v0

    if-ne v0, v8, :cond_5

    move v4, v2

    :goto_2
    if-eqz v4, :cond_2

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajt;->zzVu()I

    move-result v0

    int-to-long v6, v0

    iput-wide v6, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzawx:J

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajt;->getStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v5, Lcom/google/firebase/storage/StreamDownloadTask$a;

    invoke-direct {v5, p0, v0}, Lcom/google/firebase/storage/StreamDownloadTask$a;-><init>(Lcom/google/firebase/storage/StreamDownloadTask;Ljava/io/InputStream;)V

    iput-object v5, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbCO:Ljava/io/InputStream;

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVa:Lcom/google/firebase/storage/StreamDownloadTask$StreamProcessor;

    if-eqz v0, :cond_2

    :try_start_1
    iget-object v5, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVa:Lcom/google/firebase/storage/StreamDownloadTask$StreamProcessor;

    invoke-virtual {p0}, Lcom/google/firebase/storage/StreamDownloadTask;->zzUY()Lcom/google/firebase/storage/StorageTask$ProvideError;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;

    iget-object v6, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbCO:Ljava/io/InputStream;

    invoke-interface {v5, v0, v6}, Lcom/google/firebase/storage/StreamDownloadTask$StreamProcessor;->doInBackground(Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_3
    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbCO:Ljava/io/InputStream;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVc:Lcom/google/android/gms/internal/zzajt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajt;->zzVn()V

    :cond_3
    if-eqz v4, :cond_7

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/firebase/storage/StreamDownloadTask;->zzUW()I

    move-result v0

    if-ne v0, v8, :cond_7

    move v0, v2

    :goto_4
    if-eqz v0, :cond_8

    invoke-virtual {p0, v8, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zzi(IZ)Z

    const/16 v0, 0x80

    invoke-virtual {p0, v0, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zzi(IZ)Z

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v2, "StreamDownloadTask"

    const-string v4, "Unable to create firebase storage network request."

    invoke-static {v2, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    invoke-virtual {p0, v1, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zzi(IZ)Z

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    goto :goto_1

    :cond_5
    move v4, v3

    goto :goto_2

    :catch_1
    move-exception v0

    const-string v5, "StreamDownloadTask"

    const-string v6, "Exception occurred calling doInBackground."

    invoke-static {v5, v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v5, "Could not open resulting stream."

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    goto :goto_3

    :cond_7
    move v0, v3

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/google/firebase/storage/StreamDownloadTask;->zzUW()I

    move-result v0

    const/16 v2, 0x20

    if-ne v0, v2, :cond_9

    const/16 v0, 0x100

    :goto_5
    invoke-virtual {p0, v0, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zzi(IZ)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "StreamDownloadTask"

    invoke-virtual {p0}, Lcom/google/firebase/storage/StreamDownloadTask;->zzUW()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x3e

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unable to change download task to final state from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :cond_9
    move v0, v1

    goto :goto_5
.end method

.method protected schedule()V
    .locals 2

    invoke-static {}, Lcom/google/firebase/storage/zzd;->zzVc()Lcom/google/firebase/storage/zzd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/storage/StreamDownloadTask;->zzVa()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/zzd;->zzn(Ljava/lang/Runnable;)V

    return-void
.end method

.method synthetic zzUQ()Lcom/google/firebase/storage/StorageTask$ProvideError;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/storage/StreamDownloadTask;->zzVd()Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;

    move-result-object v0

    return-object v0
.end method

.method zzVd()Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;
    .locals 4

    new-instance v0, Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;

    iget-object v1, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbwC:Ljava/lang/Exception;

    iget v2, p0, Lcom/google/firebase/storage/StreamDownloadTask;->mResultCode:I

    invoke-static {v1, v2}, Lcom/google/firebase/storage/StorageException;->fromExceptionAndHttpCode(Ljava/lang/Throwable;I)Lcom/google/firebase/storage/StorageException;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVb:J

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;-><init>(Lcom/google/firebase/storage/StreamDownloadTask;Ljava/lang/Exception;J)V

    return-object v0
.end method

.method zza(Lcom/google/firebase/storage/StreamDownloadTask$StreamProcessor;)Lcom/google/firebase/storage/StreamDownloadTask;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVa:Lcom/google/firebase/storage/StreamDownloadTask$StreamProcessor;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzai(Z)V

    iput-object p1, p0, Lcom/google/firebase/storage/StreamDownloadTask;->zzbVa:Lcom/google/firebase/storage/StreamDownloadTask$StreamProcessor;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
