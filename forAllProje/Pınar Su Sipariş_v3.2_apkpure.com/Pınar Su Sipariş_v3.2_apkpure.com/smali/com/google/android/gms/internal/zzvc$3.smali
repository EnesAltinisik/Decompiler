.class Lcom/google/android/gms/internal/zzvc$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzvc;->dispatch()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzvc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzvc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzvc$3;->a:Lcom/google/android/gms/internal/zzvc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvc$3;->a:Lcom/google/android/gms/internal/zzvc;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzvc;->zza(Lcom/google/android/gms/internal/zzvc;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "TagManagerBackend dispatch called without loaded container."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->zzaW(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzvc$3;->a:Lcom/google/android/gms/internal/zzvc;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzvc;->zza(Lcom/google/android/gms/internal/zzvc;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzty;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzty;->dispatch()V

    goto :goto_0
.end method
