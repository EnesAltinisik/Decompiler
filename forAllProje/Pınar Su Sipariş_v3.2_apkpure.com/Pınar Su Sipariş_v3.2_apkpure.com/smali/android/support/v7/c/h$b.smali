.class Landroid/support/v7/c/h$b;
.super Landroid/media/MediaRouter$Callback;
.source "MediaRouterJellybean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/support/v7/c/h$a;",
        ">",
        "Landroid/media/MediaRouter$Callback;"
    }
.end annotation


# instance fields
.field protected final a:Landroid/support/v7/c/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v7/c/h$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 367
    invoke-direct {p0}, Landroid/media/MediaRouter$Callback;-><init>()V

    .line 368
    iput-object p1, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    .line 369
    return-void
.end method


# virtual methods
.method public onRouteAdded(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V
    .locals 1

    .prologue
    .line 386
    iget-object v0, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    invoke-interface {v0, p2}, Landroid/support/v7/c/h$a;->a(Ljava/lang/Object;)V

    .line 387
    return-void
.end method

.method public onRouteChanged(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V
    .locals 1

    .prologue
    .line 398
    iget-object v0, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    invoke-interface {v0, p2}, Landroid/support/v7/c/h$a;->c(Ljava/lang/Object;)V

    .line 399
    return-void
.end method

.method public onRouteGrouped(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;Landroid/media/MediaRouter$RouteGroup;I)V
    .locals 1

    .prologue
    .line 405
    iget-object v0, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    invoke-interface {v0, p2, p3, p4}, Landroid/support/v7/c/h$a;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 406
    return-void
.end method

.method public onRouteRemoved(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V
    .locals 1

    .prologue
    .line 392
    iget-object v0, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    invoke-interface {v0, p2}, Landroid/support/v7/c/h$a;->b(Ljava/lang/Object;)V

    .line 393
    return-void
.end method

.method public onRouteSelected(Landroid/media/MediaRouter;ILandroid/media/MediaRouter$RouteInfo;)V
    .locals 1

    .prologue
    .line 374
    iget-object v0, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    invoke-interface {v0, p2, p3}, Landroid/support/v7/c/h$a;->a(ILjava/lang/Object;)V

    .line 375
    return-void
.end method

.method public onRouteUngrouped(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;Landroid/media/MediaRouter$RouteGroup;)V
    .locals 1

    .prologue
    .line 412
    iget-object v0, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    invoke-interface {v0, p2, p3}, Landroid/support/v7/c/h$a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 413
    return-void
.end method

.method public onRouteUnselected(Landroid/media/MediaRouter;ILandroid/media/MediaRouter$RouteInfo;)V
    .locals 1

    .prologue
    .line 380
    iget-object v0, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    invoke-interface {v0, p2, p3}, Landroid/support/v7/c/h$a;->b(ILjava/lang/Object;)V

    .line 381
    return-void
.end method

.method public onRouteVolumeChanged(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V
    .locals 1

    .prologue
    .line 418
    iget-object v0, p0, Landroid/support/v7/c/h$b;->a:Landroid/support/v7/c/h$a;

    invoke-interface {v0, p2}, Landroid/support/v7/c/h$a;->d(Ljava/lang/Object;)V

    .line 419
    return-void
.end method
