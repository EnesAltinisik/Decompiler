.class public Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "DeliveryHoursActivity$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;Ljava/lang/Object;)V
    .locals 7
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
    const v6, 0x7f0d0157

    const v5, 0x7f0d0156

    const v4, 0x7f0d00e3

    const v3, 0x7f0d00b5

    const v2, 0x7f0d00b1

    .line 11
    const-string v0, "field \'lv\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'lv\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->lv:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    .line 13
    const-string v0, "field \'imBack\' and method \'clickBack\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 14
    const-string v1, "field \'imBack\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imBack:Landroid/widget/ImageView;

    .line 15
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    const-string v0, "field \'imLeftMenu\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 24
    const-string v1, "field \'imLeftMenu\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imLeftMenu:Landroid/widget/ImageView;

    .line 25
    const-string v0, "field \'imLogo\'"

    invoke-virtual {p1, p3, v6, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 26
    const-string v1, "field \'imLogo\'"

    invoke-virtual {p1, v0, v6, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imLogo:Landroid/widget/ImageView;

    .line 27
    const-string v0, "field \'tvTitle\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 28
    const-string v1, "field \'tvTitle\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    .line 29
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 32
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->lv:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    .line 33
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imBack:Landroid/widget/ImageView;

    .line 34
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imLeftMenu:Landroid/widget/ImageView;

    .line 35
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imLogo:Landroid/widget/ImageView;

    .line 36
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    .line 37
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;)V

    return-void
.end method
