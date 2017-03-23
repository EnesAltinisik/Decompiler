.class public final Lcom/google/android/gms/b/vb;
.super Lcom/google/android/gms/b/uv$a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/purchase/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/purchase/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/uv$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/vb;->a:Lcom/google/android/gms/ads/purchase/b;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/uu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/vb;->a:Lcom/google/android/gms/ads/purchase/b;

    new-instance v1, Lcom/google/android/gms/b/ve;

    invoke-direct {v1, p1}, Lcom/google/android/gms/b/ve;-><init>(Lcom/google/android/gms/b/uu;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/purchase/b;->a(Lcom/google/android/gms/ads/purchase/a;)V

    return-void
.end method
