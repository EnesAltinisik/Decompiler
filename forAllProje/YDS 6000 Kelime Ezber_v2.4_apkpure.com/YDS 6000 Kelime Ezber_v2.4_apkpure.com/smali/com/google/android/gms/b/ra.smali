.class public Lcom/google/android/gms/b/ra;
.super Lcom/google/android/gms/ads/b/d;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/qz;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/ads/b/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/b/qw;

.field private d:Lcom/google/android/gms/ads/j;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/qz;)V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/ads/b/d;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/ra;->b:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/ads/j;

    invoke-direct {v0}, Lcom/google/android/gms/ads/j;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/ra;->d:Lcom/google/android/gms/ads/j;

    iput-object p1, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/ra;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/qu;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/ra;->b:Ljava/util/List;

    new-instance v3, Lcom/google/android/gms/b/qw;

    invoke-direct {v3, v1}, Lcom/google/android/gms/b/qw;-><init>(Lcom/google/android/gms/b/qu;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get image."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    const/4 v1, 0x0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->d()Lcom/google/android/gms/b/qu;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v0, Lcom/google/android/gms/b/qw;

    invoke-direct {v0, v2}, Lcom/google/android/gms/b/qw;-><init>(Lcom/google/android/gms/b/qu;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/b/ra;->c:Lcom/google/android/gms/b/qw;

    return-void

    :catch_1
    move-exception v0

    const-string v2, "Failed to get icon."

    invoke-static {v2, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method


# virtual methods
.method a(Ljava/lang/Object;)Lcom/google/android/gms/b/qu;
    .locals 1

    instance-of v0, p1, Landroid/os/IBinder;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/os/IBinder;

    invoke-static {p1}, Lcom/google/android/gms/b/qu$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/b/qu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/ra;->k()Lcom/google/android/gms/a/a;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->a()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get headline."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/ads/b/a$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ra;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->c()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get body."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Lcom/google/android/gms/ads/b/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ra;->c:Lcom/google/android/gms/b/qw;

    return-object v0
.end method

.method public f()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->e()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get call to action."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Ljava/lang/Double;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v1}, Lcom/google/android/gms/b/qz;->f()D

    move-result-wide v2

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpl-double v1, v2, v4

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to get star rating."

    invoke-static {v2, v1}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public h()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->g()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get store"

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public i()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->h()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get price."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Lcom/google/android/gms/ads/j;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->i()Lcom/google/android/gms/b/or;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ra;->d:Lcom/google/android/gms/ads/j;

    iget-object v1, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v1}, Lcom/google/android/gms/b/qz;->i()Lcom/google/android/gms/b/or;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/j;->a(Lcom/google/android/gms/b/or;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->d:Lcom/google/android/gms/ads/j;

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Exception occurred while getting video controller"

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected k()Lcom/google/android/gms/a/a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ra;->a:Lcom/google/android/gms/b/qz;

    invoke-interface {v0}, Lcom/google/android/gms/b/qz;->j()Lcom/google/android/gms/a/a;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to retrieve native ad engine."

    invoke-static {v1, v0}, Lcom/google/android/gms/b/zy;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method
