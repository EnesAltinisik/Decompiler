.class public Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "DeliveryHoursActivity.java"


# instance fields
.field catList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/Category;",
            ">;"
        }
    .end annotation
.end field

.field deliveryList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;",
            ">;"
        }
    .end annotation
.end field

.field imBack:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e3
    .end annotation
.end field

.field imLeftMenu:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0156
    .end annotation
.end field

.field imLogo:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0157
    .end annotation
.end field

.field lv:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;",
            ">;>;"
        }
    .end annotation
.end field

.field tvTitle:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b1
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
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
    .line 131
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->finish()V

    .line 132
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const v3, 0x7f06006a

    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 56
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 58
    const v0, 0x7f03001e

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->setContentView(I)V

    .line 59
    invoke-virtual {p0, v3}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->setTitle(I)V

    .line 60
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 61
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imLeftMenu:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imLogo:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 63
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->imBack:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 64
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {p0, v3}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 70
    const-string v1, "deliveryList"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->deliveryList:Ljava/util/List;

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->map:Ljava/util/Map;

    .line 77
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->deliveryList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;

    .line 79
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->map:Ljava/util/Map;

    iget-object v3, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->TARIH:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 80
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->map:Ljava/util/Map;

    iget-object v3, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->TARIH:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 82
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 83
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object v3, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->map:Ljava/util/Map;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->TARIH:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 88
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->catList:Ljava/util/List;

    .line 89
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->map:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 90
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 91
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 92
    const-string v1, "-"

    const-string v3, ""

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 93
    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->catList:Ljava/util/List;

    new-instance v5, Lcom/pinarsu/siparis/model/Category;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->map:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {v5, v0, v1, v3}, Lcom/pinarsu/siparis/model/Category;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 95
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->catList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparatorInt;

    const-string v2, "dateInt"

    const-string v3, "dateInt"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparatorInt;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 97
    new-instance v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->catList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;-><init>(Ljava/util/List;Landroid/content/Context;)V

    .line 98
    const v0, 0x7f0d00b5

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->lv:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    .line 99
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->lv:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 100
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->lv:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    new-instance v1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$1;-><init>(Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 113
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->lv:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    new-instance v1, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$2;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$2;-><init>(Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 127
    return-void
.end method
