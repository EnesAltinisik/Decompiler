.class final Lcom/google/android/gms/wearable/internal/zzl$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/ChannelApi$OpenChannelResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/zzl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Lcom/google/android/gms/wearable/Channel;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/Channel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Status;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzl$a;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzl$a;->b:Lcom/google/android/gms/wearable/Channel;

    return-void
.end method


# virtual methods
.method public getChannel()Lcom/google/android/gms/wearable/Channel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzl$a;->b:Lcom/google/android/gms/wearable/Channel;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzl$a;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
