.class public Lcom/google/android/gms/ads/internal/ClientApi;
.super Lcom/google/android/gms/b/on$a;


# annotations
.annotation build Landroid/support/annotation/Keep;
.end annotation

.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/on$a;-><init>()V

    return-void
.end method


# virtual methods
.method public createAdLoaderBuilder(Lcom/google/android/gms/a/a;Ljava/lang/String;Lcom/google/android/gms/b/tn;I)Lcom/google/android/gms/b/oi;
    .locals 6

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    new-instance v4, Lcom/google/android/gms/b/aab;

    const v0, 0x99dea0

    const/4 v2, 0x1

    invoke-direct {v4, v0, p4, v2}, Lcom/google/android/gms/b/aab;-><init>(IIZ)V

    new-instance v0, Lcom/google/android/gms/ads/internal/k;

    invoke-static {}, Lcom/google/android/gms/ads/internal/d;->a()Lcom/google/android/gms/ads/internal/d;

    move-result-object v5

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/k;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/ads/internal/d;)V

    return-object v0
.end method

.method public createAdOverlay(Lcom/google/android/gms/a/a;)Lcom/google/android/gms/b/un;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lcom/google/android/gms/ads/internal/overlay/g;

    invoke-direct {v1, v0}, Lcom/google/android/gms/ads/internal/overlay/g;-><init>(Landroid/app/Activity;)V

    return-object v1
.end method

.method public createBannerAdManager(Lcom/google/android/gms/a/a;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;I)Lcom/google/android/gms/b/ok;
    .locals 7

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    new-instance v5, Lcom/google/android/gms/b/aab;

    const v0, 0x99dea0

    const/4 v2, 0x1

    invoke-direct {v5, v0, p5, v2}, Lcom/google/android/gms/b/aab;-><init>(IIZ)V

    new-instance v0, Lcom/google/android/gms/ads/internal/f;

    invoke-static {}, Lcom/google/android/gms/ads/internal/d;->a()Lcom/google/android/gms/ads/internal/d;

    move-result-object v6

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/f;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/ads/internal/d;)V

    return-object v0
.end method

.method public createInAppPurchaseManager(Lcom/google/android/gms/a/a;)Lcom/google/android/gms/b/ux;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lcom/google/android/gms/ads/internal/purchase/e;

    invoke-direct {v1, v0}, Lcom/google/android/gms/ads/internal/purchase/e;-><init>(Landroid/app/Activity;)V

    return-object v1
.end method

.method public createInterstitialAdManager(Lcom/google/android/gms/a/a;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;I)Lcom/google/android/gms/b/ok;
    .locals 13

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/b/pr;->a(Landroid/content/Context;)V

    new-instance v5, Lcom/google/android/gms/b/aab;

    const v1, 0x99dea0

    const/4 v3, 0x1

    move/from16 v0, p5

    invoke-direct {v5, v1, v0, v3}, Lcom/google/android/gms/b/aab;-><init>(IIZ)V

    const-string v1, "reward_mb"

    iget-object v3, p2, Lcom/google/android/gms/b/nx;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v1, Lcom/google/android/gms/b/pr;->aK:Lcom/google/android/gms/b/pn;

    invoke-virtual {v1}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    if-eqz v3, :cond_2

    sget-object v1, Lcom/google/android/gms/b/pr;->aL:Lcom/google/android/gms/b/pn;

    invoke-virtual {v1}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_3

    new-instance v1, Lcom/google/android/gms/b/sp;

    invoke-static {}, Lcom/google/android/gms/ads/internal/d;->a()Lcom/google/android/gms/ads/internal/d;

    move-result-object v6

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/b/sp;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/ads/internal/d;)V

    :goto_1
    return-object v1

    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    :cond_3
    new-instance v6, Lcom/google/android/gms/ads/internal/l;

    invoke-static {}, Lcom/google/android/gms/ads/internal/d;->a()Lcom/google/android/gms/ads/internal/d;

    move-result-object v12

    move-object v7, v2

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object v11, v5

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/ads/internal/l;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/ads/internal/d;)V

    move-object v1, v6

    goto :goto_1
.end method

.method public createNativeAdViewDelegate(Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;)Lcom/google/android/gms/b/qx;
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-static {p2}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    new-instance v2, Lcom/google/android/gms/b/qt;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/b/qt;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V

    return-object v2
.end method

.method public createRewardedVideoAd(Lcom/google/android/gms/a/a;Lcom/google/android/gms/b/tn;I)Lcom/google/android/gms/b/xq;
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/b/aab;

    const v2, 0x99dea0

    const/4 v3, 0x1

    invoke-direct {v1, v2, p3, v3}, Lcom/google/android/gms/b/aab;-><init>(IIZ)V

    new-instance v2, Lcom/google/android/gms/b/xn;

    invoke-static {}, Lcom/google/android/gms/ads/internal/d;->a()Lcom/google/android/gms/ads/internal/d;

    move-result-object v3

    invoke-direct {v2, v0, v3, p2, v1}, Lcom/google/android/gms/b/xn;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/d;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;)V

    return-object v2
.end method

.method public createSearchAdManager(Lcom/google/android/gms/a/a;Lcom/google/android/gms/b/nx;Ljava/lang/String;I)Lcom/google/android/gms/b/ok;
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/b/aab;

    const v2, 0x99dea0

    const/4 v3, 0x1

    invoke-direct {v1, v2, p4, v3}, Lcom/google/android/gms/b/aab;-><init>(IIZ)V

    new-instance v2, Lcom/google/android/gms/ads/internal/u;

    invoke-direct {v2, v0, p2, p3, v1}, Lcom/google/android/gms/ads/internal/u;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/aab;)V

    return-object v2
.end method

.method public getMobileAdsSettingsManager(Lcom/google/android/gms/a/a;)Lcom/google/android/gms/b/op;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMobileAdsSettingsManagerWithClientJarVersion(Lcom/google/android/gms/a/a;I)Lcom/google/android/gms/b/op;
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/b/aab;

    const v2, 0x99dea0

    const/4 v3, 0x1

    invoke-direct {v1, v2, p2, v3}, Lcom/google/android/gms/b/aab;-><init>(IIZ)V

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/p;->a(Landroid/content/Context;Lcom/google/android/gms/b/aab;)Lcom/google/android/gms/ads/internal/p;

    move-result-object v0

    return-object v0
.end method
