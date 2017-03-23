.class Lcom/google/android/gms/internal/zzrx$3;
.super Lcom/google/android/gms/internal/zzqw$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzrx;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/data/Subscription;

.field final synthetic b:Lcom/google/android/gms/internal/zzrx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzrx;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/Subscription;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzrx$3;->b:Lcom/google/android/gms/internal/zzrx;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzrx$3;->a:Lcom/google/android/gms/fitness/data/Subscription;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzqw$b;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zzqw;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/zzsa;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzsa;-><init>(Lcom/google/android/gms/internal/zznt$zzb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzqw;->zztm()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzrh;

    new-instance v2, Lcom/google/android/gms/fitness/request/SubscribeRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzrx$3;->a:Lcom/google/android/gms/fitness/data/Subscription;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/gms/fitness/request/SubscribeRequest;-><init>(Lcom/google/android/gms/fitness/data/Subscription;ZLcom/google/android/gms/internal/zzrp;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzrh;->zza(Lcom/google/android/gms/fitness/request/SubscribeRequest;)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzqw;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzrx$3;->a(Lcom/google/android/gms/internal/zzqw;)V

    return-void
.end method
