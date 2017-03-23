.class public Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;
.super Landroid/support/v4/app/Fragment;
.source "SurveyViewPagerFragment.java"


# instance fields
.field private activity:Lcom/pinarsu/siparis/ui/activity/SurveyActivity;

.field private adapter:Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;

.field private delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

.field edDesc:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ad
    .end annotation
.end field

.field private item:Lcom/pinarsu/siparis/model/data/SORULAR;

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field private position:I

.field tvContinue:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f6
    .end annotation
.end field

.field tvTitle:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b1
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 40
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;)Lcom/pinarsu/siparis/model/data/SORULAR;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    return-object v0
.end method

.method public static newInstance(ILcom/pinarsu/siparis/model/data/SORULAR;Lcom/pinarsu/siparis/interfaces/IClickListener;)Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;
    .locals 3

    .prologue
    .line 59
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;-><init>()V

    .line 60
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 61
    const-string v2, "position"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 62
    const-string v2, "item"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 63
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 64
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->setArguments(Landroid/os/Bundle;)V

    .line 65
    return-object v0
.end method


# virtual methods
.method clickContinue()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00f6
        }
    .end annotation

    .prologue
    .line 146
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    iget v1, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->position:I

    invoke-interface {v0, v1}, Lcom/pinarsu/siparis/interfaces/IClickListener;->onClickListener(I)V

    .line 147
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 71
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 72
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/SurveyActivity;

    .line 73
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "position"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->position:I

    .line 74
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "item"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SORULAR;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    .line 75
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/interfaces/IClickListener;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    .line 76
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 82
    const v0, 0x7f03004a

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 83
    return-object v0
.end method

.method onItemClickLv(I)V
    .locals 2
    .annotation build Lbutterknife/OnItemClick;
        value = {
            0x7f0d00b5
        }
    .end annotation

    .prologue
    .line 136
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->answerObjectList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/SurveyAnswer;

    iget-boolean v0, v0, Lcom/pinarsu/siparis/model/SurveyAnswer;->isChecked:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    move v1, v0

    .line 137
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->adapter:Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;

    iget-boolean v0, v0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->isRadio:Z

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->adapter:Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->clearFlags()V

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->answerObjectList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/SurveyAnswer;

    iput-boolean v1, v0, Lcom/pinarsu/siparis/model/SurveyAnswer;->isChecked:Z

    .line 140
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->adapter:Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;->notifyDataSetChanged()V

    .line 142
    return-void

    .line 136
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    goto :goto_0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 88
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 89
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 91
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->SORU_METNI:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->SORU_METNI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->tvTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/SORULAR;->SORU_METNI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    :goto_0
    iget v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->position:I

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/SurveyActivity;

    iget v1, v1, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->size:I

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_1

    .line 96
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->tvContinue:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/SurveyActivity;

    const v3, 0x7f06009d

    invoke-virtual {v1, v3}, Lcom/pinarsu/siparis/ui/activity/SurveyActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v3, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->questionList:Ljava/util/List;

    .line 103
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->TEK_CEVAP_SECILSIN:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->TEK_CEVAP_SECILSIN:Ljava/lang/String;

    const-string v1, "X"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 104
    const/4 v0, 0x1

    move v1, v0

    .line 106
    :goto_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->answerObjectList:Ljava/util/List;

    if-nez v0, :cond_2

    .line 107
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->answerObjectList:Ljava/util/List;

    .line 108
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 109
    iget-object v4, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v4, v4, Lcom/pinarsu/siparis/model/data/SORULAR;->answerObjectList:Ljava/util/List;

    new-instance v5, Lcom/pinarsu/siparis/model/SurveyAnswer;

    invoke-direct {v5, v0, v2}, Lcom/pinarsu/siparis/model/SurveyAnswer;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->tvTitle:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->tvContinue:Landroid/widget/TextView;

    const v1, 0x7f060040

    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 112
    :cond_2
    new-instance v0, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;

    iget-object v3, v3, Lcom/pinarsu/siparis/model/data/SORULAR;->answerObjectList:Ljava/util/List;

    invoke-direct {v0, v2, v3, v1}, Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;Z)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->adapter:Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;

    .line 113
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->lv:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->adapter:Lcom/pinarsu/siparis/adapter/SurveyBaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 115
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->edDesc:Landroid/widget/EditText;

    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 131
    return-void

    :cond_3
    move v1, v2

    goto :goto_2
.end method
