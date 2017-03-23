.class Lcom/arlib/floatingsearchview/util/view/MenuView$4;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/arlib/floatingsearchview/util/view/MenuView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/util/view/MenuView;I)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iput p2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;->a:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->e(Lcom/arlib/floatingsearchview/util/view/MenuView;)Lcom/arlib/floatingsearchview/util/view/MenuView$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->d(Lcom/arlib/floatingsearchview/util/view/MenuView;)F

    move-result v1

    float-to-int v1, v1

    iget v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;->a:I

    mul-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Lcom/arlib/floatingsearchview/util/view/MenuView;I)I

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->e(Lcom/arlib/floatingsearchview/util/view/MenuView;)Lcom/arlib/floatingsearchview/util/view/MenuView$b;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$4;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->f(Lcom/arlib/floatingsearchview/util/view/MenuView;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/arlib/floatingsearchview/util/view/MenuView$b;->a(I)V

    :cond_0
    return-void
.end method
