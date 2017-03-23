.class Lcom/fodlam/yds/WordLearningActivity$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/PopupMenu$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/WordLearningActivity;->showPopupMenu(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/WordLearningActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/WordLearningActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/WordLearningActivity$3;->a:Lcom/fodlam/yds/WordLearningActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Kelime"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$3;->a:Lcom/fodlam/yds/WordLearningActivity;

    invoke-static {v0}, Lcom/fodlam/yds/WordLearningActivity;->b(Lcom/fodlam/yds/WordLearningActivity;)V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
