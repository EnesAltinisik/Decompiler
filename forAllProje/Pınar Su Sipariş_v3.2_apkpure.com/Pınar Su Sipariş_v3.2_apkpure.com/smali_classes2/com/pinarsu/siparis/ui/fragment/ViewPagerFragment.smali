.class public Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;
.super Landroid/support/v4/app/Fragment;
.source "ViewPagerFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;
    }
.end annotation


# instance fields
.field private delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

.field private item:Lcom/pinarsu/siparis/model/ViewPagerItem;

.field private position:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 26
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;)Lcom/pinarsu/siparis/interfaces/IClickListener;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    return-object v0
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->position:I

    return v0
.end method

.method public static newInstance(ILcom/pinarsu/siparis/model/ViewPagerItem;Lcom/pinarsu/siparis/interfaces/IClickListener;)Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;
    .locals 3

    .prologue
    .line 39
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;-><init>()V

    .line 40
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 41
    const-string v2, "position"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 42
    const-string v2, "item"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 43
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 44
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->setArguments(Landroid/os/Bundle;)V

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
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "position"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->position:I

    .line 53
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "item"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/ViewPagerItem;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->item:Lcom/pinarsu/siparis/model/ViewPagerItem;

    .line 54
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/interfaces/IClickListener;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    .line 55
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 60
    const v0, 0x7f030051

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 61
    const v0, 0x7f0d00d4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 63
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->item:Lcom/pinarsu/siparis/model/ViewPagerItem;

    iget-object v2, v2, Lcom/pinarsu/siparis/model/ViewPagerItem;->type:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    sget-object v3, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->FROM_DRAWABLE:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    if-ne v2, v3, :cond_1

    .line 64
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->item:Lcom/pinarsu/siparis/model/ViewPagerItem;

    iget v2, v2, Lcom/pinarsu/siparis/model/ViewPagerItem;->imageDrawable:I

    .line 65
    if-eqz v2, :cond_0

    .line 66
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 72
    :cond_0
    :goto_0
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$1;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    return-object v1

    .line 68
    :cond_1
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->item:Lcom/pinarsu/siparis/model/ViewPagerItem;

    iget-object v2, v2, Lcom/pinarsu/siparis/model/ViewPagerItem;->imageUrl:Ljava/lang/String;

    .line 69
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_0
.end method
