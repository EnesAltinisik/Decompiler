.class Lcom/google/android/gms/internal/zzafj$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;JZZ)Ljava/util/List;
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

.field final synthetic c:Lcom/google/android/gms/internal/zzahu;

.field final synthetic d:J

.field final synthetic e:Lcom/google/android/gms/internal/zzahu;

.field final synthetic f:Z

.field final synthetic g:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafj;ZLcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;JLcom/google/android/gms/internal/zzahu;Z)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$1;->g:Lcom/google/android/gms/internal/zzafj;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzafj$1;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafj$1;->b:Lcom/google/android/gms/internal/zzafa;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafj$1;->c:Lcom/google/android/gms/internal/zzahu;

    iput-wide p5, p0, Lcom/google/android/gms/internal/zzafj$1;->d:J

    iput-object p7, p0, Lcom/google/android/gms/internal/zzafj$1;->e:Lcom/google/android/gms/internal/zzahu;

    iput-boolean p8, p0, Lcom/google/android/gms/internal/zzafj$1;->f:Z

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

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzafj$1;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$1;->g:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$1;->b:Lcom/google/android/gms/internal/zzafa;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$1;->c:Lcom/google/android/gms/internal/zzahu;

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzafj$1;->d:J

    invoke-interface {v0, v1, v2, v4, v5}, Lcom/google/android/gms/internal/zzagd;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$1;->g:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzc(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafq;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$1;->b:Lcom/google/android/gms/internal/zzafa;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$1;->e:Lcom/google/android/gms/internal/zzahu;

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzafj$1;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-boolean v4, p0, Lcom/google/android/gms/internal/zzafj$1;->f:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Ljava/lang/Long;Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzafj$1;->f:Z

    if-nez v0, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$1;->g:Lcom/google/android/gms/internal/zzafj;

    new-instance v1, Lcom/google/android/gms/internal/zzafy;

    sget-object v2, Lcom/google/android/gms/internal/zzafx;->zzbOu:Lcom/google/android/gms/internal/zzafx;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj$1;->b:Lcom/google/android/gms/internal/zzafa;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafj$1;->e:Lcom/google/android/gms/internal/zzahu;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzafy;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafj$1;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
