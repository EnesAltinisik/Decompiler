.class public Lcom/fodlam/yds/WriteWordActivity;
.super Lcom/fodlam/yds/c;


# instance fields
.field m:Landroid/support/v4/view/ViewPager;

.field n:Lcom/fodlam/yds/a/k;

.field private o:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fodlam/yds/WriteWordActivity;->o:Z

    return-void
.end method


# virtual methods
.method public clickCard(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    invoke-virtual {p0}, Lcom/fodlam/yds/WriteWordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    move-result-object v1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/utility/b;->b(Ljava/lang/String;)V

    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/k;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/fodlam/yds/WriteWordActivity;->o:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fodlam/yds/WriteWordActivity;->o:Z

    invoke-virtual {p0}, Lcom/fodlam/yds/WriteWordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->c()V

    iget-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    invoke-virtual {v0}, Lcom/fodlam/yds/a/k;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WriteWordActivity;->c(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/fodlam/yds/WriteWordActivity$3;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/WriteWordActivity$3;-><init>(Lcom/fodlam/yds/WriteWordActivity;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/ViewPager;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    const/4 v1, 0x2

    invoke-super {p0, p1}, Lcom/fodlam/yds/c;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04002a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WriteWordActivity;->setContentView(I)V

    const v0, 0x7f100127

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WriteWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WriteWordActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v2}, Lcom/fodlam/yds/OxfordApplication$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v2, Lcom/fodlam/yds/OxfordApplication;->i:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ". "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f090384

    invoke-virtual {p0, v2}, Lcom/fodlam/yds/WriteWordActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WriteWordActivity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f10012b

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WriteWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/FloatingActionButton;

    new-instance v2, Lcom/fodlam/yds/WriteWordActivity$1;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/WriteWordActivity$1;-><init>(Lcom/fodlam/yds/WriteWordActivity;)V

    invoke-virtual {v0, v2}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Lcom/fodlam/yds/a/k;

    invoke-direct {v0, p0, p1}, Lcom/fodlam/yds/a/k;-><init>(Lcom/fodlam/yds/WriteWordActivity;Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    const v0, 0x7f10012a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WriteWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    iget-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    invoke-virtual {v2}, Lcom/fodlam/yds/a/k;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    const v0, 0x7f100129

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WriteWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/badoualy/stepperindicator/StepperIndicator;

    iget-object v2, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    invoke-virtual {v2}, Lcom/fodlam/yds/a/k;->b()I

    move-result v2

    div-int/lit8 v2, v2, 0x3

    if-lt v2, v1, :cond_0

    iget-object v1, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/k;->b()I

    move-result v1

    div-int/lit8 v1, v1, 0x3

    :cond_0
    invoke-virtual {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setStepCount(I)V

    iget-object v1, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    new-instance v2, Lcom/fodlam/yds/WriteWordActivity$2;

    invoke-direct {v2, p0, v0}, Lcom/fodlam/yds/WriteWordActivity$2;-><init>(Lcom/fodlam/yds/WriteWordActivity;Lcom/badoualy/stepperindicator/StepperIndicator;)V

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager$f;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    const-string v1, "currentItem"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    :cond_1
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Lcom/fodlam/yds/c;->onDestroy()V

    iput-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "writewordlist"

    iget-object v1, p0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    iget-object v1, v1, Lcom/fodlam/yds/a/k;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v0, "currentItem"

    iget-object v1, p0, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method
