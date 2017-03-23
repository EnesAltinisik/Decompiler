.class Lcom/google/android/gms/b/go$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ig$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)Lcom/google/android/gms/b/go;
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
        "Lcom/google/android/gms/b/jr;",
        "Lcom/google/android/gms/b/go;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/gx;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/go$1;->a:Lcom/google/android/gms/b/gx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/go;)Lcom/google/android/gms/b/go;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/go$1;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {p3, v0, p2}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/go;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Lcom/google/android/gms/b/jr;

    check-cast p3, Lcom/google/android/gms/b/go;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/b/go$1;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/go;)Lcom/google/android/gms/b/go;

    move-result-object v0

    return-object v0
.end method
