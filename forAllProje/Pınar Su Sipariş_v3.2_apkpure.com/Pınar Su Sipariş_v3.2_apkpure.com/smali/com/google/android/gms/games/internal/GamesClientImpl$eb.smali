.class final Lcom/google/android/gms/games/internal/GamesClientImpl$eb;
.super Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "eb"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzou;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;-><init>()V

    const-string v0, "Callbacks must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzou;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->a:Lcom/google/android/gms/internal/zzou;

    iput-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    iput-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->c:Lcom/google/android/gms/internal/zzou;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/internal/zzou;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;",
            ">;",
            "Lcom/google/android/gms/internal/zzou",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;",
            ">;",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;-><init>()V

    const-string v0, "Callbacks must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzou;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->a:Lcom/google/android/gms/internal/zzou;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->c:Lcom/google/android/gms/internal/zzou;

    return-void
.end method


# virtual methods
.method public onLeftRoom(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->a:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$bs;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$bs;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    return-void
.end method

.method public onP2PConnected(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$cv;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$cv;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public onP2PDisconnected(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$cw;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$cw;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public onRealTimeMessageReceived(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->c:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->c:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ct;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ct;-><init>(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzA(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->a:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$bn;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$bn;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    return-void
.end method

.method public zzB(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ed;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ed;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzC(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ea;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ea;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzD(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->a:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ec;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ec;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    return-void
.end method

.method public zzE(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ag;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ag;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzF(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$am;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$am;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$da;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$da;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzb(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$db;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$db;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzc(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$dc;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$dc;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzd(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$cy;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$cy;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zze(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$cx;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$cx;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzf(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->b:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$cz;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$cz;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzz(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$eb;->a:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ee;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ee;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    return-void
.end method
