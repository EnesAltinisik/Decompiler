.class public Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;
.super Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;
.source "DeliveryHoursAnimatedExpandableAdapter.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InflateParams"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;,
        Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;

.field private catList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/Category;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/Category;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->catList:Ljava/util/List;

    .line 40
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->c:Landroid/content/Context;

    .line 41
    return-void
.end method


# virtual methods
.method public getChild(II)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->catList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/Category;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/Category;->list:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .prologue
    .line 51
    int-to-long v0, p2

    return-wide v0
.end method

.method public getGroup(I)Lcom/pinarsu/siparis/model/Category;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->catList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/Category;

    return-object v0
.end method

.method public bridge synthetic getGroup(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->getGroup(I)Lcom/pinarsu/siparis/model/Category;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->catList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    .prologue
    .line 112
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const v4, 0x106000b

    .line 119
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->c:Landroid/content/Context;

    const-string v1, "layout_inflater"

    .line 120
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 123
    if-nez p3, :cond_0

    .line 124
    new-instance v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;-><init>(Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;)V

    .line 125
    const v2, 0x7f030068

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 126
    const v0, 0x7f0d00b1

    .line 127
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    .line 128
    const v0, 0x7f0d00d4

    .line 129
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->im:Landroid/widget/ImageView;

    .line 130
    const v0, 0x7f0d00af

    .line 131
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->linearParent:Landroid/widget/LinearLayout;

    .line 132
    const v0, 0x7f0d0149

    .line 133
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->linearChildTitle:Landroid/widget/LinearLayout;

    .line 135
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 139
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->catList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/Category;

    .line 140
    iget-object v0, v0, Lcom/pinarsu/siparis/model/Category;->title:Ljava/lang/String;

    .line 141
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 143
    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v0, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateWithMonthDayName(Ljava/lang/String;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/lang/String;

    move-result-object v0

    .line 144
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    :goto_1
    if-eqz p2, :cond_2

    .line 148
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->im:Landroid/widget/ImageView;

    const v2, 0x7f02009d

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 149
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->linearParent:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 150
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->linearChildTitle:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 151
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 158
    :goto_2
    return-object p3

    .line 137
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;

    move-object v1, v0

    goto :goto_0

    .line 146
    :cond_1
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 153
    :cond_2
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->im:Landroid/widget/ImageView;

    const v2, 0x7f0200ea

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 154
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->linearParent:Landroid/widget/LinearLayout;

    const v2, 0x7f0c003c

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 155
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->linearChildTitle:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 156
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$GroupHolder;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    goto :goto_2
.end method

.method public getRealChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 58
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->c:Landroid/content/Context;

    const-string v1, "layout_inflater"

    .line 59
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 62
    if-nez p4, :cond_0

    .line 63
    new-instance v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;-><init>(Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$1;)V

    .line 64
    const v2, 0x7f030067

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p5, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p4

    .line 66
    const v0, 0x7f0d0147

    .line 67
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;->tvStartHour:Lcom/pinarsu/siparis/view/TextView;

    .line 68
    const v0, 0x7f0d0148

    .line 69
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;->tvFinishHour:Lcom/pinarsu/siparis/view/TextView;

    .line 71
    invoke-virtual {p4, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 75
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->catList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/Category;

    .line 77
    iget-object v0, v0, Lcom/pinarsu/siparis/model/Category;->list:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;

    .line 80
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->BASLANGIC_SAATI:Ljava/lang/String;

    .line 81
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 82
    invoke-static {v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getHourMinute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 83
    iget-object v3, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;->tvStartHour:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v3, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    :goto_1
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->BITIS_SAATI:Ljava/lang/String;

    .line 88
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/TESLIMAT_SAATLERI;->BITIS_SAATI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 89
    invoke-static {v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getHourMinute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    iget-object v1, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;->tvFinishHour:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    :goto_2
    return-object p4

    .line 73
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;

    move-object v1, v0

    goto :goto_0

    .line 85
    :cond_1
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;->tvStartHour:Lcom/pinarsu/siparis/view/TextView;

    const-string v3, ""

    invoke-virtual {v2, v3}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 92
    :cond_2
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter$ChildHolder;->tvFinishHour:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method public getRealChildrenCount(I)I
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/DeliveryHoursAnimatedExpandableAdapter;->catList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/Category;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/Category;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 163
    const/4 v0, 0x1

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .prologue
    .line 168
    const/4 v0, 0x1

    return v0
.end method
