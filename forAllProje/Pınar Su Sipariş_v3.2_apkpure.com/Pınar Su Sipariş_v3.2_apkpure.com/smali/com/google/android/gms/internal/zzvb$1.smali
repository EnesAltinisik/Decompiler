.class final Lcom/google/android/gms/internal/zzvb$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzvb$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzvb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzb(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzba;Lcom/google/android/gms/tagmanager/zzax;)Lcom/google/android/gms/internal/zzvb;
    .locals 9

    new-instance v0, Lcom/google/android/gms/internal/zzvb;

    new-instance v4, Lcom/google/android/gms/internal/zzve;

    invoke-direct {v4, p1}, Lcom/google/android/gms/internal/zzve;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/internal/aw;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/aw;->b()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/zzus;->zzLi()Lcom/google/android/gms/internal/zzus;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/zzvb$zza;

    invoke-direct {v8, p1}, Lcom/google/android/gms/internal/zzvb$zza;-><init>(Landroid/content/Context;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/zzvb;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzba;Lcom/google/android/gms/tagmanager/zzax;Lcom/google/android/gms/internal/zzve;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/zzus;Lcom/google/android/gms/internal/zzvb$zza;)V

    return-object v0
.end method
