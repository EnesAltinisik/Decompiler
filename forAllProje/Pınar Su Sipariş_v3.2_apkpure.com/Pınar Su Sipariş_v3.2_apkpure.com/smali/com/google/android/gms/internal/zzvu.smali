.class public Lcom/google/android/gms/internal/zzvu;
.super Lcom/google/android/gms/internal/zzvj;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzvj;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs zza(Lcom/google/android/gms/internal/zzuw;[Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;
    .locals 12
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

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    array-length v0, p2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    const/4 v0, 0x0

    aget-object v0, p2, v0

    instance-of v0, v0, Lcom/google/android/gms/internal/zzabm;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    const/4 v0, 0x1

    aget-object v0, p2, v0

    instance-of v0, v0, Lcom/google/android/gms/internal/zzabk;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    const/4 v0, 0x0

    aget-object v0, p2, v0

    check-cast v0, Lcom/google/android/gms/internal/zzabm;

    const/4 v1, 0x1

    aget-object v1, p2, v1

    check-cast v1, Lcom/google/android/gms/internal/zzabk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabm;->zzMk()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    array-length v3, p2

    const/4 v4, 0x3

    if-ne v3, v4, :cond_2

    const/4 v3, 0x2

    aget-object v4, p2, v3

    const/4 v3, 0x0

    :goto_1
    move v5, v3

    :goto_2
    if-ge v5, v6, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabm;->zzMk()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v5, v3, :cond_7

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/zzabm;->zzla(I)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzabk;->zzMk()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzvh;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/google/android/gms/internal/zzabh;

    const/4 v8, 0x0

    aput-object v4, v7, v8

    const/4 v8, 0x1

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzabh;

    aput-object v4, v7, v8

    const/4 v4, 0x2

    new-instance v8, Lcom/google/android/gms/internal/zzabj;

    int-to-double v10, v5

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/google/android/gms/internal/zzabj;-><init>(Ljava/lang/Double;)V

    aput-object v8, v7, v4

    const/4 v4, 0x3

    aput-object v0, v7, v4

    invoke-interface {v3, p1, v7}, Lcom/google/android/gms/internal/zzvh;->zzb(Lcom/google/android/gms/internal/zzuw;[Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;

    move-result-object v3

    :goto_3
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move-object v4, v3

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    if-lez v6, :cond_4

    const/4 v3, 0x1

    :goto_4
    invoke-static {v3}, Lcom/google/android/gms/common/internal/zzaa;->zzai(Z)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzabm;->zzkZ(I)Lcom/google/android/gms/internal/zzabh;

    move-result-object v5

    const/4 v4, 0x1

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v6, :cond_3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzabm;->zzla(I)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzabm;->zzkZ(I)Lcom/google/android/gms/internal/zzabh;

    move-result-object v5

    add-int/lit8 v4, v3, 0x1

    :cond_3
    if-ge v3, v6, :cond_6

    const/4 v3, 0x1

    :goto_6
    invoke-static {v3}, Lcom/google/android/gms/common/internal/zzaa;->zzai(Z)V

    move v3, v4

    move-object v4, v5

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_4

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    goto :goto_6

    :cond_7
    return-object v4

    :cond_8
    move-object v3, v4

    goto :goto_3
.end method
