.class La/a/a/a/h;
.super La/a/a/a/a/c/f;
.source "InitializationTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "La/a/a/a/a/c/f",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "TResult;>;"
    }
.end annotation


# instance fields
.field final a:La/a/a/a/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/i",
            "<TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/a/a/a/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/a/i",
            "<TResult;>;)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, La/a/a/a/a/c/f;-><init>()V

    .line 34
    iput-object p1, p0, La/a/a/a/h;->a:La/a/a/a/i;

    .line 35
    return-void
.end method

.method private a(Ljava/lang/String;)La/a/a/a/a/b/t;
    .locals 3

    .prologue
    .line 91
    new-instance v0, La/a/a/a/a/b/t;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, La/a/a/a/h;->a:La/a/a/a/i;

    invoke-virtual {v2}, La/a/a/a/i;->getIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "KitInitialization"

    invoke-direct {v0, v1, v2}, La/a/a/a/a/b/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-virtual {v0}, La/a/a/a/a/b/t;->a()V

    .line 94
    return-object v0
.end method


# virtual methods
.method protected bridge synthetic a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, La/a/a/a/h;->a([Ljava/lang/Void;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")TResult;"
        }
    .end annotation

    .prologue
    .line 60
    const-string v0, "doInBackground"

    invoke-direct {p0, v0}, La/a/a/a/h;->a(Ljava/lang/String;)La/a/a/a/a/b/t;

    move-result-object v1

    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0}, La/a/a/a/h;->d()Z

    move-result v2

    if-nez v2, :cond_0

    .line 63
    iget-object v0, p0, La/a/a/a/h;->a:La/a/a/a/i;

    invoke-virtual {v0}, La/a/a/a/i;->doInBackground()Ljava/lang/Object;

    move-result-object v0

    .line 66
    :cond_0
    invoke-virtual {v1}, La/a/a/a/a/b/t;->b()V

    .line 67
    return-object v0
.end method

.method protected a()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 39
    invoke-super {p0}, La/a/a/a/a/c/f;->a()V

    .line 41
    const-string v0, "onPreExecute"

    invoke-direct {p0, v0}, La/a/a/a/h;->a(Ljava/lang/String;)La/a/a/a/a/b/t;

    move-result-object v1

    .line 44
    :try_start_0
    iget-object v0, p0, La/a/a/a/h;->a:La/a/a/a/i;

    invoke-virtual {v0}, La/a/a/a/i;->onPreExecute()Z
    :try_end_0
    .catch La/a/a/a/a/c/m; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 51
    invoke-virtual {v1}, La/a/a/a/a/b/t;->b()V

    .line 52
    if-nez v0, :cond_0

    .line 53
    invoke-virtual {p0, v5}, La/a/a/a/h;->a(Z)Z

    .line 56
    :cond_0
    :goto_0
    return-void

    .line 45
    :catch_0
    move-exception v0

    .line 47
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, La/a/a/a/a/b/t;->b()V

    .line 53
    invoke-virtual {p0, v5}, La/a/a/a/h;->a(Z)Z

    throw v0

    .line 48
    :catch_1
    move-exception v0

    .line 49
    :try_start_2
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failure onPreExecute()"

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/l;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    invoke-virtual {v1}, La/a/a/a/a/b/t;->b()V

    .line 53
    invoke-virtual {p0, v5}, La/a/a/a/h;->a(Z)Z

    goto :goto_0
.end method

.method protected a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 72
    iget-object v0, p0, La/a/a/a/h;->a:La/a/a/a/i;

    invoke-virtual {v0, p1}, La/a/a/a/i;->onPostExecute(Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, La/a/a/a/h;->a:La/a/a/a/i;

    iget-object v0, v0, La/a/a/a/i;->initializationCallback:La/a/a/a/f;

    invoke-interface {v0, p1}, La/a/a/a/f;->a(Ljava/lang/Object;)V

    .line 74
    return-void
.end method

.method protected b(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 78
    iget-object v0, p0, La/a/a/a/h;->a:La/a/a/a/i;

    invoke-virtual {v0, p1}, La/a/a/a/i;->onCancelled(Ljava/lang/Object;)V

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La/a/a/a/h;->a:La/a/a/a/i;

    invoke-virtual {v1}, La/a/a/a/i;->getIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Initialization was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v1, La/a/a/a/g;

    invoke-direct {v1, v0}, La/a/a/a/g;-><init>(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, La/a/a/a/h;->a:La/a/a/a/i;

    iget-object v0, v0, La/a/a/a/i;->initializationCallback:La/a/a/a/f;

    invoke-interface {v0, v1}, La/a/a/a/f;->a(Ljava/lang/Exception;)V

    .line 83
    return-void
.end method

.method public getPriority()La/a/a/a/a/c/e;
    .locals 1

    .prologue
    .line 87
    sget-object v0, La/a/a/a/a/c/e;->c:La/a/a/a/a/c/e;

    return-object v0
.end method
