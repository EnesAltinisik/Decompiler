.class public Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;
.super Landroid/widget/BaseAdapter;
.source "SurveyBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field activity:Landroid/app/Activity;

.field public isRadio:Z

.field item:Lcom/pinarsu/siparis/model/SurveyAnswer;

.field list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/SurveyAnswer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/SurveyAnswer;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->activity:Landroid/app/Activity;

    .line 35
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->list:Ljava/util/List;

    .line 36
    iput-boolean p3, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->isRadio:Z

    .line 37
    return-void
.end method


# virtual methods
.method public clearFlags()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 95
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/SurveyAnswer;

    iput-boolean v2, v0, Lcom/pinarsu/siparis/model/SurveyAnswer;->isChecked:Z

    .line 95
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 97
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 52
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const v4, 0x7f0c000a

    .line 58
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 62
    if-nez p2, :cond_0

    .line 63
    new-instance v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;

    invoke-direct {v1}, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;-><init>()V

    .line 64
    const v2, 0x7f030070

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 65
    const v0, 0x7f0d00b1

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    .line 66
    const v0, 0x7f0d011a

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->imPhoto:Landroid/widget/ImageView;

    .line 67
    const v0, 0x7f0d00d2

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->linear:Landroid/widget/LinearLayout;

    .line 68
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 71
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/SurveyAnswer;

    iput-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->item:Lcom/pinarsu/siparis/model/SurveyAnswer;

    .line 74
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->item:Lcom/pinarsu/siparis/model/SurveyAnswer;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/SurveyAnswer;->answer:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 75
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->item:Lcom/pinarsu/siparis/model/SurveyAnswer;

    iget-object v3, v3, Lcom/pinarsu/siparis/model/SurveyAnswer;->answer:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->item:Lcom/pinarsu/siparis/model/SurveyAnswer;

    iget-boolean v0, v0, Lcom/pinarsu/siparis/model/SurveyAnswer;->isChecked:Z

    if-eqz v0, :cond_2

    .line 81
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    const v2, 0x7f020064

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->imPhoto:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 82
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->linear:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 83
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 91
    :goto_2
    return-object p2

    .line 70
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;

    move-object v1, v0

    goto :goto_0

    .line 77
    :cond_1
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    const v2, 0x7f020069

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->imPhoto:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 87
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->linear:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c0014

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 88
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2
.end method
