.class public Lcom/google/android/gms/b/hy;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ib;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Lcom/google/android/gms/b/ic;

.field private final c:Lcom/google/android/gms/b/if;

.field private final d:Lcom/google/android/gms/b/jb;

.field private final e:Lcom/google/android/gms/b/hx;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/hy;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/hy;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/ic;Lcom/google/android/gms/b/hx;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/km;

    invoke-direct {v0}, Lcom/google/android/gms/b/km;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/b/hy;-><init>(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/ic;Lcom/google/android/gms/b/hx;Lcom/google/android/gms/b/kl;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/ic;Lcom/google/android/gms/b/hx;Lcom/google/android/gms/b/kl;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/b/hy;->f:J

    iput-object p2, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    const-string v0, "Persistence"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/gq;->a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hy;->d:Lcom/google/android/gms/b/jb;

    new-instance v0, Lcom/google/android/gms/b/if;

    iget-object v1, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    iget-object v2, p0, Lcom/google/android/gms/b/hy;->d:Lcom/google/android/gms/b/jb;

    invoke-direct {v0, v1, v2, p4}, Lcom/google/android/gms/b/if;-><init>(Lcom/google/android/gms/b/ic;Lcom/google/android/gms/b/jb;Lcom/google/android/gms/b/kl;)V

    iput-object v0, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    iput-object p3, p0, Lcom/google/android/gms/b/hy;->e:Lcom/google/android/gms/b/hx;

    return-void
.end method

.method private b()V
    .locals 8

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/b/hy;->f:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/b/hy;->f:J

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->e:Lcom/google/android/gms/b/hx;

    iget-wide v2, p0, Lcom/google/android/gms/b/hy;->f:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/b/hx;->a(J)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->d:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->d:Lcom/google/android/gms/b/jb;

    const-string v2, "Reached prune check threshold."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/b/hy;->f:J

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v2}, Lcom/google/android/gms/b/ic;->b()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/b/hy;->d:Lcom/google/android/gms/b/jb;

    invoke-virtual {v4}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/b/hy;->d:Lcom/google/android/gms/b/jb;

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x20

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Cache size: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    iget-object v4, p0, Lcom/google/android/gms/b/hy;->e:Lcom/google/android/gms/b/hx;

    iget-object v5, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    invoke-virtual {v5}, Lcom/google/android/gms/b/if;->a()J

    move-result-wide v6

    invoke-interface {v4, v2, v3, v6, v7}, Lcom/google/android/gms/b/hx;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    iget-object v3, p0, Lcom/google/android/gms/b/hy;->e:Lcom/google/android/gms/b/hx;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/hx;)Lcom/google/android/gms/b/id;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/id;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Lcom/google/android/gms/b/ic;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/id;)V

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v2}, Lcom/google/android/gms/b/ic;->b()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/b/hy;->d:Lcom/google/android/gms/b/jb;

    invoke-virtual {v4}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/b/hy;->d:Lcom/google/android/gms/b/jb;

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x2c

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Cache size after prune: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v0}, Lcom/google/android/gms/b/ic;->d()V

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v1}, Lcom/google/android/gms/b/ic;->f()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v1}, Lcom/google/android/gms/b/ic;->e()V

    return-object v0

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

    iget-object v1, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v1}, Lcom/google/android/gms/b/ic;->e()V

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

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v0}, Lcom/google/android/gms/b/ic;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/ic;->a(J)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V
    .locals 3

    invoke-virtual {p2}, Lcom/google/android/gms/b/go;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/gx;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jr;

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/b/hy;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/b/ic;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;J)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/if;->c(Lcom/google/android/gms/b/gx;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/ic;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/if;->b(Lcom/google/android/gms/b/gx;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/b/ic;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;J)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/it;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/if;->c(Lcom/google/android/gms/b/it;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/jr;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/b/ic;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/hy;->b(Lcom/google/android/gms/b/it;)V

    invoke-direct {p0}, Lcom/google/android/gms/b/hy;->b()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/b/ic;->b(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/it;Ljava/util/Set;Ljava/util/Set;)V
    .locals 4
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

    sget-boolean v0, Lcom/google/android/gms/b/hy;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We should only track keys for filtered queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/ie;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/b/hy;->a:Z

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lcom/google/android/gms/b/ie;->e:Z

    if-nez v1, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We only expect tracked keys for currently-active queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    iget-wide v2, v0, Lcom/google/android/gms/b/ie;->a:J

    invoke-interface {v1, v2, v3, p2, p3}, Lcom/google/android/gms/b/ic;->a(JLjava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->b:Lcom/google/android/gms/b/ic;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/ic;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V

    invoke-direct {p0}, Lcom/google/android/gms/b/hy;->b()V

    return-void
.end method

.method public b(Lcom/google/android/gms/b/it;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/gx;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hy;->c:Lcom/google/android/gms/b/if;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/if;->d(Lcom/google/android/gms/b/it;)V

    goto :goto_0
.end method
