.class public Lcom/google/android/gms/b/zj$h;
.super Lcom/google/android/gms/b/zj$g;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/zj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/zj$g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/aaq;Z)Lcom/google/android/gms/b/aar;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/abd;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/b/abd;-><init>(Lcom/google/android/gms/b/aaq;Z)V

    return-object v0
.end method

.method public b(Landroid/content/Context;)Landroid/webkit/CookieManager;
    .locals 1

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    return-object v0
.end method
