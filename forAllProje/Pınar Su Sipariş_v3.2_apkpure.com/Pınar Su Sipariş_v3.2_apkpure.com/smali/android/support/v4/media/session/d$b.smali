.class Landroid/support/v4/media/session/d$b;
.super Landroid/media/session/MediaController$Callback;
.source "MediaControllerCompatApi21.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/support/v4/media/session/d$a;",
        ">",
        "Landroid/media/session/MediaController$Callback;"
    }
.end annotation


# instance fields
.field protected final a:Landroid/support/v4/media/session/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/media/session/d$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 257
    invoke-direct {p0}, Landroid/media/session/MediaController$Callback;-><init>()V

    .line 258
    iput-object p1, p0, Landroid/support/v4/media/session/d$b;->a:Landroid/support/v4/media/session/d$a;

    .line 259
    return-void
.end method


# virtual methods
.method public onMetadataChanged(Landroid/media/MediaMetadata;)V
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Landroid/support/v4/media/session/d$b;->a:Landroid/support/v4/media/session/d$a;

    invoke-interface {v0, p1}, Landroid/support/v4/media/session/d$a;->b(Ljava/lang/Object;)V

    .line 279
    return-void
.end method

.method public onPlaybackStateChanged(Landroid/media/session/PlaybackState;)V
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Landroid/support/v4/media/session/d$b;->a:Landroid/support/v4/media/session/d$a;

    invoke-interface {v0, p1}, Landroid/support/v4/media/session/d$a;->a(Ljava/lang/Object;)V

    .line 274
    return-void
.end method

.method public onSessionDestroyed()V
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Landroid/support/v4/media/session/d$b;->a:Landroid/support/v4/media/session/d$a;

    invoke-interface {v0}, Landroid/support/v4/media/session/d$a;->a()V

    .line 264
    return-void
.end method

.method public onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Landroid/support/v4/media/session/d$b;->a:Landroid/support/v4/media/session/d$a;

    invoke-interface {v0, p1, p2}, Landroid/support/v4/media/session/d$a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 269
    return-void
.end method
