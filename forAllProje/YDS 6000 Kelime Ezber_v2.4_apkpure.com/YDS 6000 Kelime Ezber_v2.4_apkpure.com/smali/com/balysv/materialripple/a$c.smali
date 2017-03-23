.class public Lcom/balysv/materialripple/a$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/balysv/materialripple/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/view/View;

.field private c:I

.field private d:Z

.field private e:Z

.field private f:F

.field private g:I

.field private h:F

.field private i:Z

.field private j:I

.field private k:Z

.field private l:I

.field private m:Z

.field private n:F


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/balysv/materialripple/a$c;->c:I

    iput-boolean v1, p0, Lcom/balysv/materialripple/a$c;->d:Z

    iput-boolean v2, p0, Lcom/balysv/materialripple/a$c;->e:Z

    const/high16 v0, 0x420c0000    # 35.0f

    iput v0, p0, Lcom/balysv/materialripple/a$c;->f:F

    const/16 v0, 0x15e

    iput v0, p0, Lcom/balysv/materialripple/a$c;->g:I

    const v0, 0x3e4ccccd    # 0.2f

    iput v0, p0, Lcom/balysv/materialripple/a$c;->h:F

    iput-boolean v2, p0, Lcom/balysv/materialripple/a$c;->i:Z

    const/16 v0, 0x4b

    iput v0, p0, Lcom/balysv/materialripple/a$c;->j:I

    iput-boolean v1, p0, Lcom/balysv/materialripple/a$c;->k:Z

    iput v1, p0, Lcom/balysv/materialripple/a$c;->l:I

    iput-boolean v1, p0, Lcom/balysv/materialripple/a$c;->m:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/balysv/materialripple/a$c;->n:F

    iput-object p1, p0, Lcom/balysv/materialripple/a$c;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/balysv/materialripple/a$c;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(F)Lcom/balysv/materialripple/a$c;
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/balysv/materialripple/a$c;->h:F

    return-object p0
.end method

.method public a(I)Lcom/balysv/materialripple/a$c;
    .locals 0

    iput p1, p0, Lcom/balysv/materialripple/a$c;->c:I

    return-object p0
.end method

.method public a(Z)Lcom/balysv/materialripple/a$c;
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a$c;->d:Z

    return-object p0
.end method

.method public a()Lcom/balysv/materialripple/a;
    .locals 7

    const/4 v6, -0x1

    new-instance v2, Lcom/balysv/materialripple/a;

    iget-object v0, p0, Lcom/balysv/materialripple/a$c;->a:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/balysv/materialripple/a;-><init>(Landroid/content/Context;)V

    iget v0, p0, Lcom/balysv/materialripple/a$c;->c:I

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleColor(I)V

    iget v0, p0, Lcom/balysv/materialripple/a$c;->h:F

    float-to-int v0, v0

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setDefaultRippleAlpha(I)V

    iget-boolean v0, p0, Lcom/balysv/materialripple/a$c;->i:Z

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleDelayClick(Z)V

    iget-object v0, p0, Lcom/balysv/materialripple/a$c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/balysv/materialripple/a$c;->f:F

    invoke-static {v0, v1}, Lcom/balysv/materialripple/a;->a(Landroid/content/res/Resources;F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleDiameter(I)V

    iget v0, p0, Lcom/balysv/materialripple/a$c;->g:I

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleDuration(I)V

    iget v0, p0, Lcom/balysv/materialripple/a$c;->j:I

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleFadeDuration(I)V

    iget-boolean v0, p0, Lcom/balysv/materialripple/a$c;->e:Z

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleHover(Z)V

    iget-boolean v0, p0, Lcom/balysv/materialripple/a$c;->k:Z

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRipplePersistent(Z)V

    iget-boolean v0, p0, Lcom/balysv/materialripple/a$c;->d:Z

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleOverlay(Z)V

    iget v0, p0, Lcom/balysv/materialripple/a$c;->l:I

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleBackground(I)V

    iget-boolean v0, p0, Lcom/balysv/materialripple/a$c;->m:Z

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleInAdapter(Z)V

    iget-object v0, p0, Lcom/balysv/materialripple/a$c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/balysv/materialripple/a$c;->n:F

    invoke-static {v0, v1}, Lcom/balysv/materialripple/a;->a(Landroid/content/res/Resources;F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v2, v0}, Lcom/balysv/materialripple/a;->setRippleRoundedCorners(I)V

    iget-object v0, p0, Lcom/balysv/materialripple/a$c;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget-object v0, p0, Lcom/balysv/materialripple/a$c;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v4, v0, Lcom/balysv/materialripple/a;

    if-eqz v4, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MaterialRippleLayout could not be created: parent of the view already is a MaterialRippleLayout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/balysv/materialripple/a$c;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    iget-object v4, p0, Lcom/balysv/materialripple/a$c;->b:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v4, p0, Lcom/balysv/materialripple/a$c;->b:Landroid/view/View;

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v5, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v4, v5}, Lcom/balysv/materialripple/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz v0, :cond_2

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-object v2
.end method

.method public b(Z)Lcom/balysv/materialripple/a$c;
    .locals 0

    iput-boolean p1, p0, Lcom/balysv/materialripple/a$c;->e:Z

    return-object p0
.end method
