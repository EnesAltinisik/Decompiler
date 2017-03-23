.class public Lat/grabner/circleprogress/CircleProgressView;
.super Landroid/view/View;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lat/grabner/circleprogress/CircleProgressView$a;
    }
.end annotation


# instance fields
.field A:Lat/grabner/circleprogress/c;

.field B:Lat/grabner/circleprogress/d;

.field private final C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:F

.field private H:F

.field private I:I

.field private J:Lat/grabner/circleprogress/e;

.field private K:I

.field private L:F

.field private M:I

.field private N:I

.field private O:F

.field private P:F

.field private Q:I

.field private R:I

.field private S:I

.field private T:I

.field private U:I

.field private V:I

.field private W:I

.field protected a:I

.field private aA:Z

.field private aB:I

.field private aC:F

.field private aD:F

.field private aE:F

.field private aF:Z

.field private aG:Z

.field private aH:I

.field private aI:Lat/grabner/circleprogress/CircleProgressView$a;

.field private aJ:F

.field private aK:Ljava/text/DecimalFormat;

.field private aL:Landroid/graphics/Typeface;

.field private aM:Landroid/graphics/Typeface;

.field private aa:Z

.field private ab:[I

.field private ac:Landroid/graphics/Paint$Cap;

.field private ad:Landroid/graphics/Paint$Cap;

.field private ae:Landroid/graphics/Paint;

.field private af:Landroid/graphics/Paint;

.field private ag:Landroid/graphics/Paint;

.field private ah:Landroid/graphics/Paint;

.field private ai:Landroid/graphics/Paint;

.field private aj:Landroid/graphics/Paint;

.field private ak:Landroid/graphics/Paint;

.field private al:Landroid/graphics/Paint;

.field private am:Landroid/graphics/Paint;

.field private an:Landroid/graphics/Paint;

.field private ao:Ljava/lang/String;

.field private ap:I

.field private aq:Ljava/lang/String;

.field private ar:Lat/grabner/circleprogress/j;

.field private as:Lat/grabner/circleprogress/i;

.field private at:Z

.field private au:Z

.field private av:Landroid/graphics/Bitmap;

.field private aw:Landroid/graphics/Paint;

.field private ax:F

.field private ay:Z

.field private az:Z

.field protected b:I

.field protected c:Landroid/graphics/RectF;

.field protected d:Landroid/graphics/RectF;

.field protected e:Landroid/graphics/PointF;

.field protected f:Landroid/graphics/RectF;

.field protected g:Landroid/graphics/RectF;

.field protected h:Landroid/graphics/RectF;

.field protected i:Landroid/graphics/RectF;

.field protected j:Landroid/graphics/RectF;

.field k:Lat/grabner/circleprogress/g;

.field l:F

.field m:F

.field n:F

.field o:F

.field p:F

.field q:F

.field r:F

.field s:F

.field t:F

.field u:F

.field v:Z

.field w:D

.field x:I

.field y:Z

.field z:Lat/grabner/circleprogress/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    const/4 v5, 0x0

    const v4, -0xff6978

    const/4 v6, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput v4, p0, Lat/grabner/circleprogress/CircleProgressView;->C:I

    iput v6, p0, Lat/grabner/circleprogress/CircleProgressView;->a:I

    iput v6, p0, Lat/grabner/circleprogress/CircleProgressView;->b:I

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->d:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->i:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->j:Landroid/graphics/RectF;

    sget-object v0, Lat/grabner/circleprogress/g;->a:Lat/grabner/circleprogress/g;

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->k:Lat/grabner/circleprogress/g;

    iput v5, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    iput v5, p0, Lat/grabner/circleprogress/CircleProgressView;->m:F

    iput v5, p0, Lat/grabner/circleprogress/CircleProgressView;->n:F

    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    iput v5, p0, Lat/grabner/circleprogress/CircleProgressView;->p:F

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->q:F

    iput v5, p0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    const/high16 v0, 0x42280000    # 42.0f

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    iput v5, p0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    const v0, 0x40333333    # 2.8f

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->u:F

    iput-boolean v6, p0, Lat/grabner/circleprogress/CircleProgressView;->v:Z

    const-wide v0, 0x408c200000000000L    # 900.0

    iput-wide v0, p0, Lat/grabner/circleprogress/CircleProgressView;->w:D

    const/16 v0, 0xa

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    new-instance v0, Lat/grabner/circleprogress/a;

    invoke-direct {v0, p0}, Lat/grabner/circleprogress/a;-><init>(Lat/grabner/circleprogress/CircleProgressView;)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->z:Lat/grabner/circleprogress/a;

    sget-object v0, Lat/grabner/circleprogress/c;->a:Lat/grabner/circleprogress/c;

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    const/16 v0, 0x28

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    const/16 v0, 0x28

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    const/16 v0, 0x10e

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    iput v8, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    iput v8, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    iput v6, p0, Lat/grabner/circleprogress/CircleProgressView;->I:I

    sget-object v0, Lat/grabner/circleprogress/e;->a:Lat/grabner/circleprogress/e;

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->J:Lat/grabner/circleprogress/e;

    const/high16 v0, -0x56000000

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->K:I

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->L:F

    const/16 v0, 0xa

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->M:I

    const/16 v0, 0xa

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->N:I

    iput v8, p0, Lat/grabner/circleprogress/CircleProgressView;->O:F

    iput v8, p0, Lat/grabner/circleprogress/CircleProgressView;->P:F

    const/high16 v0, -0x56000000

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->Q:I

    const/high16 v0, -0x56000000

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->R:I

    iput v4, p0, Lat/grabner/circleprogress/CircleProgressView;->S:I

    iput v6, p0, Lat/grabner/circleprogress/CircleProgressView;->T:I

    const v0, -0x557c2f37

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->U:I

    const/high16 v0, -0x1000000

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->V:I

    const/high16 v0, -0x1000000

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->W:I

    iput-boolean v6, p0, Lat/grabner/circleprogress/CircleProgressView;->aa:Z

    new-array v0, v7, [I

    aput v4, v0, v6

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ac:Landroid/graphics/Paint$Cap;

    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ad:Landroid/graphics/Paint$Cap;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ah:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ai:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->am:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->an:Landroid/graphics/Paint;

    const-string v0, ""

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ao:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aq:Ljava/lang/String;

    sget-object v0, Lat/grabner/circleprogress/j;->d:Lat/grabner/circleprogress/j;

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    sget-object v0, Lat/grabner/circleprogress/i;->b:Lat/grabner/circleprogress/i;

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->as:Lat/grabner/circleprogress/i;

    iput-boolean v6, p0, Lat/grabner/circleprogress/CircleProgressView;->au:Z

    iput v8, p0, Lat/grabner/circleprogress/CircleProgressView;->ax:F

    iput-boolean v6, p0, Lat/grabner/circleprogress/CircleProgressView;->ay:Z

    iput-boolean v6, p0, Lat/grabner/circleprogress/CircleProgressView;->az:Z

    iput-boolean v6, p0, Lat/grabner/circleprogress/CircleProgressView;->aA:Z

    const/16 v0, 0x12

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aB:I

    const v0, 0x3f666666    # 0.9f

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aC:F

    const/16 v0, 0x168

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aB:I

    div-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aD:F

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aD:F

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aC:F

    mul-float/2addr v0, v1

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aE:F

    iput-boolean v6, p0, Lat/grabner/circleprogress/CircleProgressView;->aF:Z

    iput-boolean v6, p0, Lat/grabner/circleprogress/CircleProgressView;->aG:Z

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aK:Ljava/text/DecimalFormat;

    sget-object v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barWidth:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setBarWidth(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_rimWidth:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setRimWidth(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_spinSpeed:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->u:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setSpinSpeed(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_spin:I

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->v:Z

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setSpin(Z)V

    invoke-static {}, Lat/grabner/circleprogress/g;->values()[Lat/grabner/circleprogress/g;

    move-result-object v0

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_direction:I

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setDirection(Lat/grabner/circleprogress/g;)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_value:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setValue(F)V

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_11

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor1:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_11

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor2:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_11

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor3:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_11

    const/4 v0, 0x4

    new-array v0, v0, [I

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    aput v2, v0, v6

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor1:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    aput v2, v0, v7

    const/4 v2, 0x2

    sget v3, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor2:I

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    aput v3, v0, v2

    const/4 v2, 0x3

    sget v3, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor3:I

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    aput v3, v0, v2

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    :goto_0
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barStrokeCap:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lat/grabner/circleprogress/h;->values()[Lat/grabner/circleprogress/h;

    move-result-object v0

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barStrokeCap:I

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    aget-object v0, v0, v2

    iget-object v0, v0, Lat/grabner/circleprogress/h;->d:Landroid/graphics/Paint$Cap;

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setBarStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_0
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barStartEndLineWidth:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barStartEndLine:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barStartEndLineWidth:I

    invoke-virtual {v1, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    float-to-int v0, v0

    invoke-static {}, Lat/grabner/circleprogress/e;->values()[Lat/grabner/circleprogress/e;

    move-result-object v2

    sget v3, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barStartEndLine:I

    const/4 v4, 0x3

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    aget-object v2, v2, v3

    sget v3, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barStartEndLineColor:I

    iget v4, p0, Lat/grabner/circleprogress/CircleProgressView;->K:I

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    sget v4, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barStartEndLineSweep:I

    iget v5, p0, Lat/grabner/circleprogress/CircleProgressView;->L:F

    invoke-virtual {v1, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    invoke-virtual {p0, v0, v2, v3, v4}, Lat/grabner/circleprogress/CircleProgressView;->a(ILat/grabner/circleprogress/e;IF)V

    :cond_1
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_spinColor:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->S:I

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setSpinBarColor(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_spinBarLength:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setSpinningBarLength(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textSize:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textSize:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->N:I

    int-to-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setTextSize(I)V

    :cond_2
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitSize:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitSize:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->M:I

    int-to-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setUnitSize(I)V

    :cond_3
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textColor:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textColor:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->V:I

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setTextColor(I)V

    :cond_4
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitColor:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitColor:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->W:I

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setUnitColor(I)V

    :cond_5
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_autoTextColor:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_6

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_autoTextColor:I

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->aa:Z

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setTextColorAuto(Z)V

    :cond_6
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_autoTextSize:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_7

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_autoTextSize:I

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->at:Z

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setAutoTextSize(Z)V

    :cond_7
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textMode:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lat/grabner/circleprogress/i;->values()[Lat/grabner/circleprogress/i;

    move-result-object v0

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textMode:I

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setTextMode(Lat/grabner/circleprogress/i;)V

    :cond_8
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitPosition:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Lat/grabner/circleprogress/j;->values()[Lat/grabner/circleprogress/j;

    move-result-object v0

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitPosition:I

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setUnitPosition(Lat/grabner/circleprogress/j;)V

    :cond_9
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_text:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_a

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_text:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setText(Ljava/lang/String;)V

    :cond_a
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitToTextScale:I

    invoke-virtual {v1, v0, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setUnitToTextScale(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_rimColor:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->U:I

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setRimColor(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_fillColor:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->T:I

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setFillCircleColor(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_outerContourColor:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->Q:I

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setOuterContourColor(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_outerContourSize:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setOuterContourSize(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_innerContourColor:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->R:I

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setInnerContourColor(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_innerContourSize:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setInnerContourSize(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_maxValue:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setMaxValue(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_minValueAllowed:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->p:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setMinValueAllowed(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_maxValueAllowed:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->q:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setMaxValueAllowed(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_roundToBlock:I

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->aF:Z

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setRoundToBlock(Z)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_roundToWholeNumber:I

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->aG:Z

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setRoundToWholeNumber(Z)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unit:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setUnit(Ljava/lang/String;)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_showUnit:I

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->au:Z

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setUnitVisible(Z)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textScale:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->O:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setTextScale(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitScale:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->P:F

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setUnitScale(F)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_seekMode:I

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->ay:Z

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setSeekModeEnabled(Z)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_startAngle:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setStartAngle(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_showTextInSpinningMode:I

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->az:Z

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setShowTextWhileSpinning(Z)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_blockCount:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_b

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_blockCount:I

    invoke-virtual {v1, v0, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setBlockCount(I)V

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_blockScale:I

    const v2, 0x3f666666    # 0.9f

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setBlockScale(F)V

    :cond_b
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textTypeface:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_c

    :try_start_0
    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_textTypeface:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aL:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :cond_c
    :goto_1
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitTypeface:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_d

    :try_start_1
    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_unitTypeface:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aM:Landroid/graphics/Typeface;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_d
    :goto_2
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_decimalFormat:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_e

    :try_start_2
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_decimalFormat:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v2, Ljava/text/DecimalFormat;

    invoke-direct {v2, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->aK:Ljava/text/DecimalFormat;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_e
    :goto_3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_f

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_f

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lat/grabner/circleprogress/CircleProgressView;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_f
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v7}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aw:Landroid/graphics/Paint;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aw:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aw:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->b()V

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->v:Z

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->d()V

    :cond_10
    return-void

    :cond_11
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_12

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor1:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_12

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor2:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x3

    new-array v0, v0, [I

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    aput v2, v0, v6

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor1:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    aput v2, v0, v7

    const/4 v2, 0x2

    sget v3, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor2:I

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    aput v3, v0, v2

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    goto/16 :goto_0

    :cond_12
    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_13

    sget v0, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor1:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_13

    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    aput v2, v0, v6

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor1:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    aput v2, v0, v7

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    goto/16 :goto_0

    :cond_13
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    aput v2, v0, v6

    sget v2, Lat/grabner/circleprogress/R$styleable;->CircleProgressView_cpv_barColor:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    aput v2, v0, v7

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v2, "CircleView"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_2

    :catch_2
    move-exception v0

    goto/16 :goto_1
.end method

.method public static a(Landroid/graphics/PointF;Landroid/graphics/PointF;)D
    .locals 4

    iget v0, p1, Landroid/graphics/PointF;->y:F

    iget v1, p0, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    iget v2, p1, Landroid/graphics/PointF;->x:F

    iget v3, p0, Landroid/graphics/PointF;->x:F

    sub-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    if-gez v2, :cond_0

    const-wide v2, 0x4076800000000000L    # 360.0

    add-double/2addr v0, v2

    :cond_0
    return-wide v0
.end method

.method private static a(F)F
    .locals 2

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float v0, p0, v1

    add-float/2addr v0, v1

    rem-float/2addr v0, v1

    return v0
.end method

.method private a(Landroid/graphics/PointF;)F
    .locals 4

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->e:Landroid/graphics/PointF;

    invoke-static {v0, p1}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->k:Lat/grabner/circleprogress/g;

    sget-object v3, Lat/grabner/circleprogress/g;->a:Lat/grabner/circleprogress/g;

    if-ne v2, v3, :cond_0

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    long-to-float v0, v0

    :goto_0
    invoke-static {v0}, Lat/grabner/circleprogress/CircleProgressView;->a(F)F

    move-result v0

    return v0

    :cond_0
    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-long v2, v2

    sub-long v0, v2, v0

    long-to-float v0, v0

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)F
    .locals 5

    const/4 v4, 0x0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    const/16 v2, 0x31

    const/16 v3, 0x30

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p1, v2, v4, v3, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    sget-object v1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v2, p2, v1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    const/16 v1, 0x9

    new-array v1, v1, [F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    aget v1, v1, v4

    mul-float/2addr v0, v1

    return v0
.end method

.method private a(D)I
    .locals 11

    const/4 v2, 0x0

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    const/4 v0, 0x1

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v1, v1

    if-le v1, v0, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getMaxValue()F

    move-result v3

    div-float/2addr v1, v3

    float-to-double v4, v1

    mul-double/2addr v4, p1

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    int-to-double v6, v1

    mul-double/2addr v6, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v3, v6

    add-int/lit8 v1, v3, 0x1

    if-gez v3, :cond_0

    move v1, v2

    :goto_0
    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    aget v1, v2, v1

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    aget v0, v2, v0

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    int-to-double v2, v2

    mul-double/2addr v2, v4

    rem-double/2addr v2, v8

    sub-double v2, v8, v2

    double-to-float v2, v2

    invoke-static {v1, v0, v2}, Lat/grabner/circleprogress/f;->a(IIF)I

    move-result v0

    :goto_1
    return v0

    :cond_0
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v0, v0

    if-lt v1, v0, :cond_3

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v0, v0

    add-int/lit8 v1, v0, -0x2

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v1, v1

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    aget v0, v0, v2

    goto :goto_1

    :cond_2
    const/high16 v0, -0x1000000

    goto :goto_1

    :cond_3
    move v0, v1

    move v1, v3

    goto :goto_0
.end method

.method private a(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 7

    const/high16 v0, 0x3f800000    # 1.0f

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    sub-float/2addr v1, v2

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    sub-float/2addr v1, v2

    float-to-double v2, v1

    div-double/2addr v2, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v1

    double-to-float v2, v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v1, v2

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lat/grabner/circleprogress/CircleProgressView$1;->a:[I

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    invoke-virtual {v3}, Lat/grabner/circleprogress/j;->ordinal()I

    move-result v3

    aget v1, v1, v3

    packed-switch v1, :pswitch_data_0

    :cond_0
    move v1, v0

    :goto_0
    new-instance v3, Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->left:F

    mul-float v5, v2, v1

    add-float/2addr v4, v5

    iget v5, p1, Landroid/graphics/RectF;->top:F

    mul-float v6, v2, v0

    add-float/2addr v5, v6

    iget v6, p1, Landroid/graphics/RectF;->right:F

    mul-float/2addr v1, v2

    sub-float v1, v6, v1

    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v0, v2

    sub-float v0, v6, v0

    invoke-direct {v3, v4, v5, v1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v3

    :pswitch_0
    const v1, 0x3f8ccccd    # 1.1f

    const v0, 0x3f6147ae    # 0.88f

    goto :goto_0

    :pswitch_1
    const v1, 0x3f451eb8    # 0.77f

    const v0, 0x3faa3d71    # 1.33f

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 6

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    :cond_0
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->k:Lat/grabner/circleprogress/g;

    sget-object v1, Lat/grabner/circleprogress/g;->a:Lat/grabner/circleprogress/g;

    if-ne v0, v1, :cond_1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-float v0, v0

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    add-float/2addr v0, v1

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    sub-float v2, v0, v1

    :goto_0
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void

    :cond_1
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-float v0, v0

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->t:F

    sub-float v2, v0, v1

    goto :goto_0
.end method

.method private a(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    .locals 7

    const/4 v0, 0x0

    move v6, v0

    :goto_0
    cmpg-float v0, v6, p4

    if-gez v0, :cond_0

    add-float v2, p3, v6

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aE:F

    sub-float v1, p4, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v3

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aD:F

    add-float/2addr v0, v6

    move v6, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static b(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 6

    const/high16 v5, 0x40000000    # 2.0f

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1, p0, v1, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v1, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    const v3, 0x3f6e147b    # 0.93f

    mul-float/2addr v0, v3

    add-float/2addr v0, v2

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iget v3, p2, Landroid/graphics/RectF;->left:F

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v4

    sub-float/2addr v4, v1

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/RectF;->left:F

    iget v3, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v4

    sub-float/2addr v4, v0

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/RectF;->top:F

    iget v3, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v3

    iput v1, v2, Landroid/graphics/RectF;->right:F

    iget v1, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v1

    iput v0, v2, Landroid/graphics/RectF;->bottom:F

    return-object v2
.end method

.method private b(F)V
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aI:Lat/grabner/circleprogress/CircleProgressView$a;

    if-eqz v0, :cond_0

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aJ:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aI:Lat/grabner/circleprogress/CircleProgressView$a;

    invoke-interface {v0, p1}, Lat/grabner/circleprogress/CircleProgressView$a;->a(F)V

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aJ:F

    :cond_0
    return-void
.end method

.method private e()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ap:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    return-void
.end method

.method private f()V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v0, v0

    if-le v0, v7, :cond_1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/SweepGradient;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    iget-object v4, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    neg-float v1, v1

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    neg-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    aget v1, v1, v6

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    :goto_0
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ac:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ac:Landroid/graphics/Paint$Cap;

    sget-object v1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    if-eq v0, v1, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->af:Landroid/graphics/Paint;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->af:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->af:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    aget v1, v1, v6

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v0, v0

    if-ne v0, v7, :cond_2

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    aget v1, v1, v6

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    const v1, -0xff6978

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    goto :goto_0
.end method

.method private setSpin(Z)V
    .locals 0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->v:Z

    return-void
.end method

.method private setTextSizeAndTextBoundsWithFixedTextSize(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->N:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-static {p1, v0, v1}, Lat/grabner/circleprogress/CircleProgressView;->b(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public a(FFJ)V
    .locals 5

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aA:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aF:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aB:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    div-float v1, p2, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    mul-float p2, v1, v0

    :cond_0
    :goto_0
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->p:F

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->q:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_1

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->q:F

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    :cond_1
    long-to-double v2, p3

    iput-wide v2, p0, Lat/grabner/circleprogress/CircleProgressView;->w:D

    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    sget v2, Lat/grabner/circleprogress/b;->d:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Landroid/os/Message;->what:I

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput p1, v2, v3

    const/4 v3, 0x1

    aput v0, v2, v3

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->z:Lat/grabner/circleprogress/a;

    invoke-virtual {v2, v1}, Lat/grabner/circleprogress/a;->sendMessage(Landroid/os/Message;)Z

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->b(F)V

    return-void

    :cond_2
    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aG:Z

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float p2, v0

    goto :goto_0
.end method

.method public a(FJ)V
    .locals 2

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    invoke-virtual {p0, v0, p1, p2, p3}, Lat/grabner/circleprogress/CircleProgressView;->a(FFJ)V

    return-void
.end method

.method public a(ILat/grabner/circleprogress/e;IF)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->I:I

    iput-object p2, p0, Lat/grabner/circleprogress/CircleProgressView;->J:Lat/grabner/circleprogress/e;

    iput p3, p0, Lat/grabner/circleprogress/CircleProgressView;->K:I

    iput p4, p0, Lat/grabner/circleprogress/CircleProgressView;->L:F

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->au:Z

    return v0
.end method

.method public b()V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0}, Lat/grabner/circleprogress/CircleProgressView;->f()V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ad:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->S:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->am:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->Q:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->am:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->am:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->am:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->an:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->R:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->an:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->an:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->an:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aM:Landroid/graphics/Typeface;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aM:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_0
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setLinearText(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->V:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->N:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aL:Landroid/graphics/Typeface;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aL:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_0
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ai:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->T:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ai:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ai:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->U:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ah:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->K:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ah:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ah:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ah:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->I:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void

    :cond_1
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    goto :goto_0
.end method

.method public c()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setSpin(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->z:Lat/grabner/circleprogress/a;

    sget v1, Lat/grabner/circleprogress/b;->b:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lat/grabner/circleprogress/a;->sendEmptyMessage(I)Z

    return-void
.end method

.method public d()V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setSpin(Z)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->z:Lat/grabner/circleprogress/a;

    sget v1, Lat/grabner/circleprogress/b;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lat/grabner/circleprogress/a;->sendEmptyMessage(I)Z

    return-void
.end method

.method public getBarColors()[I
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    return-object v0
.end method

.method public getBarStartEndLine()Lat/grabner/circleprogress/e;
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->J:Lat/grabner/circleprogress/e;

    return-object v0
.end method

.method public getBarStrokeCap()Landroid/graphics/Paint$Cap;
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ac:Landroid/graphics/Paint$Cap;

    return-object v0
.end method

.method public getBarWidth()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    return v0
.end method

.method public getBlockCount()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aB:I

    return v0
.end method

.method public getBlockScale()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aC:F

    return v0
.end method

.method public getCurrentValue()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    return v0
.end method

.method public getDecimalFormat()Ljava/text/DecimalFormat;
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aK:Ljava/text/DecimalFormat;

    return-object v0
.end method

.method public getDelayMillis()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    return v0
.end method

.method public getFillColor()I
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ai:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getInnerContourColor()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->R:I

    return v0
.end method

.method public getInnerContourSize()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    return v0
.end method

.method public getMaxValue()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    return v0
.end method

.method public getMaxValueAllowed()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->q:F

    return v0
.end method

.method public getMinValueAllowed()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->p:F

    return v0
.end method

.method public getOuterContourColor()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->Q:I

    return v0
.end method

.method public getOuterContourSize()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    return v0
.end method

.method public getRelativeUniteSize()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ax:F

    return v0
.end method

.method public getRimColor()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->U:I

    return v0
.end method

.method public getRimShader()Landroid/graphics/Shader;
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v0

    return-object v0
.end method

.method public getRimWidth()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    return v0
.end method

.method public getRoundToBlock()Z
    .locals 1

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aF:Z

    return v0
.end method

.method public getRoundToWholeNumber()Z
    .locals 1

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aG:Z

    return v0
.end method

.method public getSpinSpeed()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->u:F

    return v0
.end method

.method public getSpinnerStrokeCap()Landroid/graphics/Paint$Cap;
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ad:Landroid/graphics/Paint$Cap;

    return-object v0
.end method

.method public getStartAngle()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    return v0
.end method

.method public getTextScale()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->O:F

    return v0
.end method

.method public getTextSize()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->N:I

    return v0
.end method

.method public getUnit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aq:Ljava/lang/String;

    return-object v0
.end method

.method public getUnitScale()F
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->P:F

    return v0
.end method

.method public getUnitSize()I
    .locals 1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->M:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const/high16 v0, 0x43b40000    # 360.0f

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    div-float/2addr v0, v1

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    mul-float v7, v0, v1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->T:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->d:Landroid/graphics/RectF;

    const/high16 v2, 0x43b40000    # 360.0f

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->ai:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_0
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    if-lez v0, :cond_1

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aA:Z

    if-nez v0, :cond_10

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    const/high16 v2, 0x43b40000    # 360.0f

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_1
    :goto_0
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->i:Landroid/graphics/RectF;

    const/high16 v2, 0x43b40000    # 360.0f

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->am:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_2
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->j:Landroid/graphics/RectF;

    const/high16 v2, 0x43b40000    # 360.0f

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->an:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_3
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    sget-object v1, Lat/grabner/circleprogress/c;->b:Lat/grabner/circleprogress/c;

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    sget-object v1, Lat/grabner/circleprogress/c;->c:Lat/grabner/circleprogress/c;

    if-ne v0, v1, :cond_11

    :cond_4
    invoke-direct {p0, p1}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->az:Z

    if-eqz v0, :cond_a

    :goto_1
    sget-object v0, Lat/grabner/circleprogress/CircleProgressView$1;->a:[I

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    invoke-virtual {v1}, Lat/grabner/circleprogress/j;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const v0, 0x3f0ccccd    # 0.55f

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ax:F

    mul-float/2addr v1, v0

    const v0, 0x3e99999a    # 0.3f

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->ax:F

    mul-float/2addr v0, v2

    :goto_2
    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    const v3, 0x3d4ccccd    # 0.05f

    mul-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    mul-float v4, v2, v0

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    const v2, 0x3ccccccd    # 0.025f

    mul-float/2addr v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v5, v0, v2

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    mul-float v6, v0, v1

    const/4 v1, 0x0

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aa:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    float-to-double v8, v2

    invoke-direct {p0, v8, v9}, Lat/grabner/circleprogress/CircleProgressView;->a(D)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    :cond_5
    sget-object v0, Lat/grabner/circleprogress/CircleProgressView$1;->b:[I

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->as:Lat/grabner/circleprogress/i;

    invoke-virtual {v2}, Lat/grabner/circleprogress/i;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ao:Ljava/lang/String;

    if-eqz v0, :cond_17

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ao:Ljava/lang/String;

    :goto_3
    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->ap:I

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v2, v8, :cond_7

    const/4 v2, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ap:I

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ap:I

    const/4 v8, 0x1

    if-ne v1, v8, :cond_18

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-direct {p0, v1}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v1

    iput-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    new-instance v1, Landroid/graphics/RectF;

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->left:F

    iget-object v9, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    invoke-virtual {v9}, Landroid/graphics/RectF;->width()F

    move-result v9

    const v10, 0x3dcccccd    # 0.1f

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    iget-object v9, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v9, v9, Landroid/graphics/RectF;->top:F

    iget-object v10, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v10, v10, Landroid/graphics/RectF;->right:F

    iget-object v11, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    move-result v11

    const v12, 0x3dcccccd    # 0.1f

    mul-float/2addr v11, v12

    sub-float/2addr v10, v11

    iget-object v11, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v11, v11, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v1, v8, v9, v10, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    :goto_4
    iget-boolean v1, p0, Lat/grabner/circleprogress/CircleProgressView;->at:Z

    if-eqz v1, :cond_19

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget-boolean v8, p0, Lat/grabner/circleprogress/CircleProgressView;->au:Z

    if-eqz v8, :cond_6

    sget-object v1, Lat/grabner/circleprogress/CircleProgressView$1;->a:[I

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    invoke-virtual {v8}, Lat/grabner/circleprogress/j;->ordinal()I

    move-result v8

    aget v1, v1, v8

    packed-switch v1, :pswitch_data_2

    :pswitch_0
    new-instance v1, Landroid/graphics/RectF;

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->left:F

    iget-object v9, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v9, v9, Landroid/graphics/RectF;->top:F

    iget-object v10, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v10, v10, Landroid/graphics/RectF;->right:F

    sub-float/2addr v10, v4

    sub-float/2addr v10, v3

    iget-object v11, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v11, v11, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v1, v8, v9, v10, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    :cond_6
    :goto_5
    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    iget-object v9, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-static {v0, v9, v1}, Lat/grabner/circleprogress/CircleProgressView;->a(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)F

    move-result v9

    iget v10, p0, Lat/grabner/circleprogress/CircleProgressView;->O:F

    mul-float/2addr v9, v10

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-static {v0, v8, v1}, Lat/grabner/circleprogress/CircleProgressView;->b(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v1

    iput-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    move v1, v2

    :cond_7
    :goto_6
    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-virtual {v8}, Landroid/graphics/Paint;->getTextSize()F

    move-result v8

    const v9, 0x3ca3d70a    # 0.02f

    mul-float/2addr v8, v9

    sub-float/2addr v2, v8

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    iget-object v9, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v8, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->au:Z

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aa:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    float-to-double v8, v2

    invoke-direct {p0, v8, v9}, Lat/grabner/circleprogress/CircleProgressView;->a(D)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    :cond_8
    if-eqz v1, :cond_9

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->at:Z

    if-eqz v0, :cond_1a

    sget-object v0, Lat/grabner/circleprogress/CircleProgressView$1;->a:[I

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    invoke-virtual {v1}, Lat/grabner/circleprogress/j;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_3

    :pswitch_1
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v4

    add-float/2addr v1, v3

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    add-float/2addr v4, v6

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    :goto_7
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aq:Ljava/lang/String;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    invoke-static {v1, v2, v3}, Lat/grabner/circleprogress/CircleProgressView;->a(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)F

    move-result v1

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->P:F

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aq:Ljava/lang/String;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    invoke-static {v0, v1, v2}, Lat/grabner/circleprogress/CircleProgressView;->b(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    sget-object v0, Lat/grabner/circleprogress/CircleProgressView$1;->a:[I

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    invoke-virtual {v1}, Lat/grabner/circleprogress/j;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_4

    :cond_9
    :goto_8
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aq:Ljava/lang/String;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    const v3, 0x3ca3d70a    # 0.02f

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_a
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->av:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->av:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->aw:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_b
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->I:I

    if-lez v0, :cond_f

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->J:Lat/grabner/circleprogress/e;

    sget-object v1, Lat/grabner/circleprogress/e;->a:Lat/grabner/circleprogress/e;

    if-eq v0, v1, :cond_f

    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->k:Lat/grabner/circleprogress/g;

    sget-object v1, Lat/grabner/circleprogress/g;->a:Lat/grabner/circleprogress/g;

    if-ne v0, v1, :cond_1b

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-float v0, v0

    :goto_9
    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->L:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v2, v0, v1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->J:Lat/grabner/circleprogress/e;

    sget-object v1, Lat/grabner/circleprogress/e;->b:Lat/grabner/circleprogress/e;

    if-eq v0, v1, :cond_c

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->J:Lat/grabner/circleprogress/e;

    sget-object v1, Lat/grabner/circleprogress/e;->d:Lat/grabner/circleprogress/e;

    if-ne v0, v1, :cond_d

    :cond_c
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->L:F

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->ah:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_d
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->J:Lat/grabner/circleprogress/e;

    sget-object v1, Lat/grabner/circleprogress/e;->c:Lat/grabner/circleprogress/e;

    if-eq v0, v1, :cond_e

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->J:Lat/grabner/circleprogress/e;

    sget-object v1, Lat/grabner/circleprogress/e;->d:Lat/grabner/circleprogress/e;

    if-ne v0, v1, :cond_f

    :cond_e
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    add-float/2addr v2, v7

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->L:F

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->ah:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_f
    return-void

    :cond_10
    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-float v3, v0

    const/high16 v4, 0x43b40000    # 360.0f

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    :cond_11
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->A:Lat/grabner/circleprogress/c;

    sget-object v1, Lat/grabner/circleprogress/c;->d:Lat/grabner/circleprogress/c;

    if-ne v0, v1, :cond_12

    invoke-direct {p0, p1}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->y:Z

    if-nez v0, :cond_12

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->az:Z

    if-eqz v0, :cond_a

    goto/16 :goto_1

    :cond_12
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->k:Lat/grabner/circleprogress/g;

    sget-object v1, Lat/grabner/circleprogress/g;->a:Lat/grabner/circleprogress/g;

    if-ne v0, v1, :cond_13

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-float v2, v0

    :goto_a
    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aA:Z

    if-nez v0, :cond_16

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ac:Landroid/graphics/Paint$Cap;

    sget-object v1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    if-eq v0, v1, :cond_15

    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-lez v0, :cond_15

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_15

    const/high16 v0, 0x43340000    # 180.0f

    cmpl-float v0, v7, v0

    if-lez v0, :cond_14

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    const/high16 v0, 0x40000000    # 2.0f

    div-float v3, v7, v0

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->af:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v7, v0

    add-float/2addr v2, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float v3, v7, v0

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto/16 :goto_1

    :cond_13
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-float v0, v0

    sub-float v2, v0, v7

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    move-object v0, p1

    move v3, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->af:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto/16 :goto_1

    :cond_15
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    const/4 v4, 0x0

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    move-object v0, p1

    move v3, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto/16 :goto_1

    :cond_16
    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    move-object v3, p0

    move-object v4, p1

    move v6, v2

    invoke-direct/range {v3 .. v8}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    :pswitch_2
    const/high16 v0, 0x3e800000    # 0.25f

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ax:F

    mul-float/2addr v1, v0

    const v0, 0x3ecccccd    # 0.4f

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->ax:F

    mul-float/2addr v0, v2

    goto/16 :goto_2

    :cond_17
    const-string v0, ""

    goto/16 :goto_3

    :pswitch_3
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aK:Ljava/text/DecimalFormat;

    const/high16 v2, 0x42c80000    # 100.0f

    iget v8, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    div-float/2addr v2, v8

    iget v8, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    mul-float/2addr v2, v8

    float-to-double v8, v2

    invoke-virtual {v0, v8, v9}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    :pswitch_4
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aK:Ljava/text/DecimalFormat;

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->l:F

    float-to-double v8, v2

    invoke-virtual {v0, v8, v9}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    :cond_18
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-direct {p0, v1}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v1

    iput-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    goto/16 :goto_4

    :pswitch_5
    new-instance v1, Landroid/graphics/RectF;

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->left:F

    iget-object v9, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v9, v9, Landroid/graphics/RectF;->top:F

    add-float/2addr v9, v6

    add-float/2addr v9, v5

    iget-object v10, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v10, v10, Landroid/graphics/RectF;->right:F

    iget-object v11, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v11, v11, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v1, v8, v9, v10, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto/16 :goto_5

    :pswitch_6
    new-instance v1, Landroid/graphics/RectF;

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->left:F

    iget-object v9, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v9, v9, Landroid/graphics/RectF;->top:F

    iget-object v10, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v10, v10, Landroid/graphics/RectF;->right:F

    iget-object v11, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v11, v11, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v11, v6

    sub-float/2addr v11, v5

    invoke-direct {v1, v8, v9, v10, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto/16 :goto_5

    :pswitch_7
    new-instance v1, Landroid/graphics/RectF;

    iget-object v8, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->left:F

    add-float/2addr v8, v4

    add-float/2addr v8, v3

    iget-object v9, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v9, v9, Landroid/graphics/RectF;->top:F

    iget-object v10, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v10, v10, Landroid/graphics/RectF;->right:F

    iget-object v11, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v11, v11, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v1, v8, v9, v10, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto/16 :goto_5

    :cond_19
    invoke-direct {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->setTextSizeAndTextBoundsWithFixedTextSize(Ljava/lang/String;)V

    move v1, v2

    goto/16 :goto_6

    :pswitch_8
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    add-float/2addr v4, v6

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    goto/16 :goto_7

    :pswitch_9
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v2, v6

    add-float/2addr v2, v5

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    goto/16 :goto_7

    :pswitch_a
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v5, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->left:F

    add-float/2addr v4, v5

    sub-float v3, v4, v3

    iget-object v4, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    add-float/2addr v4, v6

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    goto/16 :goto_7

    :pswitch_b
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/RectF;->offset(FF)V

    goto/16 :goto_8

    :pswitch_c
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/RectF;->offset(FF)V

    goto/16 :goto_8

    :cond_1a
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v5

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->M:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->aq:Ljava/lang/String;

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    iget-object v4, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    invoke-static {v2, v3, v4}, Lat/grabner/circleprogress/CircleProgressView;->b(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v2

    iput-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    sget-object v2, Lat/grabner/circleprogress/CircleProgressView$1;->a:[I

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    invoke-virtual {v3}, Lat/grabner/circleprogress/j;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_5

    :pswitch_d
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    add-float/2addr v0, v2

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/RectF;->offsetTo(FF)V

    :goto_b
    sget-object v0, Lat/grabner/circleprogress/CircleProgressView$1;->a:[I

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    invoke-virtual {v1}, Lat/grabner/circleprogress/j;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_6

    goto/16 :goto_8

    :pswitch_e
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/RectF;->offset(FF)V

    goto/16 :goto_8

    :pswitch_f
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float v1, v3, v1

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    sub-float/2addr v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/graphics/RectF;->offsetTo(FF)V

    goto :goto_b

    :pswitch_10
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/graphics/RectF;->offsetTo(FF)V

    goto :goto_b

    :pswitch_11
    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float v0, v2, v0

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    sub-float/2addr v0, v2

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/RectF;->offsetTo(FF)V

    goto :goto_b

    :pswitch_12
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->g:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->h:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/RectF;->offset(FF)V

    goto/16 :goto_8

    :cond_1b
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    int-to-float v0, v0

    sub-float/2addr v0, v7

    goto/16 :goto_9

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_0
        :pswitch_7
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_1
        :pswitch_a
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x3
        :pswitch_b
        :pswitch_b
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_d
        :pswitch_11
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x3
        :pswitch_e
        :pswitch_e
        :pswitch_12
        :pswitch_12
    .end packed-switch
.end method

.method protected onMeasure(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingRight()I

    move-result v1

    sub-int v1, v0, v1

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingTop()I

    move-result v0

    sub-int v0, v2, v0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v0, v2

    if-le v1, v0, :cond_0

    :goto_0
    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingTop()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingBottom()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Lat/grabner/circleprogress/CircleProgressView;->setMeasuredDimension(II)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 12

    invoke-super/range {p0 .. p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->b:I

    iput p2, p0, Lat/grabner/circleprogress/CircleProgressView;->a:I

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->b:I

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->a:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->b:I

    sub-int/2addr v1, v0

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->a:I

    sub-int v0, v2, v0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingTop()I

    move-result v2

    div-int/lit8 v3, v0, 0x2

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingBottom()I

    move-result v3

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v3

    int-to-float v3, v0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingLeft()I

    move-result v0

    div-int/lit8 v4, v1, 0x2

    add-int/2addr v0, v4

    int-to-float v4, v0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getPaddingRight()I

    move-result v0

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-float v1, v0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getWidth()I

    move-result v5

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getHeight()I

    move-result v6

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v0, v0

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v0, v7

    iget v7, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    iget v8, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    add-float/2addr v7, v8

    cmpl-float v0, v0, v7

    if-lez v0, :cond_1

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v0, v0

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v0, v7

    :goto_0
    new-instance v7, Landroid/graphics/RectF;

    add-float v8, v4, v0

    add-float v9, v2, v0

    int-to-float v10, v5

    sub-float/2addr v10, v1

    sub-float/2addr v10, v0

    int-to-float v11, v6

    sub-float/2addr v11, v3

    sub-float v0, v11, v0

    invoke-direct {v7, v8, v9, v10, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v7, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    iget v7, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v7, v7

    add-float/2addr v4, v7

    iget v7, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v7, v7

    add-float/2addr v2, v7

    int-to-float v5, v5

    sub-float v1, v5, v1

    iget v5, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v5, v5

    sub-float/2addr v1, v5

    int-to-float v5, v6

    sub-float v3, v5, v3

    iget v5, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    int-to-float v5, v5

    sub-float/2addr v3, v5

    invoke-direct {v0, v4, v2, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->d:Landroid/graphics/RectF;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->f:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget v4, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget-object v4, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    iget v5, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v4, v5

    iget v5, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->j:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget-object v3, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget v4, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    iget v5, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    iget v5, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->i:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->e:Landroid/graphics/PointF;

    invoke-direct {p0}, Lat/grabner/circleprogress/CircleProgressView;->f()V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->av:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->av:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->av:Landroid/graphics/Bitmap;

    :cond_0
    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    return-void

    :cond_1
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    int-to-float v0, v0

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v0, v7

    iget v7, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    add-float/2addr v0, v7

    goto/16 :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v0, 0x1

    const/high16 v4, 0x43b40000    # 360.0f

    const/4 v1, 0x0

    iget-boolean v2, p0, Lat/grabner/circleprogress/CircleProgressView;->ay:Z

    if-nez v2, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    :pswitch_0
    iput v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aH:I

    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {p0, v1}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/PointF;)F

    move-result v1

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    div-float/2addr v2, v4

    mul-float/2addr v1, v2

    const-wide/16 v2, 0x320

    invoke-virtual {p0, v1, v2, v3}, Lat/grabner/circleprogress/CircleProgressView;->a(FJ)V

    goto :goto_0

    :pswitch_1
    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->aH:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lat/grabner/circleprogress/CircleProgressView;->aH:I

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->aH:I

    const/4 v3, 0x5

    if-le v2, v3, :cond_1

    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {p0, v1}, Lat/grabner/circleprogress/CircleProgressView;->a(Landroid/graphics/PointF;)F

    move-result v1

    iget v2, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    div-float/2addr v2, v4

    mul-float/2addr v1, v2

    invoke-virtual {p0, v1}, Lat/grabner/circleprogress/CircleProgressView;->setValue(F)V

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0

    :pswitch_2
    iput v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aH:I

    move v0, v1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setAutoTextSize(Z)V
    .locals 0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->at:Z

    return-void
.end method

.method public varargs setBarColor([I)V
    .locals 0

    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    invoke-direct {p0}, Lat/grabner/circleprogress/CircleProgressView;->f()V

    return-void
.end method

.method public setBarStrokeCap(Landroid/graphics/Paint$Cap;)V
    .locals 3

    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->ac:Landroid/graphics/Paint$Cap;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ac:Landroid/graphics/Paint$Cap;

    sget-object v1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    if-eq v0, v1, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->af:Landroid/graphics/Paint;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->af:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->af:Landroid/graphics/Paint;

    iget-object v1, p0, Lat/grabner/circleprogress/CircleProgressView;->ab:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setBarWidth(I)V
    .locals 2

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->D:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ae:Landroid/graphics/Paint;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setBlockCount(I)V
    .locals 2

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    iput-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aA:Z

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aB:I

    const/high16 v0, 0x43b40000    # 360.0f

    int-to-float v1, p1

    div-float/2addr v0, v1

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aD:F

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aD:F

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aC:F

    mul-float/2addr v0, v1

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aE:F

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aA:Z

    goto :goto_0
.end method

.method public setBlockScale(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aC:F

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aD:F

    mul-float/2addr v0, p1

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aE:F

    :cond_0
    return-void
.end method

.method public setClippingBitmap(Landroid/graphics/Bitmap;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    const/4 v3, 0x0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->av:Landroid/graphics/Bitmap;

    :goto_0
    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->av:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    const/4 v0, 0x2

    invoke-virtual {p0, v0, v3}, Lat/grabner/circleprogress/CircleProgressView;->setLayerType(ILandroid/graphics/Paint;)V

    :goto_1
    return-void

    :cond_0
    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->av:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v3}, Lat/grabner/circleprogress/CircleProgressView;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_1
.end method

.method public setDecimalFormat(Ljava/text/DecimalFormat;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "decimalFormat must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aK:Ljava/text/DecimalFormat;

    return-void
.end method

.method public setDelayMillis(I)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->x:I

    return-void
.end method

.method public setDirection(Lat/grabner/circleprogress/g;)V
    .locals 0

    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->k:Lat/grabner/circleprogress/g;

    return-void
.end method

.method public setFillCircleColor(I)V
    .locals 1

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->T:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ai:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setInnerContourColor(I)V
    .locals 1

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->R:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->an:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setInnerContourSize(F)V
    .locals 1

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->H:F

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->an:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setLengthChangeInterpolator(Landroid/animation/TimeInterpolator;)V
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->z:Lat/grabner/circleprogress/a;

    invoke-virtual {v0, p1}, Lat/grabner/circleprogress/a;->b(Landroid/animation/TimeInterpolator;)V

    return-void
.end method

.method public setMaxValue(F)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    return-void
.end method

.method public setMaxValueAllowed(F)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->q:F

    return-void
.end method

.method public setMinValueAllowed(F)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->p:F

    return-void
.end method

.method public setOnAnimationStateChangedListener(Lat/grabner/circleprogress/d;)V
    .locals 0

    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->B:Lat/grabner/circleprogress/d;

    return-void
.end method

.method public setOnProgressChangedListener(Lat/grabner/circleprogress/CircleProgressView$a;)V
    .locals 0

    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aI:Lat/grabner/circleprogress/CircleProgressView$a;

    return-void
.end method

.method public setOuterContourColor(I)V
    .locals 1

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->Q:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->am:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setOuterContourSize(F)V
    .locals 1

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->G:F

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->am:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setRimColor(I)V
    .locals 1

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->U:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setRimShader(Landroid/graphics/Shader;)V
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

.method public setRimWidth(I)V
    .locals 2

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->E:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aj:Landroid/graphics/Paint;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setRoundToBlock(Z)V
    .locals 0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aF:Z

    return-void
.end method

.method public setRoundToWholeNumber(Z)V
    .locals 0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aG:Z

    return-void
.end method

.method public setSeekModeEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->ay:Z

    return-void
.end method

.method public setShowBlock(Z)V
    .locals 0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aA:Z

    return-void
.end method

.method public setShowTextWhileSpinning(Z)V
    .locals 0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->az:Z

    return-void
.end method

.method public setSpinBarColor(I)V
    .locals 2

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->S:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->S:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setSpinSpeed(F)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->u:F

    return-void
.end method

.method public setSpinnerStrokeCap(Landroid/graphics/Paint$Cap;)V
    .locals 1

    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->ad:Landroid/graphics/Paint$Cap;

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ag:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method

.method public setSpinningBarLength(F)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->s:F

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->r:F

    return-void
.end method

.method public setStartAngle(I)V
    .locals 1

    int-to-float v0, p1

    invoke-static {v0}, Lat/grabner/circleprogress/CircleProgressView;->a(F)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lat/grabner/circleprogress/CircleProgressView;->F:I

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    :goto_0
    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->ao:Ljava/lang/String;

    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    return-void

    :cond_0
    const-string p1, ""

    goto :goto_0
.end method

.method public setTextColor(I)V
    .locals 1

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->V:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setTextColorAuto(Z)V
    .locals 0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aa:Z

    return-void
.end method

.method public setTextMode(Lat/grabner/circleprogress/i;)V
    .locals 0

    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->as:Lat/grabner/circleprogress/i;

    return-void
.end method

.method public setTextScale(F)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->O:F

    return-void
.end method

.method public setTextSize(I)V
    .locals 2

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->N:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->at:Z

    return-void
.end method

.method public setTextTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->ak:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public setUnit(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const-string v0, ""

    iput-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aq:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0}, Lat/grabner/circleprogress/CircleProgressView;->invalidate()V

    return-void

    :cond_0
    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->aq:Ljava/lang/String;

    goto :goto_0
.end method

.method public setUnitColor(I)V
    .locals 1

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->W:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aa:Z

    return-void
.end method

.method public setUnitPosition(Lat/grabner/circleprogress/j;)V
    .locals 0

    iput-object p1, p0, Lat/grabner/circleprogress/CircleProgressView;->ar:Lat/grabner/circleprogress/j;

    invoke-direct {p0}, Lat/grabner/circleprogress/CircleProgressView;->e()V

    return-void
.end method

.method public setUnitScale(F)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->P:F

    return-void
.end method

.method public setUnitSize(I)V
    .locals 2

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->M:I

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public setUnitTextTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->al:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public setUnitToTextScale(F)V
    .locals 0

    iput p1, p0, Lat/grabner/circleprogress/CircleProgressView;->ax:F

    invoke-direct {p0}, Lat/grabner/circleprogress/CircleProgressView;->e()V

    return-void
.end method

.method public setUnitVisible(Z)V
    .locals 1

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->au:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Lat/grabner/circleprogress/CircleProgressView;->au:Z

    invoke-direct {p0}, Lat/grabner/circleprogress/CircleProgressView;->e()V

    :cond_0
    return-void
.end method

.method public setValue(F)V
    .locals 4

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aA:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aF:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->o:F

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->aB:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    div-float v1, p1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    mul-float p1, v1, v0

    :cond_0
    :goto_0
    iget v0, p0, Lat/grabner/circleprogress/CircleProgressView;->p:F

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->q:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_1

    iget v1, p0, Lat/grabner/circleprogress/CircleProgressView;->q:F

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    :cond_1
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    sget v2, Lat/grabner/circleprogress/b;->c:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Landroid/os/Message;->what:I

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v3, 0x1

    aput v0, v2, v3

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v2, p0, Lat/grabner/circleprogress/CircleProgressView;->z:Lat/grabner/circleprogress/a;

    invoke-virtual {v2, v1}, Lat/grabner/circleprogress/a;->sendMessage(Landroid/os/Message;)Z

    invoke-direct {p0, v0}, Lat/grabner/circleprogress/CircleProgressView;->b(F)V

    return-void

    :cond_2
    iget-boolean v0, p0, Lat/grabner/circleprogress/CircleProgressView;->aG:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float p1, v0

    goto :goto_0
.end method

.method public setValueAnimated(F)V
    .locals 2

    const-wide/16 v0, 0x4b0

    invoke-virtual {p0, p1, v0, v1}, Lat/grabner/circleprogress/CircleProgressView;->a(FJ)V

    return-void
.end method

.method public setValueInterpolator(Landroid/animation/TimeInterpolator;)V
    .locals 1

    iget-object v0, p0, Lat/grabner/circleprogress/CircleProgressView;->z:Lat/grabner/circleprogress/a;

    invoke-virtual {v0, p1}, Lat/grabner/circleprogress/a;->a(Landroid/animation/TimeInterpolator;)V

    return-void
.end method
