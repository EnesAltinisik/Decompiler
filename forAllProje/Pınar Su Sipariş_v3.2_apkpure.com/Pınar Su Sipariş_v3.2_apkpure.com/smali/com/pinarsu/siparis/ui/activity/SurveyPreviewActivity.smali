.class public Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "SurveyPreviewActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method fillSurvey()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00f5
        }
    .end annotation

    .prologue
    .line 37
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "parent"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    .line 38
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "parent"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;->startActivity(Landroid/content/Intent;)V

    .line 39
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;->finish()V

    .line 40
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 24
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    const v0, 0x7f03002d

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;->setContentView(I)V

    .line 27
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 28
    return-void
.end method

.method tvClose()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00f6
        }
    .end annotation

    .prologue
    .line 32
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;->finish()V

    .line 33
    return-void
.end method
