.class public Lcom/google/android/gms/b/ow;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/tm;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/b/nw;

.field private d:Lcom/google/android/gms/ads/a;

.field private e:Lcom/google/android/gms/b/nn;

.field private f:Lcom/google/android/gms/b/ok;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lcom/google/android/gms/ads/a/a;

.field private j:Lcom/google/android/gms/ads/purchase/d;

.field private k:Lcom/google/android/gms/ads/purchase/b;

.field private l:Lcom/google/android/gms/ads/a/e;

.field private m:Lcom/google/android/gms/ads/a/c;

.field private n:Lcom/google/android/gms/ads/f;

.field private o:Lcom/google/android/gms/ads/d/b;

.field private p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/b/nw;->a()Lcom/google/android/gms/b/nw;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/b/ow;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/nw;Lcom/google/android/gms/ads/a/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/nw;Lcom/google/android/gms/ads/a/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/tm;

    invoke-direct {v0}, Lcom/google/android/gms/b/tm;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/ow;->a:Lcom/google/android/gms/b/tm;

    iput-object p1, p0, Lcom/google/android/gms/b/ow;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/b/ow;->c:Lcom/google/android/gms/b/nw;

    iput-object p3, p0, Lcom/google/android/gms/b/ow;->l:Lcom/google/android/gms/ads/a/e;

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/ow;->c(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/ow;->p:Z

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/google/android/gms/b/nx;->a()Lcom/google/android/gms/b/nx;

    move-result-object v0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/b/oc;->b()Lcom/google/android/gms/b/ob;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/b/ow;->g:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/b/ow;->a:Lcom/google/android/gms/b/tm;

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/gms/b/ob;->b(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;)Lcom/google/android/gms/b/ok;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->d:Lcom/google/android/gms/ads/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/np;

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->d:Lcom/google/android/gms/ads/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/np;-><init>(Lcom/google/android/gms/ads/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/og;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->e:Lcom/google/android/gms/b/nn;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/no;

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->e:Lcom/google/android/gms/b/nn;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/no;-><init>(Lcom/google/android/gms/b/nn;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/of;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->i:Lcom/google/android/gms/ads/a/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/nz;

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->i:Lcom/google/android/gms/ads/a/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/nz;-><init>(Lcom/google/android/gms/ads/a/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/om;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->k:Lcom/google/android/gms/ads/purchase/b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/vb;

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->k:Lcom/google/android/gms/ads/purchase/b;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/vb;-><init>(Lcom/google/android/gms/ads/purchase/b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/uv;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->j:Lcom/google/android/gms/ads/purchase/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/vf;

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->j:Lcom/google/android/gms/ads/purchase/d;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/vf;-><init>(Lcom/google/android/gms/ads/purchase/d;)V

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->h:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/va;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->m:Lcom/google/android/gms/ads/a/c;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/qf;

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->m:Lcom/google/android/gms/ads/a/c;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/qf;-><init>(Lcom/google/android/gms/ads/a/c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/qe;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->n:Lcom/google/android/gms/ads/f;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    iget-object v1, p0, Lcom/google/android/gms/b/ow;->n:Lcom/google/android/gms/ads/f;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/f;->a()Lcom/google/android/gms/b/od;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/oo;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->o:Lcom/google/android/gms/ads/d/b;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/xv;

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->o:Lcom/google/android/gms/ads/d/b;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/xv;-><init>(Lcom/google/android/gms/ads/d/b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/xs;)V

    :cond_8
    return-void

    :cond_9
    new-instance v0, Lcom/google/android/gms/b/nx;

    invoke-direct {v0}, Lcom/google/android/gms/b/nx;-><init>()V

    goto/16 :goto_0
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "The ad unit ID must be set on InterstitialAd before "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is called."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/ads/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/b/ow;->d:Lcom/google/android/gms/ads/a;

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/b/np;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/np;-><init>(Lcom/google/android/gms/ads/a;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/og;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/d/b;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/b/ow;->o:Lcom/google/android/gms/ads/d/b;

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/b/xv;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/xv;-><init>(Lcom/google/android/gms/ads/d/b;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/xs;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/b/nn;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/b/ow;->e:Lcom/google/android/gms/b/nn;

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/b/no;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/no;-><init>(Lcom/google/android/gms/b/nn;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/of;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdClickListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/b/ot;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-nez v0, :cond_0

    const-string v0, "loadAd"

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/ow;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    iget-object v1, p0, Lcom/google/android/gms/b/ow;->c:Lcom/google/android/gms/b/nw;

    iget-object v2, p0, Lcom/google/android/gms/b/ow;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/b/nw;->a(Landroid/content/Context;Lcom/google/android/gms/b/ot;)Lcom/google/android/gms/b/ns;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/ns;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->a:Lcom/google/android/gms/b/tm;

    invoke-virtual {p1}, Lcom/google/android/gms/b/ot;->j()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/tm;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/b/ow;->g:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/b/ow;->p:Z

    return-void
.end method

.method public a()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    invoke-interface {v1}, Lcom/google/android/gms/b/ok;->l()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to check if ad is ready."

    invoke-static {v2, v1}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/ow;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/ow;->f:Lcom/google/android/gms/b/ok;

    invoke-interface {v0}, Lcom/google/android/gms/b/ok;->G()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
