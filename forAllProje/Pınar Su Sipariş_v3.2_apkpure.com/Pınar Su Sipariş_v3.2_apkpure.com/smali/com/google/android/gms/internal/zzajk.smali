.class public Lcom/google/android/gms/internal/zzajk;
.super Ljava/lang/Object;


# static fields
.field static zzacm:Lcom/google/android/gms/common/util/zze;

.field private static zzbBM:Ljava/util/Random;

.field static zzbVF:Lcom/google/android/gms/internal/zzajm;


# instance fields
.field private volatile zzK:Z

.field private zzbSD:Lcom/google/firebase/FirebaseApp;

.field private zzbVG:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzajn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzajn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzajk;->zzbVF:Lcom/google/android/gms/internal/zzajm;

    new-instance v0, Lcom/google/android/gms/common/util/zzh;

    invoke-direct {v0}, Lcom/google/android/gms/common/util/zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzajk;->zzacm:Lcom/google/android/gms/common/util/zze;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzajk;->zzbBM:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/FirebaseApp;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzajk;->zzbSD:Lcom/google/firebase/FirebaseApp;

    iput-wide p2, p0, Lcom/google/android/gms/internal/zzajk;->zzbVG:J

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzajk;->zzK:Z

    return-void
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzajk;->zzK:Z

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzajt;Z)V
    .locals 8

    const/16 v1, 0x3e8

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/zzajk;->zzacm:Lcom/google/android/gms/common/util/zze;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/zze;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzajk;->zzbVG:J

    add-long/2addr v2, v4

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajk;->zzbSD:Lcom/google/firebase/FirebaseApp;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzajp;->zzh(Lcom/google/firebase/FirebaseApp;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/google/android/gms/internal/zzajk;->zzbSD:Lcom/google/firebase/FirebaseApp;

    invoke-virtual {v4}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {p1, v0, v4}, Lcom/google/android/gms/internal/zzajt;->zza(Ljava/lang/String;Landroid/content/Context;)V

    :goto_0
    move v0, v1

    :goto_1
    sget-object v4, Lcom/google/android/gms/internal/zzajk;->zzacm:Lcom/google/android/gms/common/util/zze;

    invoke-interface {v4}, Lcom/google/android/gms/common/util/zze;->elapsedRealtime()J

    move-result-wide v4

    int-to-long v6, v0

    add-long/2addr v4, v6

    cmp-long v4, v4, v2

    if-gtz v4, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzajt;->zzVt()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzajt;->getResultCode()I

    move-result v4

    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/zzajk;->zznO(I)Z

    move-result v4

    if-eqz v4, :cond_1

    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/zzajk;->zzbVF:Lcom/google/android/gms/internal/zzajm;

    sget-object v5, Lcom/google/android/gms/internal/zzajk;->zzbBM:Ljava/util/Random;

    const/16 v6, 0xfa

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    add-int/2addr v5, v0

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/zzajm;->zznP(I)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v4, 0x7530

    if-ge v0, v4, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzajt;->getResultCode()I

    move-result v4

    const/4 v5, -0x2

    if-eq v4, v5, :cond_3

    mul-int/lit8 v0, v0, 0x2

    const-string v4, "ExponenentialBackoff"

    const-string v5, "network error occurred, backing off/sleeping."

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_2
    iget-boolean v4, p0, Lcom/google/android/gms/internal/zzajk;->zzK:Z

    if-eqz v4, :cond_4

    :cond_1
    :goto_3
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzajk;->zzbSD:Lcom/google/firebase/FirebaseApp;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzajp;->zzh(Lcom/google/firebase/FirebaseApp;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzajt;->zziM(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "ExponenentialBackoff"

    const-string v1, "thread interrupted during exponential backoff."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_3

    :cond_3
    const-string v0, "ExponenentialBackoff"

    const-string v4, "network unavailable, sleeping."

    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzajt;->reset()V

    if-eqz p2, :cond_5

    iget-object v4, p0, Lcom/google/android/gms/internal/zzajk;->zzbSD:Lcom/google/firebase/FirebaseApp;

    invoke-static {v4}, Lcom/google/android/gms/internal/zzajp;->zzh(Lcom/google/firebase/FirebaseApp;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/zzajk;->zzbSD:Lcom/google/firebase/FirebaseApp;

    invoke-virtual {v5}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {p1, v4, v5}, Lcom/google/android/gms/internal/zzajt;->zza(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    :cond_5
    iget-object v4, p0, Lcom/google/android/gms/internal/zzajk;->zzbSD:Lcom/google/firebase/FirebaseApp;

    invoke-static {v4}, Lcom/google/android/gms/internal/zzajp;->zzh(Lcom/google/firebase/FirebaseApp;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/zzajt;->zziM(Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method public zzd(Lcom/google/android/gms/internal/zzajt;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzajk;->zza(Lcom/google/android/gms/internal/zzajt;Z)V

    return-void
.end method

.method public zznO(I)Z
    .locals 1

    const/16 v0, 0x1f4

    if-lt p1, v0, :cond_0

    const/16 v0, 0x258

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 v0, -0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1ad

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
