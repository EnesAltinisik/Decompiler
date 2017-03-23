.class Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$1;
.super Landroid/support/v7/app/ActionBarDrawerToggle;
.source "LeftDrawerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setUp(ILandroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;II)V
    .locals 6

    .prologue
    .line 159
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

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
    .line 168
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->onDrawerClosed(Landroid/view/View;)V

    .line 169
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->invalidateOptionsMenu()V

    .line 170
    return-void
.end method

.method public onDrawerOpened(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 162
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->onDrawerOpened(Landroid/view/View;)V

    .line 163
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->invalidateOptionsMenu()V

    .line 164
    return-void
.end method

.method public onDrawerSlide(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 174
    invoke-super {p0, p1, p2}, Landroid/support/v7/app/ActionBarDrawerToggle;->onDrawerSlide(Landroid/view/View;F)V

    .line 176
    return-void
.end method
