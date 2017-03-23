.class Lcom/google/android/gms/internal/zzace$1;
.super Lcom/google/android/gms/wallet/Wallet$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzace;->checkForPreAuthorization(Lcom/google/android/gms/common/api/GoogleApiClient;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/internal/zzace;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzace;Lcom/google/android/gms/common/api/GoogleApiClient;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzace$1;->b:Lcom/google/android/gms/internal/zzace;

    iput p3, p0, Lcom/google/android/gms/internal/zzace$1;->a:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/Wallet$zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zzacf;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzace$1;->a:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzacf;->zzmi(I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzace$1;->zzb(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzacf;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzace$1;->a(Lcom/google/android/gms/internal/zzacf;)V

    return-void
.end method
