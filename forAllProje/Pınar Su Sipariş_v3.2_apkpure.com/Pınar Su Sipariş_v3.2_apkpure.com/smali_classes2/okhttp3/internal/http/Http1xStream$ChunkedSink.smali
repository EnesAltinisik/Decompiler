.class final Lokhttp3/internal/http/Http1xStream$ChunkedSink;
.super Ljava/lang/Object;
.source "Http1xStream.java"

# interfaces
.implements Lb/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http/Http1xStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ChunkedSink"
.end annotation


# instance fields
.field private closed:Z

.field final synthetic this$0:Lokhttp3/internal/http/Http1xStream;

.field private final timeout:Lb/j;


# direct methods
.method private constructor <init>(Lokhttp3/internal/http/Http1xStream;)V
    .locals 2

    .prologue
    .line 309
    iput-object p1, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 310
    new-instance v0, Lb/j;

    iget-object v1, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;
    invoke-static {v1}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lb/d;

    move-result-object v1

    invoke-interface {v1}, Lb/d;->timeout()Lb/t;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/j;-><init>(Lb/t;)V

    iput-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->timeout:Lb/j;

    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/Http1xStream$1;)V
    .locals 0

    .prologue
    .line 309
    invoke-direct {p0, p1}, Lokhttp3/internal/http/Http1xStream$ChunkedSink;-><init>(Lokhttp3/internal/http/Http1xStream;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 333
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 338
    :goto_0
    monitor-exit p0

    return-void

    .line 334
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->closed:Z

    .line 335
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lb/d;

    move-result-object v0

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 336
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    iget-object v1, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->timeout:Lb/j;

    # invokes: Lokhttp3/internal/http/Http1xStream;->detachTimeout(Lb/j;)V
    invoke-static {v0, v1}, Lokhttp3/internal/http/Http1xStream;->access$400(Lokhttp3/internal/http/Http1xStream;Lb/j;)V

    .line 337
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    const/4 v1, 0x3

    # setter for: Lokhttp3/internal/http/Http1xStream;->state:I
    invoke-static {v0, v1}, Lokhttp3/internal/http/Http1xStream;->access$502(Lokhttp3/internal/http/Http1xStream;I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 333
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 328
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 330
    :goto_0
    monitor-exit p0

    return-void

    .line 329
    :cond_0
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lb/d;

    move-result-object v0

    invoke-interface {v0}, Lb/d;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 328
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public timeout()Lb/t;
    .locals 1

    .prologue
    .line 314
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->timeout:Lb/j;

    return-object v0
.end method

.method public write(Lb/c;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 318
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->closed:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 319
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    .line 325
    :goto_0
    return-void

    .line 321
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lb/d;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lb/d;->k(J)Lb/d;

    .line 322
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lb/d;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 323
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lb/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lb/d;->write(Lb/c;J)V

    .line 324
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    # getter for: Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;
    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lb/d;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    goto :goto_0
.end method
