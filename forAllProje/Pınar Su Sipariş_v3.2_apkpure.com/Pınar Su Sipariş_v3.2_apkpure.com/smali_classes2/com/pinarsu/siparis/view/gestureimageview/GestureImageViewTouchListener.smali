.class public Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;
.super Ljava/lang/Object;
.source "GestureImageViewTouchListener.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private boundaryBottom:F

.field private boundaryLeft:F

.field private boundaryRight:F

.field private boundaryTop:F

.field private canDragX:Z

.field private canDragY:Z

.field private canvasHeight:I

.field private canvasWidth:I

.field private centerX:F

.field private centerY:F

.field private final current:Landroid/graphics/PointF;

.field private currentScale:F

.field private displayHeight:I

.field private displayWidth:I

.field private fitScaleHorizontal:F

.field private fitScaleVertical:F

.field private flingAnimation:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;

.field private flingDetector:Landroid/view/GestureDetector;

.field private flingListener:Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;

.field private image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

.field private imageHeight:I

.field private imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

.field private imageWidth:I

.field private inZoom:Z

.field private initialDistance:F

.field private final last:Landroid/graphics/PointF;

.field private lastScale:F

.field private maxScale:F

.field private final midpoint:Landroid/graphics/PointF;

.field private minScale:F

.field private moveAnimation:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;

.field private multiTouch:Z

.field private final next:Landroid/graphics/PointF;

.field private onClickListener:Landroid/view/View$OnClickListener;

.field private final pinchVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

.field private final scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

.field private startingScale:F

.field private tapDetector:Landroid/view/GestureDetector;

.field private touched:Z

.field private zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;


