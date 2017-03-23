.class Lcom/fodlam/yds/SearchResultsActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/arlib/floatingsearchview/FloatingSearchView$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/SearchResultsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/SearchResultsActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/SearchResultsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/SearchResultsActivity$2;->a:Lcom/fodlam/yds/SearchResultsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/arlib/floatingsearchview/a/a/a;)V
    .locals 3

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity$2;->a:Lcom/fodlam/yds/SearchResultsActivity;

    invoke-static {v0}, Lcom/fodlam/yds/SearchResultsActivity;->a(Lcom/fodlam/yds/SearchResultsActivity;)Lcom/fodlam/yds/a/f;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity$2;->a:Lcom/fodlam/yds/SearchResultsActivity;

    iget-boolean v1, v1, Lcom/fodlam/yds/SearchResultsActivity;->m:Z

    invoke-interface {p1}, Lcom/arlib/floatingsearchview/a/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fodlam/yds/a/f;->b(ZLjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity$2;->a:Lcom/fodlam/yds/SearchResultsActivity;

    invoke-static {v1}, Lcom/fodlam/yds/SearchResultsActivity;->b(Lcom/fodlam/yds/SearchResultsActivity;)Landroid/support/v7/widget/LinearLayoutManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->b(II)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
