.class public Lcom/fodlam/yds/StatisticActivity;
.super Landroid/support/v7/app/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/StatisticActivity$b;,
        Lcom/fodlam/yds/StatisticActivity$a;
    }
.end annotation


# instance fields
.field m:Landroid/support/v7/widget/Toolbar;

.field n:Landroid/support/design/widget/TabLayout;

.field private o:Lcom/fodlam/yds/StatisticActivity$b;

.field private p:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040027

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity;->setContentView(I)V

    const v0, 0x7f100127

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->m:Landroid/support/v7/widget/Toolbar;

    iget-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->m:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    new-instance v0, Lcom/fodlam/yds/StatisticActivity$b;

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity;->e()Landroid/support/v4/b/q;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/fodlam/yds/StatisticActivity$b;-><init>(Lcom/fodlam/yds/StatisticActivity;Landroid/support/v4/b/q;)V

    iput-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->o:Lcom/fodlam/yds/StatisticActivity$b;

    const v0, 0x7f100136

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->p:Landroid/support/v4/view/ViewPager;

    iget-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->p:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/fodlam/yds/StatisticActivity;->o:Lcom/fodlam/yds/StatisticActivity$b;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    const v0, 0x7f100135

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TabLayout;

    iput-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->n:Landroid/support/design/widget/TabLayout;

    iget-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->n:Landroid/support/design/widget/TabLayout;

    iget-object v1, p0, Lcom/fodlam/yds/StatisticActivity;->p:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TabLayout;->setupWithViewPager(Landroid/support/v4/view/ViewPager;)V

    invoke-static {p0}, Lcom/github/mikephil/charting/utils/Utils;->init(Landroid/content/Context;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    iput-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->n:Landroid/support/design/widget/TabLayout;

    iput-object v0, p0, Lcom/fodlam/yds/StatisticActivity;->m:Landroid/support/v7/widget/Toolbar;

    return-void
.end method
