.class Lcom/google/android/gms/wearable/internal/ChannelImpl$1;
.super Lcom/google/android/gms/wearable/internal/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/ChannelImpl;->close(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/e",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/internal/ChannelImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/ChannelImpl;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$1;->a:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/e;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/zzbp;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$1;->a:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/ChannelImpl;->zza(Lcom/google/android/gms/wearable/internal/ChannelImpl;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/zzbp;->zzx(Lcom/google/android/gms/internal/zznt$zzb;Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ChannelImpl$1;->a(Lcom/google/android/gms/wearable/internal/zzbp;)V

    return-void
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ChannelImpl$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
