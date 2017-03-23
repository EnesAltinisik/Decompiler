.class Lcom/google/android/gms/b/wd$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/aaj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/wd;->c()Ljava/lang/Void;
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
        "Lcom/google/android/gms/b/wf;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/wo;

.field final synthetic b:Lcom/google/android/gms/b/wd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/wd;Lcom/google/android/gms/b/wo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wd$1;->b:Lcom/google/android/gms/b/wd;

    iput-object p2, p0, Lcom/google/android/gms/b/wd$1;->a:Lcom/google/android/gms/b/wo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/wf;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/wd$1;->b:Lcom/google/android/gms/b/wd;

    iget-object v1, p0, Lcom/google/android/gms/b/wd$1;->a:Lcom/google/android/gms/b/wo;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/b/wd;->a(Lcom/google/android/gms/b/wo;Lcom/google/android/gms/b/wf;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/wd$1;->b:Lcom/google/android/gms/b/wd;

    invoke-virtual {v0}, Lcom/google/android/gms/b/wd;->a()V

    :cond_0
    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/wf;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/wd$1;->a(Lcom/google/android/gms/b/wf;)V

    return-void
.end method
