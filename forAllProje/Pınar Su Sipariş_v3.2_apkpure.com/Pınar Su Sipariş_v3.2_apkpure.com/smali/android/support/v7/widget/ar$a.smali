.class Landroid/support/v7/widget/ar$a;
.super Landroid/widget/BaseAdapter;
.source "ScrollingTabContainerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/ar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/ar;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/ar;)V
    .locals 0

    .prologue
    .line 544
    iput-object p1, p0, Landroid/support/v7/widget/ar$a;->a:Landroid/support/v7/widget/ar;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/ar;Landroid/support/v7/widget/ar$1;)V
    .locals 0

    .prologue
    .line 544
    invoke-direct {p0, p1}, Landroid/support/v7/widget/ar$a;-><init>(Landroid/support/v7/widget/ar;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 547
    iget-object v0, p0, Landroid/support/v7/widget/ar$a;->a:Landroid/support/v7/widget/ar;

    invoke-static {v0}, Landroid/support/v7/widget/ar;->a(Landroid/support/v7/widget/ar;)Landroid/support/v7/widget/ai;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ai;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 552
    iget-object v0, p0, Landroid/support/v7/widget/ar$a;->a:Landroid/support/v7/widget/ar;

    invoke-static {v0}, Landroid/support/v7/widget/ar;->a(Landroid/support/v7/widget/ar;)Landroid/support/v7/widget/ai;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/ai;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ar$c;

    invoke-virtual {v0}, Landroid/support/v7/widget/ar$c;->b()Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 557
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 562
    if-nez p2, :cond_0

    .line 563
    iget-object v1, p0, Landroid/support/v7/widget/ar$a;->a:Landroid/support/v7/widget/ar;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ar$a;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBar$Tab;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Landroid/support/v7/widget/ar;->a(Landroid/support/v7/widget/ar;Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/widget/ar$c;

    move-result-object p2

    .line 567
    :goto_0
    return-object p2

    :cond_0
    move-object v0, p2

    .line 565
    check-cast v0, Landroid/support/v7/widget/ar$c;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ar$a;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/app/ActionBar$Tab;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ar$c;->a(Landroid/support/v7/app/ActionBar$Tab;)V

    goto :goto_0
.end method
