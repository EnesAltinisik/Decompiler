.class Lcom/google/android/gms/nearby/messages/internal/zzp$4;
.super Lcom/google/android/gms/nearby/messages/internal/zzp$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/zzp;->publish(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/PublishOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/nearby/messages/Message;

.field final synthetic b:Lcom/google/android/gms/nearby/messages/PublishOptions;

.field final synthetic c:Lcom/google/android/gms/nearby/messages/internal/zzp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/zzp;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/PublishOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$4;->c:Lcom/google/android/gms/nearby/messages/internal/zzp;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$4;->a:Lcom/google/android/gms/nearby/messages/Message;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$4;->b:Lcom/google/android/gms/nearby/messages/PublishOptions;

    invoke-direct {p0, p2}, Lcom/google/android/gms/nearby/messages/internal/zzp$a;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/nearby/messages/internal/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$4;->a:Lcom/google/android/gms/nearby/messages/Message;

    invoke-static {v0}, Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;->zza(Lcom/google/android/gms/nearby/messages/Message;)Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$4;->b:Lcom/google/android/gms/nearby/messages/PublishOptions;

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/nearby/messages/internal/a;->a(Lcom/google/android/gms/internal/zznt$zzb;Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;Lcom/google/android/gms/nearby/messages/PublishOptions;)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/nearby/messages/internal/a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/zzp$4;->a(Lcom/google/android/gms/nearby/messages/internal/a;)V

    return-void
.end method
