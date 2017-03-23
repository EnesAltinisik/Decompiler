.class Lcom/google/android/gms/internal/zzafj$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;
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
.field final synthetic a:Lcom/google/android/gms/internal/zzafk;

.field final synthetic b:Lcom/google/android/gms/internal/zzafa;

.field final synthetic c:Lcom/google/android/gms/internal/zzahu;

.field final synthetic d:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafk;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$6;->d:Lcom/google/android/gms/internal/zzafj;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafj$6;->a:Lcom/google/android/gms/internal/zzafk;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafj$6;->b:Lcom/google/android/gms/internal/zzafa;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafj$6;->c:Lcom/google/android/gms/internal/zzahu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$6;->d:Lcom/google/android/gms/internal/zzafj;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$6;->a:Lcom/google/android/gms/internal/zzafk;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafk;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$6;->b:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj$6;->d:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafj$6;->c:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v3, v0, v4}, Lcom/google/android/gms/internal/zzagd;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzahu;)V

    new-instance v0, Lcom/google/android/gms/internal/zzafy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->zzSR()Lcom/google/android/gms/internal/zzagt;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/zzafx;->zzc(Lcom/google/android/gms/internal/zzagt;)Lcom/google/android/gms/internal/zzafx;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafj$6;->c:Lcom/google/android/gms/internal/zzahu;

    invoke-direct {v0, v3, v2, v4}, Lcom/google/android/gms/internal/zzafy;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$6;->d:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$6;->b:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzagu;->zzN(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafj$6;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
