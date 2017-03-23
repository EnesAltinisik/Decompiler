.class Lcom/google/android/gms/internal/zzagh$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzagi$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzagh;->zzA(Lcom/google/android/gms/internal/zzafa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzagi$zza",
        "<",
        "Ljava/util/Map",
        "<",
        "Lcom/google/android/gms/internal/zzagt;",
        "Lcom/google/android/gms/internal/zzagg;",
        ">;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzagh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzagh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagh$5;->a:Lcom/google/android/gms/internal/zzagh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzagt;",
            "Lcom/google/android/gms/internal/zzagg;",
            ">;",
            "Ljava/lang/Void;",
            ")",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagg;

    iget-boolean v2, v0, Lcom/google/android/gms/internal/zzagg;->zzbOS:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagh$5;->a:Lcom/google/android/gms/internal/zzagh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagg;->zzSk()Lcom/google/android/gms/internal/zzagg;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzagh;->zza(Lcom/google/android/gms/internal/zzagh;Lcom/google/android/gms/internal/zzagg;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic zza(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/util/Map;

    check-cast p3, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzagh$5;->a(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
