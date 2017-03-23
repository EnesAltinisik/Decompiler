.class public Lcom/pinarsu/siparis/ui/activity/TestActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "TestActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 21
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 22
    const v0, 0x7f030076

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/TestActivity;->setContentView(I)V

    .line 24
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 26
    const-string v0, "Bu bir test verisifweewhweryhwehywerhwhwewerh werf wefwe fwef wefwefewf fewf wef wef wef wed dir.#4449333900#"

    .line 29
    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 42
    return-void
.end method
