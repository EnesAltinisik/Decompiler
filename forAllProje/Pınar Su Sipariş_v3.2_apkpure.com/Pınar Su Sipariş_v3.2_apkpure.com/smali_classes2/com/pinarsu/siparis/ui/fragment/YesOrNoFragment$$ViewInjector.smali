.class public Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "YesOrNoFragment$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;",
        ">",
        "Ljava/lang/Object;",
        "Lbutterknife/ButterKnife$Injector",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;Ljava/lang/Object;)V
    .locals 6
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
    const v5, 0x7f0d0120

    const v4, 0x7f0d011f

    const v3, 0x7f0d0101

    const v2, 0x7f0d00b1

    .line 11
    const-string v0, "field \'tvTitle\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'tvTitle\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->tvTitle:Landroid/widget/TextView;

    .line 13
    const-string v0, "field \'tvDetail\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 14
    const-string v1, "field \'tvDetail\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->tvDetail:Landroid/widget/TextView;

    .line 15
    const-string v0, "field \'btnYes\' and method \'clickEdit\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 16
    const-string v1, "field \'btnYes\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->btnYes:Landroid/widget/Button;

    .line 17
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    const-string v0, "field \'btnNo\' and method \'clickDelete\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 26
    const-string v1, "field \'btnNo\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->btnNo:Landroid/widget/Button;

    .line 27
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 38
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->tvTitle:Landroid/widget/TextView;

    .line 39
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->tvDetail:Landroid/widget/TextView;

    .line 40
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->btnYes:Landroid/widget/Button;

    .line 41
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->btnNo:Landroid/widget/Button;

    .line 42
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;)V

    return-void
.end method
