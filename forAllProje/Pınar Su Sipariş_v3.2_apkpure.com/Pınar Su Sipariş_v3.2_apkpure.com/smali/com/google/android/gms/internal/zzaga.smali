.class public Lcom/google/android/gms/internal/zzaga;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzagd;


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final zzbHV:Lcom/google/android/gms/internal/zzahf;

.field private final zzbOE:Lcom/google/android/gms/internal/zzage;

.field private final zzbOF:Lcom/google/android/gms/internal/zzagh;

.field private final zzbOG:Lcom/google/android/gms/internal/zzafz;

.field private zzbOH:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzaga;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzaga;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzage;Lcom/google/android/gms/internal/zzafz;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzaio;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzaio;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/zzaga;-><init>(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzage;Lcom/google/android/gms/internal/zzafz;Lcom/google/android/gms/internal/zzain;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzage;Lcom/google/android/gms/internal/zzafz;Lcom/google/android/gms/internal/zzain;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOH:J

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    const-string v0, "Persistence"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzaeu;->zzib(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    new-instance v0, Lcom/google/android/gms/internal/zzagh;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaga;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    invoke-direct {v0, v1, v2, p4}, Lcom/google/android/gms/internal/zzagh;-><init>(Lcom/google/android/gms/internal/zzage;Lcom/google/android/gms/internal/zzahf;Lcom/google/android/gms/internal/zzain;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaga;->zzbOG:Lcom/google/android/gms/internal/zzafz;

    return-void
.end method

.method private zzSi()V
    .locals 8

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaga;->zzbOH:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzaga;->zzbOH:J

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOG:Lcom/google/android/gms/internal/zzafz;

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaga;->zzbOH:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/zzafz;->zzaG(J)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    const-string v2, "Reached prune check threshold."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzaga;->zzbOH:J

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzage;->zzPq()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaga;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaga;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x20

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Cache size: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaga;->zzbOG:Lcom/google/android/gms/internal/zzafz;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzagh;->zzSm()J

    move-result-wide v6

    invoke-interface {v4, v2, v3, v6, v7}, Lcom/google/android/gms/internal/zzafz;->zze(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaga;->zzbOG:Lcom/google/android/gms/internal/zzafz;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzagh;->zza(Lcom/google/android/gms/internal/zzafz;)Lcom/google/android/gms/internal/zzagf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagf;->zzSj()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Lcom/google/android/gms/internal/zzage;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagf;)V

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzage;->zzPq()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaga;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaga;->zzbHV:Lcom/google/android/gms/internal/zzahf;

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x2c

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Cache size after prune: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public zzPp()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafn;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzage;->zzPp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public zzPs()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzage;->zzPs()V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzage;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;J)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzage;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;J)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzahu;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/zzage;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaga;->zzi(Lcom/google/android/gms/internal/zzagu;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaga;->zzSi()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/zzage;->zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagu;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzahi;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lcom/google/android/gms/internal/zzaga;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We should only track keys for filtered queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzl(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagg;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/internal/zzaga;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzagg;->zzbOT:Z

    if-nez v1, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We only expect tracked keys for currently-active queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    iget-wide v2, v0, Lcom/google/android/gms/internal/zzagg;->id:J

    invoke-interface {v1, v2, v3, p2}, Lcom/google/android/gms/internal/zzage;->zza(JLjava/util/Set;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;Ljava/util/Set;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagu;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzahi;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzahi;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lcom/google/android/gms/internal/zzaga;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We should only track keys for filtered queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzl(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagg;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/internal/zzaga;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzagg;->zzbOT:Z

    if-nez v1, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We only expect tracked keys for currently-active queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    iget-wide v2, v0, Lcom/google/android/gms/internal/zzagg;->id:J

    invoke-interface {v1, v2, v3, p2, p3}, Lcom/google/android/gms/internal/zzage;->zza(JLjava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public zzat(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzage;->zzat(J)V

    return-void
.end method

.method public zzc(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V
    .locals 3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaes;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/zzaga;->zzk(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public zzd(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzage;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaga;->zzSi()V

    return-void
.end method

.method public zzf(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagm;
    .locals 7

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzo(Lcom/google/android/gms/internal/zzagu;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzl(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagg;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzagg;->zzbOS:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    iget-wide v4, v0, Lcom/google/android/gms/internal/zzagg;->id:J

    invoke-interface {v1, v4, v5}, Lcom/google/android/gms/internal/zzage;->zzaw(J)Ljava/util/Set;

    move-result-object v0

    :goto_0
    move v1, v2

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/zzage;->zza(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahi;

    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v6

    invoke-interface {v3, v0, v6}, Lcom/google/android/gms/internal/zzahu;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    move-object v3, v0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagh;->zzB(Lcom/google/android/gms/internal/zzafa;)Ljava/util/Set;

    move-result-object v0

    move v1, v3

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v3

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    :goto_3
    return-object v0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    goto :goto_3
.end method

.method public zzf(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzage;->beginTransaction()V

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzage;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzage;->endTransaction()V

    return-object v0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzage;->endTransaction()V

    throw v0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzagu;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzg(Lcom/google/android/gms/internal/zzagu;)V

    return-void
.end method

.method public zzh(Lcom/google/android/gms/internal/zzagu;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzh(Lcom/google/android/gms/internal/zzagu;)V

    return-void
.end method

.method public zzi(Lcom/google/android/gms/internal/zzagu;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagh;->zzA(Lcom/google/android/gms/internal/zzafa;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzn(Lcom/google/android/gms/internal/zzagu;)V

    goto :goto_0
.end method

.method public zzk(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzD(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOE:Lcom/google/android/gms/internal/zzage;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzage;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaga;->zzbOF:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagh;->zzC(Lcom/google/android/gms/internal/zzafa;)V

    :cond_0
    return-void
.end method
