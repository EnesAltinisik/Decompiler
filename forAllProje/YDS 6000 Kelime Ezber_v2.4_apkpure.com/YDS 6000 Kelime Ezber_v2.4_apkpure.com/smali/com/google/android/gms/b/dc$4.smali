.class Lcom/google/android/gms/b/dc$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/b/ch;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/b/ch;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/google/android/gms/b/dc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/dc;ZZLcom/google/android/gms/b/ch;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    iput-boolean p2, p0, Lcom/google/android/gms/b/dc$4;->a:Z

    iput-boolean p3, p0, Lcom/google/android/gms/b/dc$4;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/b/dc$4;->c:Lcom/google/android/gms/b/ch;

    iput-object p5, p0, Lcom/google/android/gms/b/dc$4;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    invoke-static {v0}, Lcom/google/android/gms/b/dc;->c(Lcom/google/android/gms/b/dc;)Lcom/google/android/gms/b/ck;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send event to service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/dc$4;->a:Z

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    iget-boolean v0, p0, Lcom/google/android/gms/b/dc$4;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/b/ck;Lcom/google/android/gms/common/internal/safeparcel/a;)V

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    invoke-static {v0}, Lcom/google/android/gms/b/dc;->d(Lcom/google/android/gms/b/dc;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/dc$4;->c:Lcom/google/android/gms/b/ch;

    goto :goto_1

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/dc$4;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/dc$4;->c:Lcom/google/android/gms/b/ch;

    iget-object v2, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    invoke-virtual {v2}, Lcom/google/android/gms/b/dc;->i()Lcom/google/android/gms/b/cl;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    invoke-virtual {v3}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->E()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/cl;->a(Ljava/lang/String;)Lcom/google/android/gms/b/bv;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/b/ck;->a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    invoke-virtual {v1}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Failed to send event to the service"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/dc$4;->c:Lcom/google/android/gms/b/ch;

    iget-object v2, p0, Lcom/google/android/gms/b/dc$4;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/b/dc$4;->e:Lcom/google/android/gms/b/dc;

    invoke-virtual {v3}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->E()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/b/ck;->a(Lcom/google/android/gms/b/ch;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method
