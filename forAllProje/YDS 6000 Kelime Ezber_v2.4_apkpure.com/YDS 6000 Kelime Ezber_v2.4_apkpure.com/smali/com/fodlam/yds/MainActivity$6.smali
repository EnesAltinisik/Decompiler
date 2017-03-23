.class Lcom/fodlam/yds/MainActivity$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/MainActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/f/h;

.field final synthetic b:Lcom/afollestad/materialdialogs/f;

.field final synthetic c:Lcom/fodlam/yds/MainActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/MainActivity;Lcom/fodlam/yds/f/h;Lcom/afollestad/materialdialogs/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/MainActivity$6;->c:Lcom/fodlam/yds/MainActivity;

    iput-object p2, p0, Lcom/fodlam/yds/MainActivity$6;->a:Lcom/fodlam/yds/f/h;

    iput-object p3, p0, Lcom/fodlam/yds/MainActivity$6;->b:Lcom/afollestad/materialdialogs/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity$6;->c:Lcom/fodlam/yds/MainActivity;

    const-class v2, Lcom/fodlam/yds/WordLearningActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "notifyword"

    iget-object v2, p0, Lcom/fodlam/yds/MainActivity$6;->a:Lcom/fodlam/yds/f/h;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity$6;->c:Lcom/fodlam/yds/MainActivity;

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity$6;->b:Lcom/afollestad/materialdialogs/f;

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/f;->dismiss()V

    return-void
.end method
