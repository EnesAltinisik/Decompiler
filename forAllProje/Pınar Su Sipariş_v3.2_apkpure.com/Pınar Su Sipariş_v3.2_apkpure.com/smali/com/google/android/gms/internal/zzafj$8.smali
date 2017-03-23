.class Lcom/google/android/gms/internal/zzafj$8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zzg(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/List",
        "<+",
        "Lcom/google/android/gms/internal/zzagq;",
        ">;>;"
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/zzaew;

.field final synthetic c:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzafj$8;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzaew;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafj$8;->b:Lcom/google/android/gms/internal/zzaew;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$8;->b:Lcom/google/android/gms/internal/zzaew;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaew;->zzQM()Lcom/google/android/gms/internal/zzagu;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v6

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzd(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    move-object v5, v6

    move-object v7, v0

    move v3, v2

    :goto_0
    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagi;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    if-eqz v0, :cond_12

    if-eqz v4, :cond_1

    :goto_1
    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafi;->zzRI()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    move v0, v1

    :goto_2
    move-object v3, v4

    :goto_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, ""

    invoke-static {v4}, Lcom/google/android/gms/internal/zzahi;->zzig(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahi;

    move-result-object v4

    :goto_4
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/zzagi;->zze(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v7

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    move-object v5, v4

    move-object v4, v3

    move v3, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/zzafi;->zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v4

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzd(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/zzagi;->zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafi;

    if-nez v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/zzafi;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v5}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v5

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/zzafi;-><init>(Lcom/google/android/gms/internal/zzagd;)V

    iget-object v5, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    iget-object v7, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v7}, Lcom/google/android/gms/internal/zzafj;->zzd(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v7

    invoke-virtual {v7, v6, v0}, Lcom/google/android/gms/internal/zzagi;->zzb(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagi;)Lcom/google/android/gms/internal/zzagi;

    move-object v11, v0

    move-object v0, v4

    move v4, v3

    move-object v3, v11

    :goto_5
    iget-object v5, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v5}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v5

    invoke-interface {v5, v8}, Lcom/google/android/gms/internal/zzagd;->zzg(Lcom/google/android/gms/internal/zzagu;)V

    if-eqz v0, :cond_9

    new-instance v5, Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagu;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-direct {v5, v0, v1, v2}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    move-object v0, v5

    :goto_6
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/zzafi;->zzc(Lcom/google/android/gms/internal/zzagu;)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v2

    if-nez v2, :cond_f

    sget-boolean v2, Lcom/google/android/gms/internal/zzafj$8;->a:Z

    if-nez v2, :cond_e

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzafj;->zze(Lcom/google/android/gms/internal/zzafj;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "View does not exist but we have a tag"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_5
    if-nez v3, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafi;->zzRI()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    move v3, v1

    :goto_7
    if-eqz v4, :cond_8

    :goto_8
    move-object v11, v0

    move-object v0, v4

    move v4, v3

    move-object v3, v11

    goto :goto_5

    :cond_7
    move v3, v2

    goto :goto_7

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/zzafi;->zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    goto :goto_8

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/google/android/gms/internal/zzagd;->zzf(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagm;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_a

    move-object v0, v7

    goto :goto_6

    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zzd(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/zzagi;->zzI(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->zzSp()Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzafi;

    if-eqz v1, :cond_11

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v10

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/zzafi;->zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahi;

    invoke-interface {v5, v0, v1}, Lcom/google/android/gms/internal/zzahu;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_a
    move-object v5, v0

    goto :goto_9

    :cond_b
    invoke-virtual {v7}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v7

    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/zzahu;->zzk(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v7

    if-nez v7, :cond_c

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v5, v7, v0}, Lcom/google/android/gms/internal/zzahu;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v5

    goto :goto_b

    :cond_d
    new-instance v0, Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzagu;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v1

    invoke-static {v5, v1}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    goto/16 :goto_6

    :cond_e
    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzafj;->zzf(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafk;

    move-result-object v2

    iget-object v5, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v5}, Lcom/google/android/gms/internal/zzafj;->zze(Lcom/google/android/gms/internal/zzafj;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v5}, Lcom/google/android/gms/internal/zzafj;->zzg(Lcom/google/android/gms/internal/zzafj;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzafj;->zzc(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafq;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/zzafq;->zzu(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafr;

    move-result-object v2

    iget-object v5, p0, Lcom/google/android/gms/internal/zzafj$8;->b:Lcom/google/android/gms/internal/zzaew;

    invoke-virtual {v3, v5, v2, v0}, Lcom/google/android/gms/internal/zzafi;->zza(Lcom/google/android/gms/internal/zzaew;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzagm;)Ljava/util/List;

    move-result-object v0

    if-nez v1, :cond_10

    if-nez v4, :cond_10

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/zzafi;->zzb(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagv;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$8;->c:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v2, v8, v1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzagv;)V

    :cond_10
    return-object v0

    :cond_11
    move-object v0, v5

    goto :goto_a

    :cond_12
    move v0, v3

    move-object v3, v4

    goto/16 :goto_3
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafj$8;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
