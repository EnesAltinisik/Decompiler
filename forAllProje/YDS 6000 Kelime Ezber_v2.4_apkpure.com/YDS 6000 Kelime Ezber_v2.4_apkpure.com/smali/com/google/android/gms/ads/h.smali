.class public Lcom/google/android/gms/ads/h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/h$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/ads/h;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/h$a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/h$a;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/b/ox;->a()Lcom/google/android/gms/b/ox;

    move-result-object v1

    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, p0, p1, v0}, Lcom/google/android/gms/b/ox;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/b/oy;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/ads/h$a;->a()Lcom/google/android/gms/b/oy;

    move-result-object v0

    goto :goto_0
.end method
