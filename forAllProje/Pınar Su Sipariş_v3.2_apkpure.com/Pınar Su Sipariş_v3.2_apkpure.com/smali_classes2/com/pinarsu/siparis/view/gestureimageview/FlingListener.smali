.class public Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "FlingListener.java"


# instance fields
.field private velocityX:F

.field private velocityY:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public getVelocityX()F
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;->velocityX:F

    return v0
.end method

.method public getVelocityY()F
    .locals 1

    .prologue
    .line 43
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;->velocityY:F

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 33
    iput p3, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;->velocityX:F

    .line 34
    iput p4, p0, Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;->velocityY:F

    .line 35
    const/4 v0, 0x1

    return v0
.end method
