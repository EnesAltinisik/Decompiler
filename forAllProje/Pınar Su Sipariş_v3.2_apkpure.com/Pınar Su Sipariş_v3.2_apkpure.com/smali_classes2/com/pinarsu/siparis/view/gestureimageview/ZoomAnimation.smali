.class public Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;
.super Ljava/lang/Object;
.source "ZoomAnimation.java"

# interfaces
.implements Lcom/pinarsu/siparis/view/gestureimageview/Animation;


# instance fields
.field private animationLengthMS:J

.field private firstFrame:Z

.field private scaleDiff:F

.field private startScale:F

.field private startX:F

.field private startY:F

.field private totalTime:J

.field private touchX:F

.field private touchY:F

.field private xDiff:F

.field private yDiff:F

.field private zoom:F

.field private zoomAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->firstFrame:Z

    .line 42
    const-wide/16 v0, 0xc8

    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->animationLengthMS:J

    .line 43
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->totalTime:J

    return-void
.end method


# virtual methods
.method public getAnimationLengthMS()J
    .locals 2

    .prologue
    .line 153
    iget-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->animationLengthMS:J

    return-wide v0
.end method

.method public getTouchX()F
    .locals 1

    .prologue
    .line 137
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->touchX:F

    return v0
.end method

.method public getTouchY()F
    .locals 1

    .prologue
    .line 145
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->touchY:F

    return v0
.end method

.method public getZoom()F
    .locals 1

    .prologue
    .line 129
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoom:F

    return v0
.end method

.method public getZoomAnimationListener()Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoomAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;

    return-object v0
.end method

.method public reset()V
    .locals 2

    .prologue
    .line 124
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->firstFrame:Z

    .line 125
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->totalTime:J

    .line 126
    return-void
.end method

.method public setAnimationLengthMS(J)V
    .locals 1

    .prologue
    .line 157
    iput-wide p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->animationLengthMS:J

    .line 158
    return-void
.end method

.method public setTouchX(F)V
    .locals 0

    .prologue
    .line 141
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->touchX:F

    .line 142
    return-void
.end method

.method public setTouchY(F)V
    .locals 0

    .prologue
    .line 149
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->touchY:F

    .line 150
    return-void
.end method

.method public setZoom(F)V
    .locals 0

    .prologue
    .line 133
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoom:F

    .line 134
    return-void
.end method

.method public setZoomAnimationListener(Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoomAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;

    .line 166
    return-void
.end method

.method public update(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;J)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 52
    iget-boolean v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->firstFrame:Z

    if-eqz v1, :cond_0

    .line 53
    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->firstFrame:Z

    .line 55
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageX()F

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startX:F

    .line 56
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageY()F

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startY:F

    .line 57
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScale()F

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startScale:F

    .line 58
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoom:F

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startScale:F

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startScale:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->scaleDiff:F

    .line 60
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->scaleDiff:F

    cmpl-float v1, v1, v5

    if-lez v1, :cond_3

    .line 62
    new-instance v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    invoke-direct {v1}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;-><init>()V

    .line 65
    new-instance v2, Landroid/graphics/PointF;

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->touchX:F

    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->touchY:F

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->setStart(Landroid/graphics/PointF;)V

    .line 66
    new-instance v2, Landroid/graphics/PointF;

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startX:F

    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startY:F

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->setEnd(Landroid/graphics/PointF;)V

    .line 68
    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->calculateAngle()F

    .line 71
    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->calculateLength()F

    move-result v2

    .line 74
    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoom:F

    mul-float/2addr v2, v3

    iput v2, v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    .line 77
    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->calculateEndPoint()V

    .line 79
    iget-object v2, v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startX:F

    sub-float/2addr v2, v3

    iput v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->xDiff:F

    .line 80
    iget-object v1, v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startY:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->yDiff:F

    .line 89
    :cond_0
    :goto_0
    iget-wide v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->totalTime:J

    add-long/2addr v2, p2

    iput-wide v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->totalTime:J

    .line 91
    iget-wide v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->totalTime:J

    long-to-float v1, v2

    iget-wide v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->animationLengthMS:J

    long-to-float v2, v2

    div-float/2addr v1, v2

    .line 93
    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v2, v1, v2

    if-gez v2, :cond_4

    .line 95
    cmpl-float v0, v1, v5

    if-lez v0, :cond_1

    .line 97
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->scaleDiff:F

    mul-float/2addr v0, v1

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startScale:F

    add-float/2addr v0, v2

    .line 98
    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->xDiff:F

    mul-float/2addr v2, v1

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startX:F

    add-float/2addr v2, v3

    .line 99
    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->yDiff:F

    mul-float/2addr v1, v3

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startY:F

    add-float/2addr v1, v3

    .line 101
    iget-object v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoomAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;

    if-eqz v3, :cond_1

    .line 102
    iget-object v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoomAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;

    invoke-interface {v3, v0, v2, v1}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;->onZoom(FFF)V

    .line 106
    :cond_1
    const/4 v0, 0x1

    .line 119
    :cond_2
    :goto_1
    return v0

    .line 84
    :cond_3
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterX()F

    move-result v1

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startX:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->xDiff:F

    .line 85
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterY()F

    move-result v1

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startY:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->yDiff:F

    goto :goto_0

    .line 110
    :cond_4
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->scaleDiff:F

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startScale:F

    add-float/2addr v1, v2

    .line 111
    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->xDiff:F

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startX:F

    add-float/2addr v2, v3

    .line 112
    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->yDiff:F

    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->startY:F

    add-float/2addr v3, v4

    .line 114
    iget-object v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoomAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;

    if-eqz v4, :cond_2

    .line 115
    iget-object v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoomAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;

    invoke-interface {v4, v1, v2, v3}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;->onZoom(FFF)V

    .line 116
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->zoomAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;

    invoke-interface {v1}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;->onComplete()V

    goto :goto_1
.end method
