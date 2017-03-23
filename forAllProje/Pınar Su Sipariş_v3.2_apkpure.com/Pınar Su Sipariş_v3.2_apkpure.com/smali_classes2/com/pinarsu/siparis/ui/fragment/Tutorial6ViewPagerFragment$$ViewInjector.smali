.class public Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "Tutorial6ViewPagerFragment$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;Ljava/lang/Object;)V
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
    const v4, 0x7f0d011e

    const v3, 0x7f0d011d

    const v2, 0x7f0d00af

    .line 11
    const-string v0, "field \'linearParent\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'linearParent\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->linearParent:Landroid/widget/LinearLayout;

    .line 13
    const-string v0, "field \'tvTryApp\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 14
    const-string v1, "field \'tvTryApp\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->tvTryApp:Lcom/pinarsu/siparis/view/TextView;

    .line 15
    const-string v0, "field \'tvLogin\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 16
    const-string v1, "field \'tvLogin\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->tvLogin:Lcom/pinarsu/siparis/view/TextView;

    .line 17
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 20
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->linearParent:Landroid/widget/LinearLayout;

    .line 21
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->tvTryApp:Lcom/pinarsu/siparis/view/TextView;

    .line 22
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->tvLogin:Lcom/pinarsu/siparis/view/TextView;

    .line 23
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;)V

    return-void
.end method
