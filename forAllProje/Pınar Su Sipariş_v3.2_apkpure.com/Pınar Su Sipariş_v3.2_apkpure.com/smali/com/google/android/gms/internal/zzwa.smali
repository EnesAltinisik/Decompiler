.class public Lcom/google/android/gms/internal/zzwa;
.super Lcom/google/android/gms/internal/zzvj;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzwa$b;
    }
.end annotation


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

    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p2

    if-eq v0, v1, :cond_0

    array-length v0, p2

    if-ne v0, v4, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    aget-object v0, p2, v2

    instance-of v0, v0, Lcom/google/android/gms/internal/zzabm;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    aget-object v0, p2, v2

    check-cast v0, Lcom/google/android/gms/internal/zzabm;

    array-length v3, p2

    if-ne v3, v4, :cond_2

    aget-object v3, p2, v1

    instance-of v3, v3, Lcom/google/android/gms/internal/zzabk;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    aget-object v1, p2, v1

    check-cast v1, Lcom/google/android/gms/internal/zzabk;

    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabm;->zzMk()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v3, Lcom/google/android/gms/internal/zzwa$a;

    invoke-direct {v3, p0, v1, p1}, Lcom/google/android/gms/internal/zzwa$a;-><init>(Lcom/google/android/gms/internal/zzwa;Lcom/google/android/gms/internal/zzabk;Lcom/google/android/gms/internal/zzuw;)V

    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    aget-object v0, p2, v2

    return-object v0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/zzabk;

    new-instance v3, Lcom/google/android/gms/internal/zzwa$b;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/zzwa$b;-><init>(Lcom/google/android/gms/internal/zzwa$1;)V

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/zzabk;-><init>(Lcom/google/android/gms/internal/zzvh;)V

    goto :goto_1
.end method
