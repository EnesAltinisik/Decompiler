.class public Lcom/google/android/gms/internal/zzadw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzadx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzadx",
        "<TK;TV;>;"
    }
.end annotation


# static fields
.field private static final zzbIp:Lcom/google/android/gms/internal/zzadw;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzadw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzadw;->zzbIp:Lcom/google/android/gms/internal/zzadw;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzPD()Lcom/google/android/gms/internal/zzadw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/android/gms/internal/zzadw",
            "<TK;TV;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/zzadw;->zzbIp:Lcom/google/android/gms/internal/zzadw;

    return-object v0
.end method


# virtual methods
.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public zzPC()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zzPE()Lcom/google/android/gms/internal/zzadx;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public zzPF()Lcom/google/android/gms/internal/zzadx;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public zzPG()Lcom/google/android/gms/internal/zzadx;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public zzPH()Lcom/google/android/gms/internal/zzadx;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public zzPI()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/zzadx$zza;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public zza(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzadx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzady;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/zzady;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public zza(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzadx;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public zza(Lcom/google/android/gms/internal/zzadx$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzadx$zzb",
            "<TK;TV;>;)V"
        }
    .end annotation

    return-void
.end method
