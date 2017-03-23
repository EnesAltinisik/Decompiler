.class public Lcom/google/android/gms/b/aas;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/google/android/gms/b/nx;ZZLcom/google/android/gms/b/dp;Lcom/google/android/gms/b/aab;)Lcom/google/android/gms/b/aaq;
    .locals 10

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/gms/b/aas;->a(Landroid/content/Context;Lcom/google/android/gms/b/nx;ZZLcom/google/android/gms/b/dp;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/qa;Lcom/google/android/gms/ads/internal/t;Lcom/google/android/gms/ads/internal/d;)Lcom/google/android/gms/b/aaq;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/google/android/gms/b/nx;ZZLcom/google/android/gms/b/dp;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/qa;Lcom/google/android/gms/ads/internal/t;Lcom/google/android/gms/ads/internal/d;)Lcom/google/android/gms/b/aaq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/aat;

    invoke-static/range {p1 .. p9}, Lcom/google/android/gms/b/aau;->a(Landroid/content/Context;Lcom/google/android/gms/b/nx;ZZLcom/google/android/gms/b/dp;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/qa;Lcom/google/android/gms/ads/internal/t;Lcom/google/android/gms/ads/internal/d;)Lcom/google/android/gms/b/aau;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/aat;-><init>(Lcom/google/android/gms/b/aaq;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->g()Lcom/google/android/gms/b/zj;

    move-result-object v1

    invoke-virtual {v1, v0, p4}, Lcom/google/android/gms/b/zj;->a(Lcom/google/android/gms/b/aaq;Z)Lcom/google/android/gms/b/aar;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/aaq;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->g()Lcom/google/android/gms/b/zj;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/zj;->c(Lcom/google/android/gms/b/aaq;)Landroid/webkit/WebChromeClient;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/aaq;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-object v0
.end method
