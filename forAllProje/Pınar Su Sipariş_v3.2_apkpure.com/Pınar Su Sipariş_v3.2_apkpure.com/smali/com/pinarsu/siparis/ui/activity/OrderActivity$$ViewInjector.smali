.class public Lcom/pinarsu/siparis/ui/activity/OrderActivity$$ViewInjector;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;
.source "OrderActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/OrderActivity;",
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
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/OrderActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/OrderActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/OrderActivity;Ljava/lang/Object;)V
    .locals 5
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
    const v4, 0x7f0d015e

    const v3, 0x7f0d015d

    const v2, 0x7f0d015c

    .line 9
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/BaseActivity;Ljava/lang/Object;)V

    .line 12
    const-string v0, "field \'tvStep1\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 13
    const-string v1, "field \'tvStep1\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    .line 14
    const-string v0, "field \'tvStep2\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 15
    const-string v1, "field \'tvStep2\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    .line 16
    const-string v0, "field \'tvStep3\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 17
    const-string v1, "field \'tvStep3\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    .line 18
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/OrderActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/OrderActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/OrderActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/OrderActivity;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/OrderActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 21
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V

    .line 23
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    .line 24
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    .line 25
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    .line 26
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/OrderActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/OrderActivity;)V

    return-void
.end method
