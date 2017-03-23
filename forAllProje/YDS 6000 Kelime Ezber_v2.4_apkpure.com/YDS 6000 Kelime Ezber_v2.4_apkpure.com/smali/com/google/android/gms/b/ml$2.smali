.class Lcom/google/android/gms/b/ml$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/rq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/ml;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ml;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ml;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ml$2;->a:Lcom/google/android/gms/b/ml;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/aaq;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/aaq;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ml$2;->a:Lcom/google/android/gms/b/ml;

    invoke-static {v0}, Lcom/google/android/gms/b/ml;->a(Lcom/google/android/gms/b/ml;)Lcom/google/android/gms/b/mj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/ml$2;->a:Lcom/google/android/gms/b/ml;

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/b/mj;->a(Lcom/google/android/gms/b/mn;Ljava/util/Map;)V

    return-void
.end method
