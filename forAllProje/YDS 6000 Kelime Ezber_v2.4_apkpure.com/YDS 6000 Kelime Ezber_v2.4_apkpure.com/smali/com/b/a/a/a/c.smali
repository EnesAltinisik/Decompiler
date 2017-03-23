.class public Lcom/b/a/a/a/c;
.super Lcom/b/a/a/a/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/b/a/a/a/c$a;,
        Lcom/b/a/a/a/c$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Date;

.field private static final b:Ljava/util/Date;


# instance fields
.field private c:Lcom/a/a/a/a;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lcom/b/a/a/a/b;

.field private g:Lcom/b/a/a/a/b;

.field private h:Lcom/b/a/a/a/c$b;

.field private i:Ljava/lang/String;

.field private j:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/Date;

    const/16 v1, 0x7dc

    const/16 v2, 0xc

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Ljava/util/Date;-><init>(III)V

    sput-object v0, Lcom/b/a/a/a/c;->a:Ljava/util/Date;

    new-instance v0, Ljava/util/Date;

    const/16 v1, 0x7df

    const/4 v2, 0x7

    const/16 v3, 0x14

    invoke-direct {v0, v1, v2, v3}, Ljava/util/Date;-><init>(III)V

    sput-object v0, Lcom/b/a/a/a/c;->b:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/b/a/a/a/c$b;)V
    .locals 3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/b/a/a/a/a;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/b/a/a/a/c$1;

    invoke-direct {v0, p0}, Lcom/b/a/a/a/c$1;-><init>(Lcom/b/a/a/a/c;)V

    iput-object v0, p0, Lcom/b/a/a/a/c;->j:Landroid/content/ServiceConnection;

    iput-object p2, p0, Lcom/b/a/a/a/c;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a/a/c;->d:Ljava/lang/String;

    new-instance v0, Lcom/b/a/a/a/b;

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->a()Landroid/content/Context;

    move-result-object v1

    const-string v2, ".products.cache.v2_6"

    invoke-direct {v0, v1, v2}, Lcom/b/a/a/a/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/b/a/a/a/c;->f:Lcom/b/a/a/a/b;

    new-instance v0, Lcom/b/a/a/a/b;

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->a()Landroid/content/Context;

    move-result-object v1

    const-string v2, ".subscriptions.cache.v2_6"

    invoke-direct {v0, v1, v2}, Lcom/b/a/a/a/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/b/a/a/a/c;->g:Lcom/b/a/a/a/b;

    iput-object p3, p0, Lcom/b/a/a/a/c;->i:Ljava/lang/String;

    invoke-direct {p0}, Lcom/b/a/a/a/c;->g()V

    return-void
.end method

.method static synthetic a(Lcom/b/a/a/a/c;Lcom/a/a/a/a;)Lcom/a/a/a/a;
    .locals 0

    iput-object p1, p0, Lcom/b/a/a/a/c;->c:Lcom/a/a/a/a;

    return-object p1
.end method

