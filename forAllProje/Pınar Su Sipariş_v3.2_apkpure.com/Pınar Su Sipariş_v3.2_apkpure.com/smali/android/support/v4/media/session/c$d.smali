.class Landroid/support/v4/media/session/c$d;
.super Landroid/support/v4/media/session/c$c;
.source "MediaControllerCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1368
    invoke-direct {p0, p1, p2}, Landroid/support/v4/media/session/c$c;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 1369
    return-void
.end method


# virtual methods
.method public a()Landroid/support/v4/media/session/c$g;
    .locals 2

    .prologue
    .line 1373
    iget-object v0, p0, Landroid/support/v4/media/session/c$d;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v4/media/session/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1374
    if-eqz v1, :cond_0

    new-instance v0, Landroid/support/v4/media/session/c$i;

    invoke-direct {v0, v1}, Landroid/support/v4/media/session/c$i;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
