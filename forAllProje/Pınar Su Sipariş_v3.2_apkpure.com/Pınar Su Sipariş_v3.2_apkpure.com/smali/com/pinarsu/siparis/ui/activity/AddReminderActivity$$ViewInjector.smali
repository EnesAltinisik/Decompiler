.class public Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;
.source "AddReminderActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;",
        ">",
        "Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;-><init>()V

    return-void
.end method


# virtual methods
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;Ljava/lang/Object;)V
    .locals 6
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
    const v5, 0x7f0d00ae

    const v4, 0x7f0d00ad

    const v3, 0x7f0d00ac

    const v2, 0x7f0d00aa

    .line 9
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/BaseActivity;Ljava/lang/Object;)V

    .line 12
    const-string v0, "field \'tvTime\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 13
    const-string v1, "field \'tvTime\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvTime:Landroid/widget/TextView;

    .line 14
    const-string v0, "field \'tvSelectedDate\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 15
    const-string v1, "field \'tvSelectedDate\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvSelectedDate:Landroid/widget/TextView;

    .line 16
    const-string v0, "field \'edDesc\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 17
    const-string v1, "field \'edDesc\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->edDesc:Landroid/widget/EditText;

    .line 18
    const-string v0, "field \'tvAddReminder\' and method \'clickAddReminder\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 19
    const-string v1, "field \'tvAddReminder\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvAddReminder:Landroid/widget/TextView;

    .line 20
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    const v0, 0x7f0d00ab

    const-string v1, "method \'clickLinearSelectCalendar\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 29
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    const v0, 0x7f0d00a9

    const-string v1, "method \'clickLinearTime\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 38
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector$3;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector$3;-><init>(Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/BaseActivity;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 49
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V

    .line 51
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvTime:Landroid/widget/TextView;

    .line 52
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvSelectedDate:Landroid/widget/TextView;

    .line 53
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->edDesc:Landroid/widget/EditText;

    .line 54
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvAddReminder:Landroid/widget/TextView;

    .line 55
    return-void
.end method

.method public bridge synthetic reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;)V

    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;)V

    return-void
.end method
