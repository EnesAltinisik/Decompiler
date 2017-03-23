.class public Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "SendVerificationLastStepActivity$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;",
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
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;Ljava/lang/Object;)V
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
    const v6, 0x7f0d00e8

    const v5, 0x7f0d00e7

    const v4, 0x7f0d00e6

    const v3, 0x7f0d00e5

    const v2, 0x7f0d00e0

    .line 11
    const-string v0, "field \'btnOk\' and method \'clickOk\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'btnOk\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->btnOk:Landroid/widget/Button;

    .line 13
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    const-string v0, "field \'edVerificationCode\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 22
    const-string v1, "field \'edVerificationCode\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->edVerificationCode:Lcom/pinarsu/siparis/view/EditText;

    .line 23
    const-string v0, "field \'timerProgressbar\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 24
    const-string v1, "field \'timerProgressbar\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->timerProgressbar:Landroid/widget/ProgressBar;

    .line 25
    const-string v0, "field \'linearTimer\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 26
    const-string v1, "field \'linearTimer\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->linearTimer:Landroid/widget/LinearLayout;

    .line 27
    const-string v0, "field \'tvTimer\'"

    invoke-virtual {p1, p3, v6, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 28
    const-string v1, "field \'tvTimer\'"

    invoke-virtual {p1, v0, v6, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->tvTimer:Lcom/pinarsu/siparis/view/TextView;

    .line 29
    const v0, 0x7f0d00e3

    const-string v1, "method \'clickBack\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 30
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 41
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->btnOk:Landroid/widget/Button;

    .line 42
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->edVerificationCode:Lcom/pinarsu/siparis/view/EditText;

    .line 43
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->timerProgressbar:Landroid/widget/ProgressBar;

    .line 44
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->linearTimer:Landroid/widget/LinearLayout;

    .line 45
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->tvTimer:Lcom/pinarsu/siparis/view/TextView;

    .line 46
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)V

    return-void
.end method
