.class public Lcom/google/android/gms/b/vr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/vr$b;,
        Lcom/google/android/gms/b/vr$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/google/android/gms/b/yu;",
        ">;"
    }
.end annotation


# static fields
.field static a:J


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/b/zp;

.field private final d:Lcom/google/android/gms/ads/internal/r;

.field private final e:Lcom/google/android/gms/b/dp;

.field private final f:Lcom/google/android/gms/b/vq;

.field private final g:Ljava/lang/Object;

.field private final h:Lcom/google/android/gms/b/yu$a;

.field private final i:Lcom/google/android/gms/b/qa;

.field private j:Z

.field private k:I

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/b/vr;->a:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/zp;Lcom/google/android/gms/b/dp;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/qa;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/vr;->g:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/b/vr;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/b/vr;->d:Lcom/google/android/gms/ads/internal/r;

    iput-object p3, p0, Lcom/google/android/gms/b/vr;->c:Lcom/google/android/gms/b/zp;

    iput-object p5, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iput-object p4, p0, Lcom/google/android/gms/b/vr;->e:Lcom/google/android/gms/b/dp;

    iput-object p6, p0, Lcom/google/android/gms/b/vr;->i:Lcom/google/android/gms/b/qa;

    invoke-virtual {p0, p1, p5, p2, p4}, Lcom/google/android/gms/b/vr;->a(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/dp;)Lcom/google/android/gms/b/vq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/vr;->f:Lcom/google/android/gms/b/vq;

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->f:Lcom/google/android/gms/b/vq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/vq;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/vr;->j:Z

    const/4 v0, -0x2

    iput v0, p0, Lcom/google/android/gms/b/vr;->k:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/vr;->l:Ljava/util/List;

    return-void
.end method

.method private a(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/b/aag;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "ZZ)",
            "Lcom/google/android/gms/b/aag",
            "<",
            "Lcom/google/android/gms/b/qj;",
            ">;"
        }
    .end annotation

    const/4 v8, 0x0

    if-eqz p2, :cond_0

    const-string v0, "url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :goto_0
    const-string v0, "scale"

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p1, v0, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    const-string v0, "is_transparent"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/b/vr;->a(IZ)V

    new-instance v0, Lcom/google/android/gms/b/aae;

    invoke-direct {v0, v8}, Lcom/google/android/gms/b/aae;-><init>(Ljava/lang/Object;)V

    :goto_1
    return-object v0

    :cond_0
    const-string v0, "url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    new-instance v0, Lcom/google/android/gms/b/aae;

    new-instance v1, Lcom/google/android/gms/b/qj;

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, v8, v2, v4, v5}, Lcom/google/android/gms/b/qj;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;D)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/aae;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/vr;->c:Lcom/google/android/gms/b/zp;

    new-instance v1, Lcom/google/android/gms/b/vr$6;

    move-object v2, p0

    move v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/b/vr$6;-><init>(Lcom/google/android/gms/b/vr;ZDZLjava/lang/String;)V

    invoke-virtual {v0, v7, v1}, Lcom/google/android/gms/b/zp;->a(Ljava/lang/String;Lcom/google/android/gms/b/zp$a;)Lcom/google/android/gms/b/aag;

    move-result-object v0

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/b/vr$a;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/b/qp$a;
    .locals 9

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/vr;->b()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return-object v1

    :cond_1
    const-string v0, "tracking_urls_and_actions"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v0, "impression_tracking_urls"

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/b/vr;->c(Lorg/json/JSONObject;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, v1

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/b/vr;->l:Ljava/util/List;

    const-string v0, "active_view"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/vr;->m:Lorg/json/JSONObject;

    invoke-interface {p1, p0, p2}, Lcom/google/android/gms/b/vr$a;->a(Lcom/google/android/gms/b/vr;Lorg/json/JSONObject;)Lcom/google/android/gms/b/qp$a;

    move-result-object v6

    if-nez v6, :cond_3

    const-string v0, "Failed to retrieve ad assets."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/google/android/gms/b/qq;

    iget-object v1, p0, Lcom/google/android/gms/b/vr;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/b/vr;->d:Lcom/google/android/gms/ads/internal/r;

    iget-object v3, p0, Lcom/google/android/gms/b/vr;->f:Lcom/google/android/gms/b/vq;

    iget-object v4, p0, Lcom/google/android/gms/b/vr;->e:Lcom/google/android/gms/b/dp;

    iget-object v5, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v5, v5, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v7, v5, Lcom/google/android/gms/b/wf;->k:Lcom/google/android/gms/b/aab;

    move-object v5, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/b/qq;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/vq;Lcom/google/android/gms/b/dp;Lorg/json/JSONObject;Lcom/google/android/gms/b/qp$a;Lcom/google/android/gms/b/aab;Ljava/lang/String;)V

    invoke-interface {v6, v0}, Lcom/google/android/gms/b/qp$a;->a(Lcom/google/android/gms/b/qp;)V

    move-object v1, v6

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/vr;)Lcom/google/android/gms/b/yu$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    return-object v0
.end method

