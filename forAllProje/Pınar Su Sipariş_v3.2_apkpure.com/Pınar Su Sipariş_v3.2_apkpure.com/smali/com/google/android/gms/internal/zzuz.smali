.class Lcom/google/android/gms/internal/zzuz;
.super Lcom/google/android/gms/internal/zzuy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzuz$a;,
        Lcom/google/android/gms/internal/zzuz$zza;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static o:Lcom/google/android/gms/internal/zzuz;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/internal/aq;

.field private volatile d:Lcom/google/android/gms/internal/ao;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Lcom/google/android/gms/internal/ar;

.field private l:Lcom/google/android/gms/internal/zzuz$zza;

.field private m:Lcom/google/android/gms/internal/as;

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzuz;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuy;-><init>()V

    const v0, 0x1b7740

    iput v0, p0, Lcom/google/android/gms/internal/zzuz;->e:I

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzuz;->f:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzuz;->g:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzuz;->h:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzuz;->i:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzuz;->j:Z

    new-instance v0, Lcom/google/android/gms/internal/zzuz$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzuz$1;-><init>(Lcom/google/android/gms/internal/zzuz;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzuz;->k:Lcom/google/android/gms/internal/ar;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzuz;->n:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/zzuz;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static a()Lcom/google/android/gms/internal/zzuz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzuz;->o:Lcom/google/android/gms/internal/zzuz;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzuz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzuz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzuz;->o:Lcom/google/android/gms/internal/zzuz;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/zzuz;->o:Lcom/google/android/gms/internal/zzuz;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/zzuz;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzuz;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/zzuz;)Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuz;->g()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/zzuz;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzuz;->e:I

    return v0
.end method

.method static synthetic d()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzuz;->a:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/zzuz;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->i:Z

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/zzuz;)Lcom/google/android/gms/internal/aq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->c:Lcom/google/android/gms/internal/aq;

    return-object v0
.end method

.method private e()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/as;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/as;-><init>(Lcom/google/android/gms/internal/zzuy;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzuz;->m:Lcom/google/android/gms/internal/as;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->m:Lcom/google/android/gms/internal/as;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzuz;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/as;->a(Landroid/content/Context;)V

    return-void
.end method

.method private f()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/zzuz$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzuz$a;-><init>(Lcom/google/android/gms/internal/zzuz;Lcom/google/android/gms/internal/zzuz$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzuz;->l:Lcom/google/android/gms/internal/zzuz$zza;

    iget v0, p0, Lcom/google/android/gms/internal/zzuz;->e:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->l:Lcom/google/android/gms/internal/zzuz$zza;

    iget v1, p0, Lcom/google/android/gms/internal/zzuz;->e:I

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/zzuz$zza;->zzv(J)V

    :cond_0
    return-void
.end method

.method private g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->n:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/zzuz;->e:I

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private h()V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuz;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->l:Lcom/google/android/gms/internal/zzuz$zza;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzuz$zza;->cancel()V

    const-string v0, "PowerSaveMode initiated."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->l:Lcom/google/android/gms/internal/zzuz$zza;

    iget v1, p0, Lcom/google/android/gms/internal/zzuz;->e:I

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/zzuz$zza;->zzv(J)V

    const-string v0, "PowerSaveMode terminated."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method declared-synchronized a(Landroid/content/Context;Lcom/google/android/gms/internal/ao;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->b:Landroid/content/Context;
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

    iput-object v0, p0, Lcom/google/android/gms/internal/zzuz;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->d:Lcom/google/android/gms/internal/ao;

    if-nez v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/internal/zzuz;->d:Lcom/google/android/gms/internal/ao;
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
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuz;->g()Z

    move-result v0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzuz;->n:Z

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzuz;->i:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuz;->g()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuz;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b()Lcom/google/android/gms/internal/aq;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->c:Lcom/google/android/gms/internal/aq;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->b:Landroid/content/Context;

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
    new-instance v0, Lcom/google/android/gms/internal/at;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzuz;->k:Lcom/google/android/gms/internal/ar;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzuz;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/internal/ar;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzuz;->c:Lcom/google/android/gms/internal/aq;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->l:Lcom/google/android/gms/internal/zzuz$zza;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuz;->f()V

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->g:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->f:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzuz;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->f:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->m:Lcom/google/android/gms/internal/as;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->j:Z

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuz;->e()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->c:Lcom/google/android/gms/internal/aq;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0
.end method

.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->g:Z

    if-nez v0, :cond_1

    const-string v0, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->h:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->h:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->d:Lcom/google/android/gms/internal/ao;

    new-instance v1, Lcom/google/android/gms/internal/zzuz$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzuz$2;-><init>(Lcom/google/android/gms/internal/zzuz;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ao;->a(Ljava/lang/Runnable;)V
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
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzuz;->n:Z

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/zzuz;->a(ZZ)V
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
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzuz;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuz;->l:Lcom/google/android/gms/internal/zzuz$zza;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzuz$zza;->zzKG()V
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
