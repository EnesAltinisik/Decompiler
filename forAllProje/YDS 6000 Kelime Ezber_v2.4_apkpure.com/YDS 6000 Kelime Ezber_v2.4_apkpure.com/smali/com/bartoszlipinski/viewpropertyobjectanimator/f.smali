.class public Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private b:J

.field private c:J

.field private d:Z

.field private e:Landroid/view/animation/Interpolator;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/animation/ValueAnimator$AnimatorUpdateListener;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/animation/Animator$AnimatorPauseListener;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/support/v4/i/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/i/a",
            "<",
            "Landroid/util/Property",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;",
            "Landroid/animation/PropertyValuesHolder;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/bartoszlipinski/viewpropertyobjectanimator/c;

.field private k:Lcom/bartoszlipinski/viewpropertyobjectanimator/b;

.field private l:Lcom/bartoszlipinski/viewpropertyobjectanimator/d;

.field private m:Lcom/bartoszlipinski/viewpropertyobjectanimator/e;


# direct methods
.method private constructor <init>(Landroid/view/View;)V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b:J

    iput-wide v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->c:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->d:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->f:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->g:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->h:Ljava/util/List;

    new-instance v0, Landroid/support/v4/i/a;

    invoke-direct {v0}, Landroid/support/v4/i/a;-><init>()V

    iput-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->i:Landroid/support/v4/i/a;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 1

    new-instance v0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    invoke-direct {v0, p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method private a(Landroid/util/Property;F)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Property",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;F)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-direct {p0, p1, v0, p2}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/util/Property;FF)V

    :cond_0
    return-void
.end method

.method private a(Landroid/util/Property;FF)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Property",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;FF)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->i:Landroid/support/v4/i/a;

    invoke-virtual {v0, p1}, Landroid/support/v4/i/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->i:Landroid/support/v4/i/a;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p2, v1, v2

    const/4 v2, 0x1

    aput p3, v1, v2

    invoke-static {p1, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/i/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic a(Lcom/bartoszlipinski/viewpropertyobjectanimator/f;)Z
    .locals 1

    invoke-direct {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/bartoszlipinski/viewpropertyobjectanimator/f;)Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private b(Landroid/util/Property;F)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Property",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;F)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float v1, v0, p2

    invoke-direct {p0, p1, v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/util/Property;FF)V

    :cond_0
    return-void
.end method

.method private b()Z
    .locals 1

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/animation/ObjectAnimator;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-wide/16 v4, -0x1

    invoke-direct {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->i:Landroid/support/v4/i/a;

    invoke-virtual {v0}, Landroid/support/v4/i/a;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    new-array v2, v2, [Landroid/animation/PropertyValuesHolder;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/PropertyValuesHolder;

    invoke-static {v1, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iget-boolean v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f$1;

    invoke-direct {v0, p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f$1;-><init>(Lcom/bartoszlipinski/viewpropertyobjectanimator/f;)V

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    iget-wide v2, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->c:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    iget-wide v2, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->c:J

    invoke-virtual {v1, v2, v3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    :cond_1
    iget-wide v2, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    iget-wide v2, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b:J

    invoke-virtual {v1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    :cond_2
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->e:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->e:Landroid/view/animation/Interpolator;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_3
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->j:Lcom/bartoszlipinski/viewpropertyobjectanimator/c;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->j:Lcom/bartoszlipinski/viewpropertyobjectanimator/c;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_5
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->k:Lcom/bartoszlipinski/viewpropertyobjectanimator/b;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->k:Lcom/bartoszlipinski/viewpropertyobjectanimator/b;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_6
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->l:Lcom/bartoszlipinski/viewpropertyobjectanimator/d;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->l:Lcom/bartoszlipinski/viewpropertyobjectanimator/d;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_7
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->m:Lcom/bartoszlipinski/viewpropertyobjectanimator/e;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->m:Lcom/bartoszlipinski/viewpropertyobjectanimator/e;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_8
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_1

    :cond_9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v0, v2, :cond_a

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator$AnimatorPauseListener;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    goto :goto_2

    :cond_a
    move-object v0, v1

    :goto_3
    return-object v0

    :cond_b
    const/4 v0, 0x0

    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    goto :goto_3

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public a(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 1

    sget-object v0, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    invoke-direct {p0, v0, p1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/util/Property;F)V

    return-object p0
.end method

.method public a(J)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duration cannot be < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-wide p1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b:J

    return-object p0
.end method

.method public a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 1

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Landroid/view/animation/Interpolator;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 0

    iput-object p1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->e:Landroid/view/animation/Interpolator;

    return-object p0
.end method

.method public b(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 1

    sget-object v0, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    invoke-direct {p0, v0, p1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/util/Property;F)V

    return-object p0
.end method

.method public c(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 1

    sget-object v0, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    invoke-direct {p0, v0, p1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/util/Property;F)V

    return-object p0
.end method

.method public d(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 1

    sget-object v0, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    invoke-direct {p0, v0, p1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b(Landroid/util/Property;F)V

    return-object p0
.end method

.method public e(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 1

    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    invoke-direct {p0, v0, p1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/util/Property;F)V

    return-object p0
.end method

.method public f(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;
    .locals 1

    sget-object v0, Landroid/view/View;->ROTATION:Landroid/util/Property;

    invoke-direct {p0, v0, p1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/util/Property;F)V

    return-object p0
.end method
