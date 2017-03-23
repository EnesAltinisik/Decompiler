.class public Lcom/fodlam/yds/MultipleChoiceActivity;
.super Lcom/fodlam/yds/c;


# instance fields
.field m:Landroid/support/v4/view/ViewPager;

.field n:Lcom/fodlam/yds/a/d;

.field o:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->o:Z

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/d;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->o:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->o:Z

    invoke-virtual {p0}, Lcom/fodlam/yds/MultipleChoiceActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->c()V

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-virtual {v0}, Lcom/fodlam/yds/a/d;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MultipleChoiceActivity;->c(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/fodlam/yds/MultipleChoiceActivity$2;

    invoke-direct {v1, p0, p1}, Lcom/fodlam/yds/MultipleChoiceActivity$2;-><init>(Lcom/fodlam/yds/MultipleChoiceActivity;I)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/ViewPager;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public clickCard(Landroid/view/View;)V
    .locals 7

    const/4 v6, 0x1

    const/4 v5, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v1}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fodlam/yds/MultipleChoiceActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v2

    iget-object v3, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    iget-object v4, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v4}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v4

    invoke-virtual {v3, v0, v4}, Lcom/fodlam/yds/a/d;->a(Lcom/fodlam/yds/f/h;I)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    iget-object v4, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v4}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/fodlam/yds/a/d;->b(I)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v3, v1}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v3, v1, v6}, Lcom/fodlam/yds/f/e;->b(Ljava/lang/String;I)V

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v2, v0}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/e;)I

    :cond_2
    invoke-virtual {v2}, Lcom/fodlam/yds/c/a;->f()Lcom/fodlam/yds/f/f;

    move-result-object v0

    iget v1, v0, Lcom/fodlam/yds/f/f;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/fodlam/yds/f/f;->d:I

    invoke-virtual {v2, v0}, Lcom/fodlam/yds/c/a;->b(Lcom/fodlam/yds/f/f;)I

    :cond_3
    invoke-virtual {p0}, Lcom/fodlam/yds/MultipleChoiceActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->a()V

    const/16 v0, 0xff

    const/16 v1, 0x7a

    const/16 v2, 0xb2

    const/16 v3, 0x93

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0, v6}, Lcom/fodlam/yds/MultipleChoiceActivity;->b(I)V

    :goto_1
    invoke-virtual {p1, v5}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    :cond_4
    iget-object v3, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    iget-object v4, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v4}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/fodlam/yds/a/d;->b(I)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Lcom/fodlam/yds/c/a;->f()Lcom/fodlam/yds/f/f;

    move-result-object v3

    iget v4, v3, Lcom/fodlam/yds/f/f;->e:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v3, Lcom/fodlam/yds/f/f;->e:I

    invoke-virtual {v2, v3}, Lcom/fodlam/yds/c/a;->b(Lcom/fodlam/yds/f/f;)I

    iget-object v3, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v3, v1, v5}, Lcom/fodlam/yds/f/e;->b(Ljava/lang/String;I)V

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v2, v0}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/e;)I

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/a/d;->e(I)V

    :cond_5
    invoke-virtual {p0}, Lcom/fodlam/yds/MultipleChoiceActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->b()V

    const/16 v0, 0xc8

    const/16 v1, 0xf4

    const/16 v2, 0x66

    const/16 v3, 0x97

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    const/4 v1, 0x2

    invoke-super {p0, p1}, Lcom/fodlam/yds/c;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040023

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MultipleChoiceActivity;->setContentView(I)V

    const v0, 0x7f100127

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MultipleChoiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MultipleChoiceActivity;->a(Landroid/support/v7/widget/Toolbar;)V

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

    const v2, 0x7f090057

    invoke-virtual {p0, v2}, Lcom/fodlam/yds/MultipleChoiceActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MultipleChoiceActivity;->setTitle(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_2

    new-instance v2, Lcom/fodlam/yds/a/d;

    const-string v0, "questions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-direct {v2, p0, v0}, Lcom/fodlam/yds/a/d;-><init>(Lcom/fodlam/yds/MultipleChoiceActivity;Ljava/util/ArrayList;)V

    iput-object v2, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    :goto_0
    const v0, 0x7f10012a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MultipleChoiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-virtual {v2}, Lcom/fodlam/yds/a/d;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    const v0, 0x7f100129

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MultipleChoiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/badoualy/stepperindicator/StepperIndicator;

    iget-object v2, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-virtual {v2}, Lcom/fodlam/yds/a/d;->b()I

    move-result v2

    div-int/lit8 v2, v2, 0x3

    if-lt v2, v1, :cond_0

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/d;->b()I

    move-result v1

    div-int/lit8 v1, v1, 0x3

    :cond_0
    invoke-virtual {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setStepCount(I)V

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    new-instance v2, Lcom/fodlam/yds/MultipleChoiceActivity$1;

    invoke-direct {v2, p0, v0}, Lcom/fodlam/yds/MultipleChoiceActivity$1;-><init>(Lcom/fodlam/yds/MultipleChoiceActivity;Lcom/badoualy/stepperindicator/StepperIndicator;)V

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager$f;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    const-string v1, "CurrentItem"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Lcom/fodlam/yds/a/d;

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fodlam/yds/c/b;->i()Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lcom/fodlam/yds/a/d;-><init>(Lcom/fodlam/yds/MultipleChoiceActivity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-super {p0}, Lcom/fodlam/yds/c;->onDestroy()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "questions"

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    iget-object v1, v1, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v0, "CurrentItem"

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method
