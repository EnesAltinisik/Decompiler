.class Landroid/support/v4/media/session/c$c;
.super Ljava/lang/Object;
.source "MediaControllerCompat.java"

# interfaces
.implements Landroid/support/v4/media/session/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field protected final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1151
    invoke-virtual {p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/support/v4/media/session/d;->a(Landroid/content/Context;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/c$c;->a:Ljava/lang/Object;

    .line 1153
    iget-object v0, p0, Landroid/support/v4/media/session/c$c;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 1154
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Landroid/support/v4/media/session/c$g;
    .locals 2

    .prologue
    .line 1173
    iget-object v0, p0, Landroid/support/v4/media/session/c$c;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v4/media/session/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1174
    if-eqz v1, :cond_0

    new-instance v0, Landroid/support/v4/media/session/c$h;

    invoke-direct {v0, v1}, Landroid/support/v4/media/session/c$h;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/support/v4/media/session/c$a;)V
    .locals 2

    .prologue
    .line 1163
    iget-object v0, p0, Landroid/support/v4/media/session/c$c;->a:Ljava/lang/Object;

    # getter for: Landroid/support/v4/media/session/c$a;->mCallbackObj:Ljava/lang/Object;
    invoke-static {p1}, Landroid/support/v4/media/session/c$a;->access$400(Landroid/support/v4/media/session/c$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v4/media/session/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1164
    return-void
.end method

.method public a(Landroid/support/v4/media/session/c$a;Landroid/os/Handler;)V
    .locals 2

    .prologue
    .line 1158
    iget-object v0, p0, Landroid/support/v4/media/session/c$c;->a:Ljava/lang/Object;

    # getter for: Landroid/support/v4/media/session/c$a;->mCallbackObj:Ljava/lang/Object;
    invoke-static {p1}, Landroid/support/v4/media/session/c$a;->access$400(Landroid/support/v4/media/session/c$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, p2}, Landroid/support/v4/media/session/d;->a(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Handler;)V

    .line 1159
    return-void
.end method

.method public b()Landroid/support/v4/media/session/PlaybackStateCompat;
    .locals 1

    .prologue
    .line 1179
    iget-object v0, p0, Landroid/support/v4/media/session/c$c;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v4/media/session/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1180
    if-eqz v0, :cond_0

    invoke-static {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->a(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Landroid/support/v4/media/MediaMetadataCompat;
    .locals 1

    .prologue
    .line 1185
    iget-object v0, p0, Landroid/support/v4/media/session/c$c;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v4/media/session/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1186
    if-eqz v0, :cond_0

    invoke-static {v0}, Landroid/support/v4/media/MediaMetadataCompat;->a(Ljava/lang/Object;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1261
    iget-object v0, p0, Landroid/support/v4/media/session/c$c;->a:Ljava/lang/Object;

    return-object v0
.end method
