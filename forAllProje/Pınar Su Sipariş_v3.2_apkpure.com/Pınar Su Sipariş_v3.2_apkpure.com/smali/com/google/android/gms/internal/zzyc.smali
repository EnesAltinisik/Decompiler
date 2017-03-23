.class public Lcom/google/android/gms/internal/zzyc;
.super Lcom/google/android/gms/internal/zzvj;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzvj;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs zza(Lcom/google/android/gms/internal/zzuw;[Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;
    .locals 7
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

    if-eq v0, v1, :cond_0

    array-length v0, p2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    :cond_0
    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    aget-object v0, p2, v2

    instance-of v0, v0, Lcom/google/android/gms/internal/zzabp;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    array-length v0, p2

    if-ne v0, v1, :cond_4

    aget-object v0, p2, v2

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/zzabm;

    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/zzabm;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    aget-object v0, p2, v2

    check-cast v0, Lcom/google/android/gms/internal/zzabp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabp;->zzMk()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aget-object v3, p2, v1

    invoke-static {v3}, Lcom/google/android/gms/internal/zzvi;->zzd(Lcom/google/android/gms/internal/zzabh;)Ljava/lang/String;

    move-result-object v5

    const-string v3, ""

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v3, v2

    :goto_2
    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    if-eqz v6, :cond_6

    :goto_3
    array-length v2, v0

    if-ge v1, v2, :cond_1

    new-instance v2, Lcom/google/android/gms/internal/zzabp;

    aget-object v3, v0, v1

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/zzabp;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, -0x1

    goto :goto_2

    :cond_6
    move v1, v2

    goto :goto_3
.end method
