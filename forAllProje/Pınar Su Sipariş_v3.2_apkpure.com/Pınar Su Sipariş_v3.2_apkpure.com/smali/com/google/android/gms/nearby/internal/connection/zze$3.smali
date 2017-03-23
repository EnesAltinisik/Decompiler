.class Lcom/google/android/gms/nearby/internal/connection/zze$3;
.super Lcom/google/android/gms/nearby/internal/connection/zze$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/internal/connection/zze;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;JLcom/google/android/gms/nearby/connection/Connections$EndpointDiscoveryListener;Lcom/google/android/gms/nearby/connection/DiscoveryOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Lcom/google/android/gms/nearby/connection/DiscoveryOptions;

.field final synthetic d:Lcom/google/android/gms/internal/zzou;

.field final synthetic e:Lcom/google/android/gms/nearby/internal/connection/zze;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/internal/connection/zze;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;JLcom/google/android/gms/nearby/connection/DiscoveryOptions;Lcom/google/android/gms/internal/zzou;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->e:Lcom/google/android/gms/nearby/internal/connection/zze;

    iput-object p3, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->a:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->b:J

    iput-object p6, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->c:Lcom/google/android/gms/nearby/connection/DiscoveryOptions;

    iput-object p7, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->d:Lcom/google/android/gms/internal/zzou;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/nearby/internal/connection/zze$c;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/nearby/internal/connection/zze$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/nearby/internal/connection/zzd;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v3, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->a:Ljava/lang/String;

    iget-wide v4, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->b:J

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->c:Lcom/google/android/gms/nearby/connection/DiscoveryOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/connection/DiscoveryOptions;->zzHw()Lcom/google/android/gms/nearby/connection/Strategy;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/nearby/internal/connection/zze$3;->d:Lcom/google/android/gms/internal/zzou;

    move-object v1, p1

    move-object v2, p0

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/nearby/internal/connection/zzd;->zza(Lcom/google/android/gms/internal/zznt$zzb;Ljava/lang/String;JLcom/google/android/gms/nearby/connection/Strategy;Lcom/google/android/gms/internal/zzou;)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/nearby/internal/connection/zzd;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/internal/connection/zze$3;->a(Lcom/google/android/gms/nearby/internal/connection/zzd;)V

    return-void
.end method
