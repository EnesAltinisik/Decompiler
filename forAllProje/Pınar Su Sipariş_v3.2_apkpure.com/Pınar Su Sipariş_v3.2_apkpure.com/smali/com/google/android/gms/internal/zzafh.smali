.class Lcom/google/android/gms/internal/zzafh;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzafh$zza;,
        Lcom/google/android/gms/internal/zzafh$zzb;
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/zzahu;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzahi;",
            "Lcom/google/android/gms/internal/zzafh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafh$zzb;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/zzafh$zzb;->zzf(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzafh$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/zzafh$2;-><init>(Lcom/google/android/gms/internal/zzafh;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafh$zzb;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafh$zza;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    new-instance v2, Lcom/google/android/gms/internal/zzafh;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzafh;-><init>()V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafh;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/zzafh$zza;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

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

    check-cast v1, Lcom/google/android/gms/internal/zzahi;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafh;

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/zzafh$zza;->zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzafh;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/zzafa;)Z
    .locals 6

    const/4 v2, 0x0

    const/4 v1, 0x1

    const/4 v5, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object v5, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    iput-object v5, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    check-cast v0, Lcom/google/android/gms/internal/zzahj;

    iput-object v5, p0, Lcom/google/android/gms/internal/zzafh;->a:Lcom/google/android/gms/internal/zzahu;

    new-instance v1, Lcom/google/android/gms/internal/zzafh$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzafh$1;-><init>(Lcom/google/android/gms/internal/zzafh;Lcom/google/android/gms/internal/zzafa;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahj;->zza(Lcom/google/android/gms/internal/zzahj$zza;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafh;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iput-object v5, p0, Lcom/google/android/gms/internal/zzafh;->b:Ljava/util/Map;

    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_0
.end method
