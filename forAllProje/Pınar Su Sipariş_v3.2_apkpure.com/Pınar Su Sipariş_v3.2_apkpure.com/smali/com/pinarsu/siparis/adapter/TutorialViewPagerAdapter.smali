.class public Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "TutorialViewPagerAdapter.java"


# static fields
.field public static isFromMain:Z


# instance fields
.field delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    sput-boolean v0, Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;->isFromMain:Z

    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Lcom/pinarsu/siparis/interfaces/IClickListener;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 27
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    .line 28
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 32
    sget-boolean v0, Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;->isFromMain:Z

    if-eqz v0, :cond_0

    .line 33
    const/4 v0, 0x4

    .line 34
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x5

    goto :goto_0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 47
    const/4 v0, 0x4

    if-ge p1, v0, :cond_0

    .line 48
    invoke-static {p1}, Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;->newInstance(I)Lcom/pinarsu/siparis/ui/fragment/TutorialViewPagerFragment;

    move-result-object v0

    .line 50
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;-><init>()V

    goto :goto_0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Page "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
