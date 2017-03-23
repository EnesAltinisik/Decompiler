.class final Landroid/support/v7/c/c$b;
.super Landroid/os/Handler;
.source "MediaRouteProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/c/c;


# direct methods
.method private constructor <init>(Landroid/support/v7/c/c;)V
    .locals 0

    .prologue
    .line 400
    iput-object p1, p0, Landroid/support/v7/c/c$b;->a:Landroid/support/v7/c/c;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/c/c;Landroid/support/v7/c/c$1;)V
    .locals 0

    .prologue
    .line 400
    invoke-direct {p0, p1}, Landroid/support/v7/c/c$b;-><init>(Landroid/support/v7/c/c;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 403
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 411
    :goto_0
    return-void

    .line 405
    :pswitch_0
    iget-object v0, p0, Landroid/support/v7/c/c$b;->a:Landroid/support/v7/c/c;

    invoke-static {v0}, Landroid/support/v7/c/c;->a(Landroid/support/v7/c/c;)V

    goto :goto_0

    .line 408
    :pswitch_1
    iget-object v0, p0, Landroid/support/v7/c/c$b;->a:Landroid/support/v7/c/c;

    invoke-static {v0}, Landroid/support/v7/c/c;->b(Landroid/support/v7/c/c;)V

    goto :goto_0

    .line 403
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
