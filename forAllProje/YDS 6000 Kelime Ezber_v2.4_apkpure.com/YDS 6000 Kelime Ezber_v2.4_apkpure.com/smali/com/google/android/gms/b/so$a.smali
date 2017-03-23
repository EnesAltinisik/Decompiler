.class Lcom/google/android/gms/b/so$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/so;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Lcom/google/android/gms/ads/internal/l;

.field b:Lcom/google/android/gms/b/ns;

.field c:Lcom/google/android/gms/b/sk;

.field d:J

.field e:Z

.field f:Z

.field final synthetic g:Lcom/google/android/gms/b/so;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/so;Lcom/google/android/gms/b/sj;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/b/so$a;->g:Lcom/google/android/gms/b/so;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/b/so;->a(Lcom/google/android/gms/b/so;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/b/sj;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/internal/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/so$a;->a:Lcom/google/android/gms/ads/internal/l;

    new-instance v0, Lcom/google/android/gms/b/sk;

    invoke-direct {v0}, Lcom/google/android/gms/b/sk;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/so$a;->c:Lcom/google/android/gms/b/sk;

    iget-object v0, p0, Lcom/google/android/gms/b/so$a;->c:Lcom/google/android/gms/b/sk;

    iget-object v1, p0, Lcom/google/android/gms/b/so$a;->a:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/sk;->a(Lcom/google/android/gms/ads/internal/l;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/b/so;Lcom/google/android/gms/b/sj;Lcom/google/android/gms/b/ns;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/so$a;-><init>(Lcom/google/android/gms/b/so;Lcom/google/android/gms/b/sj;)V

    iput-object p3, p0, Lcom/google/android/gms/b/so$a;->b:Lcom/google/android/gms/b/ns;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/b/so$a;->e:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/so$a;->b:Lcom/google/android/gms/b/ns;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/so$a;->b:Lcom/google/android/gms/b/ns;

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/b/sm;->b(Lcom/google/android/gms/b/ns;)Lcom/google/android/gms/b/ns;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/so$a;->a:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/b/ns;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/b/so$a;->f:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/so$a;->e:Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->k()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/b/so$a;->d:J

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/so$a;->g:Lcom/google/android/gms/b/so;

    invoke-static {v0}, Lcom/google/android/gms/b/so;->b(Lcom/google/android/gms/b/so;)Lcom/google/android/gms/b/ns;

    move-result-object v0

    goto :goto_1
.end method
