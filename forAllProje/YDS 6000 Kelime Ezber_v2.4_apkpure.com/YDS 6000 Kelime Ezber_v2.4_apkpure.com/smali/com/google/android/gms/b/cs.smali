.class public final Lcom/google/android/gms/b/cs;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/cs$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/cs$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/cs$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/b/cs;->a:Lcom/google/android/gms/b/cs$a;

    return-void
.end method

.method public static a(Landroid/content/Context;Z)Z
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    const-string v0, "com.google.android.gms.measurement.PackageMeasurementReceiver"

    :goto_0
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/b/dl;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "com.google.android.gms.measurement.AppMeasurementReceiver"

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12

    const-wide/16 v10, 0x0

    invoke-static {p1}, Lcom/google/android/gms/b/cv;->a(Landroid/content/Context;)Lcom/google/android/gms/b/cv;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v8

    if-nez p2, :cond_1

    invoke-virtual {v8}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Receiver called with null intent"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Local receiver got"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/b/dd;->a(Landroid/content/Context;Z)Z

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/b/cs;->a:Lcom/google/android/gms/b/cs$a;

    invoke-interface {v1, p1, v0}, Lcom/google/android/gms/b/cs$a;->a(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    const-string v1, "com.android.vending.INSTALL_REFERRER"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "referrer"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {v8}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Install referrer extras are null"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/dl;->a(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v6

    if-nez v6, :cond_4

    invoke-virtual {v8}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "No campaign defined in install referrer broadcast"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string v0, "referrer_timestamp_seconds"

    invoke-virtual {p2, v0, v10, v11}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, v0

    cmp-long v0, v4, v10

    if-nez v0, :cond_5

    invoke-virtual {v8}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Install referrer is missing timestamp"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v3}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cs$1;

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/b/cs$1;-><init>(Lcom/google/android/gms/b/cs;Lcom/google/android/gms/b/cv;JLandroid/os/Bundle;Landroid/content/Context;Lcom/google/android/gms/b/co;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0
.end method
