.class public Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;
.super Landroid/support/v4/app/Fragment;
.source "RightDrawerFragment.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;
.implements Lcom/pinarsu/siparis/interfaces/IDismissListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# instance fields
.field private activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

.field imPopup:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0106
    .end annotation
.end field

.field public mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

.field private mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

.field private serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

.field tvAddress:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b2
    .end annotation
.end field

.field tvLastOrder:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0109
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 49
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)Lcom/pinarsu/siparis/ui/activity/MainActivity;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    return-object v0
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)Landroid/support/v7/app/ActionBarDrawerToggle;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    return-object v0
.end method

.method private giveOrder()V
    .locals 8

    .prologue
    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 228
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastOrder:Lcom/pinarsu/siparis/model/data/SON_SIPARIS;

    .line 230
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 231
    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 232
    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 233
    const/4 v4, 0x5

    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 234
    add-int/lit8 v3, v3, 0x1

    .line 235
    const-string v4, "%02d"

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v7

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 236
    const-string v4, "%02d"

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v7

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 237
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "-"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 239
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v3, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->GIVE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 240
    iget-object v3, v2, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v4, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v5, "BAYI_NO  "

    iget-object v6, v0, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->BAYI_NO:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    new-instance v3, Lorg/b/a/h;

    const-string v4, ""

    const-string v5, "SIPARISLER"

    invoke-direct {v3, v4, v5}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    new-instance v4, Lorg/b/a/h;

    const-string v5, ""

    const-string v6, "item"

    invoke-direct {v4, v5, v6}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    const-string v5, "MALZEME"

    iget-object v6, v0, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->MALZEME_NO:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 246
    const-string v5, "ADET"

    iget v0, v0, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->MIKTAR:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 247
    const-string v0, "TARIH"

    invoke-virtual {v4, v0, v1}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 248
    const-string v0, "ARALIK_ID"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 249
    const-string v0, "ILERI_TARIHLI"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 250
    const-string v0, "ACIKLAMA"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 251
    const-string v0, "SIPARIS_KANALI"

    const-string v1, "5"

    invoke-virtual {v4, v0, v1}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 252
    invoke-virtual {v3, v4}, Lorg/b/a/h;->a(Lorg/b/a/h;)Lorg/b/a/h;

    .line 254
    iget-object v0, v2, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, ""

    invoke-direct {v1, v4, v3}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Lorg/b/a/h;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 255
    iget-object v0, v2, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO "

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v1, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 257
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v1, v0, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v0, v7, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 258
    return-void
.end method

.method private popupGiveOrder()V
    .locals 7

    .prologue
    .line 221
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/4 v2, 0x0

    const-string v3, ""

    const-string v4, "Son sipari\u015finizi tekrarlamak istedi\u011finize emin misiniz?"

    const-string v5, "\u0130ptal"

    const-string v6, "Sipari\u015f Ver"

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    return-void
.end method


# virtual methods
.method clickBlob()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0107
        }
    .end annotation

    .prologue
    .line 217
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->popupGiveOrder()V

    .line 218
    return-void
.end method

.method clickFrameLastOrderRepeat()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0108
        }
    .end annotation

    .prologue
    .line 212
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->popupGiveOrder()V

    .line 213
    return-void
.end method

.method clickPopup()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0106
        }
    .end annotation

    .prologue
    .line 278
    const/4 v0, 0x1

    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->LAST_ORDER_POPUP_VIEWED:Z

    .line 279
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 280
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->imPopup:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 281
    return-void
.end method

.method public closeRightDrawer()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->f(I)V

    .line 71
    return-void
.end method

.method public getLastOrder()V
    .locals 5

    .prologue
    .line 203
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 204
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v1, v2, v0, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 208
    return-void
.end method

.method public isDrawerOpen()Z
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->g(I)Z

    move-result v0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 80
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 81
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    .line 82
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    .line 83
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 100
    const-string v0, "MNTTAG"

    const-string v1, "RightDrawerFragment onCreateView"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    const v0, 0x7f030043

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 102
    return-object v0
.end method

.method public onDismissListener(I)V
    .locals 0

    .prologue
    .line 273
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->closeRightDrawer()V

    .line 274
    return-void
