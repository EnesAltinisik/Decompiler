.class Lcom/google/android/gms/internal/zzng$3;
.super Lcom/google/android/gms/internal/zzng$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzng;->stopRemoteDisplay(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzng;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzng;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzng$3;->a:Lcom/google/android/gms/internal/zzng;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzng$zzb;-><init>(Lcom/google/android/gms/internal/zzng;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zznh;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzng$zzb$zzb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzng$zzb$zzb;-><init>(Lcom/google/android/gms/internal/zzng$zzb;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zznh;->zza(Lcom/google/android/gms/internal/zzni;)V

    return-void
.end method

.method public synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zznh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzng$3;->a(Lcom/google/android/gms/internal/zznh;)V

    return-void
.end method
