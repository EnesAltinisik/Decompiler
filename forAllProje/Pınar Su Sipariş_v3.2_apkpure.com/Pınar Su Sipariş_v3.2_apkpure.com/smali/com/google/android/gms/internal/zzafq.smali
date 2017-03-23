.class public Lcom/google/android/gms/internal/zzafq;
.super Ljava/lang/Object;


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final zzbOb:Lcom/google/android/gms/internal/zzagj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzagj",
            "<",
            "Lcom/google/android/gms/internal/zzafn;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzbNY:Lcom/google/android/gms/internal/zzaes;

.field private zzbNZ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafn;",
            ">;"
        }
    .end annotation
.end field

.field private zzbOa:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzafq;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzafq;->$assertionsDisabled:Z

    new-instance v0, Lcom/google/android/gms/internal/zzafq$2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzafq$2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzafq;->zzbOb:Lcom/google/android/gms/internal/zzagj;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/zzaes;->zzQN()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbOa:Ljava/lang/Long;

    return-void
.end method

.method private zzRU()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    sget-object v1, Lcom/google/android/gms/internal/zzafq;->zzbOb:Lcom/google/android/gms/internal/zzagj;

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzafq;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagj;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbOa:Ljava/lang/Long;

    :goto_0
    return-void

    :cond_0
    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbOa:Ljava/lang/Long;

    goto :goto_0
.end method

.method private static zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagj;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafn;",
            ">;",
            "Lcom/google/android/gms/internal/zzagj",
            "<",
            "Lcom/google/android/gms/internal/zzafn;",
            ">;",
            "Lcom/google/android/gms/internal/zzafa;",
            ")",
            "Lcom/google/android/gms/internal/zzaes;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzaes;->zzQN()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafn;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzagj;->zzap(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRQ()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p2, v3}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    move-object v0, v1

    :goto_1
    move-object v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-static {v3, p2}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p2, v3}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    move-object v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v3, p2}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    move-object v0, v1

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzaes;->zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    move-object v0, v1

    goto :goto_1

    :cond_4
    return-object v1

    :cond_5
    move-object v0, v1

    goto :goto_1
.end method

.method private zza(Lcom/google/android/gms/internal/zzafn;Lcom/google/android/gms/internal/zzafa;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafn;->zzRQ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaes;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public zzRT()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafn;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Lcom/google/android/gms/internal/zzaes;->zzQN()Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaht;ZLcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzaht;
    .locals 4

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaes;->zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzaes;->zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {p5, v0, p3, p4}, Lcom/google/android/gms/internal/zzaho;->zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;Z)I

    move-result v3

    if-lez v3, :cond_3

    if-eqz v1, :cond_0

    invoke-virtual {p5, v0, v1, p4}, Lcom/google/android/gms/internal/zzaho;->zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;Z)I

    move-result v3

    if-gez v3, :cond_3

    :cond_0
    :goto_2
    move-object v1, v0

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v1

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    sget-boolean v0, Lcom/google/android/gms/internal/zzafq;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Either existingEventSnap or existingServerSnap must exist"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzaes;->zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaes;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p4, p2}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-interface {p4, p2}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzagm;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaes;->zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/zzagm;->zzf(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaes;->zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1, p2}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Ljava/util/List;Z)Lcom/google/android/gms/internal/zzahu;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;Z)",
            "Lcom/google/android/gms/internal/zzahu;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p4, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaes;->zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object p2, v0

    :cond_0
    :goto_0
    return-object p2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaes;->zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaes;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    if-nez p2, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v2

    if-nez v2, :cond_2

    move-object p2, v1

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    :goto_1
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p2

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object p2

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaes;->zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    if-nez p4, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaes;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_5
    if-nez p4, :cond_6

    if-nez p2, :cond_6

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    if-nez v0, :cond_6

    move-object p2, v1

    goto :goto_0

    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/zzafq$1;

    invoke-direct {v0, p0, p4, p3, p1}, Lcom/google/android/gms/internal/zzafq$1;-><init>(Lcom/google/android/gms/internal/zzafq;ZLjava/util/List;Lcom/google/android/gms/internal/zzafa;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/zzafq;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagj;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    if-eqz p2, :cond_7

    :goto_2
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p2

    goto :goto_0

    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object p2

    goto :goto_2
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Ljava/lang/Long;)V
    .locals 4

    sget-boolean v0, Lcom/google/android/gms/internal/zzafq;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafq;->zzbOa:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    new-instance v1, Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/zzafn;-><init>(JLcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafq;->zzbOa:Ljava/lang/Long;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Ljava/lang/Long;Z)V
    .locals 7

    sget-boolean v0, Lcom/google/android/gms/internal/zzafq;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafq;->zzbOa:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    new-instance v1, Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object v4, p1

    move-object v5, p2

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzafn;-><init>(JLcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    :cond_1
    iput-object p3, p0, Lcom/google/android/gms/internal/zzafq;->zzbOa:Ljava/lang/Long;

    return-void
.end method

.method public zzaE(J)Lcom/google/android/gms/internal/zzafn;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-nez v2, :cond_0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzaF(J)Z
    .locals 9

    const/4 v5, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v6

    cmp-long v6, v6, p1

    if-nez v6, :cond_1

    move-object v3, v0

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/zzafq;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    if-nez v3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "removeWrite called with nonexistent writeId"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafn;->isVisible()Z

    move-result v6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v7, v0

    move v4, v2

    :goto_1
    if-eqz v6, :cond_4

    if-ltz v7, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNZ:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->isVisible()Z

    move-result v8

    if-eqz v8, :cond_9

    if-lt v7, v1, :cond_3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v8

    invoke-direct {p0, v0, v8}, Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafn;Lcom/google/android/gms/internal/zzafa;)Z

    move-result v8

    if-eqz v8, :cond_3

    move v0, v4

    move v4, v2

    :goto_2
    add-int/lit8 v6, v7, -0x1

    move v7, v6

    move v6, v4

    move v4, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/zzafa;->zzi(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v0, v5

    move v4, v6

    goto :goto_2

    :cond_4
    if-nez v6, :cond_6

    move v5, v2

    :cond_5
    :goto_3
    return v5

    :cond_6
    if-eqz v4, :cond_7

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafq;->zzRU()V

    goto :goto_3

    :cond_7
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafn;->zzRQ()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaes;->zzd(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    goto :goto_3

    :cond_8
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaes;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafa;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzaes;->zzd(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    goto :goto_4

    :cond_9
    move v0, v4

    move v4, v6

    goto :goto_2
.end method

.method public zzj(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 8

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzaes;->zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Lcom/google/android/gms/internal/zzahu;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzaes;->zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v2

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    new-instance v4, Lcom/google/android/gms/internal/zzafa;

    const/4 v5, 0x1

    new-array v5, v5, [Lcom/google/android/gms/internal/zzahi;

    const/4 v6, 0x0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/zzaes;->zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-interface {v1, v0, v4}, Lcom/google/android/gms/internal/zzahu;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzaes;->zzQP()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Lcom/google/android/gms/internal/zzahu;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :cond_3
    return-object v1
.end method

.method public zzu(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafr;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzafr;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/zzafr;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafq;)V

    return-object v0
.end method

.method public zzv(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafq;->zzbNY:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaes;->zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method
