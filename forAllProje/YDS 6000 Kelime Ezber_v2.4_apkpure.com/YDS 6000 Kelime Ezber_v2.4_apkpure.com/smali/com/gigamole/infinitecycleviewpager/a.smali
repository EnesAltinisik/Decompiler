.class Lcom/gigamole/infinitecycleviewpager/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/gigamole/infinitecycleviewpager/b$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/gigamole/infinitecycleviewpager/a$4;,
        Lcom/gigamole/infinitecycleviewpager/a$c;,
        Lcom/gigamole/infinitecycleviewpager/a$b;,
        Lcom/gigamole/infinitecycleviewpager/a$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:I

.field private D:Landroid/view/animation/Interpolator;

.field private E:Z

.field private F:Z

.field private final G:Landroid/os/Handler;

.field private final H:Ljava/lang/Runnable;

.field protected final a:Landroid/support/v4/view/ViewPager$f;

.field private b:Landroid/content/Context;

.field private c:Lcom/gigamole/infinitecycleviewpager/f;

.field private d:Landroid/view/View;

.field private e:Lcom/gigamole/infinitecycleviewpager/b;

.field private f:Lcom/gigamole/infinitecycleviewpager/a$b;

.field private g:Lcom/gigamole/infinitecycleviewpager/a$b;

.field private h:F

.field private i:F

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private final p:Landroid/graphics/Rect;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:I

.field private u:Lcom/gigamole/infinitecycleviewpager/d;

.field private v:F

