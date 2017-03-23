.class Lb/a$1;
.super Ljava/lang/Object;
.source "AsyncTimeout.java"

# interfaces
.implements Lb/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/a;->sink(Lb/r;)Lb/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/r;

.field final synthetic b:Lb/a;


# direct methods
.method constructor <init>(Lb/a;Lb/r;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lb/a$1;->b:Lb/a;

    iput-object p2, p0, Lb/a$1;->a:Lb/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 178
    const/4 v1, 0x0

    .line 179
    iget-object v0, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v0}, Lb/a;->enter()V

    .line 181
    :try_start_0
    iget-object v0, p0, Lb/a$1;->a:Lb/r;

    invoke-interface {v0}, Lb/r;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    const/4 v0, 0x1

    .line 186
    iget-object v1, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v1, v0}, Lb/a;->exit(Z)V

    .line 188
    return-void

    .line 183
    :catch_0
    move-exception v0

    .line 184
    :try_start_1
    iget-object v2, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v2, v0}, Lb/a;->exit(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    :catchall_0
    move-exception v0

    iget-object v2, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v2, v1}, Lb/a;->exit(Z)V

    throw v0
.end method

.method public flush()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 165
    const/4 v1, 0x0

    .line 166
    iget-object v0, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v0}, Lb/a;->enter()V

    .line 168
    :try_start_0
    iget-object v0, p0, Lb/a$1;->a:Lb/r;

    invoke-interface {v0}, Lb/r;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    const/4 v0, 0x1

    .line 173
    iget-object v1, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v1, v0}, Lb/a;->exit(Z)V

    .line 175
    return-void

    .line 170
    :catch_0
    move-exception v0

    .line 171
    :try_start_1
    iget-object v2, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v2, v0}, Lb/a;->exit(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    :catchall_0
    move-exception v0

    iget-object v2, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v2, v1}, Lb/a;->exit(Z)V

    throw v0
.end method

.method public timeout()Lb/t;
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lb/a$1;->b:Lb/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AsyncTimeout.sink("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lb/a$1;->a:Lb/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Lb/c;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 152
    const/4 v1, 0x0

    .line 153
    iget-object v0, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v0}, Lb/a;->enter()V

    .line 155
    :try_start_0
    iget-object v0, p0, Lb/a$1;->a:Lb/r;

    invoke-interface {v0, p1, p2, p3}, Lb/r;->write(Lb/c;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    const/4 v0, 0x1

    .line 160
    iget-object v1, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v1, v0}, Lb/a;->exit(Z)V

    .line 162
    return-void

    .line 157
    :catch_0
    move-exception v0

    .line 158
    :try_start_1
    iget-object v2, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v2, v0}, Lb/a;->exit(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    :catchall_0
    move-exception v0

    iget-object v2, p0, Lb/a$1;->b:Lb/a;

    invoke-virtual {v2, v1}, Lb/a;->exit(Z)V

    throw v0
.end method
