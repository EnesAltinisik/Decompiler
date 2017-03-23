.class final Landroid/support/v7/c/g$d$a;
.super Landroid/os/Handler;
.source "MediaRouter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/g$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/c/g$d;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/c/g$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/support/v7/c/g$d;)V
    .locals 1

    .prologue
    .line 2378
    iput-object p1, p0, Landroid/support/v7/c/g$d$a;->a:Landroid/support/v7/c/g$d;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2379
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g$d$a;->b:Ljava/util/ArrayList;

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/c/g$d;Landroid/support/v7/c/g$1;)V
    .locals 0

    .prologue
    .line 2378
    invoke-direct {p0, p1}, Landroid/support/v7/c/g$d$a;-><init>(Landroid/support/v7/c/g$d;)V

    return-void
.end method

.method private a(Landroid/support/v7/c/g$b;ILjava/lang/Object;)V
    .locals 3

    .prologue
    .line 2450
    iget-object v0, p1, Landroid/support/v7/c/g$b;->a:Landroid/support/v7/c/g;

    .line 2451
    iget-object v1, p1, Landroid/support/v7/c/g$b;->b:Landroid/support/v7/c/g$a;

    .line 2452
    const v2, 0xff00

    and-int/2addr v2, p2

    sparse-switch v2, :sswitch_data_0

    .line 2498
    :cond_0
    :goto_0
    return-void

    .line 2454
    :sswitch_0
    check-cast p3, Landroid/support/v7/c/g$f;

    .line 2455
    invoke-virtual {p1, p3}, Landroid/support/v7/c/g$b;->a(Landroid/support/v7/c/g$f;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2458
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 2460
    :pswitch_0
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onRouteAdded(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2463
    :pswitch_1
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onRouteRemoved(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2466
    :pswitch_2
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onRouteChanged(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2469
    :pswitch_3
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onRouteVolumeChanged(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2472
    :pswitch_4
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onRoutePresentationDisplayChanged(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2475
    :pswitch_5
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onRouteSelected(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2478
    :pswitch_6
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onRouteUnselected(Landroid/support/v7/c/g;Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2484
    :sswitch_1
    check-cast p3, Landroid/support/v7/c/g$e;

    .line 2485
    packed-switch p2, :pswitch_data_1

    goto :goto_0

    .line 2487
    :pswitch_7
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onProviderAdded(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V

    goto :goto_0

    .line 2490
    :pswitch_8
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onProviderRemoved(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V

    goto :goto_0

    .line 2493
    :pswitch_9
    invoke-virtual {v1, v0, p3}, Landroid/support/v7/c/g$a;->onProviderChanged(Landroid/support/v7/c/g;Landroid/support/v7/c/g$e;)V

    goto :goto_0

    .line 2452
    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_0
        0x200 -> :sswitch_1
    .end sparse-switch

    .line 2458
    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch

    .line 2485
    :pswitch_data_1
    .packed-switch 0x201
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method private b(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 2433
    packed-switch p1, :pswitch_data_0

    .line 2447
    :goto_0
    :pswitch_0
    return-void

    .line 2435
    :pswitch_1
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->e(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/n;

    move-result-object v0

    check-cast p2, Landroid/support/v7/c/g$f;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/n;->a(Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2438
    :pswitch_2
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->e(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/n;

    move-result-object v0

    check-cast p2, Landroid/support/v7/c/g$f;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/n;->b(Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2441
    :pswitch_3
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->e(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/n;

    move-result-object v0

    check-cast p2, Landroid/support/v7/c/g$f;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/n;->c(Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2444
    :pswitch_4
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->e(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/n;

    move-result-object v0

    check-cast p2, Landroid/support/v7/c/g$f;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/n;->d(Landroid/support/v7/c/g$f;)V

    goto :goto_0

    .line 2433
    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public a(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 2399
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/c/g$d$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 2400
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 2404
    iget v2, p1, Landroid/os/Message;->what:I

    .line 2405
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2408
    invoke-direct {p0, v2, v3}, Landroid/support/v7/c/g$d$a;->b(ILjava/lang/Object;)V

    .line 2414
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->d(Landroid/support/v7/c/g$d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-ltz v1, :cond_1

    .line 2415
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->d(Landroid/support/v7/c/g$d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g;

    .line 2416
    if-nez v0, :cond_0

    .line 2417
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->d(Landroid/support/v7/c/g$d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :goto_1
    move v0, v1

    .line 2421
    goto :goto_0

    .line 2419
    :cond_0
    iget-object v4, p0, Landroid/support/v7/c/g$d$a;->b:Ljava/util/ArrayList;

    iget-object v0, v0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 2428
    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroid/support/v7/c/g$d$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    throw v0

    .line 2423
    :cond_1
    :try_start_1
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 2424
    const/4 v0, 0x0

    move v1, v0

    :goto_2
    if-ge v1, v4, :cond_2

    .line 2425
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$b;

    invoke-direct {p0, v0, v2, v3}, Landroid/support/v7/c/g$d$a;->a(Landroid/support/v7/c/g$b;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2424
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 2428
    :cond_2
    iget-object v0, p0, Landroid/support/v7/c/g$d$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2430
    return-void
.end method
