.class public Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "ProgressDialogFragment.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance()Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;
    .locals 2

    .prologue
    .line 27
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;-><init>()V

    .line 28
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->setCancelable(Z)V

    .line 29
    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 34
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 36
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 37
    const v1, 0x7f03003e

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 38
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 40
    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/app/Dialog;)V

    .line 42
    return-object v0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 55
    return-void
.end method

.method public show(Landroid/support/v7/app/AppCompatActivity;)V
    .locals 2

    .prologue
    .line 47
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 48
    const-string v1, "ProgressDialogFragment"

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 50
    return-void
.end method
