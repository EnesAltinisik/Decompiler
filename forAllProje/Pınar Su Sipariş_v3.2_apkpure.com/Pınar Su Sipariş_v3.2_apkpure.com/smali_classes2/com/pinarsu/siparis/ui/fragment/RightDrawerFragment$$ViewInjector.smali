.class public Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "RightDrawerFragment$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;Ljava/lang/Object;)V
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
    const v4, 0x7f0d0109

    const v3, 0x7f0d0106

    const v2, 0x7f0d00b2

    .line 11
    const-string v0, "field \'tvAddress\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'tvAddress\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->tvAddress:Lcom/pinarsu/siparis/view/TextView;

    .line 13
    const-string v0, "field \'tvLastOrder\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 14
    const-string v1, "field \'tvLastOrder\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->tvLastOrder:Lcom/pinarsu/siparis/view/TextView;

    .line 15
    const-string v0, "field \'imPopup\' and method \'clickPopup\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 16
    const-string v1, "field \'imPopup\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->imPopup:Landroid/widget/ImageView;

    .line 17
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    const v0, 0x7f0d0108

    const-string v1, "method \'clickFrameLastOrderRepeat\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 26
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    const v0, 0x7f0d0107

    const-string v1, "method \'clickBlob\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 35
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$3;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$3;-><init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 46
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->tvAddress:Lcom/pinarsu/siparis/view/TextView;

    .line 47
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->tvLastOrder:Lcom/pinarsu/siparis/view/TextView;

    .line 48
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->imPopup:Landroid/widget/ImageView;

    .line 49
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V

    return-void
.end method
