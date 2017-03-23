.class Lcom/google/android/gms/b/fi$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/c/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/fi;->a(ZLcom/google/android/gms/b/gm$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/c/b",
        "<",
        "Lcom/google/firebase/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gm$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/fi;Lcom/google/android/gms/b/gm$a;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/fi$2;->a:Lcom/google/android/gms/b/gm$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/b/a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/fi$2;->a:Lcom/google/android/gms/b/gm$a;

    invoke-virtual {p1}, Lcom/google/firebase/b/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/gm$a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/firebase/b/a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/fi$2;->a(Lcom/google/firebase/b/a;)V

    return-void
.end method
