.class Lcom/google/firebase/storage/StreamDownloadTask$a;
.super Ljava/io/InputStream;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/StreamDownloadTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/firebase/storage/StreamDownloadTask;

.field private b:Ljava/io/InputStream;

.field private c:I


# direct methods
.method public constructor <init>(Lcom/google/firebase/storage/StreamDownloadTask;Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    iput-object p2, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    return-void
.end method

.method private a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    invoke-virtual {v0}, Lcom/google/firebase/storage/StreamDownloadTask;->zzUW()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/google/firebase/storage/StorageException;->zzbUe:Ljava/io/IOException;

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public available()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/storage/StreamDownloadTask$a;->a()V

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    invoke-static {v0}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;)Lcom/google/android/gms/internal/zzajt;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    invoke-static {v0}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;)Lcom/google/android/gms/internal/zzajt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajt;->zzVn()V

    :cond_0
    invoke-direct {p0}, Lcom/google/firebase/storage/StreamDownloadTask$a;->a()V

    return-void
.end method

.method public mark(I)V
    .locals 1

    iput p1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->c:I

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    return-void
.end method

.method public markSupported()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/storage/StreamDownloadTask$a;->a()V

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    const-wide/16 v2, 0x1

    invoke-static {v1, v2, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;J)V

    :cond_0
    return v0
.end method

.method public read([BII)I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/32 v8, 0x40000

    const/4 v0, -0x1

    invoke-direct {p0}, Lcom/google/firebase/storage/StreamDownloadTask$a;->a()V

    const/4 v1, 0x0

    move v2, p3

    move v3, p2

    :cond_0
    int-to-long v4, v2

    cmp-long v4, v4, v8

    if-lez v4, :cond_4

    iget-object v4, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    const/high16 v5, 0x40000

    invoke-virtual {v4, p1, v3, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-ne v4, v0, :cond_3

    if-nez v1, :cond_2

    :cond_1
    :goto_0
    return v0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    add-int/2addr v1, v4

    add-int/2addr v3, v4

    sub-int/2addr v2, v4

    iget-object v5, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    int-to-long v6, v4

    invoke-static {v5, v6, v7}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;J)V

    invoke-direct {p0}, Lcom/google/firebase/storage/StreamDownloadTask$a;->a()V

    int-to-long v4, v4

    cmp-long v4, v4, v8

    if-gez v4, :cond_0

    :cond_4
    if-lez v2, :cond_6

    iget-object v4, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v4, p1, v3, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-ne v2, v0, :cond_5

    if-eqz v1, :cond_1

    move v0, v1

    goto :goto_0

    :cond_5
    add-int/2addr v1, v2

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    int-to-long v2, v2

    invoke-static {v0, v2, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;J)V

    :cond_6
    move v0, v1

    goto :goto_0
.end method

.method public declared-synchronized reset()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/firebase/storage/StreamDownloadTask$a;->a()V

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    iget v1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->c:I

    neg-int v1, v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;J)V

    iget-object v0, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public skip(J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/32 v4, 0x40000

    invoke-direct {p0}, Lcom/google/firebase/storage/StreamDownloadTask$a;->a()V

    const/4 v0, 0x0

    :goto_0
    cmp-long v1, p1, v4

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v1, v4, v5}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    int-to-long v0, v0

    add-long/2addr v0, v2

    long-to-int v0, v0

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    iget-object v1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    invoke-static {v1, v2, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;J)V

    int-to-long v0, v0

    :goto_1
    return-wide v0

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    invoke-static {v1, v4, v5}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;J)V

    sub-long/2addr p1, v4

    invoke-direct {p0}, Lcom/google/firebase/storage/StreamDownloadTask$a;->a()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->b:Ljava/io/InputStream;

    invoke-virtual {v1, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    int-to-long v0, v0

    add-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Lcom/google/firebase/storage/StreamDownloadTask$a;->a:Lcom/google/firebase/storage/StreamDownloadTask;

    invoke-static {v1, v2, v3}, Lcom/google/firebase/storage/StreamDownloadTask;->zza(Lcom/google/firebase/storage/StreamDownloadTask;J)V

    int-to-long v0, v0

    goto :goto_1
.end method
