.class Lcom/google/android/gms/b/sk$4$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/sk$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/sk$4;->a(Lcom/google/android/gms/b/qd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/qd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/sk$4;Lcom/google/android/gms/b/qd;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/sk$4$1;->a:Lcom/google/android/gms/b/qd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/sl;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/b/sl;->d:Lcom/google/android/gms/b/qe;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/b/sl;->d:Lcom/google/android/gms/b/qe;

    iget-object v1, p0, Lcom/google/android/gms/b/sk$4$1;->a:Lcom/google/android/gms/b/qd;

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/qe;->a(Lcom/google/android/gms/b/qd;)V

    :cond_0
    return-void
.end method
