.class Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;
.super Ljava/lang/Object;
.source "CreateAddressActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V
    .locals 0

    .prologue
    .line 368
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x0

    .line 372
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 402
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 375
    :pswitch_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinTown:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 376
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 377
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 378
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->TOWN_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 379
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "ILKODU"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->cityList:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ILLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ILLER;->ILKODU:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 380
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v2, v2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {v0, v2, v1, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v1, v5, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 383
    :pswitch_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 384
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 385
    if-eqz p3, :cond_0

    .line 387
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DISTRICT_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 388
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "ILCEKODU"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->townList:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ILCELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ILCELER;->ILCE_KODU:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v2, v2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {v0, v2, v1, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v1, v5, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0

    .line 392
    :pswitch_3
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 393
    if-eqz p3, :cond_0

    .line 395
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->STREET_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 396
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "MAHALLE_KODU"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->districtList:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;->MAHALLE_KODU:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 397
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v2, v2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {v0, v2, v1, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v1, v5, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0

    .line 372
    nop

    :pswitch_data_0
    .packed-switch 0x7f0d00ba
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 407
    return-void
.end method
