.class Lcom/fodlam/yds/a/i$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/a/i;->a(Landroid/view/ViewGroup;I)Lcom/fodlam/yds/a/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/a/i;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/a/i;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/a/i$2;->a:Lcom/fodlam/yds/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v1, p0, Lcom/fodlam/yds/a/i$2;->a:Lcom/fodlam/yds/a/i;

    iget-object v1, v1, Lcom/fodlam/yds/a/i;->b:Lcom/fodlam/yds/WordListActivity;

    invoke-virtual {v1}, Lcom/fodlam/yds/WordListActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    move-result-object v1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/utility/b;->b(Ljava/lang/String;)V

    return-void
.end method