.field private w:F

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/gigamole/infinitecycleviewpager/f;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v3, 0x2

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->a:Lcom/gigamole/infinitecycleviewpager/a$b;

    iput-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->f:Lcom/gigamole/infinitecycleviewpager/a$b;

    sget-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->a:Lcom/gigamole/infinitecycleviewpager/a$b;

    iput-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->g:Lcom/gigamole/infinitecycleviewpager/a$b;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->p:Landroid/graphics/Rect;

    iput-boolean v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->A:Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->G:Landroid/os/Handler;

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/a$1;

    invoke-direct {v0, p0}, Lcom/gigamole/infinitecycleviewpager/a$1;-><init>(Lcom/gigamole/infinitecycleviewpager/a;)V

    iput-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->H:Ljava/lang/Runnable;

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/a$3;

    invoke-direct {v0, p0}, Lcom/gigamole/infinitecycleviewpager/a$3;-><init>(Lcom/gigamole/infinitecycleviewpager/a;)V

    iput-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->a:Landroid/support/v4/view/ViewPager$f;

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->b:Landroid/content/Context;

    instance-of v0, p2, Lcom/gigamole/infinitecycleviewpager/e;

    iput-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    iput-object p2, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    check-cast p2, Landroid/view/View;

    iput-object p2, p0, Lcom/gigamole/infinitecycleviewpager/a;->d:Landroid/view/View;

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-virtual {p0}, Lcom/gigamole/infinitecycleviewpager/a;->i()Lcom/gigamole/infinitecycleviewpager/a$a;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/gigamole/infinitecycleviewpager/f;->a(ZLandroid/support/v4/view/ViewPager$g;)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->a:Landroid/support/v4/view/ViewPager$f;

    invoke-interface {v0, v1}, Lcom/gigamole/infinitecycleviewpager/f;->a(Landroid/support/v4/view/ViewPager$f;)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0, v2}, Lcom/gigamole/infinitecycleviewpager/f;->setClipChildren(Z)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0, v2}, Lcom/gigamole/infinitecycleviewpager/f;->setDrawingCacheEnabled(Z)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/gigamole/infinitecycleviewpager/f;->setWillNotCacheDrawing(Z)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0, v2}, Lcom/gigamole/infinitecycleviewpager/f;->setPageMargin(I)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0, v3}, Lcom/gigamole/infinitecycleviewpager/f;->setOffscreenPageLimit(I)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0, v3}, Lcom/gigamole/infinitecycleviewpager/f;->setOverScrollMode(I)V

    invoke-direct {p0}, Lcom/gigamole/infinitecycleviewpager/a;->q()V

    invoke-virtual {p0, p3}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic A(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->q:Z

    return v0
.end method

.method static synthetic B(Lcom/gigamole/infinitecycleviewpager/a;)F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->i:F

    return v0
.end method

.method static synthetic C(Lcom/gigamole/infinitecycleviewpager/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/gigamole/infinitecycleviewpager/a;->p()V

    return-void
.end method

.method static synthetic a(Lcom/gigamole/infinitecycleviewpager/a;F)F
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->i:F

    return p1
.end method

.method static synthetic a(Lcom/gigamole/infinitecycleviewpager/a;I)I
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->j:I

    return p1
.end method

.method static synthetic a(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->g:Lcom/gigamole/infinitecycleviewpager/a$b;

    return-object p1
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result v1

    if-eq v1, v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x2

    goto :goto_0
.end method

.method static synthetic a(Lcom/gigamole/infinitecycleviewpager/a;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->E:Z

    return v0
.end method

.method static synthetic a(Lcom/gigamole/infinitecycleviewpager/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->s:Z

    return p1
.end method

.method static synthetic b(Lcom/gigamole/infinitecycleviewpager/a;F)F
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->h:F

    return p1
.end method

.method static synthetic b(Lcom/gigamole/infinitecycleviewpager/a;I)I
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->t:I

    return p1
.end method

.method static synthetic b(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->f:Lcom/gigamole/infinitecycleviewpager/a$b;

    return-object p1
.end method

.method static synthetic b(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->F:Z

    return v0
.end method

.method static synthetic b(Lcom/gigamole/infinitecycleviewpager/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->l:Z

    return p1
.end method

.method static synthetic c(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/f;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    return-object v0
.end method

.method private c(Landroid/view/MotionEvent;)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->p:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->d:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a;->d:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a;->d:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->p:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->d:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    add-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/gigamole/infinitecycleviewpager/a;F)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->e(F)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/gigamole/infinitecycleviewpager/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->m:Z

    return p1
.end method

.method static synthetic d(Lcom/gigamole/infinitecycleviewpager/a;)I
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->C:I

    return v0
.end method

.method static synthetic d(Lcom/gigamole/infinitecycleviewpager/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->o:Z

    return p1
.end method

.method static synthetic e(Lcom/gigamole/infinitecycleviewpager/a;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->G:Landroid/os/Handler;

    return-object v0
.end method

.method private e(F)Z
    .locals 2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x38d1b717    # 1.0E-4f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Lcom/gigamole/infinitecycleviewpager/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->n:Z

    return p1
.end method

.method static synthetic f(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/d;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->u:Lcom/gigamole/infinitecycleviewpager/d;

    return-object v0
.end method

.method static synthetic f(Lcom/gigamole/infinitecycleviewpager/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->q:Z

    return p1
.end method

.method static synthetic g(Lcom/gigamole/infinitecycleviewpager/a;)I
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->k:I

    return v0
.end method

.method static synthetic h(Lcom/gigamole/infinitecycleviewpager/a;)I
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->j:I

    return v0
.end method

.method static synthetic i(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    return v0
.end method

.method static synthetic j(Lcom/gigamole/infinitecycleviewpager/a;)F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->x:F

    return v0
.end method

.method static synthetic k(Lcom/gigamole/infinitecycleviewpager/a;)F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->z:F

    return v0
.end method

.method static synthetic l(Lcom/gigamole/infinitecycleviewpager/a;)F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->y:F

    return v0
.end method

.method static synthetic m(Lcom/gigamole/infinitecycleviewpager/a;)F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->v:F

    return v0
.end method

.method static synthetic n(Lcom/gigamole/infinitecycleviewpager/a;)I
    .locals 2

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->j:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->j:I

    return v0
.end method

.method static synthetic o(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->A:Z

    return v0
.end method

.method static synthetic p(Lcom/gigamole/infinitecycleviewpager/a;)F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->w:F

    return v0
.end method

.method private p()V
    .locals 4

    const/4 v1, 0x0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-le v0, v2, :cond_1

    :cond_0
    return-void

    :cond_1
    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v2}, Lcom/gigamole/infinitecycleviewpager/f;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v2, v0}, Lcom/gigamole/infinitecycleviewpager/f;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayerType()I

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static synthetic q(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/a$b;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->g:Lcom/gigamole/infinitecycleviewpager/a$b;

    return-object v0
.end method

.method private q()V
    .locals 4

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_1

    const-class v0, Lcom/gigamole/infinitecycleviewpager/e;

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    :goto_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    new-instance v1, Lcom/gigamole/infinitecycleviewpager/c;

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a;->D:Landroid/view/animation/Interpolator;

    invoke-direct {v1, v2, v3}, Lcom/gigamole/infinitecycleviewpager/c;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iget v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->C:I

    invoke-virtual {v1, v2}, Lcom/gigamole/infinitecycleviewpager/c;->a(I)V

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_1
    :try_start_1
    const-class v0, Landroid/support/v4/view/ViewPager;

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_1
.end method

.method static synthetic r(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/a$b;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->f:Lcom/gigamole/infinitecycleviewpager/a$b;

    return-object v0
.end method

.method private r()V
    .locals 2

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->y:F

    iget v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->x:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->z:F

    return-void
.end method

.method static synthetic s(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->m:Z

    return v0
.end method

.method static synthetic t(Lcom/gigamole/infinitecycleviewpager/a;)F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->h:F

    return v0
.end method

.method static synthetic u(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->l:Z

    return v0
.end method

.method static synthetic v(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->s:Z

    return v0
.end method

.method static synthetic w(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->o:Z

    return v0
.end method

.method static synthetic x(Lcom/gigamole/infinitecycleviewpager/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->n:Z

    return v0
.end method

.method static synthetic y(Lcom/gigamole/infinitecycleviewpager/a;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->d:Landroid/view/View;

    return-object v0
.end method

.method static synthetic z(Lcom/gigamole/infinitecycleviewpager/a;)I
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->t:I

    return v0
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->v:F

    return v0
.end method

.method public a(Landroid/support/v4/view/aa;)Landroid/support/v4/view/aa;
    .locals 3

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    iput v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->k:I

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/b;

    invoke-direct {v0, p1}, Lcom/gigamole/infinitecycleviewpager/b;-><init>(Landroid/support/v4/view/aa;)V

    iput-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    invoke-virtual {v0, p0}, Lcom/gigamole/infinitecycleviewpager/b;->a(Lcom/gigamole/infinitecycleviewpager/b$a;)V

    iget-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    :cond_0
    :goto_0
    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    invoke-virtual {v0, v2}, Lcom/gigamole/infinitecycleviewpager/b;->a(Lcom/gigamole/infinitecycleviewpager/b$a;)V

    iput-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    goto :goto_0
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->v:F

    return-void
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->C:I

    invoke-direct {p0}, Lcom/gigamole/infinitecycleviewpager/a;->q()V

    return-void
.end method

.method public a(Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v1, 0x0

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->b:Landroid/content/Context;

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->VerticalInfiniteCycleViewPager:[I

    :goto_1
    invoke-virtual {v2, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    :try_start_0
    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_2

    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->VerticalInfiniteCycleViewPager_icvp_min_page_scale_offset:I

    :goto_2
    const/high16 v3, 0x41f00000    # 30.0f

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/gigamole/infinitecycleviewpager/a;->a(F)V

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_3

    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->VerticalInfiniteCycleViewPager_icvp_center_page_scale_offset:I

    :goto_3
    const/high16 v3, 0x42480000    # 50.0f

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/gigamole/infinitecycleviewpager/a;->b(F)V

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_4

    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->VerticalInfiniteCycleViewPager_icvp_min_page_scale:I

    :goto_4
    const v3, 0x3f0ccccd    # 0.55f

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/gigamole/infinitecycleviewpager/a;->c(F)V

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_5

    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->VerticalInfiniteCycleViewPager_icvp_max_page_scale:I

    :goto_5
    const v3, 0x3f4ccccd    # 0.8f

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/gigamole/infinitecycleviewpager/a;->d(F)V

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_6

    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->VerticalInfiniteCycleViewPager_icvp_medium_scaled:I

    :goto_6
    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/gigamole/infinitecycleviewpager/a;->a(Z)V

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_7

    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->VerticalInfiniteCycleViewPager_icvp_scroll_duration:I

    :goto_7
    const/16 v3, 0x1f4

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/gigamole/infinitecycleviewpager/a;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->B:Z

    if-eqz v0, :cond_8

    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->VerticalInfiniteCycleViewPager_icvp_interpolator:I

    :goto_8
    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-nez v0, :cond_9

    move-object v0, v1

    :goto_9
    :try_start_2
    invoke-virtual {p0, v0}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/view/animation/Interpolator;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->HorizontalInfiniteCycleViewPager:[I

    goto :goto_1

    :cond_2
    :try_start_3
    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->HorizontalInfiniteCycleViewPager_icvp_min_page_scale_offset:I

    goto :goto_2

    :cond_3
    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->HorizontalInfiniteCycleViewPager_icvp_center_page_scale_offset:I

    goto :goto_3

    :cond_4
    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->HorizontalInfiniteCycleViewPager_icvp_min_page_scale:I

    goto :goto_4

    :cond_5
    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->HorizontalInfiniteCycleViewPager_icvp_max_page_scale:I

    goto :goto_5

    :cond_6
    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->HorizontalInfiniteCycleViewPager_icvp_medium_scaled:I

    goto :goto_6

    :cond_7
    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->HorizontalInfiniteCycleViewPager_icvp_scroll_duration:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_7

    :cond_8
    :try_start_4
    sget v0, Lcom/gigamole/infinitecycleviewpager/R$styleable;->HorizontalInfiniteCycleViewPager_icvp_interpolator:I

    goto :goto_8

    :cond_9
    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a;->b:Landroid/content/Context;

    invoke-static {v3, v0}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
    :try_end_4
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result-object v0

    goto :goto_9

    :catch_0
    move-exception v0

    const/4 v3, 0x0

    :try_start_5
    invoke-virtual {v0}, Landroid/content/res/Resources$NotFoundException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {p0, v3}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/view/animation/Interpolator;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_7
    invoke-virtual {p0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/view/animation/Interpolator;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0
.end method

.method public a(Landroid/view/animation/Interpolator;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lcom/gigamole/infinitecycleviewpager/a$c;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/gigamole/infinitecycleviewpager/a$c;-><init>(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$1;)V

    :cond_0
    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->D:Landroid/view/animation/Interpolator;

    invoke-direct {p0}, Lcom/gigamole/infinitecycleviewpager/a;->q()V

    return-void
.end method

.method public a(Lcom/gigamole/infinitecycleviewpager/d;)V
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->u:Lcom/gigamole/infinitecycleviewpager/d;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->A:Z

    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 3

    const/4 v1, 0x0

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v2}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v2}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/view/aa;->b()I

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    iget-boolean v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->E:Z

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->q:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v2}, Lcom/gigamole/infinitecycleviewpager/f;->f()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    if-gt v1, v0, :cond_4

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v1}, Lcom/gigamole/infinitecycleviewpager/f;->hasWindowFocus()Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    :cond_5
    invoke-direct {p0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->c(Landroid/view/MotionEvent;)V

    goto :goto_0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->w:F

    return v0
.end method

.method public b(I)I
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->q:Z

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    :cond_0
    :goto_0
    return p1

    :cond_1
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    iget-boolean v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->r:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->r:Z

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    invoke-virtual {v1}, Lcom/gigamole/infinitecycleviewpager/b;->b()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    div-int/2addr v1, v0

    mul-int p1, v1, v0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v1}, Lcom/gigamole/infinitecycleviewpager/f;->getCurrentItem()I

    move-result v1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/gigamole/infinitecycleviewpager/a;->k()I

    move-result v1

    sub-int p1, v0, v1

    goto :goto_0
.end method

.method public b(F)V
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->w:F

    return-void
.end method

.method public b(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/gigamole/infinitecycleviewpager/a;->l()V

    :cond_0
    return-void
.end method

.method public b(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->x:F

    return v0
.end method

.method public c(F)V
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->x:F

    invoke-direct {p0}, Lcom/gigamole/infinitecycleviewpager/a;->r()V

    return-void
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->y:F

    return v0
.end method

.method public d(F)V
    .locals 0

    iput p1, p0, Lcom/gigamole/infinitecycleviewpager/a;->y:F

    invoke-direct {p0}, Lcom/gigamole/infinitecycleviewpager/a;->r()V

    return-void
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->C:I

    return v0
.end method

.method public f()Landroid/view/animation/Interpolator;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->D:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->t:I

    return v0
.end method

.method public h()Lcom/gigamole/infinitecycleviewpager/d;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->u:Lcom/gigamole/infinitecycleviewpager/d;

    return-object v0
.end method

.method public i()Lcom/gigamole/infinitecycleviewpager/a$a;
    .locals 1

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/a$a;

    invoke-direct {v0, p0}, Lcom/gigamole/infinitecycleviewpager/a$a;-><init>(Lcom/gigamole/infinitecycleviewpager/a;)V

    return-object v0
.end method

.method public j()Lcom/gigamole/infinitecycleviewpager/b;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    return-object v0
.end method

.method public k()I
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getCurrentItem()I

    move-result v0

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->e:Lcom/gigamole/infinitecycleviewpager/b;

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v1}, Lcom/gigamole/infinitecycleviewpager/f;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/gigamole/infinitecycleviewpager/b;->a(I)I

    move-result v0

    goto :goto_0
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->getChildCount()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/gigamole/infinitecycleviewpager/f;->b(F)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    invoke-interface {v0}, Lcom/gigamole/infinitecycleviewpager/f;->e()V

    goto :goto_0
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    new-instance v1, Lcom/gigamole/infinitecycleviewpager/a$2;

    invoke-direct {v1, p0}, Lcom/gigamole/infinitecycleviewpager/a$2;-><init>(Lcom/gigamole/infinitecycleviewpager/a;)V

    invoke-interface {v0, v1}, Lcom/gigamole/infinitecycleviewpager/f;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public n()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->r:Z

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->c:Lcom/gigamole/infinitecycleviewpager/f;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/gigamole/infinitecycleviewpager/f;->setCurrentItem(I)V

    invoke-virtual {p0}, Lcom/gigamole/infinitecycleviewpager/a;->m()V

    return-void
.end method

.method public o()V
    .locals 2

    iget-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->E:Z

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->E:Z

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a;->G:Landroid/os/Handler;

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a;->H:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
