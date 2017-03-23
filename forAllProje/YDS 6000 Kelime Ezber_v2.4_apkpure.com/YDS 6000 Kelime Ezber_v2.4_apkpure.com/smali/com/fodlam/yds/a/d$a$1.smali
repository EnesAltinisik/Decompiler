.class Lcom/fodlam/yds/a/d$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/a/d$a;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/a/d$a;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/a/d$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/a/d$a$1;->a:Lcom/fodlam/yds/a/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v1, Lcom/fodlam/yds/OxfordApplication$a;->c:Lcom/fodlam/yds/OxfordApplication$a;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/a/d$a$1;->a:Lcom/fodlam/yds/a/d$a;

    invoke-virtual {v0}, Lcom/fodlam/yds/a/d$a;->i()Landroid/support/v4/b/m;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/b/m;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/utility/b;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
