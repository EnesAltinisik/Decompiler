.class Lcom/google/android/gms/b/vr$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/rq;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/vr;->a(Lcom/google/android/gms/b/qp$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/qm;

.field final synthetic b:Lcom/google/android/gms/b/vr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/vr;Lcom/google/android/gms/b/qm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/vr$3;->b:Lcom/google/android/gms/b/vr;

    iput-object p2, p0, Lcom/google/android/gms/b/vr$3;->a:Lcom/google/android/gms/b/qm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/aaq;Ljava/util/Map;)V
    .locals 3
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

    const-string v0, "asset"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/b/vr$3;->b:Lcom/google/android/gms/b/vr;

    iget-object v2, p0, Lcom/google/android/gms/b/vr$3;->a:Lcom/google/android/gms/b/qm;

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/b/vr;->a(Lcom/google/android/gms/b/vr;Lcom/google/android/gms/b/rd;Ljava/lang/String;)V

    return-void
.end method
