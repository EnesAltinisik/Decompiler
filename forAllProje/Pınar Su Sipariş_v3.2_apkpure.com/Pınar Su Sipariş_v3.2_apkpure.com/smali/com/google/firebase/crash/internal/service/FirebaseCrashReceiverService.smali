.class public final Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;
.super Landroid/app/IntentService;


# static fields
.field private static final LOG_TAG:Ljava/lang/String;

.field private static final zzbGK:Ljava/lang/String;

.field public static final zzbGL:Ljava/lang/String;

.field public static final zzbGM:Ljava/lang/String;

.field public static final zzbGN:Ljava/lang/String;

.field public static final zzbGO:Ljava/lang/String;

.field public static final zzbGP:Ljava/lang/String;


# instance fields
.field private zzbGQ:Lcom/google/firebase/crash/internal/zze;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->LOG_TAG:Ljava/lang/String;

    const-class v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGK:Ljava/lang/String;

    sget-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".SAVE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGL:Ljava/lang/String;

    sget-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".CRASH_REPORT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGM:Ljava/lang/String;

    sget-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".CRASH_TIME"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGN:Ljava/lang/String;

    sget-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".API_KEY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGO:Ljava/lang/String;

    sget-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".IS_FATAL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGP:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation build Landroid/support/annotation/Keep;
    .end annotation

    const-class v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    :try_start_0
    invoke-static {}, Lcom/google/firebase/crash/internal/zzg;->zzPc()Lcom/google/firebase/crash/internal/zzg;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/crash/internal/zzg;->zzah(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/firebase/crash/internal/zzg;->zzPc()Lcom/google/firebase/crash/internal/zzg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/crash/internal/zzg;->zzPe()Lcom/google/firebase/crash/internal/zze;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGQ:Lcom/google/firebase/crash/internal/zze;

    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGQ:Lcom/google/firebase/crash/internal/zze;

    invoke-static {p0}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/crash/internal/zze;->zzH(Lcom/google/android/gms/dynamic/zzd;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/firebase/crash/internal/zzg$zza; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :goto_1
    sget-object v1, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Unexpected failure remoting onCreate()"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGQ:Lcom/google/firebase/crash/internal/zze;

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGQ:Lcom/google/firebase/crash/internal/zze;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGQ:Lcom/google/firebase/crash/internal/zze;

    invoke-interface {v0}, Lcom/google/firebase/crash/internal/zze;->onDestroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Unexpected failure remoting onDestroy()"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGQ:Lcom/google/firebase/crash/internal/zze;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->zzbGQ:Lcom/google/firebase/crash/internal/zze;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/crash/internal/zze;->zzI(Lcom/google/android/gms/dynamic/zzd;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/firebase/crash/internal/service/FirebaseCrashReceiverService;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Unexpected failure remoting onHandleIntent()"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
