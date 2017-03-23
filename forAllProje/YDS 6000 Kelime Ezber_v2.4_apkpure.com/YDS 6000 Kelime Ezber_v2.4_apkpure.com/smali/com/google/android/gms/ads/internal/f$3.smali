.class Lcom/google/android/gms/ads/internal/f$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/aar$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/f;->e(Lcom/google/android/gms/b/yu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/yu;

.field final synthetic b:Lcom/google/android/gms/ads/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/f;Lcom/google/android/gms/b/yu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/f$3;->b:Lcom/google/android/gms/ads/internal/f;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/f$3;->a:Lcom/google/android/gms/b/yu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/mo;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/f$3;->b:Lcom/google/android/gms/ads/internal/f;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/f;->f:Lcom/google/android/gms/ads/internal/w;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/w;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/f$3;->a:Lcom/google/android/gms/b/yu;

    iget-object v2, v2, Lcom/google/android/gms/b/yu;->b:Lcom/google/android/gms/b/aaq;

    invoke-interface {v2}, Lcom/google/android/gms/b/aaq;->b()Landroid/view/View;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/mo;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/f$3;->a:Lcom/google/android/gms/b/yu;

    iget-object v1, v1, Lcom/google/android/gms/b/yu;->b:Lcom/google/android/gms/b/aaq;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/mo;->a(Lcom/google/android/gms/b/mo$b;)V

    return-void
.end method
