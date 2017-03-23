.class public Lcom/google/android/gms/internal/zzaaq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzaaq$b;,
        Lcom/google/android/gms/internal/zzaaq$a;,
        Lcom/google/android/gms/internal/zzaaq$zza;
    }
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private zzbot:Ljava/lang/String;

.field private final zzbuO:Lcom/google/android/gms/internal/zzaav;

.field final zzbuP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzaaq$b",
            "<",
            "Lcom/google/android/gms/internal/zzabc;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zzbuQ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzabb;",
            ">;"
        }
    .end annotation
.end field

.field private final zzsd:Lcom/google/android/gms/common/util/zze;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/zzaav;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzaav;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/common/util/zzh;->zzuW()Lcom/google/android/gms/common/util/zze;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzaaq;-><init>(Landroid/content/Context;Ljava/util/Map;Lcom/google/android/gms/internal/zzaav;Lcom/google/android/gms/common/util/zze;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/util/Map;Lcom/google/android/gms/internal/zzaav;Lcom/google/android/gms/common/util/zze;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzabb;",
            ">;",
            "Lcom/google/android/gms/internal/zzaav;",
            "Lcom/google/android/gms/common/util/zze;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaaq;->zzbot:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuP:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaaq;->mContext:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzaaq;->zzsd:Lcom/google/android/gms/common/util/zze;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuO:Lcom/google/android/gms/internal/zzaav;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuQ:Ljava/util/Map;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzaaq;)Lcom/google/android/gms/internal/zzaav;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuO:Lcom/google/android/gms/internal/zzaav;

    return-object v0
.end method

.method private zzb(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaat;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/zzaaq$zza;",
            ")V"
        }
    .end annotation

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaat;->zzLN()Lcom/google/android/gms/internal/zzaam;

    move-result-object v5

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuP:Ljava/util/Map;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzaaq$b;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaat;->zzLN()Lcom/google/android/gms/internal/zzaam;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaam;->zzLJ()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuQ:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaat;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzabb;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    if-nez v2, :cond_2

    new-instance v2, Lcom/google/android/gms/internal/zzabb;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzabb;-><init>()V

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuQ:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaat;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v10, v2

    :goto_2
    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x2b

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Attempting to fetch container "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " from network"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    iget-object v11, p0, Lcom/google/android/gms/internal/zzaaq;->mContext:Landroid/content/Context;

    const-wide/16 v12, 0x0

    new-instance v2, Lcom/google/android/gms/internal/zzaaq$a;

    const/4 v4, 0x0

    sget-object v6, Lcom/google/android/gms/internal/zzaas;->zzbuW:Lcom/google/android/gms/internal/zzaar;

    move-object v3, p0

    move-object v5, p1

    move-object/from16 v7, p2

    move/from16 v8, p3

    move-object/from16 v9, p4

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/zzaaq$a;-><init>(Lcom/google/android/gms/internal/zzaaq;ILcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaar;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    move-object v3, v10

    move-object v4, v11

    move-object v5, p1

    move-wide v6, v12

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/zzabb;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaat;JLcom/google/android/gms/internal/zzaap;)V

    :goto_3
    return-void

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzaaq$b;->a()J

    move-result-wide v2

    :goto_4
    const-wide/32 v6, 0xdbba0

    add-long/2addr v2, v6

    iget-object v6, p0, Lcom/google/android/gms/internal/zzaaq;->zzsd:Lcom/google/android/gms/common/util/zze;

    invoke-interface {v6}, Lcom/google/android/gms/common/util/zze;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v2, v2, v6

    if-gez v2, :cond_5

    const/4 v2, 0x1

    goto/16 :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuO:Lcom/google/android/gms/internal/zzaav;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzaav;->zzhk(Ljava/lang/String;)J

    move-result-wide v2

    goto :goto_4

    :cond_2
    new-instance v2, Lcom/google/android/gms/internal/zzabb;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaaq;->zzbot:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/zzabb;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    add-int/lit8 v2, p3, 0x1

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    invoke-virtual {p0, p1, v0, v2, v1}, Lcom/google/android/gms/internal/zzaaq;->zza(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    goto :goto_3

    :cond_4
    move-object v10, v2

    goto :goto_2

    :cond_5
    move v2, v4

    goto/16 :goto_0
.end method

.method private zzc(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaat;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/zzaaq$zza;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaat;->zzLN()Lcom/google/android/gms/internal/zzaam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x34

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Attempting to fetch container "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " from a saved resource"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    iget-object v8, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuO:Lcom/google/android/gms/internal/zzaav;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->zzLI()Ljava/lang/String;

    move-result-object v9

    new-instance v0, Lcom/google/android/gms/internal/zzaaq$a;

    const/4 v2, 0x1

    sget-object v4, Lcom/google/android/gms/internal/zzaas;->zzbuW:Lcom/google/android/gms/internal/zzaar;

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzaaq$a;-><init>(Lcom/google/android/gms/internal/zzaaq;ILcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaar;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/internal/zzaav;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzaap;)V

    return-void
.end method

.method private zzd(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaat;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/zzaaq$zza;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaat;->zzLN()Lcom/google/android/gms/internal/zzaam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x38

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Attempting to fetch container "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " from the default resource"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    iget-object v8, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuO:Lcom/google/android/gms/internal/zzaav;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->zzLI()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->zzLG()Ljava/lang/String;

    move-result-object v10

    new-instance v0, Lcom/google/android/gms/internal/zzaaq$a;

    const/4 v2, 0x2

    sget-object v4, Lcom/google/android/gms/internal/zzaas;->zzbuW:Lcom/google/android/gms/internal/zzaar;

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzaaq$a;-><init>(Lcom/google/android/gms/internal/zzaaq;ILcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaar;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    invoke-virtual {v8, v9, v10, v0}, Lcom/google/android/gms/internal/zzaav;->zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzaap;)V

    return-void
.end method


# virtual methods
.method zza(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/zzaau$zza;)V
    .locals 6

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaau$zza;->zzLS()Lcom/google/android/gms/internal/zzaam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaau$zza;->zzLT()Lcom/google/android/gms/internal/zzabc;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuP:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuP:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaaq$b;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq;->zzsd:Lcom/google/android/gms/common/util/zze;

    invoke-interface {v2}, Lcom/google/android/gms/common/util/zze;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzaaq$b;->a(J)V

    sget-object v2, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    if-ne p1, v2, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaaq$b;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaaq$b;->a(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq;->zzbuP:Ljava/util/Map;

    new-instance v3, Lcom/google/android/gms/internal/zzaaq$b;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaaq;->zzsd:Lcom/google/android/gms/common/util/zze;

    invoke-interface {v4}, Lcom/google/android/gms/common/util/zze;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v3, p1, v1, v4, v5}, Lcom/google/android/gms/internal/zzaaq$b;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;J)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method zza(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaat;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/zzaaq$zza;",
            ")V"
        }
    .end annotation

    if-nez p3, :cond_0

    const-string v0, "Starting to fetch a new resource"

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lt p3, v0, :cond_2

    const-string v1, "There is no valid resource for the container: "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaat;->zzLN()Lcom/google/android/gms/internal/zzaam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/zzaau;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x10

    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    add-int/lit8 v0, p3, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/zzaau;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    invoke-interface {p4, v1}, Lcom/google/android/gms/internal/zzaaq$zza;->zza(Lcom/google/android/gms/internal/zzaau;)V

    :goto_1
    return-void

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x24

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unknown fetching source: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzaaq;->zzb(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzaaq;->zzc(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    goto :goto_1

    :pswitch_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzaaq;->zzd(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/zzaaq$zza;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/android/gms/internal/zzaaq$zza;",
            ")V"
        }
    .end annotation

    const/4 v6, 0x0

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    new-instance v7, Lcom/google/android/gms/internal/zzaat;

    invoke-direct {v7}, Lcom/google/android/gms/internal/zzaat;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzaam;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaaq;->zzhj(Ljava/lang/String;)Z

    move-result v4

    invoke-static {}, Lcom/google/android/gms/internal/zzus;->zzLi()Lcom/google/android/gms/internal/zzus;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzus;->zzLj()Ljava/lang/String;

    move-result-object v5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzaam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/zzaat;->zza(Lcom/google/android/gms/internal/zzaam;)Lcom/google/android/gms/internal/zzaat;

    move-result-object v0

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1, v6, p5}, Lcom/google/android/gms/internal/zzaaq;->zza(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    return-void

    :cond_0
    move v0, v6

    goto :goto_0
.end method

.method zzhj(Ljava/lang/String;)Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/zzus;->zzLi()Lcom/google/android/gms/internal/zzus;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzus;->isPreview()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzus;->getContainerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
