.class Lcom/fodlam/yds/a/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/a/f;->a(Landroid/view/ViewGroup;I)Lcom/fodlam/yds/a/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/a/f;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/a/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/a/f$1;->a:Lcom/fodlam/yds/a/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v1

    iget v2, v0, Lcom/fodlam/yds/f/h;->d:I

    invoke-virtual {v1, v2}, Lcom/fodlam/yds/c/b;->c(I)Lcom/fodlam/yds/f/b;

    iget-object v1, p0, Lcom/fodlam/yds/a/f$1;->a:Lcom/fodlam/yds/a/f;

    invoke-static {v1, v0}, Lcom/fodlam/yds/a/f;->a(Lcom/fodlam/yds/a/f;Lcom/fodlam/yds/f/h;)V

    return-void
.end method
