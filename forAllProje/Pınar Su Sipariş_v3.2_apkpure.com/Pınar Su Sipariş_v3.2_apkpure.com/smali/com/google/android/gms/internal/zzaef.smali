.class public Lcom/google/android/gms/internal/zzaef;
.super Ljava/lang/Object;


# instance fields
.field private final zzbHI:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzbIV:Lcom/google/android/gms/internal/zzaee;

.field private final zzbIW:Lcom/google/android/gms/internal/zzahg;

.field private final zzbIX:Z

.field private final zzbIY:Ljava/lang/String;

.field private final zzbIZ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzahg;Lcom/google/android/gms/internal/zzaee;Ljava/util/concurrent/ScheduledExecutorService;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaef;->zzbIW:Lcom/google/android/gms/internal/zzahg;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaef;->zzbIV:Lcom/google/android/gms/internal/zzaee;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaef;->zzbHI:Ljava/util/concurrent/ScheduledExecutorService;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/zzaef;->zzbIX:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/zzaef;->zzbIY:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/zzaef;->zzbIZ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public zzPT()Lcom/google/android/gms/internal/zzahg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaef;->zzbIW:Lcom/google/android/gms/internal/zzahg;

    return-object v0
.end method

.method public zzPU()Lcom/google/android/gms/internal/zzaee;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaef;->zzbIV:Lcom/google/android/gms/internal/zzaee;

    return-object v0
.end method

.method public zzPV()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaef;->zzbHI:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public zzPW()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaef;->zzbIX:Z

    return v0
.end method

.method public zzPX()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaef;->zzbIY:Ljava/lang/String;

    return-object v0
.end method

.method public zziJ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaef;->zzbIZ:Ljava/lang/String;

    return-object v0
.end method
