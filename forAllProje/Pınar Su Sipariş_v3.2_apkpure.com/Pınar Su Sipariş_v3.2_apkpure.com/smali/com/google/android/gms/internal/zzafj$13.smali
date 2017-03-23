.class Lcom/google/android/gms/internal/zzafj$13;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;
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
        "Lcom/google/android/gms/internal/zzagq;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:J

.field final synthetic c:Z

.field final synthetic d:Lcom/google/android/gms/internal/zzain;

.field final synthetic e:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafj;ZJZLcom/google/android/gms/internal/zzain;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$13;->e:Lcom/google/android/gms/internal/zzafj;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzafj$13;->a:Z

    iput-wide p3, p0, Lcom/google/android/gms/internal/zzafj$13;->b:J

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzafj$13;->c:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/zzafj$13;->d:Lcom/google/android/gms/internal/zzain;

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
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzafj$13;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$13;->e:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzafj$13;->b:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/zzagd;->zzat(J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$13;->e:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzc(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafq;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzafj$13;->b:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzafq;->zzaE(J)Lcom/google/android/gms/internal/zzafn;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$13;->e:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzc(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafq;

    move-result-object v0

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzafj$13;->b:J

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/zzafq;->zzaF(J)Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzafj$13;->c:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$13;->d:Lcom/google/android/gms/internal/zzain;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzain;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzRQ()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzRO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj$13;->e:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Lcom/google/android/gms/internal/zzagd;->zzk(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    :cond_1
    :goto_0
    if-nez v0, :cond_3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzaes;Ljava/util/Map;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj$13;->e:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Lcom/google/android/gms/internal/zzagd;->zzc(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzRQ()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/zzagi;->zzb(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$13;->e:Lcom/google/android/gms/internal/zzafj;

    new-instance v3, Lcom/google/android/gms/internal/zzaft;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-boolean v4, p0, Lcom/google/android/gms/internal/zzafj$13;->c:Z

    invoke-direct {v3, v2, v1, v4}, Lcom/google/android/gms/internal/zzaft;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Z)V

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaes;->iterator()Ljava/util/Iterator;

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

    check-cast v0, Lcom/google/android/gms/internal/zzafa;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Lcom/google/android/gms/internal/zzagi;->zzb(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    move-object v1, v0

    goto :goto_2
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafj$13;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
