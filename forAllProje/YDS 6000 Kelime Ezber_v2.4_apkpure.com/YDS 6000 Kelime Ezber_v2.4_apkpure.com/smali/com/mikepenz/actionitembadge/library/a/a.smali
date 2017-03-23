.class public Lcom/mikepenz/actionitembadge/library/a/a;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, -0x1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/mikepenz/actionitembadge/library/a/a;->a:I

    iput v0, p0, Lcom/mikepenz/actionitembadge/library/a/a;->b:I

    iput v1, p0, Lcom/mikepenz/actionitembadge/library/a/a;->c:I

    iput v1, p0, Lcom/mikepenz/actionitembadge/library/a/a;->d:I

    iput v0, p0, Lcom/mikepenz/actionitembadge/library/a/a;->e:I

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;
    .locals 6

    const/4 v5, -0x1

    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    sget v0, Lcom/mikepenz/actionitembadge/library/R$drawable;->action_item_badge:I

    invoke-static {p1, v0}, Landroid/support/v4/c/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/GradientDrawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/GradientDrawable;

    iget v3, p0, Lcom/mikepenz/actionitembadge/library/a/a;->a:I

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget v3, p0, Lcom/mikepenz/actionitembadge/library/a/a;->b:I

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget v3, p0, Lcom/mikepenz/actionitembadge/library/a/a;->d:I

    if-le v3, v5, :cond_0

    iget v3, p0, Lcom/mikepenz/actionitembadge/library/a/a;->d:I

    iget v4, p0, Lcom/mikepenz/actionitembadge/library/a/a;->e:I

    invoke-virtual {v0, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    iget v3, p0, Lcom/mikepenz/actionitembadge/library/a/a;->d:I

    iget v4, p0, Lcom/mikepenz/actionitembadge/library/a/a;->e:I

    invoke-virtual {v1, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_0
    iget v3, p0, Lcom/mikepenz/actionitembadge/library/a/a;->c:I

    if-le v3, v5, :cond_1

    iget v3, p0, Lcom/mikepenz/actionitembadge/library/a/a;->c:I

    int-to-float v3, v3

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget v3, p0, Lcom/mikepenz/actionitembadge/library/a/a;->c:I

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    :cond_1
    const/4 v3, 0x1

    new-array v3, v3, [I

    const/4 v4, 0x0

    const v5, 0x10100a7

    aput v5, v3, v4

    invoke-virtual {v2, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    sget-object v1, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {v2, v1, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v2
.end method

.method public a(I)Lcom/mikepenz/actionitembadge/library/a/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/actionitembadge/library/a/a;->a:I

    return-object p0
.end method

.method public b(I)Lcom/mikepenz/actionitembadge/library/a/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/actionitembadge/library/a/a;->b:I

    return-object p0
.end method

.method public c(I)Lcom/mikepenz/actionitembadge/library/a/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/actionitembadge/library/a/a;->c:I

    return-object p0
.end method

.method public d(I)Lcom/mikepenz/actionitembadge/library/a/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/actionitembadge/library/a/a;->d:I

    return-object p0
.end method

.method public e(I)Lcom/mikepenz/actionitembadge/library/a/a;
    .locals 0

    iput p1, p0, Lcom/mikepenz/actionitembadge/library/a/a;->e:I

    return-object p0
.end method
