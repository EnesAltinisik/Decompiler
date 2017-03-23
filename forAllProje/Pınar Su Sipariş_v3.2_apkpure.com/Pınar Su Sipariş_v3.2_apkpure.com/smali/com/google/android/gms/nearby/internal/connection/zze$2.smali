.class Lcom/google/android/gms/nearby/internal/connection/zze$2;
.super Lcom/google/android/gms/nearby/internal/connection/zze$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/internal/connection/zze;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JLcom/google/android/gms/nearby/connection/Connections$ConnectionRequestListener;Lcom/google/android/gms/nearby/connection/AdvertisingOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/nearby/connection/AppMetadata;

.field final synthetic c:J

.field final synthetic d:Lcom/google/android/gms/nearby/connection/AdvertisingOptions;

.field final synthetic e:Lcom/google/android/gms/internal/zzou;

.field final synthetic f:Lcom/google/android/gms/nearby/internal/connection/zze;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/internal/connection/zze;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JLcom/google/android/gms/nearby/connection/AdvertisingOptions;Lcom/google/android/gms/internal/zzou;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->f:Lcom/google/android/gms/nearby/internal/connection/zze;

    iput-object p3, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->b:Lcom/google/android/gms/nearby/connection/AppMetadata;

    iput-wide p5, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->c:J

    iput-object p7, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->d:Lcom/google/android/gms/nearby/connection/AdvertisingOptions;

    iput-object p8, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->e:Lcom/google/android/gms/internal/zzou;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/nearby/internal/connection/zze$b;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/nearby/internal/connection/zze$1;)V

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

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->b:Lcom/google/android/gms/nearby/connection/AppMetadata;

    iget-wide v4, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->c:J

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->d:Lcom/google/android/gms/nearby/connection/AdvertisingOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/connection/AdvertisingOptions;->zzHw()Lcom/google/android/gms/nearby/connection/Strategy;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/nearby/internal/connection/zze$2;->e:Lcom/google/android/gms/internal/zzou;

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/nearby/internal/connection/zzd;->zza(Lcom/google/android/gms/internal/zznt$zzb;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JLcom/google/android/gms/nearby/connection/Strategy;Lcom/google/android/gms/internal/zzou;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/internal/connection/zze$2;->a(Lcom/google/android/gms/nearby/internal/connection/zzd;)V

    return-void
.end method
