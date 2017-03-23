.class Lcom/google/android/gms/b/cv$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/cv;->a(Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/b/cv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/cv$2;->b:Lcom/google/android/gms/b/cv;

    iput-object p2, p0, Lcom/google/android/gms/b/cv$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/cv$2;->b:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cv$2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv$2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
