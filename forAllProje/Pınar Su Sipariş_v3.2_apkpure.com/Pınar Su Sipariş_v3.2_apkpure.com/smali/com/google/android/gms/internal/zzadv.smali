.class public Lcom/google/android/gms/internal/zzadv;
.super Lcom/google/android/gms/internal/zzadz;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/zzadz",
        "<TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzadz;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)V

    return-void
.end method


# virtual methods
.method protected zzPB()Lcom/google/android/gms/internal/zzadx$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzadx$zza;->zzbIr:Lcom/google/android/gms/internal/zzadx$zza;

    return-object v0
.end method

.method public zzPC()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzadv;->getKey()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzadv;->getValue()Ljava/lang/Object;

    move-result-object p2

    :cond_1
    if-nez p3, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzadv;->zzPE()Lcom/google/android/gms/internal/zzadx;

    move-result-object p3

    :cond_2
    if-nez p4, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzadv;->zzPF()Lcom/google/android/gms/internal/zzadx;

    move-result-object p4

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/zzadv;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzadv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)V

    return-object v0
.end method
