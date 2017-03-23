.class public Lcom/fodlam/yds/OxfordApplication;
.super Landroid/app/Application;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/OxfordApplication$a;
    }
.end annotation


# static fields
.field public static a:I

.field public static b:Z

.field public static c:Ljava/lang/String;

.field public static d:Z

.field public static e:Z

.field public static f:Z

.field public static g:I

.field public static h:Lcom/fodlam/yds/OxfordApplication$a;

.field public static i:I

.field public static j:I

.field public static k:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    const/16 v0, 0x8

    sput v0, Lcom/fodlam/yds/OxfordApplication;->a:I

    sput-boolean v1, Lcom/fodlam/yds/OxfordApplication;->b:Z

    const-string v0, "tr"

    sput-object v0, Lcom/fodlam/yds/OxfordApplication;->c:Ljava/lang/String;

    sput-boolean v2, Lcom/fodlam/yds/OxfordApplication;->d:Z

    sput-boolean v2, Lcom/fodlam/yds/OxfordApplication;->e:Z

    sput-boolean v2, Lcom/fodlam/yds/OxfordApplication;->f:Z

    sput v1, Lcom/fodlam/yds/OxfordApplication;->g:I

    sget-object v0, Lcom/fodlam/yds/OxfordApplication$a;->a:Lcom/fodlam/yds/OxfordApplication$a;

    sput-object v0, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sput v1, Lcom/fodlam/yds/OxfordApplication;->i:I

    sput v1, Lcom/fodlam/yds/OxfordApplication;->j:I

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/fodlam/yds/OxfordApplication;->k:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 4

    invoke-static {}, Lcom/fodlam/yds/OxfordApplication$a;->values()[Lcom/fodlam/yds/OxfordApplication$a;

    move-result-object v1

    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v2, v1, v0

    sget-object v3, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v2, v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    array-length v2, v1

    rem-int/2addr v0, v2

    aget-object v0, v1, v0

    sput-object v0, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    :cond_0
    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    invoke-static {p0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/fodlam/yds/c/b;->a(Landroid/content/Context;Z)Lcom/fodlam/yds/c/b;

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->b(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->c(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/fodlam/yds/alarms/a;->a(Landroid/content/Context;)V

    :cond_0
    const v0, 0x7f09004a

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/ads/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static b()V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/b;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    :goto_0
    const/4 v0, 0x0

    :try_start_1
    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->f()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :goto_1
    const/4 v0, 0x0

    :try_start_2
    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/a;->a()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_2
    :try_start_3
    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->h()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :goto_3
    return-void

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "CurrentCategory"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lcom/fodlam/yds/OxfordApplication;->g:I

    const-string v1, "CurrentTest"

    const-string v2, "LEARNING"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/fodlam/yds/OxfordApplication$a;->valueOf(Ljava/lang/String;)Lcom/fodlam/yds/OxfordApplication$a;

    move-result-object v1

    sput-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    const-string v1, "CurrentTestId"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lcom/fodlam/yds/OxfordApplication;->i:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/fodlam/yds/OxfordApplication;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".LatestTestId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lcom/fodlam/yds/OxfordApplication;->j:I

    const-string v1, "test_wrong_vibrate"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Lcom/fodlam/yds/OxfordApplication;->e:Z

    const-string v1, "remind_me"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lcom/fodlam/yds/OxfordApplication;->k:Ljava/lang/Boolean;

    const-string v1, "test_sound_on"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Lcom/fodlam/yds/OxfordApplication;->d:Z

    const-string v1, "testthreshold"

    const-string v2, "8"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/fodlam/yds/OxfordApplication;->a:I

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 4

    const/4 v3, 0x1

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v1

    sget-boolean v2, Lcom/fodlam/yds/OxfordApplication;->b:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1, v3}, Lcom/fodlam/yds/c/b;->b(I)V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/fodlam/yds/c/b;->b(I)V

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "is_intermediate_enabled"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "is_advanced_enabled"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 7

    const/4 v6, 0x0

    const/4 v5, 0x1

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "com.fodlam.yds.noads"

    const-string v3, "noone"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.fodlam.yds.full"

    const-string v4, "noone"

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.fodlam.yds"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    sput-boolean v6, Lcom/fodlam/yds/OxfordApplication;->f:Z

    sput-boolean v5, Lcom/fodlam/yds/OxfordApplication;->b:Z

    invoke-virtual {v0, v6}, Lcom/fodlam/yds/c/b;->b(I)V

    invoke-virtual {v0, v5}, Lcom/fodlam/yds/c/b;->b(I)V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/fodlam/yds/c/b;->b(I)V

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "is_intermediate_enabled"

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "is_advanced_enabled"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    :cond_2
    const-string v0, "com.fodlam.yds"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sput-boolean v6, Lcom/fodlam/yds/OxfordApplication;->f:Z

    goto :goto_0
.end method

.method public static e(Landroid/content/Context;)V
    .locals 4

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "CurrentTest"

    sget-object v3, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v3}, Lcom/fodlam/yds/OxfordApplication$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "CurrentTestId"

    sget v2, Lcom/fodlam/yds/OxfordApplication;->i:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    invoke-static {p0}, Landroid/support/b/a;->a(Landroid/content/Context;)V

    new-instance v0, Lcom/fodlam/yds/b;

    invoke-direct {v0}, Lcom/fodlam/yds/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/OxfordApplication;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
