.class Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$1;
.super Landroid/support/v7/app/ActionBarDrawerToggle;
.source "RightDrawerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->setUp(ILandroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

.field final synthetic val$toolbar:Landroid/support/v7/widget/Toolbar;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;IILandroid/support/v7/widget/Toolbar;)V
    .locals 6

    .prologue
    .line 109
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    iput-object p7, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$1;->val$toolbar:Landroid/support/v7/widget/Toolbar;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/app/ActionBarDrawerToggle;-><init>(Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;II)V

    return-void
.end method


# virtual methods
.method public onDrawerClosed(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 118
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->onDrawerClosed(Landroid/view/View;)V

    .line 119
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)Lcom/pinarsu/siparis/ui/activity/MainActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->invalidateOptionsMenu()V

    .line 120
    return-void
.end method

.method public onDrawerOpened(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 112
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->onDrawerOpened(Landroid/view/View;)V

    .line 113
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)Lcom/pinarsu/siparis/ui/activity/MainActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->invalidateOptionsMenu()V

    .line 114
    return-void
.end method

.method public onDrawerSlide(Landroid/view/View;F)V
    .locals 3

    .prologue
    .line 124
    invoke-super {p0, p1, p2}, Landroid/support/v7/app/ActionBarDrawerToggle;->onDrawerSlide(Landroid/view/View;F)V

    .line 125
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$1;->val$toolbar:Landroid/support/v7/widget/Toolbar;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p2, v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setAlpha(F)V

    .line 126
    return-void
.end method
