.class public abstract Landroid/support/v4/media/session/c$a;
.super Ljava/lang/Object;
.source "MediaControllerCompat.java"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/c$a$a;,
        Landroid/support/v4/media/session/c$a$c;,
        Landroid/support/v4/media/session/c$a$b;
    }
.end annotation


# instance fields
.field private final mCallbackObj:Ljava/lang/Object;

.field private mHandler:Landroid/support/v4/media/session/c$a$a;

.field private mRegistered:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 347
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 345
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/media/session/c$a;->mRegistered:Z

    .line 348
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 349
    new-instance v0, Landroid/support/v4/media/session/c$a$b;

    invoke-direct {v0, p0, v2}, Landroid/support/v4/media/session/c$a$b;-><init>(Landroid/support/v4/media/session/c$a;Landroid/support/v4/media/session/c$1;)V

    invoke-static {v0}, Landroid/support/v4/media/session/d;->a(Landroid/support/v4/media/session/d$a;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/c$a;->mCallbackObj:Ljava/lang/Object;

    .line 353
    :goto_0
    return-void

    .line 351
    :cond_0
    new-instance v0, Landroid/support/v4/media/session/c$a$c;

    invoke-direct {v0, p0, v2}, Landroid/support/v4/media/session/c$a$c;-><init>(Landroid/support/v4/media/session/c$a;Landroid/support/v4/media/session/c$1;)V

    iput-object v0, p0, Landroid/support/v4/media/session/c$a;->mCallbackObj:Ljava/lang/Object;

    goto :goto_0
.end method

.method static synthetic access$200(Landroid/support/v4/media/session/c$a;)Landroid/support/v4/media/session/c$a$a;
    .locals 1

    .prologue
    .line 341
    iget-object v0, p0, Landroid/support/v4/media/session/c$a;->mHandler:Landroid/support/v4/media/session/c$a$a;

    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v4/media/session/c$a;)Z
    .locals 1

    .prologue
    .line 341
    iget-boolean v0, p0, Landroid/support/v4/media/session/c$a;->mRegistered:Z

    return v0
.end method

.method static synthetic access$302(Landroid/support/v4/media/session/c$a;Z)Z
    .locals 0

    .prologue
    .line 341
    iput-boolean p1, p0, Landroid/support/v4/media/session/c$a;->mRegistered:Z

    return p1
.end method

.method static synthetic access$400(Landroid/support/v4/media/session/c$a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 341
    iget-object v0, p0, Landroid/support/v4/media/session/c$a;->mCallbackObj:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$500(Landroid/support/v4/media/session/c$a;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 341
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/c$a;->setHandler(Landroid/os/Handler;)V

    return-void
.end method

.method private setHandler(Landroid/os/Handler;)V
    .locals 2

    .prologue
    .line 437
    new-instance v0, Landroid/support/v4/media/session/c$a$a;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/support/v4/media/session/c$a$a;-><init>(Landroid/support/v4/media/session/c$a;Landroid/os/Looper;)V

    iput-object v0, p0, Landroid/support/v4/media/session/c$a;->mHandler:Landroid/support/v4/media/session/c$a$a;

    .line 438
    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 0

    .prologue
    .line 430
    invoke-virtual {p0}, Landroid/support/v4/media/session/c$a;->onSessionDestroyed()V

    .line 431
    return-void
.end method

.method public onAudioInfoChanged(Landroid/support/v4/media/session/c$f;)V
    .locals 0

    .prologue
    .line 426
    return-void
.end method

.method public onExtrasChanged(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 418
    return-void
.end method

.method public onMetadataChanged(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 0

    .prologue
    .line 388
    return-void
.end method

.method public onPlaybackStateChanged(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 0

    .prologue
    .line 379
    return-void
.end method

.method public onQueueChanged(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 399
    return-void
.end method

.method public onQueueTitleChanged(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 409
    return-void
.end method

.method public onSessionDestroyed()V
    .locals 0

    .prologue
    .line 360
    return-void
.end method

.method public onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 371
    return-void
.end method
