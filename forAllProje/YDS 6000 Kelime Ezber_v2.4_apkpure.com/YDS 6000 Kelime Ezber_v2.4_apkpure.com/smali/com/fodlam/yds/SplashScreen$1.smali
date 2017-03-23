.class Lcom/fodlam/yds/SplashScreen$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/SplashScreen;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lcom/fodlam/yds/SplashScreen;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/SplashScreen;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/SplashScreen$1;->b:Lcom/fodlam/yds/SplashScreen;

    iput-object p2, p0, Lcom/fodlam/yds/SplashScreen$1;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fodlam/yds/SplashScreen$1;->b:Lcom/fodlam/yds/SplashScreen;

    const-class v2, Lcom/fodlam/yds/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, 0x10008000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/fodlam/yds/SplashScreen$1;->a:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fodlam/yds/SplashScreen$1;->a:Landroid/os/Bundle;

    const-string v2, "notifyword"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "notifyword"

    iget-object v2, p0, Lcom/fodlam/yds/SplashScreen$1;->a:Landroid/os/Bundle;

    const-string v3, "notifyword"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_0
    iget-object v1, p0, Lcom/fodlam/yds/SplashScreen$1;->b:Lcom/fodlam/yds/SplashScreen;

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/SplashScreen;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/fodlam/yds/SplashScreen$1;->b:Lcom/fodlam/yds/SplashScreen;

    invoke-virtual {v0}, Lcom/fodlam/yds/SplashScreen;->finish()V

    return-void
.end method
