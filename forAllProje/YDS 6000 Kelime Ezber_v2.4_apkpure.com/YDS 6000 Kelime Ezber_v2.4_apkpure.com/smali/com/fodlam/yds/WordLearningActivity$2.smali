.class Lcom/fodlam/yds/WordLearningActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/view/ViewPager$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/WordLearningActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/badoualy/stepperindicator/StepperIndicator;

.field final synthetic c:Lcom/fodlam/yds/WordLearningActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/WordLearningActivity;Lcom/badoualy/stepperindicator/StepperIndicator;)V
    .locals 1

    iput-object p1, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iput-object p2, p0, Lcom/fodlam/yds/WordLearningActivity$2;->b:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->a:Z

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iget-object v1, v1, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/h;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iget-object v2, v2, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v2

    if-ne v2, v1, :cond_0

    if-ne p1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(IFI)V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iget-object v0, v0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iget-object v0, v0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    invoke-virtual {v0}, Lcom/fodlam/yds/a/h;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-boolean v1, p0, Lcom/fodlam/yds/WordLearningActivity$2;->a:Z

    if-eqz v1, :cond_0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/WordLearningActivity;->b(I)V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->b:Lcom/badoualy/stepperindicator/StepperIndicator;

    div-int/lit8 v1, p1, 0x3

    invoke-virtual {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setCurrentStep(I)V

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iget-object v0, v0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iget-object v1, v1, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/a/h;->a(I)Lcom/fodlam/yds/f/h;

    move-result-object v0

    iget-object v1, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    iget-boolean v0, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-nez v0, :cond_1

    sget-object v0, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v0}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v0}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/fodlam/yds/f/e;->b(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    invoke-virtual {v0}, Lcom/fodlam/yds/WordLearningActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/e;)I

    :cond_0
    if-ne p1, v2, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iget-object v0, v0, Lcom/fodlam/yds/WordLearningActivity;->n:Lcom/fodlam/yds/a/h;

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    iget-object v1, v1, Lcom/fodlam/yds/WordLearningActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/a/h;->a(I)Lcom/fodlam/yds/f/h;

    move-result-object v0

    iget-boolean v1, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-eqz v1, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v1}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/fodlam/yds/f/e;->b(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/fodlam/yds/WordLearningActivity$2;->c:Lcom/fodlam/yds/WordLearningActivity;

    invoke-virtual {v1}, Lcom/fodlam/yds/WordLearningActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/e;)I

    goto :goto_0
.end method
