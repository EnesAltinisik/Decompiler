.class public Lcom/pinarsu/siparis/ui/activity/TutorialActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "TutorialActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;


# static fields
.field public static REQUEST_TYPE:I


# instance fields
.field imSkip:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f7
    .end annotation
.end field

.field indicator:Lcom/pinarsu/siparis/view/ViewPagerIndicator;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f4
    .end annotation
.end field

.field viewPager:Landroid/support/v4/view/ViewPager;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f3
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const/16 v0, 0x3e7

    sput v0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->REQUEST_TYPE:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public clickSkip()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00f7
        }
    .end annotation

    .prologue
    .line 63
    const/4 v0, 0x0

    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->isFIRST_OPEN_APP:Z

    .line 64
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 65
    sget-boolean v0, Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;->isFromMain:Z

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->startActivity(Landroid/content/Intent;)V

    .line 67
    :cond_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->finish()V

    .line 68
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 41
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 43
    const v0, 0x7f03002e

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->setContentView(I)V

    .line 45
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 46
    new-instance v0, Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Lcom/pinarsu/siparis/interfaces/IClickListener;)V

    .line 47
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/ac;)V

    .line 48
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->indicator:Lcom/pinarsu/siparis/view/ViewPagerIndicator;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 49
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->indicator:Lcom/pinarsu/siparis/view/ViewPagerIndicator;

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->setDelegatePageSelectionListener(Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;)V

    .line 50
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .prologue
    .line 54
    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->imSkip:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 58
    :goto_0
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPageSelected   : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    return-void

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->imSkip:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method
