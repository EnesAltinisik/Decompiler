.class public Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "InternetConnectionDialogFragment.java"


# instance fields
.field delegate:Lcom/pinarsu/siparis/interfaces/IDismissListener;

.field private message:Ljava/lang/String;

.field private requestCode:I

.field tvMessage:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00de
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->requestCode:I

    .line 38
    const-string v0, ""

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->message:Ljava/lang/String;

    return-void
.end method

.method private newInstance(Lcom/pinarsu/siparis/interfaces/IDismissListener;Ljava/lang/String;I)Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;
    .locals 3

    .prologue
    .line 41
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;-><init>()V

    .line 42
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 44
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 45
    const-string v2, "message"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v2, "requestCode"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 47
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 48
    return-object v0
.end method

.method public static show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDismissListener;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 106
    :try_start_0
    invoke-virtual {p0}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 107
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;

    invoke-direct {v1}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;-><init>()V

    .line 108
    invoke-direct {v1, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->newInstance(Lcom/pinarsu/siparis/interfaces/IDismissListener;Ljava/lang/String;I)Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;

    move-result-object v1

    .line 109
    const-string v2, "dialog"

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :goto_0
    return-void

    .line 110
    :catch_0
    move-exception v0

    .line 111
    const-string v0, "MNTTAG"

    const-string v1, "progressDialogFragment.dismiss() error"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
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
    .line 53
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->dismiss()V

    .line 54
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 73
    new-instance v1, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 75
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 76
    const v0, 0x7f03003d

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 77
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 80
    invoke-static {p0, v1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/app/Dialog;)V

    .line 81
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 82
    const-string v0, "delegate"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/interfaces/IDismissListener;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDismissListener;

    .line 83
    const-string v0, "message"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->message:Ljava/lang/String;

    .line 84
    const-string v0, "requestCode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->requestCode:I

    .line 87
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->tvMessage:Lcom/pinarsu/siparis/view/TextView;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->message:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    return-object v1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 65
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 66
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDismissListener;

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDismissListener;

    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->requestCode:I

    invoke-interface {v0, v1}, Lcom/pinarsu/siparis/interfaces/IDismissListener;->onDismissListener(I)V

    .line 68
    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 125
    return-void
.end method
