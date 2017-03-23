.class public Lcom/pinarsu/siparis/ui/activity/Order4Activity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "Order4Activity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# instance fields
.field private amount:Ljava/lang/String;

.field parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

.field tvAmount:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00df
    .end annotation
.end field

.field tvMessage:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00de
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->amount:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    return-void
.end method

.method private finishOrderStartSurvey()V
    .locals 3

    .prologue
    .line 82
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;->list:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 83
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "parent"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->startActivity(Landroid/content/Intent;)V

    .line 85
    :cond_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->finish()V

    .line 86
    return-void
.end method

.method private getSurveyList()V
    .locals 5

    .prologue
    .line 89
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SURVEY_SEARCH:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 90
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 93
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v2, v1, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 94
    return-void
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
    .line 73
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->finishOrderStartSurvey()V

    .line 74
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->finishOrderStartSurvey()V

    .line 79
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 47
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 49
    const v0, 0x7f030025

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->setContentView(I)V

    .line 51
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->appWillOpenUrl(Landroid/net/Uri;)V

    .line 53
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 54
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 55
    if-eqz v0, :cond_0

    const-string v1, "amount"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 56
    const-string v1, "amount"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->amount:Ljava/lang/String;

    .line 58
    :cond_0
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->amount:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 59
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->tvAmount:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->amount:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    :goto_0
    const-string v1, "BASARILI_SONUC_MESAJI"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 64
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    :cond_1
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->getSurveyList()V

    .line 67
    new-instance v0, Lcom/adjust/sdk/AdjustEvent;

    const-string v1, "7iv9kq"

    invoke-direct {v0, v1}, Lcom/adjust/sdk/AdjustEvent;-><init>(Ljava/lang/String;)V

    .line 68
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->trackEvent(Lcom/adjust/sdk/AdjustEvent;)V

    .line 69
    return-void

    .line 61
    :cond_2
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->tvAmount:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 1

    .prologue
    .line 98
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_0

    .line 99
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    .line 103
    :cond_0
    return-void
.end method
