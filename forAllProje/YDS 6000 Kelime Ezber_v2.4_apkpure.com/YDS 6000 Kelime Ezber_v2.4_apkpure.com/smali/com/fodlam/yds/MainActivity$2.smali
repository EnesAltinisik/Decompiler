.class Lcom/fodlam/yds/MainActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/MainActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/MainActivity$2;->a:Lcom/fodlam/yds/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity$2;->a:Lcom/fodlam/yds/MainActivity;

    invoke-static {v0}, Lcom/fodlam/yds/MainActivity;->a(Lcom/fodlam/yds/MainActivity;)Lcom/nightonke/boommenu/BoomMenuButton;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nightonke/boommenu/BoomMenuButton;->b()V

    return-void
.end method
