.class Lcom/google/android/gms/internal/zzafe$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafe;->zzf(Lcom/google/android/gms/internal/zzaeu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaeu;

.field final synthetic b:Lcom/google/android/gms/internal/zzafe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafe;Lcom/google/android/gms/internal/zzaeu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafe$3;->b:Lcom/google/android/gms/internal/zzafe;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafe$3;->a:Lcom/google/android/gms/internal/zzaeu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafe$3;->b:Lcom/google/android/gms/internal/zzafe;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafe;->zza(Lcom/google/android/gms/internal/zzafe;)Ljava/util/Map;

    move-result-object v3

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafe$3;->b:Lcom/google/android/gms/internal/zzafe;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafe;->zza(Lcom/google/android/gms/internal/zzafe;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafe$3;->a:Lcom/google/android/gms/internal/zzaeu;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafe$3;->b:Lcom/google/android/gms/internal/zzafe;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafe;->zza(Lcom/google/android/gms/internal/zzafe;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafe$3;->a:Lcom/google/android/gms/internal/zzaeu;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v1

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafc;->interrupt()V

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafc;->zzRB()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafe$3;->a:Lcom/google/android/gms/internal/zzaeu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaeu;->stop()V

    :cond_2
    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
