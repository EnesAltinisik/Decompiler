.class Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;
.super Ljava/lang/Object;
.source "AnimatedExpandableListView.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

.field final synthetic val$dummyView:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;

.field final synthetic val$groupPosition:I


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;ILcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;)V
    .locals 0

    .prologue
    .line 469
    iput-object p1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;->this$0:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    iput p2, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;->val$groupPosition:I

    iput-object p3, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;->val$dummyView:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 473
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;->this$0:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    iget v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;->val$groupPosition:I

    # invokes: Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->stopAnimation(I)V
    invoke-static {v0, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->access$600(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;I)V

    .line 474
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;->this$0:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->notifyDataSetChanged()V

    .line 475
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;->val$dummyView:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->setTag(Ljava/lang/Object;)V

    .line 476
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 480
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 484
    return-void
.end method
