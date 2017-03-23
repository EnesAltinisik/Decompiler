.class Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$2;
.super Ljava/lang/Object;
.source "RightDrawerFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


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


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->access$100(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)Landroid/support/v7/app/ActionBarDrawerToggle;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarDrawerToggle;->syncState()V

    .line 134
    return-void
.end method
