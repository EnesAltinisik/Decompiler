.class Lcom/google/android/gms/b/sl;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/sl$a;
    }
.end annotation


# instance fields
.field a:Lcom/google/android/gms/b/og;

.field b:Lcom/google/android/gms/b/om;

.field c:Lcom/google/android/gms/b/uv;

.field d:Lcom/google/android/gms/b/qe;

.field e:Lcom/google/android/gms/b/of;

.field f:Lcom/google/android/gms/b/xs;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/google/android/gms/ads/internal/l;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/sl;->a:Lcom/google/android/gms/b/og;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/sl$a;

    iget-object v1, p0, Lcom/google/android/gms/b/sl;->a:Lcom/google/android/gms/b/og;

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/sl$a;-><init>(Lcom/google/android/gms/b/og;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/b/og;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/sl;->b:Lcom/google/android/gms/b/om;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/sl;->b:Lcom/google/android/gms/b/om;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/b/om;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/sl;->c:Lcom/google/android/gms/b/uv;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/sl;->c:Lcom/google/android/gms/b/uv;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/b/uv;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/sl;->d:Lcom/google/android/gms/b/qe;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/sl;->d:Lcom/google/android/gms/b/qe;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/b/qe;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/sl;->e:Lcom/google/android/gms/b/of;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/b/sl;->e:Lcom/google/android/gms/b/of;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/b/of;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/sl;->f:Lcom/google/android/gms/b/xs;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/b/sl;->f:Lcom/google/android/gms/b/xs;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/b/xs;)V

    :cond_5
    return-void
.end method
