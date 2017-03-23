.class final Lcom/google/android/gms/wearable/internal/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/internal/d$b;,
        Lcom/google/android/gms/wearable/internal/d$o;,
        Lcom/google/android/gms/wearable/internal/d$s;,
        Lcom/google/android/gms/wearable/internal/d$a;,
        Lcom/google/android/gms/wearable/internal/d$f;,
        Lcom/google/android/gms/wearable/internal/d$g;,
        Lcom/google/android/gms/wearable/internal/d$r;,
        Lcom/google/android/gms/wearable/internal/d$u;,
        Lcom/google/android/gms/wearable/internal/d$i;,
        Lcom/google/android/gms/wearable/internal/d$h;,
        Lcom/google/android/gms/wearable/internal/d$d;,
        Lcom/google/android/gms/wearable/internal/d$c;,
        Lcom/google/android/gms/wearable/internal/d$p;,
        Lcom/google/android/gms/wearable/internal/d$t;,
        Lcom/google/android/gms/wearable/internal/d$q;,
        Lcom/google/android/gms/wearable/internal/d$n;,
        Lcom/google/android/gms/wearable/internal/d$m;,
        Lcom/google/android/gms/wearable/internal/d$l;,
        Lcom/google/android/gms/wearable/internal/d$k;,
        Lcom/google/android/gms/wearable/internal/d$j;,
        Lcom/google/android/gms/wearable/internal/d$e;
    }
.end annotation


# direct methods
.method static synthetic a(Ljava/util/List;)Ljava/util/Map;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/wearable/internal/d;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/wearable/CapabilityInfo;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/wearable/internal/zzj$zzc;

    invoke-direct {v4, v0}, Lcom/google/android/gms/wearable/internal/zzj$zzc;-><init>(Lcom/google/android/gms/wearable/CapabilityInfo;)V

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method
