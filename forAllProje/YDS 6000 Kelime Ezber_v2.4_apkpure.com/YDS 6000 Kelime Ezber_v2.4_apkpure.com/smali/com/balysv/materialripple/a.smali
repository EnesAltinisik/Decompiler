.class public Lcom/balysv/materialripple/a;
.super Landroid/widget/FrameLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/balysv/materialripple/a$c;,
        Lcom/balysv/materialripple/a$b;,
        Lcom/balysv/materialripple/a$a;
    }
.end annotation


# instance fields
.field private A:Lcom/balysv/materialripple/a$a;

.field private B:Lcom/balysv/materialripple/a$b;

.field private C:Z

.field private D:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private E:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property",
            "<",
            "Lcom/balysv/materialripple/a;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private F:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property",
            "<",
            "Lcom/balysv/materialripple/a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Rect;

.field private c:I

.field private d:Z

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private j:I

.field private k:Z

.field private l:Landroid/graphics/drawable/Drawable;

.field private m:Z

.field private n:F

.field private o:F

.field private p:Landroid/widget/AdapterView;

.field private q:Landroid/view/View;

.field private r:Landroid/animation/AnimatorSet;

.field private s:Landroid/animation/ObjectAnimator;

.field private t:Landroid/graphics/Point;

.field private u:Landroid/graphics/Point;

.field private v:I

.field private w:Z

.field private x:Z

.field private y:I

