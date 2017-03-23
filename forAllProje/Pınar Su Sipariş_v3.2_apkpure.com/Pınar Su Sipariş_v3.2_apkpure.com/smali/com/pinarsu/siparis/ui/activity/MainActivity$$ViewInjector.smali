.class public Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "MainActivity$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/MainActivity;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/MainActivity;Ljava/lang/Object;)V
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
    const v2, 0x7f0d0156

    const v6, 0x7f0d011e

    const v5, 0x7f0d00e3

    const v4, 0x7f0d00b1

    const v3, 0x7f0d00a8

    .line 11
    const-string v0, "field \'imLeftMenu\' and method \'clickImLeftMenu\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'imLeftMenu\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLeftMenu:Landroid/widget/ImageView;

    .line 13
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    const v0, 0x7f0d015a

    const-string v1, "field \'imRightMenu\' and method \'clickImRightMenu\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 22
    const v1, 0x7f0d015a

    const-string v2, "field \'imRightMenu\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imRightMenu:Landroid/widget/ImageView;

    .line 23
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    const-string v0, "field \'toolbar\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 32
    const-string v1, "field \'toolbar\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 33
    const v0, 0x7f0d0157

    const-string v1, "field \'imLogo\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 34
    const v1, 0x7f0d0157

    const-string v2, "field \'imLogo\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLogo:Landroid/widget/ImageView;

    .line 35
    const-string v0, "field \'tvTitle\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 36
    const-string v1, "field \'tvTitle\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    .line 37
    const-string v0, "field \'imBack\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 38
    const-string v1, "field \'imBack\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imBack:Landroid/widget/ImageView;

    .line 39
    const-string v0, "field \'tvLogin\' and method \'login\'"

    invoke-virtual {p1, p3, v6, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 40
    const-string v1, "field \'tvLogin\'"

    invoke-virtual {p1, v0, v6, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/pinarsu/siparis/view/TextView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvLogin:Lcom/pinarsu/siparis/view/TextView;

    .line 41
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$3;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$3;-><init>(Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    const v0, 0x7f0d010b

    const-string v1, "method \'onClick\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 50
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$4;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$4;-><init>(Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/MainActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/MainActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 61
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLeftMenu:Landroid/widget/ImageView;

    .line 62
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imRightMenu:Landroid/widget/ImageView;

    .line 63
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 64
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLogo:Landroid/widget/ImageView;

    .line 65
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    .line 66
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imBack:Landroid/widget/ImageView;

    .line 67
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvLogin:Lcom/pinarsu/siparis/view/TextView;

    .line 68
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/MainActivity;)V

    return-void
.end method
