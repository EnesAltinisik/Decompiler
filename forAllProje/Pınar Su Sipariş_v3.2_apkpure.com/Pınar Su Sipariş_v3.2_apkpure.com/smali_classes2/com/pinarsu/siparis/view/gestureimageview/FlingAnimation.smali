.class public Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;
.super Ljava/lang/Object;
.source "FlingAnimation.java"

# interfaces
.implements Lcom/pinarsu/siparis/view/gestureimageview/Animation;


# instance fields
.field private factor:F

.field private listener:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;

.field private threshold:F

.field private velocityX:F

.field private velocityY:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const v0, 0x3f733333    # 0.95f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->factor:F

    .line 29
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->threshold:F

    return-void
.end method


# virtual methods
.method public setFactor(F)V
    .locals 0

    .prologue
    .line 68
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->factor:F

    .line 69
    return-void
.end method

.method public setListener(Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->listener:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;

    .line 73
    return-void
.end method

.method public setVelocityX(F)V
    .locals 0

    .prologue
    .line 60
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityX:F

    .line 61
    return-void
.end method

.method public setVelocityY(F)V
    .locals 0

    .prologue
    .line 64
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityY:F

    .line 65
    return-void
.end method

.method public update(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;J)Z
    .locals 4

    .prologue
    .line 38
    long-to-float v0, p2

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    .line 40
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityX:F

    mul-float/2addr v1, v0

    .line 41
    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityY:F

    mul-float/2addr v2, v0

    .line 43
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityX:F

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->factor:F

    mul-float/2addr v0, v3

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityX:F

    .line 44
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityY:F

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->factor:F

    mul-float/2addr v0, v3

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityY:F

    .line 46
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityX:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->threshold:F

    cmpl-float v0, v0, v3

    if-lez v0, :cond_1

    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->velocityY:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->threshold:F

    cmpl-float v0, v0, v3

    if-lez v0, :cond_1

    const/4 v0, 0x1

    .line 48
    :goto_0
    iget-object v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->listener:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;

    if-eqz v3, :cond_0

    .line 49
    iget-object v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->listener:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;

    invoke-interface {v3, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;->onMove(FF)V

    .line 51
    if-nez v0, :cond_0

    .line 52
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->listener:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;

    invoke-interface {v1}, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;->onComplete()V

    .line 56
    :cond_0
    return v0

    .line 46
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
