.class public Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;
.super Lcom/pinarsu/siparis/ui/fragment/BaseFragment;
.source "OrderSummaryFragment.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IClickListener;
.implements Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field private adapter:Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field position:I

.field serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

.field tvInfo:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c9
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;-><init>()V

    .line 41
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x0

    return v0
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 93
    const v0, 0x7f030048

    return v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 83
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 84
    return-void
.end method

.method public onClickListener(I)V
    .locals 3

    .prologue
    .line 150
    iput p1, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->position:I

    .line 151
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v1, "Bilgi"

    const-string v2, "Silmek istedi\u011finizden emin misiniz?"

    invoke-static {v0, p0, v1, v2}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 55
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    .line 58
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 63
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 88
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onDetach()V

    .line 89
    return-void
.end method

.method public onObject(Ljava/lang/Object;I)V
    .locals 5

    .prologue
    .line 156
    if-nez p1, :cond_1

    .line 170
    :cond_0
    :goto_0
    return-void

    .line 160
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 161
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

    .line 162
    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->position:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;

    .line 164
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIPARIS:Ljava/lang/String;

    .line 165
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SIPARIS_NO : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DELETE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v1, v2}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 167
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "SIPARIS_NO"

    invoke-direct {v3, v4, v0}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, v2, v1, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 110
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_2

    .line 126
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DELETE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_0

    .line 127
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v2, "Sipari\u015f ba\u015far\u0131yla iptal edildi."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 128
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->position:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 130
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->tvInfo:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 131
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->lv:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 132
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v3}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    .line 139
    :cond_0
    :goto_0
    return-void

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->adapter:Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->notifyDataSetChanged()V

    goto :goto_0

    .line 137
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v1, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v1, v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 68
    invoke-super {p0, p1, p2}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 69
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 70
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f06008f

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setTitle(I)V

    .line 72
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 73
    new-instance v0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v2, v2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    invoke-direct {v0, v1, v2, p0}, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IClickListener;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->adapter:Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;

    .line 74
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->lv:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->adapter:Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 79
    :goto_0
    return-void

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->tvInfo:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 77
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;->lv:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 105
    return-void
.end method
