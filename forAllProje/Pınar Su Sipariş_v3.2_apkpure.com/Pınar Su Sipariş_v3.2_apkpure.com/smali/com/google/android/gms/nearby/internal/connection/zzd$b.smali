.class Lcom/google/android/gms/nearby/internal/connection/zzd$b;
.super Lcom/google/android/gms/nearby/internal/connection/zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/internal/connection/zzd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/nearby/connection/Connections$MessageListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzou;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/nearby/connection/Connections$MessageListener;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/nearby/internal/connection/zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/internal/connection/zzd$b;->a:Lcom/google/android/gms/internal/zzou;

    return-void
.end method


# virtual methods
.method public onDisconnected(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/zzd$b;->a:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/nearby/internal/connection/zzd$b$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/nearby/internal/connection/zzd$b$2;-><init>(Lcom/google/android/gms/nearby/internal/connection/zzd$b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    return-void
.end method

.method public onMessageReceived(Ljava/lang/String;[BZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/zzd$b;->a:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/nearby/internal/connection/zzd$b$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/nearby/internal/connection/zzd$b$1;-><init>(Lcom/google/android/gms/nearby/internal/connection/zzd$b;Ljava/lang/String;[BZ)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    return-void
.end method
