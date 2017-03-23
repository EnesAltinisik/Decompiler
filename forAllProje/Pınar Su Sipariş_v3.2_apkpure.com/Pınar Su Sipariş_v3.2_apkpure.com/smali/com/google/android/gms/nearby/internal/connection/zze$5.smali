.class Lcom/google/android/gms/nearby/internal/connection/zze$5;
.super Lcom/google/android/gms/nearby/internal/connection/zze$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/internal/connection/zze;->acceptConnectionRequest(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[BLcom/google/android/gms/nearby/connection/Connections$MessageListener;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[B

.field final synthetic c:Lcom/google/android/gms/internal/zzou;

.field final synthetic d:Lcom/google/android/gms/nearby/internal/connection/zze;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/internal/connection/zze;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[BLcom/google/android/gms/internal/zzou;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/nearby/internal/connection/zze$5;->d:Lcom/google/android/gms/nearby/internal/connection/zze;

    iput-object p3, p0, Lcom/google/android/gms/nearby/internal/connection/zze$5;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/nearby/internal/connection/zze$5;->b:[B

    iput-object p5, p0, Lcom/google/android/gms/nearby/internal/connection/zze$5;->c:Lcom/google/android/gms/internal/zzou;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/nearby/internal/connection/zze$c;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/nearby/internal/connection/zze$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/nearby/internal/connection/zzd;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/zze$5;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/nearby/internal/connection/zze$5;->b:[B

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/zze$5;->c:Lcom/google/android/gms/internal/zzou;

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/nearby/internal/connection/zzd;->zza(Lcom/google/android/gms/internal/zznt$zzb;Ljava/lang/String;[BLcom/google/android/gms/internal/zzou;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/internal/connection/zze$5;->a(Lcom/google/android/gms/nearby/internal/connection/zzd;)V

    return-void
.end method
