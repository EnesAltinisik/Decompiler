.class public Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;
.super Landroid/support/v4/app/Fragment;
.source "Order1Fragment.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/pinarsu/siparis/interfaces/IBackPressed;
.implements Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field private activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

.field private resources:Landroid/content/res/Resources;

.field tvAddressDetail:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d010d
    .end annotation
.end field

.field tvAddressLabel:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d010c
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 39
    return-void
.end method


# virtual methods
.method clickContinue()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00f6
        }
    .end annotation

    .prologue
    .line 99
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER2:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    .line 100
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    return v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 89
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 90
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 114
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-string v1, "\u00c7\u0131kmak istedi\u011finizden emin misiniz?"

    const-string v2, "Sipari\u015f kaydedilmeyecektir."

    invoke-static {v0, p0, v1, v2}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 51
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 52
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    .line 53
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->resources:Landroid/content/res/Resources;

    .line 54
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 60
    const v0, 0x7f030045

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 61
    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 94
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 95
    return-void
.end method

.method public onObject(Ljava/lang/Object;I)V
    .locals 1

    .prologue
    .line 119
    if-nez p1, :cond_0

    .line 120
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->setDelegateIBackPressed(Lcom/pinarsu/siparis/interfaces/IBackPressed;)V

    .line 128
    :goto_0
    return-void

    .line 123
    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 124
    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->finish()V

    goto :goto_0

    .line 127
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->setDelegateIBackPressed(Lcom/pinarsu/siparis/interfaces/IBackPressed;)V

    goto :goto_0
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 83
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 84
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->setDelegateIBackPressed(Lcom/pinarsu/siparis/interfaces/IBackPressed;)V

    .line 85
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 66
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 68
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 71
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 72
    invoke-virtual {v0}, Lcom/pinarsu/siparis/model/data/ADRES;->getAddress()Ljava/lang/String;

    move-result-object v1

    .line 73
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES_ETIKETI:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES_ETIKETI:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 74
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->tvAddressLabel:Landroid/widget/TextView;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES_ETIKETI:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/pinarsu/siparis/tools/Tools;->setTextViewUnderLine(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 78
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->tvAddressDetail:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    return-void

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;->tvAddressLabel:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 110
    return-void
.end method
