.class public Lcom/google/android/gms/internal/zzqu;
.super Lcom/google/android/gms/internal/zzqr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzqu$zzb;,
        Lcom/google/android/gms/internal/zzqu$b;,
        Lcom/google/android/gms/internal/zzqu$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzqr",
        "<",
        "Lcom/google/android/gms/internal/zzrf;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zzg;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 7

    const/16 v3, 0x39

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzqr;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/common/internal/zzg;)V

    return-void
.end method


# virtual methods
.method protected synthetic zzab(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzqu;->zzbE(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzrf;

    move-result-object v0

    return-object v0
.end method

.method protected zzbE(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzrf;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzrf$zza;->zzbP(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzrf;

    move-result-object v0

    return-object v0
.end method

.method protected zzhT()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.fitness.HistoryApi"

    return-object v0
.end method

.method protected zzhU()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi"

    return-object v0
.end method
