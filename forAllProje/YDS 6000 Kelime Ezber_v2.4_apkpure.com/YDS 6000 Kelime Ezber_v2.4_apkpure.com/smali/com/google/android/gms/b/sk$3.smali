.class Lcom/google/android/gms/b/sk$3;
.super Lcom/google/android/gms/b/uv$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/sk;->a(Lcom/google/android/gms/ads/internal/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/sk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/sk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/sk$3;->a:Lcom/google/android/gms/b/sk;

    invoke-direct {p0}, Lcom/google/android/gms/b/uv$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/uu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/sk$3;->a:Lcom/google/android/gms/b/sk;

    invoke-static {v0}, Lcom/google/android/gms/b/sk;->a(Lcom/google/android/gms/b/sk;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/sk$3$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/sk$3$1;-><init>(Lcom/google/android/gms/b/sk$3;Lcom/google/android/gms/b/uu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
