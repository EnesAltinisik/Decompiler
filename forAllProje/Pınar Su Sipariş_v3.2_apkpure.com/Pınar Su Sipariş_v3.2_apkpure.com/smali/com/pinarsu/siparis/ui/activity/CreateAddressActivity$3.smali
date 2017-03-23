.class Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$3;
.super Landroid/widget/ArrayAdapter;
.source "CreateAddressActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;Landroid/content/Context;ILjava/util/List;)V
    .locals 0

    .prologue
    .line 413
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$3;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 426
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 427
    check-cast v0, Landroid/support/v7/widget/j;

    .line 428
    if-nez p1, :cond_0

    .line 429
    const v2, -0x777778

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/j;->setTextColor(I)V

    .line 433
    :goto_0
    return-object v1

    .line 431
    :cond_0
    const/high16 v2, -0x1000000

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/j;->setTextColor(I)V

    goto :goto_0
.end method

.method public isEnabled(I)Z
    .locals 1

    .prologue
    .line 416
    if-nez p1, :cond_0

    .line 417
    const/4 v0, 0x0

    .line 419
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
