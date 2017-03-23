.class Lcom/balysv/materialripple/a$3;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/balysv/materialripple/a;->a(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/balysv/materialripple/a;


# direct methods
.method constructor <init>(Lcom/balysv/materialripple/a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/balysv/materialripple/a$3;->b:Lcom/balysv/materialripple/a;

    iput-object p2, p0, Lcom/balysv/materialripple/a$3;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/balysv/materialripple/a$3;->b:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->e(Lcom/balysv/materialripple/a;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/balysv/materialripple/a$3;->b:Lcom/balysv/materialripple/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/balysv/materialripple/a;->setRadius(F)V

    iget-object v0, p0, Lcom/balysv/materialripple/a$3;->b:Lcom/balysv/materialripple/a;

    iget-object v1, p0, Lcom/balysv/materialripple/a$3;->b:Lcom/balysv/materialripple/a;

    invoke-static {v1}, Lcom/balysv/materialripple/a;->f(Lcom/balysv/materialripple/a;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/balysv/materialripple/a;->setRippleAlpha(Ljava/lang/Integer;)V

    :cond_0
    iget-object v0, p0, Lcom/balysv/materialripple/a$3;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/balysv/materialripple/a$3;->b:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->g(Lcom/balysv/materialripple/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/balysv/materialripple/a$3;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    iget-object v0, p0, Lcom/balysv/materialripple/a$3;->b:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->a(Lcom/balysv/materialripple/a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    return-void
.end method
