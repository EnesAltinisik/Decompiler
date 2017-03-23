.class Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;
.super Ljava/lang/Object;
.source "HomeFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->setViewPager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 293
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v0, :cond_0

    .line 294
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setOnActivityResultDelegate(Lcom/pinarsu/siparis/interfaces/IActivityResult;)V

    .line 295
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    iget-object v1, v1, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 296
    const-string v1, "isFromHome"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 297
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    iget-object v1, v1, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    sget v2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_TYPE:I

    invoke-virtual {v1, v0, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 301
    :goto_0
    return-void

    .line 299
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->loginPopup()V

    goto :goto_0
.end method
