.class public Lcom/google/android/gms/wearable/internal/zzbq;
.super Lcom/google/android/gms/wearable/internal/zzaw$zza;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/wearable/internal/zzaw$zza;"
    }
.end annotation


# instance fields
.field private zzbDV:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private zzbDW:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private zzbDX:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/DataApi$DataListener;",
            ">;"
        }
    .end annotation
.end field

.field private zzbDY:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
            ">;"
        }
    .end annotation
.end field

.field private zzbDZ:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbDz:[Landroid/content/IntentFilter;

.field private zzbEa:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;"
        }
    .end annotation
.end field

.field private zzbEb:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbEc:Ljava/lang/String;

.field private zzbif:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>([Landroid/content/IntentFilter;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/zzaw$zza;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/IntentFilter;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDz:[Landroid/content/IntentFilter;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEc:Ljava/lang/String;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/zzou;Ljava/lang/String;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/zzbq;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;",
            "Ljava/lang/String;",
            "[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbq",
            "<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzbq;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, p2, v0}, Lcom/google/android/gms/wearable/internal/zzbq;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzou;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEa:Lcom/google/android/gms/internal/zzou;

    return-object v1
.end method

.method public static zza(Lcom/google/android/gms/internal/zzou;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/zzbq;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/DataApi$DataListener;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbq",
            "<",
            "Lcom/google/android/gms/wearable/DataApi$DataListener;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzbq;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/zzbq;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzou;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDX:Lcom/google/android/gms/internal/zzou;

    return-object v1
.end method

.method private static zzas(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/internal/zzou$zzb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ")",
            "Lcom/google/android/gms/internal/zzou$zzb",
            "<",
            "Lcom/google/android/gms/wearable/DataApi$DataListener;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbq$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/zzbq$1;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method

.method private static zzb(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)Lcom/google/android/gms/internal/zzou$zzb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;",
            ")",
            "Lcom/google/android/gms/internal/zzou$zzb",
            "<",
            "Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbq$6;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/zzbq$6;-><init>(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)V

    return-object v0
.end method

.method private static zzb(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)Lcom/google/android/gms/internal/zzou$zzb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;",
            ")",
            "Lcom/google/android/gms/internal/zzou$zzb",
            "<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbq$5;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/zzbq$5;-><init>(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)V

    return-object v0
.end method

.method private static zzb(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)Lcom/google/android/gms/internal/zzou$zzb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/MessageEventParcelable;",
            ")",
            "Lcom/google/android/gms/internal/zzou$zzb",
            "<",
            "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbq$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/zzbq$2;-><init>(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/internal/zzou;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/zzbq;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbq",
            "<",
            "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzbq;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/zzbq;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzou;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/zzbq;->zzbif:Lcom/google/android/gms/internal/zzou;

    return-object v1
.end method

.method private static zzc(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/zzou$zzb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/NodeParcelable;",
            ")",
            "Lcom/google/android/gms/internal/zzou$zzb",
            "<",
            "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbq$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/zzbq$3;-><init>(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V

    return-object v0
.end method

.method public static zzc(Lcom/google/android/gms/internal/zzou;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/zzbq;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbq",
            "<",
            "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzbq;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/zzbq;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzou;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDY:Lcom/google/android/gms/internal/zzou;

    return-object v1
.end method

.method private static zzd(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/zzou$zzb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/NodeParcelable;",
            ")",
            "Lcom/google/android/gms/internal/zzou$zzb",
            "<",
            "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbq$4;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/zzbq$4;-><init>(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V

    return-object v0
.end method

.method public static zzd(Lcom/google/android/gms/internal/zzou;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/zzbq;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbq",
            "<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzbq;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/zzbq;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzou;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEa:Lcom/google/android/gms/internal/zzou;

    return-object v1
.end method

.method public static zze(Lcom/google/android/gms/internal/zzou;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/zzbq;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbq",
            "<",
            "Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzbq;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/zzbq;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzou;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEb:Lcom/google/android/gms/internal/zzou;

    return-object v1
.end method

.method private static zzi(Lcom/google/android/gms/internal/zzou;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<*>;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzou;->clear()V

    :cond_0
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzi(Lcom/google/android/gms/internal/zzou;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDV:Lcom/google/android/gms/internal/zzou;

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzi(Lcom/google/android/gms/internal/zzou;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDW:Lcom/google/android/gms/internal/zzou;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDX:Lcom/google/android/gms/internal/zzou;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/zzbq;->zzi(Lcom/google/android/gms/internal/zzou;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDX:Lcom/google/android/gms/internal/zzou;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbif:Lcom/google/android/gms/internal/zzou;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/zzbq;->zzi(Lcom/google/android/gms/internal/zzou;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbif:Lcom/google/android/gms/internal/zzou;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDY:Lcom/google/android/gms/internal/zzou;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/zzbq;->zzi(Lcom/google/android/gms/internal/zzou;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDY:Lcom/google/android/gms/internal/zzou;

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzi(Lcom/google/android/gms/internal/zzou;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDZ:Lcom/google/android/gms/internal/zzou;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEa:Lcom/google/android/gms/internal/zzou;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/zzbq;->zzi(Lcom/google/android/gms/internal/zzou;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEa:Lcom/google/android/gms/internal/zzou;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEb:Lcom/google/android/gms/internal/zzou;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/zzbq;->zzi(Lcom/google/android/gms/internal/zzou;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEb:Lcom/google/android/gms/internal/zzou;

    return-void
.end method

.method public onConnectedNodes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/NodeParcelable;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public zzNJ()[Landroid/content/IntentFilter;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDz:[Landroid/content/IntentFilter;

    return-object v0
.end method

.method public zzNK()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEc:Ljava/lang/String;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;)V
    .locals 0

    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/AncsNotificationParcelable;)V
    .locals 0

    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEb:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEb:Lcom/google/android/gms/internal/zzou;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzb(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)Lcom/google/android/gms/internal/zzou$zzb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEa:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbEa:Lcom/google/android/gms/internal/zzou;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzb(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)Lcom/google/android/gms/internal/zzou$zzb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbif:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbif:Lcom/google/android/gms/internal/zzou;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzb(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)Lcom/google/android/gms/internal/zzou$zzb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDY:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDY:Lcom/google/android/gms/internal/zzou;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzc(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/zzou$zzb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method

.method public zzaq(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDX:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDX:Lcom/google/android/gms/internal/zzou;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzas(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/internal/zzou$zzb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDY:Lcom/google/android/gms/internal/zzou;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq;->zzbDY:Lcom/google/android/gms/internal/zzou;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzbq;->zzd(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/zzou$zzb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    :cond_0
    return-void
.end method
