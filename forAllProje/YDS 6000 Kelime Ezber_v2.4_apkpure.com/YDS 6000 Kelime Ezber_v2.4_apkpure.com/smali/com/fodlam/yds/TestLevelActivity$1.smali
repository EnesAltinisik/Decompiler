.class Lcom/fodlam/yds/TestLevelActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/view/ViewPager$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/TestLevelActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/badoualy/stepperindicator/StepperIndicator;

.field final synthetic b:Lcom/fodlam/yds/TestLevelActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/TestLevelActivity;Lcom/badoualy/stepperindicator/StepperIndicator;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/TestLevelActivity$1;->b:Lcom/fodlam/yds/TestLevelActivity;

    iput-object p2, p0, Lcom/fodlam/yds/TestLevelActivity$1;->a:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(IFI)V
    .locals 0

    return-void
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/TestLevelActivity$1;->a:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-virtual {v0, p1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setCurrentStep(I)V

    return-void
.end method
