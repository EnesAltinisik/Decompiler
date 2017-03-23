.class public Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;
.super Landroid/support/v4/view/ViewPager;

# interfaces
.implements Lcom/gigamole/infinitecycleviewpager/f;


# instance fields
.field private d:Lcom/gigamole/infinitecycleviewpager/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0, p1, p2}, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/a;

    invoke-direct {v0, p1, p0, p2}, Lcom/gigamole/infinitecycleviewpager/a;-><init>(Landroid/content/Context;Lcom/gigamole/infinitecycleviewpager/f;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    return-void
.end method


# virtual methods
.method public a(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->b(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-super {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    :cond_0
    return-void
.end method

.method public a(ZLandroid/support/v4/view/ViewPager$g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v1, :cond_0

    :goto_0
    invoke-super {p0, v0, p2}, Landroid/support/v4/view/ViewPager;->a(ZLandroid/support/v4/view/ViewPager$g;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v1}, Lcom/gigamole/infinitecycleviewpager/a;->i()Lcom/gigamole/infinitecycleviewpager/a$a;

    move-result-object p2

    goto :goto_0
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, p1, v0, p3}, Landroid/support/v4/view/ViewPager;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, p1, v0, p3}, Landroid/support/v4/view/ViewPager;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    return v0
.end method

.method public getAdapter()Landroid/support/v4/view/aa;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->j()Lcom/gigamole/infinitecycleviewpager/b;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/aa;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->j()Lcom/gigamole/infinitecycleviewpager/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/b;->c()Landroid/support/v4/view/aa;

    move-result-object v0

    goto :goto_0
.end method

.method public getCenterPageScaleOffset()F
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->b()F

    move-result v0

    goto :goto_0
.end method

.method public getInterpolator()Landroid/view/animation/Interpolator;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->f()Landroid/view/animation/Interpolator;

    move-result-object v0

    goto :goto_0
.end method

.method public getMaxPageScale()F
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->d()F

    move-result v0

    goto :goto_0
.end method

.method public getMinPageScale()F
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->c()F

    move-result v0

    goto :goto_0
.end method

.method public getMinPageScaleOffset()F
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->a()F

    move-result v0

    goto :goto_0
.end method

.method public getOnInfiniteCyclePageTransformListener()Lcom/gigamole/infinitecycleviewpager/d;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->h()Lcom/gigamole/infinitecycleviewpager/d;

    move-result-object v0

    goto :goto_0
.end method

.method public getRealItem()I
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->getCurrentItem()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->k()I

    move-result v0

    goto :goto_0
.end method

.method public getScrollDuration()I
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->e()I

    move-result v0

    goto :goto_0
.end method

.method public getState()I
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->g()I

    move-result v0

    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->o()V

    :cond_0
    invoke-super {p0}, Landroid/support/v4/view/ViewPager;->onDetachedFromWindow()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v1, :cond_1

    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v1, p1}, Lcom/gigamole/infinitecycleviewpager/a;->b(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v1, :cond_1

    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v1, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->b(Z)V

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onWindowFocusChanged(Z)V

    return-void
.end method

.method public setAdapter(Landroid/support/v4/view/aa;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/support/v4/view/aa;)Landroid/support/v4/view/aa;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->n()V

    goto :goto_0
.end method

.method public setCenterPageScaleOffset(F)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->b(F)V

    :cond_0
    return-void
.end method

.method protected setChildrenDrawingCacheEnabled(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setChildrenDrawingCacheEnabled(Z)V

    return-void
.end method

.method protected setChildrenDrawingOrderEnabled(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setChildrenDrawingOrderEnabled(Z)V

    return-void
.end method

.method public setClipChildren(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setClipChildren(Z)V

    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->a(IZ)V

    return-void
.end method

.method public setDrawingCacheEnabled(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setDrawingCacheEnabled(Z)V

    return-void
.end method

.method public setInterpolator(Landroid/view/animation/Interpolator;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Landroid/view/animation/Interpolator;)V

    :cond_0
    return-void
.end method

.method public setMaxPageScale(F)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->d(F)V

    :cond_0
    return-void
.end method

.method public setMediumScaled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Z)V

    :cond_0
    return-void
.end method

.method public setMinPageScale(F)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->c(F)V

    :cond_0
    return-void
.end method

.method public setMinPageScaleOffset(F)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(F)V

    :cond_0
    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .locals 1

    const/4 v0, 0x2

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    return-void
.end method

.method public setOnInfiniteCyclePageTransformListener(Lcom/gigamole/infinitecycleviewpager/d;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/d;)V

    :cond_0
    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 1

    const/4 v0, 0x2

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setOverScrollMode(I)V

    return-void
.end method

.method public setPageMargin(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setPageMargin(I)V

    return-void
.end method

.method public setScrollDuration(I)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->d:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(I)V

    :cond_0
    return-void
.end method

.method public setWillNotCacheDrawing(Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-super {p0, v0}, Landroid/support/v4/view/ViewPager;->setWillNotCacheDrawing(Z)V

    return-void
.end method
