.class Lcom/google/android/gms/cast/Cast$CastApi$zza$4;
.super Lcom/google/android/gms/cast/Cast$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/Cast$CastApi$zza;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/JoinOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/cast/JoinOptions;

.field final synthetic d:Lcom/google/android/gms/cast/Cast$CastApi$zza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/Cast$CastApi$zza;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/JoinOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->d:Lcom/google/android/gms/cast/Cast$CastApi$zza;

    iput-object p3, p0, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->c:Lcom/google/android/gms/cast/JoinOptions;

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/Cast$a;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/internal/zze;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->c:Lcom/google/android/gms/cast/JoinOptions;

    invoke-virtual {p1, v0, v1, v2, p0}, Lcom/google/android/gms/cast/internal/zze;->zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/JoinOptions;Lcom/google/android/gms/internal/zznt$zzb;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/16 v0, 0x7d1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->zzbq(I)V

    goto :goto_0
.end method

.method public synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/cast/internal/zze;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/Cast$CastApi$zza$4;->a(Lcom/google/android/gms/cast/internal/zze;)V

    return-void
.end method
