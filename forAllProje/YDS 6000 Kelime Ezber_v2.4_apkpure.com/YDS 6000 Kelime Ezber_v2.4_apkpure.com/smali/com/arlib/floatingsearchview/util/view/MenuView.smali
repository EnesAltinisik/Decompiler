.class public Lcom/arlib/floatingsearchview/util/view/MenuView;
.super Landroid/widget/LinearLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arlib/floatingsearchview/util/view/MenuView$a;,
        Lcom/arlib/floatingsearchview/util/view/MenuView$b;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:F

.field private d:I

.field private e:Landroid/support/v7/view/menu/h;

.field private f:Landroid/support/v7/view/g;

.field private g:Lcom/arlib/floatingsearchview/util/a;

.field private h:Landroid/support/v7/view/menu/h$a;

.field private i:I

.field private j:I

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/view/menu/j;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/view/menu/j;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/view/menu/j;",
            ">;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:Lcom/arlib/floatingsearchview/util/view/MenuView$b;

.field private p:I

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/animation/ObjectAnimator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x190

    iput v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->a:I

    const/16 v0, 0x1c2

    iput v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->d:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->l:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->m:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->n:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$dimen;->square_button_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->c:F

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a()V

    return-void
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/util/view/MenuView;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->p:I

    return p1
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/util/view/MenuView;)Landroid/support/v7/view/menu/h$a;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->h:Landroid/support/v7/view/menu/h$a;

    return-object v0
.end method

.method private a(Ljava/util/List;Lcom/arlib/floatingsearchview/util/view/MenuView$a;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/view/menu/j;",
            ">;",
            "Lcom/arlib/floatingsearchview/util/view/MenuView$a;",
            ")",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/view/menu/j;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/view/menu/j;

    invoke-interface {p2, v0}, Lcom/arlib/floatingsearchview/util/view/MenuView$a;->a(Landroid/support/v7/view/menu/j;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private a()V
    .locals 3

    new-instance v0, Landroid/support/v7/view/menu/h;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/view/menu/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    new-instance v0, Lcom/arlib/floatingsearchview/util/a;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    invoke-direct {v0, v1, v2, p0}, Lcom/arlib/floatingsearchview/util/a;-><init>(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/view/View;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->g:Lcom/arlib/floatingsearchview/util/a;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$color;->gray_active_icon:I

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->i:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$color;->gray_active_icon:I

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->j:I

    return-void
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/util/view/MenuView;)Landroid/support/v7/view/menu/h;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    return-object v0
.end method

.method private b()V
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->i:I

    invoke-static {v0, v2}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/widget/ImageView;I)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->n:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v1, v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->j:I

    invoke-static {v0, v2}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/widget/ImageView;I)V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method private c()Landroid/widget/ImageView;
    .locals 3

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$layout;->action_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lcom/arlib/floatingsearchview/util/view/MenuView;)Lcom/arlib/floatingsearchview/util/a;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->g:Lcom/arlib/floatingsearchview/util/a;

    return-object v0
.end method

.method static synthetic d(Lcom/arlib/floatingsearchview/util/view/MenuView;)F
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->c:F

    return v0
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method static synthetic e(Lcom/arlib/floatingsearchview/util/view/MenuView;)Lcom/arlib/floatingsearchview/util/view/MenuView$b;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->o:Lcom/arlib/floatingsearchview/util/view/MenuView$b;

    return-object v0
.end method

