.class public Lcom/google/android/gms/internal/zzadm;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field private static zzbGp:Lcom/google/android/gms/internal/zzadm;


# instance fields
.field private mHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzadm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadm;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzadm;->zzbGp:Lcom/google/android/gms/internal/zzadm;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadm;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method public static zzOV()Lcom/google/android/gms/internal/zzadm;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzadm;->zzbGp:Lcom/google/android/gms/internal/zzadm;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadm;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
