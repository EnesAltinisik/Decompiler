.class public Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "InfoCallAlertDialogFragment.java"


# instance fields
.field private activity:Landroid/support/v7/app/AppCompatActivity;

.field btnCall:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0103
    .end annotation
.end field

.field btnOk:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e0
    .end annotation
.end field

.field private delegate:Lcom/pinarsu/siparis/interfaces/IDismissListener;

.field private isHasPhoneNumber:Z

.field private number:Ljava/lang/String;

.field private requestCode:I

.field tvDetail:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0101
    .end annotation
.end field

.field viewGap:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0102
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method private newInstance(Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;
    .locals 3

    .prologue
    .line 51
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;-><init>()V

    .line 52
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->setCancelable(Z)V

    .line 53
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 54
    const-string v2, "message"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 57
    const-string v2, "requestCode"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 58
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 59
    return-object v0
.end method

.method public static show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 109
    invoke-virtual {p0}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 110
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;

    invoke-direct {v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 111
    invoke-direct {v1, p1, v2, v3}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->newInstance(Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;

    move-result-object v1

    .line 113
    const-string v2, "dialog"

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 116
    return-void
.end method

.method public static show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V
    .locals 3

    .prologue
    .line 120
    invoke-virtual {p0}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 121
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;

    invoke-direct {v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;-><init>()V

    .line 122
    invoke-direct {v1, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->newInstance(Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;

    move-result-object v1

    .line 123
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v4/app/DialogFragment;->setCancelable(Z)V

    .line 124
    const-string v2, "dialog"

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 126
    return-void
.end method


# virtual methods
.method clickNo()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0103
        }
    .end annotation

    .prologue
    .line 145
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->isHasPhoneNumber:Z

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->activity:Landroid/support/v7/app/AppCompatActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->number:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/tools/Tools;->callNumber(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 148
    :cond_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->dismiss()V

    .line 149
    return-void
.end method

.method clickYes()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00e0
        }
    .end annotation

    .prologue
    .line 134
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->dismiss()V

    .line 135
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDismissListener;

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDismissListener;

    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->requestCode:I

    invoke-interface {v0, v1}, Lcom/pinarsu/siparis/interfaces/IDismissListener;->onDismissListener(I)V

    .line 138
    :cond_0
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 74
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/AppCompatActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->activity:Landroid/support/v7/app/AppCompatActivity;

    .line 75
    new-instance v1, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 77
    invoke-virtual {v1, v4}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 78
    const v0, 0x7f03003c

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 79
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 82
    invoke-static {p0, v1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/app/Dialog;)V

    .line 83
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 85
    const-string v0, "delegate"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/interfaces/IDismissListener;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDismissListener;

    .line 86
    const-string v0, "requestCode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->requestCode:I

    .line 87
    const-string v0, "message"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    const-string v2, "#"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->isHasPhoneNumber:Z

    .line 91
    iget-boolean v2, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->isHasPhoneNumber:Z

    if-eqz v2, :cond_0

    .line 92
    const-string v2, "#"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 93
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->tvDetail:Landroid/widget/TextView;

    aget-object v3, v0, v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    aget-object v0, v0, v4

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->number:Ljava/lang/String;

    .line 95
    const-string v0, "MNTTAG"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->number:Ljava/lang/String;

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    :goto_0
    return-object v1

    .line 97
    :cond_0
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->tvDetail:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->btnCall:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 100
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->viewGap:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 154
    return-void
.end method
