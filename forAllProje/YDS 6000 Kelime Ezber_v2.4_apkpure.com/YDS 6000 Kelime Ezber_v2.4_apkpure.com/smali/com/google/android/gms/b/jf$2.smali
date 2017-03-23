.class Lcom/google/android/gms/b/jf$2;
.super Lcom/google/android/gms/b/ft$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/jf;->a(Lcom/google/android/gms/b/jf$a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/ft$b",
        "<",
        "Lcom/google/android/gms/b/je;",
        "Lcom/google/android/gms/b/jr;",
        ">;"
    }
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/google/android/gms/b/jf$a;

.field final synthetic c:Lcom/google/android/gms/b/jf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/jf;Lcom/google/android/gms/b/jf$a;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/b/jf$2;->c:Lcom/google/android/gms/b/jf;

    iput-object p2, p0, Lcom/google/android/gms/b/jf$2;->b:Lcom/google/android/gms/b/jf$a;

    invoke-direct {p0}, Lcom/google/android/gms/b/ft$b;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/jf$2;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/b/jf$2;->a:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/je;->c()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/je;->a(Lcom/google/android/gms/b/je;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/jf$2;->a:Z

    iget-object v0, p0, Lcom/google/android/gms/b/jf$2;->b:Lcom/google/android/gms/b/jf$a;

    invoke-static {}, Lcom/google/android/gms/b/je;->c()Lcom/google/android/gms/b/je;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/jf$2;->c:Lcom/google/android/gms/b/jf;

    invoke-virtual {v2}, Lcom/google/android/gms/b/jf;->e()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/jf$a;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/jf$2;->b:Lcom/google/android/gms/b/jf$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/jf$a;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/je;

    check-cast p2, Lcom/google/android/gms/b/jr;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/jf$2;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    return-void
.end method
