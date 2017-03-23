.class Lcom/nightonke/boommenu/BoomMenuButton$6;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nightonke/boommenu/BoomMenuButton;->c(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nightonke/boommenu/b/a;

.field final synthetic b:Lcom/nightonke/boommenu/c/a;

.field final synthetic c:Lcom/nightonke/boommenu/BoomMenuButton;


# direct methods
.method constructor <init>(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/b/a;Lcom/nightonke/boommenu/c/a;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->c:Lcom/nightonke/boommenu/BoomMenuButton;

    iput-object p2, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->a:Lcom/nightonke/boommenu/b/a;

    iput-object p3, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->b:Lcom/nightonke/boommenu/c/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->b:Lcom/nightonke/boommenu/c/a;

    aput-object v1, v0, v3

    invoke-static {v3, v0}, Lcom/nightonke/boommenu/e;->a(I[Landroid/view/View;)V

    const/4 v0, 0x4

    new-array v1, v2, [Landroid/view/View;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->a:Lcom/nightonke/boommenu/b/a;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/e;->a(I[Landroid/view/View;)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->a:Lcom/nightonke/boommenu/b/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/a;->t()V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->a:Lcom/nightonke/boommenu/b/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/a;->p()V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->c:Lcom/nightonke/boommenu/BoomMenuButton;

    invoke-static {v0}, Lcom/nightonke/boommenu/BoomMenuButton;->c(Lcom/nightonke/boommenu/BoomMenuButton;)I

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton$6;->a:Lcom/nightonke/boommenu/b/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/a;->s()V

    return-void
.end method
