.class final Lb/n;
.super Ljava/lang/Object;
.source "RealBufferedSink.java"

# interfaces
.implements Lb/d;


# instance fields
.field public final a:Lb/c;

.field public final b:Lb/r;

.field private c:Z


# direct methods
.method public constructor <init>(Lb/r;)V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Lb/c;

    invoke-direct {v0}, Lb/c;-><init>()V

    invoke-direct {p0, p1, v0}, Lb/n;-><init>(Lb/r;Lb/c;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Lb/r;Lb/c;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sink == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_0
    iput-object p2, p0, Lb/n;->a:Lb/c;

    .line 31
    iput-object p1, p0, Lb/n;->b:Lb/r;

    .line 32
    return-void
.end method

.method static synthetic a(Lb/n;)Z
    .locals 1

    .prologue
    .line 23
    iget-boolean v0, p0, Lb/n;->c:Z

    return v0
.end method


# virtual methods
.method public a(Lb/s;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 100
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "source == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 101
    :cond_0
    const-wide/16 v0, 0x0

    .line 102
    :goto_0
    iget-object v2, p0, Lb/n;->a:Lb/c;

    const-wide/16 v4, 0x800

    invoke-interface {p1, v2, v4, v5}, Lb/s;->read(Lb/c;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    .line 103
    add-long/2addr v0, v2

    .line 104
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    goto :goto_0

    .line 106
    :cond_1
    return-wide v0
.end method

.method public b()Lb/c;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lb/n;->a:Lb/c;

    return-object v0
.end method

.method public b(Lb/f;)Lb/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 50
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1}, Lb/c;->a(Lb/f;)Lb/c;

    .line 52
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lb/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 56
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1}, Lb/c;->a(Ljava/lang/String;)Lb/c;

    .line 58
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public c([B)Lb/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 88
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1}, Lb/c;->b([B)Lb/c;

    .line 90
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public c([BII)Lb/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 94
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1, p2, p3}, Lb/c;->b([BII)Lb/c;

    .line 96
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 188
    new-instance v0, Lb/n$1;

    invoke-direct {v0, p0}, Lb/n$1;-><init>(Lb/n;)V

    return-object v0
.end method

.method public close()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 227
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_1

    .line 248
    :cond_0
    :goto_0
    return-void

    .line 231
    :cond_1
    const/4 v0, 0x0

    .line 233
    :try_start_0
    iget-object v1, p0, Lb/n;->a:Lb/c;

    iget-wide v2, v1, Lb/c;->b:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_2

    .line 234
    iget-object v1, p0, Lb/n;->b:Lb/r;

    iget-object v2, p0, Lb/n;->a:Lb/c;

    iget-object v3, p0, Lb/n;->a:Lb/c;

    iget-wide v4, v3, Lb/c;->b:J

    invoke-interface {v1, v2, v4, v5}, Lb/r;->write(Lb/c;J)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 241
    :cond_2
    :goto_1
    :try_start_1
    iget-object v1, p0, Lb/n;->b:Lb/r;

    invoke-interface {v1}, Lb/r;->close()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 245
    :cond_3
    :goto_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Lb/n;->c:Z

    .line 247
    if-eqz v0, :cond_0

    invoke-static {v0}, Lb/u;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 242
    :catch_0
    move-exception v1

    .line 243
    if-nez v0, :cond_3

    move-object v0, v1

    goto :goto_2

    .line 236
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public e()Lb/d;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 181
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 182
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0}, Lb/c;->a()J

    move-result-wide v0

    .line 183
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    iget-object v2, p0, Lb/n;->b:Lb/r;

    iget-object v3, p0, Lb/n;->a:Lb/c;

    invoke-interface {v2, v3, v0, v1}, Lb/r;->write(Lb/c;J)V

    .line 184
    :cond_1
    return-object p0
.end method

.method public f(I)Lb/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 138
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1}, Lb/c;->d(I)Lb/c;

    .line 140
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public flush()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 219
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    iget-wide v0, v0, Lb/c;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 221
    iget-object v0, p0, Lb/n;->b:Lb/r;

    iget-object v1, p0, Lb/n;->a:Lb/c;

    iget-object v2, p0, Lb/n;->a:Lb/c;

    iget-wide v2, v2, Lb/c;->b:J

    invoke-interface {v0, v1, v2, v3}, Lb/r;->write(Lb/c;J)V

    .line 223
    :cond_1
    iget-object v0, p0, Lb/n;->b:Lb/r;

    invoke-interface {v0}, Lb/r;->flush()V

    .line 224
    return-void
.end method

.method public g(I)Lb/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 126
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 127
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1}, Lb/c;->c(I)Lb/c;

    .line 128
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public h(I)Lb/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 120
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1}, Lb/c;->b(I)Lb/c;

    .line 122
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public k(J)Lb/d;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 168
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 169
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1, p2}, Lb/c;->j(J)Lb/c;

    .line 170
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public l(J)Lb/d;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 162
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1, p2}, Lb/c;->i(J)Lb/c;

    .line 164
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    move-result-object v0

    return-object v0
.end method

.method public timeout()Lb/t;
    .locals 1

    .prologue
    .line 251
    iget-object v0, p0, Lb/n;->b:Lb/r;

    invoke-interface {v0}, Lb/r;->timeout()Lb/t;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lb/n;->b:Lb/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Lb/d;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 174
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 175
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0}, Lb/c;->h()J

    move-result-wide v0

    .line 176
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    iget-object v2, p0, Lb/n;->b:Lb/r;

    iget-object v3, p0, Lb/n;->a:Lb/c;

    invoke-interface {v2, v3, v0, v1}, Lb/r;->write(Lb/c;J)V

    .line 177
    :cond_1
    return-object p0
.end method

.method public write(Lb/c;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 44
    iget-boolean v0, p0, Lb/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    iget-object v0, p0, Lb/n;->a:Lb/c;

    invoke-virtual {v0, p1, p2, p3}, Lb/c;->write(Lb/c;J)V

    .line 46
    invoke-virtual {p0}, Lb/n;->v()Lb/d;

    .line 47
    return-void
.end method
