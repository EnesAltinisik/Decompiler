.class public Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;
.super Ljava/lang/Object;
.source "MoveAnimation.java"

# interfaces
.implements Lcom/pinarsu/siparis/view/gestureimageview/Animation;


# instance fields
.field private animationTimeMS:J

.field private firstFrame:Z

.field private moveAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;

.field private startX:F

.field private startY:F

.field private targetX:F

.field private targetY:F

.field private totalTime:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->firstFrame:Z

    .line 32
    const-wide/16 v0, 0x64

    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->animationTimeMS:J

    .line 33
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->totalTime:J

    return-void
.end method


# virtual methods
.method public getAnimationTimeMS()J
    .locals 2

    .prologue
    .line 97
    iget-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->animationTimeMS:J

    return-wide v0
.end method

.method public getTargetX()F
    .locals 1

    .prologue
    .line 79
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->targetX:F

    return v0
.end method

.method public getTargetY()F
    .locals 1

    .prologue
    .line 89
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->targetY:F

    return v0
.end method

.method public reset()V
    .locals 2

    .prologue
    .line 73
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->firstFrame:Z

    .line 74
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->totalTime:J

    .line 75
    return-void
.end method

.method public setAnimationTimeMS(J)V
    .locals 1

    .prologue
    .line 101
    iput-wide p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->animationTimeMS:J

    .line 102
    return-void
.end method

.method public setMoveAnimationListener(Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->moveAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;

    .line 106
    return-void
.end method

.method public setTargetX(F)V
    .locals 0

    .prologue
    .line 84
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->targetX:F

    .line 85
    return-void
.end method

.method public setTargetY(F)V
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->targetY:F

    .line 94
    return-void
.end method

.method public update(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;J)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 42
    iget-wide v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->totalTime:J

    add-long/2addr v2, p2

    iput-wide v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->totalTime:J

    .line 44
    iget-boolean v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->firstFrame:Z

    if-eqz v1, :cond_0

    .line 45
    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->firstFrame:Z

    .line 46
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageX()F

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->startX:F

    .line 47
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageY()F

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->startY:F

    .line 50
    :cond_0
    iget-wide v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->totalTime:J

    iget-wide v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->animationTimeMS:J

    cmp-long v1, v2, v4

    if-gez v1, :cond_3

    .line 52
    iget-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->totalTime:J

    long-to-float v0, v0

    iget-wide v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->animationTimeMS:J

    long-to-float v1, v2

    div-float/2addr v0, v1

    .line 54
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->targetX:F

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->startX:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, v0

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->startX:F

    add-float/2addr v1, v2

    .line 55
    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->targetY:F

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->startY:F

    sub-float/2addr v2, v3

    mul-float/2addr v0, v2

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->startY:F

    add-float/2addr v0, v2

    .line 57
    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->moveAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;

    if-eqz v2, :cond_1

    .line 58
    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->moveAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;

    invoke-interface {v2, v1, v0}, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;->onMove(FF)V

    .line 61
    :cond_1
    const/4 v0, 0x1

    .line 69
    :cond_2
    :goto_0
    return v0

    .line 64
    :cond_3
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->moveAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;

    if-eqz v1, :cond_2

    .line 65
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->moveAnimationListener:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->targetX:F

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->targetY:F

    invoke-interface {v1, v2, v3}, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;->onMove(FF)V

    goto :goto_0
.end method
