.class Lcom/google/android/gms/internal/zzafj$11;
.super Lcom/google/android/gms/internal/zzadx$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzadx$zzb",
        "<",
        "Lcom/google/android/gms/internal/zzahi;",
        "Lcom/google/android/gms/internal/zzagi",
        "<",
        "Lcom/google/android/gms/internal/zzafi;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzahu;

.field final synthetic b:Lcom/google/android/gms/internal/zzafr;

.field final synthetic c:Lcom/google/android/gms/internal/zzafw;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzafw;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$11;->e:Lcom/google/android/gms/internal/zzafj;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafj$11;->a:Lcom/google/android/gms/internal/zzahu;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafj$11;->b:Lcom/google/android/gms/internal/zzafr;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafj$11;->c:Lcom/google/android/gms/internal/zzafw;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzafj$11;->d:Ljava/util/List;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadx$zzb;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzagi;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzahi;",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzafi;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$11;->a:Lcom/google/android/gms/internal/zzahu;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$11;->a:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$11;->b:Lcom/google/android/gms/internal/zzafr;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzafr;->zzb(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafr;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$11;->c:Lcom/google/android/gms/internal/zzafw;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/zzafw;->zzc(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafw;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj$11;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafj$11;->e:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v4, v2, p2, v0, v1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-void
.end method

.method public synthetic zzk(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzahi;

    check-cast p2, Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzafj$11;->a(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzagi;)V

    return-void
.end method
