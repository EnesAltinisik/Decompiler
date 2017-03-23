.class public Lcom/google/android/gms/b/ia;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ib;


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/ia;->a:Z

    return-void
.end method

.method private b()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/b/ia;->a:Z

    const-string v1, "Transaction expected to already be in progress."

    invoke-static {v0, v1}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)TT;"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/b/ia;->a:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "runInTransaction called when an existing transaction is already in progress."

    invoke-static {v0, v3}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    iput-boolean v1, p0, Lcom/google/android/gms/b/ia;->a:Z

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iput-boolean v2, p0, Lcom/google/android/gms/b/ia;->a:Z

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    iput-boolean v2, p0, Lcom/google/android/gms/b/ia;->a:Z

    throw v0
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/hl;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/it;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/jr;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/it;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/it;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/b/je;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/b/je;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public b(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method

.method public b(Lcom/google/android/gms/b/it;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ia;->b()V

    return-void
.end method
