.class Lcom/fodlam/yds/a/f$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/afollestad/materialdialogs/f$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/a/f;->b()V
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

    iput-object p1, p0, Lcom/fodlam/yds/a/f$4;->a:Lcom/fodlam/yds/a/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/afollestad/materialdialogs/f;Lcom/afollestad/materialdialogs/b;)V
    .locals 4

    iget-object v0, p0, Lcom/fodlam/yds/a/f$4;->a:Lcom/fodlam/yds/a/f;

    iget-object v0, v0, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/fodlam/yds/a/f$4;->a:Lcom/fodlam/yds/a/f;

    iget-object v2, v2, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    const-class v3, Lcom/fodlam/yds/FodlaBillingActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/SearchResultsActivity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/f;->dismiss()V

    return-void
.end method
