.class Lcom/google/android/gms/b/sv$c$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/aaj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/sv$c;->g_()V
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
        "Lcom/google/android/gms/b/sw;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/sv$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/sv$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/sv$c$2;->a:Lcom/google/android/gms/b/sv$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/sw;)V
    .locals 1

    const-string v0, "Releasing engine reference."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/sv$c$2;->a:Lcom/google/android/gms/b/sv$c;

    invoke-static {v0}, Lcom/google/android/gms/b/sv$c;->a(Lcom/google/android/gms/b/sv$c;)Lcom/google/android/gms/b/sv$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/sv$d;->i_()V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/sw;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/sv$c$2;->a(Lcom/google/android/gms/b/sw;)V

    return-void
.end method
