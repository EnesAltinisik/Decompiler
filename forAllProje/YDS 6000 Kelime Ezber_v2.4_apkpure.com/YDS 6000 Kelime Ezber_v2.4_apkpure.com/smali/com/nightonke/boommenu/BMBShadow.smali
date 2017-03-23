.class public Lcom/nightonke/boommenu/BMBShadow;
.super Landroid/widget/FrameLayout;


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BMBShadow;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BMBShadow;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BMBShadow;->a:Z

    return-void
.end method

.method private b()V
    .locals 3

    iget v0, p0, Lcom/nightonke/boommenu/BMBShadow;->d:I

    iget v1, p0, Lcom/nightonke/boommenu/BMBShadow;->b:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/nightonke/boommenu/BMBShadow;->d:I

    iget v2, p0, Lcom/nightonke/boommenu/BMBShadow;->c:I

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0, v0, v1, v0, v1}, Lcom/nightonke/boommenu/BMBShadow;->setPadding(IIII)V

    return-void
.end method

.method private c()V
    .locals 3

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BMBShadow;->a:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/nightonke/boommenu/BMBShadow;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BMBShadow;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-gt v0, v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/nightonke/boommenu/BMBShadow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, v1}, Lcom/nightonke/boommenu/BMBShadow;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/nightonke/boommenu/BMBShadow;->a()V

    goto :goto_0
.end method

.method private d()Landroid/graphics/Bitmap;
    .locals 8

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BMBShadow;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BMBShadow;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v2, Landroid/graphics/RectF;

    iget v3, p0, Lcom/nightonke/boommenu/BMBShadow;->d:I

    iget v4, p0, Lcom/nightonke/boommenu/BMBShadow;->b:I

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/nightonke/boommenu/BMBShadow;->d:I

    iget v5, p0, Lcom/nightonke/boommenu/BMBShadow;->c:I

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BMBShadow;->getWidth()I

    move-result v5

    iget v6, p0, Lcom/nightonke/boommenu/BMBShadow;->d:I

    sub-int/2addr v5, v6

    iget v6, p0, Lcom/nightonke/boommenu/BMBShadow;->b:I

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BMBShadow;->getHeight()I

    move-result v6

    iget v7, p0, Lcom/nightonke/boommenu/BMBShadow;->d:I

    sub-int/2addr v6, v7

    iget v7, p0, Lcom/nightonke/boommenu/BMBShadow;->c:I

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    sub-int/2addr v6, v7

    int-to-float v6, v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BMBShadow;->isInEditMode()Z

    move-result v4

    if-nez v4, :cond_0

    iget v4, p0, Lcom/nightonke/boommenu/BMBShadow;->d:I

    int-to-float v4, v4

    iget v5, p0, Lcom/nightonke/boommenu/BMBShadow;->b:I

    int-to-float v5, v5

    iget v6, p0, Lcom/nightonke/boommenu/BMBShadow;->c:I

    int-to-float v6, v6

    iget v7, p0, Lcom/nightonke/boommenu/BMBShadow;->f:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :cond_0
    iget v4, p0, Lcom/nightonke/boommenu/BMBShadow;->e:I

    int-to-float v4, v4

    iget v5, p0, Lcom/nightonke/boommenu/BMBShadow;->e:I

    int-to-float v5, v5

    invoke-virtual {v1, v2, v4, v5, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/nightonke/boommenu/e;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BMBShadow;->c()V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    if-lez p1, :cond_0

    if-lez p2, :cond_0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BMBShadow;->c()V

    :cond_0
    return-void
.end method

.method public setShadowColor(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BMBShadow;->f:I

    return-void
.end method

.method public setShadowCornerRadius(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BMBShadow;->e:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BMBShadow;->b()V

    return-void
.end method

.method public setShadowEffect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BMBShadow;->a:Z

    return-void
.end method

.method public setShadowOffsetX(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BMBShadow;->b:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BMBShadow;->b()V

    return-void
.end method

.method public setShadowOffsetY(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BMBShadow;->c:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BMBShadow;->b()V

    return-void
.end method

.method public setShadowRadius(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BMBShadow;->d:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BMBShadow;->b()V

    return-void
.end method
