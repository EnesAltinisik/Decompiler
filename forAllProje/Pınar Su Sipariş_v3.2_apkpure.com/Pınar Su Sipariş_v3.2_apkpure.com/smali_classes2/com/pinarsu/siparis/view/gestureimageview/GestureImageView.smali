.class public Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;
.super Landroid/widget/ImageView;
.source "GestureImageView.java"


# static fields
.field public static final GLOBAL_NS:Ljava/lang/String; = "http://schemas.android.com/apk/res/android"

.field public static final LOCAL_NS:Ljava/lang/String; = "http://schemas.polites.com/android"


# instance fields
.field private alpha:I

.field private animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

.field private centerX:F

.field private centerY:F

.field private colorFilter:Landroid/graphics/ColorFilter;

.field private customOnTouchListener:Landroid/view/View$OnTouchListener;

.field private deviceOrientation:I

.field private displayHeight:I

.field private displayWidth:I

.field private final drawLock:Ljava/util/concurrent/Semaphore;

.field private drawable:Landroid/graphics/drawable/Drawable;

.field private fitScaleHorizontal:F

.field private fitScaleVertical:F

.field private gestureImageViewListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

.field private gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

.field private hHeight:I

.field private hWidth:I

.field private imageOrientation:I

.field private layout:Z

.field private maxScale:F

.field private minScale:F

.field private onClickListener:Landroid/view/View$OnClickListener;

.field private recycle:Z

.field private resId:I

.field private rotation:F

.field private scale:F

.field private scaleAdjust:F

.field private startX:Ljava/lang/Float;

.field private startY:Ljava/lang/Float;

.field private startingScale:F

.field private strict:Z

.field private x:F

