.class public Lcom/arlib/floatingsearchview/FloatingSearchView;
.super Landroid/widget/FrameLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arlib/floatingsearchview/FloatingSearchView$a;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$j;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$b;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$e;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$c;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$d;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$g;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$f;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$i;,
        Lcom/arlib/floatingsearchview/FloatingSearchView$h;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/String;

.field private B:Z

.field private C:I

.field private D:I

.field private E:Landroid/view/View;

.field private F:Ljava/lang/String;

.field private G:Lcom/arlib/floatingsearchview/FloatingSearchView$f;

.field private H:Landroid/widget/ImageView;

.field private I:Lcom/arlib/floatingsearchview/FloatingSearchView$d;

.field private J:Lcom/arlib/floatingsearchview/FloatingSearchView$c;

.field private K:Landroid/widget/ProgressBar;

.field private L:Landroid/support/v7/b/a/b;

.field private M:Landroid/graphics/drawable/Drawable;

.field private N:Landroid/graphics/drawable/Drawable;

.field private O:I

.field private P:Ljava/lang/String;

.field private Q:Z

.field private R:Z

.field private S:Lcom/arlib/floatingsearchview/util/view/MenuView;

.field private T:I

.field private U:I

.field private V:I

.field private W:Lcom/arlib/floatingsearchview/FloatingSearchView$e;

.field a:I

.field private aa:Landroid/widget/ImageView;

.field private ab:I

.field private ac:Landroid/graphics/drawable/Drawable;

.field private ad:I

.field private ae:Z

.field private af:Z

.field private ag:Landroid/view/View;

.field private ah:I

.field private ai:Landroid/widget/RelativeLayout;

.field private aj:Landroid/view/View;

.field private ak:Landroid/support/v7/widget/RecyclerView;

.field private al:I

.field private am:I

.field private an:Lcom/arlib/floatingsearchview/a/a;

.field private ao:Lcom/arlib/floatingsearchview/a/a$b;

.field private ap:I

.field private aq:Z

.field private ar:Z

.field private as:Z

.field private at:Lcom/arlib/floatingsearchview/FloatingSearchView$i;

.field private au:J

.field private av:Lcom/arlib/floatingsearchview/FloatingSearchView$h;

.field private aw:Landroid/support/v4/widget/DrawerLayout$f;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:Z

.field private final i:Z

.field private final j:Z

.field private final k:Z

.field private final l:I

.field private final m:Z

.field private final n:Landroid/view/animation/Interpolator;

.field private final o:I

.field private p:Landroid/app/Activity;

.field private q:Landroid/view/View;

.field private r:Landroid/graphics/drawable/Drawable;

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Lcom/arlib/floatingsearchview/FloatingSearchView$b;

.field private w:Landroid/support/v7/widget/CardView;

.field private x:Lcom/arlib/floatingsearchview/FloatingSearchView$g;

