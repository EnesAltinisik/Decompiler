.class public Lcom/fodlam/yds/TestLevelActivity;
.super Landroid/support/v7/app/e;


# instance fields
.field m:Landroid/support/v4/view/ViewPager;

.field n:Lcom/fodlam/yds/a/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    return-void
.end method

.method private j()V
    .locals 2

    new-instance v0, Lcom/afollestad/materialdialogs/f$a;

    invoke-direct {v0, p0}, Lcom/afollestad/materialdialogs/f$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090043

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f090044

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->c(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f09036a

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->f(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f090308

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->g(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    sget-object v1, Lcom/afollestad/materialdialogs/h;->a:Lcom/afollestad/materialdialogs/h;

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(Lcom/afollestad/materialdialogs/h;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f020078

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->b(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f0e001c

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->i(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, -0xbbbbbc

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->d(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    new-instance v1, Lcom/fodlam/yds/TestLevelActivity$2;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/TestLevelActivity$2;-><init>(Lcom/fodlam/yds/TestLevelActivity;)V

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->b(Lcom/afollestad/materialdialogs/f$j;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/f$a;->c()Lcom/afollestad/materialdialogs/f;

    return-void
.end method


# virtual methods
.method public clickCard(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/g;

    invoke-virtual {v0}, Lcom/fodlam/yds/f/g;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/fodlam/yds/TestLevelActivity;->j()V

    :goto_0
    return-void

    :cond_0
    iget v0, v0, Lcom/fodlam/yds/f/g;->a:I

    sput v0, Lcom/fodlam/yds/OxfordApplication;->i:I

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fodlam/yds/TestTypeSelectionActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestLevelActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    const/4 v1, 0x2

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04001f

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestLevelActivity;->setContentView(I)V

    const v0, 0x7f10012a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestLevelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->m:Landroid/support/v4/view/ViewPager;

    new-instance v0, Lcom/fodlam/yds/a/g;

    invoke-direct {v0, p0}, Lcom/fodlam/yds/a/g;-><init>(Lcom/fodlam/yds/TestLevelActivity;)V

    iput-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->n:Lcom/fodlam/yds/a/g;

    iget-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/TestLevelActivity;->n:Lcom/fodlam/yds/a/g;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    iget-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/TestLevelActivity;->n:Lcom/fodlam/yds/a/g;

    invoke-virtual {v2}, Lcom/fodlam/yds/a/g;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v2

    iget-object v2, v2, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f090386

    invoke-virtual {p0, v2}, Lcom/fodlam/yds/TestLevelActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestLevelActivity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f100129

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/TestLevelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/badoualy/stepperindicator/StepperIndicator;

    iget-object v2, p0, Lcom/fodlam/yds/TestLevelActivity;->n:Lcom/fodlam/yds/a/g;

    invoke-virtual {v2}, Lcom/fodlam/yds/a/g;->b()I

    move-result v2

    if-lt v2, v1, :cond_0

    iget-object v1, p0, Lcom/fodlam/yds/TestLevelActivity;->n:Lcom/fodlam/yds/a/g;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/g;->b()I

    move-result v1

    :cond_0
    invoke-virtual {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setStepCount(I)V

    iget-object v1, p0, Lcom/fodlam/yds/TestLevelActivity;->m:Landroid/support/v4/view/ViewPager;

    new-instance v2, Lcom/fodlam/yds/TestLevelActivity$1;

    invoke-direct {v2, p0, v0}, Lcom/fodlam/yds/TestLevelActivity$1;-><init>(Lcom/fodlam/yds/TestLevelActivity;Lcom/badoualy/stepperindicator/StepperIndicator;)V

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager$f;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    iput-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->m:Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->n:Lcom/fodlam/yds/a/g;

    return-void
.end method

.method protected onResume()V
    .locals 3

    iget-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->n:Lcom/fodlam/yds/a/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->m:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/b;->i()Lcom/fodlam/yds/f/g;

    move-result-object v1

    iget v1, v1, Lcom/fodlam/yds/f/g;->a:I

    sput v1, Lcom/fodlam/yds/OxfordApplication;->j:I

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, v0, Lcom/fodlam/yds/f/b;->b:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".LatestTestId"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v2, Lcom/fodlam/yds/OxfordApplication;->j:I

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p0, Lcom/fodlam/yds/TestLevelActivity;->n:Lcom/fodlam/yds/a/g;

    invoke-virtual {v0}, Lcom/fodlam/yds/a/g;->c()V

    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/e;->onResume()V

    return-void
.end method
