.class public Lcom/google/android/gms/b/wb;
.super Lcom/google/android/gms/b/zd;

# interfaces
.implements Lcom/google/android/gms/b/wc$a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/wb$a;
    }
.end annotation


# instance fields
.field a:Lcom/google/android/gms/b/zk;

.field b:Lcom/google/android/gms/b/wi;

.field c:Lcom/google/android/gms/b/te;

.field private final d:Lcom/google/android/gms/b/wa$a;

.field private final e:Lcom/google/android/gms/b/wf$a;

.field private final f:Ljava/lang/Object;

.field private final g:Landroid/content/Context;

.field private final h:Lcom/google/android/gms/b/dp;

.field private i:Lcom/google/android/gms/b/wf;

.field private j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/wf$a;Lcom/google/android/gms/b/dp;Lcom/google/android/gms/b/wa$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/b/zd;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/wb;->f:Ljava/lang/Object;

    iput-object p4, p0, Lcom/google/android/gms/b/wb;->d:Lcom/google/android/gms/b/wa$a;

    iput-object p1, p0, Lcom/google/android/gms/b/wb;->g:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/b/wb;->e:Lcom/google/android/gms/b/wf$a;

    iput-object p3, p0, Lcom/google/android/gms/b/wb;->h:Lcom/google/android/gms/b/dp;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/wb;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->f:Ljava/lang/Object;

    return-object v0
.end method

