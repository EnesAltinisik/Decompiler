.class Lcom/google/android/gms/b/ii$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ii$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/ii;->a(Lcom/google/android/gms/b/ii$b;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/ii$b",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ii$b;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ii;Lcom/google/android/gms/b/ii$b;Z)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/ii$1;->a:Lcom/google/android/gms/b/ii$b;

    iput-boolean p3, p0, Lcom/google/android/gms/b/ii$1;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/ii;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ii",
            "<TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ii$1;->a:Lcom/google/android/gms/b/ii$b;

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/b/ii$1;->b:Z

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/b/ii;->a(Lcom/google/android/gms/b/ii$b;ZZ)V

    return-void
.end method
