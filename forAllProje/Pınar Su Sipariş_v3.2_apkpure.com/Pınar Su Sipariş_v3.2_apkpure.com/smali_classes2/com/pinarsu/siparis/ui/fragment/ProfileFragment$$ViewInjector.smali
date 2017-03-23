.class public Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "ProfileFragment$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;Ljava/lang/Object;)V
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
    const v4, 0x7f0d011b

    const v3, 0x7f0d0119

    const v2, 0x7f0d0118

    .line 11
    const-string v0, "field \'linearMyRegisteredAddress\' and method \'clickMyRegisteredAddress\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'linearMyRegisteredAddress\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->linearMyRegisteredAddress:Landroid/widget/LinearLayout;

    .line 13
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    const-string v0, "field \'toggleButton\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 22
    const-string v1, "field \'toggleButton\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ToggleButton;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->toggleButton:Landroid/widget/ToggleButton;

    .line 23
    const-string v0, "field \'tvFirstLastName\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 24
    const-string v1, "field \'tvFirstLastName\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->tvFirstLastName:Landroid/widget/TextView;

    .line 25
    const v0, 0x7f0d011c

    const-string v1, "method \'clickSSS\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 26
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 37
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->linearMyRegisteredAddress:Landroid/widget/LinearLayout;

    .line 38
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->toggleButton:Landroid/widget/ToggleButton;

    .line 39
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->tvFirstLastName:Landroid/widget/TextView;

    .line 40
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)V

    return-void
.end method
