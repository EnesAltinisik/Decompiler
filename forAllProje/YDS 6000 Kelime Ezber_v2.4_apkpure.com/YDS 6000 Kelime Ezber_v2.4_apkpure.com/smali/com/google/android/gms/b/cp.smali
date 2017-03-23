.class public Lcom/google/android/gms/b/cp;
.super Lcom/google/android/gms/b/cy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/cp$b;,
        Lcom/google/android/gms/b/cp$c;,
        Lcom/google/android/gms/b/cp$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/cv;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cy;-><init>(Lcom/google/android/gms/b/cv;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/cp;Ljava/net/HttpURLConnection;)[B
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cp;->a(Ljava/net/HttpURLConnection;)[B

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/net/HttpURLConnection;)[B
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const/16 v2, 0x400

    new-array v2, v2, [B

    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-lez v3, :cond_1

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_0
    throw v0

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_2
    return-object v0
.end method


# virtual methods
.method protected a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 3

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    instance-of v1, v0, Ljava/net/HttpURLConnection;

    if-nez v1, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to obtain HTTP connection"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDefaultUseCaches(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->w()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->L()J

    const v1, 0xea60

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->w()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->M()J

    const v1, 0xee48

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    return-object v0
.end method

.method protected a()V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/net/URL;Ljava/util/Map;Lcom/google/android/gms/b/cp$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/net/URL;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/b/cp$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->Q()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->t()Lcom/google/android/gms/b/cu;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/b/cp$c;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/b/cp$c;-><init>(Lcom/google/android/gms/b/cp;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/b/cp$a;)V

    invoke-virtual {v7, v0}, Lcom/google/android/gms/b/cu;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/b/cp$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/net/URL;",
            "[B",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/b/cp$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->Q()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->t()Lcom/google/android/gms/b/cu;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/b/cp$c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/b/cp$c;-><init>(Lcom/google/android/gms/b/cp;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/b/cp$a;)V

    invoke-virtual {v7, v0}, Lcom/google/android/gms/b/cu;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic b()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->b()V

    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->c()V

    return-void
.end method

.method public bridge synthetic d()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->d()V

    return-void
.end method

.method public bridge synthetic e()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->e()V

    return-void
.end method

.method public bridge synthetic f()Lcom/google/android/gms/b/bt;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->f()Lcom/google/android/gms/b/bt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lcom/google/android/gms/b/bx;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->g()Lcom/google/android/gms/b/bx;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/google/android/gms/b/da;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->h()Lcom/google/android/gms/b/da;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i()Lcom/google/android/gms/b/cl;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->i()Lcom/google/android/gms/b/cl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j()Lcom/google/android/gms/b/cb;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->j()Lcom/google/android/gms/b/cb;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k()Lcom/google/android/gms/b/dc;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->k()Lcom/google/android/gms/b/dc;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lcom/google/android/gms/b/db;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->l()Lcom/google/android/gms/b/db;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Lcom/google/android/gms/common/util/c;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->n()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o()Lcom/google/android/gms/b/cm;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->o()Lcom/google/android/gms/b/cm;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Lcom/google/android/gms/b/bz;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q()Lcom/google/android/gms/b/dl;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->q()Lcom/google/android/gms/b/dl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r()Lcom/google/android/gms/b/ct;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->r()Lcom/google/android/gms/b/ct;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s()Lcom/google/android/gms/b/de;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->s()Lcom/google/android/gms/b/de;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t()Lcom/google/android/gms/b/cu;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->t()Lcom/google/android/gms/b/cu;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Lcom/google/android/gms/b/co;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Lcom/google/android/gms/b/cr;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic w()Lcom/google/android/gms/b/by;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->w()Lcom/google/android/gms/b/by;

    move-result-object v0

    return-object v0
.end method

.method public x()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->Q()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cp;->n()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    return v0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1
.end method