.method static synthetic a(Ljava/util/List;)Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/b/vr;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/vr;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/aad;

    invoke-direct {v0}, Lcom/google/android/gms/b/aad;-><init>()V

    new-instance v1, Lcom/google/android/gms/b/vr$b;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/vr$b;-><init>(Lcom/google/android/gms/b/vr;)V

    new-instance v2, Lcom/google/android/gms/b/vr$1;

    invoke-direct {v2, p0, p1, v1, v0}, Lcom/google/android/gms/b/vr$1;-><init>(Lcom/google/android/gms/b/vr;Ljava/lang/String;Lcom/google/android/gms/b/vr$b;Lcom/google/android/gms/b/aad;)V

    iget-object v1, p0, Lcom/google/android/gms/b/vr;->f:Lcom/google/android/gms/b/vq;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/vq;->a(Lcom/google/android/gms/b/vq$a;)V

    sget-wide v2, Lcom/google/android/gms/b/vr;->a:J

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/b/aad;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/b/qp$a;)V
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/b/qm;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    check-cast p1, Lcom/google/android/gms/b/qm;

    new-instance v0, Lcom/google/android/gms/b/vr$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/vr$b;-><init>(Lcom/google/android/gms/b/vr;)V

    new-instance v1, Lcom/google/android/gms/b/vr$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/vr$3;-><init>(Lcom/google/android/gms/b/vr;Lcom/google/android/gms/b/qm;)V

    iput-object v1, v0, Lcom/google/android/gms/b/vr$b;->a:Lcom/google/android/gms/b/rq;

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->f:Lcom/google/android/gms/b/vq;

    new-instance v2, Lcom/google/android/gms/b/vr$4;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/b/vr$4;-><init>(Lcom/google/android/gms/b/vr;Lcom/google/android/gms/b/rq;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/vq;->a(Lcom/google/android/gms/b/vq$a;)V

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/b/rd;Ljava/lang/String;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/vr;->d:Lcom/google/android/gms/ads/internal/r;

    invoke-interface {p1}, Lcom/google/android/gms/b/rd;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/r;->c(Ljava/lang/String;)Lcom/google/android/gms/b/rg;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/rg;->a(Lcom/google/android/gms/b/rd;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x28

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Failed to call onCustomClick for asset "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/vr;Lcom/google/android/gms/b/rd;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/vr;->a(Lcom/google/android/gms/b/rd;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/b/vr;)Lcom/google/android/gms/ads/internal/r;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->d:Lcom/google/android/gms/ads/internal/r;

    return-object v0
.end method

.method private b(Lcom/google/android/gms/b/qp$a;)Lcom/google/android/gms/b/yu;
    .locals 39

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/vr;->g:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    move-object/from16 v0, p0

    iget v6, v0, Lcom/google/android/gms/b/vr;->k:I

    if-nez p1, :cond_0

    move-object/from16 v0, p0

    iget v2, v0, Lcom/google/android/gms/b/vr;->k:I

    const/4 v4, -0x2

    if-ne v2, v4, :cond_0

    const/4 v6, 0x0

    :cond_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x2

    if-eq v6, v2, :cond_1

    const/16 v30, 0x0

    :goto_0
    new-instance v2, Lcom/google/android/gms/b/yu;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v3, v3, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v3, v3, Lcom/google/android/gms/b/wf;->c:Lcom/google/android/gms/b/ns;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v5, v5, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v5, v5, Lcom/google/android/gms/b/wi;->d:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v7, v7, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v7, v7, Lcom/google/android/gms/b/wi;->f:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/b/vr;->l:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v9, v9, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget v9, v9, Lcom/google/android/gms/b/wi;->l:I

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v10, v10, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-wide v10, v10, Lcom/google/android/gms/b/wi;->k:J

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v12, v12, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v12, v12, Lcom/google/android/gms/b/wf;->i:Ljava/lang/String;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v21, v0

    move-object/from16 v0, v21

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->d:Lcom/google/android/gms/b/nx;

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/google/android/gms/b/wi;->g:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    iget-wide v0, v0, Lcom/google/android/gms/b/yu$a;->f:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-wide v0, v0, Lcom/google/android/gms/b/yu$a;->g:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->o:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->m:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v34, v0

    move-object/from16 v0, v34

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    move-object/from16 v34, v0

    move-object/from16 v0, v34

    iget-boolean v0, v0, Lcom/google/android/gms/b/wi;->F:Z

    move/from16 v34, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v35, v0

    move-object/from16 v0, v35

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    move-object/from16 v35, v0

    move-object/from16 v0, v35

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->G:Lcom/google/android/gms/b/wk;

    move-object/from16 v35, v0

    const/16 v36, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v37, v0

    move-object/from16 v0, v37

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    move-object/from16 v37, v0

    move-object/from16 v0, v37

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->J:Ljava/util/List;

    move-object/from16 v37, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    move-object/from16 v38, v0

    move-object/from16 v0, v38

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    move-object/from16 v38, v0

    move-object/from16 v0, v38

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->N:Ljava/lang/String;

    move-object/from16 v38, v0

    invoke-direct/range {v2 .. v38}, Lcom/google/android/gms/b/yu;-><init>(Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/aaq;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/b/td;Lcom/google/android/gms/b/to;Ljava/lang/String;Lcom/google/android/gms/b/te;Lcom/google/android/gms/b/tg;JLcom/google/android/gms/b/nx;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/b/qp$a;Lcom/google/android/gms/b/yj;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/b/wk;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v2

    :catchall_0
    move-exception v2

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2

    :cond_1
    move-object/from16 v30, p1

    goto/16 :goto_0
.end method

.method private b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4

    :try_start_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "r"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "g"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "b"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static b(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/qj;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/qj;

    invoke-virtual {v0}, Lcom/google/android/gms/b/qj;->a()Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private c(Lorg/json/JSONObject;Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/b/aag;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/b/aag",
            "<",
            "Lcom/google/android/gms/b/aaq;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_0

    new-instance v0, Lcom/google/android/gms/b/aae;

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/aae;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "vast_xml"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Required field \'vast_xml\' is missing"

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->e(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/b/aae;

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/aae;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/b/vr;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/b/vr;->e:Lcom/google/android/gms/b/dp;

    iget-object v3, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v4, p0, Lcom/google/android/gms/b/vr;->i:Lcom/google/android/gms/b/qa;

    iget-object v5, p0, Lcom/google/android/gms/b/vr;->d:Lcom/google/android/gms/ads/internal/r;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/b/vr;->a(Landroid/content/Context;Lcom/google/android/gms/b/dp;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/qa;Lcom/google/android/gms/ads/internal/r;)Lcom/google/android/gms/b/vs;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/android/gms/b/vs;->a(Lorg/json/JSONObject;)Lcom/google/android/gms/b/aag;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lorg/json/JSONObject;Ljava/lang/String;ZZ)Lcom/google/android/gms/b/aag;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "ZZ)",
            "Lcom/google/android/gms/b/aag",
            "<",
            "Lcom/google/android/gms/b/qj;",
            ">;"
        }
    .end annotation

    if-eqz p3, :cond_1

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    invoke-direct {p0, v0, p3, p4}, Lcom/google/android/gms/b/vr;->a(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/b/aag;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0
.end method

.method a(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/dp;)Lcom/google/android/gms/b/vq;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/vq;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/b/vq;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/dp;)V

    return-object v0
.end method

.method protected a(Lorg/json/JSONObject;)Lcom/google/android/gms/b/vr$a;
    .locals 6

    const/4 v3, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/vr;->b()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move-object v0, v3

    :goto_0
    return-object v0

    :cond_1
    const-string v0, "template_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v0, v0, Lcom/google/android/gms/b/wf;->z:Lcom/google/android/gms/b/qr;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v0, v0, Lcom/google/android/gms/b/wf;->z:Lcom/google/android/gms/b/qr;

    iget-boolean v0, v0, Lcom/google/android/gms/b/qr;->b:Z

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v2, v2, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v2, v2, Lcom/google/android/gms/b/wf;->z:Lcom/google/android/gms/b/qr;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v2, v2, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v2, v2, Lcom/google/android/gms/b/wf;->z:Lcom/google/android/gms/b/qr;

    iget-boolean v2, v2, Lcom/google/android/gms/b/qr;->d:Z

    :goto_2
    const-string v5, "2"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance v1, Lcom/google/android/gms/b/vt;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/b/vt;-><init>(ZZ)V

    move-object v0, v1

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    move v2, v1

    goto :goto_2

    :cond_4
    const-string v5, "1"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v1, Lcom/google/android/gms/b/vu;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/b/vu;-><init>(ZZ)V

    move-object v0, v1

    goto :goto_0

    :cond_5
    const-string v2, "3"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v1, "custom_template_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/b/aad;

    invoke-direct {v2}, Lcom/google/android/gms/b/aad;-><init>()V

    sget-object v4, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    new-instance v5, Lcom/google/android/gms/b/vr$2;

    invoke-direct {v5, p0, v2, v1}, Lcom/google/android/gms/b/vr$2;-><init>(Lcom/google/android/gms/b/vr;Lcom/google/android/gms/b/aad;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-wide v4, Lcom/google/android/gms/b/vr;->a:J

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v4, v5, v1}, Lcom/google/android/gms/b/aad;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v1, Lcom/google/android/gms/b/vv;

    invoke-direct {v1, v0}, Lcom/google/android/gms/b/vv;-><init>(Z)V

    move-object v0, v1

    goto :goto_0

    :cond_6
    const-string v1, "No handler for custom template: "

    const-string v0, "custom_template_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;)V

    :goto_4
    move-object v0, v3

    goto/16 :goto_0

    :cond_7
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/vr;->a(I)V

    goto :goto_4
.end method

.method a(Landroid/content/Context;Lcom/google/android/gms/b/dp;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/qa;Lcom/google/android/gms/ads/internal/r;)Lcom/google/android/gms/b/vs;
    .locals 6

    new-instance v0, Lcom/google/android/gms/b/vs;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/vs;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/dp;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/qa;Lcom/google/android/gms/ads/internal/r;)V

    return-object v0
.end method

.method public a()Lcom/google/android/gms/b/yu;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/vr;->f:Lcom/google/android/gms/b/vq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/vq;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/vr;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/vr;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/vr;->a(Lorg/json/JSONObject;)Lcom/google/android/gms/b/vr$a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0}, Lcom/google/android/gms/b/vr;->a(Lcom/google/android/gms/b/vr$a;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/b/qp$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/vr;->a(Lcom/google/android/gms/b/qp$a;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/vr;->b(Lcom/google/android/gms/b/qp$a;)Lcom/google/android/gms/b/yu;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Malformed native JSON response."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-boolean v0, p0, Lcom/google/android/gms/b/vr;->j:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/vr;->a(I)V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/vr;->b(Lcom/google/android/gms/b/qp$a;)Lcom/google/android/gms/b/yu;

    move-result-object v0

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Timeout when loading native ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_1
.end method

.method public a(Lorg/json/JSONObject;Ljava/lang/String;ZZZ)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "ZZZ)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/aag",
            "<",
            "Lcom/google/android/gms/b/qj;",
            ">;>;"
        }
    .end annotation

    const/4 v2, 0x0

    if-eqz p3, :cond_1

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p0, v2, p3}, Lcom/google/android/gms/b/vr;->a(IZ)V

    move-object v0, v3

    :goto_1
    return-object v0

    :cond_1
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz p5, :cond_4

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    :goto_2
    move v4, v2

    :goto_3
    if-ge v4, v1, :cond_5

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_3

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :cond_3
    invoke-direct {p0, v2, p3, p4}, Lcom/google/android/gms/b/vr;->a(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/b/aag;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_3

    :cond_4
    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    move-object v0, v3

    goto :goto_1
.end method

.method public a(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/concurrent/Future",
            "<",
            "Lcom/google/android/gms/b/qj;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "require"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    invoke-direct {p0, v0, v1, p3}, Lcom/google/android/gms/b/vr;->a(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/b/aag;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/vr;->g:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/b/vr;->j:Z

    iput p1, p0, Lcom/google/android/gms/b/vr;->k:I

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/vr;->a(I)V

    :cond_0
    return-void
.end method

.method public b(Lorg/json/JSONObject;)Lcom/google/android/gms/b/aag;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/b/aag",
            "<",
            "Lcom/google/android/gms/b/qh;",
            ">;"
        }
    .end annotation

    const/4 v5, 0x1

    const/4 v3, 0x0

    const-string v0, "attribution"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v0, Lcom/google/android/gms/b/aae;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/aae;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "text"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "text_size"

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v10

    const-string v0, "text_color"

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/b/vr;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v11

    const-string v0, "bg_color"

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/b/vr;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v12

    const-string v0, "animation_ms"

    const/16 v2, 0x3e8

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    const-string v0, "presentation_ms"

    const/16 v2, 0xfa0

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v0, v0, Lcom/google/android/gms/b/wf;->z:Lcom/google/android/gms/b/qr;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v0, v0, Lcom/google/android/gms/b/wf;->z:Lcom/google/android/gms/b/qr;

    iget v0, v0, Lcom/google/android/gms/b/qr;->a:I

    const/4 v2, 0x2

    if-lt v0, v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/vr;->h:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v0, v0, Lcom/google/android/gms/b/wf;->z:Lcom/google/android/gms/b/qr;

    iget v8, v0, Lcom/google/android/gms/b/qr;->e:I

    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "images"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v2, "images"

    move-object v0, p0

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/b/vr;->a(Lorg/json/JSONObject;Ljava/lang/String;ZZZ)Ljava/util/List;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/b/aaf;->a(Ljava/util/List;)Lcom/google/android/gms/b/aag;

    move-result-object v13

    new-instance v0, Lcom/google/android/gms/b/vr$5;

    move-object v1, p0

    move-object v2, v9

    move-object v3, v12

    move-object v4, v11

    move v5, v10

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/b/vr$5;-><init>(Lcom/google/android/gms/b/vr;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;IIII)V

    invoke-static {v13, v0}, Lcom/google/android/gms/b/aaf;->a(Lcom/google/android/gms/b/aag;Lcom/google/android/gms/b/aaf$a;)Lcom/google/android/gms/b/aag;

    move-result-object v0

    goto :goto_0

    :cond_1
    move v8, v5

    goto :goto_1

    :cond_2
    const-string v2, "image"

    invoke-virtual {p0, v1, v2, v3, v3}, Lcom/google/android/gms/b/vr;->a(Lorg/json/JSONObject;Ljava/lang/String;ZZ)Lcom/google/android/gms/b/aag;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2
.end method

.method public b()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/vr;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/vr;->j:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method c()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/vr;->a()Lcom/google/android/gms/b/yu;

    move-result-object v0

    return-object v0
.end method
