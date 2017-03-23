.class Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$2;
.super Ljava/lang/Object;
.source "LeftDrawerFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


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
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;)Landroid/support/v7/app/ActionBarDrawerToggle;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarDrawerToggle;->syncState()V

    .line 184
    return-void
.end method
