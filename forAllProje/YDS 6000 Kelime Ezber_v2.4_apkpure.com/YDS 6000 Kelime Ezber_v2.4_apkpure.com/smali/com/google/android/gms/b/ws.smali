.class public Lcom/google/android/gms/b/ws;
.super Lcom/google/android/gms/b/zd;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/ws$a;,
        Lcom/google/android/gms/b/ws$b;,
        Lcom/google/android/gms/b/ws$c;
    }
.end annotation


# static fields
.field static final a:J

.field static b:Z

.field private static final c:Ljava/lang/Object;

.field private static d:Lcom/google/android/gms/b/sv;

.field private static e:Lcom/google/android/gms/b/rr;

.field private static f:Lcom/google/android/gms/b/rw;

.field private static g:Lcom/google/android/gms/b/rq;


# instance fields
.field private final h:Lcom/google/android/gms/b/wa$a;

.field private final i:Lcom/google/android/gms/b/wf$a;

.field private final j:Ljava/lang/Object;

.field private final k:Landroid/content/Context;

.field private l:Lcom/google/android/gms/b/sv$c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/b/ws;->a:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ws;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/b/ws;->b:Z

    sput-object v4, Lcom/google/android/gms/b/ws;->d:Lcom/google/android/gms/b/sv;

    sput-object v4, Lcom/google/android/gms/b/ws;->e:Lcom/google/android/gms/b/rr;

    sput-object v4, Lcom/google/android/gms/b/ws;->f:Lcom/google/android/gms/b/rw;

    sput-object v4, Lcom/google/android/gms/b/ws;->g:Lcom/google/android/gms/b/rq;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/wf$a;Lcom/google/android/gms/b/wa$a;)V
    .locals 7

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/zd;-><init>(Z)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/ws;->j:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/b/ws;->h:Lcom/google/android/gms/b/wa$a;

    iput-object p1, p0, Lcom/google/android/gms/b/ws;->k:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/b/ws;->i:Lcom/google/android/gms/b/wf$a;

    sget-object v6, Lcom/google/android/gms/b/ws;->c:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    sget-boolean v0, Lcom/google/android/gms/b/ws;->b:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/rw;

    invoke-direct {v0}, Lcom/google/android/gms/b/rw;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ws;->f:Lcom/google/android/gms/b/rw;

    new-instance v0, Lcom/google/android/gms/b/rr;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p2, Lcom/google/android/gms/b/wf$a;->j:Lcom/google/android/gms/b/aab;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/rr;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/aab;)V

    sput-object v0, Lcom/google/android/gms/b/ws;->e:Lcom/google/android/gms/b/rr;

    new-instance v0, Lcom/google/android/gms/b/ws$c;

    invoke-direct {v0}, Lcom/google/android/gms/b/ws$c;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ws;->g:Lcom/google/android/gms/b/rq;

    new-instance v0, Lcom/google/android/gms/b/sv;

    iget-object v1, p0, Lcom/google/android/gms/b/ws;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/ws;->i:Lcom/google/android/gms/b/wf$a;

    iget-object v2, v2, Lcom/google/android/gms/b/wf$a;->j:Lcom/google/android/gms/b/aab;

    sget-object v3, Lcom/google/android/gms/b/pr;->b:Lcom/google/android/gms/b/pn;

    invoke-virtual {v3}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lcom/google/android/gms/b/ws$b;

    invoke-direct {v4}, Lcom/google/android/gms/b/ws$b;-><init>()V

    new-instance v5, Lcom/google/android/gms/b/ws$a;

    invoke-direct {v5}, Lcom/google/android/gms/b/ws$a;-><init>()V

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/sv;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/aab;Ljava/lang/String;Lcom/google/android/gms/b/zn;Lcom/google/android/gms/b/zn;)V

    sput-object v0, Lcom/google/android/gms/b/ws;->d:Lcom/google/android/gms/b/sv;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/google/android/gms/b/ws;->b:Z

    :cond_0
    monitor-exit v6

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/ws;Lcom/google/android/gms/b/sv$c;)Lcom/google/android/gms/b/sv$c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ws;->l:Lcom/google/android/gms/b/sv$c;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/b/ws;)Lcom/google/android/gms/b/wa$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ws;->h:Lcom/google/android/gms/b/wa$a;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/wi;
    .locals 10

    const/4 v9, 0x0

    const/4 v8, -0x1

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/zi;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/ws;->a(Lcom/google/android/gms/b/wf;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/google/android/gms/b/wi;

    invoke-direct {v0, v9}, Lcom/google/android/gms/b/wi;-><init>(I)V

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->k()Lcom/google/android/gms/common/util/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/b/ws;->f:Lcom/google/android/gms/b/rw;

    invoke-virtual {v4, v0}, Lcom/google/android/gms/b/rw;->a(Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/b/zx;->a:Landroid/os/Handler;

    new-instance v6, Lcom/google/android/gms/b/ws$2;

    invoke-direct {v6, p0, v1, v0}, Lcom/google/android/gms/b/ws$2;-><init>(Lcom/google/android/gms/b/ws;Lorg/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-wide v0, Lcom/google/android/gms/b/ws;->a:J

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->k()Lcom/google/android/gms/common/util/c;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v6

    sub-long v2, v6, v2

    sub-long/2addr v0, v2

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v4, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/b/wi;

    invoke-direct {v0, v8}, Lcom/google/android/gms/b/wi;-><init>(I)V

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_1
    new-instance v0, Lcom/google/android/gms/b/wi;

    invoke-direct {v0, v8}, Lcom/google/android/gms/b/wi;-><init>(I)V

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v0, Lcom/google/android/gms/b/wi;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/wi;-><init>(I)V

    goto :goto_0

    :catch_2
    move-exception v0

    new-instance v0, Lcom/google/android/gms/b/wi;

    invoke-direct {v0, v9}, Lcom/google/android/gms/b/wi;-><init>(I)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/b/ws;->k:Landroid/content/Context;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, p1, v0}, Lcom/google/android/gms/b/wz;->a(Landroid/content/Context;Lcom/google/android/gms/b/wf;Ljava/lang/String;)Lcom/google/android/gms/b/wi;

    move-result-object v0

    iget v1, v0, Lcom/google/android/gms/b/wi;->e:I

    const/4 v2, -0x3

    if-eq v1, v2, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/b/wi;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/b/wi;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/wi;-><init>(I)V

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/b/wf;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p1, Lcom/google/android/gms/b/wf;->c:Lcom/google/android/gms/b/ns;

    iget-object v0, v0, Lcom/google/android/gms/b/ns;->c:Landroid/os/Bundle;

    const-string v2, "sdk_less_server_data"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-object v1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/ws;->k:Landroid/content/Context;

    new-instance v3, Lcom/google/android/gms/b/wv;

    invoke-direct {v3}, Lcom/google/android/gms/b/wv;-><init>()V

    invoke-virtual {v3, p1}, Lcom/google/android/gms/b/wv;->a(Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/wv;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->n()Lcom/google/android/gms/b/xf;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/b/ws;->k:Landroid/content/Context;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/b/xf;->a(Landroid/content/Context;)Lcom/google/android/gms/b/xe;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/b/wv;->a(Lcom/google/android/gms/b/xe;)Lcom/google/android/gms/b/wv;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/b/wz;->a(Landroid/content/Context;Lcom/google/android/gms/b/wv;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ws;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/c/a;->b(Landroid/content/Context;)Lcom/google/android/gms/ads/c/a$a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/gms/common/d; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/common/e; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    :goto_1
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "request_id"

    invoke-virtual {v4, v5, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "request_param"

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "data"

    invoke-virtual {v4, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_2

    const-string v2, "adid"

    invoke-virtual {v0}, Lcom/google/android/gms/ads/c/a$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lat"

    invoke-virtual {v0}, Lcom/google/android/gms/ads/c/a$a;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/android/gms/b/zi;->a(Ljava/util/Map;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_3
    const-string v4, "Cannot get advertising id info"

    invoke-static {v4, v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_3
.end method

.method protected static a(Lcom/google/android/gms/b/sr;)V
    .locals 2

    const-string v0, "/loadAd"

    sget-object v1, Lcom/google/android/gms/b/ws;->f:Lcom/google/android/gms/b/rw;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/b/sr;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/fetchHttpRequest"

    sget-object v1, Lcom/google/android/gms/b/ws;->e:Lcom/google/android/gms/b/rr;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/b/sr;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/invalidRequest"

    sget-object v1, Lcom/google/android/gms/b/ws;->g:Lcom/google/android/gms/b/rq;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/b/sr;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/b/ws;)Lcom/google/android/gms/b/sv$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ws;->l:Lcom/google/android/gms/b/sv$c;

    return-object v0
.end method

.method protected static b(Lcom/google/android/gms/b/sr;)V
    .locals 2

    const-string v0, "/loadAd"

    sget-object v1, Lcom/google/android/gms/b/ws;->f:Lcom/google/android/gms/b/rw;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/b/sr;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/fetchHttpRequest"

    sget-object v1, Lcom/google/android/gms/b/ws;->e:Lcom/google/android/gms/b/rr;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/b/sr;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/invalidRequest"

    sget-object v1, Lcom/google/android/gms/b/ws;->g:Lcom/google/android/gms/b/rq;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/b/sr;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    return-void
.end method

.method static synthetic c()Lcom/google/android/gms/b/rw;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ws;->f:Lcom/google/android/gms/b/rw;

    return-object v0
.end method

.method static synthetic f()Lcom/google/android/gms/b/sv;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ws;->d:Lcom/google/android/gms/b/sv;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 11

    const/4 v3, 0x0

    const-string v0, "SdkLessAdLoaderBackgroundTask started."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/b/wf;

    iget-object v0, p0, Lcom/google/android/gms/b/ws;->i:Lcom/google/android/gms/b/wf$a;

    const-wide/16 v4, -0x1

    invoke-direct {v1, v0, v3, v4, v5}, Lcom/google/android/gms/b/wf;-><init>(Lcom/google/android/gms/b/wf$a;Ljava/lang/String;J)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/b/ws;->a(Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/wi;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->k()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v6

    new-instance v0, Lcom/google/android/gms/b/yu$a;

    iget v5, v2, Lcom/google/android/gms/b/wi;->e:I

    iget-wide v8, v2, Lcom/google/android/gms/b/wi;->n:J

    move-object v4, v3

    move-object v10, v3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/b/yu$a;-><init>(Lcom/google/android/gms/b/wf;Lcom/google/android/gms/b/wi;Lcom/google/android/gms/b/te;Lcom/google/android/gms/b/nx;IJJLorg/json/JSONObject;)V

    sget-object v1, Lcom/google/android/gms/b/zx;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/b/ws$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/b/ws$1;-><init>(Lcom/google/android/gms/b/ws;Lcom/google/android/gms/b/yu$a;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/b/ws;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/zx;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/b/ws$3;

    invoke-direct {v2, p0}, Lcom/google/android/gms/b/ws$3;-><init>(Lcom/google/android/gms/b/ws;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
