.class public Lcom/nightonke/boommenu/a/g;
.super Landroid/view/View;


# instance fields
.field private a:J

.field private b:J

.field private c:J

.field private d:J

.field private e:J

.field private f:J

.field private g:J

.field private h:J

.field private i:J

.field private j:J

.field private k:J

.field private l:J

.field private m:F

.field private n:F

.field private o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private p:I

.field private q:I

.field private r:I

.field private s:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, -0x1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput v0, p0, Lcom/nightonke/boommenu/a/g;->m:F

    iput v0, p0, Lcom/nightonke/boommenu/a/g;->n:F

    iput v1, p0, Lcom/nightonke/boommenu/a/g;->p:I

    iput v1, p0, Lcom/nightonke/boommenu/a/g;->q:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/nightonke/boommenu/a/g;->r:I

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/a/g;->s:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method private setHideProcess(F)V
    .locals 7

    const/high16 v6, 0x3f800000    # 1.0f

    iget-wide v0, p0, Lcom/nightonke/boommenu/a/g;->l:J

    long-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-long v0, v0

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->g:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_1

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->h:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->h:J

    sub-long v0, v2, v0

    long-to-float v0, v0

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->h:J

    iget-wide v4, p0, Lcom/nightonke/boommenu/a/g;->g:J

    sub-long/2addr v2, v4

    long-to-float v1, v2

    div-float/2addr v0, v1

    sub-float v0, v6, v0

    iput v0, p0, Lcom/nightonke/boommenu/a/g;->n:F

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/nightonke/boommenu/a/g;->invalidate()V

    return-void

    :cond_1
    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->h:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_2

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->i:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_2

    iput v6, p0, Lcom/nightonke/boommenu/a/g;->n:F

    goto :goto_0

    :cond_2
    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->i:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_3

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->j:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_3

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->j:J

    sub-long v0, v2, v0

    long-to-float v0, v0

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->j:J

    iget-wide v4, p0, Lcom/nightonke/boommenu/a/g;->i:J

    sub-long/2addr v2, v4

    long-to-float v1, v2

    div-float/2addr v0, v1

    sub-float v0, v6, v0

    iput v0, p0, Lcom/nightonke/boommenu/a/g;->m:F

    goto :goto_0

    :cond_3
    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->j:J

    cmp-long v0, v2, v0

    if-gtz v0, :cond_0

    iput v6, p0, Lcom/nightonke/boommenu/a/g;->m:F

    iput v6, p0, Lcom/nightonke/boommenu/a/g;->n:F

    goto :goto_0
.end method

.method private setShowProcess(F)V
    .locals 6

    const/4 v4, 0x0

    iget-wide v0, p0, Lcom/nightonke/boommenu/a/g;->f:J

    long-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-long v0, v0

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->a:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_1

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->b:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->b:J

    sub-long v0, v2, v0

    long-to-float v0, v0

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->b:J

    iget-wide v4, p0, Lcom/nightonke/boommenu/a/g;->a:J

    sub-long/2addr v2, v4

    long-to-float v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/nightonke/boommenu/a/g;->m:F

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/nightonke/boommenu/a/g;->invalidate()V

    return-void

    :cond_1
    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->b:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_2

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->c:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_2

    iput v4, p0, Lcom/nightonke/boommenu/a/g;->m:F

    goto :goto_0

    :cond_2
    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->c:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_3

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->d:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_3

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->d:J

    sub-long v0, v2, v0

    long-to-float v0, v0

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->d:J

    iget-wide v4, p0, Lcom/nightonke/boommenu/a/g;->c:J

    sub-long/2addr v2, v4

    long-to-float v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/nightonke/boommenu/a/g;->n:F

    goto :goto_0

    :cond_3
    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->d:J

    cmp-long v0, v2, v0

    if-gtz v0, :cond_0

    iput v4, p0, Lcom/nightonke/boommenu/a/g;->m:F

    iput v4, p0, Lcom/nightonke/boommenu/a/g;->n:F

    goto :goto_0
.end method


