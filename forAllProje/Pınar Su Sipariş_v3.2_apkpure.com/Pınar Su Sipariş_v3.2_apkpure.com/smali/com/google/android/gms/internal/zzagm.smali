.class public Lcom/google/android/gms/internal/zzagm;
.super Ljava/lang/Object;


# instance fields
.field private final zzbPo:Lcom/google/android/gms/internal/zzahp;

.field private final zzbPp:Z

.field private final zzbPq:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzahp;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagm;->zzbPo:Lcom/google/android/gms/internal/zzahp;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzagm;->zzbPp:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/zzagm;->zzbPq:Z

    return-void
.end method


# virtual methods
.method public zzM(Lcom/google/android/gms/internal/zzafa;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzagm;->zzbPq:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzagm;->zzf(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v0

    goto :goto_0
.end method

.method public zzPj()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagm;->zzbPo:Lcom/google/android/gms/internal/zzahp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zzSr()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzagm;->zzbPp:Z

    return v0
.end method

.method public zzSs()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzagm;->zzbPq:Z

    return v0
.end method

.method public zzSt()Lcom/google/android/gms/internal/zzahp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagm;->zzbPo:Lcom/google/android/gms/internal/zzahp;

    return-object v0
.end method

.method public zzf(Lcom/google/android/gms/internal/zzahi;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzagm;->zzbPq:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagm;->zzbPo:Lcom/google/android/gms/internal/zzahp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzahu;->zzk(Lcom/google/android/gms/internal/zzahi;)Z

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
