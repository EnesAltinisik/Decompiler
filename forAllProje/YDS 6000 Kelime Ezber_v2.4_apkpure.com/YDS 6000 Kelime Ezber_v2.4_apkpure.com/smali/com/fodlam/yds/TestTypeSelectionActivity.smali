.class public Lcom/fodlam/yds/TestTypeSelectionActivity;
.super Landroid/support/v7/app/e;


# instance fields
.field m:Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    return-void
.end method


# virtual methods
.method public clickCardView(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/OxfordApplication$a;

    sput-object v0, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    iget-object v1, v1, Lcom/fodlam/yds/OxfordApplication$a;->i:Ljava/lang/Class;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestTypeSelectionActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040028

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestTypeSelectionActivity;->setContentView(I)V

    const v0, 0x7f100138

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestTypeSelectionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/TestTypeSelectionActivity;->m:Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;

    iget-object v0, p0, Lcom/fodlam/yds/TestTypeSelectionActivity;->m:Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;

    new-instance v1, Lcom/fodlam/yds/a/c;

    invoke-virtual {p0}, Lcom/fodlam/yds/TestTypeSelectionActivity;->e()Landroid/support/v4/b/q;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/fodlam/yds/a/c;-><init>(Landroid/support/v4/b/q;)V

    invoke-virtual {v0, v1}, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    iget-object v0, p0, Lcom/fodlam/yds/TestTypeSelectionActivity;->m:Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;->setOffscreenPageLimit(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v1

    iget-object v1, v1, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/fodlam/yds/OxfordApplication;->i:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f090385

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/TestTypeSelectionActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestTypeSelectionActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/TestTypeSelectionActivity;->m:Lcom/gigamole/infinitecycleviewpager/HorizontalInfiniteCycleViewPager;

    return-void
.end method
