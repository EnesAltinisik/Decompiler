.class public Lcom/pinarsu/siparis/view/gestureimageview/VectorF;
.super Ljava/lang/Object;
.source "VectorF.java"


# instance fields
.field public angle:F

.field public final end:Landroid/graphics/PointF;

.field public length:F

.field public final start:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    .line 27
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    return-void
.end method


# virtual methods
.method public calculateAngle()F
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/MathUtils;->angle(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->angle:F

    .line 58
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->angle:F

    return v0
.end method

.method public calculateEndPoint()V
    .locals 4

    .prologue
    .line 30
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->angle:F

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v1, v2

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 31
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->angle:F

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v1, v2

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 32
    return-void
.end method

.method public calculateLength()F
    .locals 2

    .prologue
    .line 52
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/MathUtils;->distance(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    .line 53
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    return v0
.end method

.method public set(Landroid/view/MotionEvent;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 45
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 46
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 47
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 48
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 49
    return-void
.end method

.method public setEnd(Landroid/graphics/PointF;)V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 41
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    iget v1, p1, Landroid/graphics/PointF;->y:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 42
    return-void
.end method

.method public setStart(Landroid/graphics/PointF;)V
    .locals 2

    .prologue
    .line 35
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 36
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->start:Landroid/graphics/PointF;

    iget v1, p1, Landroid/graphics/PointF;->y:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 37
    return-void
.end method
