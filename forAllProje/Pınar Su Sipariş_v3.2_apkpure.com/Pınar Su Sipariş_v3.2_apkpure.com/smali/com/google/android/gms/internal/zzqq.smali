.class public Lcom/google/android/gms/internal/zzqq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzqq$zza;
    }
.end annotation


# static fields
.field private static final zzaGr:D

.field private static final zzaGs:D

.field private static final zzaGv:Lcom/google/android/gms/internal/zzqq;


# instance fields
.field private final zzaGt:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzqq$zza;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zzaGu:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzqq$zza;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-wide/16 v4, 0x1

    const-wide v2, 0x408f400000000000L    # 1000.0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    long-to-double v0, v0

    div-double v0, v2, v0

    sput-wide v0, Lcom/google/android/gms/internal/zzqq;->zzaGr:D

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    long-to-double v0, v0

    div-double v0, v2, v0

    sput-wide v0, Lcom/google/android/gms/internal/zzqq;->zzaGs:D

    new-instance v0, Lcom/google/android/gms/internal/zzqq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzqq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzqq;->zzaGv:Lcom/google/android/gms/internal/zzqq;

    return-void
.end method

.method private constructor <init>()V
    .locals 14

    const-wide v12, 0x408f400000000000L    # 1000.0

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    const-wide/16 v10, 0x0

    const/4 v6, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEs:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    const-wide v2, -0x3fa9800000000000L    # -90.0

    const-wide v4, 0x4056800000000000L    # 90.0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEt:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    const-wide v2, -0x3f99800000000000L    # -180.0

    const-wide v4, 0x4066800000000000L    # 180.0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEu:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    const-wide v4, 0x40c3880000000000L    # 10000.0

    move-wide v2, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEr:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    move-wide v2, v10

    move-wide v4, v12

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEv:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    const-wide v2, -0x3f07960000000000L    # -100000.0

    const-wide v4, 0x40f86a0000000000L    # 100000.0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEC:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    move-wide v2, v10

    move-wide v4, v8

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEk:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    move-wide v2, v10

    move-wide v4, v8

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEn:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    const-wide/high16 v4, 0x43e0000000000000L    # 9.223372036854776E18

    move-wide v2, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEz:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    move-wide v2, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEA:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    move-wide v2, v10

    move-wide v4, v12

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaED:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    const-wide v4, 0x41086a0000000000L    # 200000.0

    move-wide v2, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzqq;->zzaGu:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v7, "com.google.step_count.delta"

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEm:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v8, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    sget-wide v4, Lcom/google/android/gms/internal/zzqq;->zzaGr:D

    move-wide v2, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-static {v8, v1}, Lcom/google/android/gms/internal/zzqq;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "com.google.calories.consumed"

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEG:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v8, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    sget-wide v4, Lcom/google/android/gms/internal/zzqq;->zzaGs:D

    move-wide v2, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-static {v8, v1}, Lcom/google/android/gms/internal/zzqq;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "com.google.calories.expended"

    sget-object v1, Lcom/google/android/gms/internal/zzqm;->zzaEG:Lcom/google/android/gms/internal/zzamn$zzb;

    iget-object v8, v1, Lcom/google/android/gms/internal/zzamn$zzb;->name:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/zzqq$zza;

    sget-wide v4, Lcom/google/android/gms/internal/zzqq;->zzaGs:D

    move-wide v2, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzqq$zza;-><init>(DDLcom/google/android/gms/internal/zzqq$1;)V

    invoke-static {v8, v1}, Lcom/google/android/gms/internal/zzqq;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzqq;->zzaGt:Ljava/util/Map;

    return-void
.end method

.method private static zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;)",
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static zzxQ()Lcom/google/android/gms/internal/zzqq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzqq;->zzaGv:Lcom/google/android/gms/internal/zzqq;

    return-object v0
.end method


# virtual methods
.method public zzI(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzqq$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqq;->zzaGt:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzqq$zza;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzef(Ljava/lang/String;)Lcom/google/android/gms/internal/zzqq$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqq;->zzaGu:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzqq$zza;

    return-object v0
.end method
