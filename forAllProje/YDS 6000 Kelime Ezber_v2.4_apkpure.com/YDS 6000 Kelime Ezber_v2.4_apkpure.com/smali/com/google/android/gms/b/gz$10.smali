.class Lcom/google/android/gms/b/gz$10;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/hh$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gz$10;->a:Lcom/google/android/gms/b/gz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hi;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/gz$10;->a:Lcom/google/android/gms/b/gz;

    invoke-static {v0}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/gf;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/gx;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/is;->e()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/b/gf;->a(Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hi;Lcom/google/android/gms/b/ge;Lcom/google/android/gms/b/hh$a;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/gz$10;->a:Lcom/google/android/gms/b/gz;

    invoke-static {v0}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/gf;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/gx;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/is;->e()Ljava/util/Map;

    move-result-object v2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/b/hi;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_0
    new-instance v5, Lcom/google/android/gms/b/gz$10$1;

    invoke-direct {v5, p0, p4}, Lcom/google/android/gms/b/gz$10$1;-><init>(Lcom/google/android/gms/b/gz$10;Lcom/google/android/gms/b/hh$a;)V

    move-object v3, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/b/gf;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/b/ge;Ljava/lang/Long;Lcom/google/android/gms/b/gi;)V

    return-void

    :cond_0
    const/4 v4, 0x0

    goto :goto_0
.end method
