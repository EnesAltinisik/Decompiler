.class Lcom/google/android/gms/b/ou$1;
.super Lcom/google/android/gms/b/oe;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/ou;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ou;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ou;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ou$1;->a:Lcom/google/android/gms/b/ou;

    invoke-direct {p0}, Lcom/google/android/gms/b/oe;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/ou$1;->a:Lcom/google/android/gms/b/ou;

    invoke-static {v0}, Lcom/google/android/gms/b/ou;->a(Lcom/google/android/gms/b/ou;)Lcom/google/android/gms/ads/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/ou$1;->a:Lcom/google/android/gms/b/ou;

    invoke-virtual {v1}, Lcom/google/android/gms/b/ou;->m()Lcom/google/android/gms/b/or;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/j;->a(Lcom/google/android/gms/b/or;)V

    invoke-super {p0}, Lcom/google/android/gms/b/oe;->a()V

    return-void
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/ou$1;->a:Lcom/google/android/gms/b/ou;

    invoke-static {v0}, Lcom/google/android/gms/b/ou;->a(Lcom/google/android/gms/b/ou;)Lcom/google/android/gms/ads/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/ou$1;->a:Lcom/google/android/gms/b/ou;

    invoke-virtual {v1}, Lcom/google/android/gms/b/ou;->m()Lcom/google/android/gms/b/or;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/j;->a(Lcom/google/android/gms/b/or;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/b/oe;->a(I)V

    return-void
.end method
