.class public Lcom/fodlam/yds/SearchResultsActivity;
.super Landroid/support/v7/app/e;


# instance fields
.field m:Z

.field n:Landroid/view/Menu;

.field private o:Landroid/support/v7/widget/RecyclerView;

.field private p:Lcom/fodlam/yds/a/f;

.field private q:Landroid/support/v7/widget/LinearLayoutManager;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->m:Z

    return-void
.end method

.method static synthetic a(Lcom/fodlam/yds/SearchResultsActivity;)Lcom/fodlam/yds/a/f;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->p:Lcom/fodlam/yds/a/f;

    return-object v0
.end method

.method static synthetic b(Lcom/fodlam/yds/SearchResultsActivity;)Landroid/support/v7/widget/LinearLayoutManager;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->q:Landroid/support/v7/widget/LinearLayoutManager;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040025

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/SearchResultsActivity;->setContentView(I)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/SearchResultsActivity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f100130

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->o:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->o:Landroid/support/v7/widget/RecyclerView;

    const v1, 0x7f020058

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->o:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->q:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->o:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity;->q:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$h;)V

    new-instance v0, Lcom/fodlam/yds/a/f;

    invoke-direct {v0, p0}, Lcom/fodlam/yds/a/f;-><init>(Lcom/fodlam/yds/SearchResultsActivity;)V

    iput-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->p:Lcom/fodlam/yds/a/f;

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->o:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity;->p:Lcom/fodlam/yds/a/f;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$a;)V

    const v0, 0x7f100131

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arlib/floatingsearchview/FloatingSearchView;

    new-instance v1, Lcom/fodlam/yds/SearchResultsActivity$1;

    invoke-direct {v1, p0, v0}, Lcom/fodlam/yds/SearchResultsActivity$1;-><init>(Lcom/fodlam/yds/SearchResultsActivity;Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setOnQueryChangeListener(Lcom/arlib/floatingsearchview/FloatingSearchView$f;)V

    new-instance v1, Lcom/fodlam/yds/SearchResultsActivity$2;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/SearchResultsActivity$2;-><init>(Lcom/fodlam/yds/SearchResultsActivity;)V

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setOnSearchListener(Lcom/arlib/floatingsearchview/FloatingSearchView$g;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/fodlam/yds/SearchResultsActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f110004

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    iput-object p1, p0, Lcom/fodlam/yds/SearchResultsActivity;->n:Landroid/view/Menu;

    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->j()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    iput-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity;->n:Landroid/view/Menu;

    iput-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity;->o:Landroid/support/v7/widget/RecyclerView;

    iput-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity;->p:Lcom/fodlam/yds/a/f;

    iput-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity;->q:Landroid/support/v7/widget/LinearLayoutManager;

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 5

    const v4, 0x7f100212

    const v3, 0x7f100210

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f100211

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->n:Landroid/view/Menu;

    invoke-interface {v0, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity;->n:Landroid/view/Menu;

    invoke-interface {v1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fodlam/yds/SearchResultsActivity;->n:Landroid/view/Menu;

    invoke-interface {v2, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    iget-object v1, p0, Lcom/fodlam/yds/SearchResultsActivity;->n:Landroid/view/Menu;

    invoke-interface {v1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "t"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/fodlam/yds/SearchResultsActivity;->m:Z

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
