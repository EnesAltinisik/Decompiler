.class final Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;
.super Landroid/support/v7/c/g$a;
.source "MediaRouteButton.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/MediaRouteButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "MediaRouterCallback"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/app/MediaRouteButton;


# direct methods
.method private constructor <init>(Landroid/support/v7/app/MediaRouteButton;)V
    .locals 0

    .prologue
    .line 523
    iput-object p1, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    invoke-direct {p0}, Landroid/support/v7/c/g$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/app/MediaRouteButton;Landroid/support/v7/app/MediaRouteButton$1;)V
    .locals 0

    .prologue
    .line 523
    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;-><init>(Landroid/support/v7/app/MediaRouteButton;)V

    return-void
.end method


# virtual methods
.method public onProviderAdded(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V
    .locals 1

    .prologue
    .line 551
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    # invokes: Landroid/support/v7/app/MediaRouteButton;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteButton;->access$100(Landroid/support/v7/app/MediaRouteButton;)V

    .line 552
    return-void
.end method

.method public onProviderChanged(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V
    .locals 1

    .prologue
    .line 561
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    # invokes: Landroid/support/v7/app/MediaRouteButton;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteButton;->access$100(Landroid/support/v7/app/MediaRouteButton;)V

    .line 562
    return-void
.end method

.method public onProviderRemoved(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V
    .locals 1

    .prologue
    .line 556
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    # invokes: Landroid/support/v7/app/MediaRouteButton;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteButton;->access$100(Landroid/support/v7/app/MediaRouteButton;)V

    .line 557
    return-void
.end method

.method public onRouteAdded(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V
    .locals 1

    .prologue
    .line 526
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    # invokes: Landroid/support/v7/app/MediaRouteButton;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteButton;->access$100(Landroid/support/v7/app/MediaRouteButton;)V

    .line 527
    return-void
.end method

.method public onRouteChanged(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V
    .locals 1

    .prologue
    .line 536
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    # invokes: Landroid/support/v7/app/MediaRouteButton;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteButton;->access$100(Landroid/support/v7/app/MediaRouteButton;)V

    .line 537
    return-void
.end method

.method public onRouteRemoved(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V
    .locals 1

    .prologue
    .line 531
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    # invokes: Landroid/support/v7/app/MediaRouteButton;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteButton;->access$100(Landroid/support/v7/app/MediaRouteButton;)V

    .line 532
    return-void
.end method

.method public onRouteSelected(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V
    .locals 1

    .prologue
    .line 541
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    # invokes: Landroid/support/v7/app/MediaRouteButton;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteButton;->access$100(Landroid/support/v7/app/MediaRouteButton;)V

    .line 542
    return-void
.end method

.method public onRouteUnselected(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V
    .locals 1

    .prologue
    .line 546
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteButton$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteButton;

    # invokes: Landroid/support/v7/app/MediaRouteButton;->refreshRoute()V
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteButton;->access$100(Landroid/support/v7/app/MediaRouteButton;)V

    .line 547
    return-void
.end method
