.class public Lcom/google/android/gms/ads/internal/r;
.super Lcom/google/android/gms/ads/internal/b;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private l:Lcom/google/android/gms/b/aaq;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/d;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/b;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/ads/internal/d;)V

    return-void
.end method

.method private static a(Lcom/google/android/gms/b/tr;)Lcom/google/android/gms/b/qk;
    .locals 14

    const/4 v10, 0x0

    new-instance v0, Lcom/google/android/gms/b/qk;

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->d()Lcom/google/android/gms/b/qu;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->d()Lcom/google/android/gms/b/qu;

    move-result-object v4

    :goto_0
    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->f()D

    move-result-wide v6

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->g()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->h()Ljava/lang/String;

    move-result-object v9

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->l()Landroid/os/Bundle;

    move-result-object v11

    invoke-interface {p0}, Lcom/google/android/gms/b/tr;->m()Lcom/google/android/gms/b/or;

    move-result-object v12

    move-object v13, v10

    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/b/qk;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/qu;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/qh;Landroid/os/Bundle;Lcom/google/android/gms/b/or;Landroid/view/View;)V

    return-object v0

    :cond_0
    move-object v4, v10

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/b/ts;)Lcom/google/android/gms/b/ql;
    .locals 9

    const/4 v7, 0x0

    new-instance v0, Lcom/google/android/gms/b/ql;

    invoke-interface {p0}, Lcom/google/android/gms/b/ts;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lcom/google/android/gms/b/ts;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/b/ts;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0}, Lcom/google/android/gms/b/ts;->d()Lcom/google/android/gms/b/qu;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/b/ts;->d()Lcom/google/android/gms/b/qu;

    move-result-object v4

    :goto_0
    invoke-interface {p0}, Lcom/google/android/gms/b/ts;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0}, Lcom/google/android/gms/b/ts;->f()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0}, Lcom/google/android/gms/b/ts;->j()Landroid/os/Bundle;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/b/ql;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/qu;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/qh;Landroid/os/Bundle;)V

    return-object v0

    :cond_0
    move-object v4, v7

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/b/qk;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/r$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/r$2;-><init>(Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/qk;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private a(Lcom/google/android/gms/b/ql;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/r$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/r$3;-><init>(Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/ql;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private a(Lcom/google/android/gms/b/yu;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/r$4;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/ads/internal/r$4;-><init>(Lcom/google/android/gms/ads/internal/r;Ljava/lang/String;Lcom/google/android/gms/b/yu;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public G()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Interstitial is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public J()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->j:Lcom/google/android/gms/b/yu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->i()Lcom/google/android/gms/b/yx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/yx;->r()Lcom/google/android/gms/b/mi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/w;->i:Lcom/google/android/gms/b/nx;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/w;->j:Lcom/google/android/gms/b/yu;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    invoke-interface {v3}, Lcom/google/android/gms/b/aaq;->b()Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/b/mi;->a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Landroid/view/View;Lcom/google/android/gms/b/sw;)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "Request to enable ActiveView before adState is available."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->e(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public K()Landroid/support/v4/i/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rh;",
            ">;"
        }
    .end annotation

    const-string v0, "getOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->v:Landroid/support/v4/i/k;

    return-object v0
.end method

.method public L()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    :cond_0
    return-void
.end method

.method public M()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->z()Lcom/google/android/gms/b/aav;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->w:Lcom/google/android/gms/b/qr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->w:Lcom/google/android/gms/b/qr;

    iget-object v0, v0, Lcom/google/android/gms/b/qr;->f:Lcom/google/android/gms/b/ph;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->z()Lcom/google/android/gms/b/aav;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/w;->w:Lcom/google/android/gms/b/qr;

    iget-object v1, v1, Lcom/google/android/gms/b/qr;->f:Lcom/google/android/gms/b/ph;

    iget-boolean v1, v1, Lcom/google/android/gms/b/ph;->b:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/aav;->b(Z)V

    :cond_0
    return-void
.end method

.method public a(Landroid/support/v4/i/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rh;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/w;->v:Landroid/support/v4/i/k;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/aaq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/qe;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CustomRendering is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/b/qn;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->l:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/aaq;->a(Lcom/google/android/gms/b/qn;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/b/qp;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->j:Lcom/google/android/gms/b/yu;

    iget-object v0, v0, Lcom/google/android/gms/b/yu;->j:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->i()Lcom/google/android/gms/b/yx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/yx;->r()Lcom/google/android/gms/b/mi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/w;->i:Lcom/google/android/gms/b/nx;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/w;->j:Lcom/google/android/gms/b/yu;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/b/mi;->a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/qp;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/b/qr;)V
    .locals 1

    const-string v0, "setNativeAdOptions must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/w;->w:Lcom/google/android/gms/b/qr;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/re;)V
    .locals 1

    const-string v0, "setOnAppInstallAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/w;->s:Lcom/google/android/gms/b/re;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/rf;)V
    .locals 1

    const-string v0, "setOnContentAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/w;->t:Lcom/google/android/gms/b/rf;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/uv;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In App Purchase is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/qa;)V
    .locals 10

    iget-object v0, p1, Lcom/google/android/gms/b/yu$a;->d:Lcom/google/android/gms/b/nx;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v1, p1, Lcom/google/android/gms/b/yu$a;->d:Lcom/google/android/gms/b/nx;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/w;->i:Lcom/google/android/gms/b/nx;

    :cond_0
    iget v0, p1, Lcom/google/android/gms/b/yu$a;->e:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_1

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/r$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/r$1;-><init>(Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/yu$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/ads/internal/w;->E:I

    iget-object v9, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->d()Lcom/google/android/gms/b/vk;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/w;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v4, v2, Lcom/google/android/gms/ads/internal/w;->d:Lcom/google/android/gms/b/dp;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/r;->j:Lcom/google/android/gms/b/tn;

    move-object v2, p0

    move-object v3, p1

    move-object v7, p0

    move-object v8, p2

    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/b/vk;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/dp;Lcom/google/android/gms/b/aaq;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/vk$a;Lcom/google/android/gms/b/qa;)Lcom/google/android/gms/b/zk;

    move-result-object v0

    iput-object v0, v9, Lcom/google/android/gms/ads/internal/w;->h:Lcom/google/android/gms/b/zk;

    const-string v1, "AdRenderer: "

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->h:Lcom/google/android/gms/b/zk;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setNativeTemplates must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/w;->A:Ljava/util/List;

    return-void
.end method

.method protected a(Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/yu;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->e:Lcom/google/android/gms/ads/internal/s;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/s;->d()Z

    move-result v0

    return v0
.end method

.method protected a(Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/yu;)Z
    .locals 7

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/r;->a(Ljava/util/List;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/w;->e()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native ad DOES NOT have custom rendering mode."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v1, p2, Lcom/google/android/gms/b/yu;->n:Z

    if-eqz v1, :cond_5

    :try_start_0
    iget-object v1, p2, Lcom/google/android/gms/b/yu;->p:Lcom/google/android/gms/b/to;

    if-eqz v1, :cond_1

    iget-object v1, p2, Lcom/google/android/gms/b/yu;->p:Lcom/google/android/gms/b/to;

    invoke-interface {v1}, Lcom/google/android/gms/b/to;->h()Lcom/google/android/gms/b/tr;

    move-result-object v4

    :goto_0
    iget-object v1, p2, Lcom/google/android/gms/b/yu;->p:Lcom/google/android/gms/b/to;

    if-eqz v1, :cond_2

    iget-object v0, p2, Lcom/google/android/gms/b/yu;->p:Lcom/google/android/gms/b/to;

    invoke-interface {v0}, Lcom/google/android/gms/b/to;->i()Lcom/google/android/gms/b/ts;

    move-result-object v0

    move-object v6, v0

    :goto_1
    if-eqz v4, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->s:Lcom/google/android/gms/b/re;

    if-eqz v0, :cond_3

    invoke-static {v4}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/b/tr;)Lcom/google/android/gms/b/qk;

    move-result-object v5

    new-instance v0, Lcom/google/android/gms/b/qo;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/w;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v3, v2, Lcom/google/android/gms/ads/internal/w;->d:Lcom/google/android/gms/b/dp;

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/qo;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/dp;Lcom/google/android/gms/b/tr;Lcom/google/android/gms/b/qp$a;)V

    invoke-virtual {v5, v0}, Lcom/google/android/gms/b/qk;->a(Lcom/google/android/gms/b/qp;)V

    invoke-direct {p0, v5}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/b/qk;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/b;->a(Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/yu;)Z

    move-result v0

    :goto_3
    return v0

    :cond_1
    move-object v4, v0

    goto :goto_0

    :cond_2
    move-object v6, v0

    goto :goto_1

    :cond_3
    if-eqz v6, :cond_4

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->t:Lcom/google/android/gms/b/rf;

    if-eqz v0, :cond_4

    invoke-static {v6}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/b/ts;)Lcom/google/android/gms/b/ql;

    move-result-object v5

    new-instance v0, Lcom/google/android/gms/b/qo;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/w;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v3, v2, Lcom/google/android/gms/ads/internal/w;->d:Lcom/google/android/gms/b/dp;

    move-object v2, p0

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/qo;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/b/dp;Lcom/google/android/gms/b/ts;Lcom/google/android/gms/b/qp$a;)V

    invoke-virtual {v5, v0}, Lcom/google/android/gms/b/ql;->a(Lcom/google/android/gms/b/qp;)V

    invoke-direct {p0, v5}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/b/ql;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Failed to get native ad mapper"

    invoke-static {v1, v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    :try_start_2
    const-string v0, "No matching mapper/listener for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->e(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/r;->a(I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    move v0, v2

    goto :goto_3

    :cond_5
    iget-object v1, p2, Lcom/google/android/gms/b/yu;->E:Lcom/google/android/gms/b/qp$a;

    instance-of v0, v1, Lcom/google/android/gms/b/ql;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->t:Lcom/google/android/gms/b/rf;

    if-eqz v0, :cond_6

    iget-object v0, p2, Lcom/google/android/gms/b/yu;->E:Lcom/google/android/gms/b/qp$a;

    check-cast v0, Lcom/google/android/gms/b/ql;

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/b/ql;)V

    goto :goto_2

    :cond_6
    instance-of v0, v1, Lcom/google/android/gms/b/qk;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->s:Lcom/google/android/gms/b/re;

    if-eqz v0, :cond_7

    iget-object v0, p2, Lcom/google/android/gms/b/yu;->E:Lcom/google/android/gms/b/qp$a;

    check-cast v0, Lcom/google/android/gms/b/qk;

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/b/qk;)V

    goto :goto_2

    :cond_7
    instance-of v0, v1, Lcom/google/android/gms/b/qm;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->v:Landroid/support/v4/i/k;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/w;->v:Landroid/support/v4/i/k;

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/b/qm;

    invoke-virtual {v0}, Lcom/google/android/gms/b/qm;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/support/v4/i/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v1, Lcom/google/android/gms/b/qm;

    invoke-virtual {v1}, Lcom/google/android/gms/b/qm;->l()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/b/yu;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_8
    const-string v0, "No matching listener for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->e(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/ads/internal/r;->a(I)V

    move v0, v2

    goto/16 :goto_3
.end method

.method public b(Landroid/support/v4/i/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rg;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/w;->u:Landroid/support/v4/i/k;

    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/b/rg;
    .locals 1

    const-string v0, "getOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/r;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/w;->u:Landroid/support/v4/i/k;

    invoke-virtual {v0, p1}, Landroid/support/v4/i/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/rg;

    return-object v0
.end method

.method public n()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support pause()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support resume()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
