.class public abstract Lcom/google/android/gms/b/xg;
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
.method public abstract a(Landroid/content/Context;Lcom/google/android/gms/b/xa;Lcom/google/android/gms/b/aab;)V
.end method

.method protected a(Lcom/google/android/gms/b/xa;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/b/xa;->a()Lcom/google/android/gms/b/sv$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/xa;->a()Lcom/google/android/gms/b/sv$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/sv$c;->g_()V

    :cond_0
    return-void
.end method
