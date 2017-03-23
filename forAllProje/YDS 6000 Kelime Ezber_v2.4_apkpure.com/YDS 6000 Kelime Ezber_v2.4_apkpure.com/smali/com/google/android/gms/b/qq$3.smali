.class Lcom/google/android/gms/b/qq$3;
.super Lcom/google/android/gms/b/vq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/qq;->c()Lcom/google/android/gms/b/aaq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/qq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/qq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/qq$3;->a:Lcom/google/android/gms/b/qq;

    invoke-direct {p0}, Lcom/google/android/gms/b/vq$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/sw;)V
    .locals 3

    const-string v0, "/loadHtml"

    new-instance v1, Lcom/google/android/gms/b/qq$3$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/qq$3$1;-><init>(Lcom/google/android/gms/b/qq$3;Lcom/google/android/gms/b/sw;)V

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/showOverlay"

    new-instance v1, Lcom/google/android/gms/b/qq$3$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/qq$3$2;-><init>(Lcom/google/android/gms/b/qq$3;)V

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/hideOverlay"

    new-instance v1, Lcom/google/android/gms/b/qq$3$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/qq$3$3;-><init>(Lcom/google/android/gms/b/qq$3;)V

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    iget-object v0, p0, Lcom/google/android/gms/b/qq$3;->a:Lcom/google/android/gms/b/qq;

    invoke-static {v0}, Lcom/google/android/gms/b/qq;->b(Lcom/google/android/gms/b/qq;)Lcom/google/android/gms/b/aaq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->l()Lcom/google/android/gms/b/aar;

    move-result-object v0

    const-string v1, "/hideOverlay"

    new-instance v2, Lcom/google/android/gms/b/qq$3$4;

    invoke-direct {v2, p0}, Lcom/google/android/gms/b/qq$3$4;-><init>(Lcom/google/android/gms/b/qq$3;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/aar;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    iget-object v0, p0, Lcom/google/android/gms/b/qq$3;->a:Lcom/google/android/gms/b/qq;

    invoke-static {v0}, Lcom/google/android/gms/b/qq;->b(Lcom/google/android/gms/b/qq;)Lcom/google/android/gms/b/aaq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->l()Lcom/google/android/gms/b/aar;

    move-result-object v0

    const-string v1, "/sendMessageToSdk"

    new-instance v2, Lcom/google/android/gms/b/qq$3$5;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/b/qq$3$5;-><init>(Lcom/google/android/gms/b/qq$3;Lcom/google/android/gms/b/sw;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/aar;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    return-void
.end method
