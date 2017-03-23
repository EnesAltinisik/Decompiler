.class public Lcom/pinarsu/siparis/ui/activity/OrderActivity;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity;
.source "OrderActivity.java"


# instance fields
.field public activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

.field private delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

.field public deliveryList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;",
            ">;"
        }
    .end annotation
.end field

.field private product:Lcom/pinarsu/siparis/model/data/MALZEMELER;

.field public productList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MALZEMELER;",
            ">;"
        }
    .end annotation
.end field

.field public productListParent:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MALZEMELER;",
            ">;"
        }
    .end annotation
.end field

.field tvStep1:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d015c
    .end annotation
.end field

.field tvStep2:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d015d
    .end annotation
.end field

.field tvStep3:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d015e
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public addProductFromProductParentList(Lcom/pinarsu/siparis/model/data/MALZEMELER;)V
    .locals 1

    .prologue
    .line 173
    const/4 v0, 0x1

    iput v0, p1, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    .line 174
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productListParent:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    return-void
.end method

.method public displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 81
    iget-object v1, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->clazz:Ljava/lang/Class;

    .line 82
    const/4 v0, 0x0

    .line 84
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 91
    :goto_0
    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 93
    if-eqz p2, :cond_0

    .line 94
    invoke-virtual {v0, p2}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 96
    :cond_0
    if-eqz v0, :cond_1

    .line 97
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 98
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 99
    const v2, 0x7f0d00da

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 100
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 102
    :cond_1
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->setStepsView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;)V

    .line 103
    return-void

    .line 85
    :catch_0
    move-exception v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/InstantiationException;->printStackTrace()V

    goto :goto_0

    .line 87
    :catch_1
    move-exception v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 65
    const v0, 0x7f030024

    return v0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

    invoke-interface {v0}, Lcom/pinarsu/siparis/interfaces/IBackPressed;->onBackPressed()V

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

    .line 75
    :goto_0
    return-void

    .line 74
    :cond_0
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onBackPressed()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 44
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    const v0, 0x7f06008e

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->setTitle(I)V

    .line 46
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 47
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 49
    const-string v0, "product"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->product:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 50
    const-string v0, "deliveryList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    const-string v0, "deliveryList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->deliveryList:Ljava/util/List;

    .line 53
    :cond_0
    const-string v0, "productListParent"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    const-string v0, "productListParent"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productListParent:Ljava/util/List;

    .line 56
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productList:Ljava/util/List;

    .line 57
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->product:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->product:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->removeProductFromProductParentList(Lcom/pinarsu/siparis/model/data/MALZEMELER;)V

    .line 60
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER1:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    .line 61
    return-void
.end method

.method public removeProductFromProductParentList(Lcom/pinarsu/siparis/model/data/MALZEMELER;)V
    .locals 4

    .prologue
    const/4 v2, -0x1

    .line 156
    .line 157
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productListParent:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 158
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productListParent:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME:Ljava/lang/String;

    iget-object v3, p1, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    :goto_1
    if-eq v1, v2, :cond_0

    .line 164
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productListParent:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 165
    :cond_0
    return-void

    .line 157
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method public setDelegateIBackPressed(Lcom/pinarsu/siparis/interfaces/IBackPressed;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

    .line 153
    return-void
.end method

.method public setStepsView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;)V
    .locals 7

    .prologue
    const v6, 0x7f0c000a

    const v5, 0x7f020069

    const v4, 0x7f020067

    const v3, 0x7f020064

    const v2, 0x106000b

    .line 111
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER1:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-ne p1, v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v5}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 114
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->resources:Landroid/content/res/Resources;

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 115
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v4}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 118
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->resources:Landroid/content/res/Resources;

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 119
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, "2"

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v4}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 122
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->resources:Landroid/content/res/Resources;

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 123
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, "3"

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    :cond_0
    :goto_0
    return-void

    .line 125
    :cond_1
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER2:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-ne p1, v0, :cond_2

    .line 126
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 127
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v5}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 130
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->resources:Landroid/content/res/Resources;

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 131
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, "2"

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v4}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 135
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->resources:Landroid/content/res/Resources;

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 136
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, "3"

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 137
    :cond_2
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER3:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-ne p1, v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 139
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep1:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 143
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep2:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, "3"

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v5}, Lcom/pinarsu/siparis/view/TextView;->setBackgroundResource(I)V

    .line 147
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->tvStep3:Lcom/pinarsu/siparis/view/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->resources:Landroid/content/res/Resources;

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    goto :goto_0
.end method
