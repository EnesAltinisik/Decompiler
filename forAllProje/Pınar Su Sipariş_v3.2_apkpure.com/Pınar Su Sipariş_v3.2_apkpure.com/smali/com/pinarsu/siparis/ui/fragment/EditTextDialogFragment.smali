.class public Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "EditTextDialogFragment.java"


# instance fields
.field btnOk:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e0
    .end annotation
.end field

.field delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

.field edPhoneNumber:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00d5
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

.method public static newInstance(Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;)Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;
    .locals 3

    .prologue
    .line 40
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;-><init>()V

    .line 41
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 42
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 43
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 44
    return-object v0
.end method


# virtual methods
.method clickOk()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00e0
        }
    .end annotation

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->dismiss()V

    .line 50
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 81
    new-instance v1, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 83
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 84
    const v0, 0x7f03003b

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 85
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 88
    invoke-static {p0, v1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/app/Dialog;)V

    .line 89
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 92
    const-string v2, "delegate"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    .line 93
    return-object v1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    .line 56
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    if-eqz v0, :cond_3

    .line 57
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->edPhoneNumber:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 59
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xa

    if-eq v1, v2, :cond_0

    .line 60
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "Telefon numaran\u0131z\u0131 eksiksiz giriniz."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 75
    :goto_0
    return-void

    .line 63
    :cond_0
    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 64
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "Telefon numaran\u0131z\u0131 kontrol ediniz."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0

    .line 67
    :cond_1
    const-string v1, "5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 68
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "L\u00fctfen ge\u00e7erli bir cep telefonu numaras\u0131 giriniz."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0

    .line 71
    :cond_2
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;->onObject(Ljava/lang/Object;I)V

    .line 74
    :cond_3
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 103
    return-void
.end method

.method public show(Landroid/support/v7/app/AppCompatActivity;)V
    .locals 2

    .prologue
    .line 97
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 98
    const-string v1, "dialog"

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 99
    return-void
.end method
