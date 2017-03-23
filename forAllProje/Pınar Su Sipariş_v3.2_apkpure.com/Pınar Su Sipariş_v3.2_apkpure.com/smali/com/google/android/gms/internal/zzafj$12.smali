.class Lcom/google/android/gms/internal/zzafj$12;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzaes;JZ)Ljava/util/List;
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

.field final synthetic b:Lcom/google/android/gms/internal/zzafa;

.field final synthetic c:Lcom/google/android/gms/internal/zzaes;

.field final synthetic d:J

.field final synthetic e:Lcom/google/android/gms/internal/zzaes;

.field final synthetic f:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafj;ZLcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;JLcom/google/android/gms/internal/zzaes;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$12;->f:Lcom/google/android/gms/internal/zzafj;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzafj$12;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafj$12;->b:Lcom/google/android/gms/internal/zzafa;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafj$12;->c:Lcom/google/android/gms/internal/zzaes;

    iput-wide p5, p0, Lcom/google/android/gms/internal/zzafj$12;->d:J

    iput-object p7, p0, Lcom/google/android/gms/internal/zzafj$12;->e:Lcom/google/android/gms/internal/zzaes;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzafj$12;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$12;->f:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$12;->b:Lcom/google/android/gms/internal/zzafa;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$12;->c:Lcom/google/android/gms/internal/zzaes;

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzafj$12;->d:J

    invoke-interface {v0, v1, v2, v4, v5}, Lcom/google/android/gms/internal/zzagd;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$12;->f:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzc(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafq;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$12;->b:Lcom/google/android/gms/internal/zzafa;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$12;->e:Lcom/google/android/gms/internal/zzaes;

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzafj$12;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$12;->f:Lcom/google/android/gms/internal/zzafj;

    new-instance v1, Lcom/google/android/gms/internal/zzafv;

    sget-object v2, Lcom/google/android/gms/internal/zzafx;->zzbOu:Lcom/google/android/gms/internal/zzafx;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj$12;->b:Lcom/google/android/gms/internal/zzafa;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafj$12;->e:Lcom/google/android/gms/internal/zzaes;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzafv;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafj$12;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
