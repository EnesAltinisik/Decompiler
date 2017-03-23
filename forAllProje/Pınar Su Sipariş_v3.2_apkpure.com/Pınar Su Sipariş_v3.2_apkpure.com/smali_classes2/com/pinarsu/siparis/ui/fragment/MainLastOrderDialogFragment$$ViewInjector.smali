.class public Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "MainLastOrderDialogFragment$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;Ljava/lang/Object;)V
    .locals 2
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
    .line 11
    const v0, 0x7f0d00d9

    const-string v1, "method \'clickOk\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 23
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;)V

    return-void
.end method
