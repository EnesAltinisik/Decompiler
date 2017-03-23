.class public Lcom/pinarsu/siparis/gcm/GCMRegistrationService;
.super Landroid/app/IntentService;
.source "GCMRegistrationService.java"


# instance fields
.field private deviceId:Ljava/lang/String;

.field service:Lcom/pinarsu/siparis/interfaces/IServicePush;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    const-string v0, "GcmRegister"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->deviceId:Ljava/lang/String;

    .line 32
    return-void
.end method

.method private getPushToken(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 72
    sput-object p1, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    .line 73
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Preferences.PUSH_TOKEN :  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 75
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    .line 76
    if-nez v0, :cond_0

    .line 77
    const-string v0, ""

    .line 78
    :cond_0
    new-instance v1, Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;

    iget-object v2, p0, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->deviceId:Ljava/lang/String;

    sget-object v3, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v0}, Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->service:Lcom/pinarsu/siparis/interfaces/IServicePush;

    new-instance v2, Lcom/pinarsu/siparis/gcm/GCMRegistrationService$1;

    invoke-direct {v2, p0}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService$1;-><init>(Lcom/pinarsu/siparis/gcm/GCMRegistrationService;)V

    invoke-interface {v0, v1, v2}, Lcom/pinarsu/siparis/interfaces/IServicePush;->getPushToken(Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;Lretrofit/Callback;)V

    .line 94
    return-void
.end method

.method private register()V
    .locals 4

    .prologue
    .line 59
    :try_start_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/iid/InstanceID;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/iid/InstanceID;

    move-result-object v0

    .line 60
    const v1, 0x7f060079

    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "GCM"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/iid/InstanceID;->getToken(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    .line 61
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 63
    invoke-direct {p0, v0}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->getPushToken(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :cond_0
    :goto_0
    return-void

    .line 65
    :catch_0
    move-exception v0

    .line 66
    const-string v0, "MNTTAG"

    const-string v1, "IOException : "

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static startService(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 102
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 103
    return-void
.end method

.method public static stopService(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 97
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 98
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 3

    .prologue
    .line 40
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 41
    invoke-static {}, Lcom/pinarsu/siparis/tools/Tools;->getServicePush()Lcom/pinarsu/siparis/interfaces/IServicePush;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->service:Lcom/pinarsu/siparis/interfaces/IServicePush;

    .line 42
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->deviceId:Ljava/lang/String;

    .line 43
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deviceId : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->deviceId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 48
    const-string v0, "MNTTAG"

    const-string v1, "TOKEN almak i\u00e7in servis i\u00e7inde onHandleIntent"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    :cond_0
    invoke-direct {p0}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->register()V

    .line 55
    :goto_0
    return-void

    .line 53
    :cond_1
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->getPushToken(Ljava/lang/String;)V

    goto :goto_0
.end method
