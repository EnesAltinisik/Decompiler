.class Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$1;
.super Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/api/GamesMetadataImpl;->loadGame(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/games/internal/api/GamesMetadataImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/api/GamesMetadataImpl;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$1;->a:Lcom/google/android/gms/games/internal/api/GamesMetadataImpl;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$a;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1, p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zze(Lcom/google/android/gms/internal/zznt$zzb;)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$1;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method
