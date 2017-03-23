.class public Lcom/google/android/gms/b/ou;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/b/oe;

.field private final b:Lcom/google/android/gms/b/tm;

.field private final c:Lcom/google/android/gms/b/nw;

.field private final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final e:Lcom/google/android/gms/ads/j;

.field private f:Lcom/google/android/gms/b/nn;

.field private g:Lcom/google/android/gms/ads/a;

.field private h:[Lcom/google/android/gms/ads/d;

.field private i:Lcom/google/android/gms/ads/a/a;

.field private j:Lcom/google/android/gms/ads/f;

.field private k:Lcom/google/android/gms/b/ok;

.field private l:Lcom/google/android/gms/ads/purchase/b;

.field private m:Lcom/google/android/gms/ads/a/c;

.field private n:Lcom/google/android/gms/ads/purchase/d;

.field private o:Lcom/google/android/gms/ads/k;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Landroid/view/ViewGroup;

.field private s:I

.field private t:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {}, Lcom/google/android/gms/b/nw;->a()Lcom/google/android/gms/b/nw;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/ou;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/b/nw;I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZI)V
    .locals 6

    invoke-static {}, Lcom/google/android/gms/b/nw;->a()Lcom/google/android/gms/b/nw;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/ou;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/b/nw;I)V

    return-void
.end method

.method constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/b/nw;I)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/b/ou;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/b/nw;Lcom/google/android/gms/b/ok;I)V

    return-void
.end method

.method constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/b/nw;Lcom/google/android/gms/b/ok;I)V
    .locals 5

    const/4 v3, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/tm;

    invoke-direct {v0}, Lcom/google/android/gms/b/tm;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/ou;->b:Lcom/google/android/gms/b/tm;

    new-instance v0, Lcom/google/android/gms/ads/j;

    invoke-direct {v0}, Lcom/google/android/gms/ads/j;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/ou;->e:Lcom/google/android/gms/ads/j;

    new-instance v0, Lcom/google/android/gms/b/ou$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/ou$1;-><init>(Lcom/google/android/gms/b/ou;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ou;->a:Lcom/google/android/gms/b/oe;

    iput-object p1, p0, Lcom/google/android/gms/b/ou;->r:Landroid/view/ViewGroup;

    iput-object p4, p0, Lcom/google/android/gms/b/ou;->c:Lcom/google/android/gms/b/nw;

    iput-object p5, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/b/ou;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput p6, p0, Lcom/google/android/gms/b/ou;->s:I

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/b/oa;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/b/oa;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {v0, p3}, Lcom/google/android/gms/b/oa;->a(Z)[Lcom/google/android/gms/ads/d;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    invoke-virtual {v0}, Lcom/google/android/gms/b/oa;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ou;->p:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    aget-object v2, v2, v3

    iget v3, p0, Lcom/google/android/gms/b/ou;->s:I

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/b/ou;->a(Landroid/content/Context;Lcom/google/android/gms/ads/d;I)Lcom/google/android/gms/b/nx;

    move-result-object v1

    const-string v2, "Ads by Google"

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/b/zx;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/b/nx;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/b/nx;

    sget-object v4, Lcom/google/android/gms/ads/d;->a:Lcom/google/android/gms/ads/d;

    invoke-direct {v3, v1, v4}, Lcom/google/android/gms/b/nx;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/d;)V

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v3, v1, v0}, Lcom/google/android/gms/b/zx;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/b/nx;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/ou;)Lcom/google/android/gms/ads/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->e:Lcom/google/android/gms/ads/j;

    return-object v0
.end method

