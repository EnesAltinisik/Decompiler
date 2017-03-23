.class Lcom/bartoszlipinski/viewpropertyobjectanimator/e;
.super Lcom/bartoszlipinski/viewpropertyobjectanimator/a;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private b:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

.field private c:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;


# direct methods
.method private b()I
    .locals 1

    invoke-virtual {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()I
    .locals 1

    invoke-virtual {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    invoke-virtual {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v3

    invoke-direct {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->b()I

    move-result v0

    invoke-direct {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->c()I

    move-result v2

    iget-object v1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->b:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->b:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    iget v0, v0, Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;->a:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->b:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    iget v1, v1, Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;->b:I

    int-to-float v1, v1

    invoke-virtual {p0, v0, v1, v3}, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->a(FFF)F

    move-result v0

    float-to-int v0, v0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->c:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->c:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    iget v0, v0, Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;->a:I

    int-to-float v0, v0

    iget-object v2, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->c:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    iget v2, v2, Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;->b:I

    int-to-float v2, v2

    invoke-virtual {p0, v0, v2, v3}, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->a(FFF)F

    move-result v0

    float-to-int v0, v0

    move v2, v0

    :cond_0
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    :cond_1
    return-void

    :cond_2
    move v1, v0

    goto :goto_0
.end method
