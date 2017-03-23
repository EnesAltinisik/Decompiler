.class public Lcom/fodlam/yds/NewsMessagesActivity;
.super Landroid/support/v7/app/e;


# instance fields
.field private m:Landroid/support/v7/widget/RecyclerView;

.field private n:Landroid/support/v7/widget/RecyclerView$a;

.field private o:Landroid/support/v7/widget/RecyclerView$h;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040024

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/NewsMessagesActivity;->setContentView(I)V

    const v0, 0x7f090364

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/NewsMessagesActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/NewsMessagesActivity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f100130

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/NewsMessagesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->m:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->m:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->m:Landroid/support/v7/widget/RecyclerView;

    const v1, 0x7f020058

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setBackgroundResource(I)V

    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->o:Landroid/support/v7/widget/RecyclerView$h;

    iget-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->m:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/fodlam/yds/NewsMessagesActivity;->o:Landroid/support/v7/widget/RecyclerView$h;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$h;)V

    new-instance v0, Lcom/fodlam/yds/a/e;

    invoke-direct {v0, p0}, Lcom/fodlam/yds/a/e;-><init>(Lcom/fodlam/yds/NewsMessagesActivity;)V

    iput-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->n:Landroid/support/v7/widget/RecyclerView$a;

    iget-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->m:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/fodlam/yds/NewsMessagesActivity;->n:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$a;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    iput-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->m:Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->n:Landroid/support/v7/widget/RecyclerView$a;

    iput-object v0, p0, Lcom/fodlam/yds/NewsMessagesActivity;->o:Landroid/support/v7/widget/RecyclerView$h;

    return-void
.end method
