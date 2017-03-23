.class Lcom/google/android/gms/b/if$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/hx;)Lcom/google/android/gms/b/id;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/b/ie;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/if;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/ie;Lcom/google/android/gms/b/ie;)I
    .locals 4

    iget-wide v0, p1, Lcom/google/android/gms/b/ie;->c:J

    iget-wide v2, p2, Lcom/google/android/gms/b/ie;->c:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/b/kt;->a(JJ)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/b/ie;

    check-cast p2, Lcom/google/android/gms/b/ie;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/if$6;->a(Lcom/google/android/gms/b/ie;Lcom/google/android/gms/b/ie;)I

    move-result v0

    return v0
.end method
