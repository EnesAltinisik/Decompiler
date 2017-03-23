.class public Lcom/google/android/gms/internal/zzagx;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzagx$a;,
        Lcom/google/android/gms/internal/zzagx$zza;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static zzbQf:Lcom/google/android/gms/internal/zzahb$zza;


# instance fields
.field private final zzbQe:Lcom/google/android/gms/internal/zzahb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzagx;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzagx;->$assertionsDisabled:Z

    new-instance v0, Lcom/google/android/gms/internal/zzagx$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzagx$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzagx;->zzbQf:Lcom/google/android/gms/internal/zzahb$zza;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzahb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    return-void
.end method

.method private zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;
    .locals 8

    sget-boolean v0, Lcom/google/android/gms/internal/zzagx;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzaes;->zzQO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Can\'t have a merge that is an overwrite"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzaes;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-object v1, p1

    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzahi;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzahu;

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzaes;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzahi;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzahu;

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method private zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;
    .locals 11

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/zzagx;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzaes;->zzQO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Can\'t have a merge that is an overwrite"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v8

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzaes;->zzQQ()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v1, p1

    :cond_2
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/google/android/gms/internal/zzahi;

    invoke-interface {v8, v4}, Lcom/google/android/gms/internal/zzahu;->zzk(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v8, v4}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    new-instance v2, Lcom/google/android/gms/internal/zzafa;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/zzahi;

    const/4 v5, 0x0

    aput-object v4, v0, v5

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    move-object v0, p0

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v1

    goto :goto_2

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/zzaes;->zzQN()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)Lcom/google/android/gms/internal/zzaes;

    move-result-object p3

    goto :goto_1

    :cond_4
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/google/android/gms/internal/zzahi;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/zzagm;->zzf(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzaes;->zzQO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    if-nez v2, :cond_6

    const/4 v2, 0x1

    :goto_4
    invoke-interface {v8, v4}, Lcom/google/android/gms/internal/zzahu;->zzk(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v3

    if-nez v3, :cond_5

    if-nez v2, :cond_5

    invoke-interface {v8, v4}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    new-instance v2, Lcom/google/android/gms/internal/zzafa;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/zzahi;

    const/4 v5, 0x0

    aput-object v4, v0, v5

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    move-object v0, p0

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v1

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    goto :goto_4

    :cond_7
    move-object p1, v1

    goto/16 :goto_0
.end method

.method private zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;
    .locals 9

    const/4 v7, 0x1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v8

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/zzafr;->zzv(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-boolean v0, Lcom/google/android/gms/internal/zzagx;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "If change path is empty, we must have complete server data"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSs()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSY()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzahj;

    if-eqz v1, :cond_3

    :goto_1
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/zzafr;->zzd(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzahb;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    invoke-interface {v1, v2, v0, p5}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    :goto_3
    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_2
    move v1, v7

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahb;->zzTb()Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzagw;->zza(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSY()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/zzafr;->zzc(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-boolean v0, Lcom/google/android/gms/internal/zzagx;->$assertionsDisabled:Z

    if-nez v0, :cond_6

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->size()I

    move-result v0

    if-eq v0, v7, :cond_6

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Can\'t have a priority with additional path components"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_6
    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {p3, p2, v0, v1}, Lcom/google/android/gms/internal/zzafr;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    goto :goto_3

    :cond_8
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/zzagm;->zzf(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {p3, p2, v1, v0}, Lcom/google/android/gms/internal/zzafr;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1, v4, v0}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_5
    move-object v3, v0

    :goto_6
    if-eqz v3, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    goto/16 :goto_3

    :cond_9
    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_5

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {p3, v2, v0}, Lcom/google/android/gms/internal/zzafr;->zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzagm;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    goto :goto_6

    :cond_b
    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    goto/16 :goto_3

    :cond_c
    const/4 v1, 0x0

    goto/16 :goto_4
.end method

.method private zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagw;",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/google/android/gms/internal/zzafr;",
            "Lcom/google/android/gms/internal/zzahu;",
            "Lcom/google/android/gms/internal/zzagy;",
            ")",
            "Lcom/google/android/gms/internal/zzagw;"
        }
    .end annotation

    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/zzafr;->zzv(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object p1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSs()Z

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v1

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/zzagm;->zzM(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzaes;->zzQN()Lcom/google/android/gms/internal/zzaes;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, Lcom/google/android/gms/internal/zzaes;->zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v3

    goto :goto_1

    :cond_5
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/zzaes;->zzQN()Lcom/google/android/gms/internal/zzaes;

    move-result-object v3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzagi;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/zzagm;->zzM(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v5

    invoke-interface {v5, v4}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v3

    goto :goto_2

    :cond_8
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    goto/16 :goto_0
.end method

.method private zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;
    .locals 8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v7

    new-instance v5, Lcom/google/android/gms/internal/zzagx$a;

    invoke-direct {v5, p4, p1, p5}, Lcom/google/android/gms/internal/zzagx$a;-><init>(Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahb;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    invoke-interface {v1, v2, v0, p6}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahb;->zzTb()Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzagw;->zza(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    :cond_0
    :goto_0
    return-object p1

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v1

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSs()Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzagw;->zza(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v3, p3

    :cond_3
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahb;->zzTb()Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzagw;->zza(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-interface {v5, v2}, Lcom/google/android/gms/internal/zzahb$zza;->zzh(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafa;->zzRw()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafa;->zzRv()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_5
    invoke-interface {v3, v4, p3}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    goto :goto_1

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    goto :goto_1
.end method

.method private zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;
    .locals 8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v7

    if-eqz p6, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahb;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v2

    invoke-static {p3, v2}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    :goto_1
    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_0
    const/4 v2, 0x1

    :goto_2
    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahb;->zzTb()Z

    move-result v0

    invoke-virtual {p1, v1, v2, v0}, Lcom/google/android/gms/internal/zzagw;->zzb(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;

    move-result-object v1

    new-instance v4, Lcom/google/android/gms/internal/zzagx$a;

    invoke-direct {v4, p4, v1, p5}, Lcom/google/android/gms/internal/zzagx$a;-><init>(Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzahu;)V

    move-object v0, p0

    move-object v2, p2

    move-object v3, p4

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    :cond_1
    return-object p1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahb;->zzTa()Lcom/google/android/gms/internal/zzahb;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahb;->zzTb()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSs()Z

    move-result v1

    if-nez v1, :cond_5

    sget-boolean v1, Lcom/google/android/gms/internal/zzagx;->$assertionsDisabled:Z

    if-nez v1, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "An empty path should have been caught in the other branch"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-interface {v3, v2, p3}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/zzahp;->zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    goto :goto_1

    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-virtual {v7, p2}, Lcom/google/android/gms/internal/zzagm;->zzM(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->size()I

    move-result v1

    const/4 v3, 0x1

    if-gt v1, v3, :cond_1

    :cond_6
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1, v4, p3}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    goto/16 :goto_1

    :cond_7
    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/zzagx;->zzbQf:Lcom/google/android/gms/internal/zzahb$zza;

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    goto/16 :goto_1

    :cond_8
    const/4 v2, 0x0

    goto/16 :goto_2
.end method

.method private zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzagw;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagw;",
            "Lcom/google/android/gms/internal/zzagw;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzago;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSW()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSW()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzago;->zza(Lcom/google/android/gms/internal/zzahp;)Lcom/google/android/gms/internal/zzago;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void

    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzahi;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagm;->zzf(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v0

    return v0
.end method

.method private zzb(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSs()Z

    move-result v1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/internal/zzagw;->zzb(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;

    move-result-object v1

    sget-object v4, Lcom/google/android/gms/internal/zzagx;->zzbQf:Lcom/google/android/gms/internal/zzahb$zza;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;
    .locals 7

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/zzafr;->zzv(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    new-instance v5, Lcom/google/android/gms/internal/zzagx$a;

    invoke-direct {v5, p3, p1, p4}, Lcom/google/android/gms/internal/zzagx$a;-><init>(Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSY()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/zzafr;->zzc(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahb;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v2, v1, v0, p5}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    :cond_2
    :goto_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/zzafr;->zzv(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_9

    :cond_3
    const/4 v0, 0x1

    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahb;->zzTb()Z

    move-result v2

    invoke-virtual {p1, v1, v0, v2}, Lcom/google/android/gms/internal/zzagw;->zza(Lcom/google/android/gms/internal/zzahp;ZZ)Lcom/google/android/gms/internal/zzagw;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/zzafr;->zzd(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {p3, v2, v0}, Lcom/google/android/gms/internal/zzafr;->zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzagm;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    if-nez v3, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzagm;->zzf(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    :cond_6
    if-eqz v3, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    :cond_7
    :goto_4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSY()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/zzafr;->zzc(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahb;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-interface {v2, v1, v0, p5}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    goto/16 :goto_2

    :cond_8
    if-nez v3, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzahu;->zzk(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx;->zzbQe:Lcom/google/android/gms/internal/zzahb;

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    goto/16 :goto_3
.end method

.method public zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzagx$zza;
    .locals 17

    new-instance v8, Lcom/google/android/gms/internal/zzagy;

    invoke-direct {v8}, Lcom/google/android/gms/internal/zzagy;-><init>()V

    sget-object v2, Lcom/google/android/gms/internal/zzagx$2;->a:[I

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafw;->zzSa()Lcom/google/android/gms/internal/zzafw$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafw$zza;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafw;->zzSa()Lcom/google/android/gms/internal/zzafw$zza;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x13

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Unknown operation: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    :pswitch_0
    check-cast p2, Lcom/google/android/gms/internal/zzafy;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafy;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafx;->zzSb()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafy;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafy;->zzSf()Lcom/google/android/gms/internal/zzahu;

    move-result-object v5

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v2

    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagy;->zzSZ()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzagw;Ljava/util/List;)V

    new-instance v4, Lcom/google/android/gms/internal/zzagx$zza;

    invoke-direct {v4, v2, v3}, Lcom/google/android/gms/internal/zzagx$zza;-><init>(Lcom/google/android/gms/internal/zzagw;Ljava/util/List;)V

    return-object v4

    :cond_0
    sget-boolean v2, Lcom/google/android/gms/internal/zzagx;->$assertionsDisabled:Z

    if-nez v2, :cond_1

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafy;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafx;->zzSc()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafy;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafx;->zzSd()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSs()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafy;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    const/4 v15, 0x1

    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafy;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafy;->zzSf()Lcom/google/android/gms/internal/zzahu;

    move-result-object v12

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move-object/from16 v16, v8

    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v2

    goto :goto_0

    :cond_3
    const/4 v15, 0x0

    goto :goto_1

    :pswitch_1
    check-cast p2, Lcom/google/android/gms/internal/zzafv;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafv;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafx;->zzSb()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafv;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafv;->zzRY()Lcom/google/android/gms/internal/zzaes;

    move-result-object v5

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v2

    goto/16 :goto_0

    :cond_4
    sget-boolean v2, Lcom/google/android/gms/internal/zzagx;->$assertionsDisabled:Z

    if-nez v2, :cond_5

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafv;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafx;->zzSc()Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    :cond_5
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafv;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafx;->zzSd()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSs()Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    const/4 v15, 0x1

    :goto_2
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafv;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafv;->zzRY()Lcom/google/android/gms/internal/zzaes;

    move-result-object v12

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move-object/from16 v16, v8

    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;ZLcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v2

    goto/16 :goto_0

    :cond_7
    const/4 v15, 0x0

    goto :goto_2

    :pswitch_2
    check-cast p2, Lcom/google/android/gms/internal/zzaft;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzaft;->zzRX()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzaft;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzaft;->zzRW()Lcom/google/android/gms/internal/zzagi;

    move-result-object v5

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v2

    goto/16 :goto_0

    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzaft;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v5

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v2

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/zzafw;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v5

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/zzagx;->zzb(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzagw;

    move-result-object v2

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