.method private static a(Landroid/content/Context;Lcom/google/android/gms/ads/d;I)Lcom/google/android/gms/b/nx;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/nx;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/nx;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/d;)V

    invoke-static {p2}, Lcom/google/android/gms/b/ou;->a(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/nx;->a(Z)V

    return-object v0
.end method

.method private static a(Landroid/content/Context;[Lcom/google/android/gms/ads/d;I)Lcom/google/android/gms/b/nx;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/nx;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/nx;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/d;)V

    invoke-static {p2}, Lcom/google/android/gms/b/ou;->a(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/nx;->a(Z)V

    return-object v0
.end method

.method private static a(I)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private q()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    invoke-interface {v0}, Lcom/google/android/gms/b/ok;->j()Lcom/google/android/gms/a/a;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/ou;->r:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get an ad frame."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    invoke-interface {v0}, Lcom/google/android/gms/b/ok;->i()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to destroy AdView."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/a/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/b/ou;->i:Lcom/google/android/gms/ads/a/a;

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/b/nz;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/nz;-><init>(Lcom/google/android/gms/ads/a/a;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/om;)V
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

    const-string v1, "Failed to set the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/a/c;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/b/ou;->m:Lcom/google/android/gms/ads/a/c;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/b/qf;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/qf;-><init>(Lcom/google/android/gms/ads/a/c;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/qe;)V
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

    const-string v1, "Failed to set the onCustomRenderedAdLoadedListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/a;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/b/ou;->g:Lcom/google/android/gms/ads/a;

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->a:Lcom/google/android/gms/b/oe;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/oe;->a(Lcom/google/android/gms/ads/a;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/f;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/b/ou;->j:Lcom/google/android/gms/ads/f;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->j:Lcom/google/android/gms/ads/f;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/oo;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->j:Lcom/google/android/gms/ads/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/f;->a()Lcom/google/android/gms/b/od;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set correlator."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/k;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/b/ou;->o:Lcom/google/android/gms/ads/k;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-nez p1, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/ph;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/b/ph;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/ph;-><init>(Lcom/google/android/gms/ads/k;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set video options."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/purchase/b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->n:Lcom/google/android/gms/ads/purchase/d;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Play store purchase parameter has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/b/ou;->l:Lcom/google/android/gms/ads/purchase/b;

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/b/vb;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/vb;-><init>(Lcom/google/android/gms/ads/purchase/b;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/uv;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the InAppPurchaseListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/b/nn;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/b/ou;->f:Lcom/google/android/gms/b/nn;

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

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
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/ou;->o()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->c:Lcom/google/android/gms/b/nw;

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->r:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/b/nw;->a(Landroid/content/Context;Lcom/google/android/gms/b/ot;)Lcom/google/android/gms/b/ns;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/ns;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->b:Lcom/google/android/gms/b/tm;

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

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on AdView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/b/ou;->p:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/google/android/gms/b/ou;->t:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    iget-boolean v1, p0, Lcom/google/android/gms/b/ou;->t:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to set manual impressions."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public varargs a([Lcom/google/android/gms/ads/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size can only be set once on AdView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/ou;->b([Lcom/google/android/gms/ads/d;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/nx;)Z
    .locals 2

    const-string v0, "search_v2"

    iget-object v1, p1, Lcom/google/android/gms/b/nx;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()Lcom/google/android/gms/ads/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->g:Lcom/google/android/gms/ads/a;

    return-object v0
.end method

.method public varargs b([Lcom/google/android/gms/ads/d;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->r:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    iget v3, p0, Lcom/google/android/gms/b/ou;->s:I

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/b/ou;->a(Landroid/content/Context;[Lcom/google/android/gms/ads/d;I)Lcom/google/android/gms/b/nx;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/nx;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->r:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the ad size."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/ads/d;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    invoke-interface {v0}, Lcom/google/android/gms/b/ok;->k()Lcom/google/android/gms/b/nx;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/nx;->b()Lcom/google/android/gms/ads/d;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get the current AdSize."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()[Lcom/google/android/gms/ads/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->p:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/ads/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->i:Lcom/google/android/gms/ads/a/a;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/ads/purchase/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->l:Lcom/google/android/gms/ads/purchase/b;

    return-object v0
.end method

.method public h()Lcom/google/android/gms/ads/a/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->m:Lcom/google/android/gms/ads/a/c;

    return-object v0
.end method

.method public i()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    invoke-interface {v0}, Lcom/google/android/gms/b/ok;->n()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call pause."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public j()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    invoke-interface {v0}, Lcom/google/android/gms/b/ok;->o()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call resume."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    invoke-interface {v0}, Lcom/google/android/gms/b/ok;->F()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get the mediation adapter class name."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public l()Lcom/google/android/gms/ads/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->e:Lcom/google/android/gms/ads/j;

    return-object v0
.end method

.method public m()Lcom/google/android/gms/b/or;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    invoke-interface {v1}, Lcom/google/android/gms/b/ok;->r()Lcom/google/android/gms/b/or;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to retrieve VideoController."

    invoke-static {v2, v1}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public n()Lcom/google/android/gms/ads/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->o:Lcom/google/android/gms/ads/k;

    return-object v0
.end method

.method o()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size and ad unit ID must be set before loadAd is called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/ou;->p()Lcom/google/android/gms/b/ok;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/np;

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->a:Lcom/google/android/gms/b/oe;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/np;-><init>(Lcom/google/android/gms/ads/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/og;)V

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->f:Lcom/google/android/gms/b/nn;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/no;

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->f:Lcom/google/android/gms/b/nn;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/no;-><init>(Lcom/google/android/gms/b/nn;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/of;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->i:Lcom/google/android/gms/ads/a/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/nz;

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->i:Lcom/google/android/gms/ads/a/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/nz;-><init>(Lcom/google/android/gms/ads/a/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/om;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->l:Lcom/google/android/gms/ads/purchase/b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/vb;

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->l:Lcom/google/android/gms/ads/purchase/b;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/vb;-><init>(Lcom/google/android/gms/ads/purchase/b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/uv;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->n:Lcom/google/android/gms/ads/purchase/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/vf;

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->n:Lcom/google/android/gms/ads/purchase/d;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/vf;-><init>(Lcom/google/android/gms/ads/purchase/d;)V

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->q:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/va;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->m:Lcom/google/android/gms/ads/a/c;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/qf;

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->m:Lcom/google/android/gms/ads/a/c;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/qf;-><init>(Lcom/google/android/gms/ads/a/c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/qe;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->j:Lcom/google/android/gms/ads/f;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->j:Lcom/google/android/gms/ads/f;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/f;->a()Lcom/google/android/gms/b/od;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/oo;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->o:Lcom/google/android/gms/ads/k;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    new-instance v1, Lcom/google/android/gms/b/ph;

    iget-object v2, p0, Lcom/google/android/gms/b/ou;->o:Lcom/google/android/gms/ads/k;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/ph;-><init>(Lcom/google/android/gms/ads/k;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Lcom/google/android/gms/b/ph;)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/b/ou;->k:Lcom/google/android/gms/b/ok;

    iget-boolean v1, p0, Lcom/google/android/gms/b/ou;->t:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ok;->a(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/b/ou;->q()V

    return-void
.end method

.method protected p()Lcom/google/android/gms/b/ok;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/b/ou;->r:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/ou;->h:[Lcom/google/android/gms/ads/d;

    iget v2, p0, Lcom/google/android/gms/b/ou;->s:I

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/b/ou;->a(Landroid/content/Context;[Lcom/google/android/gms/ads/d;I)Lcom/google/android/gms/b/nx;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/ou;->a(Lcom/google/android/gms/b/nx;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/oc;->b()Lcom/google/android/gms/b/ob;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/ou;->p:Ljava/lang/String;

    invoke-virtual {v2, v0, v1, v3}, Lcom/google/android/gms/b/ob;->a(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;)Lcom/google/android/gms/b/ok;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/b/oc;->b()Lcom/google/android/gms/b/ob;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/ou;->p:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/b/ou;->b:Lcom/google/android/gms/b/tm;

    invoke-virtual {v2, v0, v1, v3, v4}, Lcom/google/android/gms/b/ob;->a(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;)Lcom/google/android/gms/b/ok;

    move-result-object v0

    goto :goto_0
.end method
