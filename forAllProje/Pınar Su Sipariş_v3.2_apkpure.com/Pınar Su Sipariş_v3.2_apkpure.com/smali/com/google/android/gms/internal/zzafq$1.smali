.class Lcom/google/android/gms/internal/zzafq$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzagj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Ljava/util/List;Z)Lcom/google/android/gms/internal/zzahu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzagj",
        "<",
        "Lcom/google/android/gms/internal/zzafn;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/google/android/gms/internal/zzafa;

.field final synthetic d:Lcom/google/android/gms/internal/zzafq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafq;ZLjava/util/List;Lcom/google/android/gms/internal/zzafa;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafq$1;->d:Lcom/google/android/gms/internal/zzafq;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzafq$1;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafq$1;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafq$1;->c:Lcom/google/android/gms/internal/zzafa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzafn;)Z
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafn;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzafq$1;->a:Z

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq$1;->b:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafq$1;->c:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq$1;->c:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic zzap(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzafq$1;->a(Lcom/google/android/gms/internal/zzafn;)Z

    move-result v0

    return v0
.end method
