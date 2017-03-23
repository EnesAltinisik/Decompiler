.class public Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;
.super Landroid/support/v4/app/Fragment;
.source "Order3Fragment.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IBackPressed;
.implements Lcom/pinarsu/siparis/interfaces/IDatePickerListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field private ARALIK_ID:Ljava/lang/String;

.field private activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

.field private day:I

.field edOrderNote:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0113
    .end annotation
.end field

.field imNow:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0110
    .end annotation
.end field

.field imSelectCalendar:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0112
    .end annotation
.end field

.field private isToday:Z

.field linearCampaigns:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0114
    .end annotation
.end field

.field private month:I

.field private productList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MALZEMELER;",
            ">;"
        }
    .end annotation
.end field

.field private resources:Landroid/content/res/Resources;

.field private siparisTutariParent:Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;

.field private thisDay:I

.field private thisMonth:I

.field private thisYear:I

.field tvAmount:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00df
    .end annotation
.end field

.field tvCampaignInfo:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0115
    .end annotation
.end field

.field tvSelectedDate:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ac
    .end annotation
.end field

.field tvToday:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0111
    .end annotation
.end field

.field tvWarning:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0116
    .end annotation
.end field

.field private year:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 88
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->isToday:Z

    .line 61
    return-void
.end method

.method private setView()V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 348
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->siparisTutariParent:Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;->TUTAR:Ljava/lang/String;

    .line 349
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 350
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 351
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvAmount:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Tutar: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " TL"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 356
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->siparisTutariParent:Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;->KAMPANYA_BILGISI:Ljava/lang/String;

    .line 357
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 358
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->linearCampaigns:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 359
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvCampaignInfo:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 364
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->siparisTutariParent:Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;->UCRET_NOTU:Ljava/lang/String;

    .line 365
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 366
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvWarning:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 367
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvWarning:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "*"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 372
    :goto_2
    return-void

    .line 353
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvAmount:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 354
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 361
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->linearCampaigns:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 370
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvWarning:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method


# virtual methods
.method clickGiveOrder()V
    .locals 11
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0117
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v10, 0x0

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->day:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->month:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->year:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 200
    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYDATE:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v0, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateTime(Ljava/lang/String;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/util/Calendar;

    move-result-object v0

    .line 201
    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYDATE:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v1, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateTime(Ljava/lang/String;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/util/Calendar;

    move-result-object v1

    .line 202
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 203
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    .line 204
    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    .line 205
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-string v1, "Ge\u00e7mi\u015f tarihe sipari\u015f veremezsiniz."

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 249
    :goto_0
    return-void

    .line 207
    :cond_0
    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    .line 208
    iput-boolean v5, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->isToday:Z

    .line 210
    :cond_1
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    .line 212
    iget v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->month:I

    add-int/lit8 v0, v0, 0x1

    .line 213
    const-string v1, "%02d"

    new-array v3, v5, [Ljava/lang/Object;

    iget v4, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->day:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v10

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 214
    const-string v3, "%02d"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v10

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 215
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->year:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "-"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 220
    const-string v0, ""

    .line 221
    iget-boolean v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->isToday:Z

    if-eqz v1, :cond_2

    .line 222
    const-string v1, ""

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->ARALIK_ID:Ljava/lang/String;

    move-object v1, v0

    .line 227
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->edOrderNote:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 228
    new-instance v5, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->GIVE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v5, v0}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 229
    iget-object v0, v5, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v6, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v7, "BAYI_NO  "

    invoke-direct {v6, v7, v2}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    new-instance v2, Lorg/b/a/h;

    const-string v0, ""

    const-string v6, "SIPARISLER"

    invoke-direct {v2, v0, v6}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->productList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 234
    new-instance v7, Lorg/b/a/h;

    const-string v8, ""

    const-string v9, "item"

    invoke-direct {v7, v8, v9}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    const-string v8, "MALZEME"

    iget-object v9, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 236
    const-string v8, "ADET"

    iget v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v8, v0}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 237
    const-string v0, "TARIH"

    invoke-virtual {v7, v0, v3}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 238
    const-string v0, "ARALIK_ID"

    iget-object v8, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->ARALIK_ID:Ljava/lang/String;

    invoke-virtual {v7, v0, v8}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 239
    const-string v0, "ILERI_TARIHLI"

    invoke-virtual {v7, v0, v1}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 240
    const-string v0, "ACIKLAMA"

    invoke-virtual {v7, v0, v4}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 241
    const-string v0, "SIPARIS_KANALI"

    const-string v8, "5"

    invoke-virtual {v7, v0, v8}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 242
    invoke-virtual {v2, v7}, Lorg/b/a/h;->a(Lorg/b/a/h;)Lorg/b/a/h;

    goto :goto_2

    .line 224
    :cond_2
    const-string v0, "X"

    move-object v1, v0

    goto :goto_1

    .line 244
    :cond_3
    iget-object v0, v5, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, ""

    invoke-direct {v1, v3, v2}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Lorg/b/a/h;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    iget-object v0, v5, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v2, "TELEFON_NO "

    sget-object v3, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 247
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-direct {v1, v0, v5, v2}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v0, v10, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0
.end method

.method clickNow()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d010f
        }
    .end annotation

    .prologue
    .line 160
    iget v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisDay:I

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->day:I

    .line 161
    iget v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisMonth:I

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->month:I

    .line 162
    iget v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisYear:I

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->year:I

    .line 163
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->isToday:Z

    .line 164
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->imNow:Landroid/widget/ImageView;

    const v1, 0x7f020065

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 165
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->imSelectCalendar:Landroid/widget/ImageView;

    const v1, 0x7f020069

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 166
    return-void
