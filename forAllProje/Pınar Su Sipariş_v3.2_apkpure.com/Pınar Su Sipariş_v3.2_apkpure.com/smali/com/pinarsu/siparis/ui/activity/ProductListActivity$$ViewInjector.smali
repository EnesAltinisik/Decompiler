.class public Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;
.source "ProductListActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/ProductListActivity;",
        ">",
        "Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/BaseActivity;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/ProductListActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/ProductListActivity;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbutterknife/ButterKnife$Finder;",
            "TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    const v3, 0x7f0d00e2

    const v2, 0x7f0d00b5

    .line 9
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/BaseActivity;Ljava/lang/Object;)V

    .line 12
    const-string v0, "field \'lv\' and method \'onItemClick\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 13
    const-string v1, "field \'lv\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->lv:Landroid/widget/ListView;

    .line 14
    check-cast v0, Landroid/widget/AdapterView;

    new-instance v1, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/ProductListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 25
    const-string v0, "field \'tvAddedAll\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 26
    const-string v1, "field \'tvAddedAll\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->tvAddedAll:Lcom/pinarsu/siparis/view/TextView;

    .line 27
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/ProductListActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/ProductListActivity;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/ProductListActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 30
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V

    .line 32
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->lv:Landroid/widget/ListView;

    .line 33
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->tvAddedAll:Lcom/pinarsu/siparis/view/TextView;

    .line 34
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/ProductListActivity;)V

    return-void
.end method
