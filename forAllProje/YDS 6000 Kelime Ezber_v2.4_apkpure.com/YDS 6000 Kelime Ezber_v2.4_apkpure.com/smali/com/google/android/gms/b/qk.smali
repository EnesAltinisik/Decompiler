.class public Lcom/google/android/gms/b/qk;
.super Lcom/google/android/gms/b/qz$a;

# interfaces
.implements Lcom/google/android/gms/b/qp$a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/qj;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Lcom/google/android/gms/b/qu;

.field private e:Ljava/lang/String;

.field private f:D

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lcom/google/android/gms/b/qh;

.field private j:Landroid/os/Bundle;

.field private k:Lcom/google/android/gms/b/or;

.field private l:Landroid/view/View;

.field private m:Ljava/lang/Object;

.field private n:Lcom/google/android/gms/b/qp;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/qu;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/qh;Landroid/os/Bundle;Lcom/google/android/gms/b/or;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/b/qz$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/qk;->m:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/b/qk;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/b/qk;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/b/qk;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/b/qk;->d:Lcom/google/android/gms/b/qu;

    iput-object p5, p0, Lcom/google/android/gms/b/qk;->e:Ljava/lang/String;

    iput-wide p6, p0, Lcom/google/android/gms/b/qk;->f:D

    iput-object p8, p0, Lcom/google/android/gms/b/qk;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/b/qk;->h:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/b/qk;->i:Lcom/google/android/gms/b/qh;

    iput-object p11, p0, Lcom/google/android/gms/b/qk;->j:Landroid/os/Bundle;

    iput-object p12, p0, Lcom/google/android/gms/b/qk;->k:Lcom/google/android/gms/b/or;

    iput-object p13, p0, Lcom/google/android/gms/b/qk;->l:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/qp;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/qk;->m:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/b/qk;->n:Lcom/google/android/gms/b/qp;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/b/qu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->d:Lcom/google/android/gms/b/qu;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/b/qk;->f:D

    return-wide v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->g:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()Lcom/google/android/gms/b/or;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->k:Lcom/google/android/gms/b/or;

    return-object v0
.end method

.method public j()Lcom/google/android/gms/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->n:Lcom/google/android/gms/b/qp;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    const-string v0, "2"

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public m()Lcom/google/android/gms/b/qh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->i:Lcom/google/android/gms/b/qh;

    return-object v0
.end method

.method public n()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->j:Landroid/os/Bundle;

    return-object v0
.end method

.method public o()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/qk;->l:Landroid/view/View;

    return-object v0
.end method

.method public p()V
    .locals 3

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->a:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->b:Ljava/util/List;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->c:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->d:Lcom/google/android/gms/b/qu;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->e:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/b/qk;->f:D

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->g:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->h:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->i:Lcom/google/android/gms/b/qh;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->j:Landroid/os/Bundle;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->m:Ljava/lang/Object;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->n:Lcom/google/android/gms/b/qp;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->k:Lcom/google/android/gms/b/or;

    iput-object v2, p0, Lcom/google/android/gms/b/qk;->l:Landroid/view/View;

    return-void
.end method
