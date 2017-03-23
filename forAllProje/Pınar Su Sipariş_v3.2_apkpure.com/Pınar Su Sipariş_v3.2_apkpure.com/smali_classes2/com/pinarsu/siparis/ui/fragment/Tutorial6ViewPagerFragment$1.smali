.class Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$1;
.super Ljava/lang/Object;
.source "Tutorial6ViewPagerFragment.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    .line 72
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 83
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 74
    :pswitch_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->rect:Landroid/graphics/Rect;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    add-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;->clickSkip()V

    goto :goto_0

    .line 80
    :pswitch_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;

    new-instance v1, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    # setter for: Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->rect:Landroid/graphics/Rect;
    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;->access$002(Lcom/pinarsu/siparis/ui/fragment/Tutorial6ViewPagerFragment;Landroid/graphics/Rect;)Landroid/graphics/Rect;

    goto :goto_0

    .line 72
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
