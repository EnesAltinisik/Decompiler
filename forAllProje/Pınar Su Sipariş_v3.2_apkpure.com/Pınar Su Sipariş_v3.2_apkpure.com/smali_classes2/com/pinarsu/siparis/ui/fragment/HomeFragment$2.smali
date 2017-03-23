.class Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;
.super Ljava/lang/Object;
.source "HomeFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/ui/fragment/HomeFragment;
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
    .line 322
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 324
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPager:Landroid/support/v4/view/ViewPager;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    if-nez v0, :cond_0

    .line 325
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->stopSlide()V

    .line 343
    :goto_0
    return-void

    .line 328
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPager:Landroid/support/v4/view/ViewPager;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    .line 329
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->bannerSize:I
    invoke-static {v1}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->access$100(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 330
    const/4 v0, 0x0

    .line 336
    :goto_1
    :try_start_0
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPager:Landroid/support/v4/view/ViewPager;
    invoke-static {v1}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->bannerSize:I
    invoke-static {v2}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->access$100(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)I

    move-result v2

    rem-int/2addr v0, v2

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 337
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->access$300(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->runnable:Ljava/lang/Runnable;
    invoke-static {v1}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->access$200(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x1b58

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 338
    :catch_0
    move-exception v0

    .line 339
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->stopSlide()V

    goto :goto_0

    .line 332
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 340
    :catch_1
    move-exception v0

    .line 341
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->stopSlide()V

    goto :goto_0
.end method
