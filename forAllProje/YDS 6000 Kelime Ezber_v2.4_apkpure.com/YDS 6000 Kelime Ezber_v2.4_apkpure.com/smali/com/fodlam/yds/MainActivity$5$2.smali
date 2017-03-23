.class Lcom/fodlam/yds/MainActivity$5$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/afollestad/materialdialogs/f$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/MainActivity$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/MainActivity$5;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/MainActivity$5;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/MainActivity$5$2;->a:Lcom/fodlam/yds/MainActivity$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/afollestad/materialdialogs/f;Lcom/afollestad/materialdialogs/b;)V
    .locals 2

    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/f;->dismiss()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "market://details?id=com.google.android.tts"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity$5$2;->a:Lcom/fodlam/yds/MainActivity$5;

    iget-object v1, v1, Lcom/fodlam/yds/MainActivity$5;->b:Lcom/fodlam/yds/MainActivity;

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
