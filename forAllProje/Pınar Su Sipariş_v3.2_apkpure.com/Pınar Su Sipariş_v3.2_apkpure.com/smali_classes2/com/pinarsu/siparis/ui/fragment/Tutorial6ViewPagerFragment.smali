.class public Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;
.super Landroid/support/v4/app/Fragment;
.source "Tutorial6ViewPagerFragment.java"


# instance fields
.field activity:Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

.field linearParent:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00af
    .end annotation
.end field

.field private rect:Landroid/graphics/Rect;

.field tvLogin:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d011e
    .end annotation
.end field

.field tvTryApp:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d011d
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 34
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;)Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->rect:Landroid/graphics/Rect;

    return-object v0
.end method

.method static synthetic access$002(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->rect:Landroid/graphics/Rect;

    return-object p1
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

    .line 51
    const v0, 0x7f03004b

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 52
    return-object v0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 58
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 59
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 60
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->tvLogin:Lcom/pinarsu/siparis/view/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->tvTryApp:Lcom/pinarsu/siparis/view/TextView;

    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 86
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->tvLogin:Lcom/pinarsu/siparis/view/TextView;

    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$2;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 107
    return-void
.end method
