.class Lcom/fodlam/yds/TestLevelActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/afollestad/materialdialogs/f$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/TestLevelActivity;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/TestLevelActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/TestLevelActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/TestLevelActivity$2;->a:Lcom/fodlam/yds/TestLevelActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/afollestad/materialdialogs/f;Lcom/afollestad/materialdialogs/b;)V
    .locals 4

    iget-object v0, p0, Lcom/fodlam/yds/TestLevelActivity$2;->a:Lcom/fodlam/yds/TestLevelActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/fodlam/yds/TestLevelActivity$2;->a:Lcom/fodlam/yds/TestLevelActivity;

    const-class v3, Lcom/fodlam/yds/FodlaBillingActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/TestLevelActivity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/f;->dismiss()V

    return-void
.end method
