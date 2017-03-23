.class Lcom/google/android/gms/config/internal/zza$1;
.super Lcom/google/android/gms/config/internal/zza$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/config/internal/zza;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zzpy$zza;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzpy$zza;

.field final synthetic b:Lcom/google/android/gms/config/internal/zza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/config/internal/zza;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zzpy$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/config/internal/zza$1;->b:Lcom/google/android/gms/config/internal/zza;

    iput-object p3, p0, Lcom/google/android/gms/config/internal/zza$1;->a:Lcom/google/android/gms/internal/zzpy$zza;

    invoke-direct {p0, p2}, Lcom/google/android/gms/config/internal/zza$c;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/internal/zzpy$zzb;
    .locals 2

    new-instance v0, Lcom/google/android/gms/config/internal/zza$zzd;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/config/internal/zza$zzd;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/util/Map;)V

    return-object v0
.end method

.method protected a(Landroid/content/Context;Lcom/google/android/gms/config/internal/zzh;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {}, Lcom/google/android/gms/common/data/zzd;->zzsS()Lcom/google/android/gms/common/data/DataHolder$zza;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/config/internal/zza$1;->a:Lcom/google/android/gms/internal/zzpy$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzpy$zza;->zzvr()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    new-instance v5, Lcom/google/android/gms/config/internal/CustomVariable;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v5, v1, v0}, Lcom/google/android/gms/config/internal/CustomVariable;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3, v5}, Lcom/google/android/gms/common/data/zzd;->zza(Lcom/google/android/gms/common/data/DataHolder$zza;Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/common/data/DataHolder$zza;->zzbR(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v4

    invoke-static {p1}, Lcom/google/android/gms/internal/zzom;->zzas(Landroid/content/Context;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    if-ne v0, v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzom;->zzsA()Ljava/lang/String;

    move-result-object v5

    :goto_1
    :try_start_0
    invoke-static {}, Lcom/google/firebase/iid/zzc;->zzUl()Lcom/google/firebase/iid/zzc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/iid/zzc;->getId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    :try_start_1
    invoke-static {}, Lcom/google/firebase/iid/zzc;->zzUl()Lcom/google/firebase/iid/zzc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/iid/zzc;->getToken()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    move-object v7, v2

    :goto_2
    new-instance v0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/config/internal/zza$1;->a:Lcom/google/android/gms/internal/zzpy$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzpy$zza;->zzvq()J

    move-result-wide v2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;-><init>(Ljava/lang/String;JLcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/config/internal/zza$1;->c:Lcom/google/android/gms/config/internal/zzg;

    invoke-interface {p2, v1, v0}, Lcom/google/android/gms/config/internal/zzh;->zza(Lcom/google/android/gms/config/internal/zzg;Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;)V

    return-void

    :cond_1
    move-object v5, v2

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v6, v2

    :goto_3
    const-string v1, "ConfigApiImpl"

    const/4 v3, 0x3

    invoke-static {v1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "ConfigApiImpl"

    const-string v3, "Cannot retrieve instanceId or instanceIdToken."

    invoke-static {v1, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    move-object v7, v2

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_3
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/config/internal/zza$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/internal/zzpy$zzb;

    move-result-object v0

    return-object v0
.end method
