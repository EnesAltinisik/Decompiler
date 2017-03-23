.class Lcom/gigamole/infinitecycleviewpager/a$3;
.super Landroid/support/v4/view/ViewPager$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/gigamole/infinitecycleviewpager/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/gigamole/infinitecycleviewpager/a;


# direct methods
.method constructor <init>(Lcom/gigamole/infinitecycleviewpager/a;)V
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-direct {p0}, Landroid/support/v4/view/ViewPager$j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, p1}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;I)I

    return-void
.end method

.method public a(IFI)V
    .locals 5

    const/4 v2, 0x0

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;I)I

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->z(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->A(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->q(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/a$b;

    move-result-object v0

    sget-object v3, Lcom/gigamole/infinitecycleviewpager/a$b;->a:Lcom/gigamole/infinitecycleviewpager/a$b;

    if-ne v0, v3, :cond_1

    cmpl-float v0, p2, v2

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/f;

    move-result-object v3

    invoke-interface {v3}, Lcom/gigamole/infinitecycleviewpager/f;->getCurrentItem()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v0, v3}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;F)F

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    int-to-float v0, p1

    iget-object v4, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v4}, Lcom/gigamole/infinitecycleviewpager/a;->B(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v4

    cmpl-float v0, v0, v4

    if-nez v0, :cond_5

    sget-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->b:Lcom/gigamole/infinitecycleviewpager/a$b;

    :goto_0
    invoke-static {v3, v0}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;

    :cond_1
    int-to-float v0, p1

    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->B(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v3

    cmpl-float v0, v0, v3

    if-nez v0, :cond_6

    const/4 v0, 0x1

    :goto_1
    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->q(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/a$b;

    move-result-object v3

    sget-object v4, Lcom/gigamole/infinitecycleviewpager/a$b;->b:Lcom/gigamole/infinitecycleviewpager/a$b;

    if-ne v3, v4, :cond_7

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    sget-object v3, Lcom/gigamole/infinitecycleviewpager/a$b;->c:Lcom/gigamole/infinitecycleviewpager/a$b;

    invoke-static {v0, v3}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->t(Lcom/gigamole/infinitecycleviewpager/a;)F

    move-result v0

    cmpg-float v0, v0, p2

    if-gtz v0, :cond_8

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    sget-object v3, Lcom/gigamole/infinitecycleviewpager/a$b;->b:Lcom/gigamole/infinitecycleviewpager/a$b;

    invoke-static {v0, v3}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;

    :goto_3
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, p2}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;F)F

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, p2}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;F)Z

    move-result v0

    if-eqz v0, :cond_3

    move p2, v2

    :cond_3
    cmpl-float v0, p2, v2

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->C(Lcom/gigamole/infinitecycleviewpager/a;)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    sget-object v2, Lcom/gigamole/infinitecycleviewpager/a$b;->a:Lcom/gigamole/infinitecycleviewpager/a$b;

    invoke-static {v0, v2}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    sget-object v2, Lcom/gigamole/infinitecycleviewpager/a$b;->a:Lcom/gigamole/infinitecycleviewpager/a$b;

    invoke-static {v0, v2}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->e(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->d(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->f(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    :cond_4
    return-void

    :cond_5
    sget-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->c:Lcom/gigamole/infinitecycleviewpager/a$b;

    goto :goto_0

    :cond_6
    move v0, v1

    goto :goto_1

    :cond_7
    iget-object v3, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v3}, Lcom/gigamole/infinitecycleviewpager/a;->q(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/a$b;

    move-result-object v3

    sget-object v4, Lcom/gigamole/infinitecycleviewpager/a$b;->c:Lcom/gigamole/infinitecycleviewpager/a$b;

    if-ne v3, v4, :cond_2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    sget-object v3, Lcom/gigamole/infinitecycleviewpager/a$b;->b:Lcom/gigamole/infinitecycleviewpager/a$b;

    invoke-static {v0, v3}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$3;->a:Lcom/gigamole/infinitecycleviewpager/a;

    sget-object v3, Lcom/gigamole/infinitecycleviewpager/a$b;->c:Lcom/gigamole/infinitecycleviewpager/a$b;

    invoke-static {v0, v3}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;Lcom/gigamole/infinitecycleviewpager/a$b;)Lcom/gigamole/infinitecycleviewpager/a$b;

    goto :goto_3
.end method
