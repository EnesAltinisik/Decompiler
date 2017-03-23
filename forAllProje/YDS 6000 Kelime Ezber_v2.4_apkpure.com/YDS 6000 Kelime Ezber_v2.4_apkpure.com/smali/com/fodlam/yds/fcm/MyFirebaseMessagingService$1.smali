.class Lcom/fodlam/yds/fcm/MyFirebaseMessagingService$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/fcm/MyFirebaseMessagingService;->a(Lcom/google/firebase/messaging/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/fcm/MyFirebaseMessagingService;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/fcm/MyFirebaseMessagingService;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/fcm/MyFirebaseMessagingService$1;->a:Lcom/fodlam/yds/fcm/MyFirebaseMessagingService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    sget-object v0, Lcom/fodlam/yds/MainActivity;->m:Lcom/fodlam/yds/MainActivity;

    invoke-virtual {v0}, Lcom/fodlam/yds/MainActivity;->k()V

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/fcm/MyFirebaseMessagingService$1;->a:Lcom/fodlam/yds/fcm/MyFirebaseMessagingService;

    invoke-virtual {v1}, Lcom/fodlam/yds/fcm/MyFirebaseMessagingService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/Ringtone;->play()V

    :cond_0
    return-void
.end method
