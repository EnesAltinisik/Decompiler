.class Lcom/google/android/gms/internal/zzrz$5;
.super Lcom/google/android/gms/internal/zzqy$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzrz;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;I)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/PendingIntent;

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/internal/zzrz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzrz;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzrz$5;->c:Lcom/google/android/gms/internal/zzrz;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzrz$5;->a:Landroid/app/PendingIntent;

    iput p4, p0, Lcom/google/android/gms/internal/zzrz$5;->b:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzqy$b;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zzqy;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/zzsa;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzsa;-><init>(Lcom/google/android/gms/internal/zznt$zzb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzqy;->zztm()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzrj;

    new-instance v2, Lcom/google/android/gms/fitness/request/SessionRegistrationRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzrz$5;->a:Landroid/app/PendingIntent;

    iget v4, p0, Lcom/google/android/gms/internal/zzrz$5;->b:I

    invoke-direct {v2, v3, v1, v4}, Lcom/google/android/gms/fitness/request/SessionRegistrationRequest;-><init>(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/zzrp;I)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzrj;->zza(Lcom/google/android/gms/fitness/request/SessionRegistrationRequest;)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzqy;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzrz$5;->a(Lcom/google/android/gms/internal/zzqy;)V

    return-void
.end method
