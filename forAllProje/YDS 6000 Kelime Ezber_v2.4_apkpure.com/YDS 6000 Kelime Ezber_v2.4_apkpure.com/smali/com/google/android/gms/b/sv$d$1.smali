.class Lcom/google/android/gms/b/sv$d$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/aaj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/sv$d;->h_()Lcom/google/android/gms/b/sv$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/aaj$c",
        "<",
        "Lcom/google/android/gms/b/sr;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/sv$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/sv$d;Lcom/google/android/gms/b/sv$c;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/sv$d$1;->a:Lcom/google/android/gms/b/sv$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/sr;)V
    .locals 2

    const-string v0, "Getting a new session for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/sv$d$1;->a:Lcom/google/android/gms/b/sv$c;

    invoke-interface {p1}, Lcom/google/android/gms/b/sr;->b()Lcom/google/android/gms/b/sx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/sv$c;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/sr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/sv$d$1;->a(Lcom/google/android/gms/b/sr;)V

    return-void
.end method
