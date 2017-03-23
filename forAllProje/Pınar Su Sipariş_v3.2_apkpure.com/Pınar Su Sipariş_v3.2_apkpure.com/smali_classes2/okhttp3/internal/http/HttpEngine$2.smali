.class Lokhttp3/internal/http/HttpEngine$2;
.super Ljava/lang/Object;
.source "HttpEngine.java"

# interfaces
.implements Lb/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/http/HttpEngine;->cacheWritingResponse(Lokhttp3/internal/http/CacheRequest;Lokhttp3/Response;)Lokhttp3/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field cacheRequestClosed:Z

.field final synthetic this$0:Lokhttp3/internal/http/HttpEngine;

.field final synthetic val$cacheBody:Lb/d;

.field final synthetic val$cacheRequest:Lokhttp3/internal/http/CacheRequest;

.field final synthetic val$source:Lb/e;


# direct methods
.method constructor <init>(Lokhttp3/internal/http/HttpEngine;Lb/e;Lokhttp3/internal/http/CacheRequest;Lb/d;)V
    .locals 0

    .prologue
    .line 759
    iput-object p1, p0, Lokhttp3/internal/http/HttpEngine$2;->this$0:Lokhttp3/internal/http/HttpEngine;

    iput-object p2, p0, Lokhttp3/internal/http/HttpEngine$2;->val$source:Lb/e;

    iput-object p3, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheRequest:Lokhttp3/internal/http/CacheRequest;

    iput-object p4, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheBody:Lb/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 792
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    if-nez v0, :cond_0

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 793
    invoke-static {p0, v0, v1}, Lokhttp3/internal/Util;->discard(Lb/s;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 794
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    .line 795
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheRequest:Lokhttp3/internal/http/CacheRequest;

    invoke-interface {v0}, Lokhttp3/internal/http/CacheRequest;->abort()V

    .line 797
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$source:Lb/e;

    invoke-interface {v0}, Lb/e;->close()V

    .line 798
    return-void
.end method

.method public read(Lb/c;J)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v0, -0x1

    const/4 v3, 0x1

    .line 765
    :try_start_0
    iget-object v2, p0, Lokhttp3/internal/http/HttpEngine$2;->val$source:Lb/e;

    invoke-interface {v2, p1, p2, p3}, Lb/e;->read(Lb/c;J)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v4

    .line 774
    cmp-long v2, v4, v0

    if-nez v2, :cond_2

    .line 775
    iget-boolean v2, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    if-nez v2, :cond_0

    .line 776
    iput-boolean v3, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    .line 777
    iget-object v2, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheBody:Lb/d;

    invoke-interface {v2}, Lb/d;->close()V

    :cond_0
    move-wide v4, v0

    .line 784
    :goto_0
    return-wide v4

    .line 766
    :catch_0
    move-exception v0

    .line 767
    iget-boolean v1, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    if-nez v1, :cond_1

    .line 768
    iput-boolean v3, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    .line 769
    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheRequest:Lokhttp3/internal/http/CacheRequest;

    invoke-interface {v1}, Lokhttp3/internal/http/CacheRequest;->abort()V

    .line 771
    :cond_1
    throw v0

    .line 782
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheBody:Lb/d;

    invoke-interface {v0}, Lb/d;->b()Lb/c;

    move-result-object v1

    invoke-virtual {p1}, Lb/c;->a()J

    move-result-wide v2

    sub-long/2addr v2, v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lb/c;->a(Lb/c;JJ)Lb/c;

    .line 783
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheBody:Lb/d;

    invoke-interface {v0}, Lb/d;->v()Lb/d;

    goto :goto_0
.end method

.method public timeout()Lb/t;
    .locals 1

    .prologue
    .line 788
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$source:Lb/e;

    invoke-interface {v0}, Lb/e;->timeout()Lb/t;

    move-result-object v0

    return-object v0
.end method
