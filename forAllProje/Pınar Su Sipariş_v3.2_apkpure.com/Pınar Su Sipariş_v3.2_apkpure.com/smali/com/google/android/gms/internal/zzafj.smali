.class public Lcom/google/android/gms/internal/zzafj;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzafj$a;,
        Lcom/google/android/gms/internal/zzafj$b;,
        Lcom/google/android/gms/internal/zzafj$zzd;,
        Lcom/google/android/gms/internal/zzafj$zza;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final zzbHV:Lcom/google/android/gms/internal/zzahf;

.field private final zzbNk:Lcom/google/android/gms/internal/zzagd;

.field private zzbNl:Lcom/google/android/gms/internal/zzagi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzafi;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbNm:Lcom/google/android/gms/internal/zzafq;

.field private final zzbNn:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzafk;",
            "Lcom/google/android/gms/internal/zzagu;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbNo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzagu;",
            "Lcom/google/android/gms/internal/zzafk;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbNp:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzagu;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbNq:Lcom/google/android/gms/internal/zzafj$zzd;

.field private zzbNr:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzafj;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzagd;Lcom/google/android/gms/internal/zzafj$zzd;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNr:J

    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    new-instance v0, Lcom/google/android/gms/internal/zzafq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzafq;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNm:Lcom/google/android/gms/internal/zzafq;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNn:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNo:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNp:Ljava/util/Set;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafj;->zzbNq:Lcom/google/android/gms/internal/zzafj$zzd;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    const-string v0, "SyncTree"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzaeu;->zzib(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    return-void
.end method

.method private zzRL()Lcom/google/android/gms/internal/zzafk;
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/zzafk;

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzafj;->zzbNr:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/google/android/gms/internal/zzafj;->zzbNr:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/zzafk;-><init>(J)V

    return-object v0
.end method

.method private zzT(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagu;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafj;->zze(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzafk;

    move-result-object v2

    sget-boolean v3, Lcom/google/android/gms/internal/zzafj;->$assertionsDisabled:Z

    if-nez v3, :cond_1

    if-nez v2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj;->zzbNo:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNn:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzafk;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafj;->zze(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzafk;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagi;)Lcom/google/android/gms/internal/zzagi;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    return-object p1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafk;)Lcom/google/android/gms/internal/zzagu;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafk;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzahf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private zza(Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafw;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj;->zzbNm:Lcom/google/android/gms/internal/zzafq;

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzafq;->zzu(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafr;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private zza(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafw;",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzafi;",
            ">;",
            "Lcom/google/android/gms/internal/zzahu;",
            "Lcom/google/android/gms/internal/zzafr;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafw;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    if-nez p3, :cond_1

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafi;->zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p3

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafw;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/zzafw;->zzc(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafw;

    move-result-object v5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagi;->zzSp()Lcom/google/android/gms/internal/zzads;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzagi;

    if-eqz v1, :cond_2

    if-eqz v5, :cond_2

    if-eqz p3, :cond_4

    invoke-interface {p3, v4}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    :goto_1
    invoke-virtual {p4, v4}, Lcom/google/android/gms/internal/zzafr;->zzb(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafr;

    move-result-object v4

    invoke-direct {p0, v5, v1, v2, v4}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0, p1, p4, p3}, Lcom/google/android/gms/internal/zzafi;->zza(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    move-object v0, v3

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    goto :goto_1
.end method

.method private zza(Lcom/google/android/gms/internal/zzagi;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzafi;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagv;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzagi;Ljava/util/List;)V

    return-object v0
.end method

.method private zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafw;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagu;",
            "Lcom/google/android/gms/internal/zzafw;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagi;->zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    sget-boolean v2, Lcom/google/android/gms/internal/zzafj;->$assertionsDisabled:Z

    if-nez v2, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing sync point for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj;->zzbNm:Lcom/google/android/gms/internal/zzafq;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zzafq;->zzu(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafr;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, v2}, Lcom/google/android/gms/internal/zzafi;->zza(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzagv;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzagv;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafj;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafj;->zzT(Ljava/util/List;)V

    return-void
.end method

.method private zza(Lcom/google/android/gms/internal/zzagi;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzafi;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagv;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafi;->zzRI()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafi;->zzRJ()Lcom/google/android/gms/internal/zzagv;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafi;->zzRH()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagi;->zzSp()Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzagi;Ljava/util/List;)V

    goto :goto_0
.end method

.method private zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzagv;)V
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafj;->zze(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzafk;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzafj$b;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/zzafj$b;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagv;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj;->zzbNq:Lcom/google/android/gms/internal/zzafj$zzd;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafj;->zzd(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v4

    invoke-interface {v3, v4, v1, v2, v2}, Lcom/google/android/gms/internal/zzafj$zzd;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafk;Lcom/google/android/gms/internal/zzaei;Lcom/google/android/gms/internal/zzafj$zza;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzagi;->zzI(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    if-eqz v1, :cond_0

    sget-boolean v1, Lcom/google/android/gms/internal/zzafj;->$assertionsDisabled:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafi;->zzRI()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "If we\'re adding a query, it shouldn\'t be shadowed"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/zzafj$10;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzafj$10;-><init>(Lcom/google/android/gms/internal/zzafj;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzagi$zza;)V

    :cond_1
    return-void
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagu;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafj;->zzd(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    return-object v0
.end method

.method private zzb(Lcom/google/android/gms/internal/zzafk;)Lcom/google/android/gms/internal/zzagu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNn:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagu;

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagi;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzagi;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private zzb(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafw;",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzafi;",
            ">;",
            "Lcom/google/android/gms/internal/zzahu;",
            "Lcom/google/android/gms/internal/zzafr;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/zzafi;

    if-nez p3, :cond_1

    if-eqz v6, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/zzafi;->zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagi;->zzSp()Lcom/google/android/gms/internal/zzads;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/internal/zzafj$11;

    move-object v1, p0

    move-object v3, p4

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzafj$11;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzafw;Ljava/util/List;)V

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/zzads;->zza(Lcom/google/android/gms/internal/zzadx$zzb;)V

    if-eqz v6, :cond_0

    invoke-virtual {v6, p1, p4, v2}, Lcom/google/android/gms/internal/zzafi;->zza(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v5

    :cond_1
    move-object v2, p3

    goto :goto_0
.end method

.method private zzb(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagu;",
            "Lcom/google/android/gms/internal/zzaew;",
            "Lcom/google/firebase/database/DatabaseError;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$9;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzafj$9;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNm:Lcom/google/android/gms/internal/zzafq;

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    return-object v0
.end method

.method private zzd(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagu;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->isDefault()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzagu;->zzN(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagu;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private zze(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzafk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNo:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafk;

    return-object v0
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/zzafj;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNo:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic zzf(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafk;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafj;->zzRL()Lcom/google/android/gms/internal/zzafk;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zzg(Lcom/google/android/gms/internal/zzafj;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNn:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic zzh(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafj$zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNq:Lcom/google/android/gms/internal/zzafj$zzd;

    return-object v0
.end method


# virtual methods
.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public zzRK()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$14;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzafj$14;-><init>(Lcom/google/android/gms/internal/zzafj;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZ",
            "Lcom/google/android/gms/internal/zzain;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$13;

    move-object v2, p0

    move v3, p4

    move-wide v4, p1

    move v6, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/zzafj$13;-><init>(Lcom/google/android/gms/internal/zzafj;ZJZLcom/google/android/gms/internal/zzain;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzaes;JZ)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzaes;",
            "Lcom/google/android/gms/internal/zzaes;",
            "JZ)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$12;

    move-object v2, p0

    move/from16 v3, p6

    move-object v4, p1

    move-object v5, p2

    move-wide v6, p4

    move-object v8, p3

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/zzafj$12;-><init>(Lcom/google/android/gms/internal/zzafj;ZLcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;JLcom/google/android/gms/internal/zzaes;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            "Lcom/google/android/gms/internal/zzafk;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$6;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/android/gms/internal/zzafj$6;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafk;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;JZZ)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            "Lcom/google/android/gms/internal/zzahu;",
            "JZZ)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    if-nez p6, :cond_0

    if-nez p7, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "We shouldn\'t be persisting non-visible writes."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaiv;->zzb(ZLjava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$1;

    move-object v2, p0

    move/from16 v3, p7

    move-object v4, p1

    move-object v5, p2

    move-wide v6, p4

    move-object v8, p3

    move/from16 v9, p6

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/zzafj$1;-><init>(Lcom/google/android/gms/internal/zzafj;ZLcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;JLcom/google/android/gms/internal/zzahu;Z)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzahz;",
            ">;",
            "Lcom/google/android/gms/internal/zzafk;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafk;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-boolean v0, Lcom/google/android/gms/internal/zzafj;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzafa;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzagi;->zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    sget-boolean v2, Lcom/google/android/gms/internal/zzafj;->$assertionsDisabled:Z

    if-nez v2, :cond_1

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing sync point for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafi;->zzb(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagv;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/internal/zzafj;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing view for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzST()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahz;->zzq(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            ">;)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$3;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/internal/zzafj$3;-><init>(Lcom/google/android/gms/internal/zzafj;Ljava/util/Map;Lcom/google/android/gms/internal/zzafa;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            ">;",
            "Lcom/google/android/gms/internal/zzafk;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$7;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/android/gms/internal/zzafj$7;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafk;Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafk;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$5;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzafj$5;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafk;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagu;",
            "Lcom/google/firebase/database/DatabaseError;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;Z)V
    .locals 1

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNp:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/zzafj$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzafj$a;-><init>(Lcom/google/android/gms/internal/zzagu;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzafj;->zzg(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNp:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNp:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzafj$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzafj$a;-><init>(Lcom/google/android/gms/internal/zzagu;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzafj;->zzh(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNp:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzahz;",
            ">;)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagi;->zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafi;->zzRJ()Lcom/google/android/gms/internal/zzagv;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzST()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahz;->zzq(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/zzafj;->zzi(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;)Lcom/google/android/gms/internal/zzahu;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/internal/zzahu;"
        }
    .end annotation

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj;->zzbNl:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    move-object v4, v2

    move-object v2, p1

    :goto_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v6

    if-eqz v5, :cond_1

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/zzagi;->zze(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v4

    :goto_1
    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/zzafi;->zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj;->zzbNm:Lcom/google/android/gms/internal/zzafq;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, p2, v2}, Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Ljava/util/List;Z)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_2

    :cond_3
    move-object v1, v0

    move-object v0, v2

    move-object v2, v3

    goto :goto_0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaew;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$8;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzafj$8;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzaew;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zzh(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaew;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaew;->zzQM()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public zzi(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/zzafj$2;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public zzt(Lcom/google/android/gms/internal/zzafa;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    new-instance v1, Lcom/google/android/gms/internal/zzafj$4;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzafj$4;-><init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzafa;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzagd;->zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
