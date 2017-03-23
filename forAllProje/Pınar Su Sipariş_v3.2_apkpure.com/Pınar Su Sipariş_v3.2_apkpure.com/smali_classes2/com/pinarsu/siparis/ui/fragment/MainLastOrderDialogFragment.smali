.class public Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "MainLastOrderDialogFragment.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method private newInstance()Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;
    .locals 2

    .prologue
    .line 37
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;-><init>()V

    .line 38
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 40
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 41
    return-object v0
.end method

.method public static show(Landroid/support/v7/app/AppCompatActivity;I)V
    .locals 3

    .prologue
    .line 97
    invoke-virtual {p0}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 98
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;

    invoke-direct {v1}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;-><init>()V

    .line 99
    invoke-direct {v1}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;->newInstance()Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;

    move-result-object v1

    .line 100
    const-string v2, "dialog"

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 101
    return-void
.end method


# virtual methods
.method clickOk()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00d9
        }
    .end annotation

    .prologue
    .line 46
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;->dismiss()V

    .line 47
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 65
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 67
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 68
    const v1, 0x7f030078

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 69
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 72
    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/app/Dialog;)V

    .line 74
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/MainLastOrderDialogFragment;->getArguments()Landroid/os/Bundle;

    .line 92
    return-object v0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 58
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 60
    return-void
.end method