.field private z:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/balysv/materialripple/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v5}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->b:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->u:Landroid/graphics/Point;

    new-instance v0, Lcom/balysv/materialripple/a$2;

    invoke-direct {v0, p0}, Lcom/balysv/materialripple/a$2;-><init>(Lcom/balysv/materialripple/a;)V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->D:Landroid/view/GestureDetector$SimpleOnGestureListener;

    new-instance v0, Lcom/balysv/materialripple/a$4;

    const-class v1, Ljava/lang/Float;

    const-string v2, "radius"

    invoke-direct {v0, p0, v1, v2}, Lcom/balysv/materialripple/a$4;-><init>(Lcom/balysv/materialripple/a;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->E:Landroid/util/Property;

    new-instance v0, Lcom/balysv/materialripple/a$5;

    const-class v1, Ljava/lang/Integer;

    const-string v2, "rippleAlpha"

    invoke-direct {v0, p0, v1, v2}, Lcom/balysv/materialripple/a$5;-><init>(Lcom/balysv/materialripple/a;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->F:Landroid/util/Property;

    invoke-virtual {p0, v4}, Lcom/balysv/materialripple/a;->setWillNotDraw(Z)V

    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lcom/balysv/materialripple/a;->D:Landroid/view/GestureDetector$SimpleOnGestureListener;

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->z:Landroid/view/GestureDetector;

    sget-object v0, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleColor:I

    const/high16 v2, -0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/balysv/materialripple/a;->c:I

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleDimension:I

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x420c0000    # 35.0f

    invoke-static {v2, v3}, Lcom/balysv/materialripple/a;->a(Landroid/content/res/Resources;F)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/balysv/materialripple/a;->f:I

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleOverlay:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/balysv/materialripple/a;->d:Z

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleHover:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/balysv/materialripple/a;->e:Z

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleDuration:I

    const/16 v2, 0x15e

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/balysv/materialripple/a;->g:I

    const/high16 v1, 0x437f0000    # 255.0f

    sget v2, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleAlpha:I

    const v3, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/balysv/materialripple/a;->h:I

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleDelayClick:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/balysv/materialripple/a;->i:Z

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleFadeDuration:I

    const/16 v2, 0x4b

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/balysv/materialripple/a;->j:I

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    sget v2, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleBackground:I

    invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v1, p0, Lcom/balysv/materialripple/a;->l:Landroid/graphics/drawable/Drawable;

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_ripplePersistent:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/balysv/materialripple/a;->k:Z

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleInAdapter:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/balysv/materialripple/a;->m:Z

    sget v1, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout_mrl_rippleRoundedCorners:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/balysv/materialripple/a;->n:F

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/balysv/materialripple/a;->c:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/balysv/materialripple/a;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->h()V

    return-void
.end method

.method static a(Landroid/content/res/Resources;F)F
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/balysv/materialripple/a;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    return-object v0
.end method

.method public static a(Landroid/view/View;)Lcom/balysv/materialripple/a$c;
    .locals 1

    new-instance v0, Lcom/balysv/materialripple/a$c;

    invoke-direct {v0, p0}, Lcom/balysv/materialripple/a$c;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method private a()V
    .locals 1

    iget-object v0, p0, Lcom/balysv/materialripple/a;->B:Lcom/balysv/materialripple/a$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/balysv/materialripple/a;->B:Lcom/balysv/materialripple/a$b;

    invoke-virtual {p0, v0}, Lcom/balysv/materialripple/a;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/balysv/materialripple/a;->x:Z

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/balysv/materialripple/a;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/balysv/materialripple/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 9

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->w:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/balysv/materialripple/a;->getEndRadius()F

    move-result v0

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->c()V

    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v1, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    iget-object v1, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    new-instance v2, Lcom/balysv/materialripple/a$3;

    invoke-direct {v2, p0, p1}, Lcom/balysv/materialripple/a$3;-><init>(Lcom/balysv/materialripple/a;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v1, p0, Lcom/balysv/materialripple/a;->E:Landroid/util/Property;

    new-array v2, v8, [F

    iget v3, p0, Lcom/balysv/materialripple/a;->o:F

    aput v3, v2, v6

    aput v0, v2, v7

    invoke-static {p0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iget v2, p0, Lcom/balysv/materialripple/a;->g:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v2, p0, Lcom/balysv/materialripple/a;->F:Landroid/util/Property;

    new-array v3, v8, [I

    iget v4, p0, Lcom/balysv/materialripple/a;->h:I

    aput v4, v3, v6

    aput v6, v3, v7

    invoke-static {p0, v2, v3}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    move-result-object v2

    iget v3, p0, Lcom/balysv/materialripple/a;->j:I

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance v3, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget v3, p0, Lcom/balysv/materialripple/a;->g:I

    iget v4, p0, Lcom/balysv/materialripple/a;->j:I

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x32

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    iget-boolean v3, p0, Lcom/balysv/materialripple/a;->k:Z

    if-eqz v3, :cond_1

    iget-object v0, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :goto_1
    iget-object v0, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/balysv/materialripple/a;->getRadius()F

    move-result v3

    cmpl-float v0, v3, v0

    if-lez v0, :cond_2

    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    new-array v3, v8, [Landroid/animation/Animator;

    aput-object v1, v3, v6

    aput-object v2, v3, v7

    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_1
.end method

.method private a(Landroid/view/View;II)Z
    .locals 5

    const/4 v1, 0x0

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v2, v3}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    invoke-virtual {v3, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    move-result v4

    if-eqz v4, :cond_1

    iget v0, v3, Landroid/graphics/Rect;->left:I

    sub-int v0, p2, v0

    iget v1, v3, Landroid/graphics/Rect;->top:I

    sub-int v1, p3, v1

    invoke-direct {p0, v2, v0, v1}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;II)Z

    move-result v1

    :cond_0
    :goto_1
    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    if-eq p1, v0, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->isLongClickable()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->isFocusableInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->isFocusableInTouchMode()Z

    move-result v1

    goto :goto_1
.end method

.method static synthetic a(Lcom/balysv/materialripple/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a;->C:Z

    return p1
.end method

.method private b()V
    .locals 6

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->w:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    :cond_1
    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getWidth()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getHeight()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide v2, 0x3ff3333340000000L    # 1.2000000476837158

    mul-double/2addr v0, v2

    double-to-float v0, v0

    iget-object v1, p0, Lcom/balysv/materialripple/a;->E:Landroid/util/Property;

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    iget v4, p0, Lcom/balysv/materialripple/a;->f:I

    int-to-float v4, v4

    aput v4, v2, v3

    const/4 v3, 0x1

    aput v0, v2, v3

    invoke-static {p0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0x9c4

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/balysv/materialripple/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->C:Z

    return v0
.end method

.method static synthetic b(Lcom/balysv/materialripple/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a;->x:Z

    return p1
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->r:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->removeAllListeners()V

    :cond_0
    iget-object v0, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/balysv/materialripple/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->e:Z

    return v0
.end method

.method static synthetic d(Lcom/balysv/materialripple/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->a()V

    return-void
.end method

.method private d()Z
    .locals 2

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    instance-of v0, v1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_0
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private e()Landroid/widget/AdapterView;
    .locals 2

    iget-object v0, p0, Lcom/balysv/materialripple/a;->p:Landroid/widget/AdapterView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/balysv/materialripple/a;->p:Landroid/widget/AdapterView;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_1
    instance-of v1, v0, Landroid/widget/AdapterView;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/widget/AdapterView;

    iput-object v0, p0, Lcom/balysv/materialripple/a;->p:Landroid/widget/AdapterView;

    iget-object v0, p0, Lcom/balysv/materialripple/a;->p:Landroid/widget/AdapterView;

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Could not find a parent AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic e(Lcom/balysv/materialripple/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->k:Z

    return v0
.end method

.method static synthetic f(Lcom/balysv/materialripple/a;)I
    .locals 1

    iget v0, p0, Lcom/balysv/materialripple/a;->h:I

    return v0
.end method

.method private f()V
    .locals 1

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->m:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->e()Landroid/widget/AdapterView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/balysv/materialripple/a;->y:I

    :cond_0
    return-void
.end method

.method private g()Z
    .locals 3

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->m:Z

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->e()Landroid/widget/AdapterView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v2

    iget v0, p0, Lcom/balysv/materialripple/a;->y:I

    if-eq v2, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput v2, p0, Lcom/balysv/materialripple/a;->y:I

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->a()V

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->c()V

    iget-object v2, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setPressed(Z)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/balysv/materialripple/a;->setRadius(F)V

    :cond_0
    :goto_1
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method static synthetic g(Lcom/balysv/materialripple/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->i:Z

    return v0
.end method

.method private getEndRadius()F
    .locals 8

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getHeight()I

    move-result v1

    div-int/lit8 v2, v0, 0x2

    div-int/lit8 v3, v1, 0x2

    iget-object v4, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    if-le v2, v4, :cond_0

    iget-object v2, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    :goto_0
    iget-object v2, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    if-le v3, v2, :cond_1

    iget-object v2, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    :goto_1
    float-to-double v2, v0

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    float-to-double v0, v1

    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    const v1, 0x3f99999a    # 1.2f

    mul-float/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    goto :goto_1
.end method

.method private getRadius()F
    .locals 1

    iget v0, p0, Lcom/balysv/materialripple/a;->o:F

    return v0
.end method

.method static synthetic h(Lcom/balysv/materialripple/a;)F
    .locals 1

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->getRadius()F

    move-result v0

    return v0
.end method

.method private h()V
    .locals 3

    const/4 v2, 0x0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-gt v0, v1, :cond_0

    iget v0, p0, Lcom/balysv/materialripple/a;->n:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getLayerType()I

    move-result v0

    iput v0, p0, Lcom/balysv/materialripple/a;->v:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0, v2}, Lcom/balysv/materialripple/a;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lcom/balysv/materialripple/a;->v:I

    invoke-virtual {p0, v0, v2}, Lcom/balysv/materialripple/a;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_0
.end method

.method static synthetic i(Lcom/balysv/materialripple/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/balysv/materialripple/a;->m:Z

    return v0
.end method

.method static synthetic j(Lcom/balysv/materialripple/a;)Landroid/widget/AdapterView;
    .locals 1

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->e()Landroid/widget/AdapterView;

    move-result-object v0

    return-object v0
.end method

.method static synthetic k(Lcom/balysv/materialripple/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->b()V

    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MaterialRippleLayout can host only one child"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    const/4 v4, 0x0

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->g()Z

    move-result v0

    iget-boolean v1, p0, Lcom/balysv/materialripple/a;->d:Z

    if-eqz v1, :cond_3

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/balysv/materialripple/a;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    if-nez v0, :cond_2

    iget v0, p0, Lcom/balysv/materialripple/a;->n:F

    cmpl-float v0, v0, v4

    if-eqz v0, :cond_1

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget v2, p0, Lcom/balysv/materialripple/a;->n:F

    iget v3, p0, Lcom/balysv/materialripple/a;->n:F

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    :cond_1
    iget-object v0, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lcom/balysv/materialripple/a;->o:F

    iget-object v3, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/balysv/materialripple/a;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lcom/balysv/materialripple/a;->o:F

    iget-object v3, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_4
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method public getChildView()Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    return-object v0
.end method

.method public getRippleAlpha()I
    .locals 1

    iget-object v0, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    return v0
.end method

.method public isInEditMode()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-object v0, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    invoke-direct {p0, v0, v1, v2}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;II)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    const/4 v1, 0x0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->l:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/balysv/materialripple/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x1

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    move v0, v1

    :cond_1
    :goto_0
    return v0

    :cond_2
    iget-object v1, p0, Lcom/balysv/materialripple/a;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/balysv/materialripple/a;->u:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->x:I

    iget-object v4, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Point;->set(II)V

    :cond_3
    iget-object v2, p0, Lcom/balysv/materialripple/a;->z:Landroid/view/GestureDetector;

    invoke-virtual {v2, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lcom/balysv/materialripple/a;->C:Z

    if-nez v2, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-direct {p0}, Lcom/balysv/materialripple/a;->f()V

    iput-boolean v6, p0, Lcom/balysv/materialripple/a;->w:Z

    new-instance v1, Lcom/balysv/materialripple/a$b;

    invoke-direct {v1, p0, p1}, Lcom/balysv/materialripple/a$b;-><init>(Lcom/balysv/materialripple/a;Landroid/view/MotionEvent;)V

    iput-object v1, p0, Lcom/balysv/materialripple/a;->B:Lcom/balysv/materialripple/a$b;

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->d()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->a()V

    iput-boolean v0, p0, Lcom/balysv/materialripple/a;->x:Z

    iget-object v1, p0, Lcom/balysv/materialripple/a;->B:Lcom/balysv/materialripple/a$b;

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p0, v1, v2, v3}, Lcom/balysv/materialripple/a;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :pswitch_1
    new-instance v2, Lcom/balysv/materialripple/a$a;

    invoke-direct {v2, p0, v5}, Lcom/balysv/materialripple/a$a;-><init>(Lcom/balysv/materialripple/a;Lcom/balysv/materialripple/a$1;)V

    iput-object v2, p0, Lcom/balysv/materialripple/a;->A:Lcom/balysv/materialripple/a$a;

    iget-boolean v2, p0, Lcom/balysv/materialripple/a;->x:Z

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setPressed(Z)V

    new-instance v2, Lcom/balysv/materialripple/a$1;

    invoke-direct {v2, p0}, Lcom/balysv/materialripple/a$1;-><init>(Lcom/balysv/materialripple/a;)V

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {p0, v2, v4, v5}, Lcom/balysv/materialripple/a;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    if-eqz v1, :cond_7

    iget-object v2, p0, Lcom/balysv/materialripple/a;->A:Lcom/balysv/materialripple/a$a;

    invoke-direct {p0, v2}, Lcom/balysv/materialripple/a;->a(Ljava/lang/Runnable;)V

    :cond_5
    :goto_1
    iget-boolean v2, p0, Lcom/balysv/materialripple/a;->i:Z

    if-nez v2, :cond_6

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/balysv/materialripple/a;->A:Lcom/balysv/materialripple/a$a;

    invoke-virtual {v1}, Lcom/balysv/materialripple/a$a;->run()V

    :cond_6
    invoke-direct {p0}, Lcom/balysv/materialripple/a;->a()V

    goto/16 :goto_0

    :cond_7
    iget-boolean v2, p0, Lcom/balysv/materialripple/a;->e:Z

    if-nez v2, :cond_5

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lcom/balysv/materialripple/a;->setRadius(F)V

    goto :goto_1

    :cond_8
    iget-object v1, p0, Lcom/balysv/materialripple/a;->B:Lcom/balysv/materialripple/a$b;

    invoke-virtual {v1}, Lcom/balysv/materialripple/a$b;->run()V

    goto/16 :goto_0

    :pswitch_2
    iget-boolean v1, p0, Lcom/balysv/materialripple/a;->m:Z

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/balysv/materialripple/a;->t:Landroid/graphics/Point;

    iget-object v2, p0, Lcom/balysv/materialripple/a;->u:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    iget-object v3, p0, Lcom/balysv/materialripple/a;->u:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->y:I

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Point;->set(II)V

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    iput-object v1, p0, Lcom/balysv/materialripple/a;->u:Landroid/graphics/Point;

    :cond_9
    iget-object v1, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-boolean v1, p0, Lcom/balysv/materialripple/a;->e:Z

    if-eqz v1, :cond_b

    iget-boolean v1, p0, Lcom/balysv/materialripple/a;->x:Z

    if-nez v1, :cond_a

    invoke-direct {p0, v5}, Lcom/balysv/materialripple/a;->a(Ljava/lang/Runnable;)V

    :cond_a
    :goto_2
    invoke-direct {p0}, Lcom/balysv/materialripple/a;->a()V

    goto/16 :goto_0

    :cond_b
    iget-object v1, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {v1, v6}, Landroid/view/View;->setPressed(Z)V

    goto :goto_2

    :pswitch_3
    iget-boolean v2, p0, Lcom/balysv/materialripple/a;->e:Z

    if-eqz v2, :cond_c

    if-eqz v1, :cond_e

    iget-boolean v2, p0, Lcom/balysv/materialripple/a;->w:Z

    if-nez v2, :cond_e

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->invalidate()V

    :cond_c
    :goto_3
    if-nez v1, :cond_1

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->a()V

    iget-object v1, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/balysv/materialripple/a;->s:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->cancel()V

    :cond_d
    iget-object v1, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iput-boolean v0, p0, Lcom/balysv/materialripple/a;->w:Z

    goto/16 :goto_0

    :cond_e
    if-nez v1, :cond_c

    invoke-direct {p0, v5}, Lcom/balysv/materialripple/a;->a(Ljava/lang/Runnable;)V

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public setDefaultRippleAlpha(I)V
    .locals 1

    iput p1, p0, Lcom/balysv/materialripple/a;->h:I

    iget-object v0, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->invalidate()V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    iget-object v0, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MaterialRippleLayout must have a child view to handle clicks"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 2

    iget-object v0, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MaterialRippleLayout must have a child view to handle clicks"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/balysv/materialripple/a;->q:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setRadius(F)V
    .locals 0

    iput p1, p0, Lcom/balysv/materialripple/a;->o:F

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->invalidate()V

    return-void
.end method

.method public setRippleAlpha(Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->invalidate()V

    return-void
.end method

.method public setRippleBackground(I)V
    .locals 2

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Lcom/balysv/materialripple/a;->l:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/balysv/materialripple/a;->l:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/balysv/materialripple/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->invalidate()V

    return-void
.end method

.method public setRippleColor(I)V
    .locals 2

    iput p1, p0, Lcom/balysv/materialripple/a;->c:I

    iget-object v0, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/balysv/materialripple/a;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/balysv/materialripple/a;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Lcom/balysv/materialripple/a;->invalidate()V

    return-void
.end method

.method public setRippleDelayClick(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a;->i:Z

    return-void
.end method

.method public setRippleDiameter(I)V
    .locals 0

    iput p1, p0, Lcom/balysv/materialripple/a;->f:I

    return-void
.end method

.method public setRippleDuration(I)V
    .locals 0

    iput p1, p0, Lcom/balysv/materialripple/a;->g:I

    return-void
.end method

.method public setRippleFadeDuration(I)V
    .locals 0

    iput p1, p0, Lcom/balysv/materialripple/a;->j:I

    return-void
.end method

.method public setRippleHover(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a;->e:Z

    return-void
.end method

.method public setRippleInAdapter(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a;->m:Z

    return-void
.end method

.method public setRippleOverlay(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a;->d:Z

    return-void
.end method

.method public setRipplePersistent(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a;->k:Z

    return-void
.end method

.method public setRippleRoundedCorners(I)V
    .locals 1

    int-to-float v0, p1

    iput v0, p0, Lcom/balysv/materialripple/a;->n:F

    invoke-direct {p0}, Lcom/balysv/materialripple/a;->h()V

    return-void
.end method
