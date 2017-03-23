.class public Lcom/nightonke/boommenu/BoomMenuButton;
.super Landroid/widget/FrameLayout;

# interfaces
.implements Lcom/nightonke/boommenu/b/g;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:Lcom/nightonke/boommenu/a/g;

.field private J:Lcom/nightonke/boommenu/c/d;

.field private K:I

.field private L:Lcom/nightonke/boommenu/d;

.field private M:I

.field private N:J

.field private O:J

.field private P:J

.field private Q:J

.field private R:Z

.field private S:Z

.field private T:Lcom/nightonke/boommenu/a/f;

.field private U:I

.field private V:Lcom/nightonke/boommenu/a/b;

.field private W:Lcom/nightonke/boommenu/a/d;

.field private a:Landroid/content/Context;

.field private aA:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation
.end field

.field private aB:Ljava/lang/Float;

.field private aa:Lcom/nightonke/boommenu/a/d;

.field private ab:Lcom/nightonke/boommenu/a/d;

.field private ac:Lcom/nightonke/boommenu/a/d;

.field private ad:Lcom/nightonke/boommenu/a/d;

.field private ae:Lcom/nightonke/boommenu/a/d;

.field private af:I

.field private ag:Lcom/nightonke/boommenu/a;

.field private ah:Landroid/view/ViewGroup;

.field private ai:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nightonke/boommenu/b/a;",
            ">;"
        }
    .end annotation
.end field

.field private aj:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nightonke/boommenu/b/b;",
            ">;"
        }
    .end annotation
.end field

.field private ak:F

.field private al:F

.field private am:F

.field private an:F

.field private ao:F

.field private ap:F

.field private aq:Lcom/nightonke/boommenu/b/d;

.field private ar:Lcom/nightonke/boommenu/b/c;

.field private as:F

.field private at:F

.field private au:F

.field private av:F

.field private aw:F

.field private ax:F

.field private ay:F

.field private az:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Ljava/lang/Runnable;

.field private i:Z

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Lcom/nightonke/boommenu/BMBShadow;

.field private o:I

.field private p:Lcom/nightonke/boommenu/b;

.field private q:Z

.field private r:Z

.field private s:I

.field private t:I

.field private u:I

.field private v:Landroid/widget/FrameLayout;

.field private w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nightonke/boommenu/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation
.end field

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->b:Z

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->g:Z

    sget-object v0, Lcom/nightonke/boommenu/b;->e:Lcom/nightonke/boommenu/b;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    sget-object v0, Lcom/nightonke/boommenu/c/d;->Q:Lcom/nightonke/boommenu/c/d;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    sget-object v0, Lcom/nightonke/boommenu/a;->c:Lcom/nightonke/boommenu/a;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    sget-object v0, Lcom/nightonke/boommenu/b/d;->R:Lcom/nightonke/boommenu/b/d;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    sget-object v0, Lcom/nightonke/boommenu/b/c;->a:Lcom/nightonke/boommenu/b/c;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->b:Z

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->g:Z

    sget-object v0, Lcom/nightonke/boommenu/b;->e:Lcom/nightonke/boommenu/b;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    sget-object v0, Lcom/nightonke/boommenu/c/d;->Q:Lcom/nightonke/boommenu/c/d;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    sget-object v0, Lcom/nightonke/boommenu/a;->c:Lcom/nightonke/boommenu/a;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    sget-object v0, Lcom/nightonke/boommenu/b/d;->R:Lcom/nightonke/boommenu/b/d;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    sget-object v0, Lcom/nightonke/boommenu/b/c;->a:Lcom/nightonke/boommenu/b/c;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    invoke-direct {p0, p1, p2}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->b:Z

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->g:Z

    sget-object v0, Lcom/nightonke/boommenu/b;->e:Lcom/nightonke/boommenu/b;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    sget-object v0, Lcom/nightonke/boommenu/c/d;->Q:Lcom/nightonke/boommenu/c/d;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    sget-object v0, Lcom/nightonke/boommenu/a;->c:Lcom/nightonke/boommenu/a;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    sget-object v0, Lcom/nightonke/boommenu/b/d;->R:Lcom/nightonke/boommenu/b/d;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    sget-object v0, Lcom/nightonke/boommenu/b/c;->a:Lcom/nightonke/boommenu/b/c;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    invoke-direct {p0, p1, p2}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private A()V
    .locals 12

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->x:Ljava/util/ArrayList;

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->y:I

    iget-wide v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->N:J

    iget-wide v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->O:J

    iget-wide v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->P:J

    iget-wide v10, p0, Lcom/nightonke/boommenu/BoomMenuButton;->Q:J

    invoke-virtual/range {v1 .. v11}, Lcom/nightonke/boommenu/a/g;->a(Ljava/util/ArrayList;IJJJJ)V

    :cond_0
    return-void
.end method

.method private B()Z
    .locals 3

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/os/PowerManager;->isPowerSaveMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/a;)Lcom/nightonke/boommenu/a;
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    return-object p1
.end method

