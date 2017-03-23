.class Lcom/google/android/gms/b/fl$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ig$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/fl;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/id;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/ig$a",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ig;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/google/android/gms/b/gx;

.field final synthetic d:Lcom/google/android/gms/b/jr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/fl;Lcom/google/android/gms/b/ig;Ljava/util/List;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/fl$2;->a:Lcom/google/android/gms/b/ig;

    iput-object p3, p0, Lcom/google/android/gms/b/fl$2;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/b/fl$2;->c:Lcom/google/android/gms/b/gx;

    iput-object p5, p0, Lcom/google/android/gms/b/fl$2;->d:Lcom/google/android/gms/b/jr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/Void;

    check-cast p3, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/b/fl$2;->a(Lcom/google/android/gms/b/gx;Ljava/lang/Void;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Ljava/lang/Void;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/fl$2;->a:Lcom/google/android/gms/b/ig;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ig;->e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/fl$2;->b:Ljava/util/List;

    new-instance v1, Lcom/google/android/gms/b/kr;

    iget-object v2, p0, Lcom/google/android/gms/b/fl$2;->c:Lcom/google/android/gms/b/gx;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/fl$2;->d:Lcom/google/android/gms/b/jr;

    invoke-interface {v3, p1}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/b/kr;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
