.class public Lcom/google/android/gms/internal/zzadp;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzafb;


# instance fields
.field private final zzbHJ:Lcom/google/firebase/FirebaseApp;

.field private final zzbHO:Landroid/content/Context;

.field private final zzbHP:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/firebase/FirebaseApp;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadp;->zzbHP:Ljava/util/Set;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadp;->zzbHJ:Lcom/google/firebase/FirebaseApp;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadp;->zzbHJ:Lcom/google/firebase/FirebaseApp;

    if-nez v0, :cond_0

    const-string v0, "FirebaseDatabase"

    const-string v1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FirebaseDatabase"

    const-string v1, "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FirebaseDatabase"

    const-string v1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "You need to call FirebaseApp.initializeApp() before using Firebase Database."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadp;->zzbHJ:Lcom/google/firebase/FirebaseApp;

    invoke-virtual {v0}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadp;->zzbHO:Landroid/content/Context;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzadp;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadp;->zzbHO:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzaef;Lcom/google/android/gms/internal/zzaeh;Lcom/google/android/gms/internal/zzaej$zza;)Lcom/google/android/gms/internal/zzaej;
    .locals 7

    new-instance v0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaeu;->zzQD()Lcom/google/android/gms/internal/zzahg$zza;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaeu;->zzQY()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaeu;->zzPW()Z

    move-result v4

    invoke-static {}, Lcom/google/firebase/database/FirebaseDatabase;->getSdkVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaeu;->zziJ()Ljava/lang/String;

    move-result-object v6

    move-object v1, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/database/connection/idl/ConnectionConfig;-><init>(Lcom/google/android/gms/internal/zzaeh;Lcom/google/android/gms/internal/zzahg$zza;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadp;->zzbHO:Landroid/content/Context;

    invoke-static {v1, v0, p2, p4}, Lcom/google/firebase/database/connection/idl/zzc;->zza(Landroid/content/Context;Lcom/google/firebase/database/connection/idl/ConnectionConfig;Lcom/google/android/gms/internal/zzaef;Lcom/google/android/gms/internal/zzaej$zza;)Lcom/google/firebase/database/connection/idl/zzc;

    move-result-object v0

    return-object v0
.end method

.method public zza(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzaeq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzadn;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadp;->zzbHJ:Lcom/google/firebase/FirebaseApp;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/zzadn;-><init>(Lcom/google/firebase/FirebaseApp;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaeu;Ljava/lang/String;)Lcom/google/android/gms/internal/zzagd;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaeu;->zzRd()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadp;->zzbHP:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v1, Lcom/google/firebase/database/DatabaseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2f

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "SessionPersistenceKey \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\' has already been used."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/firebase/database/DatabaseException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadp;->zzbHP:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/internal/zzadq;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadp;->zzbHO:Landroid/content/Context;

    invoke-direct {v0, v2, p1, v1}, Lcom/google/android/gms/internal/zzadq;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzaeu;Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/zzagb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaeu;->zzRa()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/zzagb;-><init>(J)V

    new-instance v2, Lcom/google/android/gms/internal/zzaga;

    invoke-direct {v2, p1, v0, v1}, Lcom/google/android/gms/internal/zzaga;-><init>(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzage;Lcom/google/android/gms/internal/zzafz;)V

    return-object v2
.end method

.method public zza(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzahg$zza;Ljava/util/List;)Lcom/google/android/gms/internal/zzahg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaeu;",
            "Lcom/google/android/gms/internal/zzahg$zza;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/internal/zzahg;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzahd;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/zzahd;-><init>(Lcom/google/android/gms/internal/zzahg$zza;Ljava/util/List;)V

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaeu;)Lcom/google/firebase/database/EventTarget;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzado;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzado;-><init>()V

    return-object v0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzaeu;)Lcom/google/firebase/database/RunLoop;
    .locals 2

    const-string v0, "RunLoop"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzaeu;->zzib(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzadp$1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/zzadp$1;-><init>(Lcom/google/android/gms/internal/zzadp;Lcom/google/android/gms/internal/zzahf;)V

    return-object v1
.end method

.method public zzc(Lcom/google/android/gms/internal/zzaeu;)Ljava/lang/String;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Android"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
