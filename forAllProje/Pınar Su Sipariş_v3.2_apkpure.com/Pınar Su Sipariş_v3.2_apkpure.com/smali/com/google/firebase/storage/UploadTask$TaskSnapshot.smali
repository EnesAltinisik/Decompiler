.class public Lcom/google/firebase/storage/UploadTask$TaskSnapshot;
.super Lcom/google/firebase/storage/StorageTask$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/UploadTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TaskSnapshot"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/StorageTask",
        "<",
        "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;",
        ">.a;"
    }
.end annotation


# instance fields
.field private final zzbUw:Lcom/google/firebase/storage/StorageMetadata;

.field private final zzbVA:J

.field private final zzbVv:Landroid/net/Uri;

.field final synthetic zzbVz:Lcom/google/firebase/storage/UploadTask;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/UploadTask;Ljava/lang/Exception;JLandroid/net/Uri;Lcom/google/firebase/storage/StorageMetadata;)V
    .locals 1

    iput-object p1, p0, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->zzbVz:Lcom/google/firebase/storage/UploadTask;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/StorageTask$a;-><init>(Lcom/google/firebase/storage/StorageTask;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->zzbVA:J

    iput-object p5, p0, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->zzbVv:Landroid/net/Uri;

    iput-object p6, p0, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->zzbUw:Lcom/google/firebase/storage/StorageMetadata;

    return-void
.end method


# virtual methods
.method public getBytesTransferred()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->zzbVA:J

    return-wide v0
.end method

.method public getDownloadUrl()Landroid/net/Uri;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->getMetadata()Lcom/google/firebase/storage/StorageMetadata;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/storage/StorageMetadata;->getDownloadUrl()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic getError()Ljava/lang/Exception;
    .locals 1

    invoke-super {p0}, Lcom/google/firebase/storage/StorageTask$a;->getError()Ljava/lang/Exception;

    move-result-object v0

    return-object v0
.end method

.method public getMetadata()Lcom/google/firebase/storage/StorageMetadata;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->zzbUw:Lcom/google/firebase/storage/StorageMetadata;

    return-object v0
.end method

.method public bridge synthetic getStorage()Lcom/google/firebase/storage/StorageReference;
    .locals 1

    invoke-super {p0}, Lcom/google/firebase/storage/StorageTask$a;->getStorage()Lcom/google/firebase/storage/StorageReference;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getTask()Lcom/google/firebase/storage/StorageTask;
    .locals 1

    invoke-super {p0}, Lcom/google/firebase/storage/StorageTask$a;->getTask()Lcom/google/firebase/storage/StorageTask;

    move-result-object v0

    return-object v0
.end method

.method public getTotalByteCount()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->zzbVz:Lcom/google/firebase/storage/UploadTask;

    invoke-virtual {v0}, Lcom/google/firebase/storage/UploadTask;->getTotalByteCount()J

    move-result-wide v0

    return-wide v0
.end method

.method public getUploadSessionUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/UploadTask$TaskSnapshot;->zzbVv:Landroid/net/Uri;

    return-object v0
.end method
