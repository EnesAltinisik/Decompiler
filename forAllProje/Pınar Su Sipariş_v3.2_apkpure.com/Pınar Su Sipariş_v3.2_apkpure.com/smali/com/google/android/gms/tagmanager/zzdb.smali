.class Lcom/google/android/gms/tagmanager/zzdb;
.super Lcom/google/android/gms/tagmanager/zzda;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/zzdb$a;,
        Lcom/google/android/gms/tagmanager/zzdb$zza;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static n:Lcom/google/android/gms/tagmanager/zzdb;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/tagmanager/t;

.field private volatile d:Lcom/google/android/gms/tagmanager/r;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Lcom/google/android/gms/tagmanager/u;

.field private k:Lcom/google/android/gms/tagmanager/zzdb$zza;

.field private l:Lcom/google/android/gms/tagmanager/ah;

.field private m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzdb;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzda;-><init>()V

    const v0, 0x1b7740

    iput v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->e:I

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/zzdb;->f:Z

    iput-boolean v2, p0, Lcom/google/android/gms/tagmanager/zzdb;->g:Z

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/zzdb;->h:Z

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/zzdb;->i:Z

    new-instance v0, Lcom/google/android/gms/tagmanager/zzdb$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/zzdb$1;-><init>(Lcom/google/android/gms/tagmanager/zzdb;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->j:Lcom/google/android/gms/tagmanager/u;

    iput-boolean v2, p0, Lcom/google/android/gms/tagmanager/zzdb;->m:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/tagmanager/zzdb;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static a()Lcom/google/android/gms/tagmanager/zzdb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzdb;->n:Lcom/google/android/gms/tagmanager/zzdb;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/zzdb;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/zzdb;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzdb;->n:Lcom/google/android/gms/tagmanager/zzdb;

    :cond_0
    sget-object v0, Lcom/google/android/gms/tagmanager/zzdb;->n:Lcom/google/android/gms/tagmanager/zzdb;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/tagmanager/zzdb;)Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzdb;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/tagmanager/zzdb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->e:I

    return v0
.end method

.method static synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzdb;->a:Ljava/lang/Object;

    return-object v0
.end method

.method private d()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/tagmanager/ah;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/ah;-><init>(Lcom/google/android/gms/tagmanager/zzda;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->l:Lcom/google/android/gms/tagmanager/ah;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->l:Lcom/google/android/gms/tagmanager/ah;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzdb;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/ah;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/tagmanager/zzdb;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->h:Z

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/tagmanager/zzdb;)Lcom/google/android/gms/tagmanager/t;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->c:Lcom/google/android/gms/tagmanager/t;

    return-object v0
.end method

.method private e()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/tagmanager/zzdb$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/tagmanager/zzdb$a;-><init>(Lcom/google/android/gms/tagmanager/zzdb;Lcom/google/android/gms/tagmanager/zzdb$1;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->k:Lcom/google/android/gms/tagmanager/zzdb$zza;

    iget v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->e:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->k:Lcom/google/android/gms/tagmanager/zzdb$zza;

    iget v1, p0, Lcom/google/android/gms/tagmanager/zzdb;->e:I

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/tagmanager/zzdb$zza;->zzv(J)V

    :cond_0
    return-void
.end method

.method private f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->m:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->h:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->e:I

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzdb;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->k:Lcom/google/android/gms/tagmanager/zzdb$zza;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/zzdb$zza;->cancel()V

    const-string v0, "PowerSaveMode initiated."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->v(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->k:Lcom/google/android/gms/tagmanager/zzdb$zza;

    iget v1, p0, Lcom/google/android/gms/tagmanager/zzdb;->e:I

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/tagmanager/zzdb$zza;->zzv(J)V

    const-string v0, "PowerSaveMode terminated."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->v(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method declared-synchronized a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/r;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->b:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->d:Lcom/google/android/gms/tagmanager/r;

    if-nez v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzdb;->d:Lcom/google/android/gms/tagmanager/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(ZZ)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzdb;->f()Z

    move-result v0

    iput-boolean p1, p0, Lcom/google/android/gms/tagmanager/zzdb;->m:Z

    iput-boolean p2, p0, Lcom/google/android/gms/tagmanager/zzdb;->h:Z

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzdb;->f()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzdb;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b()Lcom/google/android/gms/tagmanager/t;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->c:Lcom/google/android/gms/tagmanager/t;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cant get a store unless we have a context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/tagmanager/au;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzdb;->j:Lcom/google/android/gms/tagmanager/u;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzdb;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/au;-><init>(Lcom/google/android/gms/tagmanager/u;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->c:Lcom/google/android/gms/tagmanager/t;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->k:Lcom/google/android/gms/tagmanager/zzdb$zza;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzdb;->e()V

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->g:Z

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->f:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzdb;->dispatch()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->f:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->l:Lcom/google/android/gms/tagmanager/ah;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->i:Z

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzdb;->d()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->c:Lcom/google/android/gms/tagmanager/t;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0
.end method

.method public declared-synchronized dispatch()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->g:Z

    if-nez v0, :cond_0

    const-string v0, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->v(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->d:Lcom/google/android/gms/tagmanager/r;

    new-instance v1, Lcom/google/android/gms/tagmanager/zzdb$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/zzdb$2;-><init>(Lcom/google/android/gms/tagmanager/zzdb;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/r;->a(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized zzaF(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->m:Z

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/tagmanager/zzdb;->a(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized zzlM()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzdb;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzdb;->k:Lcom/google/android/gms/tagmanager/zzdb$zza;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/zzdb$zza;->zzKG()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
