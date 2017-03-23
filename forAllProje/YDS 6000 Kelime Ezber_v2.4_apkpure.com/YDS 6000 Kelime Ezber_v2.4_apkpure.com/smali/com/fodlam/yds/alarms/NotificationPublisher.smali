.class public Lcom/fodlam/yds/alarms/NotificationPublisher;
.super Landroid/content/BroadcastReceiver;


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "notification-yds-id"

    sput-object v0, Lcom/fodlam/yds/alarms/NotificationPublisher;->a:Ljava/lang/String;

    const-string v0, "notification-yds"

    sput-object v0, Lcom/fodlam/yds/alarms/NotificationPublisher;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    const/4 v3, 0x0

    invoke-static {}, Lcom/fodlam/yds/b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v0}, Lcom/fodlam/yds/utility/c;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "is_today_remind_me_worked"

    const-string v1, "day"

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v1, 0x1

    move v2, v1

    :goto_1
    if-eqz v2, :cond_3

    invoke-static {p1}, Lcom/fodlam/yds/OxfordApplication;->b(Landroid/content/Context;)V

    invoke-static {p1, v3}, Lcom/fodlam/yds/c/b;->a(Landroid/content/Context;Z)Lcom/fodlam/yds/c/b;

    move-result-object v0

    move-object v1, v0

    :goto_2
    invoke-virtual {v1}, Lcom/fodlam/yds/c/b;->e()Lcom/fodlam/yds/f/h;

    move-result-object v7

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    invoke-static {p1, v7}, Lcom/fodlam/yds/alarms/a;->a(Landroid/content/Context;Lcom/fodlam/yds/f/h;)Landroid/app/Notification;

    move-result-object v7

    sget-object v8, Lcom/fodlam/yds/alarms/NotificationPublisher;->a:Ljava/lang/String;

    invoke-virtual {p2, v8, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const-string v8, "notifications_new_message_ringtone"

    const-string v9, "content://settings/system/notification_sound"

    invoke-interface {v4, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    iput-object v4, v7, Landroid/app/Notification;->sound:Landroid/net/Uri;

    invoke-virtual {v0, v3, v7}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    const-string v0, "is_today_remind_me_worked"

    invoke-interface {v5, v0, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/fodlam/yds/c/b;->h()V

    goto :goto_0

    :cond_2
    move v2, v3

    goto :goto_1

    :cond_3
    move-object v1, v0

    goto :goto_2
.end method
