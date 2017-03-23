.class public Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;
.super Lcom/google/firebase/storage/StorageTask$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/FileDownloadTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TaskSnapshot"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/StorageTask",
        "<",
        "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;",
        ">.a;"
    }
.end annotation


# instance fields
.field private final zzbTV:J

.field final synthetic zzbTY:Lcom/google/firebase/storage/FileDownloadTask;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/FileDownloadTask;Ljava/lang/Exception;J)V
    .locals 1

    iput-object p1, p0, Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;->zzbTY:Lcom/google/firebase/storage/FileDownloadTask;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/StorageTask$a;-><init>(Lcom/google/firebase/storage/StorageTask;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;->zzbTV:J

    return-void
.end method


# virtual methods
.method public getBytesTransferred()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;->zzbTV:J

    return-wide v0
.end method

.method public bridge synthetic getError()Ljava/lang/Exception;
    .locals 1

    invoke-super {p0}, Lcom/google/firebase/storage/StorageTask$a;->getError()Ljava/lang/Exception;

    move-result-object v0

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

    iget-object v0, p0, Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;->zzbTY:Lcom/google/firebase/storage/FileDownloadTask;

    invoke-virtual {v0}, Lcom/google/firebase/storage/FileDownloadTask;->getTotalBytes()J

    move-result-wide v0

    return-wide v0
.end method
