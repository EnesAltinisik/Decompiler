.class Lcom/google/android/gms/b/i$2;
.super Lcom/google/android/gms/b/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/i;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/i;Lcom/google/android/gms/b/m;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/i$2;->a:Lcom/google/android/gms/b/i;

    invoke-direct {p0, p2}, Lcom/google/android/gms/b/n$a;-><init>(Lcom/google/android/gms/b/m;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/i$2;->a:Lcom/google/android/gms/b/i;

    invoke-static {v0}, Lcom/google/android/gms/b/i;->a(Lcom/google/android/gms/b/i;)Lcom/google/android/gms/b/n;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/n;->h:Lcom/google/android/gms/b/t$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/t$a;->a(Landroid/os/Bundle;)V

    return-void
.end method
