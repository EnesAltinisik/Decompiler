.class Lokhttp3/internal/http/Http1xStream$ChunkedSource;
.super Lokhttp3/internal/http/Http1xStream$AbstractSource;
.source "Http1xStream.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http/Http1xStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ChunkedSource"
.end annotation


# static fields
.field private static final NO_CHUNK_YET:J = -0x1L


# instance fields
.field private bytesRemainingInChunk:J

.field private hasMoreChunks:Z

.field private final httpEngine:Lokhttp3/internal/http/HttpEngine;

.field final synthetic this$0:Lokhttp3/internal/http/Http1xStream;


# direct methods
.method constructor <init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/HttpEngine;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 413
    iput-object p1, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lokhttp3/internal/http/Http1xStream$AbstractSource;-><init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/Http1xStream$1;)V

    .line 409
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    .line 410
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->hasMoreChunks:Z

    .line 414
    iput-object p2, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    .line 415
    return-void
.end method

.method private readChunkSize()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v4, 0x0

    .line 438
    iget-wide v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 439
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->source:Lb/e;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$600(Lokhttp3/internal/http/Http1xStream;)Lb/e;

    move-result-object v0

    invoke-interface {v0}, Lb/e;->r()Ljava/lang/String;

    .line 442
    :cond_0
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->source:Lb/e;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$600(Lokhttp3/internal/http/Http1xStream;)Lb/e;

    move-result-object v0

    invoke-interface {v0}, Lb/e;->o()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    .line 443
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->source:Lb/e;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$600(Lokhttp3/internal/http/Http1xStream;)Lb/e;

    move-result-object v0

    invoke-interface {v0}, Lb/e;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 444
    iget-wide v2, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    cmp-long v1, v2, v4

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 445
    :cond_1
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected chunk size and optional extensions but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v4, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 448
    :catch_0
    move-exception v0

    .line 449
    new-instance v1, Ljava/net/ProtocolException;

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 451
    :cond_2
    iget-wide v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_3

    .line 452
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->hasMoreChunks:Z

    .line 453
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    iget-object v1, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-virtual {v1}, Lokhttp3/internal/http/Http1xStream;->readHeaders()Lokhttp3/Headers;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/internal/http/HttpEngine;->receiveHeaders(Lokhttp3/Headers;)V

    .line 454
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->endOfInput(Z)V

    .line 456
    :cond_3
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 459
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->closed:Z

    if-eqz v0, :cond_0

    .line 464
    :goto_0
    return-void

    .line 460
    :cond_0
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->hasMoreChunks:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, Lokhttp3/internal/Util;->discard(Lb/s;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 461
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->endOfInput(Z)V

    .line 463
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->closed:Z

    goto :goto_0
.end method

.method public read(Lb/c;J)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v4, 0x0

    const-wide/16 v0, -0x1

    .line 418
    cmp-long v2, p2, v4

    if-gez v2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 419
    :cond_0
    iget-boolean v2, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->closed:Z

    if-eqz v2, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 420
    :cond_1
    iget-boolean v2, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->hasMoreChunks:Z

    if-nez v2, :cond_3

    .line 433
    :cond_2
    :goto_0
    return-wide v0

    .line 422
    :cond_3
    iget-wide v2, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    iget-wide v2, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    cmp-long v2, v2, v0

    if-nez v2, :cond_5

    .line 423
    :cond_4
    invoke-direct {p0}, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->readChunkSize()V

    .line 424
    iget-boolean v2, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->hasMoreChunks:Z

    if-eqz v2, :cond_2

    .line 427
    :cond_5
    iget-object v2, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->source:Lb/e;
    invoke-static {v2}, Lokhttp3/internal/http/Http1xStream;->access$600(Lokhttp3/internal/http/Http1xStream;)Lb/e;

    move-result-object v2

    iget-wide v4, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-interface {v2, p1, v4, v5}, Lb/e;->read(Lb/c;J)J

    move-result-wide v2

    .line 428
    cmp-long v0, v2, v0

    if-nez v0, :cond_6

    .line 429
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->endOfInput(Z)V

    .line 430
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 432
    :cond_6
    iget-wide v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;->bytesRemainingInChunk:J

    move-wide v0, v2

    .line 433
    goto :goto_0
.end method
