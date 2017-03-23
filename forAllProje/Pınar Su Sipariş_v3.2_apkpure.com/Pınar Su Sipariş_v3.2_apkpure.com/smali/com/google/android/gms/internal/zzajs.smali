.class public Lcom/google/android/gms/internal/zzajs;
.super Ljava/lang/Object;


# static fields
.field private static final zzbVH:Ljava/lang/Object;

.field private static volatile zzbVI:Lcom/google/android/gms/internal/zzajs;


# instance fields
.field private mContext:Landroid/content/Context;

.field private zzbVJ:Lcom/google/android/gms/internal/zzajr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzajs;->zzbVH:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/zzqi;->zzaCo:Lcom/google/android/gms/internal/zzqi$zzb;

    const-string v1, "com.google.android.gms.firebasestorage"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/zzqi;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzqi$zzb;Ljava/lang/String;)Lcom/google/android/gms/internal/zzqi;

    move-result-object v0

    const-string v1, "com.google.firebase.storage.network.NetworkRequestFactoryImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzqi;->zzdM(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzajr$zza;->zzeS(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzajr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;
    :try_end_0
    .catch Lcom/google/android/gms/internal/zzqi$zza; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    if-nez v0, :cond_0

    const-string v0, "NetworkRqFactoryProxy"

    const-string v1, "Unable to load Firebase Storage Network layer."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :catch_0
    move-exception v0

    const-string v1, "NetworkRqFactoryProxy"

    const-string v2, "NetworkRequestFactoryProxy failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    return-void
.end method

.method public static zzi(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/zzajs;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/zzajs;->zzbVI:Lcom/google/android/gms/internal/zzajs;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/zzajs;->zzbVH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/zzajs;->zzbVI:Lcom/google/android/gms/internal/zzajs;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzajs;

    invoke-virtual {p0}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/zzajs;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/internal/zzajs;->zzbVI:Lcom/google/android/gms/internal/zzajs;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/zzajs;->zzbVI:Lcom/google/android/gms/internal/zzajs;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public zzVv()Ljava/lang/String;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzajr;->zzVv()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "NetworkRqFactoryProxy"

    const-string v2, "getBackendAuthority failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Landroid/net/Uri;J)Lcom/google/android/gms/internal/zzajt;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    invoke-interface {v1, p1, v2, p2, p3}, Lcom/google/android/gms/internal/zzajr;->zza(Landroid/net/Uri;Lcom/google/android/gms/dynamic/zzd;J)Lcom/google/android/gms/internal/zzajq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajq;)V

    return-object v0
.end method

.method public zza(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/zzajt;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    invoke-interface {v1, p1, v2, p2}, Lcom/google/android/gms/internal/zzajr;->zzb(Landroid/net/Uri;Lcom/google/android/gms/dynamic/zzd;Ljava/lang/String;)Lcom/google/android/gms/internal/zzajq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajq;)V

    return-object v0
.end method

.method public zza(Landroid/net/Uri;Ljava/lang/String;[BJIZ)Lcom/google/android/gms/internal/zzajt;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v3

    invoke-static {p3}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v5

    move-object v2, p1

    move-object v4, p2

    move-wide v6, p4

    move/from16 v8, p6

    move/from16 v9, p7

    invoke-interface/range {v1 .. v9}, Lcom/google/android/gms/internal/zzajr;->zza(Landroid/net/Uri;Lcom/google/android/gms/dynamic/zzd;Ljava/lang/String;Lcom/google/android/gms/dynamic/zzd;JIZ)Lcom/google/android/gms/internal/zzajq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajq;)V

    return-object v0
.end method

.method public zza(Landroid/net/Uri;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzajt;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v3

    invoke-interface {v1, p1, v2, v3}, Lcom/google/android/gms/internal/zzajr;->zza(Landroid/net/Uri;Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/dynamic/zzd;)Lcom/google/android/gms/internal/zzajq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajq;)V

    return-object v0
.end method

.method public zza(Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/zzajt;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v3

    invoke-interface {v1, p1, v2, v3, p3}, Lcom/google/android/gms/internal/zzajr;->zza(Landroid/net/Uri;Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/dynamic/zzd;Ljava/lang/String;)Lcom/google/android/gms/internal/zzajq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajq;)V

    return-object v0
.end method

.method public zzb(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/zzajt;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    invoke-interface {v1, p1, v2, p2}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/net/Uri;Lcom/google/android/gms/dynamic/zzd;Ljava/lang/String;)Lcom/google/android/gms/internal/zzajq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajq;)V

    return-object v0
.end method

.method public zzw(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzajr;->zzw(Landroid/net/Uri;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "NetworkRqFactoryProxy"

    const-string v2, "getDefaultURL failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzy(Landroid/net/Uri;)Lcom/google/android/gms/internal/zzajt;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Lcom/google/android/gms/internal/zzajr;->zza(Landroid/net/Uri;Lcom/google/android/gms/dynamic/zzd;)Lcom/google/android/gms/internal/zzajq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajq;)V

    return-object v0
.end method

.method public zzz(Landroid/net/Uri;)Lcom/google/android/gms/internal/zzajt;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajs;->zzbVJ:Lcom/google/android/gms/internal/zzajr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajs;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Lcom/google/android/gms/internal/zzajr;->zzb(Landroid/net/Uri;Lcom/google/android/gms/dynamic/zzd;)Lcom/google/android/gms/internal/zzajq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajq;)V

    return-object v0
.end method
