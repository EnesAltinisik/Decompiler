.class Lcom/arlib/floatingsearchview/util/view/MenuView$10;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/util/view/MenuView;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/util/view/MenuView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/util/view/MenuView;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->e(Lcom/arlib/floatingsearchview/util/view/MenuView;)Lcom/arlib/floatingsearchview/util/view/MenuView$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-virtual {v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->getChildCount()I

    move-result v0

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v2}, Lcom/arlib/floatingsearchview/util/view/MenuView;->d(Lcom/arlib/floatingsearchview/util/view/MenuView;)F

    move-result v2

    float-to-int v2, v2

    mul-int/2addr v2, v0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->g(Lcom/arlib/floatingsearchview/util/view/MenuView;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/b;->a(I)I

    move-result v0

    :goto_0
    sub-int v0, v2, v0

    invoke-static {v1, v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Lcom/arlib/floatingsearchview/util/view/MenuView;I)I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->e(Lcom/arlib/floatingsearchview/util/view/MenuView;)Lcom/arlib/floatingsearchview/util/view/MenuView$b;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$10;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->f(Lcom/arlib/floatingsearchview/util/view/MenuView;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView$b;->a(I)V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