.method private a(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "developerPayload"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "developerPayload"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    :goto_1
    return-object v0

    :catch_0
    move-exception v1

    const-string v1, "iabv3"

    const-string v2, "Failed to extract developer payload value!"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string v0, ""

    goto :goto_1
.end method

.method private a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/b/a/a/a/c;->a(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private a(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    const/4 v7, 0x0

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v7

    :goto_0
    return v0

    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v0, "subs"

    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_2
    if-eqz p5, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_3
    invoke-direct {p0, v6}, Lcom/b/a/a/a/c;->e(Ljava/lang/String;)V

    if-eqz p2, :cond_5

    const-string v0, "subs"

    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/b/a/a/a/c;->c:Lcom/a/a/a/a;

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/b/a/a/a/c;->d:Ljava/lang/String;

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v6}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_4

    const-string v1, "RESPONSE_CODE"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "BUY_INTENT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    if-eqz p1, :cond_6

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    const/16 v2, 0x7ecb

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    :cond_4
    :goto_2
    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_5
    iget-object v1, p0, Lcom/b/a/a/a/c;->c:Lcom/a/a/a/a;

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/b/a/a/a/c;->d:Ljava/lang/String;

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v1 .. v6}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v1, 0x67

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "iabv3"

    const-string v2, "Error in purchase"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v2, 0x6e

    invoke-interface {v1, v2, v0}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V

    :cond_7
    move v0, v7

    goto/16 :goto_0

    :cond_8
    const/4 v0, 0x7

    if-ne v1, v0, :cond_d

    :try_start_1
    invoke-virtual {p0, p3}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0, p3}, Lcom/b/a/a/a/c;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->e()Z

    :cond_9
    invoke-virtual {p0, p3}, Lcom/b/a/a/a/c;->c(Ljava/lang/String;)Lcom/b/a/a/a/h;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/b/a/a/a/c;->a(Lcom/b/a/a/a/h;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v0, "iabv3"

    const-string v1, "Invalid or tampered merchant id!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v1, 0x68

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V

    :cond_a
    move v0, v7

    goto/16 :goto_0

    :cond_b
    iget-object v1, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v1, :cond_4

    if-nez v0, :cond_c

    invoke-virtual {p0, p3}, Lcom/b/a/a/a/c;->d(Ljava/lang/String;)Lcom/b/a/a/a/h;

    move-result-object v0

    :cond_c
    iget-object v1, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    invoke-interface {v1, p3, v0}, Lcom/b/a/a/a/c$b;->a(Ljava/lang/String;Lcom/b/a/a/a/h;)V

    goto :goto_2

    :cond_d
    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v1, 0x65

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {}, Lcom/b/a/a/a/c;->f()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method static synthetic a(Lcom/b/a/a/a/c;)Z
    .locals 1

    invoke-direct {p0}, Lcom/b/a/a/a/c;->h()Z

    move-result v0

    return v0
.end method

.method private a(Lcom/b/a/a/a/h;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/b/a/a/a/c;->i:Ljava/lang/String;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v2, p1, Lcom/b/a/a/a/h;->d:Ljava/util/Date;

    sget-object v3, Lcom/b/a/a/a/c;->a:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p1, Lcom/b/a/a/a/h;->d:Ljava/util/Date;

    sget-object v3, Lcom/b/a/a/a/c;->b:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p1, Lcom/b/a/a/a/h;->b:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, p1, Lcom/b/a/a/a/h;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lcom/b/a/a/a/h;->b:Ljava/lang/String;

    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-gtz v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v3, p1, Lcom/b/a/a/a/h;->b:Ljava/lang/String;

    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/b/a/a/a/c;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Lcom/b/a/a/a/b;)Z
    .locals 9

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/b/a/a/a/c;->c:Lcom/a/a/a/a;

    const/4 v1, 0x3

    iget-object v4, p0, Lcom/b/a/a/a/c;->d:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-interface {v0, v1, v4, p1, v5}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "RESPONSE_CODE"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p2}, Lcom/b/a/a/a/b;->c()V

    const-string v1, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    const-string v1, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    if-eqz v5, :cond_3

    move v4, v2

    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v4, :cond_2

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :goto_2
    const-string v8, "productId"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7, v0, v1}, Lcom/b/a/a/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_1

    :cond_2
    move-object v1, v3

    goto :goto_2

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v3, 0x64

    invoke-interface {v1, v3, v0}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V

    :cond_4
    const-string v1, "iabv3"

    const-string v3, "Error in loadPurchasesByType"

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move v0, v2

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/b/a/a/a/c;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/b/a/a/a/c;->e:Ljava/lang/String;

    invoke-static {p1, v1, p2, p3}, Lcom/b/a/a/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private b(Ljava/lang/String;Lcom/b/a/a/a/b;)Lcom/b/a/a/a/h;
    .locals 4

    invoke-virtual {p2, p1}, Lcom/b/a/a/a/b;->b(Ljava/lang/String;)Lcom/b/a/a/a/e;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, v1, Lcom/b/a/a/a/e;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lcom/b/a/a/a/h;

    invoke-direct {v0, v1}, Lcom/b/a/a/a/h;-><init>(Lcom/b/a/a/a/e;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "iabv3"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to load saved purchase details for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/b/a/a/a/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/b/a/a/a/c;->i()V

    return-void
.end method

.method static synthetic c(Lcom/b/a/a/a/c;)Lcom/b/a/a/a/c$b;
    .locals 1

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    return-object v0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".purchase.last.v2_6"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method

.method private static f()Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method private g()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/b/a/a/a/c;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/b/a/a/a/c;->f()Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lcom/b/a/a/a/c;->j:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "iabv3"

    const-string v2, "error in bindPlayServices"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v2, 0x71

    invoke-interface {v1, v2, v0}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V

    goto :goto_0
.end method

.method private h()Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".products.restored.v2_6"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private i()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".products.restored.v2_6"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    return-void
.end method

.method private j()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".purchase.last.v2_6"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/b/a/a/a/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)Z
    .locals 8

    const/4 v5, 0x2

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    const/16 v2, 0x7ecb

    if-eq p1, v2, :cond_0

    :goto_0
    return v0

    :cond_0
    if-nez p3, :cond_1

    const-string v1, "iabv3"

    const-string v2, "handleActivityResult: data is null!"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string v2, "RESPONSE_CODE"

    invoke-virtual {p3, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "iabv3"

    const-string v4, "resultCode = %d, responseCode = %d"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/b/a/a/a/c;->j()Ljava/lang/String;

    move-result-object v0

    const/4 v3, -0x1

    if-ne p2, v3, :cond_6

    if-nez v2, :cond_6

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v2, "INAPP_PURCHASE_DATA"

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "INAPP_DATA_SIGNATURE"

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v5, "productId"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v4}, Lcom/b/a/a/a/c;->a(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "subs"

    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    invoke-direct {p0, v0, v4}, Lcom/b/a/a/a/c;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-direct {p0, v5, v2, v3}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz v6, :cond_3

    iget-object v0, p0, Lcom/b/a/a/a/c;->g:Lcom/b/a/a/a/b;

    :goto_1
    invoke-virtual {v0, v5, v2, v3}, Lcom/b/a/a/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    new-instance v4, Lcom/b/a/a/a/h;

    new-instance v6, Lcom/b/a/a/a/e;

    invoke-direct {v6, v2, v3}, Lcom/b/a/a/a/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4, v6}, Lcom/b/a/a/a/h;-><init>(Lcom/b/a/a/a/e;)V

    invoke-interface {v0, v5, v4}, Lcom/b/a/a/a/c$b;->a(Ljava/lang/String;Lcom/b/a/a/a/h;)V

    :cond_2
    :goto_2
    move v0, v1

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/b/a/a/a/c;->f:Lcom/b/a/a/a/b;

    goto :goto_1

    :cond_4
    const-string v0, "iabv3"

    const-string v2, "Public key signature doesn\'t match!"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v2, 0x66

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v2, "iabv3"

    const-string v3, "Error in handleActivityResult"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v2, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v3, 0x6e

    invoke-interface {v2, v3, v0}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :try_start_1
    const-string v2, "iabv3"

    const-string v3, "Payload mismatch: %s != %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    const/16 v2, 0x69

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/b/a/a/a/c;->h:Lcom/b/a/a/a/c$b;

    invoke-interface {v0, v2, v7}, Lcom/b/a/a/a/c$b;->a(ILjava/lang/Throwable;)V

    goto :goto_2