.field private y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const/16 v4, 0xfa

    const/4 v3, 0x1

    const/4 v2, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x96

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->b:I

    iput v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->c:I

    iput v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->d:I

    iput v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->e:I

    iput v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->f:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->g:I

    iput-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->h:Z

    iput-boolean v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->i:Z

    iput-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->j:Z

    iput-boolean v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->k:Z

    const/16 v0, 0x12

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->l:I

    iput-boolean v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->m:Z

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->n:Landroid/view/animation/Interpolator;

    iput v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->o:I

    iput-boolean v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->t:Z

    iput v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->C:I

    iput v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->D:I

    const-string v0, ""

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->F:Ljava/lang/String;

    iput v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->a:I

    iput-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->R:Z

    iput v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->T:I

    iput v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->al:I

    iput-boolean v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aq:Z

    iput-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->as:Z

    new-instance v0, Lcom/arlib/floatingsearchview/FloatingSearchView$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView$a;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;Lcom/arlib/floatingsearchview/FloatingSearchView$1;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aw:Landroid/support/v4/widget/DrawerLayout$f;

    invoke-direct {p0, p2}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private a(Ljava/util/List;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/arlib/floatingsearchview/a/a/a;",
            ">;I)I"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    if-le v1, p2, :cond_1

    move v1, p2

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView;Lcom/arlib/floatingsearchview/FloatingSearchView$h;)Lcom/arlib/floatingsearchview/FloatingSearchView$h;
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->av:Lcom/arlib/floatingsearchview/FloatingSearchView$h;

    return-object p1
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->F:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/support/v7/b/a/b;Z)V
    .locals 4

    if-eqz p2, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$12;

    invoke-direct {v1, p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$12;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;Landroid/support/v7/b/a/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :goto_0
    return-void

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/support/v7/b/a/b;->c(F)V

    goto :goto_0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private a(Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getHostActivity()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->p:Landroid/app/Activity;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$layout;->floating_search_layout:I

    invoke-static {v0, v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->q:Landroid/view/View;

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v1, -0x1000000

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->r:Landroid/graphics/drawable/Drawable;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->search_query_section:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/CardView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->clear_btn:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->search_bar_text:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->search_input_parent:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->E:Landroid/view/View;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->left_action:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->search_bar_search_progress:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->K:Landroid/widget/ProgressBar;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->e()V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ac:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v0, Lcom/arlib/floatingsearchview/R$id;->menu_view:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arlib/floatingsearchview/util/view/MenuView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->divider:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ag:Landroid/view/View;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->search_suggestions_section:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->suggestions_list_container:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->suggestions_list:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setupViews(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Z)V
    .locals 2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p3, :cond_0

    const-string v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p1, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :goto_0
    return-void

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView;Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Ljava/util/List;Z)V

    return-void
.end method

.method private a(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/arlib/floatingsearchview/a/a/a;",
            ">;Z)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$7;

    invoke-direct {v1, p0, p1, p2}, Lcom/arlib/floatingsearchview/FloatingSearchView$7;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;Ljava/util/List;Z)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    invoke-virtual {v0, p1}, Lcom/arlib/floatingsearchview/a/a;->a(Ljava/util/List;)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ag:Landroid/view/View;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ar:Z

    return p1
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    return-object v0
.end method

.method private b(I)V
    .locals 5

    const/16 v4, 0x30

    const/4 v3, 0x4

    const/4 v2, 0x0

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    invoke-static {v3}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTranslationX(F)V

    invoke-static {v3}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v0

    iget-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    if-eqz v1, :cond_0

    invoke-static {v4}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v1

    add-int/2addr v0, v1

    :goto_0
    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-virtual {v1, v2, v2, v0, v2}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setPadding(IIII)V

    :goto_1
    return-void

    :cond_0
    const/16 v1, 0xe

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    neg-int v1, p1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTranslationX(F)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    if-eqz v0, :cond_2

    invoke-static {v4}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v0

    add-int/2addr p1, v0

    :cond_2
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-virtual {v0, v2, v2, p1, v2}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setPadding(IIII)V

    goto :goto_1
.end method

.method private b(Landroid/support/v7/b/a/b;Z)V
    .locals 4

    if-eqz p2, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$13;

    invoke-direct {v1, p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$13;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;Landroid/support/v7/b/a/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v7/b/a/b;->c(F)V

    goto :goto_0

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private b(Landroid/util/AttributeSet;)V
    .locals 10

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    :try_start_0
    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_searchBarWidth:I

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    invoke-virtual {v1}, Landroid/support/v7/widget/CardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ag:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_searchBarMarginLeft:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_searchBarMarginTop:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_searchBarMarginRight:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    invoke-virtual {v0}, Landroid/support/v7/widget/CardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ag:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, 0x3

    invoke-static {v7}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {v0, v5, v3, v6, v8}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    add-int v8, v5, v7

    const/4 v9, 0x0

    add-int/2addr v7, v6

    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ag:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v1, v8, v9, v7, v3}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-virtual {v2, v5, v3, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/CardView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ag:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_searchHint:I

    invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSearchHint(Ljava/lang/String;)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_showSearchKey:I

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setShowSearchKey(Z)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_close_search_on_keyboard_dismiss:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setCloseSearchOnKeyboardDismiss(Z)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_dismissOnOutsideTouch:I

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setDismissOnOutsideClick(Z)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_searchSuggestionTextSize:I

    const/16 v1, 0x12

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/b;->b(I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSuggestionItemTextSize(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_leftActionMode:I

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->a:I

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_menu:I

    invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_menu:I

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->T:I

    :cond_0
    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_dimBackground:I

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setDimBackground(Z)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_showMoveSuggestionUp:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setShowMoveUpSuggestion(Z)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_suggestionsListAnimDuration:I

    const/16 v1, 0xfa

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->au:J

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_backgroundColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->background:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setBackgroundColor(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_leftActionColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->left_action_icon:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setLeftActionIconColor(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_actionMenuOverflowColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->overflow_icon_color:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setActionMenuOverflowColor(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_menuItemIconColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->menu_icon_color:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setMenuItemIconColor(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_dividerColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->divider:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setDividerColor(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_clearBtnColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->clear_btn_color:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setClearBtnColor(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_viewTextColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->dark_gray:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setViewTextColor(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_hintTextColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->hint_color:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setHintTextColor(I)V

    sget v0, Lcom/arlib/floatingsearchview/R$styleable;->FloatingSearchView_floatingSearch_suggestionRightIconColor:I

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/arlib/floatingsearchview/R$color;->gray_active_icon:I

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSuggestionRightIconColor(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/FloatingSearchView;Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Ljava/util/List;Z)V

    return-void
.end method

.method private b(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/arlib/floatingsearchview/a/a/a;",
            ">;Z)V"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v0, 0x5

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v0

    const/4 v1, 0x3

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v1

    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {p0, p1, v3}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Ljava/util/List;I)I

    move-result v3

    iget-object v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    sub-int/2addr v4, v3

    if-gt v4, v0, :cond_2

    sub-int/2addr v0, v4

    neg-int v0, v0

    :goto_0
    iget-object v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    neg-int v4, v4

    add-int/2addr v3, v4

    add-int/2addr v0, v3

    int-to-float v0, v0

    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    move-result v3

    cmpl-float v3, v0, v3

    if-ltz v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    neg-int v3, v3

    add-int/2addr v1, v3

    int-to-float v1, v1

    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-static {v3}, Landroid/support/v4/view/ah;->s(Landroid/view/View;)Landroid/support/v4/view/ay;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/view/ay;->b()V

    if-eqz p2, :cond_4

    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-static {v3}, Landroid/support/v4/view/ah;->s(Landroid/view/View;)Landroid/support/v4/view/ay;

    move-result-object v3

    iget-object v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->n:Landroid/view/animation/Interpolator;

    invoke-virtual {v3, v4}, Landroid/support/v4/view/ay;->a(Landroid/view/animation/Interpolator;)Landroid/support/v4/view/ay;

    move-result-object v3

    iget-wide v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->au:J

    invoke-virtual {v3, v4, v5}, Landroid/support/v4/view/ay;->a(J)Landroid/support/v4/view/ay;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/support/v4/view/ay;->c(F)Landroid/support/v4/view/ay;

    move-result-object v3

    new-instance v4, Lcom/arlib/floatingsearchview/FloatingSearchView$9;

    invoke-direct {v4, p0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView$9;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;F)V

    invoke-virtual {v3, v4}, Landroid/support/v4/view/ay;->a(Landroid/support/v4/view/be;)Landroid/support/v4/view/ay;

    move-result-object v1

    new-instance v3, Lcom/arlib/floatingsearchview/FloatingSearchView$8;

    invoke-direct {v3, p0, v0, v2}, Lcom/arlib/floatingsearchview/FloatingSearchView$8;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;FZ)V

    invoke-virtual {v1, v3}, Landroid/support/v4/view/ay;->a(Landroid/support/v4/view/bc;)Landroid/support/v4/view/ay;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ay;->c()V

    :cond_1
    :goto_1
    return-void

    :cond_2
    iget-object v5, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    sub-int v0, v5, v0

    if-ge v4, v0, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->at:Lcom/arlib/floatingsearchview/FloatingSearchView$i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->at:Lcom/arlib/floatingsearchview/FloatingSearchView$i;

    invoke-interface {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$i;->a(F)V

    goto :goto_1
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->af:Z

    return p1
.end method

.method static synthetic c(Lcom/arlib/floatingsearchview/FloatingSearchView;)V
    .locals 0

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->m()V

    return-void
.end method

.method private c(Z)V
    .locals 9

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v8, 0x0

    const-wide/16 v6, 0x96

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->K:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->a:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_1
    :pswitch_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-direct {p0, v0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Landroid/support/v7/b/a/b;Z)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->R:Z

    if-nez v0, :cond_0

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->M:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    const/high16 v1, 0x42340000    # 45.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setRotation(F)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->f(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->e(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v1

    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v4, 0x1f4

    invoke-virtual {v2, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/animation/Animator;

    aput-object v0, v3, v8

    const/4 v0, 0x1

    aput-object v1, v3, v0

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_1

    :pswitch_3
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->M:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->E:Landroid/view/View;

    invoke-static {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->c(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setScaleX(F)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setScaleY(F)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-static {v2}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setTranslationX(F)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->c(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v1

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v2}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v2

    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v3}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v3

    iget-object v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v4}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->e(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v1, v6, v7}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v2, v6, v7}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v4, v6, v7}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v6, 0x1f4

    invoke-virtual {v5, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    const/4 v6, 0x5

    new-array v6, v6, [Landroid/animation/Animator;

    aput-object v0, v6, v8

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v2, v6, v0

    const/4 v0, 0x3

    aput-object v3, v6, v0

    const/4 v0, 0x4

    aput-object v4, v6, v0

    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    goto/16 :goto_1

    :cond_2
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->E:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationX(F)V

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic c(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ae:Z

    return p1
.end method

.method static synthetic d(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$h;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->av:Lcom/arlib/floatingsearchview/FloatingSearchView$h;

    return-object v0
.end method

.method static synthetic d(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSearchFocusedInternal(Z)V

    return-void
.end method

.method private d(Z)V
    .locals 8

    const/4 v5, 0x4

    const-wide/16 v6, 0x12c

    const/high16 v4, 0x3f000000    # 0.5f

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->a:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-direct {p0, v0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Landroid/support/v7/b/a/b;Z)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->N:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0, v1, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Z)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->M:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->E:Landroid/view/View;

    invoke-static {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    const/16 v1, 0x34

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->c(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v1

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v2}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v2

    iget-object v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-static {v3}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Landroid/view/View;)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->e(F)Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;

    move-result-object v3

    invoke-virtual {v1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v2, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance v4, Lcom/arlib/floatingsearchview/FloatingSearchView$10;

    invoke-direct {v4, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$10;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v1, v4}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v6, 0x15e

    invoke-virtual {v4, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    new-array v5, v5, [Landroid/animation/Animator;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    const/4 v1, 0x2

    aput-object v3, v5, v1

    const/4 v1, 0x3

    aput-object v0, v5, v1

    invoke-virtual {v4, v5}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic e(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/support/v7/widget/CardView;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    return-object v0
.end method

.method private e()V
    .locals 2

    new-instance v0, Landroid/support/v7/b/a/b;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/b/a/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$drawable;->ic_clear_black_24dp:I

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ac:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$drawable;->ic_arrow_back_black_24dp:I

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->M:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$drawable;->ic_search_black_24dp:I

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->N:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method static synthetic e(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    return p1
.end method

.method static synthetic f(Lcom/arlib/floatingsearchview/FloatingSearchView;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->T:I

    return v0
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->C:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setTextColor(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->D:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setHintTextColor(I)V

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->p:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->p:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    invoke-virtual {v0}, Landroid/support/v7/widget/CardView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$11;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$11;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$17;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$17;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->setMenuCallback(Landroid/support/v7/view/menu/h$a;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$18;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$18;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->setOnVisibleWidthChanged(Lcom/arlib/floatingsearchview/util/view/MenuView$b;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->U:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->setActionIconColor(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->V:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->setOverflowColor(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$19;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$19;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$20;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$20;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$21;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$21;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$22;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$22;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setOnKeyboardDismissedListener(Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$23;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$23;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setOnSearchKeyListener(Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$2;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$2;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h()V

    return-void
.end method

.method static synthetic f(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->c(Z)V

    return-void
.end method

.method private g()I
    .locals 1

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    invoke-virtual {v0}, Landroid/support/v7/widget/CardView;->getMeasuredWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    invoke-virtual {v0}, Landroid/support/v7/widget/CardView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    goto :goto_0
.end method

.method static synthetic g(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$e;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->W:Lcom/arlib/floatingsearchview/FloatingSearchView$e;

    return-object v0
.end method

.method private getHostActivity()Landroid/app/Activity;
    .locals 2

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    :goto_1
    return-object v0

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    return-object v0
.end method

.method private h()V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x34

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v1

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->a:I

    packed-switch v2, :pswitch_data_0

    :goto_0
    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->E:Landroid/view/View;

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationX(F)V

    return-void

    :pswitch_0
    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :pswitch_1
    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :pswitch_2
    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/support/v7/b/a/b;->c(F)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    neg-int v0, v1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private i()V
    .locals 2

    const/4 v1, 0x1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->R:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Z)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Z)V

    goto :goto_0
.end method

.method static synthetic i(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->af:Z

    return v0
.end method

.method private j()V
    .locals 2

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->s:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->r:Landroid/graphics/drawable/Drawable;

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->r:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0
.end method

.method static synthetic j(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    return v0
.end method

.method static synthetic k(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    return-object v0
.end method

.method private k()V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    iget-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->as:Z

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/a/a;->a(Z)V

    :cond_0
    return-void
.end method

.method static synthetic l(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$f;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->G:Lcom/arlib/floatingsearchview/FloatingSearchView$f;

    return-object v0
.end method

.method private l()V
    .locals 4

    const/4 v2, 0x1

    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$h;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$e;)V

    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/arlib/floatingsearchview/FloatingSearchView$4;

    invoke-direct {v2, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$4;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Lcom/arlib/floatingsearchview/FloatingSearchView$5;

    invoke-direct {v2, p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$5;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;Landroid/view/GestureDetector;)V

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$l;)V

    new-instance v0, Lcom/arlib/floatingsearchview/a/a;

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ap:I

    new-instance v3, Lcom/arlib/floatingsearchview/FloatingSearchView$6;

    invoke-direct {v3, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$6;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/arlib/floatingsearchview/a/a;-><init>(Landroid/content/Context;ILcom/arlib/floatingsearchview/a/a$a;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->k()V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->al:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/a/a;->d(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->am:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/a/a;->e(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$a;)V

    const/4 v0, 0x5

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setTranslationY(F)V

    return-void
.end method

.method static synthetic m(Lcom/arlib/floatingsearchview/FloatingSearchView;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->F:Ljava/lang/String;

    return-object v0
.end method

.method private m()V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method private n()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$14;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$14;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x96
        0x0
    .end array-data
.end method

.method static synthetic n(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ae:Z

    return v0
.end method

.method private o()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$15;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$15;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x96
    .end array-data
.end method

.method static synthetic o(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->z:Z

    return v0
.end method

.method static synthetic p(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$g;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->x:Lcom/arlib/floatingsearchview/FloatingSearchView$g;

    return-object v0
.end method

.method static synthetic q(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->B:Z

    return v0
.end method

.method static synthetic r(Lcom/arlib/floatingsearchview/FloatingSearchView;)V
    .locals 0

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->i()V

    return-void
.end method

.method static synthetic s(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$c;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->J:Lcom/arlib/floatingsearchview/FloatingSearchView$c;

    return-object v0
.end method

.method private setSearchFocusedInternal(Z)V
    .locals 4

    const/4 v0, 0x0

    const/4 v3, 0x1

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    if-eqz p1, :cond_5

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-virtual {v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->requestFocus()Z

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->m()V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->s:Z

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->o()V

    :cond_0
    invoke-direct {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(I)V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-virtual {v1, v3}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Z)V

    invoke-direct {p0, v3}, Lcom/arlib/floatingsearchview/FloatingSearchView;->c(Z)V

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-static {v1, v2}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/content/Context;Landroid/widget/EditText;)V

    iget-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->R:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Z)V

    :cond_1
    iget-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->B:Z

    if-eqz v1, :cond_2

    iput-boolean v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->af:Z

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-virtual {v2}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_3

    const/4 v0, 0x4

    :cond_3
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->v:Lcom/arlib/floatingsearchview/FloatingSearchView$b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->v:Lcom/arlib/floatingsearchview/FloatingSearchView$b;

    invoke-interface {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$b;->a()V

    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    return-void

    :cond_5
    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->q:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->c()V

    iget-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->s:Z

    if-eqz v1, :cond_6

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->n()V

    :cond_6
    invoke-direct {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-virtual {v0, v3}, Lcom/arlib/floatingsearchview/util/view/MenuView;->b(Z)V

    invoke-direct {p0, v3}, Lcom/arlib/floatingsearchview/FloatingSearchView;->d(Z)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->p:Landroid/app/Activity;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->p:Landroid/app/Activity;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/app/Activity;)V

    :cond_7
    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->B:Z

    if-eqz v0, :cond_8

    iput-boolean v3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->af:Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->v:Lcom/arlib/floatingsearchview/FloatingSearchView$b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->v:Lcom/arlib/floatingsearchview/FloatingSearchView$b;

    invoke-interface {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$b;->b()V

    goto :goto_0
.end method

.method private setSuggestionItemTextSize(I)V
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ap:I

    return-void
.end method

.method private setupViews(Landroid/util/AttributeSet;)V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Landroid/util/AttributeSet;)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->r:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->f()V

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->l()V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->r:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method static synthetic t(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->t:Z

    return v0
.end method

.method static synthetic u(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->p:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic v(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/support/v7/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method static synthetic w(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$i;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->at:Lcom/arlib/floatingsearchview/FloatingSearchView$i;

    return-object v0
.end method

.method static synthetic x(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic y(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->r:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->K:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setAlpha(F)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->K:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->K:Landroid/widget/ProgressBar;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public a(I)V
    .locals 2

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->T:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->g()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(II)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Z)V

    :cond_0
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

    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Ljava/util/List;Z)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->R:Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-direct {p0, v0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Landroid/support/v7/b/a/b;Z)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->I:Lcom/arlib/floatingsearchview/FloatingSearchView$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->I:Lcom/arlib/floatingsearchview/FloatingSearchView$d;

    invoke-interface {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$d;->a()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->K:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b(Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->R:Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-direct {p0, v0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Landroid/support/v7/b/a/b;Z)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->I:Lcom/arlib/floatingsearchview/FloatingSearchView$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->I:Lcom/arlib/floatingsearchview/FloatingSearchView$d;

    invoke-interface {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$d;->b()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Ljava/util/List;)V

    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    return v0
.end method

.method public getQuery()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->F:Ljava/lang/String;

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/view/ah;->s(Landroid/view/View;)Landroid/support/v4/view/ay;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ay;->b()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aq:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->requestLayout()V

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aj:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/arlib/floatingsearchview/FloatingSearchView$1;

    invoke-direct {v2, p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$1;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;I)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aq:Z

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->j()V

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->T:I

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(I)V

    :cond_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v1, 0x0

    check-cast p1, Lcom/arlib/floatingsearchview/FloatingSearchView$j;

    invoke-virtual {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->b(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->B:Z

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->c(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->T:I

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->d(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->au:J

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->e(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSuggestionItemTextSize(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->f(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setDismissOnOutsideClick(Z)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->g(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setShowMoveUpSuggestion(Z)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->h(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setShowSearchKey(Z)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->i(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSearchHint(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->j(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setBackgroundColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->k(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSuggestionsTextColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->l(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setQueryTextColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->m(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setHintTextColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->n(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setActionMenuOverflowColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->o(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setMenuItemIconColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->p(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setLeftActionIconColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->q(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setClearBtnColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->r(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSuggestionRightIconColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->s(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setDividerColor(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->t(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setLeftActionMode(I)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->u(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setDimBackground(Z)V

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->v(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setCloseSearchOnKeyboardDismiss(Z)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    iget-boolean v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->r:Landroid/graphics/drawable/Drawable;

    const/16 v2, 0x96

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iput-boolean v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->af:Z

    iput-boolean v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ae:Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    new-instance v0, Lcom/arlib/floatingsearchview/FloatingSearchView$16;

    invoke-direct {v0, p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$16;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;Lcom/arlib/floatingsearchview/FloatingSearchView$j;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->av:Lcom/arlib/floatingsearchview/FloatingSearchView$h;

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->aa:Landroid/widget/ImageView;

    invoke-static {p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->x(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x4

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/content/Context;Landroid/widget/EditText;)V

    :cond_0
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$j;

    invoke-direct {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    invoke-virtual {v0}, Lcom/arlib/floatingsearchview/a/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Ljava/util/List;)Ljava/util/List;

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->u:Z

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z

    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getQuery()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Ljava/lang/String;)Ljava/lang/String;

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ap:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->P:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->b(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Ljava/lang/String;)Ljava/lang/String;

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->t:Z

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->b(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->as:Z

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->c(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->Q:Z

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->d(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->B:Z

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->e(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ad:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->b(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->al:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->c(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->C:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->d(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->D:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->e(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->V:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->f(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->U:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->g(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->O:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->h(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ab:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->i(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->al:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->j(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ah:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->k(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->T:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->l(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->a:I

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->m(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->s:Z

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->f(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->t:Z

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->g(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z

    return-object v1
.end method

.method public setActionMenuOverflowColor(I)V
    .locals 2

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->V:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->V:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->setOverflowColor(I)V

    :cond_0
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ad:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->w:Landroid/support/v7/widget/CardView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/CardView;->setCardBackgroundColor(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ak:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public setClearBtnColor(I)V
    .locals 2

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ab:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ac:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ab:I

    invoke-static {v0, v1}, Landroid/support/v4/d/a/a;->a(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public setCloseSearchOnKeyboardDismiss(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->z:Z

    return-void
.end method

.method public setDimBackground(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->s:Z

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->j()V

    return-void
.end method

.method public setDismissOnOutsideClick(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->t:Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ai:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/arlib/floatingsearchview/FloatingSearchView$3;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/FloatingSearchView$3;-><init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public setDividerColor(I)V
    .locals 2

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ah:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ag:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ag:Landroid/view/View;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ah:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public setHintTextColor(I)V
    .locals 1

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->D:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-virtual {v0, p1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setHintTextColor(I)V

    :cond_0
    return-void
.end method

.method public setLeftActionIconColor(I)V
    .locals 1

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->O:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-virtual {v0, p1}, Landroid/support/v7/b/a/b;->a(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->M:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Landroid/support/v4/d/a/a;->a(Landroid/graphics/drawable/Drawable;I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->N:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Landroid/support/v4/d/a/a;->a(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public setLeftActionMode(I)V
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->a:I

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h()V

    return-void
.end method

.method public setLeftMenuOpen(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->R:Z

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    if-eqz p1, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    invoke-virtual {v1, v0}, Landroid/support/v7/b/a/b;->c(F)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setMenuIconProgress(F)V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->L:Landroid/support/v7/b/a/b;

    invoke-virtual {v0, p1}, Landroid/support/v7/b/a/b;->c(F)V

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    invoke-virtual {p0, v4}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Z)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    float-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0, v4}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Z)V

    goto :goto_0
.end method

.method public setMenuItemIconColor(I)V
    .locals 2

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->U:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->S:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->U:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->setActionIconColor(I)V

    :cond_0
    return-void
.end method

.method public setOnBindSuggestionCallback(Lcom/arlib/floatingsearchview/a/a$b;)V
    .locals 2

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ao:Lcom/arlib/floatingsearchview/a/a$b;

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->ao:Lcom/arlib/floatingsearchview/a/a$b;

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/a/a;->a(Lcom/arlib/floatingsearchview/a/a$b;)V

    :cond_0
    return-void
.end method

.method public setOnFocusChangeListener(Lcom/arlib/floatingsearchview/FloatingSearchView$b;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->v:Lcom/arlib/floatingsearchview/FloatingSearchView$b;

    return-void
.end method

.method public setOnHomeActionClickListener(Lcom/arlib/floatingsearchview/FloatingSearchView$c;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->J:Lcom/arlib/floatingsearchview/FloatingSearchView$c;

    return-void
.end method

.method public setOnLeftMenuClickListener(Lcom/arlib/floatingsearchview/FloatingSearchView$d;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->I:Lcom/arlib/floatingsearchview/FloatingSearchView$d;

    return-void
.end method

.method public setOnMenuItemClickListener(Lcom/arlib/floatingsearchview/FloatingSearchView$e;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->W:Lcom/arlib/floatingsearchview/FloatingSearchView$e;

    return-void
.end method

.method public setOnQueryChangeListener(Lcom/arlib/floatingsearchview/FloatingSearchView$f;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->G:Lcom/arlib/floatingsearchview/FloatingSearchView$f;

    return-void
.end method

.method public setOnSearchListener(Lcom/arlib/floatingsearchview/FloatingSearchView$g;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->x:Lcom/arlib/floatingsearchview/FloatingSearchView$g;

    return-void
.end method

.method public setOnSuggestionsListHeightChanged(Lcom/arlib/floatingsearchview/FloatingSearchView$i;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->at:Lcom/arlib/floatingsearchview/FloatingSearchView$i;

    return-void
.end method

.method public setQueryTextColor(I)V
    .locals 2

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->C:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->C:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setSearchBarTitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->A:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->B:Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-virtual {v0, p1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSearchFocusable(Z)V
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-virtual {v0, p1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setFocusable(Z)V

    return-void
.end method

.method public setSearchHint(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    :goto_0
    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->P:Ljava/lang/String;

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->P:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setHint(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/arlib/floatingsearchview/R$string;->abc_search_hint:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method public setSearchText(Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->B:Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-virtual {v0, p1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setShowMoveUpSuggestion(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->as:Z

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->k()V

    return-void
.end method

.method public setShowSearchKey(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->Q:Z

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setImeOptions(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->y:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setImeOptions(I)V

    goto :goto_0
.end method

.method public setSuggestionRightIconColor(I)V
    .locals 2

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->am:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->am:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/a/a;->e(I)V

    :cond_0
    return-void
.end method

.method public setSuggestionsAnimDuration(J)V
    .locals 1

    iput-wide p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->au:J

    return-void
.end method

.method public setSuggestionsTextColor(I)V
    .locals 2

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->al:I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->an:Lcom/arlib/floatingsearchview/a/a;

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView;->al:I

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/a/a;->d(I)V

    :cond_0
    return-void
.end method

.method public setViewTextColor(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSuggestionsTextColor(I)V

    invoke-virtual {p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setQueryTextColor(I)V

    return-void
.end method
