.class Lcom/google/android/gms/nearby/messages/internal/zzp$9;
.super Lcom/google/android/gms/nearby/messages/internal/zzp$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/zzp;->unsubscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/PendingIntent;

.field final synthetic b:Lcom/google/android/gms/nearby/messages/internal/zzp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/zzp;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$9;->b:Lcom/google/android/gms/nearby/messages/internal/zzp;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$9;->a:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/nearby/messages/internal/zzp$a;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/nearby/messages/internal/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/zzp$9;->a:Landroid/app/PendingIntent;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/nearby/messages/internal/a;->a(Lcom/google/android/gms/internal/zznt$zzb;Landroid/app/PendingIntent;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/zzp$9;->a(Lcom/google/android/gms/nearby/messages/internal/a;)V

    return-void
.end method
