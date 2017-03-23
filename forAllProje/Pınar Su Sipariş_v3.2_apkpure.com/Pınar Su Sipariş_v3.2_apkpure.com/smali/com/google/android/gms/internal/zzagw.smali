.class public Lcom/google/android/gms/internal/zzagw;
.super Ljava/lang/Object;


# instance fields
.field private final zzbQc:Lcom/google/android/gms/internal/zzagm;

.field private final zzbQd:Lcom/google/android/gms/internal/zzagm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzagm;Lcom/google/android/gms/internal/zzagm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagw;->zzbQc:Lcom/google/android/gms/internal/zzagm;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzagw;->zzbQd:Lcom/google/android/gms/internal/zzagm;

    return-void
.end method


# virtual methods
.method public zzSV()Lcom/google/android/gms/internal/zzagm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagw;->zzbQc:Lcom/google/android/gms/internal/zzagm;

    return-object v0
.end method

.method public zzSW()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagw;->zzbQc:Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagw;->zzbQc:Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzSX()Lcom/google/android/gms/internal/zzagm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagw;->zzbQd:Lcom/google/android/gms/internal/zzagm;

    return-object v0
.end method

.method public zzSY()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagw;->zzbQd:Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagw;->zzbQd:Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzagw;

    new-instance v1, Lcom/google/android/gms/internal/zzagm;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagw;->zzbQd:Lcom/google/android/gms/internal/zzagm;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzagw;-><init>(Lcom/google/android/gms/internal/zzagm;Lcom/google/android/gms/internal/zzagm;)V

    return-object v0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzagw;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagw;->zzbQc:Lcom/google/android/gms/internal/zzagm;

    new-instance v2, Lcom/google/android/gms/internal/zzagm;

    invoke-direct {v2, p1, p2, p3}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzagw;-><init>(Lcom/google/android/gms/internal/zzagm;Lcom/google/android/gms/internal/zzagm;)V

    return-object v0
.end method
