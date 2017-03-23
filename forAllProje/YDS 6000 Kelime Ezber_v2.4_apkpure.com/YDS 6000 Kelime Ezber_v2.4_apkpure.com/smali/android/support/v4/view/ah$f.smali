.class Landroid/support/v4/view/ah$f;
.super Landroid/support/v4/view/ah$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ah;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/view/ah$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-static {p1, p2}, Landroid/support/v4/view/an;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p1, p2}, Landroid/support/v4/view/an;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 1

    invoke-static {p1, p2, p3, p4}, Landroid/support/v4/view/an;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public b(Landroid/view/View;)Z
    .locals 1

    invoke-static {p1}, Landroid/support/v4/view/an;->a(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public c(Landroid/view/View;)V
    .locals 0

    invoke-static {p1}, Landroid/support/v4/view/an;->b(Landroid/view/View;)V

    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    const/4 p2, 0x2

    :cond_0
    invoke-static {p1, p2}, Landroid/support/v4/view/an;->a(Landroid/view/View;I)V

    return-void
.end method

.method public d(Landroid/view/View;)I
    .locals 1

    invoke-static {p1}, Landroid/support/v4/view/an;->c(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public h(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    invoke-static {p1}, Landroid/support/v4/view/an;->d(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v0

    return-object v0
.end method

.method public m(Landroid/view/View;)Z
    .locals 1

    invoke-static {p1}, Landroid/support/v4/view/an;->i(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public q(Landroid/view/View;)I
    .locals 1

    invoke-static {p1}, Landroid/support/v4/view/an;->e(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public r(Landroid/view/View;)I
    .locals 1

    invoke-static {p1}, Landroid/support/v4/view/an;->f(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public v(Landroid/view/View;)V
    .locals 0

    invoke-static {p1}, Landroid/support/v4/view/an;->g(Landroid/view/View;)V

    return-void
.end method

.method public y(Landroid/view/View;)Z
    .locals 1

    invoke-static {p1}, Landroid/support/v4/view/an;->h(Landroid/view/View;)Z

    move-result v0

    return v0
.end method
