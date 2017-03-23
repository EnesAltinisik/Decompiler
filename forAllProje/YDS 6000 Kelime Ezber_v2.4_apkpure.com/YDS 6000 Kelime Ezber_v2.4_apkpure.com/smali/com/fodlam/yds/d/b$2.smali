.class Lcom/fodlam/yds/d/b$2;
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
.field final synthetic a:Lcom/fodlam/yds/d/b;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/d/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/d/b$2;->a:Lcom/fodlam/yds/d/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/d/b$2;->a:Lcom/fodlam/yds/d/b;

    invoke-virtual {v0}, Lcom/fodlam/yds/d/b;->dismiss()V

    return-void
.end method
