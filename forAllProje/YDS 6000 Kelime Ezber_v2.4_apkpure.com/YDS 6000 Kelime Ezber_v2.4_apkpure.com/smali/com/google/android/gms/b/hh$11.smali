.class Lcom/google/android/gms/b/hh$11;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/hh;->a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/List",
        "<+",
        "Lcom/google/android/gms/b/ip;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:J

.field final synthetic c:Z

.field final synthetic d:Lcom/google/android/gms/b/kl;

.field final synthetic e:Lcom/google/android/gms/b/hh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/hh;ZJZLcom/google/android/gms/b/kl;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/b/hh$11;->e:Lcom/google/android/gms/b/hh;

    iput-boolean p2, p0, Lcom/google/android/gms/b/hh$11;->a:Z

    iput-wide p3, p0, Lcom/google/android/gms/b/hh$11;->b:J

    iput-boolean p5, p0, Lcom/google/android/gms/b/hh$11;->c:Z

    iput-object p6, p0, Lcom/google/android/gms/b/hh$11;->d:Lcom/google/android/gms/b/kl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x1

    iget-boolean v0, p0, Lcom/google/android/gms/b/hh$11;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hh$11;->e:Lcom/google/android/gms/b/hh;

    invoke-static {v0}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ib;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/b/hh$11;->b:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/b/ib;->a(J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hh$11;->e:Lcom/google/android/gms/b/hh;

    invoke-static {v0}, Lcom/google/android/gms/b/hh;->c(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/hp;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/b/hh$11;->b:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/hp;->a(J)Lcom/google/android/gms/b/hl;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/b/hh$11;->e:Lcom/google/android/gms/b/hh;

    invoke-static {v0}, Lcom/google/android/gms/b/hh;->c(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/hp;

    move-result-object v0

    iget-wide v4, p0, Lcom/google/android/gms/b/hh$11;->b:J

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/b/hp;->b(J)Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/b/hh$11;->c:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/hh$11;->d:Lcom/google/android/gms/b/kl;

    invoke-static {v1}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/kl;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->e()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->c()Lcom/google/android/gms/b/jr;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/jr;Ljava/util/Map;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/b/hh$11;->e:Lcom/google/android/gms/b/hh;

    invoke-static {v3}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ib;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Lcom/google/android/gms/b/ib;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    :cond_1
    :goto_0
    if-nez v0, :cond_3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/go;Ljava/util/Map;)Lcom/google/android/gms/b/go;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/b/hh$11;->e:Lcom/google/android/gms/b/hh;

    invoke-static {v3}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ib;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Lcom/google/android/gms/b/ib;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;)Lcom/google/android/gms/b/ig;

    move-result-object v1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/hh$11;->e:Lcom/google/android/gms/b/hh;

    new-instance v3, Lcom/google/android/gms/b/hr;

    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v2

    iget-boolean v4, p0, Lcom/google/android/gms/b/hh$11;->c:Z

    invoke-direct {v3, v2, v1, v4}, Lcom/google/android/gms/b/hr;-><init>(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;Z)V

    invoke-static {v0, v3}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hu;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/go;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gx;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;)Lcom/google/android/gms/b/ig;

    move-result-object v0

    move-object v1, v0

    goto :goto_2
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/hh$11;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
