.class Lcom/gigamole/infinitecycleviewpager/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/gigamole/infinitecycleviewpager/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/gigamole/infinitecycleviewpager/a;


# direct methods
.method constructor <init>(Lcom/gigamole/infinitecycleviewpager/a;)V
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a$1;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$1;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$1;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->c(Lcom/gigamole/infinitecycleviewpager/a;)Lcom/gigamole/infinitecycleviewpager/f;

    move-result-object v1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$1;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->k()I

    move-result v2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$1;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->b(Lcom/gigamole/infinitecycleviewpager/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    add-int/2addr v0, v2

    invoke-interface {v1, v0}, Lcom/gigamole/infinitecycleviewpager/f;->setCurrentItem(I)V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$1;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v0}, Lcom/gigamole/infinitecycleviewpager/a;->e(Lcom/gigamole/infinitecycleviewpager/a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/gigamole/infinitecycleviewpager/a$1;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-static {v1}, Lcom/gigamole/infinitecycleviewpager/a;->d(Lcom/gigamole/infinitecycleviewpager/a;)I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method
