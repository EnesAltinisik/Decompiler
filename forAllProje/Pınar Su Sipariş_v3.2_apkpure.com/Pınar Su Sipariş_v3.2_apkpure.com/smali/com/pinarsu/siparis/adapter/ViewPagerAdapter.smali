.class public Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "ViewPagerAdapter.java"


# instance fields
.field delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

.field list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/ViewPagerItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/FragmentManager;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/ViewPagerItem;",
            ">;",
            "Lcom/pinarsu/siparis/interfaces/IClickListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 25
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 26
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;->list:Ljava/util/List;

    .line 27
    iput-object p3, p0, Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    .line 28
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/OutOfMemoryError;
        }
    .end annotation

    .prologue
    .line 37
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/ViewPagerItem;

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    invoke-static {p1, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->newInstance(ILcom/pinarsu/siparis/model/ViewPagerItem;Lcom/pinarsu/siparis/interfaces/IClickListener;)Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;

    move-result-object v0

    return-object v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 42
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
