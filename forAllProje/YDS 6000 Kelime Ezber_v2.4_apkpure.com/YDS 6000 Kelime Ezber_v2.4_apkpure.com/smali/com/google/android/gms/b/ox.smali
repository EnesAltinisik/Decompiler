.class public Lcom/google/android/gms/b/ox;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# static fields
.field private static a:Lcom/google/android/gms/b/ox;

.field private static final b:Ljava/lang/Object;


# instance fields
.field private c:Lcom/google/android/gms/b/op;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ox;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/b/ox;
    .locals 2

    sget-object v1, Lcom/google/android/gms/b/ox;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/ox;->a:Lcom/google/android/gms/b/ox;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/ox;

    invoke-direct {v0}, Lcom/google/android/gms/b/ox;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ox;->a:Lcom/google/android/gms/b/ox;

    :cond_0
    sget-object v0, Lcom/google/android/gms/b/ox;->a:Lcom/google/android/gms/b/ox;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/b/oy;)V
    .locals 3

    sget-object v1, Lcom/google/android/gms/b/ox;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ox;->c:Lcom/google/android/gms/b/op;

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    if-nez p1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Context cannot be null."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/b/oc;->b()Lcom/google/android/gms/b/ob;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ob;->a(Landroid/content/Context;)Lcom/google/android/gms/b/op;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ox;->c:Lcom/google/android/gms/b/op;

    iget-object v0, p0, Lcom/google/android/gms/b/ox;->c:Lcom/google/android/gms/b/op;

    invoke-interface {v0}, Lcom/google/android/gms/b/op;->b()V

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/ox;->c:Lcom/google/android/gms/b/op;

    invoke-interface {v0, p2}, Lcom/google/android/gms/b/op;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Fail to initialize or set applicationCode on mobile ads setting manager"

    invoke-static {v2, v0}, Lcom/google/android/gms/b/zy;->c(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method
