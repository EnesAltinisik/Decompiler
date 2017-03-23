.class public Lcom/google/android/gms/internal/zzaft;
.super Lcom/google/android/gms/internal/zzafw;


# instance fields
.field private final zzbOk:Z

.field private final zzbOl:Lcom/google/android/gms/internal/zzagi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/zzafw$zza;->zzbOr:Lcom/google/android/gms/internal/zzafw$zza;

    sget-object v1, Lcom/google/android/gms/internal/zzafx;->zzbOu:Lcom/google/android/gms/internal/zzafx;

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/internal/zzafw;-><init>(Lcom/google/android/gms/internal/zzafw$zza;Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaft;->zzbOl:Lcom/google/android/gms/internal/zzagi;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/zzaft;->zzbOk:Z

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "AckUserWrite { path=%s, revert=%s, affectedTree=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaft;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-boolean v3, p0, Lcom/google/android/gms/internal/zzaft;->zzbOk:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaft;->zzbOl:Lcom/google/android/gms/internal/zzagi;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzRW()Lcom/google/android/gms/internal/zzagi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzbOl:Lcom/google/android/gms/internal/zzagi;

    return-object v0
.end method

.method public zzRX()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaft;->zzbOk:Z

    return v0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafw;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "operationForChild called for unrelated child."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaiv;->zzb(ZLjava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaft;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaft;->zzbOl:Lcom/google/android/gms/internal/zzagi;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/zzaft;->zzbOk:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzaft;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Z)V

    move-object p0, v0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzbOl:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzbOl:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->zzSp()Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->isEmpty()Z

    move-result v0

    const-string v1, "affectedTree should not have overlapping affected paths."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaiv;->zzb(ZLjava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzbOl:Lcom/google/android/gms/internal/zzagi;

    new-instance v1, Lcom/google/android/gms/internal/zzafa;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/internal/zzahi;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagi;->zzI(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/zzaft;

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-boolean v3, p0, Lcom/google/android/gms/internal/zzaft;->zzbOk:Z

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/internal/zzaft;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Z)V

    move-object p0, v0

    goto :goto_0
.end method