.method static synthetic f(Lcom/arlib/floatingsearchview/util/view/MenuView;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->p:I

    return v0
.end method

.method static synthetic g(Lcom/arlib/floatingsearchview/util/view/MenuView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->n:Z

    return v0
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->f:Landroid/support/v7/view/g;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/view/g;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/view/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->f:Landroid/support/v7/view/g;

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->f:Landroid/support/v7/view/g;

    return-object v0
.end method

.method private getOverflowActionView()Landroid/widget/ImageView;
    .locals 3

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$layout;->overflow_action_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method public a(II)V
    .locals 10

    const/4 v2, 0x0

    iput p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->d:I

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->m:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->l:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->k:Ljava/util/List;

    new-instance v0, Landroid/support/v7/view/menu/h;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/view/menu/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    new-instance v0, Lcom/arlib/floatingsearchview/util/a;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    invoke-direct {v0, v1, v3, p0}, Lcom/arlib/floatingsearchview/util/a;-><init>(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/view/View;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->g:Lcom/arlib/floatingsearchview/util/a;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->removeAllViews()V

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    iget v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->d:I

    iget-object v3, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {v0, v1, v3}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/h;->k()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->k:Ljava/util/List;

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {v1}, Landroid/support/v7/view/menu/h;->l()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->k:Ljava/util/List;

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$1;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/util/view/MenuView$1;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->k:Ljava/util/List;

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$11;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/util/view/MenuView$11;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;)V

    invoke-direct {p0, v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Ljava/util/List;Lcom/arlib/floatingsearchview/util/view/MenuView$a;)Ljava/util/List;

    move-result-object v5

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->c:F

    float-to-int v0, v0

    div-int v1, p2, v0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    iget-object v3, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->k:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lt v0, v3, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_8

    :cond_2
    const/4 v0, 0x1

    add-int/lit8 v1, v1, -0x1

    move v9, v0

    move v0, v1

    move v1, v9

    :goto_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    if-lez v0, :cond_3

    move v3, v2

    move v4, v0

    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/view/menu/j;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/j;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->c()Landroid/widget/ImageView;

    move-result-object v7

    invoke-virtual {v0}, Landroid/support/v7/view/menu/j;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget v8, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->i:I

    invoke-static {v7, v8}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/widget/ImageView;I)V

    invoke-virtual {p0, v7}, Lcom/arlib/floatingsearchview/util/view/MenuView;->addView(Landroid/view/View;)V

    iget-object v8, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->l:Ljava/util/List;

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroid/support/v7/view/menu/j;->getItemId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v8, Lcom/arlib/floatingsearchview/util/view/MenuView$12;

    invoke-direct {v8, p0, v0}, Lcom/arlib/floatingsearchview/util/view/MenuView$12;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/support/v7/view/menu/j;)V

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v4, v4, -0x1

    if-nez v4, :cond_5

    :cond_3
    iput-boolean v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->n:Z

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getOverflowActionView()Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$drawable;->ic_more_vert_black_24dp:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->j:I

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/widget/ImageView;I)V

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->addView(Landroid/view/View;)V

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$13;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/util/view/MenuView$13;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->h:Landroid/support/v7/view/menu/h$a;

    invoke-virtual {v0, v1}, Landroid/support/v7/view/menu/h;->a(Landroid/support/v7/view/menu/h$a;)V

    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v3, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {v3, v0}, Landroid/support/v7/view/menu/h;->removeItem(I)V

    goto :goto_3

    :cond_5
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_2

    :cond_6
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->o:Lcom/arlib/floatingsearchview/util/view/MenuView$b;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->c:F

    float-to-int v0, v0

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildCount()I

    move-result v1

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->n:Z

    if-eqz v1, :cond_7

    const/16 v1, 0x8

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v2

    :cond_7
    sub-int/2addr v0, v2

    iput v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->p:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->o:Lcom/arlib/floatingsearchview/util/view/MenuView$b;

    iget v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->p:I

    invoke-interface {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView$b;->a(I)V

    goto/16 :goto_0

    :cond_8
    move v0, v1

    move v1, v2

    goto/16 :goto_1
.end method

.method public a(Z)V
    .locals 9

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->d()V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->k:Ljava/util/List;

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$14;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/util/view/MenuView$14;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;)V

    invoke-direct {p0, v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Ljava/util/List;Lcom/arlib/floatingsearchview/util/view/MenuView$a;)Ljava/util/List;

    move-result-object v3

    const/4 v0, 0x0

    move v2, v0

    :goto_1
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/view/menu/j;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->l:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/view/menu/j;

    invoke-virtual {v1}, Landroid/support/v7/view/menu/j;->getItemId()I

    move-result v1

    invoke-virtual {v0}, Landroid/support/v7/view/menu/j;->getItemId()I

    move-result v4

    if-eq v1, v4, :cond_2

    invoke-virtual {p0, v2}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/j;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget v4, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->j:I

    invoke-static {v1, v4}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/widget/ImageView;I)V

    new-instance v4, Lcom/arlib/floatingsearchview/util/view/MenuView$15;

    invoke-direct {v4, p0, v0}, Lcom/arlib/floatingsearchview/util/view/MenuView$15;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/support/v7/view/menu/j;)V

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int v1, v0, v2

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->n:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    :goto_2
    add-int v4, v1, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    const/4 v0, 0x0

    move v3, v0

    :goto_3
    if-ge v3, v2, :cond_7

    invoke-virtual {p0, v3}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->c:F

    int-to-float v1, v4

    mul-float/2addr v1, v0

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->n:Z

    if-eqz v0, :cond_5

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v0

    :goto_4
    int-to-float v0, v0

    sub-float v6, v1, v0

    iget-object v7, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v8

    if-eqz p1, :cond_6

    const-wide/16 v0, 0x190

    :goto_5
    invoke-virtual {v8, v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(J)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/animation/Interpolator;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$16;

    invoke-direct {v1, p0, v5, v6}, Lcom/arlib/floatingsearchview/util/view/MenuView$16;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;F)V

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->d(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    goto :goto_4

    :cond_6
    const-wide/16 v0, 0x0

    goto :goto_5

    :cond_7
    move v3, v2

    :goto_6
    add-int v0, v4, v2

    if-ge v3, v0, :cond_d

    invoke-virtual {p0, v3}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq v3, v0, :cond_8

    iget-object v6, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v7

    if-eqz p1, :cond_9

    const-wide/16 v0, 0x190

    :goto_7
    invoke-virtual {v7, v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(J)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$17;

    invoke-direct {v1, p0, v5}, Lcom/arlib/floatingsearchview/util/view/MenuView$17;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    iget v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->c:F

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->d(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v6, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v7

    if-eqz p1, :cond_a

    const-wide/16 v0, 0x190

    :goto_8
    invoke-virtual {v7, v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(J)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$18;

    invoke-direct {v1, p0, v5}, Lcom/arlib/floatingsearchview/util/view/MenuView$18;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v7

    if-eqz p1, :cond_b

    const-wide/16 v0, 0x190

    :goto_9
    invoke-virtual {v7, v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(J)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$2;

    invoke-direct {v1, p0, v5}, Lcom/arlib/floatingsearchview/util/view/MenuView$2;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v7

    if-eqz p1, :cond_c

    const-wide/16 v0, 0x190

    :goto_a
    invoke-virtual {v7, v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(J)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/util/view/MenuView$3;

    invoke-direct {v1, p0, v5}, Lcom/arlib/floatingsearchview/util/view/MenuView$3;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->e(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_6

    :cond_9
    const-wide/16 v0, 0x0

    goto/16 :goto_7

    :cond_a
    const-wide/16 v0, 0x0

    goto :goto_8

    :cond_b
    const-wide/16 v0, 0x0

    goto :goto_9

    :cond_c
    const-wide/16 v0, 0x0

    goto :goto_a

    :cond_d
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    if-nez p1, :cond_e

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    :cond_e
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    iget-object v3, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Landroid/animation/ObjectAnimator;

    invoke-interface {v0, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/Animator;

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;

    invoke-direct {v0, p0, v2}, Lcom/arlib/floatingsearchview/util/view/MenuView$4;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;I)V

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    goto/16 :goto_0
.end method

.method public b(Z)V
    .locals 7

    const/high16 v6, 0x3f800000    # 1.0f

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->d()V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    const/4 v0, 0x0

    move v3, v0

    :goto_1
    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildCount()I

    move-result v0

    if-ge v3, v0, :cond_4

    invoke-virtual {p0, v3}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    move-object v0, v1

    check-cast v0, Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->l:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/MenuItem;

    invoke-interface {v2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget v4, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->i:I

    invoke-static {v0, v4}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/widget/ImageView;I)V

    new-instance v4, Lcom/arlib/floatingsearchview/util/view/MenuView$5;

    invoke-direct {v4, p0, v2}, Lcom/arlib/floatingsearchview/util/view/MenuView$5;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/MenuItem;)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->m:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-le v3, v2, :cond_3

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    :cond_3
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    new-instance v5, Lcom/arlib/floatingsearchview/util/view/MenuView$6;

    invoke-direct {v5, p0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView$6;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V

    invoke-virtual {v4, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/animation/Interpolator;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->c(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    new-instance v5, Lcom/arlib/floatingsearchview/util/view/MenuView$7;

    invoke-direct {v5, p0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView$7;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V

    invoke-virtual {v4, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/animation/Interpolator;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    new-instance v5, Lcom/arlib/floatingsearchview/util/view/MenuView$8;

    invoke-direct {v5, p0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView$8;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V

    invoke-virtual {v4, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/animation/Interpolator;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-static {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    new-instance v5, Lcom/arlib/floatingsearchview/util/view/MenuView$9;

    invoke-direct {v5, p0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView$9;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V

    invoke-virtual {v4, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/animation/Animator$AnimatorListener;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/animation/Interpolator;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->e(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_1

    :cond_4
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    if-nez p1, :cond_5

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    :cond_5
    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Landroid/animation/ObjectAnimator;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/Animator;

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;

    invoke-direct {v0, p0}, Lcom/arlib/floatingsearchview/util/view/MenuView$10;-><init>(Lcom/arlib/floatingsearchview/util/view/MenuView;)V

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    goto/16 :goto_0
.end method

.method public getVisibleWidth()I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->p:I

    return v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->d()V

    return-void
.end method

.method public setActionIconColor(I)V
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->i:I

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->b()V

    return-void
.end method

.method public setMenuCallback(Landroid/support/v7/view/menu/h$a;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->h:Landroid/support/v7/view/menu/h$a;

    return-void
.end method

.method public setOnVisibleWidthChanged(Lcom/arlib/floatingsearchview/util/view/MenuView$b;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->o:Lcom/arlib/floatingsearchview/util/view/MenuView$b;

    return-void
.end method

.method public setOverflowColor(I)V
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView;->j:I

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->b()V

    return-void
.end method
