.class Lcom/google/android/gms/b/jz;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/jz$c;,
        Lcom/google/android/gms/b/jz$a;,
        Lcom/google/android/gms/b/jz$b;
    }
.end annotation


# direct methods
.method static a(B)Lcom/google/android/gms/b/jz$b;
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/jz$a;

    invoke-direct {v0}, Lcom/google/android/gms/b/jz$a;-><init>()V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/jz$c;

    invoke-direct {v0}, Lcom/google/android/gms/b/jz$c;-><init>()V

    goto :goto_0
.end method
