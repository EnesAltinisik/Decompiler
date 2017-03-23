.class Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;
.super Landroid/view/animation/Animation;
.source "AnimatedExpandableListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/view/AnimatedExpandableListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ExpandAnimation"
.end annotation


# instance fields
.field private baseHeight:I

.field private delta:I

.field private groupInfo:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

.field private view:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;IILcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;)V
    .locals 1

    .prologue
    .line 622
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 623
    iput p2, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->baseHeight:I

    .line 624
    sub-int v0, p3, p2

    iput v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->delta:I

    .line 625
    iput-object p1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->view:Landroid/view/View;

    .line 626
    iput-object p4, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->groupInfo:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    .line 628
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 629
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 630
    return-void
.end method

.method synthetic constructor <init>(Landroid/view/View;IILcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;Lcom/pinarsu/siparis/view/AnimatedExpandableListView$1;)V
    .locals 0

    .prologue
    .line 615
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;-><init>(Landroid/view/View;IILcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;)V

    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .prologue
    .line 635
    invoke-super {p0, p1, p2}, Landroid/view/animation/Animation;->applyTransformation(FLandroid/view/animation/Transformation;)V

    .line 636
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 637
    iget v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->baseHeight:I

    iget v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->delta:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    add-int/2addr v0, v1

    .line 638
    iget-object v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 639
    iget-object v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->groupInfo:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    iput v0, v1, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->dummyHeight:I

    .line 640
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 647
    :goto_0
    return-void

    .line 642
    :cond_0
    iget v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->baseHeight:I

    iget v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->delta:I

    add-int/2addr v0, v1

    .line 643
    iget-object v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 644
    iget-object v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->groupInfo:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    iput v0, v1, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->dummyHeight:I

    .line 645
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    goto :goto_0
.end method