.method private a(Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;)Lcom/nightonke/boommenu/b/a;
    .locals 4

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->o()V

    iget v0, p2, Landroid/graphics/Point;->x:I

    iget v1, p2, Landroid/graphics/Point;->y:I

    invoke-virtual {p1}, Lcom/nightonke/boommenu/b/a;->A()I

    move-result v2

    invoke-virtual {p1}, Lcom/nightonke/boommenu/b/a;->B()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/nightonke/boommenu/b/a;->a(IIII)Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/nightonke/boommenu/b/a;->setVisibility(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method

.method static synthetic a(Lcom/nightonke/boommenu/BoomMenuButton;)Lcom/nightonke/boommenu/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    return-object v0
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/nightonke/boommenu/R$layout;->bmb:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-direct {p0, p1, p2}, Lcom/nightonke/boommenu/BoomMenuButton;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->e()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->f()V

    return-void
.end method

.method static synthetic a(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/nightonke/boommenu/BoomMenuButton;->b(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V

    return-void
.end method

.method private a(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V
    .locals 8

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/nightonke/boommenu/BoomMenuButton$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/nightonke/boommenu/BoomMenuButton$4;-><init>(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/BoomMenuButton;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :cond_0
    invoke-direct/range {p0 .. p6}, Lcom/nightonke/boommenu/BoomMenuButton;->b(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 6

    const/4 v5, 0x1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->V:Lcom/nightonke/boommenu/a/b;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/nightonke/boommenu/c;->a(Lcom/nightonke/boommenu/c/d;Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b;Lcom/nightonke/boommenu/a/b;Ljava/util/ArrayList;)V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->s()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    sget-object v1, Lcom/nightonke/boommenu/a;->c:Lcom/nightonke/boommenu/a;

    if-eq v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/nightonke/boommenu/a;->b:Lcom/nightonke/boommenu/a;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    invoke-interface {v0}, Lcom/nightonke/boommenu/d;->d()V

    :cond_2
    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->e:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->f:Z

    if-eqz v0, :cond_4

    :cond_3
    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->t()V

    :cond_4
    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->q()V

    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/BoomMenuButton;->c(Z)V

    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/BoomMenuButton;->e(Z)V

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, v5}, Lcom/nightonke/boommenu/BoomMenuButton;->setFocusable(Z)V

    invoke-virtual {p0, v5}, Lcom/nightonke/boommenu/BoomMenuButton;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->requestFocus()Z

    goto :goto_0
.end method

.method private b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v1, 0x0

    sget-object v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton:[I

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    if-nez v1, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_cacheOptimization:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_cacheOptimization:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->c:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_boomInWholeScreen:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_boomInWholeScreen:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->d:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_inList:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_inList:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->e:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_inFragment:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_inFragment:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->f:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_backPressListened:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_backPressListened:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->g:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_shadowEffect:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_shadow_effect:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->i:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_shadowRadius:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_shadow_radius:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->c(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->l:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_shadowOffsetX:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_shadow_offset_x:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->j:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_shadowOffsetY:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_shadow_offset_y:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->k:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_shadowColor:I

    sget v2, Lcom/nightonke/boommenu/R$color;->default_bmb_shadow_color:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->e(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->m:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonRadius:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_button_radius:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->c(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->o:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_button_enum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/b;->a(I)Lcom/nightonke/boommenu/b;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_backgroundEffect:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_background_effect:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->q:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_rippleEffect:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_ripple_effect:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->r:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_normalColor:I

    sget v2, Lcom/nightonke/boommenu/R$color;->default_bmb_normal_color:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->e(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->s:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_highlightedColor:I

    sget v2, Lcom/nightonke/boommenu/R$color;->default_bmb_highlighted_color:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->e(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->t:I

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->t:I

    if-nez v0, :cond_1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->s:I

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(I)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->t:I

    :cond_1
    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_unableColor:I

    sget v2, Lcom/nightonke/boommenu/R$color;->default_bmb_unable_color:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->e(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->u:I

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->u:I

    if-nez v0, :cond_2

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->s:I

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->b(I)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->u:I

    :cond_2
    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_dotRadius:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_dotRadius:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->c(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->y:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_hamWidth:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_hamWidth:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->c(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->z:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_hamHeight:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_hamHeight:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->c(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->A:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_pieceHorizontalMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_pieceHorizontalMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->B:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_pieceVerticalMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_pieceVerticalMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->C:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_pieceInclinedMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_pieceInclinedMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->C:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_sharedLineLength:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_sharedLineLength:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->c(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->E:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_shareLine1Color:I

    sget v2, Lcom/nightonke/boommenu/R$color;->default_bmb_shareLine1Color:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->e(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->F:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_shareLine2Color:I

    sget v2, Lcom/nightonke/boommenu/R$color;->default_bmb_shareLine2Color:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->e(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->G:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_shareLineWidth:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_shareLineWidth:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->c(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->H:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_piecePlaceEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_pieceEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/c/d;->a(I)Lcom/nightonke/boommenu/c/d;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_dimColor:I

    sget v2, Lcom/nightonke/boommenu/R$color;->default_bmb_dimColor:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->e(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->M:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_showDuration:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_showDuration:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-long v2, v0

    iput-wide v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->N:J

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_showDelay:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_showDelay:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-long v2, v0

    iput-wide v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->O:J

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_hideDuration:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_hideDuration:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-long v2, v0

    iput-wide v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->P:J

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_hideDelay:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_hideDelay:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-long v2, v0

    iput-wide v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->Q:J

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_cancelable:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_cancelable:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->R:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_autoHide:I

    sget v2, Lcom/nightonke/boommenu/R$bool;->default_bmb_autoHide:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->b(Landroid/content/res/TypedArray;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->S:Z

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_orderEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_orderEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/a/f;->a(I)Lcom/nightonke/boommenu/a/f;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->T:Lcom/nightonke/boommenu/a/f;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_frames:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_frames:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_boomEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_boomEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/a/b;->a(I)Lcom/nightonke/boommenu/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->V:Lcom/nightonke/boommenu/a/b;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_showMoveEaseEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_showMoveEaseEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/a/d;->a(I)Lcom/nightonke/boommenu/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->W:Lcom/nightonke/boommenu/a/d;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_showScaleEaseEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_showScaleEaseEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/a/d;->a(I)Lcom/nightonke/boommenu/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aa:Lcom/nightonke/boommenu/a/d;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_showRotateEaseEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_showRotateEaseEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/a/d;->a(I)Lcom/nightonke/boommenu/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ab:Lcom/nightonke/boommenu/a/d;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_hideMoveEaseEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_hideMoveEaseEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/a/d;->a(I)Lcom/nightonke/boommenu/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ac:Lcom/nightonke/boommenu/a/d;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_hideScaleEaseEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_hideScaleEaseEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/a/d;->a(I)Lcom/nightonke/boommenu/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ad:Lcom/nightonke/boommenu/a/d;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_hideRotateEaseEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_hideRotateEaseEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/a/d;->a(I)Lcom/nightonke/boommenu/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ae:Lcom/nightonke/boommenu/a/d;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_rotateDegree:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_rotateDegree:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->af:I

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonPlaceEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_buttonPlaceEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/b/d;->a(I)Lcom/nightonke/boommenu/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonPlaceAlignmentEnum:I

    sget v2, Lcom/nightonke/boommenu/R$integer;->default_bmb_buttonPlaceAlignmentEnum:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/res/TypedArray;II)I

    move-result v0

    invoke-static {v0}, Lcom/nightonke/boommenu/b/c;->a(I)Lcom/nightonke/boommenu/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonHorizontalMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_buttonHorizontalMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->as:F

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonVerticalMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_buttonVerticalMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->at:F

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonInclinedMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_buttonInclinedMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->au:F

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonTopMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_buttonTopMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->av:F

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonBottomMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_buttonBottomMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aw:F

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonLeftMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_buttonLeftMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ax:F

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_buttonRightMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_buttonRightMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ay:F

    sget v0, Lcom/nightonke/boommenu/R$styleable;->BoomMenuButton_bmb_bottomHamButtonTopMargin:I

    sget v2, Lcom/nightonke/boommenu/R$dimen;->default_bmb_bottomHamButtonTopMargin:I

    invoke-static {v1, v0, v2}, Lcom/nightonke/boommenu/e;->d(Landroid/content/res/TypedArray;II)I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aB:Ljava/lang/Float;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_0

    :cond_3
    int-to-float v0, v0

    :try_start_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aB:Ljava/lang/Float;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method static synthetic b(Lcom/nightonke/boommenu/BoomMenuButton;)V
    .locals 0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->v()V

    return-void
.end method

.method private b(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V
    .locals 22

    move-object/from16 v0, p0

    iget v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    iput v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    move-object/from16 v0, p0

    iget v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    add-int/lit8 v4, v4, 0x1

    new-array v9, v4, [F

    move-object/from16 v0, p0

    iget v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    add-int/lit8 v4, v4, 0x1

    new-array v10, v4, [F

    invoke-virtual/range {p1 .. p1}, Lcom/nightonke/boommenu/c/a;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    mul-float/2addr v4, v5

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->C()I

    move-result v5

    int-to-float v5, v5

    div-float v11, v4, v5

    invoke-virtual/range {p1 .. p1}, Lcom/nightonke/boommenu/c/a;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    mul-float/2addr v4, v5

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->D()I

    move-result v5

    int-to-float v5, v5

    div-float v21, v4, v5

    if-eqz p6, :cond_1

    const-wide/16 v14, 0x1

    :goto_0
    if-eqz p6, :cond_2

    const-wide/16 v16, 0x1

    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->H()V

    move-object/from16 v0, p2

    invoke-virtual {v0, v11}, Lcom/nightonke/boommenu/b/a;->setScaleX(F)V

    move-object/from16 v0, p2

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/b/a;->setScaleY(F)V

    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lcom/nightonke/boommenu/b/a;->setClickable(Z)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->V:Lcom/nightonke/boommenu/a/b;

    new-instance v5, Landroid/graphics/Point;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    iget v6, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v5, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, p0

    iget v6, v0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    invoke-static/range {v4 .. v10}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/b;Landroid/graphics/Point;ILandroid/graphics/Point;Landroid/graphics/Point;[F[F)V

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->o()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->u()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v13, "rippleButtonColor"

    invoke-static {}, Lcom/nightonke/boommenu/a/h;->a()Lcom/nightonke/boommenu/a/h;

    move-result-object v18

    const/4 v4, 0x2

    new-array v0, v4, [I

    move-object/from16 v19, v0

    const/4 v4, 0x0

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->m()I

    move-result v5

    aput v5, v19, v4

    const/4 v4, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->n()I

    move-result v5

    aput v5, v19, v4

    move-object/from16 v12, p2

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;[I)Landroid/animation/ObjectAnimator;

    :cond_0
    :goto_2
    const-string v13, "x"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->W:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    move-object/from16 v12, p2

    move-object/from16 v19, v9

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;

    const-string v13, "y"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->W:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    move-object/from16 v12, p2

    move-object/from16 v19, v10

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ab:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    const/4 v4, 0x2

    new-array v0, v4, [F

    move-object/from16 v19, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    aput v5, v19, v4

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iget v5, v0, Lcom/nightonke/boommenu/BoomMenuButton;->af:I

    int-to-float v5, v5

    aput v5, v19, v4

    move-object/from16 v13, p2

    invoke-static/range {v13 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/b/a;JJLandroid/animation/TimeInterpolator;[F)V

    const-string v13, "alpha"

    const/4 v4, 0x2

    new-array v0, v4, [F

    move-object/from16 v18, v0

    fill-array-data v18, :array_0

    sget-object v4, Lcom/nightonke/boommenu/a/d;->E:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->y()Ljava/util/ArrayList;

    move-result-object v20

    invoke-static/range {v13 .. v20}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/String;JJ[FLandroid/animation/TimeInterpolator;Ljava/util/ArrayList;)V

    const-string v13, "scaleX"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->aa:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    const/4 v4, 0x2

    new-array v0, v4, [F

    move-object/from16 v19, v0

    const/4 v4, 0x0

    aput v11, v19, v4

    const/4 v4, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    aput v5, v19, v4

    move-object/from16 v12, p2

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;

    const-string v13, "scaleY"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->aa:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    new-instance v19, Lcom/nightonke/boommenu/BoomMenuButton$5;

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v0, v1, v2, v3}, Lcom/nightonke/boommenu/BoomMenuButton$5;-><init>(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;)V

    const/4 v4, 0x2

    new-array v0, v4, [F

    move-object/from16 v20, v0

    const/4 v4, 0x0

    aput v21, v20, v4

    const/4 v4, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    aput v5, v20, v4

    move-object/from16 v12, p2

    invoke-static/range {v12 .. v20}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;Landroid/animation/AnimatorListenerAdapter;[F)Landroid/animation/ObjectAnimator;

    return-void

    :cond_1
    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->O:J

    move/from16 v0, p5

    int-to-long v6, v0

    mul-long v14, v4, v6

    goto/16 :goto_0

    :cond_2
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/nightonke/boommenu/BoomMenuButton;->N:J

    move-wide/from16 v16, v0

    goto/16 :goto_1

    :cond_3
    const-string v13, "nonRippleButtonColor"

    invoke-static {}, Lcom/nightonke/boommenu/a/h;->a()Lcom/nightonke/boommenu/a/h;

    move-result-object v18

    const/4 v4, 0x2

    new-array v0, v4, [I

    move-object/from16 v19, v0

    const/4 v4, 0x0

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->m()I

    move-result v5

    aput v5, v19, v4

    const/4 v4, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->n()I

    move-result v5

    aput v5, v19, v4

    move-object/from16 v12, p2

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;[I)Landroid/animation/ObjectAnimator;

    goto/16 :goto_2

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private b(Z)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->s()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    sget-object v1, Lcom/nightonke/boommenu/a;->a:Lcom/nightonke/boommenu/a;

    if-eq v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/nightonke/boommenu/a;->d:Lcom/nightonke/boommenu/a;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    invoke-interface {v0}, Lcom/nightonke/boommenu/d;->b()V

    :cond_2
    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/BoomMenuButton;->d(Z)V

    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/BoomMenuButton;->f(Z)V

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, v2}, Lcom/nightonke/boommenu/BoomMenuButton;->setFocusable(Z)V

    invoke-virtual {p0, v2}, Lcom/nightonke/boommenu/BoomMenuButton;->setFocusableInTouchMode(Z)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/nightonke/boommenu/BoomMenuButton;)I
    .locals 2

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    return v0
.end method

.method private c(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V
    .locals 22

    move-object/from16 v0, p0

    iget v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    iput v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    move-object/from16 v0, p0

    iget v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    add-int/lit8 v4, v4, 0x1

    new-array v9, v4, [F

    move-object/from16 v0, p0

    iget v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    add-int/lit8 v4, v4, 0x1

    new-array v10, v4, [F

    invoke-virtual/range {p1 .. p1}, Lcom/nightonke/boommenu/c/a;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    mul-float/2addr v4, v5

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->C()I

    move-result v5

    int-to-float v5, v5

    div-float v11, v4, v5

    invoke-virtual/range {p1 .. p1}, Lcom/nightonke/boommenu/c/a;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    mul-float/2addr v4, v5

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->D()I

    move-result v5

    int-to-float v5, v5

    div-float v21, v4, v5

    if-eqz p6, :cond_1

    const-wide/16 v14, 0x1

    :goto_0
    if-eqz p6, :cond_2

    const-wide/16 v16, 0x1

    :goto_1
    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lcom/nightonke/boommenu/b/a;->setClickable(Z)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->V:Lcom/nightonke/boommenu/a/b;

    new-instance v5, Landroid/graphics/Point;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    iget v6, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v5, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, p0

    iget v6, v0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    invoke-static/range {v4 .. v10}, Lcom/nightonke/boommenu/a/a;->b(Lcom/nightonke/boommenu/a/b;Landroid/graphics/Point;ILandroid/graphics/Point;Landroid/graphics/Point;[F[F)V

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->o()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->u()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v13, "rippleButtonColor"

    invoke-static {}, Lcom/nightonke/boommenu/a/e;->a()Lcom/nightonke/boommenu/a/e;

    move-result-object v18

    const/4 v4, 0x2

    new-array v0, v4, [I

    move-object/from16 v19, v0

    const/4 v4, 0x0

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->n()I

    move-result v5

    aput v5, v19, v4

    const/4 v4, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->m()I

    move-result v5

    aput v5, v19, v4

    move-object/from16 v12, p2

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;[I)Landroid/animation/ObjectAnimator;

    :cond_0
    :goto_2
    const-string v13, "x"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ac:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    move-object/from16 v12, p2

    move-object/from16 v19, v9

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;

    const-string v13, "y"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ac:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    move-object/from16 v12, p2

    move-object/from16 v19, v10

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ae:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    const/4 v4, 0x2

    new-array v0, v4, [F

    move-object/from16 v19, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    aput v5, v19, v4

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iget v5, v0, Lcom/nightonke/boommenu/BoomMenuButton;->af:I

    int-to-float v5, v5

    aput v5, v19, v4

    move-object/from16 v13, p2

    invoke-static/range {v13 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/b/a;JJLandroid/animation/TimeInterpolator;[F)V

    const-string v13, "alpha"

    const/4 v4, 0x2

    new-array v0, v4, [F

    move-object/from16 v18, v0

    fill-array-data v18, :array_0

    sget-object v4, Lcom/nightonke/boommenu/a/d;->E:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->y()Ljava/util/ArrayList;

    move-result-object v20

    invoke-static/range {v13 .. v20}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/String;JJ[FLandroid/animation/TimeInterpolator;Ljava/util/ArrayList;)V

    const-string v13, "scaleX"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ad:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    const/4 v4, 0x2

    new-array v0, v4, [F

    move-object/from16 v19, v0

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    aput v5, v19, v4

    const/4 v4, 0x1

    aput v11, v19, v4

    move-object/from16 v12, p2

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;

    const-string v13, "scaleY"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->ad:Lcom/nightonke/boommenu/a/d;

    invoke-static {v4}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v18

    new-instance v19, Lcom/nightonke/boommenu/BoomMenuButton$6;

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p1

    invoke-direct {v0, v1, v2, v3}, Lcom/nightonke/boommenu/BoomMenuButton$6;-><init>(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/b/a;Lcom/nightonke/boommenu/c/a;)V

    const/4 v4, 0x2

    new-array v0, v4, [F

    move-object/from16 v20, v0

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    aput v5, v20, v4

    const/4 v4, 0x1

    aput v21, v20, v4

    move-object/from16 v12, p2

    invoke-static/range {v12 .. v20}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;Landroid/animation/AnimatorListenerAdapter;[F)Landroid/animation/ObjectAnimator;

    return-void

    :cond_1
    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/nightonke/boommenu/BoomMenuButton;->Q:J

    move/from16 v0, p5

    int-to-long v6, v0

    mul-long v14, v4, v6

    goto/16 :goto_0

    :cond_2
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/nightonke/boommenu/BoomMenuButton;->P:J

    move-wide/from16 v16, v0

    goto/16 :goto_1

    :cond_3
    const-string v13, "nonRippleButtonColor"

    invoke-static {}, Lcom/nightonke/boommenu/a/e;->a()Lcom/nightonke/boommenu/a/e;

    move-result-object v18

    const/4 v4, 0x2

    new-array v0, v4, [I

    move-object/from16 v19, v0

    const/4 v4, 0x0

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->n()I

    move-result v5

    aput v5, v19, v4

    const/4 v4, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/nightonke/boommenu/b/a;->m()I

    move-result v5

    aput v5, v19, v4

    move-object/from16 v12, p2

    invoke-static/range {v12 .. v19}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;[I)Landroid/animation/ObjectAnimator;

    goto/16 :goto_2

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private c(Z)V
    .locals 11

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->o()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/e;->a(I[Landroid/view/View;)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    const-string v1, "backgroundColor"

    const-wide/16 v2, 0x0

    if-eqz p1, :cond_1

    const-wide/16 v4, 0x1

    :goto_0
    new-instance v6, Landroid/animation/ArgbEvaluator;

    invoke-direct {v6}, Landroid/animation/ArgbEvaluator;-><init>()V

    new-instance v7, Lcom/nightonke/boommenu/BoomMenuButton$2;

    invoke-direct {v7, p0}, Lcom/nightonke/boommenu/BoomMenuButton$2;-><init>(Lcom/nightonke/boommenu/BoomMenuButton;)V

    const/4 v8, 0x2

    new-array v8, v8, [I

    const/4 v9, 0x0

    const/4 v10, 0x0

    aput v10, v8, v9

    const/4 v9, 0x1

    iget v10, p0, Lcom/nightonke/boommenu/BoomMenuButton;->M:I

    aput v10, v8, v9

    invoke-static/range {v0 .. v8}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;Landroid/animation/AnimatorListenerAdapter;[I)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    const-string v1, "showProcess"

    const-wide/16 v2, 0x0

    if-eqz p1, :cond_2

    const-wide/16 v4, 0x1

    :goto_1
    sget-object v6, Lcom/nightonke/boommenu/a/d;->E:Lcom/nightonke/boommenu/a/d;

    invoke-static {v6}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [F

    fill-array-data v7, :array_0

    invoke-static/range {v0 .. v7}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;

    :cond_0
    return-void

    :cond_1
    iget-wide v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->N:J

    iget-wide v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->O:J

    iget-object v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    int-to-long v8, v8

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    goto :goto_0

    :cond_2
    iget-wide v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->N:J

    iget-wide v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->O:J

    iget-object v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    int-to-long v8, v8

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    goto :goto_1

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic d(Lcom/nightonke/boommenu/BoomMenuButton;)V
    .locals 0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->r()V

    return-void
.end method

.method private d(Z)V
    .locals 14

    const-wide/16 v10, 0x1

    const-wide/16 v2, 0x0

    const/4 v13, 0x2

    const/4 v12, 0x0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->o()V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    const-string v1, "backgroundColor"

    if-eqz p1, :cond_1

    move-wide v4, v10

    :goto_0
    new-instance v6, Landroid/animation/ArgbEvaluator;

    invoke-direct {v6}, Landroid/animation/ArgbEvaluator;-><init>()V

    new-instance v7, Lcom/nightonke/boommenu/BoomMenuButton$3;

    invoke-direct {v7, p0}, Lcom/nightonke/boommenu/BoomMenuButton$3;-><init>(Lcom/nightonke/boommenu/BoomMenuButton;)V

    new-array v8, v13, [I

    iget v9, p0, Lcom/nightonke/boommenu/BoomMenuButton;->M:I

    aput v9, v8, v12

    const/4 v9, 0x1

    aput v12, v8, v9

    invoke-static/range {v0 .. v8}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;Landroid/animation/AnimatorListenerAdapter;[I)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    const-string v1, "hideProcess"

    if-eqz p1, :cond_2

    move-wide v4, v10

    :goto_1
    sget-object v6, Lcom/nightonke/boommenu/a/d;->E:Lcom/nightonke/boommenu/a/d;

    invoke-static {v6}, Lcom/nightonke/boommenu/a/c;->a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;

    move-result-object v6

    new-array v7, v13, [F

    fill-array-data v7, :array_0

    invoke-static/range {v0 .. v7}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;

    :cond_0
    return-void

    :cond_1
    iget-wide v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->P:J

    iget-wide v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->Q:J

    iget-object v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    int-to-long v8, v8

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    goto :goto_0

    :cond_2
    iget-wide v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->P:J

    iget-wide v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->Q:J

    iget-object v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    int-to-long v8, v8

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    goto :goto_1

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private e()V
    .locals 3

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    if-nez v0, :cond_0

    sget v0, Lcom/nightonke/boommenu/R$id;->shadow:I

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/BoomMenuButton;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/BMBShadow;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    :cond_0
    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->i:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->q:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->e:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    invoke-virtual {v1, v0}, Lcom/nightonke/boommenu/BMBShadow;->setShadowEffect(Z)V

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->j:I

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/BMBShadow;->setShadowOffsetX(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->k:I

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/BMBShadow;->setShadowOffsetY(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->m:I

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/BMBShadow;->setShadowColor(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->l:I

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/BMBShadow;->setShadowRadius(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->l:I

    iget v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->o:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/BMBShadow;->setShadowCornerRadius(I)V

    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->n:Lcom/nightonke/boommenu/BMBShadow;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/BMBShadow;->a()V

    goto :goto_1
.end method

.method static synthetic e(Lcom/nightonke/boommenu/BoomMenuButton;)V
    .locals 0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->i()V

    return-void
.end method

.method private e(Z)V
    .locals 8

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_0
    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->u()V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/nightonke/boommenu/a/f;->a:Lcom/nightonke/boommenu/a/f;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/f;I)Ljava/util/ArrayList;

    move-result-object v0

    move-object v7, v0

    :goto_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    :goto_1
    if-ltz v5, :cond_2

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nightonke/boommenu/b/a;

    new-instance v3, Landroid/graphics/Point;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->az:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, v2, Lcom/nightonke/boommenu/b/a;->aI:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    float-to-int v1, v0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->az:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    iget-object v4, v2, Lcom/nightonke/boommenu/b/a;->aI:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v4

    float-to-int v0, v0

    invoke-direct {v3, v1, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-direct {p0, v2, v3}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;)Lcom/nightonke/boommenu/b/a;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nightonke/boommenu/c/a;

    new-instance v4, Landroid/graphics/Point;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    invoke-direct {v4, v0}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    move-object v0, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V

    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->T:Lcom/nightonke/boommenu/a/f;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/f;I)Ljava/util/ArrayList;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    sget v0, Lcom/nightonke/boommenu/R$id;->button:I

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/BoomMenuButton;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    new-instance v1, Lcom/nightonke/boommenu/BoomMenuButton$1;

    invoke-direct {v1, p0}, Lcom/nightonke/boommenu/BoomMenuButton$1;-><init>(Lcom/nightonke/boommenu/BoomMenuButton;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->g()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->h()V

    return-void
.end method

.method private f(Z)V
    .locals 8

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/nightonke/boommenu/a/f;->b:Lcom/nightonke/boommenu/a/f;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/f;I)Ljava/util/ArrayList;

    move-result-object v0

    move-object v7, v0

    :goto_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/b/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/a;->bringToFront()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->T:Lcom/nightonke/boommenu/a/f;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/f;I)Ljava/util/ArrayList;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nightonke/boommenu/b/a;

    new-instance v4, Landroid/graphics/Point;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->az:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, v2, Lcom/nightonke/boommenu/b/a;->aI:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    float-to-int v1, v0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->az:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    iget-object v3, v2, Lcom/nightonke/boommenu/b/a;->aI:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v3

    float-to-int v0, v0

    invoke-direct {v4, v1, v0}, Landroid/graphics/Point;-><init>(II)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nightonke/boommenu/c/a;

    new-instance v3, Landroid/graphics/Point;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    invoke-direct {v3, v0}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    move-object v0, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/nightonke/boommenu/BoomMenuButton;->c(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->o:I

    mul-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->o:I

    mul-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private getParentView()Landroid/view/ViewGroup;
    .locals 1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_0
.end method

.method private h()V
    .locals 5

    const/16 v1, 0x15

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->q:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->r:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->t:I

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->s:I

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/e;->b(Landroid/view/View;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-static {v1, v0}, Lcom/nightonke/boommenu/e;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->o:I

    iget v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->s:I

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->t:I

    iget v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->u:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/nightonke/boommenu/e;->b(Landroid/view/View;IIII)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-static {v1, v0}, Lcom/nightonke/boommenu/e;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    const v2, 0x101045c

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/e;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    const v2, 0x101030e

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/e;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/e;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private i()V
    .locals 5

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->V:Lcom/nightonke/boommenu/a/b;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/nightonke/boommenu/c;->a(Lcom/nightonke/boommenu/c/d;Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b;Lcom/nightonke/boommenu/a/b;Ljava/util/ArrayList;)V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->j()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->k()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->z()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->l()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->m()V

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->e:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->f:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->t()V

    :cond_0
    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->A()V

    return-void
.end method

.method private j()V
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 6

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->n()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->y()I

    move-result v2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/b/b;

    iget-object v5, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-virtual {v0, v5}, Lcom/nightonke/boommenu/b/b;->a(Landroid/content/Context;)I

    move-result v0

    invoke-static {v3, v4, v0}, Lcom/nightonke/boommenu/c/e;->a(Landroid/content/Context;Lcom/nightonke/boommenu/c/d;I)Lcom/nightonke/boommenu/c/a;

    move-result-object v0

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private l()V
    .locals 5

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/nightonke/boommenu/a/f;->a:Lcom/nightonke/boommenu/a/f;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/f;I)Ljava/util/ArrayList;

    move-result-object v0

    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_1
    if-ltz v2, :cond_1

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->T:Lcom/nightonke/boommenu/a/f;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/f;I)Ljava/util/ArrayList;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method private m()V
    .locals 7

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->y()I

    move-result v5

    sget-object v0, Lcom/nightonke/boommenu/BoomMenuButton$9;->a:[I

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    invoke-virtual {v1}, Lcom/nightonke/boommenu/c/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown piece-place-enum!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->y:I

    mul-int/lit8 v1, v0, 0x2

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->y:I

    mul-int/lit8 v0, v0, 0x2

    move v2, v0

    move v3, v1

    :goto_0
    const/4 v0, 0x0

    move v4, v0

    :goto_1
    if-ge v4, v5, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/c/a;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->x:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Point;

    iget v6, v1, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->x:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v6, v1, v3, v2}, Lcom/nightonke/boommenu/c/a;->a(IIII)V

    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_1

    :pswitch_1
    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->z:I

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->A:I

    move v2, v0

    move v3, v1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private n()V
    .locals 6

    sget-object v0, Lcom/nightonke/boommenu/BoomMenuButton$9;->b:[I

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    invoke-virtual {v1}, Lcom/nightonke/boommenu/b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_0

    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->y:I

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->E:I

    invoke-static {v0, v1, v2, v3}, Lcom/nightonke/boommenu/c/e;->a(Landroid/graphics/Point;III)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->x:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    iget v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->y:I

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->B:I

    iget v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->C:I

    iget v5, p0, Lcom/nightonke/boommenu/BoomMenuButton;->D:I

    invoke-static/range {v0 .. v5}, Lcom/nightonke/boommenu/c/e;->a(Lcom/nightonke/boommenu/c/d;Landroid/graphics/Point;IIII)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->x:Ljava/util/ArrayList;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    iget v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->z:I

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->A:I

    iget v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->C:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/nightonke/boommenu/c/e;->a(Lcom/nightonke/boommenu/c/d;Landroid/graphics/Point;III)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->x:Ljava/util/ArrayList;

    goto :goto_0

    :pswitch_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "The button-enum is unknown!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private o()V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->getParentView()Landroid/view/ViewGroup;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    new-instance v2, Lcom/nightonke/boommenu/BoomMenuButton$7;

    invoke-direct {v2, p0}, Lcom/nightonke/boommenu/BoomMenuButton$7;-><init>(Lcom/nightonke/boommenu/BoomMenuButton;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setMotionEventSplittingEnabled(Z)V

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private p()V
    .locals 4

    const/16 v0, 0x8

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/e;->a(I[Landroid/view/View;)V

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->e:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->f:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    :cond_1
    return-void
.end method

.method private q()V
    .locals 5

    const/4 v0, 0x0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sget-object v1, Lcom/nightonke/boommenu/BoomMenuButton$9;->b:[I

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    invoke-virtual {v3}, Lcom/nightonke/boommenu/b;->ordinal()I

    move-result v3

    aget v1, v1, v3

    packed-switch v1, :pswitch_data_0

    :cond_0
    return-void

    :pswitch_0
    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/b/i$a;

    invoke-virtual {v0, p0}, Lcom/nightonke/boommenu/b/i$a;->a(Lcom/nightonke/boommenu/b/g;)Lcom/nightonke/boommenu/b/i$a;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/nightonke/boommenu/b/i$a;->a(I)Lcom/nightonke/boommenu/b/i$a;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Lcom/nightonke/boommenu/b/i$a;->b(Landroid/content/Context;)Lcom/nightonke/boommenu/b/i;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/i$a;->a()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ak:F

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :pswitch_1
    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/b/j$a;

    invoke-virtual {v0, p0}, Lcom/nightonke/boommenu/b/j$a;->a(Lcom/nightonke/boommenu/b/g;)Lcom/nightonke/boommenu/b/j$a;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/nightonke/boommenu/b/j$a;->a(I)Lcom/nightonke/boommenu/b/j$a;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Lcom/nightonke/boommenu/b/j$a;->b(Landroid/content/Context;)Lcom/nightonke/boommenu/b/j;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/j$a;->a()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->al:F

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :pswitch_2
    move v1, v0

    :goto_2
    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/b/k$a;

    invoke-virtual {v0, p0}, Lcom/nightonke/boommenu/b/k$a;->a(Lcom/nightonke/boommenu/b/g;)Lcom/nightonke/boommenu/b/k$a;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/nightonke/boommenu/b/k$a;->a(I)Lcom/nightonke/boommenu/b/k$a;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Lcom/nightonke/boommenu/b/k$a;->b(Landroid/content/Context;)Lcom/nightonke/boommenu/b/k;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/k$a;->a()I

    move-result v3

    int-to-float v3, v3

    iput v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->am:F

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/k$a;->b()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->an:F

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :pswitch_3
    move v1, v0

    :goto_3
    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/b/f$a;

    invoke-virtual {v0, p0}, Lcom/nightonke/boommenu/b/f$a;->a(Lcom/nightonke/boommenu/b/g;)Lcom/nightonke/boommenu/b/f$a;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/nightonke/boommenu/b/f$a;->a(I)Lcom/nightonke/boommenu/b/f$a;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Lcom/nightonke/boommenu/b/f$a;->b(Landroid/content/Context;)Lcom/nightonke/boommenu/b/f;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/f$a;->a()I

    move-result v3

    int-to-float v3, v3

    iput v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ao:F

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/f$a;->b()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ap:F

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private r()V
    .locals 1

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    invoke-interface {v0}, Lcom/nightonke/boommenu/d;->a()V

    :cond_2
    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->R:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->c()V

    goto :goto_0
.end method

.method private s()Z
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->K:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private t()V
    .locals 9

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->y()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->az:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->getParentView()Landroid/view/ViewGroup;

    move-result-object v0

    new-array v3, v8, [I

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    new-array v5, v8, [I

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v5}, Landroid/widget/FrameLayout;->getLocationOnScreen([I)V

    aget v6, v5, v2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v0, v6

    aget v6, v3, v2

    sub-int v6, v0, v6

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/c/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/c/a;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v6

    iput v0, v4, Landroid/graphics/Point;->x:I

    aget v5, v5, v7

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v0, v5

    aget v5, v3, v7

    sub-int v5, v0, v5

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/c/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/c/a;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v5

    iput v0, v4, Landroid/graphics/Point;->y:I

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->az:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private u()V
    .locals 13

    sget-object v0, Lcom/nightonke/boommenu/BoomMenuButton$9;->b:[I

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    invoke-virtual {v1}, Lcom/nightonke/boommenu/b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    int-to-float v3, v1

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nightonke/boommenu/b/a;

    iget-object v1, v1, Lcom/nightonke/boommenu/b/a;->aI:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float v1, v3, v1

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->y:I

    int-to-float v3, v1

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nightonke/boommenu/b/a;

    iget-object v1, v1, Lcom/nightonke/boommenu/b/a;->aI:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float v1, v3, v1

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Point;->y:I

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :pswitch_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    new-instance v2, Landroid/graphics/Point;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v2, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ak:F

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    iget v5, p0, Lcom/nightonke/boommenu/BoomMenuButton;->as:F

    iget v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->at:F

    iget v7, p0, Lcom/nightonke/boommenu/BoomMenuButton;->au:F

    iget v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->av:F

    iget v9, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aw:F

    iget v10, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ax:F

    iget v11, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ay:F

    invoke-static/range {v0 .. v11}, Lcom/nightonke/boommenu/b/e;->a(Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FIFFFFFFF)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    new-instance v2, Landroid/graphics/Point;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v2, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->al:F

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    iget v5, p0, Lcom/nightonke/boommenu/BoomMenuButton;->as:F

    iget v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->at:F

    iget v7, p0, Lcom/nightonke/boommenu/BoomMenuButton;->au:F

    iget v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->av:F

    iget v9, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aw:F

    iget v10, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ax:F

    iget v11, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ay:F

    invoke-static/range {v0 .. v11}, Lcom/nightonke/boommenu/b/e;->a(Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FIFFFFFFF)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    goto/16 :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    new-instance v2, Landroid/graphics/Point;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v2, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->am:F

    iget v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->an:F

    iget-object v5, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->as:F

    iget v7, p0, Lcom/nightonke/boommenu/BoomMenuButton;->at:F

    iget v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->au:F

    iget v9, p0, Lcom/nightonke/boommenu/BoomMenuButton;->av:F

    iget v10, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aw:F

    iget v11, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ax:F

    iget v12, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ay:F

    invoke-static/range {v0 .. v12}, Lcom/nightonke/boommenu/b/e;->a(Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FFIFFFFFFF)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    new-instance v2, Landroid/graphics/Point;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v2, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    iget v3, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ao:F

    iget v4, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ap:F

    iget-object v5, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget v6, p0, Lcom/nightonke/boommenu/BoomMenuButton;->as:F

    iget v7, p0, Lcom/nightonke/boommenu/BoomMenuButton;->at:F

    iget v8, p0, Lcom/nightonke/boommenu/BoomMenuButton;->av:F

    iget v9, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aw:F

    iget v10, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ax:F

    iget v11, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ay:F

    iget-object v12, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aB:Ljava/lang/Float;

    invoke-static/range {v0 .. v12}, Lcom/nightonke/boommenu/b/e;->a(Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FFIFFFFFFLjava/lang/Float;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    goto/16 :goto_0

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private v()V
    .locals 1

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->p()V

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->e:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->f:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aA:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ai:Ljava/util/ArrayList;

    :cond_1
    return-void
.end method

.method private w()V
    .locals 2

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->b:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->isInLayout()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->requestLayout()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->requestLayout()V

    goto :goto_0
.end method

.method private x()V
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->h:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    new-instance v0, Lcom/nightonke/boommenu/BoomMenuButton$8;

    invoke-direct {v0, p0}, Lcom/nightonke/boommenu/BoomMenuButton$8;-><init>(Lcom/nightonke/boommenu/BoomMenuButton;)V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->h:Ljava/lang/Runnable;

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->h:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/nightonke/boommenu/BoomMenuButton;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private y()I
    .locals 2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/c/d;->a()I

    move-result v0

    goto :goto_0
.end method

.method private z()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/nightonke/boommenu/a/g;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/nightonke/boommenu/a/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->F:I

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/a/g;->setLine1Color(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->G:I

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/a/g;->setLine2Color(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    iget v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->H:I

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/a/g;->setLineWidth(I)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->I:Lcom/nightonke/boommenu/a/g;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Lcom/nightonke/boommenu/a/g;->a(IIII)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Z)V

    return-void
.end method

.method public a(ILcom/nightonke/boommenu/b/a;)V
    .locals 1

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    invoke-interface {v0, p1, p2}, Lcom/nightonke/boommenu/d;->a(ILcom/nightonke/boommenu/b/a;)V

    :cond_2
    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->S:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->c()V

    goto :goto_0
.end method

.method public a(Lcom/nightonke/boommenu/b/b;)V
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Z)V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nightonke/boommenu/BoomMenuButton;->b(Z)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public getBoomEnum()Lcom/nightonke/boommenu/a/b;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->V:Lcom/nightonke/boommenu/a/b;

    return-object v0
.end method

.method public getBottomHamButtonTopMargin()F
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aB:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getBuilders()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nightonke/boommenu/b/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getButtonBottomMargin()F
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aw:F

    return v0
.end method

.method public getButtonEnum()Lcom/nightonke/boommenu/b;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    return-object v0
.end method

.method public getButtonHorizontalMargin()F
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->as:F

    return v0
.end method

.method public getButtonInclinedMargin()F
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->au:F

    return v0
.end method

.method public getButtonLeftMargin()F
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ax:F

    return v0
.end method

.method public getButtonPlaceAlignmentEnum()Lcom/nightonke/boommenu/b/c;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    return-object v0
.end method

.method public getButtonPlaceEnum()Lcom/nightonke/boommenu/b/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    return-object v0
.end method

.method public getButtonRadius()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->o:I

    return v0
.end method

.method public getButtonRightMargin()F
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ay:F

    return v0
.end method

.method public getButtonTopMargin()F
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->av:F

    return v0
.end method

.method public getButtonVerticalMargin()F
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->at:F

    return v0
.end method

.method public getDimColor()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->M:I

    return v0
.end method

.method public getDotRadius()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->y:I

    return v0
.end method

.method public getFrames()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    return v0
.end method

.method public getHamHeight()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->A:I

    return v0
.end method

.method public getHamWidth()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->z:I

    return v0
.end method

.method public getHideDelay()J
    .locals 2

    iget-wide v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->Q:J

    return-wide v0
.end method

.method public getHideDuration()J
    .locals 2

    iget-wide v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->P:J

    return-wide v0
.end method

.method public getHideMoveEaseEnum()Lcom/nightonke/boommenu/a/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ac:Lcom/nightonke/boommenu/a/d;

    return-object v0
.end method

.method public getHideRotateEaseEnum()Lcom/nightonke/boommenu/a/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ae:Lcom/nightonke/boommenu/a/d;

    return-object v0
.end method

.method public getHideScaleEaseEnum()Lcom/nightonke/boommenu/a/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ad:Lcom/nightonke/boommenu/a/d;

    return-object v0
.end method

.method public getHighlightedColor()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->t:I

    return v0
.end method

.method public getNormalColor()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->s:I

    return v0
.end method

.method public getOnBoomListener()Lcom/nightonke/boommenu/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    return-object v0
.end method

.method public getOrderEnum()Lcom/nightonke/boommenu/a/f;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->T:Lcom/nightonke/boommenu/a/f;

    return-object v0
.end method

.method public getPieceHorizontalMargin()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->B:I

    return v0
.end method

.method public getPieceInclinedMargin()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->D:I

    return v0
.end method

.method public getPiecePlaceEnum()Lcom/nightonke/boommenu/c/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    return-object v0
.end method

.method public getPieceVerticalMargin()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->C:I

    return v0
.end method

.method public getRotateDegree()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->af:I

    return v0
.end method

.method public getShadowColor()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->m:I

    return v0
.end method

.method public getShadowOffsetX()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->j:I

    return v0
.end method

.method public getShadowOffsetY()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->k:I

    return v0
.end method

.method public getShadowRadius()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->l:I

    return v0
.end method

.method public getShareLine1Color()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->F:I

    return v0
.end method

.method public getShareLine2Color()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->G:I

    return v0
.end method

.method public getShareLineLength()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->E:I

    return v0
.end method

.method public getShareLineWidth()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->H:I

    return v0
.end method

.method public getShowDelay()J
    .locals 2

    iget-wide v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->O:J

    return-wide v0
.end method

.method public getShowDuration()J
    .locals 2

    iget-wide v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->N:J

    return-wide v0
.end method

.method public getShowMoveEaseEnum()Lcom/nightonke/boommenu/a/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->W:Lcom/nightonke/boommenu/a/d;

    return-object v0
.end method

.method public getShowRotateEaseEnum()Lcom/nightonke/boommenu/a/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ab:Lcom/nightonke/boommenu/a/d;

    return-object v0
.end method

.method public getShowScaleEaseEnum()Lcom/nightonke/boommenu/a/d;
    .locals 1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aa:Lcom/nightonke/boommenu/a/d;

    return-object v0
.end method

.method public getUnableColor()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->u:I

    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->g:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    sget-object v1, Lcom/nightonke/boommenu/a;->b:Lcom/nightonke/boommenu/a;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ag:Lcom/nightonke/boommenu/a;

    sget-object v1, Lcom/nightonke/boommenu/a;->a:Lcom/nightonke/boommenu/a;

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->c()V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    iget-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->b:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->x()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->b:Z

    return-void
.end method

.method public setAutoHide(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->S:Z

    return-void
.end method

.method public setBackPressListened(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->g:Z

    return-void
.end method

.method public setBackgroundEffect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->q:Z

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->h()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setBoomEnum(Lcom/nightonke/boommenu/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->V:Lcom/nightonke/boommenu/a/b;

    return-void
.end method

.method public setBoomInWholeScreen(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->d:Z

    return-void
.end method

.method public setBottomHamButtonTopMargin(F)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aB:Ljava/lang/Float;

    return-void
.end method

.method public setBuilders(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nightonke/boommenu/b/b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aj:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setButtonBottomMargin(F)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aw:F

    return-void
.end method

.method public setButtonEnum(Lcom/nightonke/boommenu/b;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->p:Lcom/nightonke/boommenu/b;

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->d()V

    return-void
.end method

.method public setButtonHorizontalMargin(F)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->as:F

    return-void
.end method

.method public setButtonInclinedMargin(F)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->au:F

    return-void
.end method

.method public setButtonLeftMargin(F)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ax:F

    return-void
.end method

.method public setButtonPlaceAlignmentEnum(Lcom/nightonke/boommenu/b/c;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ar:Lcom/nightonke/boommenu/b/c;

    return-void
.end method

.method public setButtonPlaceEnum(Lcom/nightonke/boommenu/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aq:Lcom/nightonke/boommenu/b/d;

    return-void
.end method

.method public setButtonRadius(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->o:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->f()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setButtonRightMargin(F)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ay:F

    return-void
.end method

.method public setButtonTopMargin(F)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->av:F

    return-void
.end method

.method public setButtonVerticalMargin(F)V
    .locals 1

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->at:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aB:Ljava/lang/Float;

    return-void
.end method

.method public setCacheOptimization(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->c:Z

    return-void
.end method

.method public setCancelable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->R:Z

    return-void
.end method

.method public setDimColor(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->M:I

    return-void
.end method

.method public setDotRadius(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->y:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->h()V

    return-void
.end method

.method public setFrames(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->U:I

    return-void
.end method

.method public setHamHeight(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->A:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setHamWidth(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->z:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setHideDelay(J)V
    .locals 1

    iput-wide p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->Q:J

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->A()V

    return-void
.end method

.method public setHideDuration(J)V
    .locals 1

    iput-wide p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->P:J

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->A()V

    return-void
.end method

.method public setHideMoveEaseEnum(Lcom/nightonke/boommenu/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ac:Lcom/nightonke/boommenu/a/d;

    return-void
.end method

.method public setHideRotateEaseEnum(Lcom/nightonke/boommenu/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ae:Lcom/nightonke/boommenu/a/d;

    return-void
.end method

.method public setHideScaleEaseEnum(Lcom/nightonke/boommenu/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ad:Lcom/nightonke/boommenu/a/d;

    return-void
.end method

.method public setHighlightedColor(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->t:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->h()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setInFragment(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->f:Z

    return-void
.end method

.method public setInList(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->e:Z

    return-void
.end method

.method public setNormalColor(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->s:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->h()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setOnBoomListener(Lcom/nightonke/boommenu/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->L:Lcom/nightonke/boommenu/d;

    return-void
.end method

.method public setOrderEnum(Lcom/nightonke/boommenu/a/f;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->T:Lcom/nightonke/boommenu/a/f;

    return-void
.end method

.method public setPieceHorizontalMargin(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->B:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setPieceInclinedMargin(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->D:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setPiecePlaceEnum(Lcom/nightonke/boommenu/c/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->J:Lcom/nightonke/boommenu/c/d;

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setPieceVerticalMargin(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->C:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setRippleEffect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->r:Z

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->h()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method

.method public setRotateDegree(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->af:I

    return-void
.end method

.method public setShadowColor(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->m:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->e()V

    return-void
.end method

.method public setShadowEffect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->i:Z

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->e()V

    return-void
.end method

.method public setShadowOffsetX(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->j:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->e()V

    return-void
.end method

.method public setShadowOffsetY(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->k:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->e()V

    return-void
.end method

.method public setShadowRadius(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->l:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->e()V

    return-void
.end method

.method public setShareLine1Color(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->F:I

    return-void
.end method

.method public setShareLine2Color(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->G:I

    return-void
.end method

.method public setShareLineLength(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->E:I

    return-void
.end method

.method public setShareLineWidth(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->H:I

    return-void
.end method

.method public setShowDelay(J)V
    .locals 1

    iput-wide p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->O:J

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->A()V

    return-void
.end method

.method public setShowDuration(J)V
    .locals 1

    iput-wide p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->N:J

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->A()V

    return-void
.end method

.method public setShowMoveEaseEnum(Lcom/nightonke/boommenu/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->W:Lcom/nightonke/boommenu/a/d;

    return-void
.end method

.method public setShowRotateEaseEnum(Lcom/nightonke/boommenu/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->ab:Lcom/nightonke/boommenu/a/d;

    return-void
.end method

.method public setShowScaleEaseEnum(Lcom/nightonke/boommenu/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->aa:Lcom/nightonke/boommenu/a/d;

    return-void
.end method

.method public setUnableColor(I)V
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/BoomMenuButton;->u:I

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->h()V

    invoke-direct {p0}, Lcom/nightonke/boommenu/BoomMenuButton;->w()V

    return-void
.end method
