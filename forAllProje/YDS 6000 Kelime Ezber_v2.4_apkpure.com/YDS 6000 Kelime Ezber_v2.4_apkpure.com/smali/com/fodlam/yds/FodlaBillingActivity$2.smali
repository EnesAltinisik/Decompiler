.class Lcom/fodlam/yds/FodlaBillingActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/FodlaBillingActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/FodlaBillingActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/FodlaBillingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/FodlaBillingActivity$2;->a:Lcom/fodlam/yds/FodlaBillingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity$2;->a:Lcom/fodlam/yds/FodlaBillingActivity;

    iget-boolean v0, v0, Lcom/fodlam/yds/FodlaBillingActivity;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity$2;->a:Lcom/fodlam/yds/FodlaBillingActivity;

    iget-object v0, v0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    iget-object v1, p0, Lcom/fodlam/yds/FodlaBillingActivity$2;->a:Lcom/fodlam/yds/FodlaBillingActivity;

    const-string v2, "com.fodlam.yds.noads"

    invoke-virtual {v0, v1, v2}, Lcom/b/a/a/a/c;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    :cond_0
    return-void
.end method
