.class public Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;
.super Landroid/support/v4/app/Fragment;
.source "TutorialViewPagerFragment.java"


# instance fields
.field private activity:Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

.field private drawableIds:[I

.field im:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00d4
    .end annotation
.end field

.field private position:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 35
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->drawableIds:[I

    .line 29
    return-void

    .line 35
    :array_0
    .array-data 4
        0x7f0200f4
        0x7f0200f5
        0x7f0200f6
        0x7f0200f7
    .end array-data
.end method

.method public static newInstance(I)Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;
    .locals 3

    .prologue
    .line 40
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;-><init>()V

    .line 41
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 42
    const-string v2, "position"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 44
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->setArguments(Landroid/os/Bundle;)V

    .line 45
    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 51
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 52
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

    .line 53
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "position"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->position:I

    .line 54
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 59
    const v0, 0x7f03004c

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 60
    return-object v0
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 72
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 73
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->drawableIds:[I

    iget v2, p0, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->position:I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->im:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 74
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 65
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 66
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 68
    return-void
.end method