.end method

.method public onObject(Ljava/lang/Object;I)V
    .locals 4

    .prologue
    .line 262
    if-nez p1, :cond_1

    .line 269
    :cond_0
    :goto_0
    return-void

    .line 264
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 265
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    if-nez v0, :cond_0

    .line 267
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->giveOrder()V

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 143
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_7

    .line 144
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_3

    .line 145
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 147
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/SON_SIPARIS_PARENT;

    .line 149
    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/SON_SIPARIS_PARENT;->lastOrder:Lcom/pinarsu/siparis/model/data/SON_SIPARIS;

    .line 150
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iput-object v1, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastOrder:Lcom/pinarsu/siparis/model/data/SON_SIPARIS;

    .line 151
    if-eqz v1, :cond_2

    .line 152
    iget v0, v1, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->MIKTAR:I

    if-lez v0, :cond_2

    .line 154
    const-string v0, ""

    .line 155
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, v1, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->MIKTAR:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " Adet "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v1, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->MALZEME_ADI:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 156
    iget-object v3, v1, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->ADRES:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 157
    iget-object v0, v1, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->ADRES:Ljava/lang/String;

    .line 158
    :cond_0
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->tvLastOrder:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->tvAddress:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->unLockRightSideMenu(Z)V

    .line 162
    sget-boolean v0, Lcom/pinarsu/siparis/Preferences;->HOME_ORDER_POPUP_VIEWED:Z

    if-nez v0, :cond_1

    .line 164
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f0d00d9

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 165
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 166
    invoke-virtual {v0}, Landroid/widget/ImageView;->bringToFront()V

    .line 167
    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$3;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$3;-><init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    :cond_1
    :goto_0
    return-void

    .line 180
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastOrder:Lcom/pinarsu/siparis/model/data/SON_SIPARIS;

    .line 181
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lockRightSideMenu()V

    goto :goto_0

    .line 182
    :cond_3
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->GIVE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_1

    .line 183
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_6

    .line 184
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;

    .line 185
    if-eqz v0, :cond_4

    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;->SONUC:Ljava/lang/String;

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;->SONUC:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 186
    :cond_4
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v1, "Sipari\u015finiz taraf\u0131m\u0131za ula\u015ft\u0131 en yak\u0131n zamanda su teslimat\u0131n\u0131z yap\u0131lacakt\u0131r."

    invoke-static {v0, v1, p0, v4}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V

    .line 187
    new-instance v0, Lcom/adjust/sdk/AdjustEvent;

    const-string v1, "7iv9kq"

    invoke-direct {v0, v1}, Lcom/adjust/sdk/AdjustEvent;-><init>(Ljava/lang/String;)V

    .line 188
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->trackEvent(Lcom/adjust/sdk/AdjustEvent;)V

    .line 189
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getAllOrder()V

    goto :goto_0

    .line 191
    :cond_5
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Sipari\u015f Kaydedilemedi\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;->SONUC:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_6
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v1, "Sipari\u015f Kaydedilemedi"

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 196
    :cond_7
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_1

    .line 197
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lockRightSideMenu()V

    goto :goto_0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 87
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 88
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 89
    sget-boolean v0, Lcom/pinarsu/siparis/Preferences;->LAST_ORDER_POPUP_VIEWED:Z

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->imPopup:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 91
    :cond_0
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v0, :cond_1

    .line 92
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->getLastOrder()V

    .line 95
    :cond_1
    return-void
.end method

.method public openRightDrawer()V
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->e(I)V

    .line 67
    return-void
.end method

.method public setUp(ILandroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;)V
    .locals 8

    .prologue
    .line 108
    iput-object p2, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    .line 109
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$1;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const v5, 0x7f060072

    const v6, 0x7f060071

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;IILandroid/support/v7/widget/Toolbar;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    .line 128
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarDrawerToggle;->setDrawerIndicatorEnabled(Z)V

    .line 129
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerListener(Landroid/support/v4/widget/DrawerLayout$f;)V

    .line 130
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$2;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->post(Ljava/lang/Runnable;)Z

    .line 137
    return-void
.end method
