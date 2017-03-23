.class public Lcom/google/android/gms/internal/zzaeu;
.super Ljava/lang/Object;


# static fields
.field private static zzbLv:Lcom/google/android/gms/internal/zzafb;


# instance fields
.field protected cacheSize:J

.field protected zzbHJ:Lcom/google/firebase/FirebaseApp;

.field protected zzbIW:Lcom/google/android/gms/internal/zzahg;

.field protected zzbIX:Z

.field protected zzbIZ:Ljava/lang/String;

.field private zzbLb:Z

.field protected zzbLp:Lcom/google/firebase/database/EventTarget;

.field protected zzbLq:Lcom/google/android/gms/internal/zzaeq;

.field protected zzbLr:Lcom/google/firebase/database/RunLoop;

.field protected zzbLs:Ljava/lang/String;

.field protected zzbLt:Lcom/google/android/gms/internal/zzahg$zza;

.field private zzbLu:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/zzahg$zza;->zzbQu:Lcom/google/android/gms/internal/zzahg$zza;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLt:Lcom/google/android/gms/internal/zzahg$zza;

    const-wide/32 v0, 0xa00000

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzaeu;->cacheSize:J

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLb:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLu:Z

    return-void
.end method

.method private zzPV()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaeu;->zzRc()Lcom/google/firebase/database/RunLoop;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzaip;

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Custom run loops are not supported!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/zzaip;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaip;->zzPV()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private zzQR()Lcom/google/android/gms/internal/zzafb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzaeu;->zzbLv:Lcom/google/android/gms/internal/zzafb;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzail;->zzUh()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQS()V

    :cond_0
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/zzaeu;->zzbLv:Lcom/google/android/gms/internal/zzafb;

    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/e;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/e;->a:Lcom/google/android/gms/internal/e;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/e;->b()V

    sput-object v0, Lcom/google/android/gms/internal/zzaeu;->zzbLv:Lcom/google/android/gms/internal/zzafb;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/f;->a:Lcom/google/android/gms/internal/f;

    sput-object v0, Lcom/google/android/gms/internal/zzaeu;->zzbLv:Lcom/google/android/gms/internal/zzafb;

    goto :goto_0
.end method

.method private declared-synchronized zzQS()V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/zzadp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaeu;->zzbHJ:Lcom/google/firebase/FirebaseApp;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzadp;-><init>(Lcom/google/firebase/FirebaseApp;)V

    sput-object v0, Lcom/google/android/gms/internal/zzaeu;->zzbLv:Lcom/google/android/gms/internal/zzafb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private zzQV()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzRf()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQR()Lcom/google/android/gms/internal/zzafb;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzRi()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzRh()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzRg()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzRk()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzRj()V

    return-void
.end method

.method private zzQW()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLp:Lcom/google/firebase/database/EventTarget;

    invoke-interface {v0}, Lcom/google/firebase/database/EventTarget;->restart()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLr:Lcom/google/firebase/database/RunLoop;

    invoke-interface {v0}, Lcom/google/firebase/database/RunLoop;->restart()V

    return-void
.end method

.method private zzRf()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIW:Lcom/google/android/gms/internal/zzahg;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQR()Lcom/google/android/gms/internal/zzafb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLt:Lcom/google/android/gms/internal/zzahg$zza;

    const/4 v2, 0x0

    invoke-interface {v0, p0, v1, v2}, Lcom/google/android/gms/internal/zzafb;->zza(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzahg$zza;Ljava/util/List;)Lcom/google/android/gms/internal/zzahg;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIW:Lcom/google/android/gms/internal/zzahg;

    :cond_0
    return-void
.end method

.method private zzRg()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLr:Lcom/google/firebase/database/RunLoop;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/zzaeu;->zzbLv:Lcom/google/android/gms/internal/zzafb;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzafb;->zzb(Lcom/google/android/gms/internal/zzaeu;)Lcom/google/firebase/database/RunLoop;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLr:Lcom/google/firebase/database/RunLoop;

    :cond_0
    return-void
.end method

.method private zzRh()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLp:Lcom/google/firebase/database/EventTarget;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQR()Lcom/google/android/gms/internal/zzafb;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzafb;->zza(Lcom/google/android/gms/internal/zzaeu;)Lcom/google/firebase/database/EventTarget;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLp:Lcom/google/firebase/database/EventTarget;

    :cond_0
    return-void
.end method

