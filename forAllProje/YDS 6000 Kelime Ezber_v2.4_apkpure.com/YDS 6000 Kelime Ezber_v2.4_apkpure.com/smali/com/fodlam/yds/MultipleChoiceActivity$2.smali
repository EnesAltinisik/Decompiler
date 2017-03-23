.class Lcom/fodlam/yds/MultipleChoiceActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/MultipleChoiceActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/fodlam/yds/MultipleChoiceActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/MultipleChoiceActivity;I)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/MultipleChoiceActivity$2;->b:Lcom/fodlam/yds/MultipleChoiceActivity;

    iput p2, p0, Lcom/fodlam/yds/MultipleChoiceActivity$2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/fodlam/yds/MultipleChoiceActivity$2;->b:Lcom/fodlam/yds/MultipleChoiceActivity;

    iget-object v0, v0, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/fodlam/yds/MultipleChoiceActivity$2;->b:Lcom/fodlam/yds/MultipleChoiceActivity;

    iget-object v1, v1, Lcom/fodlam/yds/MultipleChoiceActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/fodlam/yds/MultipleChoiceActivity$2;->a:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    return-void
.end method
