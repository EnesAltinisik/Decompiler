.class public Lcom/google/android/gms/internal/zzaeo$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzaeo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private final zzbHV:Lcom/google/android/gms/internal/zzahf;

.field private zzbKJ:J

.field private zzbKL:D

.field private zzbKM:D

.field private final zzbKT:Ljava/util/concurrent/ScheduledExecutorService;

.field private zzbKU:J


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/zzahg;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKJ:J

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKL:D

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKU:J

    const-wide v0, 0x3ff4cccccccccccdL    # 1.3

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKM:D

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKT:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/google/android/gms/internal/zzahf;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/zzahf;-><init>(Lcom/google/android/gms/internal/zzahg;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    return-void
.end method


# virtual methods
.method public zzQG()Lcom/google/android/gms/internal/zzaeo;
    .locals 13

    new-instance v1, Lcom/google/android/gms/internal/zzaeo;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKT:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKJ:J

    iget-wide v6, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKU:J

    iget-wide v8, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKM:D

    iget-wide v10, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKL:D

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/internal/zzaeo;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/zzahf;JJDDLcom/google/android/gms/internal/zzaeo$1;)V

    return-object v1
.end method

.method public zzaB(J)Lcom/google/android/gms/internal/zzaeo$zza;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKJ:J

    return-object p0
.end method

.method public zzaC(J)Lcom/google/android/gms/internal/zzaeo$zza;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKU:J

    return-object p0
.end method

.method public zzl(D)Lcom/google/android/gms/internal/zzaeo$zza;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKM:D

    return-object p0
.end method

.method public zzm(D)Lcom/google/android/gms/internal/zzaeo$zza;
    .locals 3

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-ltz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Argument out of range: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-wide p1, p0, Lcom/google/android/gms/internal/zzaeo$zza;->zzbKL:D

    return-object p0
.end method
