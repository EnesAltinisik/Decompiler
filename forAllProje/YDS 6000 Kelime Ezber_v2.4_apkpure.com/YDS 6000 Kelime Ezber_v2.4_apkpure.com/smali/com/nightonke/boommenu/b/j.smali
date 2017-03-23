.class public Lcom/nightonke/boommenu/b/j;
.super Lcom/nightonke/boommenu/b/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nightonke/boommenu/b/j$a;
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/nightonke/boommenu/b/j$a;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/nightonke/boommenu/b/a;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/nightonke/boommenu/b/j;->a:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/b/j;->a(Lcom/nightonke/boommenu/b/j$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/nightonke/boommenu/b/j$a;Landroid/content/Context;Lcom/nightonke/boommenu/b/j$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/nightonke/boommenu/b/j;-><init>(Lcom/nightonke/boommenu/b/j$a;Landroid/content/Context;)V

    return-void
.end method

.method private a(Lcom/nightonke/boommenu/b/j$a;)V
    .locals 4

    iget-object v0, p0, Lcom/nightonke/boommenu/b/j;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/nightonke/boommenu/R$layout;->bmb_text_inside_circle_button:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/b/j;->b(Lcom/nightonke/boommenu/b/j$a;)V

    iget v0, p0, Lcom/nightonke/boommenu/b/j;->h:I

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->t:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/b/j;->a(I)V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/j;->d()V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/j;->g:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/b/j;->a(Landroid/view/ViewGroup;)V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/j;->b()V

    new-instance v0, Landroid/graphics/PointF;

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->h:I

    iget v2, p0, Lcom/nightonke/boommenu/b/j;->t:I

    add-int/2addr v1, v2

    iget v2, p0, Lcom/nightonke/boommenu/b/j;->r:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/nightonke/boommenu/b/j;->h:I

    iget v3, p0, Lcom/nightonke/boommenu/b/j;->t:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/nightonke/boommenu/b/j;->s:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/j;->aI:Landroid/graphics/PointF;

    return-void
.end method

.method private b(Lcom/nightonke/boommenu/b/j$a;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/nightonke/boommenu/b/a;->a(Lcom/nightonke/boommenu/b/b;)V

    return-void
.end method


# virtual methods
.method public A()I
    .locals 2

    iget v0, p0, Lcom/nightonke/boommenu/b/j;->h:I

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->t:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->r:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    return v0
.end method

.method public B()I
    .locals 2

    iget v0, p0, Lcom/nightonke/boommenu/b/j;->h:I

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->t:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->s:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    return v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/j;->h:I

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/j;->h:I

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public E()V
    .locals 1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/b/j;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/nightonke/boommenu/b/j;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/j;->g()V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/j;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/b/j;->e:Z

    :cond_0
    return-void
.end method

.method public F()V
    .locals 1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/b/j;->e:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/j;->h()V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/j;->j()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nightonke/boommenu/b/j;->e:Z

    :cond_0
    return-void
.end method

.method public G()V
    .locals 3

    iget-object v0, p0, Lcom/nightonke/boommenu/b/j;->aF:Landroid/widget/ImageView;

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->h:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/j;->D:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotX(F)V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/j;->aF:Landroid/widget/ImageView;

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->h:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/j;->D:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotY(F)V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/j;->aG:Landroid/widget/TextView;

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->h:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/j;->O:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotX(F)V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/j;->aG:Landroid/widget/TextView;

    iget v1, p0, Lcom/nightonke/boommenu/b/j;->h:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/j;->O:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotY(F)V

    return-void
.end method

.method public H()V
    .locals 0

    return-void
.end method

.method public y()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/nightonke/boommenu/b/j;->aF:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/nightonke/boommenu/b/j;->aG:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public z()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v1, p0, Lcom/nightonke/boommenu/b/j;->l:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/nightonke/boommenu/b/j;->aF:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-boolean v1, p0, Lcom/nightonke/boommenu/b/j;->m:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/nightonke/boommenu/b/j;->aG:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method
