.class Lcom/google/android/gms/nearby/messages/internal/zzp$6;
.super Lcom/google/android/gms/nearby/messages/internal/zzp$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/zzp;->subscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/nearby/messages/MessageListener;Lcom/google/android/gms/nearby/messages/SubscribeOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzou;

.field final synthetic b:Lcom/google/android/gms/nearby/messages/MessageListener;

.field final synthetic c:Lcom/google/android/gms/nearby/messages/SubscribeOptions;

.field final synthetic d:Lcom/google/android/gms/nearby/messages/internal/zzp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/zzp;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/nearby/messages/MessageListener;Lcom/google/android/gms/nearby/messages/SubscribeOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$6;->d:Lcom/google/android/gms/nearby/messages/internal/zzp;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$6;->a:Lcom/google/android/gms/internal/zzou;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$6;->b:Lcom/google/android/gms/nearby/messages/MessageListener;

    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$6;->c:Lcom/google/android/gms/nearby/messages/SubscribeOptions;

    invoke-direct {p0, p2}, Lcom/google/android/gms/nearby/messages/internal/zzp$a;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/nearby/messages/internal/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$6;->a:Lcom/google/android/gms/internal/zzou;

    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$6;->b:Lcom/google/android/gms/nearby/messages/MessageListener;

    iget-object v4, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$6;->c:Lcom/google/android/gms/nearby/messages/SubscribeOptions;

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/nearby/messages/internal/a;->a(Lcom/google/android/gms/internal/zznt$zzb;Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/nearby/messages/MessageListener;Lcom/google/android/gms/nearby/messages/SubscribeOptions;[B)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/zzp$6;->a(Lcom/google/android/gms/nearby/messages/internal/a;)V

    return-void
.end method
