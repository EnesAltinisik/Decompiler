.class public Lcom/pinarsu/siparis/Preferences;
.super Ljava/lang/Object;
.source "Preferences.java"


# static fields
.field public static ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES; = null

.field private static final HOME_LAST_ORDER_POPUP_VIEWED_KEY:Ljava/lang/String; = "home_last_order_popup_viewed"

.field public static HOME_ORDER_POPUP_VIEWED:Z = false

.field public static LAST_ORDER_POPUP_VIEWED:Z = false

.field private static final LAST_ORDER_POPUP_VIEWED_KEY:Ljava/lang/String; = "last_order_popup_viewed"

.field public static PHONE_NUMBER:Ljava/lang/String; = null

.field private static final PHONE_NUMBER_KEY:Ljava/lang/String; = "phone_number"

.field private static final PREFERENCES_KEY:Ljava/lang/String; = "preferences"

.field public static PUSH_TOKEN:Ljava/lang/String; = null

.field private static final PUSH_TOKEN_KEY:Ljava/lang/String; = "gcm_token"

.field private static final USER_INFO_KEY:Ljava/lang/String; = "user_info"

.field public static isFIRST_OPEN_APP:Z = false

.field private static final isFIRST_OPEN_APP_KEY:Ljava/lang/String; = "tutorial"

.field public static isPUSH:Z = false

.field private static final isPUSH_KEY:Ljava/lang/String; = "push"

.field public static isPinningAllowed:Z


# instance fields
.field private prefs:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 18
    sput-boolean v1, Lcom/pinarsu/siparis/Preferences;->isPinningAllowed:Z

    .line 30
    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->HOME_ORDER_POPUP_VIEWED:Z

    .line 31
    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->LAST_ORDER_POPUP_VIEWED:Z

    .line 32
    const-string v0, ""

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    .line 33
    sput-boolean v1, Lcom/pinarsu/siparis/Preferences;->isPUSH:Z

    .line 34
    sput-boolean v1, Lcom/pinarsu/siparis/Preferences;->isFIRST_OPEN_APP:Z

    .line 38
    const-string v0, ""

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const-string v0, "preferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 44
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 109
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 110
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 111
    return-void
.end method

.method public read()V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 78
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "tutorial"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->isFIRST_OPEN_APP:Z

    .line 79
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "push"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->isPUSH:Z

    .line 81
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "user_info"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 82
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 85
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 86
    const-class v2, Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "phone_number"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    .line 95
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "gcm_token"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    .line 96
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "last_order_popup_viewed"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->LAST_ORDER_POPUP_VIEWED:Z

    .line 97
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "home_last_order_popup_viewed"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->HOME_ORDER_POPUP_VIEWED:Z

    .line 98
    const-string v0, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "read() isFIRST_OPEN_APP : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lcom/pinarsu/siparis/Preferences;->isFIRST_OPEN_APP:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    const-string v0, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "read() JSON_ADDRESS : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "read() PHONE_NUMBER : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "read() PUSH_TOKEN : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    return-void

    .line 87
    :catch_0
    move-exception v0

    .line 88
    sput-object v3, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    goto/16 :goto_0

    .line 91
    :cond_0
    sput-object v3, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    goto/16 :goto_0
.end method

.method public save()V
    .locals 4

    .prologue
    .line 51
    iget-object v0, p0, Lcom/pinarsu/siparis/Preferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 52
    const-string v0, "tutorial"

    sget-boolean v2, Lcom/pinarsu/siparis/Preferences;->isFIRST_OPEN_APP:Z

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 53
    const-string v0, "push"

    sget-boolean v2, Lcom/pinarsu/siparis/Preferences;->isPUSH:Z

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 54
    const-string v0, "gcm_token"

    sget-object v2, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 56
    const-string v0, ""

    .line 57
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    .line 59
    sget-object v3, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    if-eqz v3, :cond_0

    .line 60
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 62
    :cond_0
    const-string v2, "user_info"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 63
    const-string v2, "phone_number"

    sget-object v3, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 64
    const-string v2, "last_order_popup_viewed"

    sget-boolean v3, Lcom/pinarsu/siparis/Preferences;->LAST_ORDER_POPUP_VIEWED:Z

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 65
    const-string v2, "home_last_order_popup_viewed"

    sget-boolean v3, Lcom/pinarsu/siparis/Preferences;->HOME_ORDER_POPUP_VIEWED:Z

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 67
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 68
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "save() isFIRST_OPEN_APP : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lcom/pinarsu/siparis/Preferences;->isFIRST_OPEN_APP:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "save() JSON_ADDRESS : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "save() PHONE_NUMBER : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    return-void
.end method
