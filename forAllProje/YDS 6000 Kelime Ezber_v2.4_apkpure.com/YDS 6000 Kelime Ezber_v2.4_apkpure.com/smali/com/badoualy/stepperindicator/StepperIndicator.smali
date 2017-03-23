.class public Lcom/badoualy/stepperindicator/StepperIndicator;
.super Landroid/view/View;

# interfaces
.implements Landroid/support/v4/view/ViewPager$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/badoualy/stepperindicator/StepperIndicator$b;,
        Lcom/badoualy/stepperindicator/StepperIndicator$a;
    }
.end annotation


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation
.end field

.field private B:Landroid/view/GestureDetector;

.field private C:I

.field private D:I

.field private E:I

.field private F:[F

.field private G:Landroid/graphics/Rect;

.field private H:Landroid/graphics/RectF;

.field private I:Landroid/support/v4/view/ViewPager;

.field private J:Landroid/graphics/Bitmap;

.field private K:Z

.field private L:Landroid/animation/AnimatorSet;

.field private M:Landroid/animation/ObjectAnimator;

.field private N:Landroid/animation/ObjectAnimator;

.field private O:Landroid/animation/ObjectAnimator;

.field private P:Landroid/view/GestureDetector$OnGestureListener;

.field private a:Landroid/graphics/Paint;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Paint;",
            ">;"
        }
    .end annotation
.end field

.field private c:F

.field private d:Z

.field private e:Landroid/graphics/Paint;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Paint;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroid/graphics/Paint;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Paint;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/graphics/Paint;

.field private j:Landroid/graphics/Paint;

.field private k:Landroid/graphics/Paint;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Path;",
            ">;"
        }
    .end annotation
.end field

.field private m:F

.field private n:F

.field private o:F

.field private p:Z

.field private q:F

.field private r:F

.field private s:F

.field private t:Z

.field private u:F

.field private v:F

.field private w:F

.field private x:F

