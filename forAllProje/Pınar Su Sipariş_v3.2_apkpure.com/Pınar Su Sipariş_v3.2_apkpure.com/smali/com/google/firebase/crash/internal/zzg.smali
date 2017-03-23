.class public Lcom/google/firebase/crash/internal/zzg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/crash/internal/zzg$zza;
    }
.end annotation


# static fields
.field private static zzbGw:Lcom/google/firebase/crash/internal/zzg;


# instance fields
.field private zzbGv:Lcom/google/android/gms/internal/zzqi;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzPc()Lcom/google/firebase/crash/internal/zzg;
    .locals 2

    const-class v1, Lcom/google/firebase/crash/internal/zzg;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/crash/internal/zzg;->zzbGw:Lcom/google/firebase/crash/internal/zzg;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/firebase/crash/internal/zzg;->zzbGw:Lcom/google/firebase/crash/internal/zzg;

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/firebase/crash/internal/zzg;

    invoke-direct {v0}, Lcom/google/firebase/crash/internal/zzg;-><init>()V

    sput-object v0, Lcom/google/firebase/crash/internal/zzg;->zzbGw:Lcom/google/firebase/crash/internal/zzg;

    sget-object v0, Lcom/google/firebase/crash/internal/zzg;->zzbGw:Lcom/google/firebase/crash/internal/zzg;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public zzPd()Lcom/google/firebase/crash/internal/zzd;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/firebase/crash/internal/zzg$zza;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/crash/internal/zzg;->zzbGv:Lcom/google/android/gms/internal/zzqi;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/zzg;->zzbGv:Lcom/google/android/gms/internal/zzqi;

    const-string v1, "com.google.firebase.crash.internal.api.FirebaseCrashApiImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzqi;->zzdM(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/internal/zzd$zza;->zzeJ(Landroid/os/IBinder;)Lcom/google/firebase/crash/internal/zzd;
    :try_end_0
    .catch Lcom/google/android/gms/internal/zzqi$zza; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/firebase/crash/internal/zzg$zza;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/firebase/crash/internal/zzg$zza;-><init>(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/zzg$1;)V

    throw v1
.end method

.method public zzPe()Lcom/google/firebase/crash/internal/zze;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/firebase/crash/internal/zzg$zza;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/crash/internal/zzg;->zzbGv:Lcom/google/android/gms/internal/zzqi;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/zzg;->zzbGv:Lcom/google/android/gms/internal/zzqi;

    const-string v1, "com.google.firebase.crash.internal.service.FirebaseCrashReceiverServiceImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzqi;->zzdM(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/internal/zze$zza;->zzeK(Landroid/os/IBinder;)Lcom/google/firebase/crash/internal/zze;
    :try_end_0
    .catch Lcom/google/android/gms/internal/zzqi$zza; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/firebase/crash/internal/zzg$zza;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/firebase/crash/internal/zzg$zza;-><init>(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/zzg$1;)V

    throw v1
.end method

.method public zzPf()Lcom/google/firebase/crash/internal/zzf;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/firebase/crash/internal/zzg$zza;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/crash/internal/zzg;->zzbGv:Lcom/google/android/gms/internal/zzqi;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/zzg;->zzbGv:Lcom/google/android/gms/internal/zzqi;

    const-string v1, "com.google.firebase.crash.internal.service.FirebaseCrashSenderServiceImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzqi;->zzdM(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/internal/zzf$zza;->zzeL(Landroid/os/IBinder;)Lcom/google/firebase/crash/internal/zzf;
    :try_end_0
    .catch Lcom/google/android/gms/internal/zzqi$zza; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/firebase/crash/internal/zzg$zza;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/firebase/crash/internal/zzg$zza;-><init>(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/zzg$1;)V

    throw v1
.end method

.method public zzah(Landroid/content/Context;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/firebase/crash/internal/zzg$zza;
        }
    .end annotation

    const-class v1, Lcom/google/firebase/crash/internal/zzg;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/zzg;->zzbGv:Lcom/google/android/gms/internal/zzqi;

    if-eqz v0, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/internal/zzqi;->zzaCq:Lcom/google/android/gms/internal/zzqi$zzb;

    const-string v2, "com.google.android.gms.crash"

    invoke-static {p1, v0, v2}, Lcom/google/android/gms/internal/zzqi;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzqi$zzb;Ljava/lang/String;)Lcom/google/android/gms/internal/zzqi;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crash/internal/zzg;->zzbGv:Lcom/google/android/gms/internal/zzqi;
    :try_end_1
    .catch Lcom/google/android/gms/internal/zzqi$zza; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    new-instance v2, Lcom/google/firebase/crash/internal/zzg$zza;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/firebase/crash/internal/zzg$zza;-><init>(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/zzg$1;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
.end method
