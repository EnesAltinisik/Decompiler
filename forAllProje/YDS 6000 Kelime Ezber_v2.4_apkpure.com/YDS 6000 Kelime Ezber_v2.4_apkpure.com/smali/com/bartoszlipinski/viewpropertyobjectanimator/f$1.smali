.class Lcom/bartoszlipinski/viewpropertyobjectanimator/f$1;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a()Landroid/animation/ObjectAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bartoszlipinski/viewpropertyobjectanimator/f;


# direct methods
.method constructor <init>(Lcom/bartoszlipinski/viewpropertyobjectanimator/f;)V
    .locals 0

    iput-object p1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f$1;->a:Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f$1;->a:Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    invoke-static {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Lcom/bartoszlipinski/viewpropertyobjectanimator/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f$1;->a:Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    invoke-static {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b(Lcom/bartoszlipinski/viewpropertyobjectanimator/f;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f$1;->a:Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    invoke-static {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->a(Lcom/bartoszlipinski/viewpropertyobjectanimator/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/f$1;->a:Lcom/bartoszlipinski/viewpropertyobjectanimator/f;

    invoke-static {v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/f;->b(Lcom/bartoszlipinski/viewpropertyobjectanimator/f;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method
