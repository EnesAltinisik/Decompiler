.class public final Landroid/support/v4/media/session/c;
.super Ljava/lang/Object;
.source "MediaControllerCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/c$1;,
        Landroid/support/v4/media/session/c$i;,
        Landroid/support/v4/media/session/c$d;,
        Landroid/support/v4/media/session/c$h;,
        Landroid/support/v4/media/session/c$c;,
        Landroid/support/v4/media/session/c$j;,
        Landroid/support/v4/media/session/c$e;,
        Landroid/support/v4/media/session/c$b;,
        Landroid/support/v4/media/session/c$f;,
        Landroid/support/v4/media/session/c$g;,
        Landroid/support/v4/media/session/c$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/support/v4/media/session/c$b;

.field private final b:Landroid/support/v4/media/session/MediaSessionCompat$Token;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    if-nez p2, :cond_0

    .line 91
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sessionToken must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_0
    iput-object p2, p0, Landroid/support/v4/media/session/c;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 95
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 96
    new-instance v0, Landroid/support/v4/media/session/c$d;

    invoke-direct {v0, p1, p2}, Landroid/support/v4/media/session/c$d;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iput-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    .line 102
    :goto_0
    return-void

    .line 97
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    .line 98
    new-instance v0, Landroid/support/v4/media/session/c$c;

    invoke-direct {v0, p1, p2}, Landroid/support/v4/media/session/c$c;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iput-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    goto :goto_0

    .line 100
    :cond_2
    new-instance v0, Landroid/support/v4/media/session/c$e;

    iget-object v1, p0, Landroid/support/v4/media/session/c;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-direct {v0, v1}, Landroid/support/v4/media/session/c$e;-><init>(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iput-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/support/v4/media/session/c$g;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    invoke-interface {v0}, Landroid/support/v4/media/session/c$b;->a()Landroid/support/v4/media/session/c$g;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/support/v4/media/session/c$a;)V
    .locals 1

    .prologue
    .line 264
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/support/v4/media/session/c;->a(Landroid/support/v4/media/session/c$a;Landroid/os/Handler;)V

    .line 265
    return-void
.end method

.method public a(Landroid/support/v4/media/session/c$a;Landroid/os/Handler;)V
    .locals 2

    .prologue
    .line 276
    if-nez p1, :cond_0

    .line 277
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 279
    :cond_0
    if-nez p2, :cond_1

    .line 280
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    .line 282
    :cond_1
    iget-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    invoke-interface {v0, p1, p2}, Landroid/support/v4/media/session/c$b;->a(Landroid/support/v4/media/session/c$a;Landroid/os/Handler;)V

    .line 283
    return-void
.end method

.method public b()Landroid/support/v4/media/session/PlaybackStateCompat;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    invoke-interface {v0}, Landroid/support/v4/media/session/c$b;->b()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/support/v4/media/session/c$a;)V
    .locals 2

    .prologue
    .line 292
    if-nez p1, :cond_0

    .line 293
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 295
    :cond_0
    iget-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    invoke-interface {v0, p1}, Landroid/support/v4/media/session/c$b;->a(Landroid/support/v4/media/session/c$a;)V

    .line 296
    return-void
.end method

.method public c()Landroid/support/v4/media/MediaMetadataCompat;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    invoke-interface {v0}, Landroid/support/v4/media/session/c$b;->c()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Landroid/support/v4/media/session/c;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    return-object v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Landroid/support/v4/media/session/c;->a:Landroid/support/v4/media/session/c$b;

    invoke-interface {v0}, Landroid/support/v4/media/session/c$b;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
