.class Lcom/google/android/gms/internal/zzng$2;
.super Lcom/google/android/gms/internal/zzng$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzng;->startRemoteDisplay(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/zzng;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzng;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzng$2;->b:Lcom/google/android/gms/internal/zzng;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzng$2;->a:Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzng$zzb;-><init>(Lcom/google/android/gms/internal/zzng;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zznh;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzng$zzb$zza;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzng$zzb$zza;-><init>(Lcom/google/android/gms/internal/zzng$zzb;Lcom/google/android/gms/internal/zznh;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzng$2;->b:Lcom/google/android/gms/internal/zzng;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzng;->zzb(Lcom/google/android/gms/internal/zzng;)Lcom/google/android/gms/internal/zznk;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzng$2;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zznh;->zza(Lcom/google/android/gms/internal/zzni;Lcom/google/android/gms/internal/zznk;Ljava/lang/String;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzng$2;->a(Lcom/google/android/gms/internal/zznh;)V

    return-void
.end method