.method private zzRi()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIZ:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQR()Lcom/google/android/gms/internal/zzafb;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzafb;->zzc(Lcom/google/android/gms/internal/zzaeu;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzaeu;->zzid(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIZ:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private zzRj()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLq:Lcom/google/android/gms/internal/zzaeq;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQR()Lcom/google/android/gms/internal/zzafb;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzPV()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzafb;->zza(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzaeq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLq:Lcom/google/android/gms/internal/zzaeq;

    :cond_0
    return-void
.end method

.method private zzRk()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLs:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "default"

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLs:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/zzaeq;)Lcom/google/android/gms/internal/zzaee;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzaeu$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzaeu$1;-><init>(Lcom/google/android/gms/internal/zzaeq;)V

    return-object v0
.end method

.method private zzid(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Firebase/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "5"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/database/FirebaseDatabase;->getSdkVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method stop()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLu:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLp:Lcom/google/firebase/database/EventTarget;

    invoke-interface {v0}, Lcom/google/firebase/database/EventTarget;->shutdown()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLr:Lcom/google/firebase/database/RunLoop;

    invoke-interface {v0}, Lcom/google/firebase/database/RunLoop;->shutdown()V

    return-void
.end method

.method public zzPT()Lcom/google/android/gms/internal/zzahg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIW:Lcom/google/android/gms/internal/zzahg;

    return-object v0
.end method

.method public zzPW()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIX:Z

    return v0
.end method

.method public zzQD()Lcom/google/android/gms/internal/zzahg$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLt:Lcom/google/android/gms/internal/zzahg$zza;

    return-object v0
.end method

.method declared-synchronized zzQH()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLb:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLb:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQV()V
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

.method public zzQT()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLb:Z

    return v0
.end method

.method public zzQU()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLu:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQW()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLu:Z

    :cond_0
    return-void
.end method

.method protected zzQX()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQT()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/database/DatabaseException;

    const-string v1, "Modifications to DatabaseConfig objects must occur before they are in use"

    invoke-direct {v0, v1}, Lcom/google/firebase/database/DatabaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public zzQY()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public zzQZ()Lcom/google/android/gms/internal/zzaef;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/zzaef;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaeu;->zzPT()Lcom/google/android/gms/internal/zzahg;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaeu;->zzRe()Lcom/google/android/gms/internal/zzaeq;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzaeu;->zza(Lcom/google/android/gms/internal/zzaeq;)Lcom/google/android/gms/internal/zzaee;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzPV()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaeu;->zzPW()Z

    move-result v4

    invoke-static {}, Lcom/google/firebase/database/FirebaseDatabase;->getSdkVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaeu;->zziJ()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzaef;-><init>(Lcom/google/android/gms/internal/zzahg;Lcom/google/android/gms/internal/zzaee;Ljava/util/concurrent/ScheduledExecutorService;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public zzRa()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzaeu;->cacheSize:J

    return-wide v0
.end method

.method public zzRb()Lcom/google/firebase/database/EventTarget;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLp:Lcom/google/firebase/database/EventTarget;

    return-object v0
.end method

.method public zzRc()Lcom/google/firebase/database/RunLoop;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLr:Lcom/google/firebase/database/RunLoop;

    return-object v0
.end method

.method public zzRd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLs:Ljava/lang/String;

    return-object v0
.end method

.method public zzRe()Lcom/google/android/gms/internal/zzaeq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbLq:Lcom/google/android/gms/internal/zzaeq;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaeh;Lcom/google/android/gms/internal/zzaej$zza;)Lcom/google/android/gms/internal/zzaej;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQR()Lcom/google/android/gms/internal/zzafb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaeu;->zzQZ()Lcom/google/android/gms/internal/zzaef;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, Lcom/google/android/gms/internal/zzafb;->zza(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzaef;Lcom/google/android/gms/internal/zzaeh;Lcom/google/android/gms/internal/zzaej$zza;)Lcom/google/android/gms/internal/zzaej;

    move-result-object v0

    return-object v0
.end method

.method public zziJ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIZ:Ljava/lang/String;

    return-object v0
.end method

.method public zzib(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahf;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzahf;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIW:Lcom/google/android/gms/internal/zzahg;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/zzahf;-><init>(Lcom/google/android/gms/internal/zzahg;Ljava/lang/String;)V

    return-object v0
.end method

.method zzic(Ljava/lang/String;)Lcom/google/android/gms/internal/zzagd;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzbIX:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/zzaeu;->zzbLv:Lcom/google/android/gms/internal/zzafb;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/zzafb;->zza(Lcom/google/android/gms/internal/zzaeu;Ljava/lang/String;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You have enabled persistence, but persistence is not supported on this platform."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzagc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzagc;-><init>()V

    :cond_1
    return-object v0
.end method
