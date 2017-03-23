.class public Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;
.super Ljava/lang/Object;
.source "Order3Fragment$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;Ljava/lang/Object;)V
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
    const v6, 0x7f0d0112

    const v5, 0x7f0d0111

    const v4, 0x7f0d0110

    const v3, 0x7f0d00df

    const v2, 0x7f0d00ac

    .line 11
    const-string v0, "field \'imNow\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'imNow\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->imNow:Landroid/widget/ImageView;

    .line 13
    const-string v0, "field \'imSelectCalendar\'"

    invoke-virtual {p1, p3, v6, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 14
    const-string v1, "field \'imSelectCalendar\'"

    invoke-virtual {p1, v0, v6, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->imSelectCalendar:Landroid/widget/ImageView;

    .line 15
    const-string v0, "field \'tvSelectedDate\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 16
    const-string v1, "field \'tvSelectedDate\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvSelectedDate:Landroid/widget/TextView;

    .line 17
    const-string v0, "field \'tvToday\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 18
    const-string v1, "field \'tvToday\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvToday:Landroid/widget/TextView;

    .line 19
    const-string v0, "field \'tvAmount\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 20
    const-string v1, "field \'tvAmount\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvAmount:Landroid/widget/TextView;

    .line 21
    const v0, 0x7f0d0113

    const-string v1, "field \'edOrderNote\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 22
    const v1, 0x7f0d0113

    const-string v2, "field \'edOrderNote\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->edOrderNote:Lcom/pinarsu/siparis/view/EditText;

    .line 23
    const v0, 0x7f0d0115

    const-string v1, "field \'tvCampaignInfo\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 24
    const v1, 0x7f0d0115

    const-string v2, "field \'tvCampaignInfo\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvCampaignInfo:Landroid/widget/TextView;

    .line 25
    const v0, 0x7f0d0116

    const-string v1, "field \'tvWarning\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 26
    const v1, 0x7f0d0116

    const-string v2, "field \'tvWarning\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvWarning:Landroid/widget/TextView;

    .line 27
    const v0, 0x7f0d0114

    const-string v1, "field \'linearCampaigns\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 28
    const v1, 0x7f0d0114

    const-string v2, "field \'linearCampaigns\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->linearCampaigns:Landroid/widget/LinearLayout;

    .line 29
    const v0, 0x7f0d010f

    const-string v1, "method \'clickNow\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 30
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    const v0, 0x7f0d00ab

    const-string v1, "method \'clickSelectCalendar\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 39
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    const v0, 0x7f0d0117

    const-string v1, "method \'clickGiveOrder\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 48
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$3;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$3;-><init>(Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 59
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->imNow:Landroid/widget/ImageView;

    .line 60
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->imSelectCalendar:Landroid/widget/ImageView;

    .line 61
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvSelectedDate:Landroid/widget/TextView;

    .line 62
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvToday:Landroid/widget/TextView;

    .line 63
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvAmount:Landroid/widget/TextView;

    .line 64
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->edOrderNote:Lcom/pinarsu/siparis/view/EditText;

    .line 65
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvCampaignInfo:Landroid/widget/TextView;

    .line 66
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvWarning:Landroid/widget/TextView;

    .line 67
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->linearCampaigns:Landroid/widget/LinearLayout;

    .line 68
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;)V

    return-void
.end method
