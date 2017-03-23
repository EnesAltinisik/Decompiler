.class Lcom/fodlam/yds/SearchResultsActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/arlib/floatingsearchview/FloatingSearchView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/SearchResultsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/FloatingSearchView;

.field final synthetic b:Lcom/fodlam/yds/SearchResultsActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/SearchResultsActivity;Lcom/arlib/floatingsearchview/FloatingSearchView;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/SearchResultsActivity$1;->b:Lcom/fodlam/yds/SearchResultsActivity;

    iput-object p2, p0, Lcom/fodlam/yds/SearchResultsActivity$1;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity$1;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-virtual {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->c()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity$1;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-virtual {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a()V

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity$1;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    iget-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity$1;->b:Lcom/fodlam/yds/SearchResultsActivity;

    invoke-static {v1}, Lcom/fodlam/yds/SearchResultsActivity;->a(Lcom/fodlam/yds/SearchResultsActivity;)Lcom/fodlam/yds/a/f;

    move-result-object v1

    iget-object v2, p0, Lcom/fodlam/yds/SearchResultsActivity$1;->b:Lcom/fodlam/yds/SearchResultsActivity;

    iget-boolean v2, v2, Lcom/fodlam/yds/SearchResultsActivity;->m:Z

    invoke-virtual {v1, v2, p2}, Lcom/fodlam/yds/a/f;->a(ZLjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity$1;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-virtual {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b()V

    goto :goto_0
.end method
