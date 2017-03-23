.class Lcom/arlib/floatingsearchview/util/view/MenuView$17;
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
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/arlib/floatingsearchview/util/view/MenuView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$17;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iput-object p2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$17;->a:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$17;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$17;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->d(Lcom/arlib/floatingsearchview/util/view/MenuView;)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method
