.class Landroid/support/v4/media/session/c$a$b;
.super Ljava/lang/Object;
.source "MediaControllerCompat.java"

# interfaces
.implements Landroid/support/v4/media/session/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/media/session/c$a;


# direct methods
.method private constructor <init>(Landroid/support/v4/media/session/c$a;)V
    .locals 0

    .prologue
    .line 440
    iput-object p1, p0, Landroid/support/v4/media/session/c$a$b;->a:Landroid/support/v4/media/session/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v4/media/session/c$a;Landroid/support/v4/media/session/c$1;)V
    .locals 0

    .prologue
    .line 440
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/c$a$b;-><init>(Landroid/support/v4/media/session/c$a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Landroid/support/v4/media/session/c$a$b;->a:Landroid/support/v4/media/session/c$a;

    invoke-virtual {v0}, Landroid/support/v4/media/session/c$a;->onSessionDestroyed()V

    .line 444
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 453
    iget-object v0, p0, Landroid/support/v4/media/session/c$a$b;->a:Landroid/support/v4/media/session/c$a;

    invoke-static {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->a(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/c$a;->onPlaybackStateChanged(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 455
    return-void
.end method

.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 448
    iget-object v0, p0, Landroid/support/v4/media/session/c$a$b;->a:Landroid/support/v4/media/session/c$a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/session/c$a;->onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 449
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 459
    iget-object v0, p0, Landroid/support/v4/media/session/c$a$b;->a:Landroid/support/v4/media/session/c$a;

    invoke-static {p1}, Landroid/support/v4/media/MediaMetadataCompat;->a(Ljava/lang/Object;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/c$a;->onMetadataChanged(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 461
    return-void
.end method