.end method

.method clickSelectCalendar()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00ab
        }
    .end annotation

    .prologue
    .line 170
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->deliveryList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->deliveryList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 172
    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 173
    const-string v2, "deliveryList"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->deliveryList:Ljava/util/List;

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 174
    const/16 v0, 0x6f

    invoke-virtual {p0, v1, v0}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 178
    :goto_0
    return-void

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-string v1, "Teslimat saati bulunamad\u0131."

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .prologue
    .line 311
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 312
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 313
    const/16 v0, 0x6f

    if-ne p1, v0, :cond_0

    .line 314
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->isToday:Z

    .line 315
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->imNow:Landroid/widget/ImageView;

    const v1, 0x7f020069

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 316
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->imSelectCalendar:Landroid/widget/ImageView;

    const v1, 0x7f020065

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 317
    const-string v0, "deliveryHours"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;

    .line 318
    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->ARALIK_ID:Ljava/lang/String;

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->ARALIK_ID:Ljava/lang/String;

    .line 319
    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->TARIH:Ljava/lang/String;

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v1, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateTime(Ljava/lang/String;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/util/Calendar;

    move-result-object v1

    .line 320
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iput v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->year:I

    .line 321
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iput v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->month:I

    .line 322
    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->day:I

    .line 325
    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->BASLANGIC_SAATI:Ljava/lang/String;

    invoke-static {v1}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getHourMinute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 326
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->BITIS_SAATI:Ljava/lang/String;

    invoke-static {v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getHourMinute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 327
    iget-object v3, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->TARIH:Ljava/lang/String;

    sget-object v4, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v3, v4}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateWithMonthName(Ljava/lang/String;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/lang/String;

    move-result-object v3

    .line 328
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " - "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 330
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvSelectedDate:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "year : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->year:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 332
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "month : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->month:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 333
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "day : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->day:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 334
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ARALIK_ID : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->ARALIK_ID:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 337
    :cond_0
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 149
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 150
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 305
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER2:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    .line 306
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 101
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 102
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    .line 103
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->resources:Landroid/content/res/Resources;

    .line 104
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productList:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->productList:Ljava/util/List;

    .line 105
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 111
    const v0, 0x7f030047

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 112
    return-object v0
.end method

.method public onDateSet(III)V
    .locals 4

    .prologue
    .line 183
    iput p1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->year:I

    .line 184
    iput p2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->month:I

    .line 185
    iput p3, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->day:I

    .line 186
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 188
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/pinarsu/siparis/tools/DateTimeTool;->MONTHS:[Ljava/lang/String;

    aget-object v1, v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 189
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvSelectedDate:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "year : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "month : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "day : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    return-void
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 154
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 155
    return-void
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 5

    .prologue
    .line 253
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_4

    .line 254
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->GIVE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_1

    .line 255
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 256
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;

    .line 257
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;->SONUC:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;->SONUC:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 258
    :cond_0
    const/4 v1, 0x1

    sput-boolean v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->IS_ORDER_SUMMARY_CHANGED:Z

    .line 259
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 260
    const-string v2, "amount"

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string v2, "BASARILI_SONUC_MESAJI"

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;->BASARILI_SONUC_MESAJI:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-class v4, Lcom/pinarsu/siparis/ui/activity/Order4Activity;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->startActivity(Landroid/content/Intent;)V

    .line 263
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->finish()V

    .line 301
    :cond_1
    :goto_0
    return-void

    .line 265
    :cond_2
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;->SONUC:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 267
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-string v1, "Sipari\u015f Kaydedilemedi"

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 297
    :cond_4
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v1, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v1, v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 143
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 144
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->setDelegateIBackPressed(Lcom/pinarsu/siparis/interfaces/IBackPressed;)V

    .line 145
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 117
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 118
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 120
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 121
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisYear:I

    .line 122
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisMonth:I

    .line 123
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisDay:I

    .line 125
    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisYear:I

    iput v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->year:I

    .line 126
    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisMonth:I

    iput v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->month:I

    .line 127
    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->thisDay:I

    iput v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->day:I

    .line 129
    const-string v1, "%02d"

    new-array v2, v4, [Ljava/lang/Object;

    const/16 v3, 0xb

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 130
    const-string v2, "%02d"

    new-array v3, v4, [Ljava/lang/Object;

    const/16 v4, 0xc

    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 133
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->tvToday:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->resources:Landroid/content/res/Resources;

    const v4, 0x7f0600b7

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 136
    const-string v1, "SIPARIS_TUTARI_PARENT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->siparisTutariParent:Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;

    .line 137
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->setView()V

    .line 139
    return-void
.end method
