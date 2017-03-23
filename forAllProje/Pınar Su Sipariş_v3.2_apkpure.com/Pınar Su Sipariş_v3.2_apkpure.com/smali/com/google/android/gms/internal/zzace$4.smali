.class Lcom/google/android/gms/internal/zzace$4;
.super Lcom/google/android/gms/wallet/Wallet$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzace;->changeMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Lcom/google/android/gms/internal/zzace;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzace;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzace$4;->d:Lcom/google/android/gms/internal/zzace;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzace$4;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzace$4;->b:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/internal/zzace$4;->c:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/Wallet$zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zzacf;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzace$4;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzace$4;->b:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/internal/zzace$4;->c:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzacf;->zzf(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzace$4;->zzb(Lcom/google/android/gms/common/api/Result;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzace$4;->a(Lcom/google/android/gms/internal/zzacf;)V

    return-void
.end method
