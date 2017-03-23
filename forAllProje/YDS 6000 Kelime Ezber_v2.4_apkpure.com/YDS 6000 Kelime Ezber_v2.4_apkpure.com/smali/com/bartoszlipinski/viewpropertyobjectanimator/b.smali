.class Lcom/bartoszlipinski/viewpropertyobjectanimator/b;
.super Lcom/bartoszlipinski/viewpropertyobjectanimator/a;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private final b:Landroid/view/ViewGroup$LayoutParams;

.field private c:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

.field private d:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    invoke-virtual {p0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v0

    iget-object v1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->c:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->b:Landroid/view/ViewGroup$LayoutParams;

    iget-object v2, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->c:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    iget v2, v2, Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;->a:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->c:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    iget v3, v3, Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;->b:I

    int-to-float v3, v3

    invoke-virtual {p0, v2, v3, v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->a(FFF)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_0
    iget-object v1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->d:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->b:Landroid/view/ViewGroup$LayoutParams;

    iget-object v2, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->d:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    iget v2, v2, Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;->a:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->d:Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;

    iget v3, v3, Lcom/bartoszlipinski/viewpropertyobjectanimator/a$a;->b:I

    int-to-float v3, v3

    invoke-virtual {p0, v2, v3, v0}, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->a(FFF)F

    move-result v0

    float-to-int v0, v0

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_1
    iget-object v0, p0, Lcom/bartoszlipinski/viewpropertyobjectanimator/b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_2
    return-void
.end method
