.class public Lcom/pinarsu/siparis/ui/activity/SurveyActivity;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity;
.source "SurveyActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IClickListener;
.implements Lcom/pinarsu/siparis/interfaces/IDismissListener;
.implements Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# instance fields
.field indicator:Lcom/pinarsu/siparis/view/ViewPagerIndicator;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f4
    .end annotation
.end field

.field public list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SORULAR;",
            ">;"
        }
    .end annotation
.end field

.field parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

.field public size:I

.field tvProgress:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f1
    .end annotation
.end field

.field tvTotalSize:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f2
    .end annotation
.end field

.field viewPager:Landroid/support/v4/view/ViewPager;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f3
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    return-void
.end method

.method private setView()V
    .locals 3

    .prologue
    .line 64
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->list:Ljava/util/List;

    .line 65
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->size:I

    .line 66
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->tvTotalSize:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " / "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->size:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    new-instance v0, Lcom/pinarsu/siparis/adapter/SurveyViewPagerAdapter;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->list:Ljava/util/List;

    invoke-direct {v0, v1, v2, p0}, Lcom/pinarsu/siparis/adapter/SurveyViewPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IClickListener;)V

    .line 69
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/ac;)V

    .line 70
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->indicator:Lcom/pinarsu/siparis/view/ViewPagerIndicator;

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->setDelegatePageSelectionListener(Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;)V

    .line 71
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->indicator:Lcom/pinarsu/siparis/view/ViewPagerIndicator;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 72
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->bringToFront()V

    .line 73
    return-void
.end method


# virtual methods
.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 77
    const v0, 0x7f03002c

    return v0
.end method

.method public onClickListener(I)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 99
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->size:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_3

    .line 101
    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SURVEY_SAVE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v3, v0}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 102
    iget-object v0, v3, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "ANKET_ID  "

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    iget-wide v6, v6, Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;->ANKET_ID:J

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    new-instance v4, Lorg/b/a/h;

    const-string v0, ""

    const-string v1, "CEVAPLAR"

    invoke-direct {v4, v0, v1}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SORULAR;

    .line 107
    new-instance v6, Lorg/b/a/h;

    const-string v1, ""

    const-string v7, "item"

    invoke-direct {v6, v1, v7}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const-string v1, "SORU_ID"

    iget-wide v8, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->SORU_ID:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v6, v1, v7}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 110
    const-string v1, "CEVAP_METNI"

    iget-object v7, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->CEVAP_METNI:Ljava/lang/String;

    invoke-virtual {v6, v1, v7}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 111
    new-instance v7, Lorg/b/a/h;

    const-string v1, ""

    const-string v8, "CEVAP_SECENEKLERI"

    invoke-direct {v7, v1, v8}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->answerObjectList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v1, v2

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/SurveyAnswer;

    .line 114
    iget-boolean v9, v0, Lcom/pinarsu/siparis/model/SurveyAnswer;->isChecked:Z

    if-eqz v9, :cond_4

    .line 115
    const-string v9, "item"

    iget-object v0, v0, Lcom/pinarsu/siparis/model/SurveyAnswer;->answer:Ljava/lang/String;

    invoke-virtual {v7, v9, v0}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 116
    add-int/lit8 v0, v1, 0x1

    :goto_2
    move v1, v0

    .line 118
    goto :goto_1

    .line 119
    :cond_0
    if-nez v1, :cond_1

    .line 120
    const-string v0, "L\u00fctfen t\u00fcm anket sorular\u0131n\u0131 cevaplay\u0131n\u0131z."

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 134
    :goto_3
    return-void

    .line 123
    :cond_1
    const-string v0, "MNTTAG"

    invoke-virtual {v7}, Lorg/b/a/h;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    invoke-virtual {v6, v7}, Lorg/b/a/h;->a(Lorg/b/a/h;)Lorg/b/a/h;

    .line 125
    invoke-virtual {v4, v6}, Lorg/b/a/h;->a(Lorg/b/a/h;)Lorg/b/a/h;

    goto :goto_0

    .line 127
    :cond_2
    iget-object v0, v3, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v5, ""

    invoke-direct {v1, v5, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Lorg/b/a/h;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    iget-object v0, v3, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "TELEFON_NO "

    sget-object v5, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v1, v4, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 130
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    invoke-direct {v1, v0, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v0, v2, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 133
    :goto_4
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPageSelected   : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    .line 132
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_4

    :cond_4
    move v0, v1

    goto :goto_2
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 55
    const-string v0, "M\u00fc\u015fteri Anketi"

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->setTitle(Ljava/lang/String;)V

    .line 56
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 58
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 59
    const-string v1, "parent"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->parent:Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    .line 60
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->setView()V

    .line 61
    return-void
.end method

.method public onDismissListener(I)V
    .locals 0

    .prologue
    .line 138
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->finish()V

    .line 139
    return-void
.end method

.method public onPageSelected(I)V
    .locals 4

    .prologue
    .line 91
    add-int/lit8 v0, p1, 0x1

    .line 92
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->tvProgress:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPageSelected   : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    return-void
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 2

    .prologue
    .line 82
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_0

    .line 83
    const-string v0, "Anket ba\u015far\u0131yla g\u00f6nderildi."

    const/4 v1, 0x0

    invoke-static {p0, v0, p0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V

    .line 87
    :goto_0
    return-void

    .line 85
    :cond_0
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method
