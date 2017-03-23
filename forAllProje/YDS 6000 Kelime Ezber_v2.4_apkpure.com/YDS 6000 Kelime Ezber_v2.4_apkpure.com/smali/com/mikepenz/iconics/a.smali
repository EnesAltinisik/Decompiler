.class public Lcom/mikepenz/iconics/a;
.super Landroid/graphics/drawable/Drawable;


# instance fields
.field private A:Landroid/graphics/ColorFilter;

.field private a:Landroid/content/Context;

.field private b:I

.field private c:I

.field private d:Z

.field private e:I

.field private f:Landroid/graphics/Paint;

.field private g:I

.field private h:Landroid/graphics/Paint;

.field private i:I

.field private j:Landroid/graphics/Paint;

.field private k:I

.field private l:I

.field private m:Landroid/graphics/Rect;

.field private n:Landroid/graphics/RectF;

.field private o:Landroid/graphics/Path;

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:Z

.field private v:Lcom/mikepenz/iconics/a/a;

.field private w:Ljava/lang/String;

.field private x:Landroid/content/res/ColorStateList;

.field private y:Landroid/graphics/PorterDuff$Mode;

.field private z:Landroid/graphics/ColorFilter;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, -0x1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    iput v0, p0, Lcom/mikepenz/iconics/a;->b:I

    iput v0, p0, Lcom/mikepenz/iconics/a;->c:I

    iput-boolean v1, p0, Lcom/mikepenz/iconics/a;->d:Z

    iput v0, p0, Lcom/mikepenz/iconics/a;->k:I

    iput v0, p0, Lcom/mikepenz/iconics/a;->l:I

    iput v1, p0, Lcom/mikepenz/iconics/a;->r:I

    iput v1, p0, Lcom/mikepenz/iconics/a;->s:I

    const/16 v0, 0xff

    iput v0, p0, Lcom/mikepenz/iconics/a;->t:I

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->y:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->a:Landroid/content/Context;

    invoke-direct {p0}, Lcom/mikepenz/iconics/a;->c()V

    const/16 v0, 0x20

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->a(Ljava/lang/Character;)Lcom/mikepenz/iconics/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mikepenz/iconics/a/a;)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, -0x1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    iput v0, p0, Lcom/mikepenz/iconics/a;->b:I

    iput v0, p0, Lcom/mikepenz/iconics/a;->c:I

    iput-boolean v1, p0, Lcom/mikepenz/iconics/a;->d:Z

    iput v0, p0, Lcom/mikepenz/iconics/a;->k:I

    iput v0, p0, Lcom/mikepenz/iconics/a;->l:I

    iput v1, p0, Lcom/mikepenz/iconics/a;->r:I

    iput v1, p0, Lcom/mikepenz/iconics/a;->s:I

    const/16 v0, 0xff

    iput v0, p0, Lcom/mikepenz/iconics/a;->t:I

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->y:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->a:Landroid/content/Context;

    invoke-direct {p0}, Lcom/mikepenz/iconics/a;->c()V

    invoke-virtual {p0, p2}, Lcom/mikepenz/iconics/a;->a(Lcom/mikepenz/iconics/a/a;)Lcom/mikepenz/iconics/a;

    return-void
.end method

