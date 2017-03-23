.class Landroid/support/v7/c/i$c;
.super Landroid/support/v7/c/h$b;
.source "MediaRouterJellybeanMr1.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/support/v7/c/i$b;",
        ">",
        "Landroid/support/v7/c/h$b",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/support/v7/c/i$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 167
    invoke-direct {p0, p1}, Landroid/support/v7/c/h$b;-><init>(Landroid/support/v7/c/h$a;)V

    .line 168
    return-void
.end method


# virtual methods
.method public onRoutePresentationDisplayChanged(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Landroid/support/v7/c/i$c;->a:Landroid/support/v7/c/h$a;

    check-cast v0, Landroid/support/v7/c/i$b;

    invoke-interface {v0, p2}, Landroid/support/v7/c/i$b;->e(Ljava/lang/Object;)V

    .line 174
    return-void
.end method
