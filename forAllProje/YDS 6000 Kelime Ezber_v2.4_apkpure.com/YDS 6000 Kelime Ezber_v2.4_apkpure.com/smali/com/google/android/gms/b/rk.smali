.class public Lcom/google/android/gms/b/rk;
.super Lcom/google/android/gms/b/rf$a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/b/e$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/b/e$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/rf$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/rk;->a:Lcom/google/android/gms/ads/b/e$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/rb;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/rk;->a:Lcom/google/android/gms/ads/b/e$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/rk;->b(Lcom/google/android/gms/b/rb;)Lcom/google/android/gms/b/rc;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/b/e$a;->a(Lcom/google/android/gms/ads/b/e;)V

    return-void
.end method

.method b(Lcom/google/android/gms/b/rb;)Lcom/google/android/gms/b/rc;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/rc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/rc;-><init>(Lcom/google/android/gms/b/rb;)V

    return-object v0
.end method
