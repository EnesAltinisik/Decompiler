.class Lcom/google/android/gms/internal/zzrt$5;
.super Lcom/google/android/gms/internal/zzqs$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzrt;->unclaimBleDevice(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/zzrt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzrt;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzrt$5;->b:Lcom/google/android/gms/internal/zzrt;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzrt$5;->a:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzqs$b;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zzqs;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/zzsa;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzsa;-><init>(Lcom/google/android/gms/internal/zznt$zzb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzqs;->zztm()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzrd;

    new-instance v2, Lcom/google/android/gms/fitness/request/UnclaimBleDeviceRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzrt$5;->a:Ljava/lang/String;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/fitness/request/UnclaimBleDeviceRequest;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzrp;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzrd;->zza(Lcom/google/android/gms/fitness/request/UnclaimBleDeviceRequest;)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzqs;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzrt$5;->a(Lcom/google/android/gms/internal/zzqs;)V

    return-void
.end method
