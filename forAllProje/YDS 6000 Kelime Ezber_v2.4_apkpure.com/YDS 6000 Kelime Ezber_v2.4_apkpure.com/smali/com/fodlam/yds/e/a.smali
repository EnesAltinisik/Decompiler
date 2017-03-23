.class public Lcom/fodlam/yds/e/a;
.super Landroid/support/v4/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const v0, 0x7f040046

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/support/v4/b/l;->a(Landroid/view/View;Landroid/os/Bundle;)V

    const v0, 0x7f100175

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;

    new-instance v1, Lcom/fodlam/yds/a/b;

    invoke-virtual {p0}, Lcom/fodlam/yds/e/a;->h()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/fodlam/yds/a/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    return-void
.end method
