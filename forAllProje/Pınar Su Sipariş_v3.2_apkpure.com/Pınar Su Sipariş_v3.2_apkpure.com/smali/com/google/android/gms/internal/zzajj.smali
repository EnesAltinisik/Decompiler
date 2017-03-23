.class public Lcom/google/android/gms/internal/zzajj;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzajj$b;,
        Lcom/google/android/gms/internal/zzajj$a;
    }
.end annotation


# static fields
.field private static final zzbVB:Lcom/google/android/gms/internal/zzajj;


# instance fields
.field private final zzbVC:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/zzajj$a;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbVD:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzajj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzajj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzajj;->zzbVB:Lcom/google/android/gms/internal/zzajj;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzajj;->zzbVC:Ljava/util/Map;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzajj;->zzbVD:Ljava/lang/Object;

    return-void
.end method

.method public static zzVl()Lcom/google/android/gms/internal/zzajj;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzajj;->zzbVB:Lcom/google/android/gms/internal/zzajj;

    return-object v0
.end method


# virtual methods
.method public zza(Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/Runnable;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajj;->zzbVD:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/zzajj$a;

    invoke-direct {v0, p1, p3, p2}, Lcom/google/android/gms/internal/zzajj$a;-><init>(Landroid/app/Activity;Ljava/lang/Runnable;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzajj$b;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/zzajj$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzajj$b;->a(Lcom/google/android/gms/internal/zzajj$a;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajj;->zzbVC:Ljava/util/Map;

    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzaG(Ljava/lang/Object;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajj;->zzbVD:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzajj;->zzbVC:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzajj$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajj$a;->a()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzajj$b;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/zzajj$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzajj$b;->b(Lcom/google/android/gms/internal/zzajj$a;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
