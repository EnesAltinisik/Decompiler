.class public Lcom/mikepenz/actionitembadge/library/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mikepenz/actionitembadge/library/a$a;,
        Lcom/mikepenz/actionitembadge/library/a$b;
    }
.end annotation


# direct methods
.method public static a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;Lcom/mikepenz/actionitembadge/library/a$a;)V

    return-void
.end method

.method public static a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;Lcom/mikepenz/actionitembadge/library/a$a;)V
    .locals 3

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    if-nez p3, :cond_4

    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    move-object v2, v0

    :goto_1
    sget v0, Lcom/mikepenz/actionitembadge/library/R$id;->menu_badge:I

    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lcom/mikepenz/actionitembadge/library/R$id;->menu_badge_icon:I

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    if-eqz p0, :cond_2

    new-instance v1, Lcom/mikepenz/actionitembadge/library/a$1;

    invoke-direct {v1, p5, p1, p0}, Lcom/mikepenz/actionitembadge/library/a$1;-><init>(Lcom/mikepenz/actionitembadge/library/a$a;Landroid/view/MenuItem;Landroid/app/Activity;)V

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Lcom/mikepenz/actionitembadge/library/a$2;

    invoke-direct {v1, p0, p1}, Lcom/mikepenz/actionitembadge/library/a$2;-><init>(Landroid/app/Activity;Landroid/view/MenuItem;)V

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_2
    if-eqz p3, :cond_3

    new-instance v1, Lcom/mikepenz/actionitembadge/library/a/a;

    invoke-direct {v1}, Lcom/mikepenz/actionitembadge/library/a/a;-><init>()V

    invoke-virtual {p3}, Lcom/mikepenz/actionitembadge/library/a/b;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/mikepenz/actionitembadge/library/a/a;->c(I)Lcom/mikepenz/actionitembadge/library/a/a;

    move-result-object v1

    invoke-virtual {p3}, Lcom/mikepenz/actionitembadge/library/a/b;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/mikepenz/actionitembadge/library/a/a;->a(I)Lcom/mikepenz/actionitembadge/library/a/a;

    move-result-object v1

    invoke-virtual {p3}, Lcom/mikepenz/actionitembadge/library/a/b;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/mikepenz/actionitembadge/library/a/a;->b(I)Lcom/mikepenz/actionitembadge/library/a/a;

    move-result-object v1

    invoke-virtual {p3}, Lcom/mikepenz/actionitembadge/library/a/b;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/mikepenz/actionitembadge/library/a/a;->e(I)Lcom/mikepenz/actionitembadge/library/a/a;

    move-result-object v1

    invoke-virtual {p3}, Lcom/mikepenz/actionitembadge/library/a/b;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/mikepenz/actionitembadge/library/a/a;->d(I)Lcom/mikepenz/actionitembadge/library/a/a;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/mikepenz/actionitembadge/library/a/a;->a(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mikepenz/actionitembadge/library/a/c;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p3}, Lcom/mikepenz/actionitembadge/library/a/b;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    if-nez p4, :cond_5

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_2
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, Lcom/mikepenz/actionitembadge/library/a/b;->a()I

    move-result v0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    move-object v2, v0

    goto/16 :goto_1

    :cond_5
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method public static a(Landroid/app/Activity;Landroid/view/MenuItem;Lcom/mikepenz/iconics/a/a;Lcom/mikepenz/actionitembadge/library/a$b;I)V
    .locals 1

    invoke-virtual {p3}, Lcom/mikepenz/actionitembadge/library/a$b;->a()Lcom/mikepenz/actionitembadge/library/a/b;

    move-result-object v0

    invoke-static {p0, p1, p2, v0, p4}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Lcom/mikepenz/iconics/a/a;Lcom/mikepenz/actionitembadge/library/a/b;I)V

    return-void
.end method

.method public static a(Landroid/app/Activity;Landroid/view/MenuItem;Lcom/mikepenz/iconics/a/a;Lcom/mikepenz/actionitembadge/library/a/b;I)V
    .locals 2

    const/4 v1, -0x1

    const/high16 v0, -0x80000000

    if-ne p4, v0, :cond_0

    new-instance v0, Lcom/mikepenz/iconics/a;

    invoke-direct {v0, p0, p2}, Lcom/mikepenz/iconics/a;-><init>(Landroid/content/Context;Lcom/mikepenz/iconics/a/a;)V

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->a(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mikepenz/iconics/a;->a()Lcom/mikepenz/iconics/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, p3, v1}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/mikepenz/iconics/a;

    invoke-direct {v0, p0, p2}, Lcom/mikepenz/iconics/a;-><init>(Landroid/content/Context;Lcom/mikepenz/iconics/a/a;)V

    invoke-virtual {v0, v1}, Lcom/mikepenz/iconics/a;->a(I)Lcom/mikepenz/iconics/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mikepenz/iconics/a;->a()Lcom/mikepenz/iconics/a;

    move-result-object v0

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v0, p3, v1}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a(Landroid/view/MenuItem;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public static a(Landroid/view/MenuItem;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public static a(Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;I)V
    .locals 3

    const/4 v1, 0x0

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_0

    move-object v0, v1

    check-cast v0, Lcom/mikepenz/actionitembadge/library/a/b;

    invoke-static {v1, p0, p1, v0, v1}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/mikepenz/actionitembadge/library/a/b;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p0, p1, v0, v2}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;)V

    goto :goto_0
.end method
