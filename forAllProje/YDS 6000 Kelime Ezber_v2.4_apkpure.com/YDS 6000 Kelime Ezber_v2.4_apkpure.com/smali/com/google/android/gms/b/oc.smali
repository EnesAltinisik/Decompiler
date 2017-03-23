.class public Lcom/google/android/gms/b/oc;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Lcom/google/android/gms/b/oc;


# instance fields
.field private final c:Lcom/google/android/gms/b/zx;

.field private final d:Lcom/google/android/gms/b/ob;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/oc;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/b/oc;

    invoke-direct {v0}, Lcom/google/android/gms/b/oc;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/b/oc;->a(Lcom/google/android/gms/b/oc;)V

    return-void
.end method

.method protected constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/zx;

    invoke-direct {v0}, Lcom/google/android/gms/b/zx;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/oc;->c:Lcom/google/android/gms/b/zx;

    new-instance v0, Lcom/google/android/gms/b/ob;

    new-instance v1, Lcom/google/android/gms/b/nr;

    invoke-direct {v1}, Lcom/google/android/gms/b/nr;-><init>()V

    new-instance v2, Lcom/google/android/gms/b/nq;

    invoke-direct {v2}, Lcom/google/android/gms/b/nq;-><init>()V

    new-instance v3, Lcom/google/android/gms/b/oz;

    invoke-direct {v3}, Lcom/google/android/gms/b/oz;-><init>()V

    new-instance v4, Lcom/google/android/gms/b/ri;

    invoke-direct {v4}, Lcom/google/android/gms/b/ri;-><init>()V

    new-instance v5, Lcom/google/android/gms/b/xu;

    invoke-direct {v5}, Lcom/google/android/gms/b/xu;-><init>()V

    new-instance v6, Lcom/google/android/gms/b/vc;

    invoke-direct {v6}, Lcom/google/android/gms/b/vc;-><init>()V

    new-instance v7, Lcom/google/android/gms/b/um;

    invoke-direct {v7}, Lcom/google/android/gms/b/um;-><init>()V

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/b/ob;-><init>(Lcom/google/android/gms/b/nr;Lcom/google/android/gms/b/nq;Lcom/google/android/gms/b/oz;Lcom/google/android/gms/b/ri;Lcom/google/android/gms/b/xu;Lcom/google/android/gms/b/vc;Lcom/google/android/gms/b/um;)V

    iput-object v0, p0, Lcom/google/android/gms/b/oc;->d:Lcom/google/android/gms/b/ob;

    return-void
.end method

.method public static a()Lcom/google/android/gms/b/zx;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/oc;->c()Lcom/google/android/gms/b/oc;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/oc;->c:Lcom/google/android/gms/b/zx;

    return-object v0
.end method

.method protected static a(Lcom/google/android/gms/b/oc;)V
    .locals 2

    sget-object v1, Lcom/google/android/gms/b/oc;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sput-object p0, Lcom/google/android/gms/b/oc;->b:Lcom/google/android/gms/b/oc;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static b()Lcom/google/android/gms/b/ob;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/oc;->c()Lcom/google/android/gms/b/oc;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/oc;->d:Lcom/google/android/gms/b/ob;

    return-object v0
.end method

.method private static c()Lcom/google/android/gms/b/oc;
    .locals 2

    sget-object v1, Lcom/google/android/gms/b/oc;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/oc;->b:Lcom/google/android/gms/b/oc;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