.field private y:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 115
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 35
    new-instance v0, Ljava/util/concurrent/Semaphore;

    invoke-direct {v0, v2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawLock:Ljava/util/concurrent/Semaphore;

    .line 40
    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    .line 42
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->layout:Z

    .line 44
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scaleAdjust:F

    .line 45
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    .line 47
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scale:F

    .line 48
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->maxScale:F

    .line 49
    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->minScale:F

    .line 50
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleHorizontal:F

    .line 51
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleVertical:F

    .line 52
    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->rotation:F

    .line 62
    iput v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->resId:I

    .line 63
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle:Z

    .line 64
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    .line 69
    const/16 v0, 0xff

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->alpha:I

    .line 72
    iput v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->deviceOrientation:I

    .line 116
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 117
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->initImage()V

    .line 118
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 86
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    new-instance v0, Ljava/util/concurrent/Semaphore;

    invoke-direct {v0, v2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawLock:Ljava/util/concurrent/Semaphore;

    .line 40
    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    .line 42
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->layout:Z

    .line 44
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scaleAdjust:F

    .line 45
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    .line 47
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scale:F

    .line 48
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->maxScale:F

    .line 49
    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->minScale:F

    .line 50
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleHorizontal:F

    .line 51
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleVertical:F

    .line 52
    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->rotation:F

    .line 62
    iput v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->resId:I

    .line 63
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle:Z

    .line 64
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    .line 69
    const/16 v0, 0xff

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->alpha:I

    .line 72
    iput v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->deviceOrientation:I

    .line 88
    const-string v0, "http://schemas.android.com/apk/res/android"

    const-string v1, "scaleType"

    invoke-interface {p2, v0, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 91
    :cond_0
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 94
    :cond_1
    const-string v0, "http://schemas.polites.com/android"

    const-string v1, "start-x"

    invoke-interface {p2, v0, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 95
    const-string v1, "http://schemas.polites.com/android"

    const-string v2, "start-y"

    invoke-interface {p2, v1, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 97
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    .line 98
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startX:Ljava/lang/Float;

    .line 101
    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 102
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startY:Ljava/lang/Float;

    .line 105
    :cond_3
    const-string v0, "http://schemas.polites.com/android"

    const-string v1, "start-scale"

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeFloatValue(Ljava/lang/String;Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setStartingScale(F)V

    .line 106
    const-string v0, "http://schemas.polites.com/android"

    const-string v1, "min-scale"

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->minScale:F

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeFloatValue(Ljava/lang/String;Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setMinScale(F)V

    .line 107
    const-string v0, "http://schemas.polites.com/android"

    const-string v1, "max-scale"

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->maxScale:F

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeFloatValue(Ljava/lang/String;Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setMaxScale(F)V

    .line 108
    const-string v0, "http://schemas.polites.com/android"

    const-string v1, "strict"

    iget-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setStrict(Z)V

    .line 109
    const-string v0, "http://schemas.polites.com/android"

    const-string v1, "recycle"

    iget-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle:Z

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setRecycle(Z)V

    .line 111
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->initImage()V

    .line 112
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1, p2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 83
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->customOnTouchListener:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    return-object v0
.end method


# virtual methods
.method public animationStart(Lcom/pinarsu/siparis/view/gestureimageview/Animation;)V
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    invoke-virtual {v0, p1}, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->play(Lcom/pinarsu/siparis/view/gestureimageview/Animation;)V

    .line 336
    :cond_0
    return-void
.end method

.method public animationStop()V
    .locals 1

    .prologue
    .line 339
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->cancel()V

    .line 342
    :cond_0
    return-void
.end method

.method protected computeCropScale(IIII)V
    .locals 2

    .prologue
    .line 233
    int-to-float v0, p3

    int-to-float v1, p1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleHorizontal:F

    .line 234
    int-to-float v0, p4

    int-to-float v1, p2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleVertical:F

    .line 235
    return-void
.end method

.method protected computeStartingScale(IIII)V
    .locals 3

    .prologue
    .line 238
    sget-object v0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView$2;->$SwitchMap$android$widget$ImageView$ScaleType:[I

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 265
    :goto_0
    return-void

    .line 241
    :pswitch_0
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    goto :goto_0

    .line 247
    :pswitch_1
    int-to-float v0, p4

    int-to-float v1, p2

    div-float/2addr v0, v1

    int-to-float v1, p3

    int-to-float v2, p1

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    goto :goto_0

    .line 254
    :pswitch_2
    int-to-float v0, p1

    int-to-float v1, p3

    div-float/2addr v0, v1

    .line 255
    int-to-float v1, p2

    int-to-float v2, p4

    div-float/2addr v1, v2

    .line 257
    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 258
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleHorizontal:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    goto :goto_0

    .line 260
    :cond_0
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleVertical:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    goto :goto_0

    .line 238
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public getCenterX()F
    .locals 1

    .prologue
    .line 647
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->centerX:F

    return v0
.end method

.method public getCenterY()F
    .locals 1

    .prologue
    .line 651
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->centerY:F

    return v0
.end method

.method public getDeviceOrientation()I
    .locals 1

    .prologue
    .line 695
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->deviceOrientation:I

    return v0
.end method

.method public getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 498
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getGestureImageViewListener()Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;
    .locals 1

    .prologue
    .line 493
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    return-object v0
.end method

.method public getImageHeight()I
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    .line 411
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getImageMatrix()Landroid/graphics/Matrix;
    .locals 2

    .prologue
    .line 569
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_0

    .line 570
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 572
    :cond_0
    invoke-super {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public getImageWidth()I
    .locals 1

    .prologue
    .line 401
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 402
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 404
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getImageX()F
    .locals 1

    .prologue
    .line 451
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    return v0
.end method

.method public getImageY()F
    .locals 1

    .prologue
    .line 455
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    return v0
.end method

.method public getScale()F
    .locals 1

    .prologue
    .line 447
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scaleAdjust:F

    return v0
.end method

.method public getScaledHeight()I
    .locals 2

    .prologue
    .line 397
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScale()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public getScaledWidth()I
    .locals 2

    .prologue
    .line 393
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScale()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method protected initImage()V
    .locals 2

    .prologue
    .line 357
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->alpha:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 359
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 360
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->colorFilter:Landroid/graphics/ColorFilter;

    if-eqz v0, :cond_0

    .line 361
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->colorFilter:Landroid/graphics/ColorFilter;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 365
    :cond_0
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->layout:Z

    if-nez v0, :cond_1

    .line 366
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->requestLayout()V

    .line 367
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->redraw()V

    .line 369
    :cond_1
    return-void
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 589
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_0

    .line 590
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 592
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 593
    return-void
.end method

.method public isLandscape()Z
    .locals 2

    .prologue
    .line 655
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageHeight()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isOrientationAligned()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 686
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->deviceOrientation:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 687
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->isLandscape()Z

    move-result v0

    .line 691
    :cond_0
    :goto_0
    return v0

    .line 688
    :cond_1
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->deviceOrientation:I

    if-ne v1, v0, :cond_0

    .line 689
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->isPortrait()Z

    move-result v0

    goto :goto_0
.end method

.method public isPortrait()Z
    .locals 2

    .prologue
    .line 659
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageHeight()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isRecycle()Z
    .locals 1

    .prologue
    .line 467
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle:Z

    return v0
.end method

.method protected isRecycled()Z
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 270
    if-eqz v0, :cond_0

    .line 271
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    .line 274
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isStrict()Z
    .locals 1

    .prologue
    .line 459
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    return v0
.end method

.method public moveBy(FF)V
    .locals 1

    .prologue
    .line 415
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    .line 416
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    add-float/2addr v0, p2

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    .line 417
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 322
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    const-string v1, "GestureImageViewAnimator"

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/Animator;-><init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    .line 323
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->start()V

    .line 325
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->resId:I

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 326
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->resId:I

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setImageResource(I)V

    .line 329
    :cond_0
    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    .line 330
    return-void
.end method

.method public onCreateDrawableState(I)[I
    .locals 2

    .prologue
    .line 597
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_0

    .line 598
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 600
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onCreateDrawableState(I)[I

    move-result-object v0

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animator:Lcom/pinarsu/siparis/view/gestureimageview/Animator;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->finish()V

    .line 349
    :cond_0
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 350
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle()V

    .line 351
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    .line 353
    :cond_1
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 354
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 288
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->layout:Z

    if-eqz v0, :cond_3

    .line 289
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 290
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 292
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scale:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scaleAdjust:F

    mul-float/2addr v0, v1

    .line 294
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 296
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->rotation:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_0

    .line 297
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->rotation:F

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->rotate(F)V

    .line 300
    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_1

    .line 301
    invoke-virtual {p1, v0, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 304
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 306
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 309
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawLock:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    if-gtz v0, :cond_3

    .line 310
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawLock:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 313
    :cond_3
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 153
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 154
    if-nez p1, :cond_0

    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->layout:Z

    if-nez v0, :cond_1

    .line 155
    :cond_0
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayWidth:I

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayHeight:I

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setupCanvas(III)V

    .line 157
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    const/4 v2, -0x2

    .line 123
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    .line 124
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 125
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 126
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayHeight:I

    .line 128
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne v0, v2, :cond_0

    .line 129
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 130
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayHeight:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayWidth:I

    .line 148
    :goto_0
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayWidth:I

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayHeight:I

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setMeasuredDimension(II)V

    .line 149
    return-void

    .line 132
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayWidth:I

    goto :goto_0

    .line 135
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayWidth:I

    .line 136
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v0, v2, :cond_2

    .line 137
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 138
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayWidth:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayHeight:I

    goto :goto_0

    .line 140
    :cond_2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayHeight:I

    goto :goto_0

    .line 144
    :cond_3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayHeight:I

    .line 145
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->displayWidth:I

    goto :goto_0
.end method

.method protected recycle()V
    .locals 1

    .prologue
    .line 278
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 280
    if-eqz v0, :cond_0

    .line 281
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 284
    :cond_0
    return-void
.end method

.method public redraw()V
    .locals 0

    .prologue
    .line 425
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->postInvalidate()V

    .line 426
    return-void
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 475
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->centerX:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    .line 476
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->centerY:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    .line 477
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scaleAdjust:F

    .line 478
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    if-eqz v0, :cond_0

    .line 479
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->reset()V

    .line 481
    :cond_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->redraw()V

    .line 482
    return-void
.end method

.method public setAdjustViewBounds(Z)V
    .locals 2

    .prologue
    .line 605
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_0

    .line 606
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 608
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 609
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .prologue
    .line 503
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->alpha:I

    .line 504
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 505
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 507
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .prologue
    .line 511
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->colorFilter:Landroid/graphics/ColorFilter;

    .line 512
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 513
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 515
    :cond_0
    return-void
.end method

.method public setGestureImageViewListener(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;)V
    .locals 0

    .prologue
    .line 489
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    .line 490
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 372
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    .line 373
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->initImage()V

    .line 374
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 378
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    .line 379
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->initImage()V

    .line 380
    return-void
.end method

.method public setImageLevel(I)V
    .locals 2

    .prologue
    .line 613
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_0

    .line 614
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 616
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 617
    return-void
.end method

.method public setImageMatrix(Landroid/graphics/Matrix;)V
    .locals 2

    .prologue
    .line 621
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_0

    .line 622
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 624
    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .prologue
    .line 383
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 384
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle()V

    .line 386
    :cond_0
    if-ltz p1, :cond_1

    .line 387
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->resId:I

    .line 388
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 390
    :cond_1
    return-void
.end method

.method public setImageState([IZ)V
    .locals 2

    .prologue
    .line 628
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_0

    .line 629
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 631
    :cond_0
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 9

    .prologue
    const/4 v6, 0x0

    .line 519
    const-string v0, "content"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 521
    const/4 v0, 0x1

    :try_start_0
    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "orientation"

    aput-object v1, v2, v0

    .line 523
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 525
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 526
    const/4 v0, 0x0

    aget-object v0, v2, v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->imageOrientation:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 532
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v7

    .line 533
    :try_start_2
    invoke-static {v7}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 535
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->imageOrientation:I

    if-eqz v1, :cond_4

    .line 536
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 537
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->imageOrientation:I

    int-to-float v1, v1

    invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 538
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 539
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 540
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 545
    :goto_0
    if-eqz v7, :cond_1

    .line 546
    :try_start_3
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V

    .line 549
    :cond_1
    if-eqz v8, :cond_2

    .line 550
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 560
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_3

    .line 561
    const-string v0, "GestureImageView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resolveUri failed on bad bitmap uri: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 565
    :cond_3
    return-void

    .line 542
    :cond_4
    :try_start_4
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 545
    :catchall_0
    move-exception v0

    move-object v1, v7

    :goto_2
    if-eqz v1, :cond_5

    .line 546
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 549
    :cond_5
    if-eqz v8, :cond_6

    .line 550
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_6
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 553
    :catch_0
    move-exception v0

    .line 554
    const-string v1, "GestureImageView"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to open content: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 557
    :cond_7
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/drawable/Drawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 545
    :catchall_1
    move-exception v0

    move-object v1, v6

    goto :goto_2
.end method

.method public setMaxScale(F)V
    .locals 2

    .prologue
    .line 436
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->maxScale:F

    .line 437
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    if-eqz v0, :cond_0

    .line 438
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    mul-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setMaxScale(F)V

    .line 440
    :cond_0
    return-void
.end method

.method public setMinScale(F)V
    .locals 2

    .prologue
    .line 429
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->minScale:F

    .line 430
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleHorizontal:F

    mul-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setMinScale(F)V

    .line 433
    :cond_0
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 673
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->onClickListener:Landroid/view/View$OnClickListener;

    .line 675
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    if-eqz v0, :cond_0

    .line 676
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-virtual {v0, p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 678
    :cond_0
    return-void
.end method

.method public setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0

    .prologue
    .line 643
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->customOnTouchListener:Landroid/view/View$OnTouchListener;

    .line 644
    return-void
.end method

.method public setPosition(FF)V
    .locals 0

    .prologue
    .line 420
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    .line 421
    iput p2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    .line 422
    return-void
.end method

.method public setRecycle(Z)V
    .locals 0

    .prologue
    .line 471
    iput-boolean p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->recycle:Z

    .line 472
    return-void
.end method

.method public setRotation(F)V
    .locals 0

    .prologue
    .line 485
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->rotation:F

    .line 486
    return-void
.end method

.method public setScale(F)V
    .locals 0

    .prologue
    .line 443
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scaleAdjust:F

    .line 444
    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 2

    .prologue
    .line 577
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    if-eq p1, v0, :cond_0

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    if-eq p1, v0, :cond_0

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    if-ne p1, v0, :cond_2

    .line 581
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 585
    :cond_1
    return-void

    .line 582
    :cond_2
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_1

    .line 583
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setSelected(Z)V
    .locals 2

    .prologue
    .line 635
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    if-eqz v0, :cond_0

    .line 636
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 638
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 639
    return-void
.end method

.method public setStartingPosition(FF)V
    .locals 1

    .prologue
    .line 667
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startX:Ljava/lang/Float;

    .line 668
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startY:Ljava/lang/Float;

    .line 669
    return-void
.end method

.method public setStartingScale(F)V
    .locals 0

    .prologue
    .line 663
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    .line 664
    return-void
.end method

.method public setStrict(Z)V
    .locals 0

    .prologue
    .line 463
    iput-boolean p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->strict:Z

    .line 464
    return-void
.end method

.method protected setupCanvas(III)V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    .line 161
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->deviceOrientation:I

    if-eq v0, p3, :cond_0

    .line 162
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->layout:Z

    .line 163
    iput p3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->deviceOrientation:I

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->layout:Z

    if-nez v0, :cond_2

    .line 167
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageWidth()I

    move-result v0

    .line 168
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageHeight()I

    move-result v1

    .line 170
    int-to-float v2, v0

    div-float/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->hWidth:I

    .line 171
    int-to-float v2, v1

    div-float/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->hHeight:I

    .line 173
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    sub-int v2, p1, v2

    .line 174
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getPaddingBottom()I

    move-result v4

    add-int/2addr v3, v4

    sub-int v3, p2, v3

    .line 176
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->computeCropScale(IIII)V

    .line 178
    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_1

    .line 179
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->computeStartingScale(IIII)V

    .line 182
    :cond_1
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->scaleAdjust:F

    .line 184
    int-to-float v0, v2

    div-float/2addr v0, v6

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->centerX:F

    .line 185
    int-to-float v0, v3

    div-float/2addr v0, v6

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->centerY:F

    .line 187
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startX:Ljava/lang/Float;

    if-nez v0, :cond_3

    .line 188
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->centerX:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    .line 193
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startY:Ljava/lang/Float;

    if-nez v0, :cond_4

    .line 194
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->centerY:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    .line 199
    :goto_1
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-direct {v0, p0, v2, v3}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;-><init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;II)V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    .line 201
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->isLandscape()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 202
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->minScale:F

    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleHorizontal:F

    mul-float/2addr v1, v4

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setMinScale(F)V

    .line 208
    :goto_2
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->maxScale:F

    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startingScale:F

    mul-float/2addr v1, v4

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setMaxScale(F)V

    .line 210
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleHorizontal:F

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setFitScaleHorizontal(F)V

    .line 211
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleVertical:F

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setFitScaleVertical(F)V

    .line 212
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setCanvasWidth(I)V

    .line 213
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setCanvasHeight(I)V

    .line 214
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->onClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->hWidth:I

    neg-int v1, v1

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->hHeight:I

    neg-int v2, v2

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->hWidth:I

    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->hHeight:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 218
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView$1;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView$1;-><init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)V

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 228
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->layout:Z

    .line 230
    :cond_2
    return-void

    .line 190
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startX:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->x:F

    goto :goto_0

    .line 196
    :cond_4
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->startY:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->y:F

    goto :goto_1

    .line 204
    :cond_5
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->minScale:F

    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->fitScaleVertical:F

    mul-float/2addr v1, v4

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->setMinScale(F)V

    goto :goto_2
.end method

.method public waitForDraw(J)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 317
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->drawLock:Ljava/util/concurrent/Semaphore;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    return v0
.end method
