.class final Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;
.super Landroid/support/v7/c/g$a;
.source "MediaRouteActionProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/MediaRouteActionProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "MediaRouterCallback"
.end annotation


# instance fields
.field private final mProviderWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/support/v7/app/MediaRouteActionProvider;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v7/app/MediaRouteActionProvider;)V
    .locals 1

    .prologue
    .line 289
    invoke-direct {p0}, Landroid/support/v7/c/g$a;-><init>()V

    .line 290
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;->mProviderWeak:Ljava/lang/ref/WeakReference;

    .line 291
    return-void
.end method

.method private refreshRoute(Landroid/support/v7/c/g;)V
    .locals 1

    .prologue
    .line 324
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;->mProviderWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/MediaRouteActionProvider;

    .line 325
    if-eqz v0, :cond_0

    .line 326
    # invokes: Landroid/support/v7/app/MediaRouteActionProvider;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteActionProvider;->access$000(Landroid/support/v7/app/MediaRouteActionProvider;)V

    .line 330
    :goto_0
    return-void

    .line 328
    :cond_0
    invoke-virtual {p1, p0}, Landroid/support/v7/c/g;->a(Landroid/support/v7/c/g$a;)V

    goto :goto_0
.end method


# virtual methods
.method public onProviderAdded(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V
    .locals 0

    .prologue
    .line 310
    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;->refreshRoute(Landroid/support/v7/c/g;)V

    .line 311
    return-void
.end method

.method public onProviderChanged(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V
    .locals 0

    .prologue
    .line 320
    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;->refreshRoute(Landroid/support/v7/c/g;)V

    .line 321
    return-void
.end method

.method public onProviderRemoved(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V
    .locals 0

    .prologue
    .line 315
    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;->refreshRoute(Landroid/support/v7/c/g;)V

    .line 316
    return-void
.end method

.method public onRouteAdded(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V
    .locals 0

    .prologue
    .line 295
    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;->refreshRoute(Landroid/support/v7/c/g;)V

    .line 296
    return-void
.end method

.method public onRouteChanged(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V
    .locals 0

    .prologue
    .line 305
    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;->refreshRoute(Landroid/support/v7/c/g;)V

    .line 306
    return-void
.end method

.method public onRouteRemoved(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V
    .locals 0

    .prologue
    .line 300
    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;->refreshRoute(Landroid/support/v7/c/g;)V

    .line 301
    return-void
.end method
