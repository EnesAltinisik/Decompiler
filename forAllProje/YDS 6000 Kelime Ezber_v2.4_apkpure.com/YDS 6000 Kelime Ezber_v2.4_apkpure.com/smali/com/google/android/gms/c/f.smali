.class public final Lcom/google/android/gms/c/f;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/Exception;)Lcom/google/android/gms/c/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lcom/google/android/gms/c/d",
            "<TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/c/k;

    invoke-direct {v0}, Lcom/google/android/gms/c/k;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/c/k;->a(Ljava/lang/Exception;)V

    return-object v0
.end method
