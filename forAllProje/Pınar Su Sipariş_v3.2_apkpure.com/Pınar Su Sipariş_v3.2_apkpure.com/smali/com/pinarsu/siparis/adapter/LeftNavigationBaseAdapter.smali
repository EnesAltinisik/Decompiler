.class public Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;
.super Landroid/widget/BaseAdapter;
.source "LeftNavigationBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field activity:Landroid/app/Activity;

.field public list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/NavDrawerItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/NavDrawerItem;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 30
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->activity:Landroid/app/Activity;

    .line 32
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->list:Ljava/util/List;

    .line 33
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Lcom/pinarsu/siparis/model/NavDrawerItem;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/NavDrawerItem;

    return-object v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->getItem(I)Lcom/pinarsu/siparis/model/NavDrawerItem;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 47
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams",
            "DefaultLocale"
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 57
    if-nez p2, :cond_0

    .line 58
    new-instance v1, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;

    invoke-direct {v1}, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;-><init>()V

    .line 59
    const v2, 0x7f030055

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 61
    const v0, 0x7f0d00d4

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;->im:Landroid/widget/ImageView;

    .line 62
    const v0, 0x7f0d00d2

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;->linear:Landroid/widget/LinearLayout;

    .line 63
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 66
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/NavDrawerItem;

    .line 69
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;->im:Landroid/widget/ImageView;

    iget-object v3, v0, Lcom/pinarsu/siparis/model/NavDrawerItem;->drawableId:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 70
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;->im:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 72
    iget-boolean v0, v0, Lcom/pinarsu/siparis/model/NavDrawerItem;->isActive:Z

    if-eqz v0, :cond_1

    .line 73
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;->im:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 78
    :goto_1
    return-object p2

    .line 65
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;

    move-object v1, v0

    goto :goto_0

    .line 76
    :cond_1
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter$ViewHolder;->im:Landroid/widget/ImageView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_1
.end method

.method public remove(I)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 93
    invoke-virtual {p0}, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->notifyDataSetChanged()V

    .line 94
    return-void
.end method

.method public setItemVisibility(IZ)V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/NavDrawerItem;

    iput-boolean p2, v0, Lcom/pinarsu/siparis/model/NavDrawerItem;->isActive:Z

    .line 88
    invoke-virtual {p0}, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->notifyDataSetChanged()V

    .line 89
    return-void
.end method
