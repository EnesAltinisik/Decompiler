.class public Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;
.super Landroid/os/AsyncTask;
.source "ServiceBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/api/service/ServiceBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Retrieve2"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final activity:Landroid/support/v7/app/AppCompatActivity;

.field final progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

.field final serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

.field final synthetic this$0:Lcom/pinarsu/siparis/api/service/ServiceBase;


# direct methods
.method public constructor <init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V
    .locals 1

    .prologue
    .line 252
    iput-object p1, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->this$0:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 253
    iput-object p2, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

    .line 254
    iput-object p3, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->activity:Landroid/support/v7/app/AppCompatActivity;

    .line 255
    invoke-static {}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->newInstance()Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    .line 256
    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 247
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    .prologue
    .line 274
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->this$0:Lcom/pinarsu/siparis/api/service/ServiceBase;

    iget-object v1, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

    # invokes: Lcom/pinarsu/siparis/api/service/ServiceBase;->request(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    invoke-static {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase;->access$100(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;)V

    .line 275
    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 247
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 2

    .prologue
    .line 280
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 282
    :try_start_0
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 287
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->this$0:Lcom/pinarsu/siparis/api/service/ServiceBase;

    # getter for: Lcom/pinarsu/siparis/api/service/ServiceBase;->delegate:Lcom/pinarsu/siparis/interfaces/IServiceResponse;
    invoke-static {v0}, Lcom/pinarsu/siparis/api/service/ServiceBase;->access$200(Lcom/pinarsu/siparis/api/service/ServiceBase;)Lcom/pinarsu/siparis/interfaces/IServiceResponse;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

    invoke-interface {v0, v1}, Lcom/pinarsu/siparis/interfaces/IServiceResponse;->onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V

    .line 289
    return-void

    .line 283
    :catch_0
    move-exception v0

    .line 284
    const-string v0, "MNTTAG"

    const-string v1, "progressDialogFragment.dismiss() error"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 260
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 263
    :try_start_0
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    iget-object v1, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->activity:Landroid/support/v7/app/AppCompatActivity;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    :goto_0
    return-void

    .line 264
    :catch_0
    move-exception v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    .line 266
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->cancel(Z)Z

    goto :goto_0
.end method
