.class public Lcom/google/android/gms/internal/zzxo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzvh;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs zzb(Lcom/google/android/gms/internal/zzuw;[Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;
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

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    array-length v0, p2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    move v0, v2

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    const/4 v0, 0x3

    aget-object v0, p2, v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzabq;->zza(Lcom/google/android/gms/internal/zzuw;Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzabm;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    check-cast v0, Lcom/google/android/gms/internal/zzabm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabm;->zzMk()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x2

    aget-object v1, p2, v1

    instance-of v4, v1, Lcom/google/android/gms/internal/zzabi;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    check-cast v1, Lcom/google/android/gms/internal/zzabi;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzabi;->zzMk()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzabq;->zza(Lcom/google/android/gms/internal/zzuw;Ljava/util/List;)Lcom/google/android/gms/internal/zzabl;

    move-result-object v1

    sget-object v4, Lcom/google/android/gms/internal/zzabl;->zzbvK:Lcom/google/android/gms/internal/zzabl;

    if-ne v1, v4, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    :goto_2
    return-object v0

    :cond_0
    move v0, v3

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzabl;->zzMr()Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_3
    aget-object v1, p2, v2

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/zzabq;->zza(Lcom/google/android/gms/internal/zzuw;Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;

    :cond_4
    aget-object v1, p2, v3

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/zzabq;->zza(Lcom/google/android/gms/internal/zzuw;Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzvi;->zza(Lcom/google/android/gms/internal/zzabh;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzabq;->zza(Lcom/google/android/gms/internal/zzuw;Ljava/util/List;)Lcom/google/android/gms/internal/zzabl;

    move-result-object v1

    sget-object v4, Lcom/google/android/gms/internal/zzabl;->zzbvK:Lcom/google/android/gms/internal/zzabl;

    if-ne v1, v4, :cond_5

    sget-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzabl;->zzMr()Z

    move-result v4

    if-eqz v4, :cond_3

    move-object v0, v1

    goto :goto_2

    :cond_6
    sget-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    goto :goto_2
.end method
