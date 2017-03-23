.class Lcom/google/android/gms/b/iw$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/iy$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/iw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/hq;

.field private final b:Lcom/google/android/gms/b/iv;

.field private final c:Lcom/google/android/gms/b/jr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/jr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/iw$b;->a:Lcom/google/android/gms/b/hq;

    iput-object p2, p0, Lcom/google/android/gms/b/iw$b;->b:Lcom/google/android/gms/b/iv;

    iput-object p3, p0, Lcom/google/android/gms/b/iw$b;->c:Lcom/google/android/gms/b/jr;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/iw$b;->b:Lcom/google/android/gms/b/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/je;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/iw$b;->c:Lcom/google/android/gms/b/jr;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/b/ik;

    iget-object v1, p0, Lcom/google/android/gms/b/iw$b;->c:Lcom/google/android/gms/b/jr;

    invoke-static {}, Lcom/google/android/gms/b/jn;->b()Lcom/google/android/gms/b/jn;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/ik;-><init>(Lcom/google/android/gms/b/jl;ZZ)V

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/b/iw$b;->a:Lcom/google/android/gms/b/hq;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/ik;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/iw$b;->b:Lcom/google/android/gms/b/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    goto :goto_1
.end method
