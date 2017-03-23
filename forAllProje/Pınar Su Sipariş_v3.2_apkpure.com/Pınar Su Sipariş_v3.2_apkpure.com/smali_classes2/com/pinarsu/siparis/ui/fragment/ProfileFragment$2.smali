.class Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;
.super Ljava/lang/Object;
.source "ProfileFragment.java"

# interfaces
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->changeStatus(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit/Callback",
        "<",
        "Lcom/pinarsu/siparis/model/PushServiceResponseItem;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

.field final synthetic val$isChecked:Z


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;Z)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    iput-boolean p2, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->val$isChecked:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 3

    .prologue
    .line 134
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->access$100(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->dismiss()V

    .line 135
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RetrofitError error : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lretrofit/RetrofitError;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    iget-object v1, v1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v2, "Bildirim izni kaydedilemedi!"

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 137
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->toggleButton:Landroid/widget/ToggleButton;

    sget-boolean v1, Lcom/pinarsu/siparis/Preferences;->isPUSH:Z

    invoke-virtual {v0, v1}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 139
    return-void
.end method

.method public success(Lcom/pinarsu/siparis/model/PushServiceResponseItem;Lretrofit/client/Response;)V
    .locals 3

    .prologue
    .line 118
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->progressDialogFragment:Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->access$100(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/ProgressDialogFragment;->dismiss()V

    .line 119
    invoke-virtual {p1}, Lcom/pinarsu/siparis/model/PushServiceResponseItem;->getSucceed()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 120
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    iget-object v1, v1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v2, "Bildirim izni kaydedildi."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 121
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->val$isChecked:Z

    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->isPUSH:Z

    .line 122
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 130
    :goto_0
    return-void

    .line 126
    :cond_0
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    iget-object v1, v1, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v2, "Bildirim izni kaydedilemedi!"

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 127
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->toggleButton:Landroid/widget/ToggleButton;

    sget-boolean v1, Lcom/pinarsu/siparis/Preferences;->isPUSH:Z

    invoke-virtual {v0, v1}, Landroid/widget/ToggleButton;->setChecked(Z)V

    goto :goto_0
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .prologue
    .line 115
    check-cast p1, Lcom/pinarsu/siparis/model/PushServiceResponseItem;

    invoke-virtual {p0, p1, p2}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$2;->success(Lcom/pinarsu/siparis/model/PushServiceResponseItem;Lretrofit/client/Response;)V

    return-void
.end method
