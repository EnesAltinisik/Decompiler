.class public Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "AnnouncementsAndNewsFragment$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;Ljava/lang/Object;)V
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
    const v3, 0x7f0d0104

    const v2, 0x7f0d00b5

    .line 11
    const-string v0, "field \'lv\' and method \'onItemClickLV\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'lv\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->lv:Landroid/widget/ListView;

    .line 13
    check-cast v0, Landroid/widget/AdapterView;

    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 24
    const-string v0, "field \'tvNoRecord\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 25
    const-string v1, "field \'tvNoRecord\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->tvNoRecord:Landroid/widget/TextView;

    .line 26
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 29
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->lv:Landroid/widget/ListView;

    .line 30
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->tvNoRecord:Landroid/widget/TextView;

    .line 31
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;)V

    return-void
.end method
