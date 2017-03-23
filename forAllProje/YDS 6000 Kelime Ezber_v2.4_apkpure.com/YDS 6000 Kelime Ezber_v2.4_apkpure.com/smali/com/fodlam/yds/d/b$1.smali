.class Lcom/fodlam/yds/d/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/d/b;-><init>(Lcom/fodlam/yds/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/c;

.field final synthetic b:Lcom/fodlam/yds/d/b;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/d/b;Lcom/fodlam/yds/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/d/b$1;->b:Lcom/fodlam/yds/d/b;

    iput-object p2, p0, Lcom/fodlam/yds/d/b$1;->a:Lcom/fodlam/yds/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/fodlam/yds/d/b$1;->a:Lcom/fodlam/yds/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/fodlam/yds/c;->a(ILjava/lang/Class;)V

    iget-object v0, p0, Lcom/fodlam/yds/d/b$1;->b:Lcom/fodlam/yds/d/b;

    invoke-static {v0}, Lcom/fodlam/yds/d/b;->a(Lcom/fodlam/yds/d/b;)V

    return-void
.end method
