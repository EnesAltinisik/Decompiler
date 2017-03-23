.class public Lcom/fodlam/yds/WordLearningActivity;
.super Lcom/fodlam/yds/c;


# instance fields
.field m:Lcom/fodlam/yds/utility/b;

.field n:Lcom/fodlam/yds/a/h;

.field o:Landroid/support/v4/view/ViewPager;

.field private p:Z

.field private q:Lcom/google/firebase/database/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fodlam/yds/WordLearningActivity;->p:Z

    return-void
.end method

.method static synthetic a(Lcom/fodlam/yds/WordLearningActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/WordLearningActivity;->j()V

    return-void
.end method

.method static synthetic b(Lcom/fodlam/yds/WordLearningActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/WordLearningActivity;->l()V

    return-void
.end method

.method static synthetic c(Lcom/fodlam/yds/WordLearningActivity;)Lcom/google/firebase/database/d;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->q:Lcom/google/firebase/database/d;

    return-object v0
.end method

.method private j()V
    .locals 3

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/a/h;->a(I)Lcom/fodlam/yds/f/h;

    move-result-object v0

    iget-boolean v1, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-eqz v1, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/fodlam/yds/f/h;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/afollestad/materialdialogs/f$a;

    invoke-direct {v1, p0}, Lcom/afollestad/materialdialogs/f$a;-><init>(Landroid/content/Context;)V

    const v2, 0x7f090059

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->a(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/afollestad/materialdialogs/f$a;->b(Ljava/lang/CharSequence;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f09036a

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->f(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    sget-object v1, Lcom/afollestad/materialdialogs/h;->a:Lcom/afollestad/materialdialogs/h;

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(Lcom/afollestad/materialdialogs/h;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f0e001e

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->i(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, -0xbbbbbc

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->d(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/f$a;->c()Lcom/afollestad/materialdialogs/f;

    goto :goto_0
.end method

.method private l()V
    .locals 4

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/a/h;->a(I)Lcom/fodlam/yds/f/h;

    move-result-object v0

    iget-boolean v1, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-eqz v1, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v1, Lcom/afollestad/materialdialogs/f$a;

    invoke-direct {v1, p0}, Lcom/afollestad/materialdialogs/f$a;-><init>(Landroid/content/Context;)V

    const v2, 0x7f090393

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->a(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    const v2, 0x7f09036a

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->f(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    const v2, 0x7f09004d

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->g(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    sget-object v2, Lcom/afollestad/materialdialogs/h;->a:Lcom/afollestad/materialdialogs/h;

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->a(Lcom/afollestad/materialdialogs/h;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    const v2, -0xbbbbbc

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->d(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    const/high16 v2, 0x7f0f0000

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->e(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/fodlam/yds/WordLearningActivity$4;

    invoke-direct {v3, p0, v0}, Lcom/fodlam/yds/WordLearningActivity$4;-><init>(Lcom/fodlam/yds/WordLearningActivity;Lcom/fodlam/yds/f/h;)V

    invoke-virtual {v1, v2, v3}, Lcom/afollestad/materialdialogs/f$a;->a([Ljava/lang/Integer;Lcom/afollestad/materialdialogs/f$f;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/f$a;->c()Lcom/afollestad/materialdialogs/f;

    goto :goto_0
.end method


# virtual methods
.method public b(I)V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/h;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/fodlam/yds/WordLearningActivity;->p:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-boolean v2, p0, Lcom/fodlam/yds/WordLearningActivity;->p:Z

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v0}, Lcom/fodlam/yds/a/h;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WordLearningActivity;->c(I)V

    invoke-virtual {p0}, Lcom/fodlam/yds/WordLearningActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->c()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/fodlam/yds/WordLearningActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->d()V

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    const/4 v1, 0x2

    invoke-super {p0, p1}, Lcom/fodlam/yds/c;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04001e

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WordLearningActivity;->setContentView(I)V

    const v0, 0x7f100127

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WordLearningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WordLearningActivity;->a(Landroid/support/v7/widget/Toolbar;)V

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

    const-string v2, ". Test"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WordLearningActivity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f10012b

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WordLearningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/FloatingActionButton;

    new-instance v2, Lcom/fodlam/yds/WordLearningActivity$1;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/WordLearningActivity$1;-><init>(Lcom/fodlam/yds/WordLearningActivity;)V

    invoke-virtual {v0, v2}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/fodlam/yds/WordLearningActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->m:Lcom/fodlam/yds/utility/b;

    const v0, 0x7f10012a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WordLearningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    new-instance v0, Lcom/fodlam/yds/a/h;

    invoke-direct {v0, p0, p1}, Lcom/fodlam/yds/a/h;-><init>(Lcom/fodlam/yds/WordLearningActivity;Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/aa;)V

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v2}, Lcom/fodlam/yds/a/h;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    const v0, 0x7f100129

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/WordLearningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/badoualy/stepperindicator/StepperIndicator;

    iget-object v2, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v2}, Lcom/fodlam/yds/a/h;->b()I

    move-result v2

    div-int/lit8 v2, v2, 0x3

    if-lt v2, v1, :cond_0

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/h;->b()I

    move-result v1

    div-int/lit8 v1, v1, 0x3

    :cond_0
    invoke-virtual {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setStepCount(I)V

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    new-instance v2, Lcom/fodlam/yds/WordLearningActivity$2;

    invoke-direct {v2, p0, v0}, Lcom/fodlam/yds/WordLearningActivity$2;-><init>(Lcom/fodlam/yds/WordLearningActivity;Lcom/badoualy/stepperindicator/StepperIndicator;)V

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager$f;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    const-string v1, "CurrentItem"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    :cond_1
    invoke-virtual {p0}, Lcom/fodlam/yds/WordLearningActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "notifyword"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/fodlam/yds/WordLearningActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "notifyword"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v2, v0}, Lcom/fodlam/yds/a/h;->a(Lcom/fodlam/yds/f/h;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    invoke-virtual {p0}, Lcom/fodlam/yds/WordLearningActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "notifyword"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    :cond_2
    invoke-static {}, Lcom/google/firebase/database/f;->a()Lcom/google/firebase/database/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/database/f;->b()Lcom/google/firebase/database/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->q:Lcom/google/firebase/database/d;

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Lcom/fodlam/yds/c;->onDestroy()V

    iput-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->m:Lcom/fodlam/yds/utility/b;

    iput-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Lcom/fodlam/yds/c;->onResume()V

    invoke-static {}, Lcom/google/firebase/database/f;->a()Lcom/google/firebase/database/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/firebase/database/f;->a()Lcom/google/firebase/database/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/database/f;->c()V

    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "CurrentItem"

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "wordlearninglist"

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    iget-object v1, v1, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Lcom/fodlam/yds/c;->onStop()V

    invoke-static {}, Lcom/google/firebase/database/f;->a()Lcom/google/firebase/database/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/firebase/database/f;->a()Lcom/google/firebase/database/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/database/f;->d()V

    :cond_0
    return-void
.end method

.method public showPopupMenu(Landroid/view/View;)V
    .locals 7

    const/4 v0, 0x0

    new-instance v1, Landroid/widget/PopupMenu;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    array-length v3, v2

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    const-string v5, "mPopup"

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual {v4, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "setForceShowIcon"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v2, 0x7f110003

    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    new-instance v0, Lcom/fodlam/yds/WordLearningActivity$3;

    invoke-direct {v0, p0}, Lcom/fodlam/yds/WordLearningActivity$3;-><init>(Lcom/fodlam/yds/WordLearningActivity;)V

    invoke-virtual {v1, v0}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    invoke-virtual {v1}, Landroid/widget/PopupMenu;->show()V

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method