.field private y:I

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/badoualy/stepperindicator/StepperIndicator$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/badoualy/stepperindicator/StepperIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/badoualy/stepperindicator/StepperIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    iput v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->q:F

    iput v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->r:F

    iput v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->s:F

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->z:Ljava/util/List;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->G:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    new-instance v0, Lcom/badoualy/stepperindicator/StepperIndicator$1;

    invoke-direct {v0, p0}, Lcom/badoualy/stepperindicator/StepperIndicator$1;-><init>(Lcom/badoualy/stepperindicator/StepperIndicator;)V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->P:Landroid/view/GestureDetector$OnGestureListener;

    invoke-direct {p0, p1, p2, p3}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    iput v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->q:F

    iput v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->r:F

    iput v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->s:F

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->z:Ljava/util/List;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->G:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    new-instance v0, Lcom/badoualy/stepperindicator/StepperIndicator$1;

    invoke-direct {v0, p0}, Lcom/badoualy/stepperindicator/StepperIndicator$1;-><init>(Lcom/badoualy/stepperindicator/StepperIndicator;)V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->P:Landroid/view/GestureDetector$OnGestureListener;

    invoke-direct {p0, p1, p2, p3}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "colorPrimary"

    const-string v2, "attr"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-virtual {v2, v0, v1, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v1, Landroid/util/TypedValue;->data:I

    :goto_0
    return v0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    new-array v0, v5, [I

    const v1, 0x1010433

    aput v1, v0, v4

    invoke-virtual {p0, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v0, Lcom/badoualy/stepperindicator/R$color;->stpi_default_primary_color:I

    invoke-static {p0, v0}, Landroid/support/v4/c/a;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v1, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :cond_1
    new-array v0, v5, [I

    sget v1, Lcom/badoualy/stepperindicator/R$attr;->colorPrimary:I

    aput v1, v0, v4

    invoke-virtual {p0, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v0, Lcom/badoualy/stepperindicator/R$color;->stpi_default_primary_color:I

    invoke-static {p0, v0}, Landroid/support/v4/c/a;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v1, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0
.end method

.method private a(ILjava/util/List;Landroid/graphics/Paint;)Landroid/graphics/Paint;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Paint;",
            ">;",
            "Landroid/graphics/Paint;",
            ")",
            "Landroid/graphics/Paint;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/badoualy/stepperindicator/StepperIndicator;->f(I)Z

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :try_start_0
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Paint;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-nez v0, :cond_0

    if-eqz p3, :cond_0

    move-object v0, p3

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "StepperIndicator"

    const-string v1, "getPaint: could not use default paint for the specific step! Using random Paint instead!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getRandomPaint()Landroid/graphics/Paint;

    move-result-object v0

    :cond_1
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "StepperIndicator"

    const-string v2, "getPaint: could not find the specific step paint to use! Try to use default instead!"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method private static a(FFF)Landroid/graphics/PathEffect;
    .locals 3

    new-instance v0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p0, v1, v2

    const/4 v2, 0x1

    aput p0, v1, v2

    mul-float v2, p1, p0

    invoke-static {v2, p2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    return-object v0
.end method

.method static synthetic a(Lcom/badoualy/stepperindicator/StepperIndicator;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->A:Ljava/util/List;

    return-object v0
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 19

    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-static/range {p1 .. p1}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(Landroid/content/Context;)I

    move-result v7

    sget v4, Lcom/badoualy/stepperindicator/R$color;->stpi_default_circle_color:I

    move-object/from16 v0, p1

    invoke-static {v0, v4}, Landroid/support/v4/c/a;->c(Landroid/content/Context;I)I

    move-result v4

    sget v5, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_circle_radius:I

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    sget v5, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_circle_stroke_width:I

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    sget v9, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_indicator_radius:I

    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v9

    sget v10, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_line_stroke_width:I

    invoke-virtual {v6, v10}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    sget v11, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_line_margin:I

    invoke-virtual {v6, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v11

    sget v12, Lcom/badoualy/stepperindicator/R$color;->stpi_default_line_color:I

    move-object/from16 v0, p1

    invoke-static {v0, v12}, Landroid/support/v4/c/a;->c(Landroid/content/Context;I)I

    move-result v12

    sget-object v13, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator:[I

    const/4 v14, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-virtual {v0, v1, v13, v2, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v13

    new-instance v14, Landroid/graphics/Paint;

    invoke-direct {v14}, Landroid/graphics/Paint;-><init>()V

    move-object/from16 v0, p0

    iput-object v14, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    sget v15, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_circleStrokeWidth:I

    invoke-virtual {v13, v15, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    invoke-virtual {v14, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    sget-object v14, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    sget v14, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_circleColor:I

    invoke-virtual {v13, v14, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_stepCount:I

    const/4 v5, 0x2

    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/badoualy/stepperindicator/StepperIndicator;->setStepCount(I)V

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_stepsCircleColors:I

    const/4 v5, 0x0

    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    if-eqz v5, :cond_2

    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget v14, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    invoke-direct {v4, v14}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->b:Ljava/util/List;

    const/4 v4, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget v14, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    if-ge v4, v14, :cond_2

    new-instance v14, Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    invoke-direct {v14, v15}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->isInEditMode()Z

    move-result v15

    if-eqz v15, :cond_0

    invoke-direct/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getRandomColor()I

    move-result v15

    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setColor(I)V

    :goto_1
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->b:Ljava/util/List;

    invoke-interface {v15, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v5}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v15

    move-object/from16 v0, p0

    iget v0, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    move/from16 v16, v0

    invoke-virtual {v15}, Landroid/content/res/TypedArray;->length()I

    move-result v17

    move/from16 v0, v16

    move/from16 v1, v17

    if-le v0, v1, :cond_1

    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "Invalid number of colors for the circles. Please provide a list of colors with as many items as the number of steps required!"

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_1
    const/16 v16, 0x0

    move/from16 v0, v16

    invoke-virtual {v15, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v16

    move/from16 v0, v16

    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v15}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_1

    :cond_2
    new-instance v4, Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    invoke-direct {v4, v5}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    sget v5, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_indicatorColor:I

    invoke-virtual {v13, v5, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance v4, Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    invoke-direct {v4, v5}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->e:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->e:Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v14, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_text_size:I

    invoke-virtual {v5, v14}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_showStepNumberInstead:I

    const/4 v5, 0x0

    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->d:Z

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_stepsIndicatorColors:I

    const/4 v5, 0x0

    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    if-eqz v14, :cond_a

    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->h:Ljava/util/List;

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->d:Z

    if-eqz v4, :cond_3

    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->f:Ljava/util/List;

    :cond_3
    const/4 v4, 0x0

    :goto_2
    move-object/from16 v0, p0

    iget v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    if-ge v4, v5, :cond_a

    new-instance v15, Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    invoke-direct {v15, v5}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    move-object/from16 v0, p0

    iget-boolean v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->d:Z

    if-eqz v5, :cond_6

    new-instance v5, Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->e:Landroid/graphics/Paint;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-direct {v5, v0}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->isInEditMode()Z

    move-result v16

    if-eqz v16, :cond_7

    invoke-direct/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getRandomColor()I

    move-result v16

    invoke-virtual/range {v15 .. v16}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz v5, :cond_4

    invoke-virtual {v15}, Landroid/graphics/Paint;->getColor()I

    move-result v16

    move/from16 v0, v16

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    :cond_4
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->h:Ljava/util/List;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-interface {v0, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget-boolean v15, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->d:Z

    if-eqz v15, :cond_5

    if-eqz v5, :cond_5

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->f:Ljava/util/List;

    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    goto :goto_3

    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v16

    move-object/from16 v0, p0

    iget v0, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    move/from16 v17, v0

    invoke-virtual/range {v16 .. v16}, Landroid/content/res/TypedArray;->length()I

    move-result v18

    move/from16 v0, v17

    move/from16 v1, v18

    if-le v0, v1, :cond_8

    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "Invalid number of colors for the indicators. Please provide a list of colors with as many items as the number of steps required!"

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_8
    const/16 v17, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v17

    move/from16 v0, v17

    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz v5, :cond_9

    invoke-virtual {v15}, Landroid/graphics/Paint;->getColor()I

    move-result v17

    move/from16 v0, v17

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    :cond_9
    invoke-virtual/range {v16 .. v16}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_4

    :cond_a
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    sget v5, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_lineStrokeWidth:I

    invoke-virtual {v13, v5, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    sget v5, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_lineColor:I

    invoke-virtual {v13, v5, v12}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance v4, Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    invoke-direct {v4, v5}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->j:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->j:Landroid/graphics/Paint;

    sget v5, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_lineDoneColor:I

    invoke-virtual {v13, v5, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v4, Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->j:Landroid/graphics/Paint;

    invoke-direct {v4, v5}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->k:Landroid/graphics/Paint;

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_useBottomIndicator:I

    const/4 v5, 0x0

    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->p:Z

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->p:Z

    if-eqz v4, :cond_c

    sget v4, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_bottom_indicator_height:I

    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    sget v5, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_bottomIndicatorHeight:I

    invoke-virtual {v13, v5, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->s:F

    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->s:F

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_b

    const-string v4, "StepperIndicator"

    const-string v5, "init: Invalid indicator height, disabling bottom indicator feature! Please provide a value greater than 0."

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->p:Z

    :cond_b
    sget v4, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_bottom_indicator_width:I

    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    sget v5, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_bottomIndicatorWidth:I

    invoke-virtual {v13, v5, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->r:F

    sget v4, Lcom/badoualy/stepperindicator/R$dimen;->stpi_default_bottom_indicator_margin_top:I

    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    sget v5, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_bottomIndicatorMarginTop:I

    invoke-virtual {v13, v5, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->q:F

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_useBottomIndicatorWithStepColors:I

    const/4 v5, 0x0

    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->t:Z

    :cond_c
    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_circleRadius:I

    invoke-virtual {v13, v4, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v5

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v5, v7

    add-float/2addr v4, v5

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->v:F

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_indicatorRadius:I

    invoke-virtual {v13, v4, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->w:F

    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->w:F

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->n:F

    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->v:F

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->o:F

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_lineMargin:I

    invoke-virtual {v13, v4, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->x:F

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_animDuration:I

    const/16 v5, 0xfa

    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->y:I

    sget v4, Lcom/badoualy/stepperindicator/R$styleable;->StepperIndicator_stpi_showDoneIcon:I

    const/4 v5, 0x1

    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->K:Z

    invoke-virtual {v13}, Landroid/content/res/TypedArray;->recycle()V

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->K:Z

    if-eqz v4, :cond_d

    sget v4, Lcom/badoualy/stepperindicator/R$drawable;->ic_done_white_18dp:I

    invoke-static {v6, v4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->J:Landroid/graphics/Bitmap;

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->isInEditMode()Z

    move-result v4

    if-eqz v4, :cond_e

    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    :cond_e
    new-instance v4, Landroid/view/GestureDetector;

    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getContext()Landroid/content/Context;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->P:Landroid/view/GestureDetector$OnGestureListener;

    invoke-direct {v4, v5, v6}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->B:Landroid/view/GestureDetector;

    return-void
.end method

.method static synthetic b(Lcom/badoualy/stepperindicator/StepperIndicator;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->z:Ljava/util/List;

    return-object v0
.end method

.method private c(I)Landroid/graphics/Paint;
    .locals 2

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->h:Ljava/util/List;

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    invoke-direct {p0, p1, v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(ILjava/util/List;Landroid/graphics/Paint;)Landroid/graphics/Paint;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 7

    const/4 v2, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "circlePaint is invalid! Make sure you setup the field circlePaint before calling compute() method!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    const v1, 0x3fa66666    # 1.3f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v1

    div-float/2addr v1, v6

    add-float/2addr v0, v1

    iget-boolean v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->p:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->r:F

    div-float/2addr v1, v6

    sub-float/2addr v1, v0

    add-float/2addr v0, v1

    :cond_1
    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float v3, v0, v6

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    add-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    div-float v3, v1, v3

    iget v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    mul-float/2addr v1, v6

    iget-object v4, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v4

    add-float/2addr v1, v4

    sub-float v1, v3, v1

    iget v4, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->x:F

    mul-float/2addr v4, v6

    sub-float/2addr v1, v4

    iput v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->u:F

    move v1, v2

    :goto_0
    iget-object v4, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    array-length v4, v4

    if-ge v1, v4, :cond_2

    iget-object v4, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    int-to-float v5, v1

    mul-float/2addr v5, v3

    add-float/2addr v5, v0

    aput v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    aget v0, v0, v2

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    add-int/lit8 v3, v2, 0x1

    aget v1, v1, v3

    add-float/2addr v0, v1

    div-float/2addr v0, v6

    iget v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->u:F

    div-float/2addr v1, v6

    sub-float/2addr v0, v1

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getStepCenterY()F

    move-result v3

    invoke-virtual {v1, v0, v3}, Landroid/graphics/Path;->moveTo(FF)V

    iget v4, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->u:F

    add-float/2addr v0, v4

    invoke-virtual {v1, v0, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->a()V

    return-void
.end method

.method private d(I)Landroid/graphics/Paint;
    .locals 2

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->e:Landroid/graphics/Paint;

    invoke-direct {p0, p1, v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(ILjava/util/List;Landroid/graphics/Paint;)Landroid/graphics/Paint;

    move-result-object v0

    return-object v0
.end method

.method private e(I)Landroid/graphics/Paint;
    .locals 2

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    invoke-direct {p0, p1, v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(ILjava/util/List;Landroid/graphics/Paint;)Landroid/graphics/Paint;

    move-result-object v0

    return-object v0
.end method

.method private f(I)Z
    .locals 3

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid step position. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a valid position! it should be between 0 and stepCount("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private getBottomIndicatorHeight()I
    .locals 2

    iget-boolean v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->p:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->s:F

    iget v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->q:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private getRandomColor()I
    .locals 5

    const/16 v4, 0x100

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0xff

    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    invoke-static {v1, v2, v3, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method

.method private getRandomPaint()Landroid/graphics/Paint;
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getRandomColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-object v0
.end method

.method private getStepCenterY()F
    .locals 2

    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getMeasuredHeight()I

    move-result v0

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getBottomIndicatorHeight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a()V
    .locals 9

    const/high16 v8, 0x40000000    # 2.0f

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "stepCount wasn\'t setup yet. Make sure you call setStepCount() before computing the steps click area!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "indicators wasn\'t setup yet. Make sure the indicators are initialized and setup correctly before trying to compute the click area for each step!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    aget v3, v1, v0

    iget v4, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    mul-float/2addr v4, v8

    sub-float v4, v3, v4

    iget v5, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    mul-float/2addr v5, v8

    add-float/2addr v3, v5

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getStepCenterY()F

    move-result v5

    iget v6, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    mul-float/2addr v6, v8

    sub-float/2addr v5, v6

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getStepCenterY()F

    move-result v6

    iget v7, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    add-float/2addr v6, v7

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getBottomIndicatorHeight()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v6, v7

    new-instance v7, Landroid/graphics/RectF;

    invoke-direct {v7, v4, v5, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v3, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->A:Ljava/util/List;

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(IFI)V
    .locals 0

    return-void
.end method

.method public a(Landroid/support/v4/view/ViewPager;I)V
    .locals 2

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->I:Landroid/support/v4/view/ViewPager;

    if-ne v0, p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->I:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_1

    invoke-virtual {p1, p0}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager$f;)V

    :cond_1
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ViewPager does not have adapter instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iput-object p1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->I:Landroid/support/v4/view/ViewPager;

    iput p2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    invoke-virtual {p1, p0}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager$f;)V

    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->invalidate()V

    goto :goto_0
.end method

.method public b(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setCurrentStep(I)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->z:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getCurrentStep()I
    .locals 1

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    return v0
.end method

.method public getStepCount()I
    .locals 1

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 19

    invoke-direct/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getStepCenterY()F

    move-result v17

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    if-eqz v3, :cond_b

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v3

    if-eqz v3, :cond_b

    const/4 v3, 0x1

    move v9, v3

    :goto_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    if-eqz v3, :cond_c

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, 0x1

    move v10, v3

    :goto_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->N:Landroid/animation/ObjectAnimator;

    if-eqz v3, :cond_d

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->N:Landroid/animation/ObjectAnimator;

    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v3

    if-eqz v3, :cond_d

    const/4 v3, 0x1

    move v11, v3

    :goto_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->O:Landroid/animation/ObjectAnimator;

    if-eqz v3, :cond_e

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->O:Landroid/animation/ObjectAnimator;

    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v3

    if-eqz v3, :cond_e

    const/4 v3, 0x1

    move v12, v3

    :goto_3
    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->E:I

    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    add-int/lit8 v4, v4, -0x1

    if-ne v3, v4, :cond_f

    const/4 v3, 0x1

    move v13, v3

    :goto_4
    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->E:I

    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    add-int/lit8 v4, v4, 0x1

    if-ne v3, v4, :cond_10

    const/4 v3, 0x1

    move v14, v3

    :goto_5
    const/4 v3, 0x0

    move v15, v3

    :goto_6
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    array-length v3, v3

    if-ge v15, v3, :cond_18

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->F:[F

    aget v18, v3, v15

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-lt v15, v3, :cond_0

    if-eqz v14, :cond_11

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-ne v15, v3, :cond_11

    :cond_0
    const/4 v3, 0x1

    move/from16 v16, v3

    :goto_7
    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/badoualy/stepperindicator/StepperIndicator;->e(I)Landroid/graphics/Paint;

    move-result-object v4

    move-object/from16 v0, p1

    move/from16 v1, v18

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->d:Z

    if-eqz v3, :cond_1

    add-int/lit8 v3, v15, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->G:Landroid/graphics/Rect;

    move-object/from16 v0, p0

    iget v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    sub-float v5, v18, v5

    float-to-int v5, v5

    move-object/from16 v0, p0

    iget v6, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    sub-float v6, v17, v6

    float-to-int v6, v6

    move-object/from16 v0, p0

    iget v7, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    add-float v7, v7, v18

    float-to-int v7, v7

    move-object/from16 v0, p0

    iget v8, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    add-float v8, v8, v17

    float-to-int v8, v8

    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/Rect;->set(IIII)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->G:Landroid/graphics/Rect;

    invoke-virtual {v4, v5}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/badoualy/stepperindicator/StepperIndicator;->d(I)Landroid/graphics/Paint;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    const/4 v6, 0x0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v4, v3, v6, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    iput v6, v5, Landroid/graphics/RectF;->right:F

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/Paint;->descent()F

    move-result v6

    invoke-virtual {v4}, Landroid/graphics/Paint;->ascent()F

    move-result v7

    sub-float/2addr v6, v7

    iput v6, v5, Landroid/graphics/RectF;->bottom:F

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    iget v6, v5, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->G:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-float v7, v7

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->right:F

    sub-float/2addr v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    add-float/2addr v6, v7

    iput v6, v5, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    iget v6, v5, Landroid/graphics/RectF;->top:F

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->G:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v7

    int-to-float v7, v7

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    add-float/2addr v6, v7

    iput v6, v5, Landroid/graphics/RectF;->top:F

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->H:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->top:F

    invoke-virtual {v4}, Landroid/graphics/Paint;->ascent()F

    move-result v7

    sub-float/2addr v6, v7

    move-object/from16 v0, p1

    invoke-virtual {v0, v3, v5, v6, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_1
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->p:Z

    if-eqz v3, :cond_13

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-ne v15, v3, :cond_2

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->r:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float v4, v18, v3

    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getHeight()I

    move-result v3

    int-to-float v3, v3

    move-object/from16 v0, p0

    iget v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->s:F

    sub-float v5, v3, v5

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->r:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    add-float v6, v18, v3

    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getHeight()I

    move-result v3

    int-to-float v7, v3

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->t:Z

    if-eqz v3, :cond_12

    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/badoualy/stepperindicator/StepperIndicator;->c(I)Landroid/graphics/Paint;

    move-result-object v8

    :goto_8
    move-object/from16 v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_9
    if-eqz v16, :cond_8

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->v:F

    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->E:I

    if-ne v15, v4, :cond_3

    if-nez v13, :cond_4

    :cond_3
    move-object/from16 v0, p0

    iget v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-ne v15, v4, :cond_5

    if-eqz v14, :cond_5

    :cond_4
    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->o:F

    :cond_5
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/badoualy/stepperindicator/StepperIndicator;->c(I)Landroid/graphics/Paint;

    move-result-object v4

    move-object/from16 v0, p1

    move/from16 v1, v18

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual/range {p0 .. p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->isInEditMode()Z

    move-result v3

    if-nez v3, :cond_8

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->K:Z

    if-eqz v3, :cond_8

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->E:I

    if-eq v15, v3, :cond_6

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-ne v15, v3, :cond_7

    :cond_6
    if-nez v12, :cond_8

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-ne v15, v3, :cond_7

    if-eqz v9, :cond_8

    :cond_7
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->J:Landroid/graphics/Bitmap;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->J:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    sub-float v4, v18, v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->J:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    sub-float v5, v17, v5

    const/4 v6, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_8
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v15, v3, :cond_a

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-lt v15, v3, :cond_16

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Path;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-ne v15, v3, :cond_a

    if-eqz v14, :cond_a

    if-nez v10, :cond_9

    if-eqz v11, :cond_a

    :cond_9
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Path;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->k:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_a
    :goto_a
    add-int/lit8 v3, v15, 0x1

    move v15, v3

    goto/16 :goto_6

    :cond_b
    const/4 v3, 0x0

    move v9, v3

    goto/16 :goto_0

    :cond_c
    const/4 v3, 0x0

    move v10, v3

    goto/16 :goto_1

    :cond_d
    const/4 v3, 0x0

    move v11, v3

    goto/16 :goto_2

    :cond_e
    const/4 v3, 0x0

    move v12, v3

    goto/16 :goto_3

    :cond_f
    const/4 v3, 0x0

    move v13, v3

    goto/16 :goto_4

    :cond_10
    const/4 v3, 0x0

    move v14, v3

    goto/16 :goto_5

    :cond_11
    const/4 v3, 0x0

    move/from16 v16, v3

    goto/16 :goto_7

    :cond_12
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->g:Landroid/graphics/Paint;

    goto/16 :goto_8

    :cond_13
    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    if-ne v15, v3, :cond_14

    if-eqz v14, :cond_15

    :cond_14
    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->E:I

    if-ne v15, v3, :cond_2

    if-eqz v14, :cond_2

    if-eqz v9, :cond_2

    :cond_15
    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->n:F

    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/badoualy/stepperindicator/StepperIndicator;->c(I)Landroid/graphics/Paint;

    move-result-object v4

    move-object/from16 v0, p1

    move/from16 v1, v18

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_9

    :cond_16
    move-object/from16 v0, p0

    iget v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    add-int/lit8 v3, v3, -0x1

    if-ne v15, v3, :cond_17

    if-eqz v13, :cond_17

    if-eqz v10, :cond_17

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Path;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->i:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Path;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->k:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_a

    :cond_17
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->l:Ljava/util/List;

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Path;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/badoualy/stepperindicator/StepperIndicator;->j:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_a

    :cond_18
    return-void
.end method

.method protected onMeasure(II)V
    .locals 6

    const/high16 v5, 0x40000000    # 2.0f

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->c:F

    const v1, 0x3fa66666    # 1.3f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->a:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v1

    add-float/2addr v0, v1

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getBottomIndicatorHeight()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v1, v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    if-ne v3, v5, :cond_0

    :goto_0
    if-ne v4, v5, :cond_1

    :goto_1
    invoke-virtual {p0, v2, v0}, Lcom/badoualy/stepperindicator/StepperIndicator;->setMeasuredDimension(II)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->getSuggestedMinimumWidth()I

    move-result v2

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    check-cast p1, Lcom/badoualy/stepperindicator/StepperIndicator$b;

    invoke-virtual {p1}, Lcom/badoualy/stepperindicator/StepperIndicator$b;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    invoke-static {p1}, Lcom/badoualy/stepperindicator/StepperIndicator$b;->a(Lcom/badoualy/stepperindicator/StepperIndicator$b;)I

    move-result v0

    iput v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->requestLayout()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/badoualy/stepperindicator/StepperIndicator$b;

    invoke-direct {v1, v0}, Lcom/badoualy/stepperindicator/StepperIndicator$b;-><init>(Landroid/os/Parcelable;)V

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    invoke-static {v1, v0}, Lcom/badoualy/stepperindicator/StepperIndicator$b;->a(Lcom/badoualy/stepperindicator/StepperIndicator$b;I)I

    return-object v1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->c()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->B:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 v0, 0x1

    return v0
.end method

.method public setAnimCheckRadius(F)V
    .locals 0

    iput p1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->o:F

    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->invalidate()V

    return-void
.end method

.method public setAnimIndicatorRadius(F)V
    .locals 0

    iput p1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->n:F

    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->invalidate()V

    return-void
.end method

.method public setAnimProgress(F)V
    .locals 3

    iput p1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->m:F

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->k:Landroid/graphics/Paint;

    iget v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->u:F

    const/4 v2, 0x0

    invoke-static {v1, p1, v2}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(FFF)Landroid/graphics/PathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->invalidate()V

    return-void
.end method

.method public setCurrentStep(I)V
    .locals 8

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x2

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid step value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    iput v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->E:I

    iput p1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_2
    iput-object v3, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    iput-object v3, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    iput-object v3, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->N:Landroid/animation/ObjectAnimator;

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->E:I

    add-int/lit8 v0, v0, 0x1

    if-ne p1, v0, :cond_5

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    const-string v0, "animProgress"

    new-array v1, v4, [F

    fill-array-data v1, :array_0

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    const-string v0, "animCheckRadius"

    const/4 v1, 0x3

    new-array v1, v1, [F

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->w:F

    aput v2, v1, v5

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->v:F

    const v3, 0x3fa66666    # 1.3f

    mul-float/2addr v2, v3

    aput v2, v1, v6

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->v:F

    aput v2, v1, v4

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->O:Landroid/animation/ObjectAnimator;

    iput v7, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->n:F

    const-string v0, "animIndicatorRadius"

    const/4 v1, 0x3

    new-array v1, v1, [F

    aput v7, v1, v5

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->w:F

    const v3, 0x3fb33333    # 1.4f

    mul-float/2addr v2, v3

    aput v2, v1, v6

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->w:F

    aput v2, v1, v4

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->N:Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->O:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->N:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->before(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    const/16 v1, 0x1f4

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->y:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->N:Landroid/animation/ObjectAnimator;

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->getDuration()J

    move-result-wide v2

    const-wide/16 v4, 0x2

    div-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->O:Landroid/animation/ObjectAnimator;

    iget-object v1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->getDuration()J

    move-result-wide v2

    const-wide/16 v4, 0x2

    div-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :cond_4
    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->invalidate()V

    return-void

    :cond_5
    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->E:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_3

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    const-string v0, "animIndicatorRadius"

    new-array v1, v4, [F

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->w:F

    aput v2, v1, v5

    aput v7, v1, v6

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->N:Landroid/animation/ObjectAnimator;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->m:F

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->k:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    const-string v0, "animProgress"

    new-array v1, v4, [F

    fill-array-data v1, :array_1

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->v:F

    iput v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->o:F

    const-string v0, "animCheckRadius"

    new-array v1, v4, [F

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->v:F

    aput v2, v1, v5

    iget v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->w:F

    aput v2, v1, v6

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->O:Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->L:Landroid/animation/AnimatorSet;

    const/4 v1, 0x3

    new-array v1, v1, [Landroid/animation/Animator;

    iget-object v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->N:Landroid/animation/ObjectAnimator;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->M:Landroid/animation/ObjectAnimator;

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->O:Landroid/animation/ObjectAnimator;

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    goto/16 :goto_0

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public setStepCount(I)V
    .locals 2

    const/4 v0, 0x2

    if-ge p1, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "stepCount must be >= 2"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput p1, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->C:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator;->D:I

    invoke-direct {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->c()V

    invoke-virtual {p0}, Lcom/badoualy/stepperindicator/StepperIndicator;->invalidate()V

    return-void
.end method

.method public setViewPager(Landroid/support/v4/view/ViewPager;)V
    .locals 2

    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ViewPager does not have adapter instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(Landroid/support/v4/view/ViewPager;I)V

    return-void
.end method
