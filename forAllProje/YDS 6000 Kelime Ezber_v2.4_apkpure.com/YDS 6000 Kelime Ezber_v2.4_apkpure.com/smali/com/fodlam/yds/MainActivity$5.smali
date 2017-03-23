.class Lcom/fodlam/yds/MainActivity$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/MainActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/SharedPreferences;

.field final synthetic b:Lcom/fodlam/yds/MainActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/MainActivity;Landroid/content/SharedPreferences;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/MainActivity$5;->b:Lcom/fodlam/yds/MainActivity;

    iput-object p2, p0, Lcom/fodlam/yds/MainActivity$5;->a:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Lcom/afollestad/materialdialogs/f$a;

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity$5;->b:Lcom/fodlam/yds/MainActivity;

    invoke-direct {v0, v1}, Lcom/afollestad/materialdialogs/f$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09038f

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity$5;->b:Lcom/fodlam/yds/MainActivity;

    const v2, 0x7f09038e

    invoke-virtual {v1, v2}, Lcom/fodlam/yds/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->b(Ljava/lang/CharSequence;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->b(Z)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->f(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f090056

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->g(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    new-instance v1, Lcom/fodlam/yds/MainActivity$5$2;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/MainActivity$5$2;-><init>(Lcom/fodlam/yds/MainActivity$5;)V

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(Lcom/afollestad/materialdialogs/f$j;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    new-instance v1, Lcom/fodlam/yds/MainActivity$5$1;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/MainActivity$5$1;-><init>(Lcom/fodlam/yds/MainActivity$5;)V

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->b(Lcom/afollestad/materialdialogs/f$j;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/f$a;->c()Lcom/afollestad/materialdialogs/f;

    return-void
.end method
