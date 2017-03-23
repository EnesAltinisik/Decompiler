.class public Lcom/pinarsu/siparis/view/gestureimageview/MathUtils;
.super Ljava/lang/Object;
.source "MathUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static angle(FFFF)F
    .locals 4

    .prologue
    .line 73
    sub-float v0, p3, p1

    float-to-double v0, v0

    sub-float v2, p2, p0

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public static angle(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 4

    .prologue
    .line 69
    iget v0, p0, Landroid/graphics/PointF;->x:F

    iget v1, p0, Landroid/graphics/PointF;->y:F

    iget v2, p1, Landroid/graphics/PointF;->x:F

    iget v3, p1, Landroid/graphics/PointF;->y:F

    invoke-static {v0, v1, v2, v3}, Lcom/pinarsu/siparis/view/gestureimageview/MathUtils;->angle(FFFF)F

    move-result v0

    return v0
.end method

.method public static distance(FFFF)F
    .locals 2

    .prologue
    .line 36
    sub-float v0, p0, p2

    .line 37
    sub-float v1, p1, p3

    .line 38
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public static distance(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 3

    .prologue
    .line 30
    iget v0, p0, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    .line 31
    iget v1, p0, Landroid/graphics/PointF;->y:F

    iget v2, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    .line 32
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public static distance(Landroid/view/MotionEvent;)F
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 24
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    sub-float/2addr v0, v1

    .line 25
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    sub-float/2addr v1, v2

    .line 26
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public static midpoint(FFFFLandroid/graphics/PointF;)V
    .locals 2

    .prologue
    const/high16 v1, 0x40000000    # 2.0f

    .line 50
    add-float v0, p0, p2

    div-float/2addr v0, v1

    iput v0, p4, Landroid/graphics/PointF;->x:F

    .line 51
    add-float v0, p1, p3

    div-float/2addr v0, v1

    iput v0, p4, Landroid/graphics/PointF;->y:F

    .line 52
    return-void
.end method

.method public static midpoint(Landroid/view/MotionEvent;Landroid/graphics/PointF;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 42
    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    .line 43
    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    .line 44
    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    .line 45
    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    .line 46
    invoke-static {v0, v1, v2, v3, p1}, Lcom/pinarsu/siparis/view/gestureimageview/MathUtils;->midpoint(FFFFLandroid/graphics/PointF;)V

    .line 47
    return-void
.end method


# virtual methods
.method public rotate(Landroid/graphics/PointF;Landroid/graphics/PointF;F)V
    .locals 8

    .prologue
    .line 60
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 61
    iget v1, p1, Landroid/graphics/PointF;->y:F

    .line 62
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 63
    iget v3, p2, Landroid/graphics/PointF;->y:F

    .line 64
    float-to-double v4, p3

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float v4, v4

    sub-float v5, v0, v2

    mul-float/2addr v4, v5

    float-to-double v6, p3

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v5, v6

    sub-float v6, v1, v3

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    add-float/2addr v4, v2

    iput v4, p1, Landroid/graphics/PointF;->x:F

    .line 65
    float-to-double v4, p3

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    sub-float/2addr v0, v2

    mul-float/2addr v0, v4

    float-to-double v4, p3

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float v2, v4

    sub-float/2addr v1, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    add-float/2addr v0, v3

    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 66
    return-void
.end method
