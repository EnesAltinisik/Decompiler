.class public Lcom/google/android/gms/internal/zzaff;
.super Ljava/lang/Object;


# direct methods
.method public static zza(Lcom/google/android/gms/internal/zzaes;Ljava/util/Map;)Lcom/google/android/gms/internal/zzaes;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaes;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/zzaes;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzaes;->zzQN()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaes;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzafa;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public static zza(Lcom/google/android/gms/internal/zzafh;Ljava/util/Map;)Lcom/google/android/gms/internal/zzafh;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafh;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/zzafh;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzafh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzafh;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/zzafa;

    const-string v2, ""

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzafa;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/internal/zzaff$1;

    invoke-direct {v2, v0, p1}, Lcom/google/android/gms/internal/zzaff$1;-><init>(Lcom/google/android/gms/internal/zzafh;Ljava/util/Map;)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafh$zzb;)V

    return-object v0
.end method

.method public static zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzahu;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/zzahu;"
        }
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v0, v1, Ljava/util/Map;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Ljava/util/Map;

    const-string v2, ".sv"

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, ".sv"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_0
    invoke-static {v1}, Lcom/google/android/gms/internal/zzahy;->zzar(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzaff;->zza(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzahv;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0

    :cond_3
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    check-cast p0, Lcom/google/android/gms/internal/zzahj;

    new-instance v1, Lcom/google/android/gms/internal/zzafg;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzafg;-><init>(Lcom/google/android/gms/internal/zzahu;)V

    new-instance v2, Lcom/google/android/gms/internal/zzaff$2;

    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/internal/zzaff$2;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/zzafg;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/zzahj;->zza(Lcom/google/android/gms/internal/zzahj$zza;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzafg;->zzRG()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzafg;->zzRG()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzahu;->zzf(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p0

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzafg;->zzRG()Lcom/google/android/gms/internal/zzahu;

    move-result-object p0

    goto :goto_0
.end method

.method public static zza(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    const-string v1, ".sv"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ".sv"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static zza(Lcom/google/android/gms/internal/zzain;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzain;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "timestamp"

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzain;->zzUi()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
