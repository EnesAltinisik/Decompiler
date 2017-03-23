.class Lcom/fodlam/yds/MultipleChoiceActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/view/ViewPager$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/MultipleChoiceActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/badoualy/stepperindicator/StepperIndicator;

.field final synthetic c:Lcom/fodlam/yds/MultipleChoiceActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/MultipleChoiceActivity;Lcom/badoualy/stepperindicator/StepperIndicator;)V
    .locals 1

    iput-object p1, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->c:Lcom/fodlam/yds/MultipleChoiceActivity;

    iput-object p2, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->b:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->a:Z

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->c:Lcom/fodlam/yds/MultipleChoiceActivity;

    iget-object v1, v1, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-virtual {v1}, Lcom/fodlam/yds/a/d;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->c:Lcom/fodlam/yds/MultipleChoiceActivity;

    iget-object v2, v2, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v2

    if-ne v2, v1, :cond_0

    if-ne p1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(IFI)V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->c:Lcom/fodlam/yds/MultipleChoiceActivity;

    iget-object v0, v0, Lcom/fodlam/yds/MultipleChoiceActivity;->n:Lcom/fodlam/yds/a/d;

    invoke-virtual {v0}, Lcom/fodlam/yds/a/d;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-boolean v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->a:Z

    if-eqz v1, :cond_0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->c:Lcom/fodlam/yds/MultipleChoiceActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/MultipleChoiceActivity;->b(I)V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity$1;->b:Lcom/badoualy/stepperindicator/StepperIndicator;

    div-int/lit8 v1, p1, 0x3

    invoke-virtual {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setCurrentStep(I)V

    return-void
.end method
