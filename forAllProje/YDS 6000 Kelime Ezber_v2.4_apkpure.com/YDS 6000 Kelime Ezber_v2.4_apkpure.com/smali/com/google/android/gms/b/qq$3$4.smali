.class Lcom/google/android/gms/b/qq$3$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/rq;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/qq$3;->a(Lcom/google/android/gms/b/sw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/qq$3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/qq$3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/qq$3$4;->a:Lcom/google/android/gms/b/qq$3;

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

    iget-object v0, p0, Lcom/google/android/gms/b/qq$3$4;->a:Lcom/google/android/gms/b/qq$3;

    iget-object v0, v0, Lcom/google/android/gms/b/qq$3;->a:Lcom/google/android/gms/b/qq;

    invoke-static {v0}, Lcom/google/android/gms/b/qq;->b(Lcom/google/android/gms/b/qq;)Lcom/google/android/gms/b/aaq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->b()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
