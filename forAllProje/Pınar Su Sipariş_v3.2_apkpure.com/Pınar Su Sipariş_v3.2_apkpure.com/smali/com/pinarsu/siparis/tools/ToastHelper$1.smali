.class Lcom/pinarsu/siparis/tools/ToastHelper$1;
.super Ljava/lang/Object;
.source "ToastHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/tools/ToastHelper;->show()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/tools/ToastHelper;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/tools/ToastHelper;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/pinarsu/siparis/tools/ToastHelper$1;->this$0:Lcom/pinarsu/siparis/tools/ToastHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 34
    iget-object v0, p0, Lcom/pinarsu/siparis/tools/ToastHelper$1;->this$0:Lcom/pinarsu/siparis/tools/ToastHelper;

    # getter for: Lcom/pinarsu/siparis/tools/ToastHelper;->activity:Landroid/app/Activity;
    invoke-static {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->access$000(Lcom/pinarsu/siparis/tools/ToastHelper;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/pinarsu/siparis/tools/ToastHelper$1;->this$0:Lcom/pinarsu/siparis/tools/ToastHelper;

    # getter for: Lcom/pinarsu/siparis/tools/ToastHelper;->activity:Landroid/app/Activity;
    invoke-static {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->access$000(Lcom/pinarsu/siparis/tools/ToastHelper;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/tools/ToastHelper$1;->this$0:Lcom/pinarsu/siparis/tools/ToastHelper;

    # getter for: Lcom/pinarsu/siparis/tools/ToastHelper;->message:Ljava/lang/String;
    invoke-static {v1}, Lcom/pinarsu/siparis/tools/ToastHelper;->access$100(Lcom/pinarsu/siparis/tools/ToastHelper;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 38
    :goto_0
    return-void

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/tools/ToastHelper$1;->this$0:Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v0, v0, Lcom/pinarsu/siparis/tools/ToastHelper;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/pinarsu/siparis/tools/ToastHelper$1;->this$0:Lcom/pinarsu/siparis/tools/ToastHelper;

    # getter for: Lcom/pinarsu/siparis/tools/ToastHelper;->message:Ljava/lang/String;
    invoke-static {v1}, Lcom/pinarsu/siparis/tools/ToastHelper;->access$100(Lcom/pinarsu/siparis/tools/ToastHelper;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
