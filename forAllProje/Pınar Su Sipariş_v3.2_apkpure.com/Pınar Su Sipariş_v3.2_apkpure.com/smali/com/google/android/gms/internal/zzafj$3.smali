.class Lcom/google/android/gms/internal/zzafj$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;)Ljava/util/List;
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
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/google/android/gms/internal/zzafa;

.field final synthetic c:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafj;Ljava/util/Map;Lcom/google/android/gms/internal/zzafa;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$3;->c:Lcom/google/android/gms/internal/zzafj;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafj$3;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafj$3;->b:Lcom/google/android/gms/internal/zzafa;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$3;->a:Ljava/util/Map;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaes;->zzay(Ljava/util/Map;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$3;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$3;->b:Lcom/google/android/gms/internal/zzafa;

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/zzagd;->zzd(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$3;->c:Lcom/google/android/gms/internal/zzafj;

    new-instance v2, Lcom/google/android/gms/internal/zzafv;

    sget-object v3, Lcom/google/android/gms/internal/zzafx;->zzbOv:Lcom/google/android/gms/internal/zzafx;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafj$3;->b:Lcom/google/android/gms/internal/zzafa;

    invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/internal/zzafv;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;

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

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafj$3;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