# direct methods
.method public constructor <init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;II)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;

    .line 33
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    .line 34
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    .line 35
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->midpoint:Landroid/graphics/PointF;

    .line 37
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    invoke-direct {v0}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    .line 38
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    invoke-direct {v0}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->pinchVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    .line 40
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->touched:Z

    .line 41
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->inZoom:Z

    .line 44
    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->lastScale:F

    .line 45
    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    .line 47
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryLeft:F

    .line 48
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryTop:F

    .line 49
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryRight:F

    .line 50
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryBottom:F

    .line 52
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->maxScale:F

    .line 53
    const/high16 v0, 0x3e800000    # 0.25f

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->minScale:F

    .line 54
    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleHorizontal:F

    .line 55
    iput v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleVertical:F

    .line 57
    iput v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasWidth:I

    .line 58
    iput v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasHeight:I

    .line 60
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerX:F

    .line 61
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerY:F

    .line 63
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->startingScale:F

    .line 65
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragX:Z

    .line 66
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragY:Z

    .line 68
    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->multiTouch:Z

    .line 87
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    .line 89
    iput p2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->displayWidth:I

    .line 90
    iput p3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->displayHeight:I

    .line 92
    int-to-float v0, p2

    div-float/2addr v0, v4

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerX:F

    .line 93
    int-to-float v0, p3

    div-float/2addr v0, v4

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerY:F

    .line 95
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageWidth()I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageWidth:I

    .line 96
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageHeight()I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageHeight:I

    .line 98
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScale()F

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->startingScale:F

    .line 100
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->startingScale:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    .line 101
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->startingScale:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->lastScale:F

    .line 103
    int-to-float v0, p2

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryRight:F

    .line 104
    int-to-float v0, p3

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryBottom:F

    .line 105
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryLeft:F

    .line 106
    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryTop:F

    .line 108
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageX()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 109
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageY()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 111
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;

    invoke-direct {v0}, Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingListener:Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;

    .line 112
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;

    invoke-direct {v0}, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingAnimation:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;

    .line 113
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-direct {v0}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    .line 114
    new-instance v0, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;

    invoke-direct {v0}, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->moveAnimation:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;

    .line 116
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingAnimation:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;

    new-instance v1, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$1;-><init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->setListener(Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;)V

    .line 126
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {v0, v4}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setZoom(F)V

    .line 127
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    new-instance v1, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;-><init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setZoomAnimationListener(Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;)V

    .line 142
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->moveAnimation:Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;

    new-instance v1, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$3;

    invoke-direct {v1, p0, p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$3;-><init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimation;->setMoveAnimationListener(Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;)V

    .line 151
    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;

    invoke-direct {v2, p0, p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;-><init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)V

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->tapDetector:Landroid/view/GestureDetector;

    .line 171
    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingListener:Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingDetector:Landroid/view/GestureDetector;

    .line 172
    invoke-virtual {p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getGestureImageViewListener()Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    .line 174
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->calculateBoundaries()V

    .line 175
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;

    return-object v0
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->maxScale:F

    return v0
.end method

.method static synthetic access$200(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->minScale:F

    return v0
.end method

.method static synthetic access$300(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->inZoom:Z

    return v0
.end method

.method static synthetic access$302(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;Z)Z
    .locals 0

    .prologue
    .line 27
    iput-boolean p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->inZoom:Z

    return p1
.end method

.method static synthetic access$400(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->startZoom(Landroid/view/MotionEvent;)V

    return-void
.end method

.method static synthetic access$500(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)Landroid/view/View$OnClickListener;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->onClickListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private startFling()V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingAnimation:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingListener:Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;

    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;->getVelocityX()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->setVelocityX(F)V

    .line 179
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingAnimation:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingListener:Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;

    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/gestureimageview/FlingListener;->getVelocityY()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;->setVelocityY(F)V

    .line 180
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingAnimation:Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimation;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animationStart(Lcom/pinarsu/siparis/view/gestureimageview/Animation;)V

    .line 181
    return-void
.end method

.method private startZoom(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    const/high16 v2, 0x40800000    # 4.0f

    const/4 v1, 0x1

    .line 184
    iput-boolean v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->inZoom:Z

    .line 185
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->reset()V

    .line 189
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->isLandscape()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 190
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getDeviceOrientation()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 191
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScaledHeight()I

    move-result v0

    .line 193
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasHeight:I

    if-ge v0, v1, :cond_0

    .line 194
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleVertical:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    div-float/2addr v0, v1

    .line 195
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 196
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    .line 261
    :goto_0
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setZoom(F)V

    .line 262
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animationStart(Lcom/pinarsu/siparis/view/gestureimageview/Animation;)V

    .line 263
    return-void

    .line 199
    :cond_0
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleHorizontal:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    div-float/2addr v0, v1

    .line 200
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 201
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto :goto_0

    .line 205
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScaledWidth()I

    move-result v0

    .line 207
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasWidth:I

    if-ne v0, v1, :cond_2

    .line 208
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    mul-float/2addr v0, v2

    .line 209
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 210
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto :goto_0

    .line 212
    :cond_2
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasWidth:I

    if-ge v0, v1, :cond_3

    .line 213
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleHorizontal:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    div-float/2addr v0, v1

    .line 214
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 215
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto :goto_0

    .line 218
    :cond_3
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleHorizontal:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    div-float/2addr v0, v1

    .line 219
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 220
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto/16 :goto_0

    .line 225
    :cond_4
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getDeviceOrientation()I

    move-result v0

    if-ne v0, v1, :cond_7

    .line 227
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScaledHeight()I

    move-result v0

    .line 229
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasHeight:I

    if-ne v0, v1, :cond_5

    .line 230
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    mul-float/2addr v0, v2

    .line 231
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 232
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto/16 :goto_0

    .line 234
    :cond_5
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasHeight:I

    if-ge v0, v1, :cond_6

    .line 235
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleVertical:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    div-float/2addr v0, v1

    .line 236
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 237
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto/16 :goto_0

    .line 240
    :cond_6
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleVertical:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    div-float/2addr v0, v1

    .line 241
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 242
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto/16 :goto_0

    .line 246
    :cond_7
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getScaledWidth()I

    move-result v0

    .line 248
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasWidth:I

    if-ge v0, v1, :cond_8

    .line 249
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleHorizontal:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    div-float/2addr v0, v1

    .line 250
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 251
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto/16 :goto_0

    .line 254
    :cond_8
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleVertical:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    div-float/2addr v0, v1

    .line 255
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterX()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchX(F)V

    .line 256
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->zoomAnimation:Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getCenterY()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimation;->setTouchY(F)V

    goto/16 :goto_0
.end method

.method private stopAnimations()V
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->animationStop()V

    .line 268
    return-void
.end method


# virtual methods
.method protected boundCoordinates()V
    .locals 2

    .prologue
    .line 505
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryLeft:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 506
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryLeft:F

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 512
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryTop:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 513
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryTop:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 518
    :cond_1
    :goto_1
    return-void

    .line 508
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryRight:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryRight:F

    iput v1, v0, Landroid/graphics/PointF;->x:F

    goto :goto_0

    .line 515
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryBottom:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 516
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryBottom:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    goto :goto_1
.end method

.method protected calculateBoundaries()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    .line 522
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageWidth:I

    int-to-float v0, v0

    iget v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 523
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageHeight:I

    int-to-float v0, v0

    iget v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    mul-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 525
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->displayWidth:I

    if-le v3, v0, :cond_2

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragX:Z

    .line 526
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->displayHeight:I

    if-le v4, v0, :cond_3

    :goto_1
    iput-boolean v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragY:Z

    .line 528
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragX:Z

    if-eqz v0, :cond_0

    .line 529
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->displayWidth:I

    sub-int v0, v3, v0

    int-to-float v0, v0

    div-float/2addr v0, v5

    .line 530
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerX:F

    sub-float/2addr v1, v0

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryLeft:F

    .line 531
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerX:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryRight:F

    .line 534
    :cond_0
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragY:Z

    if-eqz v0, :cond_1

    .line 535
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->displayHeight:I

    sub-int v0, v4, v0

    int-to-float v0, v0

    div-float/2addr v0, v5

    .line 536
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerY:F

    sub-float/2addr v1, v0

    iput v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryTop:F

    .line 537
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerY:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundaryBottom:F

    .line 539
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 525
    goto :goto_0

    :cond_3
    move v1, v2

    .line 526
    goto :goto_1
.end method

.method public getMaxScale()F
    .locals 1

    .prologue
    .line 469
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->maxScale:F

    return v0
.end method

.method public getMinScale()F
    .locals 1

    .prologue
    .line 477
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->minScale:F

    return v0
.end method

.method protected handleDrag(FF)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 427
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;

    iput p1, v0, Landroid/graphics/PointF;->x:F

    .line 428
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;

    iput p2, v0, Landroid/graphics/PointF;->y:F

    .line 430
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    .line 431
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    .line 433
    cmpl-float v2, v0, v3

    if-nez v2, :cond_0

    cmpl-float v2, v1, v3

    if-eqz v2, :cond_5

    .line 435
    :cond_0
    iget-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragX:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v3, v2, Landroid/graphics/PointF;->x:F

    add-float/2addr v0, v3

    iput v0, v2, Landroid/graphics/PointF;->x:F

    .line 436
    :cond_1
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragY:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v2, v0, Landroid/graphics/PointF;->y:F

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 438
    :cond_2
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundCoordinates()V

    .line 440
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 441
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 443
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragX:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragY:Z

    if-eqz v0, :cond_5

    .line 444
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setPosition(FF)V

    .line 446
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    if-eqz v0, :cond_4

    .line 447
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-interface {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;->onPosition(FF)V

    .line 450
    :cond_4
    const/4 v0, 0x1

    .line 454
    :goto_0
    return v0

    :cond_5
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected handleScale(FFF)V
    .locals 3

    .prologue
    .line 400
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    .line 402
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->maxScale:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 403
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->maxScale:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    .line 413
    :goto_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->calculateBoundaries()V

    .line 415
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setScale(F)V

    .line 416
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setPosition(FF)V

    .line 418
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    if-eqz v0, :cond_0

    .line 419
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    invoke-interface {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;->onScale(F)V

    .line 420
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-interface {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;->onPosition(FF)V

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->redraw()V

    .line 424
    return-void

    .line 405
    :cond_1
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->minScale:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 406
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->minScale:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    goto :goto_0

    .line 409
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iput p2, v0, Landroid/graphics/PointF;->x:F

    .line 410
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iput p3, v0, Landroid/graphics/PointF;->y:F

    goto :goto_0
.end method

.method protected handleUp()V
    .locals 3

    .prologue
    .line 360
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->multiTouch:Z

    .line 362
    const/4 v0, 0x0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->initialDistance:F

    .line 363
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->lastScale:F

    .line 365
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragX:Z

    if-nez v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerX:F

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 369
    :cond_0
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragY:Z

    if-nez v0, :cond_1

    .line 370
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerY:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 373
    :cond_1
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->boundCoordinates()V

    .line 375
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragX:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canDragY:Z

    if-nez v0, :cond_2

    .line 377
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->isLandscape()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 378
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleHorizontal:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    .line 379
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleHorizontal:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->lastScale:F

    .line 387
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setScale(F)V

    .line 388
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setPosition(FF)V

    .line 390
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    if-eqz v0, :cond_3

    .line 391
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    invoke-interface {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;->onScale(F)V

    .line 392
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-interface {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;->onPosition(FF)V

    .line 395
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->redraw()V

    .line 396
    return-void

    .line 382
    :cond_4
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleVertical:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    .line 383
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleVertical:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->lastScale:F

    goto :goto_0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 273
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->inZoom:Z

    if-nez v0, :cond_1

    .line 275
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->tapDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 276
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->flingDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    invoke-direct {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->startFling()V

    .line 280
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 281
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->handleUp()V

    .line 355
    :cond_1
    :goto_0
    return v3

    .line 283
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_4

    .line 284
    invoke-direct {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->stopAnimations()V

    .line 286
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 287
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 289
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    if-eqz v0, :cond_3

    .line 290
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->imageListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-interface {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewListener;->onTouch(FF)V

    .line 293
    :cond_3
    iput-boolean v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->touched:Z

    goto :goto_0

    .line 295
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 296
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-le v0, v3, :cond_6

    .line 297
    iput-boolean v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->multiTouch:Z

    .line 298
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->initialDistance:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 300
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->pinchVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    invoke-virtual {v0, p2}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->set(Landroid/view/MotionEvent;)V

    .line 301
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->pinchVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->calculateLength()F

    .line 303
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->pinchVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    iget v0, v0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    .line 305
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->initialDistance:F

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_1

    .line 307
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->initialDistance:F

    div-float/2addr v0, v1

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->lastScale:F

    mul-float/2addr v0, v1

    .line 309
    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->maxScale:F

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_1

    .line 310
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    iget v2, v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    mul-float/2addr v2, v0

    iput v2, v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    .line 312
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->calculateEndPoint()V

    .line 314
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    iget v2, v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    div-float/2addr v2, v0

    iput v2, v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    .line 316
    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    iget-object v1, v1, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 317
    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    iget-object v2, v2, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->end:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 319
    invoke-virtual {p0, v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->handleScale(FFF)V

    goto/16 :goto_0

    .line 324
    :cond_5
    invoke-static {p2}, Lcom/pinarsu/siparis/view/gestureimageview/MathUtils;->distance(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->initialDistance:F

    .line 326
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->midpoint:Landroid/graphics/PointF;

    invoke-static {p2, v0}, Lcom/pinarsu/siparis/view/gestureimageview/MathUtils;->midpoint(Landroid/view/MotionEvent;Landroid/graphics/PointF;)V

    .line 328
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->midpoint:Landroid/graphics/PointF;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->setStart(Landroid/graphics/PointF;)V

    .line 329
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->setEnd(Landroid/graphics/PointF;)V

    .line 331
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->calculateLength()F

    .line 332
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->calculateAngle()F

    .line 334
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->scaleVector:Lcom/pinarsu/siparis/view/gestureimageview/VectorF;

    iget v1, v0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    iget v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->lastScale:F

    div-float/2addr v1, v2

    iput v1, v0, Lcom/pinarsu/siparis/view/gestureimageview/VectorF;->length:F

    goto/16 :goto_0

    .line 338
    :cond_6
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->touched:Z

    if-nez v0, :cond_7

    .line 339
    iput-boolean v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->touched:Z

    .line 340
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 341
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->last:Landroid/graphics/PointF;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 342
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageX()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 343
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->getImageY()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->y:F

    goto/16 :goto_0

    .line 345
    :cond_7
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->multiTouch:Z

    if-nez v0, :cond_1

    .line 346
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->handleDrag(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 347
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->redraw()V

    goto/16 :goto_0
.end method

.method public reset()V
    .locals 3

    .prologue
    .line 458
    iget v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->startingScale:F

    iput v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    .line 459
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerX:F

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 460
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->centerY:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 461
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->calculateBoundaries()V

    .line 462
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->currentScale:F

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setScale(F)V

    .line 463
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->next:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setPosition(FF)V

    .line 464
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->redraw()V

    .line 465
    return-void
.end method

.method protected setCanvasHeight(I)V
    .locals 0

    .prologue
    .line 493
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasHeight:I

    .line 494
    return-void
.end method

.method protected setCanvasWidth(I)V
    .locals 0

    .prologue
    .line 489
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->canvasWidth:I

    .line 490
    return-void
.end method

.method protected setFitScaleHorizontal(F)V
    .locals 0

    .prologue
    .line 497
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleHorizontal:F

    .line 498
    return-void
.end method

.method protected setFitScaleVertical(F)V
    .locals 0

    .prologue
    .line 501
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->fitScaleVertical:F

    .line 502
    return-void
.end method

.method public setMaxScale(F)V
    .locals 0

    .prologue
    .line 473
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->maxScale:F

    .line 474
    return-void
.end method

.method public setMinScale(F)V
    .locals 0

    .prologue
    .line 481
    iput p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->minScale:F

    .line 482
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 485
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->onClickListener:Landroid/view/View$OnClickListener;

    .line 486
    return-void
.end method
