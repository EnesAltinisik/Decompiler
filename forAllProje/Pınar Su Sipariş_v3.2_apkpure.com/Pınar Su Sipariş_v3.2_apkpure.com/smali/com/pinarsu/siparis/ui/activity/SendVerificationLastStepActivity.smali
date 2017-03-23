.class public Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "SendVerificationLastStepActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IDismissListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field final SECOND_REMAINING:I

.field TOTAL_SECOND_REMAINING:I

.field X:F

.field address:Lcom/pinarsu/siparis/model/data/ADRES;

.field btnOk:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e0
    .end annotation
.end field

.field private countDownTimer:Landroid/os/CountDownTimer;

.field edVerificationCode:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e5
    .end annotation
.end field

.field homeNumber:Ljava/lang/String;

.field linearTimer:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e7
    .end annotation
.end field

.field phoneNumber:Ljava/lang/String;

.field progressAPieceWidth:F

.field progressBarWidth:I

.field remaningTime:I

.field timerProgressbar:Landroid/widget/ProgressBar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e6
    .end annotation
.end field

.field tvTimer:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e8
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 41
    const/16 v0, 0xb4

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->SECOND_REMAINING:I

    .line 43
    const v0, 0x2bf20

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->TOTAL_SECOND_REMAINING:I

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->homeNumber:Ljava/lang/String;

    .line 101
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;

    iget v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->TOTAL_SECOND_REMAINING:I

    int-to-long v2, v1

    const-wide/16 v4, 0x3e8

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;-><init>(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;JJ)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->countDownTimer:Landroid/os/CountDownTimer;

    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)Landroid/os/CountDownTimer;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->countDownTimer:Landroid/os/CountDownTimer;

    return-object v0
.end method


# virtual methods
.method clickBack()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00e3
        }
    .end annotation

    .prologue
    .line 198
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->finishActivityBack()V

    .line 199
    return-void
.end method

.method clickOk()V
    .locals 7
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00e0
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 136
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->edVerificationCode:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 147
    :goto_0
    return-void

    .line 140
    :cond_0
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->btnOk:Landroid/widget/Button;

    invoke-virtual {v1, v6}, Landroid/widget/Button;->setEnabled(Z)V

    .line 141
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 142
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v3, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->VERY_VERIFICATION_CODE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 143
    iget-object v3, v2, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v4, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v5, "DOGRULAMA_KODU"

    invoke-direct {v4, v5, v0}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    iget-object v0, v2, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "TELEFON_NO"

    iget-object v5, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->phoneNumber:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v1, v2, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v1, v6, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 146
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->edVerificationCode:Lcom/pinarsu/siparis/view/EditText;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/tools/Tools;->keyboardClose(Landroid/app/Activity;Lcom/pinarsu/siparis/view/EditText;)V

    goto :goto_0
.end method

.method finishActivityBack()V
    .locals 3

    .prologue
    .line 202
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->finish()V

    .line 203
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 204
    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string v1, "address"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 206
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->startActivity(Landroid/content/Intent;)V

    .line 207
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 192
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    .line 193
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->finishActivityBack()V

    .line 194
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 70
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    const v0, 0x7f03002a

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->setContentView(I)V

    .line 73
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 74
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 75
    const-string v1, "phoneNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->phoneNumber:Ljava/lang/String;

    .line 76
    const-string v1, "homeNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 77
    const-string v1, "homeNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->homeNumber:Ljava/lang/String;

    .line 78
    :cond_0
    const-string v1, "address"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 80
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->timerProgressbar:Landroid/widget/ProgressBar;

    const/16 v1, 0xb4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 82
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->linearTimer:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;-><init>(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 98
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 129
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 130
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->countDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->countDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 131
    :cond_0
    return-void
.end method

.method public onDismissListener(I)V
    .locals 0

    .prologue
    .line 187
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->finishActivityBack()V

    .line 188
    return-void
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 3

    .prologue
    .line 152
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->btnOk:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 153
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_2

    .line 154
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->countDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->countDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 156
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 157
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->homeNumber:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 158
    const-string v1, "homeNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    :cond_1
    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v1, "address"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 163
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->startActivity(Landroid/content/Intent;)V

    .line 177
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->finish()V

    .line 182
    :goto_0
    return-void

    .line 180
    :cond_2
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method