.method private a(ILjava/lang/String;)V
    .locals 11

    const-wide/16 v6, -0x1

    const/4 v4, 0x0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/b/ze;->d(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/b/wi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/wi;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/b/wb;->i:Lcom/google/android/gms/b/wf;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->i:Lcom/google/android/gms/b/wf;

    :goto_2
    new-instance v0, Lcom/google/android/gms/b/yu$a;

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v3, p0, Lcom/google/android/gms/b/wb;->c:Lcom/google/android/gms/b/te;

    iget-object v5, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-wide v8, v5, Lcom/google/android/gms/b/wi;->n:J

    move v5, p1

    move-object v10, v4

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/b/yu$a;-><init>(Lcom/google/android/gms/b/wf;Lcom/google/android/gms/b/wi;Lcom/google/android/gms/b/te;Lcom/google/android/gms/b/nx;IJJLorg/json/JSONObject;)V

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->d:Lcom/google/android/gms/b/wa$a;

    invoke-interface {v1, v0}, Lcom/google/android/gms/b/wa$a;->a(Lcom/google/android/gms/b/yu$a;)V

    return-void

    :cond_1
    invoke-static {p2}, Lcom/google/android/gms/b/ze;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/b/wi;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-wide v2, v1, Lcom/google/android/gms/b/wi;->k:J

    invoke-direct {v0, p1, v2, v3}, Lcom/google/android/gms/b/wi;-><init>(IJ)V

    iput-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    goto :goto_1

    :cond_3
    new-instance v1, Lcom/google/android/gms/b/wf;

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->e:Lcom/google/android/gms/b/wf$a;

    invoke-direct {v1, v0, v4, v6, v7}, Lcom/google/android/gms/b/wf;-><init>(Lcom/google/android/gms/b/wf$a;Ljava/lang/String;J)V

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/android/gms/b/wb;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/wb;->a(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/b/wb;)Lcom/google/android/gms/b/wf$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->e:Lcom/google/android/gms/b/wf$a;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/b/wb;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->j:Ljava/lang/Runnable;

    return-object v0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/nx;
    .locals 11

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v0, v0, Lcom/google/android/gms/b/wi;->A:Z

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/b/wf;->d:Lcom/google/android/gms/b/nx;

    iget-object v1, v0, Lcom/google/android/gms/b/nx;->h:[Lcom/google/android/gms/b/nx;

    array-length v2, v1

    move v0, v3

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v4, v1, v0

    iget-boolean v5, v4, Lcom/google/android/gms/b/nx;->j:Z

    if-eqz v5, :cond_0

    new-instance v0, Lcom/google/android/gms/b/nx;

    iget-object v1, p1, Lcom/google/android/gms/b/wf;->d:Lcom/google/android/gms/b/nx;

    iget-object v1, v1, Lcom/google/android/gms/b/nx;->h:[Lcom/google/android/gms/b/nx;

    invoke-direct {v0, v4, v1}, Lcom/google/android/gms/b/nx;-><init>(Lcom/google/android/gms/b/nx;[Lcom/google/android/gms/b/nx;)V

    :goto_1
    return-object v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->m:Ljava/lang/String;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/b/wb$a;

    const-string v1, "The ad response must specify one of the supported ad sizes."

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/b/wb$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->m:Ljava/lang/String;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    new-instance v1, Lcom/google/android/gms/b/wb$a;

    const-string v2, "Invalid ad size format from the ad response: "

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->m:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-direct {v1, v0, v3}, Lcom/google/android/gms/b/wb$a;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :try_start_0
    aget-object v1, v0, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    iget-object v0, p1, Lcom/google/android/gms/b/wf;->d:Lcom/google/android/gms/b/nx;

    iget-object v6, v0, Lcom/google/android/gms/b/nx;->h:[Lcom/google/android/gms/b/nx;

    array-length v7, v6

    move v2, v3

    :goto_3
    if-ge v2, v7, :cond_9

    aget-object v8, v6, v2

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    iget v0, v8, Lcom/google/android/gms/b/nx;->f:I

    const/4 v9, -0x1

    if-ne v0, v9, :cond_6

    iget v0, v8, Lcom/google/android/gms/b/nx;->g:I

    int-to-float v0, v0

    div-float/2addr v0, v1

    float-to-int v0, v0

    :goto_4
    iget v9, v8, Lcom/google/android/gms/b/nx;->c:I

    const/4 v10, -0x2

    if-ne v9, v10, :cond_7

    iget v9, v8, Lcom/google/android/gms/b/nx;->d:I

    int-to-float v9, v9

    div-float v1, v9, v1

    float-to-int v1, v1

    :goto_5
    if-ne v4, v0, :cond_8

    if-ne v5, v1, :cond_8

    iget-boolean v0, v8, Lcom/google/android/gms/b/nx;->j:Z

    if-nez v0, :cond_8

    new-instance v0, Lcom/google/android/gms/b/nx;

    iget-object v1, p1, Lcom/google/android/gms/b/wf;->d:Lcom/google/android/gms/b/nx;

    iget-object v1, v1, Lcom/google/android/gms/b/nx;->h:[Lcom/google/android/gms/b/nx;

    invoke-direct {v0, v8, v1}, Lcom/google/android/gms/b/nx;-><init>(Lcom/google/android/gms/b/nx;[Lcom/google/android/gms/b/nx;)V

    goto/16 :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/b/wb$a;

    const-string v2, "Invalid ad size number from the ad response: "

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->m:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-direct {v1, v0, v3}, Lcom/google/android/gms/b/wb$a;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_5
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    iget v0, v8, Lcom/google/android/gms/b/nx;->f:I

    goto :goto_4

    :cond_7
    iget v1, v8, Lcom/google/android/gms/b/nx;->c:I

    goto :goto_5

    :cond_8
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    :cond_9
    new-instance v1, Lcom/google/android/gms/b/wb$a;

    const-string v2, "The ad size from the ad response was not one of the requested sizes: "

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->m:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-direct {v1, v0, v3}, Lcom/google/android/gms/b/wb$a;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_a
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_7
.end method

.method a(Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;)Lcom/google/android/gms/b/zk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/aab;",
            "Lcom/google/android/gms/b/aaj",
            "<",
            "Lcom/google/android/gms/b/wf;",
            ">;)",
            "Lcom/google/android/gms/b/zk;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->g:Landroid/content/Context;

    invoke-static {v0, p1, p2, p0}, Lcom/google/android/gms/b/wc;->a(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)Lcom/google/android/gms/b/zk;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 6

    const-string v0, "AdLoaderBackgroundTask started."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/b/wb$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/wb$1;-><init>(Lcom/google/android/gms/b/wb;)V

    iput-object v0, p0, Lcom/google/android/gms/b/wb;->j:Ljava/lang/Runnable;

    sget-object v1, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->j:Ljava/lang/Runnable;

    sget-object v0, Lcom/google/android/gms/b/pr;->bn:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Lcom/google/android/gms/b/aak;

    invoke-direct {v0}, Lcom/google/android/gms/b/aak;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->k()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v2

    new-instance v1, Lcom/google/android/gms/b/wb$2;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/b/wb$2;-><init>(Lcom/google/android/gms/b/wb;Lcom/google/android/gms/b/aaj;)V

    invoke-static {v1}, Lcom/google/android/gms/b/zh;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/b/aag;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->h:Lcom/google/android/gms/b/dp;

    invoke-virtual {v1}, Lcom/google/android/gms/b/dp;->a()Lcom/google/android/gms/b/bq;

    move-result-object v1

    iget-object v4, p0, Lcom/google/android/gms/b/wb;->g:Landroid/content/Context;

    invoke-interface {v1, v4}, Lcom/google/android/gms/b/bq;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lcom/google/android/gms/b/wf;

    iget-object v5, p0, Lcom/google/android/gms/b/wb;->e:Lcom/google/android/gms/b/wf$a;

    invoke-direct {v4, v5, v1, v2, v3}, Lcom/google/android/gms/b/wf;-><init>(Lcom/google/android/gms/b/wf$a;Ljava/lang/String;J)V

    iput-object v4, p0, Lcom/google/android/gms/b/wb;->i:Lcom/google/android/gms/b/wf;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->i:Lcom/google/android/gms/b/wf;

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/aaj;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/wi;)V
    .locals 11

    const/4 v5, -0x2

    const/4 v0, 0x0

    const-string v1, "Received ad response."

    invoke-static {v1}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->k()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v6

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->f:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x0

    :try_start_0
    iput-object v2, p0, Lcom/google/android/gms/b/wb;->a:Lcom/google/android/gms/b/zk;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->i()Lcom/google/android/gms/b/yx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->g:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v3, v3, Lcom/google/android/gms/b/wi;->H:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/yx;->b(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget v1, v1, Lcom/google/android/gms/b/wi;->e:I

    if-eq v1, v5, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget v1, v1, Lcom/google/android/gms/b/wi;->e:I

    const/4 v2, -0x3

    if-eq v1, v2, :cond_0

    new-instance v0, Lcom/google/android/gms/b/wb$a;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget v1, v1, Lcom/google/android/gms/b/wi;->e:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x42

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "There was a problem getting an ad response. ErrorCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget v2, v2, Lcom/google/android/gms/b/wi;->e:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/wb$a;-><init>(Ljava/lang/String;I)V

    throw v0
    :try_end_1
    .catch Lcom/google/android/gms/b/wb$a; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/wb$a;->a()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/b/wb$a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/b/wb;->a(ILjava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_0
    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/wb;->c()V

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->i:Lcom/google/android/gms/b/wf;

    iget-object v1, v1, Lcom/google/android/gms/b/wf;->d:Lcom/google/android/gms/b/nx;

    iget-object v1, v1, Lcom/google/android/gms/b/nx;->h:[Lcom/google/android/gms/b/nx;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->i:Lcom/google/android/gms/b/wf;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/wb;->a(Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/nx;
    :try_end_3
    .catch Lcom/google/android/gms/b/wb$a; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v4

    :goto_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->i()Lcom/google/android/gms/b/yx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v2, v2, Lcom/google/android/gms/b/wi;->v:Z

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/yx;->b(Z)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->i()Lcom/google/android/gms/b/yx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v2, v2, Lcom/google/android/gms/b/wi;->O:Z

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/yx;->c(Z)V

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v1, v1, Lcom/google/android/gms/b/wi;->r:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    :try_start_4
    new-instance v10, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v1, v1, Lcom/google/android/gms/b/wi;->r:Ljava/lang/String;

    invoke-direct {v10, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :goto_2
    new-instance v0, Lcom/google/android/gms/b/yu$a;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->i:Lcom/google/android/gms/b/wf;

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v3, p0, Lcom/google/android/gms/b/wb;->c:Lcom/google/android/gms/b/te;

    iget-object v8, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-wide v8, v8, Lcom/google/android/gms/b/wi;->n:J

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/b/yu$a;-><init>(Lcom/google/android/gms/b/wf;Lcom/google/android/gms/b/wi;Lcom/google/android/gms/b/te;Lcom/google/android/gms/b/nx;IJJLorg/json/JSONObject;)V

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->d:Lcom/google/android/gms/b/wa$a;

    invoke-interface {v1, v0}, Lcom/google/android/gms/b/wa$a;->a(Lcom/google/android/gms/b/yu$a;)V

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    const-string v2, "Error parsing the JSON for Active View."

    invoke-static {v2, v1}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    move-object v10, v0

    goto :goto_2

    :cond_2
    move-object v4, v0

    goto :goto_1
.end method

.method public b()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/wb;->a:Lcom/google/android/gms/b/zk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->a:Lcom/google/android/gms/b/zk;

    invoke-interface {v0}, Lcom/google/android/gms/b/zk;->d()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected c()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget v0, v0, Lcom/google/android/gms/b/wi;->e:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/b/wb$a;

    const-string v1, "No fill from ad server."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/wb$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->i()Lcom/google/android/gms/b/yx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v2, v2, Lcom/google/android/gms/b/wi;->u:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/yx;->a(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v0, v0, Lcom/google/android/gms/b/wi;->h:Z

    if-eqz v0, :cond_4

    :try_start_0
    new-instance v0, Lcom/google/android/gms/b/te;

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v1, v1, Lcom/google/android/gms/b/wi;->c:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/te;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/wb;->c:Lcom/google/android/gms/b/te;

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->i()Lcom/google/android/gms/b/yx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->c:Lcom/google/android/gms/b/te;

    iget-boolean v1, v1, Lcom/google/android/gms/b/te;->g:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/yx;->d(Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->I:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/b/pr;->cR:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Received cookie from server. Setting webview cookie in CookieManager."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->g()Lcom/google/android/gms/b/zj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->g:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/zj;->b(Landroid/content/Context;)Landroid/webkit/CookieManager;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "googleads.g.doubleclick.net"

    iget-object v2, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v2, v2, Lcom/google/android/gms/b/wi;->I:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not parse mediation config."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Lcom/google/android/gms/b/wb$a;

    const-string v2, "Could not parse mediation config: "

    iget-object v0, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v0, Lcom/google/android/gms/b/wi;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/b/wb$a;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->i()Lcom/google/android/gms/b/yx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/wb;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v1, v1, Lcom/google/android/gms/b/wi;->K:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/yx;->d(Z)V

    goto :goto_1
.end method
