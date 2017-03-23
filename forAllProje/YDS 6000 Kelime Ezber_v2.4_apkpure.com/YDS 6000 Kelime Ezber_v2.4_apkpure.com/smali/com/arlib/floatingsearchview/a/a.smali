.class public Lcom/arlib/floatingsearchview/a/a;
.super Landroid/support/v7/widget/RecyclerView$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arlib/floatingsearchview/a/a$c;,
        Lcom/arlib/floatingsearchview/a/a$a;,
        Lcom/arlib/floatingsearchview/a/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$a",
        "<",
        "Landroid/support/v7/widget/RecyclerView$w;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/arlib/floatingsearchview/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/arlib/floatingsearchview/a/a$a;

.field private c:Landroid/content/Context;

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:Lcom/arlib/floatingsearchview/a/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILcom/arlib/floatingsearchview/a/a$a;)V
    .locals 3

    const/4 v1, -0x1

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/a/a;->e:Z

    iput v1, p0, Lcom/arlib/floatingsearchview/a/a;->g:I

    iput v1, p0, Lcom/arlib/floatingsearchview/a/a;->h:I

    iput-object p1, p0, Lcom/arlib/floatingsearchview/a/a;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/arlib/floatingsearchview/a/a;->b:Lcom/arlib/floatingsearchview/a/a$a;

    iput p2, p0, Lcom/arlib/floatingsearchview/a/a;->f:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->c:Landroid/content/Context;

    sget v1, Lcom/arlib/floatingsearchview/R$drawable;->ic_arrow_back_black_24dp:I

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->d:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->d:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/a/a;->c:Landroid/content/Context;

    sget v2, Lcom/arlib/floatingsearchview/R$color;->gray_active_icon:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v4/d/a/a;->a(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/a/a;)Lcom/arlib/floatingsearchview/a/a$a;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->b:Lcom/arlib/floatingsearchview/a/a$a;

    return-object v0
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/a/a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->a:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/support/v7/widget/RecyclerView$w;I)V
    .locals 6

    const/4 v2, 0x0

    check-cast p1, Lcom/arlib/floatingsearchview/a/a$c;

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/a/a;->e:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/arlib/floatingsearchview/a/a$c;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setEnabled(Z)V

    iget-object v0, p1, Lcom/arlib/floatingsearchview/a/a$c;->p:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/arlib/floatingsearchview/a/a/a;

    iget-object v0, p1, Lcom/arlib/floatingsearchview/a/a$c;->n:Landroid/widget/TextView;

    invoke-interface {v4}, Lcom/arlib/floatingsearchview/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->i:Lcom/arlib/floatingsearchview/a/a$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->i:Lcom/arlib/floatingsearchview/a/a$b;

    iget-object v1, p1, Lcom/arlib/floatingsearchview/a/a$c;->a:Landroid/view/View;

    iget-object v2, p1, Lcom/arlib/floatingsearchview/a/a$c;->o:Landroid/widget/ImageView;

    iget-object v3, p1, Lcom/arlib/floatingsearchview/a/a$c;->n:Landroid/widget/TextView;

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/arlib/floatingsearchview/a/a$b;->a(Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/arlib/floatingsearchview/a/a/a;I)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p1, Lcom/arlib/floatingsearchview/a/a$c;->p:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    iget-object v0, p1, Lcom/arlib/floatingsearchview/a/a$c;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public a(Lcom/arlib/floatingsearchview/a/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/a/a;->i:Lcom/arlib/floatingsearchview/a/a$b;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/arlib/floatingsearchview/a/a/a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/a/a;->e()V

    return-void
.end method

.method public a(Z)V
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/arlib/floatingsearchview/a/a;->e:Z

    if-eq v1, p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/a/a;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/a/a;->e()V

    :cond_1
    return-void
.end method

.method public b(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$w;
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$layout;->search_suggestion_item:I

    invoke-virtual {v0, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/a/a$c;

    new-instance v2, Lcom/arlib/floatingsearchview/a/a$1;

    invoke-direct {v2, p0}, Lcom/arlib/floatingsearchview/a/a$1;-><init>(Lcom/arlib/floatingsearchview/a/a;)V

    invoke-direct {v1, v0, v2}, Lcom/arlib/floatingsearchview/a/a$c;-><init>(Landroid/view/View;Lcom/arlib/floatingsearchview/a/a$c$a;)V

    iget-object v0, v1, Lcom/arlib/floatingsearchview/a/a$c;->p:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/a/a;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, v1, Lcom/arlib/floatingsearchview/a/a$c;->n:Landroid/widget/TextView;

    iget v2, p0, Lcom/arlib/floatingsearchview/a/a;->f:I

    int-to-float v2, v2

    invoke-virtual {v0, v3, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    return-object v1
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/arlib/floatingsearchview/a/a/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public d(I)V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/arlib/floatingsearchview/a/a;->g:I

    if-eq v1, p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput p1, p0, Lcom/arlib/floatingsearchview/a/a;->g:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/a/a;->e()V

    :cond_1
    return-void
.end method

.method public e(I)V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/arlib/floatingsearchview/a/a;->h:I

    if-eq v1, p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput p1, p0, Lcom/arlib/floatingsearchview/a/a;->h:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/a/a;->e()V

    :cond_1
    return-void
.end method
