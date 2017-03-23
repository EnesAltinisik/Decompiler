.class public Lat/grabner/circleprogress/a;
.super Landroid/os/Handler;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lat/grabner/circleprogress/CircleProgressView;",
            ">;"
        }
    .end annotation
.end field

.field private b:F

.field private c:J

.field private d:J

.field private e:Landroid/animation/TimeInterpolator;

.field private f:Landroid/animation/TimeInterpolator;

.field private g:D

.field private h:J


# direct methods
.method constructor <init>(Lat/grabner/circleprogress/CircleProgressView;)V
    .locals 2

    invoke-virtual {p1}, Lat/grabner/circleprogress/CircleProgressView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/a;->e:Landroid/animation/TimeInterpolator;

    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/a;->f:Landroid/animation/TimeInterpolator;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lat/grabner/circleprogress/a;->h:J

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lat/grabner/circleprogress/a;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private static a(Landroid/os/Message;Lat/grabner/circleprogress/CircleProgressView;)V
    .locals 2

    iget v0, p1, Lat/grabner/circleprogress/CircleProgressView;->m:F

    iput v0, p1, Lat/grabner/circleprogress/CircleProgressView;->n:F

    iget-object v0, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [F

    check-cast v0, [F

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p1, Lat/grabner/circleprogress/CircleProgressView;->m:F

    iput v0, p1, Lat/grabner/circleprogress/CircleProgressView;->l:F

    sget-object v0, Lat/grabner/circleprogress/c;->a:Lat/grabner/circleprogress/c;

    iput-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    iget-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v1, p1, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v0, v1}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_0
    invoke-virtual {p1}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    return-void
.end method

.method private a(Lat/grabner/circleprogress/CircleProgressView;)V
    .locals 2

    iget v0, p1, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iget v1, p1, Lat/grabner/circleprogress/CircleProgressView;->u:F

    div-float/2addr v0, v1

    iget v1, p1, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    iput-wide v0, p0, Lat/grabner/circleprogress/a;->g:D

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lat/grabner/circleprogress/a;->d:J

    iget v0, p1, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iput v0, p0, Lat/grabner/circleprogress/a;->b:F

    return-void
.end method

.method private a(Lat/grabner/circleprogress/CircleProgressView;Landroid/os/Message;)V
    .locals 8

    sget-object v0, Lat/grabner/circleprogress/c;->d:Lat/grabner/circleprogress/c;

    iput-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    iget-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v1, p1, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v0, v1}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_0
    const/4 v0, 0x0

    iput v0, p1, Lat/grabner/circleprogress/CircleProgressView;->n:F

    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [F

    check-cast v0, [F

    const/4 v1, 0x1

    aget v0, v0, v1

    iput v0, p1, Lat/grabner/circleprogress/CircleProgressView;->m:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lat/grabner/circleprogress/a;->d:J

    iget v0, p1, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iput v0, p0, Lat/grabner/circleprogress/a;->b:F

    sget v0, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v0, v0, -0x1

    iget v1, p1, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v0, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method private b(Lat/grabner/circleprogress/CircleProgressView;)V
    .locals 8

    const/high16 v2, 0x43b40000    # 360.0f

    sget-object v0, Lat/grabner/circleprogress/c;->b:Lat/grabner/circleprogress/c;

    iput-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    iget-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v1, p1, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v0, v1}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_0
    iget v0, p1, Lat/grabner/circleprogress/CircleProgressView;->o:F

    div-float v0, v2, v0

    iget v1, p1, Lat/grabner/circleprogress/CircleProgressView;->l:F

    mul-float/2addr v0, v1

    iput v0, p1, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iget v0, p1, Lat/grabner/circleprogress/CircleProgressView;->o:F

    div-float v0, v2, v0

    iget v1, p1, Lat/grabner/circleprogress/CircleProgressView;->l:F

    mul-float/2addr v0, v1

    iput v0, p1, Lat/grabner/circleprogress/CircleProgressView;->t:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lat/grabner/circleprogress/a;->d:J

    iget v0, p1, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iput v0, p0, Lat/grabner/circleprogress/a;->b:F

    iget v0, p1, Lat/grabner/circleprogress/CircleProgressView;->s:F

    iget v1, p1, Lat/grabner/circleprogress/CircleProgressView;->u:F

    div-float/2addr v0, v1

    iget v1, p1, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    iput-wide v0, p0, Lat/grabner/circleprogress/a;->g:D

    sget v0, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v0, v0, -0x1

    iget v1, p1, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v0, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method private c(Lat/grabner/circleprogress/CircleProgressView;)Z
    .locals 6

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lat/grabner/circleprogress/a;->c:J

    sub-long/2addr v2, v4

    long-to-double v2, v2

    iget-wide v4, p1, Lat/grabner/circleprogress/CircleProgressView;->w:D

    div-double/2addr v2, v4

    double-to-float v0, v2

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    move v0, v1

    :cond_0
    iget-object v2, p0, Lat/grabner/circleprogress/a;->f:Landroid/animation/TimeInterpolator;

    invoke-interface {v2, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v2

    iget v3, p1, Lat/grabner/circleprogress/CircleProgressView;->n:F

    iget v4, p1, Lat/grabner/circleprogress/CircleProgressView;->m:F

    iget v5, p1, Lat/grabner/circleprogress/CircleProgressView;->n:F

    sub-float/2addr v4, v5

    mul-float/2addr v2, v4

    add-float/2addr v2, v3

    iput v2, p1, Lat/grabner/circleprogress/CircleProgressView;->l:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/animation/TimeInterpolator;)V
    .locals 0

    iput-object p1, p0, Lat/grabner/circleprogress/a;->f:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public b(Landroid/animation/TimeInterpolator;)V
    .locals 0

    iput-object p1, p0, Lat/grabner/circleprogress/a;->e:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    const/4 v11, 0x0

    const/high16 v10, 0x43b40000    # 360.0f

    const/4 v9, 0x1

    const/4 v8, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    iget-object v0, p0, Lat/grabner/circleprogress/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lat/grabner/circleprogress/CircleProgressView;

    if-nez v0, :cond_0

    :goto_0
    :pswitch_0
    return-void

    :cond_0
    invoke-static {}, Lat/grabner/circleprogress/b;->a()[I

    move-result-object v1

    iget v3, p1, Landroid/os/Message;->what:I

    aget v1, v1, v3

    sget v3, Lat/grabner/circleprogress/b;->e:I

    if-ne v1, v3, :cond_1

    sget v3, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {p0, v3}, Lat/grabner/circleprogress/a;->removeMessages(I)V

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lat/grabner/circleprogress/a;->h:J

    sget-object v3, Lat/grabner/circleprogress/a$1;->b:[I

    iget-object v4, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-virtual {v4}, Lat/grabner/circleprogress/c;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_1
    sget-object v2, Lat/grabner/circleprogress/a$1;->a:[I

    add-int/lit8 v1, v1, -0x1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_1

    goto :goto_0

    :pswitch_2
    invoke-direct {p0, v0}, Lat/grabner/circleprogress/a;->b(Lat/grabner/circleprogress/CircleProgressView;)V

    goto :goto_0

    :pswitch_3
    invoke-static {p1, v0}, Lat/grabner/circleprogress/a;->a(Landroid/os/Message;Lat/grabner/circleprogress/CircleProgressView;)V

    goto :goto_0

    :pswitch_4
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [F

    check-cast v1, [F

    aget v1, v1, v8

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->n:F

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [F

    check-cast v1, [F

    aget v1, v1, v9

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->m:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lat/grabner/circleprogress/a;->c:J

    sget-object v1, Lat/grabner/circleprogress/c;->f:Lat/grabner/circleprogress/c;

    iput-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v2, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v1, v2}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_2
    sget v1, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v1, v1, -0x1

    iget v0, v0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :pswitch_5
    sget v0, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/a;->removeMessages(I)V

    goto :goto_0

    :pswitch_6
    sget-object v3, Lat/grabner/circleprogress/a$1;->a:[I

    add-int/lit8 v1, v1, -0x1

    aget v1, v3, v1

    packed-switch v1, :pswitch_data_2

    goto/16 :goto_0

    :pswitch_7
    sget-object v1, Lat/grabner/circleprogress/c;->c:Lat/grabner/circleprogress/c;

    iput-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/a;->a(Lat/grabner/circleprogress/CircleProgressView;)V

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v1, :cond_3

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v2, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v1, v2}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_3
    sget v1, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v1, v1, -0x1

    iget v0, v0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :pswitch_8
    invoke-static {p1, v0}, Lat/grabner/circleprogress/a;->a(Landroid/os/Message;Lat/grabner/circleprogress/CircleProgressView;)V

    goto/16 :goto_0

    :pswitch_9
    invoke-direct {p0, v0, p1}, Lat/grabner/circleprogress/a;->a(Lat/grabner/circleprogress/CircleProgressView;Landroid/os/Message;)V

    goto/16 :goto_0

    :pswitch_a
    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iget v3, v0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    sub-float v3, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->d:J

    sub-long/2addr v4, v6

    long-to-double v4, v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->g:D

    div-double/2addr v4, v6

    double-to-float v1, v4

    cmpl-float v4, v1, v2

    if-lez v4, :cond_4

    move v1, v2

    :cond_4
    iget-object v4, p0, Lat/grabner/circleprogress/a;->e:Landroid/animation/TimeInterpolator;

    invoke-interface {v4, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v1

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpg-float v2, v3, v2

    if-gez v2, :cond_6

    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    :goto_1
    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    iget v2, v0, Lat/grabner/circleprogress/CircleProgressView;->u:F

    add-float/2addr v1, v2

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    cmpl-float v1, v1, v10

    if-lez v1, :cond_5

    iput v11, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    :cond_5
    sget v1, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v1, v1, -0x1

    iget v2, v0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    invoke-virtual {v0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    goto/16 :goto_0

    :cond_6
    iget v2, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iget v3, v0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    cmpg-float v2, v2, v3

    if-gez v2, :cond_7

    iget v2, p0, Lat/grabner/circleprogress/a;->b:F

    iget v3, v0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    iget v4, p0, Lat/grabner/circleprogress/a;->b:F

    sub-float/2addr v3, v4

    mul-float/2addr v1, v3

    add-float/2addr v1, v2

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    goto :goto_1

    :cond_7
    iget v2, p0, Lat/grabner/circleprogress/a;->b:F

    iget v3, p0, Lat/grabner/circleprogress/a;->b:F

    iget v4, v0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    sub-float/2addr v3, v4

    mul-float/2addr v1, v3

    sub-float v1, v2, v1

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    goto :goto_1

    :pswitch_b
    sget-object v3, Lat/grabner/circleprogress/a$1;->a:[I

    add-int/lit8 v1, v1, -0x1

    aget v1, v3, v1

    packed-switch v1, :pswitch_data_3

    goto/16 :goto_0

    :pswitch_c
    sget-object v1, Lat/grabner/circleprogress/c;->b:Lat/grabner/circleprogress/c;

    iput-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v1, :cond_8

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v2, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v1, v2}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_8
    sget v1, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v1, v1, -0x1

    iget v0, v0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :pswitch_d
    invoke-static {p1, v0}, Lat/grabner/circleprogress/a;->a(Landroid/os/Message;Lat/grabner/circleprogress/CircleProgressView;)V

    goto/16 :goto_0

    :pswitch_e
    invoke-direct {p0, v0, p1}, Lat/grabner/circleprogress/a;->a(Lat/grabner/circleprogress/CircleProgressView;Landroid/os/Message;)V

    goto/16 :goto_0

    :pswitch_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->d:J

    sub-long/2addr v4, v6

    long-to-double v4, v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->g:D

    div-double/2addr v4, v6

    double-to-float v1, v4

    cmpl-float v3, v1, v2

    if-lez v3, :cond_9

    move v1, v2

    :cond_9
    iget-object v3, p0, Lat/grabner/circleprogress/a;->e:Landroid/animation/TimeInterpolator;

    invoke-interface {v3, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v1

    iget v3, p0, Lat/grabner/circleprogress/a;->b:F

    sub-float v1, v2, v1

    mul-float/2addr v1, v3

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    iget v2, v0, Lat/grabner/circleprogress/CircleProgressView;->u:F

    add-float/2addr v1, v2

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    const v2, 0x3c23d70a    # 0.01f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_a

    sget-object v1, Lat/grabner/circleprogress/c;->a:Lat/grabner/circleprogress/c;

    iput-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v1, :cond_a

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v2, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v1, v2}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_a
    sget v1, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v1, v1, -0x1

    iget v2, v0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    invoke-virtual {v0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    goto/16 :goto_0

    :pswitch_10
    sget-object v3, Lat/grabner/circleprogress/a$1;->a:[I

    add-int/lit8 v1, v1, -0x1

    aget v1, v3, v1

    packed-switch v1, :pswitch_data_4

    goto/16 :goto_0

    :pswitch_11
    iput-boolean v8, v0, Lat/grabner/circleprogress/CircleProgressView;->y:Z

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/a;->b(Lat/grabner/circleprogress/CircleProgressView;)V

    goto/16 :goto_0

    :pswitch_12
    iput-boolean v8, v0, Lat/grabner/circleprogress/CircleProgressView;->y:Z

    invoke-static {p1, v0}, Lat/grabner/circleprogress/a;->a(Landroid/os/Message;Lat/grabner/circleprogress/CircleProgressView;)V

    goto/16 :goto_0

    :pswitch_13
    iput v11, v0, Lat/grabner/circleprogress/CircleProgressView;->n:F

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [F

    check-cast v1, [F

    aget v1, v1, v9

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->m:F

    sget v1, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v1, v1, -0x1

    iget v0, v0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :pswitch_14
    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iget v3, v0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    cmpl-float v1, v1, v3

    if-lez v1, :cond_c

    iget-boolean v1, v0, Lat/grabner/circleprogress/CircleProgressView;->y:Z

    if-nez v1, :cond_c

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->d:J

    sub-long/2addr v4, v6

    long-to-double v4, v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->g:D

    div-double/2addr v4, v6

    double-to-float v1, v4

    cmpl-float v3, v1, v2

    if-lez v3, :cond_b

    move v1, v2

    :cond_b
    iget-object v3, p0, Lat/grabner/circleprogress/a;->e:Landroid/animation/TimeInterpolator;

    invoke-interface {v3, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v1

    iget v3, p0, Lat/grabner/circleprogress/a;->b:F

    sub-float v1, v2, v1

    mul-float/2addr v1, v3

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    :cond_c
    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    iget v3, v0, Lat/grabner/circleprogress/CircleProgressView;->u:F

    add-float/2addr v1, v3

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    cmpl-float v1, v1, v10

    if-lez v1, :cond_d

    iget-boolean v1, v0, Lat/grabner/circleprogress/CircleProgressView;->y:Z

    if-nez v1, :cond_d

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lat/grabner/circleprogress/a;->c:J

    iput-boolean v9, v0, Lat/grabner/circleprogress/CircleProgressView;->y:Z

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/a;->a(Lat/grabner/circleprogress/CircleProgressView;)V

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v1, :cond_d

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    sget-object v3, Lat/grabner/circleprogress/c;->e:Lat/grabner/circleprogress/c;

    invoke-interface {v1, v3}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_d
    iget-boolean v1, v0, Lat/grabner/circleprogress/CircleProgressView;->y:Z

    if-eqz v1, :cond_f

    iput v10, v0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    iget v3, v0, Lat/grabner/circleprogress/CircleProgressView;->u:F

    sub-float/2addr v1, v3

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/a;->c(Lat/grabner/circleprogress/CircleProgressView;)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->d:J

    sub-long/2addr v4, v6

    long-to-double v4, v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->g:D

    div-double/2addr v4, v6

    double-to-float v1, v4

    cmpl-float v3, v1, v2

    if-lez v3, :cond_e

    move v1, v2

    :cond_e
    iget-object v3, p0, Lat/grabner/circleprogress/a;->e:Landroid/animation/TimeInterpolator;

    invoke-interface {v3, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v1

    iget v3, p0, Lat/grabner/circleprogress/a;->b:F

    sub-float v1, v2, v1

    mul-float/2addr v1, v3

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    :cond_f
    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    float-to-double v2, v1

    const-wide v4, 0x3fb999999999999aL    # 0.1

    cmpg-double v1, v2, v4

    if-gez v1, :cond_11

    sget-object v1, Lat/grabner/circleprogress/c;->f:Lat/grabner/circleprogress/c;

    iput-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v1, :cond_10

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v2, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v1, v2}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_10
    invoke-virtual {v0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    iput-boolean v8, v0, Lat/grabner/circleprogress/CircleProgressView;->y:Z

    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    :goto_2
    sget v1, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v1, v1, -0x1

    iget v0, v0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :cond_11
    invoke-virtual {v0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    goto :goto_2

    :pswitch_15
    sget-object v2, Lat/grabner/circleprogress/a$1;->a:[I

    add-int/lit8 v1, v1, -0x1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_5

    goto/16 :goto_0

    :pswitch_16
    invoke-direct {p0, v0}, Lat/grabner/circleprogress/a;->b(Lat/grabner/circleprogress/CircleProgressView;)V

    goto/16 :goto_0

    :pswitch_17
    invoke-static {p1, v0}, Lat/grabner/circleprogress/a;->a(Landroid/os/Message;Lat/grabner/circleprogress/CircleProgressView;)V

    goto/16 :goto_0

    :pswitch_18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lat/grabner/circleprogress/a;->c:J

    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->n:F

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [F

    check-cast v1, [F

    aget v1, v1, v9

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->m:F

    goto/16 :goto_0

    :pswitch_19
    invoke-direct {p0, v0}, Lat/grabner/circleprogress/a;->c(Lat/grabner/circleprogress/CircleProgressView;)Z

    move-result v1

    if-eqz v1, :cond_13

    sget-object v1, Lat/grabner/circleprogress/c;->a:Lat/grabner/circleprogress/c;

    iput-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    if-eqz v1, :cond_12

    iget-object v1, v0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    iget-object v2, v0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    invoke-interface {v1, v2}, Lat/grabner/circleprogress/d;->a(Lat/grabner/circleprogress/c;)V

    :cond_12
    iget v1, v0, Lat/grabner/circleprogress/CircleProgressView;->m:F

    iput v1, v0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    :cond_13
    sget v1, Lat/grabner/circleprogress/b;->e:I

    add-int/lit8 v1, v1, -0x1

    iget v2, v0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    int-to-long v2, v2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lat/grabner/circleprogress/a;->h:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/a;->sendEmptyMessageDelayed(IJ)Z

    invoke-virtual {v0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_6
        :pswitch_b
        :pswitch_10
        :pswitch_15
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_0
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_c
        :pswitch_0
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_11
        :pswitch_0
        :pswitch_12
        :pswitch_13
        :pswitch_14
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_16
        :pswitch_0
        :pswitch_17
        :pswitch_18
        :pswitch_19
    .end packed-switch
.end method
