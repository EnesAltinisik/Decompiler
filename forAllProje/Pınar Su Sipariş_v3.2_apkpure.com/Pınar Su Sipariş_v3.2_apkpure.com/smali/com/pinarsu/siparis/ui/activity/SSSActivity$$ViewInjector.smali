.class public Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "SSSActivity$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/SSSActivity;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/SSSActivity;Ljava/lang/Object;)V
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
    const v6, 0x7f0d00eb

    const v5, 0x7f0d00ea

    const v4, 0x7f0d00e9

    const v2, 0x7f0d00e3

    const v3, 0x7f0d00b1

    .line 11
    const-string v0, "field \'imBack\' and method \'clickBack\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'imBack\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imBack:Landroid/widget/ImageView;

    .line 13
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SSSActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    const v0, 0x7f0d0156

    const-string v1, "field \'imLeftMenu\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 22
    const v1, 0x7f0d0156

    const-string v2, "field \'imLeftMenu\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imLeftMenu:Landroid/widget/ImageView;

    .line 23
    const v0, 0x7f0d0157

    const-string v1, "field \'imLogo\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 24
    const v1, 0x7f0d0157

    const-string v2, "field \'imLogo\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imLogo:Landroid/widget/ImageView;

    .line 25
    const-string v0, "field \'tvTitle\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 26
    const-string v1, "field \'tvTitle\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    .line 27
    const v0, 0x7f0d00ec

    const-string v1, "field \'webView1\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 28
    const v1, 0x7f0d00ec

    const-string v2, "field \'webView1\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView1:Landroid/webkit/WebView;

    .line 29
    const v0, 0x7f0d00f0

    const-string v1, "field \'webView2\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 30
    const v1, 0x7f0d00f0

    const-string v2, "field \'webView2\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView2:Landroid/webkit/WebView;

    .line 31
    const-string v0, "field \'linearParent1\' and method \'onClick1\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 32
    const-string v1, "field \'linearParent1\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->linearParent1:Landroid/widget/LinearLayout;

    .line 33
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SSSActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    const v0, 0x7f0d00ed

    const-string v1, "field \'linearParent2\' and method \'onClick2\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 42
    const v1, 0x7f0d00ed

    const-string v2, "field \'linearParent2\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->linearParent2:Landroid/widget/LinearLayout;

    .line 43
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$3;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$3;-><init>(Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SSSActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    const-string v0, "field \'im1\'"

    invoke-virtual {p1, p3, v6, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 52
    const-string v1, "field \'im1\'"

    invoke-virtual {p1, v0, v6, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->im1:Landroid/widget/ImageView;

    .line 53
    const v0, 0x7f0d00ef

    const-string v1, "field \'im2\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 54
    const v1, 0x7f0d00ef

    const-string v2, "field \'im2\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->im2:Landroid/widget/ImageView;

    .line 55
    const-string v0, "field \'tvTitle1\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 56
    const-string v1, "field \'tvTitle1\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle1:Lcom/pinarsu/siparis/view/TextView;

    .line 57
    const v0, 0x7f0d00ee

    const-string v1, "field \'tvTitle2\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 58
    const v1, 0x7f0d00ee

    const-string v2, "field \'tvTitle2\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle2:Lcom/pinarsu/siparis/view/TextView;

    .line 59
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/SSSActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/SSSActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/SSSActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 62
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imBack:Landroid/widget/ImageView;

    .line 63
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imLeftMenu:Landroid/widget/ImageView;

    .line 64
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imLogo:Landroid/widget/ImageView;

    .line 65
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    .line 66
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView1:Landroid/webkit/WebView;

    .line 67
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView2:Landroid/webkit/WebView;

    .line 68
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->linearParent1:Landroid/widget/LinearLayout;

    .line 69
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->linearParent2:Landroid/widget/LinearLayout;

    .line 70
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->im1:Landroid/widget/ImageView;

    .line 71
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->im2:Landroid/widget/ImageView;

    .line 72
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle1:Lcom/pinarsu/siparis/view/TextView;

    .line 73
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle2:Lcom/pinarsu/siparis/view/TextView;

    .line 74
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/SSSActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/SSSActivity;)V

    return-void
.end method
