.class public Lcom/nightonke/boommenu/b/k;
.super Lcom/nightonke/boommenu/b/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nightonke/boommenu/b/k$a;
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/nightonke/boommenu/b/k$a;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/nightonke/boommenu/b/a;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/nightonke/boommenu/b/k;->a:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/b/k;->a(Lcom/nightonke/boommenu/b/k$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/nightonke/boommenu/b/k$a;Landroid/content/Context;Lcom/nightonke/boommenu/b/k$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/nightonke/boommenu/b/k;-><init>(Lcom/nightonke/boommenu/b/k$a;Landroid/content/Context;)V

    return-void
.end method

.method private a(Lcom/nightonke/boommenu/b/k$a;)V
    .locals 3

    iget-object v0, p0, Lcom/nightonke/boommenu/b/k;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/nightonke/boommenu/R$layout;->bmb_text_outside_circle_button:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/b/k;->b(Lcom/nightonke/boommenu/b/k$a;)V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/k;->a()V

    iget v0, p0, Lcom/nightonke/boommenu/b/k;->h:I

    iget v1, p0, Lcom/nightonke/boommenu/b/k;->t:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/b/k;->a(I)V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/k;->d()V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/k;->aE:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/b/k;->a(Landroid/view/ViewGroup;)V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/k;->b()V

    new-instance v0, Landroid/graphics/PointF;

    iget v1, p0, Lcom/nightonke/boommenu/b/k;->ar:I

    int-to-float v1, v1

    iget v2, p0, Lcom/nightonke/boommenu/b/k;->ar:I

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/k;->aI:Landroid/graphics/PointF;

    return-void
.end method

.method private b(Lcom/nightonke/boommenu/b/k$a;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/nightonke/boommenu/b/a;->a(Lcom/nightonke/boommenu/b/b;)V

    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/k;->ar:I

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public B()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/k;->ar:I

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/k;->h:I

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/k;->h:I

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public E()V
    .locals 1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/b/k;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/nightonke/boommenu/b/k;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/k;->g()V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/k;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/b/k;->e:Z

    :cond_0
    return-void
.end method

.method public F()V
    .locals 1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/b/k;->e:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/k;->h()V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/k;->j()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nightonke/boommenu/b/k;->e:Z

    :cond_0
    return-void
.end method

.method public G()V
    .locals 3

    iget-object v0, p0, Lcom/nightonke/boommenu/b/k;->aF:Landroid/widget/ImageView;

    iget v1, p0, Lcom/nightonke/boommenu/b/k;->h:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/k;->D:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotX(F)V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/k;->aF:Landroid/widget/ImageView;

    iget v1, p0, Lcom/nightonke/boommenu/b/k;->h:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/k;->D:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotY(F)V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/k;->aG:Landroid/widget/TextView;

    iget v1, p0, Lcom/nightonke/boommenu/b/k;->ar:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/k;->O:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotX(F)V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/k;->aG:Landroid/widget/TextView;

    iget v1, p0, Lcom/nightonke/boommenu/b/k;->ar:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/k;->O:Landroid/graphics/Rect;

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

    iget-object v1, p0, Lcom/nightonke/boommenu/b/k;->aF:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/nightonke/boommenu/b/k;->aG:Landroid/widget/TextView;

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

    iget-boolean v1, p0, Lcom/nightonke/boommenu/b/k;->l:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/nightonke/boommenu/b/k;->aF:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-boolean v1, p0, Lcom/nightonke/boommenu/b/k;->m:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/nightonke/boommenu/b/k;->aG:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method
