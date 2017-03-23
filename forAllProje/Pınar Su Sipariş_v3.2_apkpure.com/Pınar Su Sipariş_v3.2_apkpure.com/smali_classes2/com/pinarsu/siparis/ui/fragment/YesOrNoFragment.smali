.class public Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "YesOrNoFragment.java"


# instance fields
.field btnNo:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0120
    .end annotation
.end field

.field btnYes:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d011f
    .end annotation
.end field

.field private delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

.field isYes:Ljava/lang/Boolean;

.field public mIsStateAlreadySaved:Z

.field private requestCode:I

.field tvDetail:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0101
    .end annotation
.end field

.field tvTitle:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b1
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 41
    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->mIsStateAlreadySaved:Z

    .line 42
    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->requestCode:I

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->isYes:Ljava/lang/Boolean;

    return-void
.end method

.method private static newInstance(Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;
    .locals 3

    .prologue
    .line 57
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;-><init>()V

    .line 58
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 59
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 60
    const-string v2, "title"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v2, "detail"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v2, "yesTitle"

    invoke-virtual {v1, v2, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v2, "noTitle"

    invoke-virtual {v1, v2, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v2, "requestCode"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 65
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->setArguments(Landroid/os/Bundle;)V

    .line 66
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->setCancelable(Z)V

    .line 67
    return-object v0
.end method

.method private static newInstance(Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;Ljava/lang/String;Ljava/lang/String;)Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;
    .locals 3

    .prologue
    .line 47
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;-><init>()V

    .line 48
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 49
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 50
    const-string v2, "title"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    const-string v2, "detail"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->setArguments(Landroid/os/Bundle;)V

    .line 53
    return-object v0
.end method

.method public static show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 117
    invoke-virtual {p0}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 119
    invoke-static/range {p1 .. p6}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->newInstance(Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;

    move-result-object v1

    .line 120
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->setCancelable(Z)V

    .line 121
    const-string v2, "dialog"

    invoke-virtual {v1, v0, v2}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 124
    return-void
.end method

.method public static show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 107
    invoke-virtual {p0}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 109
    invoke-static {p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->newInstance(Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;Ljava/lang/String;Ljava/lang/String;)Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;

    move-result-object v1

    .line 110
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->setCancelable(Z)V

    .line 111
    const-string v2, "dialog"

    invoke-virtual {v1, v0, v2}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 113
    return-void
.end method


# virtual methods
.method clickDelete()V
    .locals 1
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0120
        }
    .end annotation

    .prologue
    .line 144
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->isYes:Ljava/lang/Boolean;

    .line 145
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->dismiss()V

    .line 146
    return-void
.end method

.method clickEdit()V
    .locals 1
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d011f
        }
    .end annotation

    .prologue
    .line 137
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->isYes:Ljava/lang/Boolean;

    .line 138
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->dismiss()V

    .line 140
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 7

    .prologue
    .line 73
    new-instance v1, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 74
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 75
    const v0, 0x7f03004d

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 76
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 77
    invoke-static {p0, v1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/app/Dialog;)V

    .line 78
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 79
    const-string v2, "title"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 80
    const-string v3, "detail"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 81
    const-string v4, "yesTitle"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "noTitle"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 82
    const-string v4, "yesTitle"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 83
    const-string v5, "noTitle"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 84
    iget-object v6, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->btnYes:Landroid/widget/Button;

    invoke-virtual {v6, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget-object v4, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->btnNo:Landroid/widget/Button;

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 87
    :cond_0
    const-string v4, "requestCode"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 88
    const-string v4, "requestCode"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    iput v4, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->requestCode:I

    .line 91
    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 92
    iget-object v4, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    :goto_0
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->tvDetail:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    const-string v2, "delegate"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    .line 97
    return-object v1

    .line 94
    :cond_2
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->tvTitle:Landroid/widget/TextView;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    .line 129
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 130
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->isYes:Ljava/lang/Boolean;

    iget v2, p0, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->requestCode:I

    invoke-interface {v0, v1, v2}, Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;->onObject(Ljava/lang/Object;I)V

    .line 133
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 155
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onPause()V

    .line 156
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 150
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onResume()V

    .line 151
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 161
    return-void
.end method
