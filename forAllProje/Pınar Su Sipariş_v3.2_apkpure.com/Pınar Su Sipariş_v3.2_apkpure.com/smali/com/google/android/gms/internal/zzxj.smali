.class public Lcom/google/android/gms/internal/zzxj;
.super Lcom/google/android/gms/internal/zzvj;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzvj;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs zza(Lcom/google/android/gms/internal/zzuw;[Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;
    .locals 3
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

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    array-length v0, p2

    if-gt v0, v1, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    array-length v0, p2

    if-ge v0, v1, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    :goto_2
    new-instance v1, Lcom/google/android/gms/internal/zzabl;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/zzabl;-><init>(Lcom/google/android/gms/internal/zzabh;)V

    return-object v1

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    aget-object v0, p2, v2

    goto :goto_2
.end method
