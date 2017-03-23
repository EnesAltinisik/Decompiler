.class Lcom/google/android/gms/internal/zzafj$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;
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

.field final synthetic b:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$5;->b:Lcom/google/android/gms/internal/zzafj;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafj$5;->a:Lcom/google/android/gms/internal/zzafk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$5;->b:Lcom/google/android/gms/internal/zzafj;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$5;->a:Lcom/google/android/gms/internal/zzafk;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafk;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$5;->b:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzagd;->zzi(Lcom/google/android/gms/internal/zzagu;)V

    new-instance v1, Lcom/google/android/gms/internal/zzafu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagu;->zzSR()Lcom/google/android/gms/internal/zzagt;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzafx;->zzc(Lcom/google/android/gms/internal/zzagt;)Lcom/google/android/gms/internal/zzafx;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/zzafu;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$5;->b:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

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

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafj$5;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
