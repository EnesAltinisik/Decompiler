.class public Lcom/google/android/gms/b/uj;
.super Lcom/google/android/gms/b/uk;

# interfaces
.implements Lcom/google/android/gms/b/rq;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field a:Landroid/util/DisplayMetrics;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field private final h:Lcom/google/android/gms/b/aaq;

.field private final i:Landroid/content/Context;

.field private final j:Landroid/view/WindowManager;

.field private final k:Lcom/google/android/gms/b/pj;

.field private l:F

.field private m:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/aaq;Landroid/content/Context;Lcom/google/android/gms/b/pj;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/uk;-><init>(Lcom/google/android/gms/b/aaq;)V

    iput v0, p0, Lcom/google/android/gms/b/uj;->b:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->c:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->d:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->e:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->f:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->g:I

    iput-object p1, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    iput-object p2, p0, Lcom/google/android/gms/b/uj;->i:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/b/uj;->k:Lcom/google/android/gms/b/pj;

    const-string v0, "window"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/google/android/gms/b/uj;->j:Landroid/view/WindowManager;

    return-void
.end method

.method private g()V
    .locals 2

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    iget-object v0, p0, Lcom/google/android/gms/b/uj;->j:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lcom/google/android/gms/b/uj;->l:F

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/b/uj;->m:I

    return-void
.end method

.method private h()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v1, v0}, Lcom/google/android/gms/b/aaq;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/uj;->i:Landroid/content/Context;

    const/4 v3, 0x0

    aget v3, v0, v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/zx;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/uj;->i:Landroid/content/Context;

    const/4 v4, 0x1

    aget v0, v0, v4

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/zx;->b(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/b/uj;->a(II)V

    return-void
.end method

.method private i()Lcom/google/android/gms/b/ui;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/ui$a;

    invoke-direct {v0}, Lcom/google/android/gms/b/ui$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->k:Lcom/google/android/gms/b/pj;

    invoke-virtual {v1}, Lcom/google/android/gms/b/pj;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ui$a;->b(Z)Lcom/google/android/gms/b/ui$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->k:Lcom/google/android/gms/b/pj;

    invoke-virtual {v1}, Lcom/google/android/gms/b/pj;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ui$a;->a(Z)Lcom/google/android/gms/b/ui$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->k:Lcom/google/android/gms/b/pj;

    invoke-virtual {v1}, Lcom/google/android/gms/b/pj;->e()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ui$a;->c(Z)Lcom/google/android/gms/b/ui$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->k:Lcom/google/android/gms/b/pj;

    invoke-virtual {v1}, Lcom/google/android/gms/b/pj;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ui$a;->d(Z)Lcom/google/android/gms/b/ui$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ui$a;->e(Z)Lcom/google/android/gms/b/ui$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ui$a;->a()Lcom/google/android/gms/b/ui;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    iget-object v2, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/zx;->b(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/b/uj;->b:I

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    iget-object v2, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/zx;->b(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/b/uj;->c:I

    iget-object v0, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->f()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    iget v0, p0, Lcom/google/android/gms/b/uj;->b:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->d:I

    iget v0, p0, Lcom/google/android/gms/b/uj;->c:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->e:I

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/zi;->a(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    const/4 v3, 0x0

    aget v3, v0, v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/zx;->b(Landroid/util/DisplayMetrics;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/b/uj;->d:I

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/uj;->a:Landroid/util/DisplayMetrics;

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/zx;->b(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/b/uj;->e:I

    goto :goto_0
.end method

.method public a(II)V
    .locals 4

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/uj;->i:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/b/uj;->i:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/zi;->d(Landroid/app/Activity;)[I

    move-result-object v0

    aget v0, v0, v1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v1}, Lcom/google/android/gms/b/aaq;->k()Lcom/google/android/gms/b/nx;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v1}, Lcom/google/android/gms/b/aaq;->k()Lcom/google/android/gms/b/nx;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/b/nx;->e:Z

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/uj;->i:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v3}, Lcom/google/android/gms/b/aaq;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/zx;->b(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/b/uj;->f:I

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/uj;->i:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v3}, Lcom/google/android/gms/b/aaq;->getMeasuredHeight()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/zx;->b(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/b/uj;->g:I

    :cond_1
    sub-int v0, p2, v0

    iget v1, p0, Lcom/google/android/gms/b/uj;->f:I

    iget v2, p0, Lcom/google/android/gms/b/uj;->g:I

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/google/android/gms/b/uj;->b(IIII)V

    iget-object v0, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->l()Lcom/google/android/gms/b/aar;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/aar;->a(II)V

    return-void

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/aaq;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/aaq;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/b/uj;->c()V

    return-void
.end method

.method b()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->k()Lcom/google/android/gms/b/nx;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/b/nx;->e:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/b/uj;->b:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->f:I

    iget v0, p0, Lcom/google/android/gms/b/uj;->c:I

    iput v0, p0, Lcom/google/android/gms/b/uj;->g:I

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0, v1, v1}, Lcom/google/android/gms/b/aaq;->measure(II)V

    goto :goto_0
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/uj;->g()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/uj;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/uj;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/uj;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/uj;->f()V

    invoke-direct {p0}, Lcom/google/android/gms/b/uj;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/uj;->d()V

    return-void
.end method

.method d()V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Dispatching Ready Event."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->d(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->o()Lcom/google/android/gms/b/aab;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/aab;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/uj;->c(Ljava/lang/String;)V

    return-void
.end method

.method e()V
    .locals 7

    iget v1, p0, Lcom/google/android/gms/b/uj;->b:I

    iget v2, p0, Lcom/google/android/gms/b/uj;->c:I

    iget v3, p0, Lcom/google/android/gms/b/uj;->d:I

    iget v4, p0, Lcom/google/android/gms/b/uj;->e:I

    iget v5, p0, Lcom/google/android/gms/b/uj;->l:F

    iget v6, p0, Lcom/google/android/gms/b/uj;->m:I

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/b/uj;->a(IIIIFI)V

    return-void
.end method

.method f()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/b/uj;->i()Lcom/google/android/gms/b/ui;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/uj;->h:Lcom/google/android/gms/b/aaq;

    const-string v2, "onDeviceFeaturesReceived"

    invoke-virtual {v0}, Lcom/google/android/gms/b/ui;->a()Lorg/json/JSONObject;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/b/aaq;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
