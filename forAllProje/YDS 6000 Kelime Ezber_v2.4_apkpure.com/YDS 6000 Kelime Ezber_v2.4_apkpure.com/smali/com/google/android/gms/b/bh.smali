.class public final Lcom/google/android/gms/b/bh;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/google/android/gms/b/bh;


# instance fields
.field private final b:Lcom/google/android/gms/b/be;

.field private final c:Lcom/google/android/gms/b/bf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/bh;

    invoke-direct {v0}, Lcom/google/android/gms/b/bh;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/b/bh;->a(Lcom/google/android/gms/b/bh;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/be;

    invoke-direct {v0}, Lcom/google/android/gms/b/be;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/bh;->b:Lcom/google/android/gms/b/be;

    new-instance v0, Lcom/google/android/gms/b/bf;

    invoke-direct {v0}, Lcom/google/android/gms/b/bf;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/bh;->c:Lcom/google/android/gms/b/bf;

    return-void
.end method

.method public static a()Lcom/google/android/gms/b/be;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/bh;->c()Lcom/google/android/gms/b/bh;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/bh;->b:Lcom/google/android/gms/b/be;

    return-object v0
.end method

.method protected static a(Lcom/google/android/gms/b/bh;)V
    .locals 2

    const-class v1, Lcom/google/android/gms/b/bh;

    monitor-enter v1

    :try_start_0
    sput-object p0, Lcom/google/android/gms/b/bh;->a:Lcom/google/android/gms/b/bh;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static b()Lcom/google/android/gms/b/bf;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/bh;->c()Lcom/google/android/gms/b/bh;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/bh;->c:Lcom/google/android/gms/b/bf;

    return-object v0
.end method

.method private static c()Lcom/google/android/gms/b/bh;
    .locals 2

    const-class v1, Lcom/google/android/gms/b/bh;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/bh;->a:Lcom/google/android/gms/b/bh;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
