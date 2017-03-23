.class public Lcom/google/android/gms/internal/zztz;
.super Ljava/lang/Object;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzbsi:Lcom/google/android/gms/internal/zzaaq;

.field private final zzbsk:Lcom/google/android/gms/tagmanager/zzba;

.field private final zzbsq:Lcom/google/android/gms/tagmanager/zzax;

.field private final zzzP:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzba;Lcom/google/android/gms/tagmanager/zzax;)V
    .locals 6

    new-instance v4, Lcom/google/android/gms/internal/zzaaq;

    invoke-direct {v4, p1}, Lcom/google/android/gms/internal/zzaaq;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/internal/aw;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zztz;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzba;Lcom/google/android/gms/tagmanager/zzax;Lcom/google/android/gms/internal/zzaaq;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzba;Lcom/google/android/gms/tagmanager/zzax;Lcom/google/android/gms/internal/zzaaq;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zztz;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zztz;->zzbsk:Lcom/google/android/gms/tagmanager/zzba;

    iput-object p3, p0, Lcom/google/android/gms/internal/zztz;->zzbsq:Lcom/google/android/gms/tagmanager/zzax;

    iput-object p4, p0, Lcom/google/android/gms/internal/zztz;->zzbsi:Lcom/google/android/gms/internal/zzaaq;

    iput-object p5, p0, Lcom/google/android/gms/internal/zztz;->zzzP:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public zzn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzty;
    .locals 8

    new-instance v4, Lcom/google/android/gms/internal/zzuv;

    iget-object v0, p0, Lcom/google/android/gms/internal/zztz;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/zztz;->zzbsk:Lcom/google/android/gms/tagmanager/zzba;

    iget-object v2, p0, Lcom/google/android/gms/internal/zztz;->zzbsq:Lcom/google/android/gms/tagmanager/zzax;

    invoke-direct {v4, v0, v1, v2, p1}, Lcom/google/android/gms/internal/zzuv;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzba;Lcom/google/android/gms/tagmanager/zzax;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzty;

    iget-object v5, p0, Lcom/google/android/gms/internal/zztz;->zzbsi:Lcom/google/android/gms/internal/zzaaq;

    iget-object v6, p0, Lcom/google/android/gms/internal/zztz;->zzzP:Ljava/util/concurrent/ExecutorService;

    iget-object v7, p0, Lcom/google/android/gms/internal/zztz;->zzbsk:Lcom/google/android/gms/tagmanager/zzba;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzty;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzuv;Lcom/google/android/gms/internal/zzaaq;Ljava/util/concurrent/ExecutorService;Lcom/google/android/gms/tagmanager/zzba;)V

    return-object v0
.end method