.method private a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->getState()[I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v0, v1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0
.end method

.method private a(Landroid/graphics/Rect;)V
    .locals 6

    iget v0, p0, Lcom/mikepenz/iconics/a;->p:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/mikepenz/iconics/a;->p:I

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-gt v0, v1, :cond_0

    iget v0, p0, Lcom/mikepenz/iconics/a;->p:I

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->m:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lcom/mikepenz/iconics/a;->p:I

    add-int/2addr v1, v2

    iget v2, p1, Landroid/graphics/Rect;->top:I

    iget v3, p0, Lcom/mikepenz/iconics/a;->p:I

    add-int/2addr v2, v3

    iget v3, p1, Landroid/graphics/Rect;->right:I

    iget v4, p0, Lcom/mikepenz/iconics/a;->p:I

    sub-int/2addr v3, v4

    iget v4, p1, Landroid/graphics/Rect;->bottom:I

    iget v5, p0, Lcom/mikepenz/iconics/a;->p:I

    sub-int/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    :cond_0
    return-void
.end method

.method private b(Landroid/graphics/Rect;)V
    .locals 9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v1, v0

    iget-boolean v0, p0, Lcom/mikepenz/iconics/a;->d:Z

    if-eqz v0, :cond_1

    move v0, v7

    :goto_0
    int-to-float v0, v0

    mul-float v8, v1, v0

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->v:Lcom/mikepenz/iconics/a/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->v:Lcom/mikepenz/iconics/a/a;

    invoke-interface {v0}, Lcom/mikepenz/iconics/a/a;->a()C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    iget-object v6, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    iget-object v3, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    invoke-virtual {v0, v3, v7}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget-boolean v0, p0, Lcom/mikepenz/iconics/a;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->m:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    iget-object v3, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v0, v3

    iget-object v3, p0, Lcom/mikepenz/iconics/a;->m:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    iget-object v5, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    div-float/2addr v3, v5

    cmpg-float v5, v0, v3

    if-gez v5, :cond_3

    :goto_2
    mul-float/2addr v0, v8

    iget-object v3, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    iget-object v6, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    invoke-virtual {v0, v1, v7}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/mikepenz/iconics/a;->w:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    move v0, v3

    goto :goto_2
.end method

.method private c()V
    .locals 3

    const/4 v2, 0x1

    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0, v2}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->j:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->h:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->m:Landroid/graphics/Rect;

    return-void
.end method

.method private c(Landroid/graphics/Rect;)V
    .locals 4

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v1, v3

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/mikepenz/iconics/a;->n:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    iget v3, p0, Lcom/mikepenz/iconics/a;->r:I

    int-to-float v3, v3

    add-float/2addr v0, v3

    iget v3, p0, Lcom/mikepenz/iconics/a;->s:I

    int-to-float v3, v3

    add-float/2addr v1, v3

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->offset(FF)V

    return-void
.end method


# virtual methods
.method public a()Lcom/mikepenz/iconics/a;
    .locals 1

    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->f(I)Lcom/mikepenz/iconics/a;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->d(I)Lcom/mikepenz/iconics/a;

    return-object p0
.end method

.method public a(I)Lcom/mikepenz/iconics/a;
    .locals 4

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    iget-object v3, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setColor(I)V

    iput p1, p0, Lcom/mikepenz/iconics/a;->e:I

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->setAlpha(I)V

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-object p0
.end method

.method public a(Landroid/graphics/Typeface;)Lcom/mikepenz/iconics/a;
    .locals 1

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-object p0
.end method

