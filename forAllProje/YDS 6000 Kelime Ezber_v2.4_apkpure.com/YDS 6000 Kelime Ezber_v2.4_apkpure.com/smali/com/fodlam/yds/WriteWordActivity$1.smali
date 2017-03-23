.class Lcom/fodlam/yds/WriteWordActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/WriteWordActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/WriteWordActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/WriteWordActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/WriteWordActivity$1;->a:Lcom/fodlam/yds/WriteWordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/WriteWordActivity$1;->a:Lcom/fodlam/yds/WriteWordActivity;

    iget-object v0, v0, Lcom/fodlam/yds/WriteWordActivity;->n:Lcom/fodlam/yds/a/k;

    iget-object v1, p0, Lcom/fodlam/yds/WriteWordActivity$1;->a:Lcom/fodlam/yds/WriteWordActivity;

    iget-object v1, v1, Lcom/fodlam/yds/WriteWordActivity;->m:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/a/k;->b(I)V

    return-void
.end method