# virtual methods
.method public a(IIII)V
    .locals 1

    invoke-virtual {p0}, Lcom/nightonke/boommenu/a/g;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v0, :cond_0

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput p3, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iput p4, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/a/g;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/util/ArrayList;IJJJJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;IJJJJ)V"
        }
    .end annotation

    int-to-float v0, p2

    iget v1, p0, Lcom/nightonke/boommenu/a/g;->r:I

    int-to-float v1, v1

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr v1, v2

    sub-float v3, v0, v1

    int-to-double v0, p2

    iget v2, p0, Lcom/nightonke/boommenu/a/g;->r:I

    int-to-double v4, v2

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x4010000000000000L    # 4.0

    div-double/2addr v4, v6

    sub-double/2addr v0, v4

    double-to-float v0, v0

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-static {v1}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v1

    int-to-float v1, v1

    add-float v4, v0, v1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    const/4 v2, 0x0

    iget-object v1, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v7, v0, Landroid/graphics/Point;->x:I

    int-to-float v7, v7

    iget v8, v0, Landroid/graphics/Point;->y:I

    int-to-float v8, v8

    invoke-virtual {v1, v7, v8}, Landroid/graphics/PointF;->equals(FF)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2, v0}, Landroid/graphics/PointF;-><init>(Landroid/graphics/Point;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    invoke-virtual {v0, v3, v4}, Landroid/graphics/PointF;->offset(FF)V

    goto :goto_2

    :cond_3
    const/4 v0, 0x3

    new-array v1, v0, [I

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v0, 0x0

    :goto_3
    if-ge v0, v2, :cond_4

    rem-int/lit8 v3, v0, 0x3

    aget v4, v1, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    aget v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    int-to-long v2, v0

    mul-long/2addr v2, p5

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->a:J

    const/4 v0, 0x0

    aget v0, v1, v0

    int-to-long v2, v0

    mul-long/2addr v2, p5

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->b:J

    const/4 v0, 0x0

    aget v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x1

    aget v2, v1, v2

    add-int/2addr v0, v2

    int-to-long v2, v0

    mul-long/2addr v2, p5

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->c:J

    const/4 v0, 0x0

    aget v0, v1, v0

    const/4 v2, 0x1

    aget v2, v1, v2

    add-int/2addr v0, v2

    int-to-long v2, v0

    mul-long/2addr v2, p5

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->d:J

    const/4 v0, 0x2

    aget v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x1

    aget v2, v1, v2

    add-int/2addr v0, v2

    const/4 v2, 0x0

    aget v2, v1, v2

    add-int/2addr v0, v2

    int-to-long v2, v0

    mul-long/2addr v2, p5

    add-long/2addr v2, p3

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->e:J

    iget-wide v2, p0, Lcom/nightonke/boommenu/a/g;->e:J

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->f:J

    const/4 v0, 0x2

    aget v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    int-to-long v2, v0

    mul-long v2, v2, p9

    add-long v2, v2, p7

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->g:J

    const/4 v0, 0x2

    aget v0, v1, v0

    int-to-long v2, v0

    mul-long v2, v2, p9

    add-long v2, v2, p7

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->h:J

    const/4 v0, 0x2

    aget v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x1

    aget v2, v1, v2

    add-int/2addr v0, v2

    int-to-long v2, v0

    mul-long v2, v2, p9

    add-long v2, v2, p7

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->i:J

    const/4 v0, 0x2

    aget v0, v1, v0

    const/4 v2, 0x1

    aget v2, v1, v2

    add-int/2addr v0, v2

    int-to-long v2, v0

    mul-long v2, v2, p9

    add-long v2, v2, p7

    iput-wide v2, p0, Lcom/nightonke/boommenu/a/g;->j:J

    const/4 v0, 0x2

    aget v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x1

    aget v2, v1, v2

    add-int/2addr v0, v2

    const/4 v2, 0x0

    aget v1, v1, v2

    add-int/2addr v0, v1

    int-to-long v0, v0

    mul-long v0, v0, p9

    add-long v0, v0, p7

    iput-wide v0, p0, Lcom/nightonke/boommenu/a/g;->k:J

    iget-wide v0, p0, Lcom/nightonke/boommenu/a/g;->k:J

    iput-wide v0, p0, Lcom/nightonke/boommenu/a/g;->l:J

    return-void

    :cond_5
    move v1, v2

    goto/16 :goto_1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    const/4 v4, 0x0

    const/4 v7, 0x2

    const/4 v6, 0x1

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v2, v0, Landroid/graphics/PointF;->y:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v3, v0, Landroid/graphics/PointF;->x:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    sub-float v0, v3, v0

    iget v3, p0, Lcom/nightonke/boommenu/a/g;->m:F

    mul-float/2addr v3, v0

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    add-float/2addr v3, v0

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v4, v0, Landroid/graphics/PointF;->y:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    sub-float v0, v4, v0

    iget v4, p0, Lcom/nightonke/boommenu/a/g;->m:F

    mul-float/2addr v4, v0

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    add-float/2addr v4, v0

    iget-object v5, p0, Lcom/nightonke/boommenu/a/g;->s:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->s:Landroid/graphics/Paint;

    iget v1, p0, Lcom/nightonke/boommenu/a/g;->q:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v2, v0, Landroid/graphics/PointF;->y:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v3, v0, Landroid/graphics/PointF;->x:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    sub-float v0, v3, v0

    iget v3, p0, Lcom/nightonke/boommenu/a/g;->n:F

    mul-float/2addr v3, v0

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    add-float/2addr v3, v0

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v4, v0, Landroid/graphics/PointF;->y:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    sub-float v0, v4, v0

    iget v4, p0, Lcom/nightonke/boommenu/a/g;->n:F

    mul-float/2addr v4, v0

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    add-float/2addr v4, v0

    iget-object v5, p0, Lcom/nightonke/boommenu/a/g;->s:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public setLine1Color(I)V
    .locals 1

    iput p1, p0, Lcom/nightonke/boommenu/a/g;->p:I

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->s:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setLine2Color(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/a/g;->q:I

    return-void
.end method

.method public setLineWidth(I)V
    .locals 2

    iput p1, p0, Lcom/nightonke/boommenu/a/g;->r:I

    iget-object v0, p0, Lcom/nightonke/boommenu/a/g;->s:Landroid/graphics/Paint;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method
