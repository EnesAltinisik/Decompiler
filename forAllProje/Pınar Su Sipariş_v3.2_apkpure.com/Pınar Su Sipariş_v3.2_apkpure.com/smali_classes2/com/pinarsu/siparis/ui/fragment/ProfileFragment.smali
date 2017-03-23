.class public Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;
.super Lcom/pinarsu/siparis/ui/fragment/BaseFragment;
.source "ProfileFragment.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field linearMyRegisteredAddress:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0119
    .end annotation
.end field

.field private progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

.field private service:Lcom/pinarsu/siparis/interfaces/IServicePush;

.field toggleButton:Landroid/widget/ToggleButton;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d011b
    .end annotation
.end field

.field tvFirstLastName:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0118
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;-><init>()V

    .line 47
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;Z)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->changeStatus(Z)V

    return-void
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    return-object v0
.end method

.method private changeStatus(Z)V
    .locals 3

    .prologue
    .line 106
    if-eqz p1, :cond_0

    .line 107
    const/4 v0, 0x1

    .line 112
    :goto_0
    invoke-static {}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->newInstance()Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    move-result-object v1

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    .line 113
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v1, v2}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;)V

    .line 114
    new-instance v1, Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;

    sget-object v2, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;-><init>(Ljava/lang/String;I)V

    .line 115
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->service:Lcom/pinarsu/siparis/interfaces/IServicePush;

    new-instance v2, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;

    invoke-direct {v2, p0, p1}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;Z)V

    invoke-interface {v0, v1, v2}, Lcom/pinarsu/siparis/interfaces/IServicePush;->getChangeStatus(Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;Lretrofit/Callback;)V

    .line 141
    return-void

    .line 109
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method clickMyRegisteredAddress()V
    .locals 4
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0119
        }
    .end annotation

    .prologue
    .line 171
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v3, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "isFromHome"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v1

    sget v2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_TYPE:I

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 172
    return-void
.end method

.method clickSSS()V
    .locals 4
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d011c
        }
    .end annotation

    .prologue
    .line 176
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v3, Lcom/pinarsu/siparis/ui/activity/SSSActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 177
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 161
    const/4 v0, 0x0

    return v0
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 155
    const/4 v0, 0x0

    return v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 145
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 146
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 63
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 64
    invoke-static {}, Lcom/pinarsu/siparis/tools/Tools;->getServicePush()Lcom/pinarsu/siparis/interfaces/IServicePush;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->service:Lcom/pinarsu/siparis/interfaces/IServicePush;

    .line 65
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f060095

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setTitle(I)V

    .line 71
    const v0, 0x7f030049

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 73
    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 150
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onDetach()V

    .line 151
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 78
    invoke-super {p0, p1, p2}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 79
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 81
    const-string v0, ""

    .line 82
    sget-object v1, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->AD:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 83
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->AD:Ljava/lang/String;

    .line 85
    :cond_0
    sget-object v1, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->SOYADI:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->SOYADI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 88
    :cond_1
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->tvFirstLastName:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->toggleButton:Landroid/widget/ToggleButton;

    sget-boolean v1, Lcom/pinarsu/siparis/Preferences;->isPUSH:Z

    invoke-virtual {v0, v1}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 90
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Preferences.isPUSH : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-boolean v2, Lcom/pinarsu/siparis/Preferences;->isPUSH:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->toggleButton:Landroid/widget/ToggleButton;

    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ToggleButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 97
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 167
    return-void
.end method
