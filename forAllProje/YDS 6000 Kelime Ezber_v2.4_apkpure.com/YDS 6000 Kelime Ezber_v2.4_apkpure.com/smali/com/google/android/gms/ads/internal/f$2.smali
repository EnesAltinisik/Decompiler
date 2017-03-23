.class Lcom/google/android/gms/ads/internal/f$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/aar$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/f;->a(Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/yu;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/yu;

.field final synthetic b:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/f;Lcom/google/android/gms/b/yu;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/f$2;->a:Lcom/google/android/gms/b/yu;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/f$2;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/f$2;->a:Lcom/google/android/gms/b/yu;

    iget-boolean v0, v0, Lcom/google/android/gms/b/yu;->m:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/f$2;->b:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/google/android/gms/b/zi;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
