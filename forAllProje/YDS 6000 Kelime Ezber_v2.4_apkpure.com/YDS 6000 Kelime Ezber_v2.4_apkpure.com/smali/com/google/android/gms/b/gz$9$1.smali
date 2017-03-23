.class Lcom/google/android/gms/b/gz$9$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz$9;->a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hi;Lcom/google/android/gms/b/ge;Lcom/google/android/gms/b/hh$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/it;

.field final synthetic b:Lcom/google/android/gms/b/hh$a;

.field final synthetic c:Lcom/google/android/gms/b/gz$9;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz$9;Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hh$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gz$9$1;->c:Lcom/google/android/gms/b/gz$9;

    iput-object p2, p0, Lcom/google/android/gms/b/gz$9$1;->a:Lcom/google/android/gms/b/it;

    iput-object p3, p0, Lcom/google/android/gms/b/gz$9$1;->b:Lcom/google/android/gms/b/hh$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/gz$9$1;->c:Lcom/google/android/gms/b/gz$9;

    iget-object v0, v0, Lcom/google/android/gms/b/gz$9;->a:Lcom/google/android/gms/b/gz;

    invoke-static {v0}, Lcom/google/android/gms/b/gz;->c(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/he;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz$9$1;->a:Lcom/google/android/gms/b/it;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/he;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/gz$9$1;->c:Lcom/google/android/gms/b/gz$9;

    iget-object v1, v1, Lcom/google/android/gms/b/gz$9;->a:Lcom/google/android/gms/b/gz;

    invoke-static {v1}, Lcom/google/android/gms/b/gz;->d(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/hh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/gz$9$1;->a:Lcom/google/android/gms/b/it;

    invoke-virtual {v2}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz$9$1;->c:Lcom/google/android/gms/b/gz$9;

    iget-object v1, v1, Lcom/google/android/gms/b/gz$9;->a:Lcom/google/android/gms/b/gz;

    invoke-static {v1, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gz$9$1;->b:Lcom/google/android/gms/b/hh$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/hh$a;->a(Lcom/google/firebase/database/b;)Ljava/util/List;

    :cond_0
    return-void
.end method
