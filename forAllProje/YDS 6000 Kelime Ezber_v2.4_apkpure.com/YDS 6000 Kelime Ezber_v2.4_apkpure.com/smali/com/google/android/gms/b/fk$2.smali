.class Lcom/google/android/gms/b/fk$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/fk;->a(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/gb;Lcom/google/android/gms/b/gd;Lcom/google/android/gms/b/gf$a;)Lcom/google/android/gms/b/gf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/fk;Lcom/google/android/gms/b/gf;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/fk$2;->a:Lcom/google/android/gms/b/gf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/fk$2;->a:Lcom/google/android/gms/b/gf;

    const-string v1, "app_in_background"

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/gf;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/fk$2;->a:Lcom/google/android/gms/b/gf;

    const-string v1, "app_in_background"

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/gf;->e(Ljava/lang/String;)V

    goto :goto_0
.end method
