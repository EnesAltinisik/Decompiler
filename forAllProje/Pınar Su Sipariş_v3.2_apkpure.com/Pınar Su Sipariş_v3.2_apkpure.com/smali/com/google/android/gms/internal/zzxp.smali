.class public Lcom/google/android/gms/internal/zzxp;
.super Lcom/google/android/gms/internal/zzvj;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzvj;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs zza(Lcom/google/android/gms/internal/zzuw;[Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzuw;",
            "[",
            "Lcom/google/android/gms/internal/zzabh",
            "<*>;)",
            "Lcom/google/android/gms/internal/zzabh",
            "<*>;"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    array-length v0, p2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    aget-object v0, p2, v2

    aget-object v2, p2, v1

    instance-of v1, v0, Lcom/google/android/gms/internal/zzabl;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/zzabl;->zzbvM:Lcom/google/android/gms/internal/zzabl;

    if-ne v0, v1, :cond_1

    :cond_0
    instance-of v1, v2, Lcom/google/android/gms/internal/zzabl;

    if-eqz v1, :cond_4

    sget-object v1, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    if-eq v2, v1, :cond_4

    sget-object v1, Lcom/google/android/gms/internal/zzabl;->zzbvM:Lcom/google/android/gms/internal/zzabl;

    if-eq v2, v1, :cond_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Illegal InternalType passed to Add."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    instance-of v1, v0, Lcom/google/android/gms/internal/zzabn;

    if-nez v1, :cond_5

    instance-of v1, v0, Lcom/google/android/gms/internal/zzabm;

    if-nez v1, :cond_5

    instance-of v1, v0, Lcom/google/android/gms/internal/zzabk;

    if-eqz v1, :cond_6

    :cond_5
    new-instance v1, Lcom/google/android/gms/internal/zzabp;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzvi;->zzd(Lcom/google/android/gms/internal/zzabh;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/zzabp;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :cond_6
    instance-of v1, v2, Lcom/google/android/gms/internal/zzabn;

    if-nez v1, :cond_7

    instance-of v1, v2, Lcom/google/android/gms/internal/zzabm;

    if-nez v1, :cond_7

    instance-of v1, v2, Lcom/google/android/gms/internal/zzabk;

    if-eqz v1, :cond_b

    :cond_7
    new-instance v1, Lcom/google/android/gms/internal/zzabp;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzvi;->zzd(Lcom/google/android/gms/internal/zzabh;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzabp;-><init>(Ljava/lang/String;)V

    :goto_2
    instance-of v2, v0, Lcom/google/android/gms/internal/zzabp;

    if-nez v2, :cond_8

    instance-of v2, v1, Lcom/google/android/gms/internal/zzabp;

    if-eqz v2, :cond_a

    :cond_8
    new-instance v2, Lcom/google/android/gms/internal/zzabp;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzvi;->zzd(Lcom/google/android/gms/internal/zzabh;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Lcom/google/android/gms/internal/zzvi;->zzd(Lcom/google/android/gms/internal/zzabh;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/zzabp;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_4
    return-object v0

    :cond_9
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    new-instance v2, Lcom/google/android/gms/internal/zzabj;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzvi;->zza(Lcom/google/android/gms/internal/zzabh;Lcom/google/android/gms/internal/zzabh;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/zzabj;-><init>(Ljava/lang/Double;)V

    move-object v0, v2

    goto :goto_4

    :cond_b
    move-object v1, v2

    goto :goto_2
.end method
