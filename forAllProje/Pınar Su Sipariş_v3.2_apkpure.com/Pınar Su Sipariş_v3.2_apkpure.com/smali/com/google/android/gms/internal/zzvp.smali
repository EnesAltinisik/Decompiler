.class public Lcom/google/android/gms/internal/zzvp;
.super Lcom/google/android/gms/internal/zzvj;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzvj;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs zza(Lcom/google/android/gms/internal/zzuw;[Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;
    .locals 5
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

    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p2

    if-eq v0, v2, :cond_0

    array-length v0, p2

    if-ne v0, v3, :cond_2

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    aget-object v0, p2, v1

    instance-of v0, v0, Lcom/google/android/gms/internal/zzabm;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    aget-object v0, p2, v1

    check-cast v0, Lcom/google/android/gms/internal/zzabm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabm;->zzMk()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    array-length v1, p2

    if-ge v1, v3, :cond_3

    sget-object v1, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    :goto_1
    sget-object v2, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    if-ne v1, v2, :cond_4

    const-string v1, ","

    :goto_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzabh;

    sget-object v4, Lcom/google/android/gms/internal/zzabl;->zzbvM:Lcom/google/android/gms/internal/zzabl;

    if-eq v0, v4, :cond_1

    sget-object v4, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    if-ne v0, v4, :cond_5

    :cond_1
    const-string v0, ""

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    aget-object v1, p2, v2

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lcom/google/android/gms/internal/zzvi;->zzd(Lcom/google/android/gms/internal/zzabh;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    invoke-static {v0}, Lcom/google/android/gms/internal/zzvi;->zzd(Lcom/google/android/gms/internal/zzabh;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/zzabp;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/zzx;->zzdk(Ljava/lang/String;)Lcom/google/android/gms/common/internal/zzx;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/internal/zzx;->zza(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzabp;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