.method public a(Lcom/mikepenz/iconics/a/a;)Lcom/mikepenz/iconics/a;
    .locals 3

    iput-object p1, p0, Lcom/mikepenz/iconics/a;->v:Lcom/mikepenz/iconics/a/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->w:Ljava/lang/String;

    invoke-interface {p1}, Lcom/mikepenz/iconics/a/a;->b()Lcom/mikepenz/iconics/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/mikepenz/iconics/a;->a:Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/mikepenz/iconics/a/b;->getTypeface(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-object p0
.end method

.method public a(Ljava/lang/Character;)Lcom/mikepenz/iconics/a;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Character;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->a(Ljava/lang/String;)Lcom/mikepenz/iconics/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/mikepenz/iconics/a;
    .locals 2

    iput-object p1, p0, Lcom/mikepenz/iconics/a;->w:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->v:Lcom/mikepenz/iconics/a/a;

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-object p0
.end method

.method public a(Z)Lcom/mikepenz/iconics/a;
    .locals 2

    iget-boolean v0, p0, Lcom/mikepenz/iconics/a;->u:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/mikepenz/iconics/a;->u:Z

    iget-boolean v0, p0, Lcom/mikepenz/iconics/a;->u:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/mikepenz/iconics/a;->p:I

    iget v1, p0, Lcom/mikepenz/iconics/a;->q:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/mikepenz/iconics/a;->p:I

    :goto_0
    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    :cond_0
    return-object p0

    :cond_1
    iget v0, p0, Lcom/mikepenz/iconics/a;->p:I

    iget v1, p0, Lcom/mikepenz/iconics/a;->q:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/mikepenz/iconics/a;->p:I

    goto :goto_0
.end method

.method public b()Lcom/mikepenz/iconics/a;
    .locals 2

    new-instance v0, Lcom/mikepenz/iconics/a;

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/mikepenz/iconics/a;-><init>(Landroid/content/Context;)V

    iget v1, p0, Lcom/mikepenz/iconics/a;->p:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->e(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->k:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->l(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->l:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->m(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->b:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->h(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->c:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->i(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->r:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->b(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->s:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->c(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->g:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->j(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->q:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->n(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->i:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->k(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->e:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->a(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget v1, p0, Lcom/mikepenz/iconics/a;->t:I

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->o(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/mikepenz/iconics/a;->u:Z

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->a(Z)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->a(Landroid/graphics/Typeface;)Lcom/mikepenz/iconics/a;

    move-result-object v0

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->v:Lcom/mikepenz/iconics/a/a;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->v:Lcom/mikepenz/iconics/a/a;

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->a(Lcom/mikepenz/iconics/a/a;)Lcom/mikepenz/iconics/a;

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/mikepenz/iconics/a;->w:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->a(Ljava/lang/String;)Lcom/mikepenz/iconics/a;

    goto :goto_0
.end method

.method public b(I)Lcom/mikepenz/iconics/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/iconics/a;->r:I

    return-object p0
.end method

.method public c(I)Lcom/mikepenz/iconics/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/iconics/a;->s:I

    return-object p0
.end method

.method public clearColorFilter()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->A:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->b()Lcom/mikepenz/iconics/a;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Lcom/mikepenz/iconics/a;
    .locals 2

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->a:Landroid/content/Context;

    int-to-float v1, p1

    invoke-static {v0, v1}, Lcom/mikepenz/iconics/b/a;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->e(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    return-object v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    const/4 v2, -0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->v:Lcom/mikepenz/iconics/a/a;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->w:Ljava/lang/String;

    if-eqz v0, :cond_3

    :cond_0
    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mikepenz/iconics/a;->a(Landroid/graphics/Rect;)V

    invoke-direct {p0, v0}, Lcom/mikepenz/iconics/a;->b(Landroid/graphics/Rect;)V

    invoke-direct {p0, v0}, Lcom/mikepenz/iconics/a;->c(Landroid/graphics/Rect;)V

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->j:Landroid/graphics/Paint;

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/mikepenz/iconics/a;->l:I

    if-le v1, v2, :cond_1

    iget v1, p0, Lcom/mikepenz/iconics/a;->k:I

    if-le v1, v2, :cond_1

    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    invoke-direct {v1, v3, v3, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget v0, p0, Lcom/mikepenz/iconics/a;->k:I

    int-to-float v0, v0

    iget v2, p0, Lcom/mikepenz/iconics/a;->l:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/mikepenz/iconics/a;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_1
    iget-object v0, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    iget-boolean v0, p0, Lcom/mikepenz/iconics/a;->u:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_2
    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    iget v1, p0, Lcom/mikepenz/iconics/a;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->A:Landroid/graphics/ColorFilter;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->z:Landroid/graphics/ColorFilter;

    :goto_0
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_3
    return-void

    :cond_4
    iget-object v0, p0, Lcom/mikepenz/iconics/a;->A:Landroid/graphics/ColorFilter;

    goto :goto_0
.end method

.method public e(I)Lcom/mikepenz/iconics/a;
    .locals 2

    iget v0, p0, Lcom/mikepenz/iconics/a;->p:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Lcom/mikepenz/iconics/a;->p:I

    iget-boolean v0, p0, Lcom/mikepenz/iconics/a;->u:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/mikepenz/iconics/a;->p:I

    iget v1, p0, Lcom/mikepenz/iconics/a;->q:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/mikepenz/iconics/a;->p:I

    :cond_0
    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    :cond_1
    return-object p0
.end method

.method public f(I)Lcom/mikepenz/iconics/a;
    .locals 2

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->a:Landroid/content/Context;

    int-to-float v1, p1

    invoke-static {v0, v1}, Lcom/mikepenz/iconics/b/a;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->g(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    return-object v0
.end method

.method public g(I)Lcom/mikepenz/iconics/a;
    .locals 1

    const/4 v0, 0x0

    iput p1, p0, Lcom/mikepenz/iconics/a;->b:I

    iput p1, p0, Lcom/mikepenz/iconics/a;->c:I

    invoke-virtual {p0, v0, v0, p1, p1}, Lcom/mikepenz/iconics/a;->setBounds(IIII)V

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-object p0
.end method

.method public getAlpha()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/iconics/a;->t:I

    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/iconics/a;->c:I

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/iconics/a;->b:I

    return v0
.end method

.method public getOpacity()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/iconics/a;->t:I

    return v0
.end method

.method public h(I)Lcom/mikepenz/iconics/a;
    .locals 3

    const/4 v2, 0x0

    iput p1, p0, Lcom/mikepenz/iconics/a;->b:I

    iget v0, p0, Lcom/mikepenz/iconics/a;->b:I

    iget v1, p0, Lcom/mikepenz/iconics/a;->c:I

    invoke-virtual {p0, v2, v2, v0, v1}, Lcom/mikepenz/iconics/a;->setBounds(IIII)V

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-object p0
.end method

.method public i(I)Lcom/mikepenz/iconics/a;
    .locals 3

    const/4 v2, 0x0

    iput p1, p0, Lcom/mikepenz/iconics/a;->c:I

    iget v0, p0, Lcom/mikepenz/iconics/a;->b:I

    iget v1, p0, Lcom/mikepenz/iconics/a;->c:I

    invoke-virtual {p0, v2, v2, v0, v1}, Lcom/mikepenz/iconics/a;->setBounds(IIII)V

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-object p0
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j(I)Lcom/mikepenz/iconics/a;
    .locals 4

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    iget-object v3, p0, Lcom/mikepenz/iconics/a;->h:Landroid/graphics/Paint;

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->h:Landroid/graphics/Paint;

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iput p1, p0, Lcom/mikepenz/iconics/a;->g:I

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-object p0
.end method

.method public k(I)Lcom/mikepenz/iconics/a;
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iput p1, p0, Lcom/mikepenz/iconics/a;->i:I

    iput v1, p0, Lcom/mikepenz/iconics/a;->k:I

    iput v1, p0, Lcom/mikepenz/iconics/a;->l:I

    return-object p0
.end method

.method public l(I)Lcom/mikepenz/iconics/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/iconics/a;->k:I

    return-object p0
.end method

.method public m(I)Lcom/mikepenz/iconics/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/iconics/a;->l:I

    return-object p0
.end method

.method public n(I)Lcom/mikepenz/iconics/a;
    .locals 2

    iput p1, p0, Lcom/mikepenz/iconics/a;->q:I

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->h:Landroid/graphics/Paint;

    iget v1, p0, Lcom/mikepenz/iconics/a;->q:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->a(Z)Lcom/mikepenz/iconics/a;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-object p0
.end method

.method public o(I)Lcom/mikepenz/iconics/a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/mikepenz/iconics/a;->setAlpha(I)V

    return-object p0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/mikepenz/iconics/a;->c(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    return-void
.end method

.method protected onStateChange([I)Z
    .locals 2

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->x:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->y:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->x:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Lcom/mikepenz/iconics/a;->y:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, v0, v1}, Lcom/mikepenz/iconics/a;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->z:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    iput p1, p0, Lcom/mikepenz/iconics/a;->t:I

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    iput-object p1, p0, Lcom/mikepenz/iconics/a;->A:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-void
.end method

.method public setState([I)Z
    .locals 1

    iget v0, p0, Lcom/mikepenz/iconics/a;->t:I

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->setAlpha(I)V

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    return v0
.end method

.method public setTint(I)V
    .locals 1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mikepenz/iconics/a;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iput-object p1, p0, Lcom/mikepenz/iconics/a;->x:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->y:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, p1, v0}, Lcom/mikepenz/iconics/a;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->z:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iput-object p1, p0, Lcom/mikepenz/iconics/a;->y:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p0, Lcom/mikepenz/iconics/a;->x:Landroid/content/res/ColorStateList;

    invoke-direct {p0, v0, p1}, Lcom/mikepenz/iconics/a;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/mikepenz/iconics/a;->z:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/a;->invalidateSelf()V

    return-void
.end method
