.class public Lcom/gigamole/infinitecycleviewpager/a$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/view/ViewPager$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/gigamole/infinitecycleviewpager/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/gigamole/infinitecycleviewpager/a;


# direct methods
.method protected constructor <init>(Lcom/gigamole/infinitecycleviewpager/a;)V
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;F)V
    .locals 9

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->f(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->f(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/d;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/gigamole/infinitecycleviewpager/d;->a(Landroid/view/View;F)V

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;Landroid/view/View;)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->g(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    const/high16 v0, 0x40000000    # 2.0f

    cmpl-float v0, p2, v0

    if-gtz v0, :cond_2

    const/high16 v0, -0x40000000    # -2.0f

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->h(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v0

    if-eqz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p2, v0

    if-gtz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->h(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v0

    if-eqz v0, :cond_4

    const/high16 v0, -0x40800000    # -1.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_4

    :cond_2
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->i(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    :goto_1
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    mul-float v4, v0, v1

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->k(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    mul-float v5, v0, v1

    sub-float v1, v0, v4

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v6, v1, v2

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->l(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    mul-float/2addr v1, v0

    sub-float v1, v0, v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v3, v1, v2

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->k(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v2

    add-float/2addr v1, v2

    mul-float/2addr v1, v0

    sub-float v1, v0, v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v2, v1

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->g(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v1

    const/4 v7, 0x4

    if-ge v1, v7, :cond_b

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->h(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v1

    if-nez v1, :cond_b

    const/high16 v1, -0x40000000    # -2.0f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_b

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_b

    const/high16 v1, -0x40800000    # -1.0f

    sub-float v2, v1, p2

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    sub-float v3, v0, v6

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    add-float/2addr v3, v5

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v0, v5

    sub-float/2addr v0, v4

    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v4, v5

    sub-float/2addr v0, v4

    mul-float/2addr v0, v2

    add-float/2addr v0, v3

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->n(Lcom/gigamole/infinitecycleviewpager/a;)I

    :goto_2
    invoke-static {p1, v1}, Landroid/support/v4/view/ah;->d(Landroid/view/View;F)V

    invoke-static {p1, v1}, Landroid/support/v4/view/ah;->e(Landroid/view/View;F)V

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->i(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {p1, v0}, Landroid/support/v4/view/ah;->b(Landroid/view/View;F)V

    :goto_3
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->g(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    :cond_6
    sget-object v1, Lcom/gigamole/infinitecycleviewpager/a$4;->a:[I

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->q(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/gigamole/infinitecycleviewpager/a$b;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->v(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    :cond_7
    :goto_4
    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-nez v1, :cond_8

    const/4 v0, 0x1

    :cond_8
    :goto_5
    if-eqz v0, :cond_9

    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->y(Lcom/gigamole/infinitecycleviewpager/a;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_9
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->f(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/d;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->f(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/d;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/gigamole/infinitecycleviewpager/d;->b(Landroid/view/View;F)V

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    goto/16 :goto_1

    :cond_b
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->g(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v1

    const/4 v7, 0x3

    if-le v1, v7, :cond_c

    const/high16 v1, -0x40000000    # -2.0f

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_c

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_c

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v2, p2

    add-float/2addr v2, v1

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v0

    add-float/2addr v0, v6

    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v4

    sub-float/2addr v0, v4

    mul-float/2addr v0, v2

    sub-float v0, v3, v0

    goto/16 :goto_2

    :cond_c
    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_e

    const/high16 v1, -0x41000000    # -0.5f

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_e

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v4, p2

    const/high16 v7, 0x40000000    # 2.0f

    mul-float/2addr v4, v7

    add-float/2addr v4, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v4

    iget-object v7, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v7}, Lcom/gigamole/infinitecycleviewpager/a;->o(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v7

    if-eqz v7, :cond_d

    sub-float/2addr v0, v5

    sub-float/2addr v0, v3

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v3

    add-float/2addr v0, v3

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v3

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->k(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    add-float/2addr v3, v5

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->k(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    mul-float/2addr v1, v5

    sub-float v1, v3, v1

    sub-float v2, v0, v2

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->p(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v3

    add-float/2addr v2, v3

    mul-float/2addr v2, v4

    sub-float/2addr v0, v2

    goto/16 :goto_2

    :cond_d
    sub-float/2addr v0, v6

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v2

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->l(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v2

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->l(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    iget-object v6, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v6}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v6

    sub-float/2addr v5, v6

    mul-float/2addr v1, v5

    sub-float v1, v2, v1

    sub-float v2, v0, v3

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->p(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v3

    add-float/2addr v2, v3

    mul-float/2addr v2, v4

    sub-float/2addr v0, v2

    goto/16 :goto_2

    :cond_e
    const/high16 v1, -0x41000000    # -0.5f

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_11

    const/4 v1, 0x0

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_11

    neg-float v0, p2

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v4, v0, v1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->l(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->o(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->k(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v0

    mul-float/2addr v0, v4

    :goto_6
    sub-float/2addr v1, v0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->o(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v0

    if-eqz v0, :cond_10

    move v0, v2

    :goto_7
    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->p(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v2

    sub-float/2addr v0, v2

    mul-float/2addr v0, v4

    goto/16 :goto_2

    :cond_f
    const/4 v0, 0x0

    goto :goto_6

    :cond_10
    move v0, v3

    goto :goto_7

    :cond_11
    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_14

    const/high16 v1, 0x3f000000    # 0.5f

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_14

    const/high16 v0, 0x40000000    # 2.0f

    mul-float v1, p2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->o(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v4

    if-nez v4, :cond_12

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->l(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v0

    :goto_8
    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->o(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v4

    if-eqz v4, :cond_13

    :goto_9
    neg-float v2, v2

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->p(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v3

    add-float/2addr v2, v3

    mul-float/2addr v1, v2

    move v8, v1

    move v1, v0

    move v0, v8

    goto/16 :goto_2

    :cond_12
    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v4

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->k(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->k(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    mul-float/2addr v0, v5

    add-float/2addr v0, v4

    goto :goto_8

    :cond_13
    move v2, v3

    goto :goto_9

    :cond_14
    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_16

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_16

    const/high16 v1, 0x3f000000    # 0.5f

    sub-float v1, p2, v1

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v4

    iget-object v7, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v7}, Lcom/gigamole/infinitecycleviewpager/a;->o(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v7

    if-eqz v7, :cond_15

    iget-object v6, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v6}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v6

    iget-object v7, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v7}, Lcom/gigamole/infinitecycleviewpager/a;->k(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v7

    mul-float/2addr v1, v7

    add-float/2addr v1, v6

    neg-float v6, v2

    iget-object v7, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v7}, Lcom/gigamole/infinitecycleviewpager/a;->p(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v7

    add-float/2addr v6, v7

    neg-float v0, v0

    add-float/2addr v0, v5

    add-float/2addr v0, v3

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v2

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->p(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v2

    sub-float/2addr v0, v2

    mul-float/2addr v0, v4

    add-float/2addr v0, v6

    goto/16 :goto_2

    :cond_15
    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v2

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->l(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    iget-object v7, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v7}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v7

    sub-float/2addr v5, v7

    mul-float/2addr v1, v5

    add-float/2addr v1, v2

    neg-float v2, v3

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->p(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    add-float/2addr v2, v5

    neg-float v0, v0

    add-float/2addr v0, v3

    add-float/2addr v0, v6

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v3

    sub-float/2addr v0, v3

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->p(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v3

    sub-float/2addr v0, v3

    mul-float/2addr v0, v4

    add-float/2addr v0, v2

    goto/16 :goto_2

    :cond_16
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->g(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v1

    const/4 v2, 0x3

    if-le v1, v2, :cond_17

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_17

    const/high16 v1, 0x40000000    # 2.0f

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_17

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, p2, v2

    add-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, v1

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    sub-float v3, v0, v6

    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v4

    add-float/2addr v3, v4

    neg-float v3, v3

    add-float/2addr v0, v6

    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v4

    sub-float/2addr v0, v4

    mul-float/2addr v0, v2

    add-float/2addr v0, v3

    goto/16 :goto_2

    :cond_17
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->g(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v1

    const/4 v2, 0x4

    if-ge v1, v2, :cond_18

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->h(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v1

    if-nez v1, :cond_18

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_18

    const/high16 v1, 0x40000000    # 2.0f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_18

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v2, v1, p2

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    sub-float v3, v0, v6

    iget-object v5, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v5}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v5

    add-float/2addr v3, v5

    neg-float v3, v3

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v0, v5

    sub-float/2addr v0, v4

    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->m(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v4, v5

    sub-float/2addr v0, v4

    mul-float/2addr v0, v2

    add-float/2addr v0, v3

    iget-object v2, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v2}, Lcom/gigamole/infinitecycleviewpager/a;->n(Lcom/gigamole/infinitecycleviewpager/a;)I

    goto/16 :goto_2

    :cond_18
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->j(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    const/4 v0, 0x0

    goto/16 :goto_2

    :cond_19
    invoke-static {p1, v0}, Landroid/support/v4/view/ah;->a(Landroid/view/View;F)V

    goto/16 :goto_3

    :pswitch_0
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->r(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/a$b;

    move-result-object v1

    sget-object v2, Lcom/gigamole/infinitecycleviewpager/a$b;->b:Lcom/gigamole/infinitecycleviewpager/a$b;

    if-ne v1, v2, :cond_1c

    const/high16 v1, -0x41000000    # -0.5f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_1a

    const/4 v1, 0x0

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_1a

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->s(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    const/4 v0, 0x1

    goto/16 :goto_5

    :cond_1a
    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_1b

    const/high16 v1, 0x3f000000    # 0.5f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_1b

    const/4 v0, 0x1

    goto/16 :goto_5

    :cond_1b
    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_8

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_8

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->s(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/f;

    move-result-object v1

    invoke-interface {v1}, Lcom/gigamole/infinitecycleviewpager/f;->getChildCount()I

    move-result v1

    const/4 v2, 0x3

    if-le v1, v2, :cond_8

    const/4 v0, 0x1

    goto/16 :goto_5

    :cond_1c
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->t(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_8

    const/high16 v1, -0x41000000    # -0.5f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_8

    const/4 v1, 0x0

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_8

    const/4 v0, 0x1

    goto/16 :goto_5

    :pswitch_1
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->r(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/a$b;

    move-result-object v1

    sget-object v2, Lcom/gigamole/infinitecycleviewpager/a$b;->c:Lcom/gigamole/infinitecycleviewpager/a$b;

    if-ne v1, v2, :cond_1f

    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_1d

    const/high16 v1, 0x3f000000    # 0.5f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_1d

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->u(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    const/4 v0, 0x1

    goto/16 :goto_5

    :cond_1d
    const/high16 v1, -0x41000000    # -0.5f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_1e

    const/4 v1, 0x0

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_1e

    const/4 v0, 0x1

    goto/16 :goto_5

    :cond_1e
    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_8

    const/high16 v1, -0x41000000    # -0.5f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_8

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->u(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/f;

    move-result-object v1

    invoke-interface {v1}, Lcom/gigamole/infinitecycleviewpager/f;->getChildCount()I

    move-result v1

    const/4 v2, 0x3

    if-le v1, v2, :cond_8

    const/4 v0, 0x1

    goto/16 :goto_5

    :cond_1f
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->t(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_8

    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_8

    const/high16 v1, 0x3f000000    # 0.5f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_8

    const/4 v0, 0x1

    goto/16 :goto_5

    :cond_20
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->w(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-nez v1, :cond_22

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p2, v1

    if-nez v1, :cond_22

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->d(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    :cond_21
    :goto_a
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->x(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-nez v1, :cond_26

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, p2, v1

    if-nez v1, :cond_26

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->e(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    goto/16 :goto_4

    :cond_22
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->w(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-eqz v1, :cond_23

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, p2, v1

    if-nez v1, :cond_23

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    goto :goto_a

    :cond_23
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->w(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-nez v1, :cond_24

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, p2, v1

    if-eqz v1, :cond_25

    :cond_24
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->w(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-eqz v1, :cond_21

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->u(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-eqz v1, :cond_21

    const/high16 v1, -0x40000000    # -2.0f

    cmpl-float v1, p2, v1

    if-nez v1, :cond_21

    :cond_25
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    goto :goto_a

    :cond_26
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->x(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-eqz v1, :cond_27

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p2, v1

    if-nez v1, :cond_27

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    goto/16 :goto_4

    :cond_27
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->x(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-nez v1, :cond_28

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p2, v1

    if-eqz v1, :cond_29

    :cond_28
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->x(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->s(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/high16 v1, 0x40000000    # 2.0f

    cmpl-float v1, p2, v1

    if-nez v1, :cond_7

    :cond_29
    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$a;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    goto/16 :goto_4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