.end method

.method public a(Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "inapp"

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/b/a/a/a/c;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/b/a/a/a/c;->f:Lcom/b/a/a/a/b;

    invoke-virtual {v0, p1}, Lcom/b/a/a/a/b;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/b/a/a/a/c;->g:Lcom/b/a/a/a/b;

    invoke-virtual {v0, p1}, Lcom/b/a/a/a/b;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)Lcom/b/a/a/a/h;
    .locals 1

    iget-object v0, p0, Lcom/b/a/a/a/c;->f:Lcom/b/a/a/a/b;

    invoke-direct {p0, p1, v0}, Lcom/b/a/a/a/c;->b(Ljava/lang/String;Lcom/b/a/a/a/b;)Lcom/b/a/a/a/h;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 3

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/a/a/c;->j:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/b/a/a/a/c;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/b/a/a/a/c;->j:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/b/a/a/a/c;->c:Lcom/a/a/a/a;

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "iabv3"

    const-string v2, "Error in release"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public d(Ljava/lang/String;)Lcom/b/a/a/a/h;
    .locals 1

    iget-object v0, p0, Lcom/b/a/a/a/c;->g:Lcom/b/a/a/a/b;

    invoke-direct {p0, p1, v0}, Lcom/b/a/a/a/c;->b(Ljava/lang/String;Lcom/b/a/a/a/b;)Lcom/b/a/a/a/h;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/b/a/a/a/c;->c:Lcom/a/a/a/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Z
    .locals 2

    invoke-virtual {p0}, Lcom/b/a/a/a/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "inapp"

    iget-object v1, p0, Lcom/b/a/a/a/c;->f:Lcom/b/a/a/a/b;

    invoke-direct {p0, v0, v1}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;Lcom/b/a/a/a/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "subs"

    iget-object v1, p0, Lcom/b/a/a/a/c;->g:Lcom/b/a/a/a/b;

    invoke-direct {p0, v0, v1}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;Lcom/b/a/a/a/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
