.class Lcom/fodlam/yds/HelperActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/HelperActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/HelperActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/HelperActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/HelperActivity$1;->a:Lcom/fodlam/yds/HelperActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 2

    iget-object v1, p0, Lcom/fodlam/yds/HelperActivity$1;->a:Lcom/fodlam/yds/HelperActivity;

    iget-object v0, p0, Lcom/fodlam/yds/HelperActivity$1;->a:Lcom/fodlam/yds/HelperActivity;

    iget-object v0, v0, Lcom/fodlam/yds/HelperActivity;->m:Lcom/fodlam/yds/a/a;

    invoke-virtual {v0, p3, p4}, Lcom/fodlam/yds/a/a;->getChild(II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/a/a$a;

    invoke-static {v1, v0}, Lcom/fodlam/yds/HelperActivity;->a(Lcom/fodlam/yds/HelperActivity;Lcom/fodlam/yds/a/a$a;)V

    const/4 v0, 0x0

    return v0
.end method
