.class public Lcom/google/android/gms/ads/internal/k;
.super Lcom/google/android/gms/b/oi$a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/b/og;

.field private b:Lcom/google/android/gms/b/re;

.field private c:Lcom/google/android/gms/b/rf;

.field private d:Landroid/support/v4/i/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rg;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/support/v4/i/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rh;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/b/qr;

.field private g:Lcom/google/android/gms/b/oo;

.field private final h:Landroid/content/Context;

.field private final i:Lcom/google/android/gms/b/tn;

.field private final j:Ljava/lang/String;

.field private final k:Lcom/google/android/gms/b/aab;

.field private final l:Lcom/google/android/gms/ads/internal/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/ads/internal/d;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/b/oi$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/k;->h:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/k;->j:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/k;->i:Lcom/google/android/gms/b/tn;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/k;->k:Lcom/google/android/gms/b/aab;

    new-instance v0, Landroid/support/v4/i/k;

    invoke-direct {v0}, Landroid/support/v4/i/k;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/k;->e:Landroid/support/v4/i/k;

    new-instance v0, Landroid/support/v4/i/k;

    invoke-direct {v0}, Landroid/support/v4/i/k;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/k;->d:Landroid/support/v4/i/k;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/k;->l:Lcom/google/android/gms/ads/internal/d;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/oh;
    .locals 13

    new-instance v0, Lcom/google/android/gms/ads/internal/j;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/k;->h:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/k;->j:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/k;->i:Lcom/google/android/gms/b/tn;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/k;->k:Lcom/google/android/gms/b/aab;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/k;->a:Lcom/google/android/gms/b/og;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/k;->b:Lcom/google/android/gms/b/re;

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/k;->c:Lcom/google/android/gms/b/rf;

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/k;->e:Landroid/support/v4/i/k;

    iget-object v9, p0, Lcom/google/android/gms/ads/internal/k;->d:Landroid/support/v4/i/k;

    iget-object v10, p0, Lcom/google/android/gms/ads/internal/k;->f:Lcom/google/android/gms/b/qr;

    iget-object v11, p0, Lcom/google/android/gms/ads/internal/k;->g:Lcom/google/android/gms/b/oo;

    iget-object v12, p0, Lcom/google/android/gms/ads/internal/k;->l:Lcom/google/android/gms/ads/internal/d;

    invoke-direct/range {v0 .. v12}, Lcom/google/android/gms/ads/internal/j;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/og;Lcom/google/android/gms/b/re;Lcom/google/android/gms/b/rf;Landroid/support/v4/i/k;Landroid/support/v4/i/k;Lcom/google/android/gms/b/qr;Lcom/google/android/gms/b/oo;Lcom/google/android/gms/ads/internal/d;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/og;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/k;->a:Lcom/google/android/gms/b/og;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/oo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/k;->g:Lcom/google/android/gms/b/oo;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/qr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/k;->f:Lcom/google/android/gms/b/qr;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/re;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/k;->b:Lcom/google/android/gms/b/re;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/rf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/k;->c:Lcom/google/android/gms/b/rf;

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/b/rh;Lcom/google/android/gms/b/rg;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Custom template ID for native custom template ad is empty. Please provide a valid template id."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/k;->e:Landroid/support/v4/i/k;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/i/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/k;->d:Landroid/support/v4/i/k;

    invoke-virtual {v0, p1, p3}, Landroid/support/v4/i/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
