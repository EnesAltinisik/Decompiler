.class public Lcom/google/android/gms/internal/zzafi;
.super Ljava/lang/Object;


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final zzbNj:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzagt;",
            "Lcom/google/android/gms/internal/zzagv;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbNk:Lcom/google/android/gms/internal/zzagd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzafi;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzafi;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzagd;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafi;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    return-void
.end method

.method private zza(Lcom/google/android/gms/internal/zzagv;Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagv;",
            "Lcom/google/android/gms/internal/zzafw;",
            "Lcom/google/android/gms/internal/zzafr;",
            "Lcom/google/android/gms/internal/zzahu;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagp;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzagv;->zzb(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzagv$zza;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iget-object v0, v1, Lcom/google/android/gms/internal/zzagv$zza;->zzbQb:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzago;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSw()Lcom/google/android/gms/internal/zzagq$zza;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/internal/zzagq$zza;->zzbPA:Lcom/google/android/gms/internal/zzagq$zza;

    if-ne v5, v6, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSv()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v6, Lcom/google/android/gms/internal/zzagq$zza;->zzbPz:Lcom/google/android/gms/internal/zzagq$zza;

    if-ne v5, v6, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSv()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v4

    invoke-interface {v0, v4, v3, v2}, Lcom/google/android/gms/internal/zzagd;->zza(Lcom/google/android/gms/internal/zzagu;Ljava/util/Set;Ljava/util/Set;)V

    :cond_4
    iget-object v0, v1, Lcom/google/android/gms/internal/zzagv$zza;->zzbQa:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public zzRH()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagv;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public zzRI()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafi;->zzRJ()Lcom/google/android/gms/internal/zzagv;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzRJ()Lcom/google/android/gms/internal/zzagv;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;)Lcom/google/android/gms/internal/zzais;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagu;",
            "Lcom/google/android/gms/internal/zzaew;",
            "Lcom/google/firebase/database/DatabaseError;",
            ")",
            "Lcom/google/android/gms/internal/zzais",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagu;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafi;->zzRI()Z

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->isDefault()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/zzagv;->zza(Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSR()Lcom/google/android/gms/internal/zzagt;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/zzagv;->zza(Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSR()Lcom/google/android/gms/internal/zzagt;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafi;->zzRI()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzagu;->zzN(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/zzais;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzais;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaew;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzagm;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaew;",
            "Lcom/google/android/gms/internal/zzafr;",
            "Lcom/google/android/gms/internal/zzagm;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagp;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaew;->zzQM()Lcom/google/android/gms/internal/zzagu;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzagu;->zzSR()Lcom/google/android/gms/internal/zzagt;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    if-nez v0, :cond_4

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_0
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/zzafr;->zzc(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzagu;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    new-instance v4, Lcom/google/android/gms/internal/zzagw;

    new-instance v5, Lcom/google/android/gms/internal/zzagm;

    invoke-direct {v5, v2, v0, v1}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    invoke-direct {v4, v5, p3}, Lcom/google/android/gms/internal/zzagw;-><init>(Lcom/google/android/gms/internal/zzagm;Lcom/google/android/gms/internal/zzagm;)V

    new-instance v1, Lcom/google/android/gms/internal/zzagv;

    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/zzagv;-><init>(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzagw;)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagv;->zzSU()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/zzafr;->zzd(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    move-object v2, v0

    move v0, v1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNk:Lcom/google/android/gms/internal/zzagd;

    invoke-interface {v0, v3, v2}, Lcom/google/android/gms/internal/zzagd;->zza(Lcom/google/android/gms/internal/zzagu;Ljava/util/Set;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzagu;->zzSR()Lcom/google/android/gms/internal/zzagt;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    :cond_4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagv;->zzb(Lcom/google/android/gms/internal/zzaew;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagv;->zzl(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafw;",
            "Lcom/google/android/gms/internal/zzafr;",
            "Lcom/google/android/gms/internal/zzahu;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagp;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafw;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafx;->zzSe()Lcom/google/android/gms/internal/zzagt;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    sget-boolean v1, Lcom/google/android/gms/internal/zzafi;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzafi;->zza(Lcom/google/android/gms/internal/zzagv;Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzafi;->zza(Lcom/google/android/gms/internal/zzagv;Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagv;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafi;->zzRJ()Lcom/google/android/gms/internal/zzagv;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSR()Lcom/google/android/gms/internal/zzagt;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    goto :goto_0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzagu;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzafi;->zzb(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagv;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafi;->zzbNj:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagv;->zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagv;->zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
