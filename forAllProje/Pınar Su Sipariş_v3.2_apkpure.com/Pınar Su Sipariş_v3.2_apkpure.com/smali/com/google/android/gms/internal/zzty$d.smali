.class Lcom/google/android/gms/internal/zzty$d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzty;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzty;

.field private final b:Lcom/google/android/gms/internal/zzaau;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzty;Lcom/google/android/gms/internal/zzaau;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzty$d;->b:Lcom/google/android/gms/internal/zzaau;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$d;->b:Lcom/google/android/gms/internal/zzaau;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau;->zzLO()Lcom/google/android/gms/internal/zzaau$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau$zza;->zzLT()Lcom/google/android/gms/internal/zzabc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzty$d;->b:Lcom/google/android/gms/internal/zzaau;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaau;->zzLP()Lcom/google/android/gms/internal/zzabf;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzty;->zzj(Lcom/google/android/gms/internal/zzty;)Lcom/google/android/gms/internal/zzuv;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Lcom/google/android/gms/internal/zzuv;->zza(Lcom/google/android/gms/internal/zzabc;Lcom/google/android/gms/internal/zzabf;)Lcom/google/android/gms/internal/zzuu;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzty;->zza(Lcom/google/android/gms/internal/zzty;Lcom/google/android/gms/internal/zzuu;)Lcom/google/android/gms/internal/zzuu;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzty;->zza(Lcom/google/android/gms/internal/zzty;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzty;->zze(Lcom/google/android/gms/internal/zzty;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x30

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " loaded during runtime initialization."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzty;->zzc(Lcom/google/android/gms/internal/zzty;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzty;->zzc(Lcom/google/android/gms/internal/zzty;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzud;

    const-string v3, "Evaluating tags for pending event "

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzud;->zzKU()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzty;->zzb(Lcom/google/android/gms/internal/zzty;)Lcom/google/android/gms/internal/zzuu;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzuu;->zzb(Lcom/google/android/gms/internal/zzud;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzty;->zza(Lcom/google/android/gms/internal/zzty;Ljava/util/List;)Ljava/util/List;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$d;->a:Lcom/google/android/gms/internal/zzty;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzty;->zzb(Lcom/google/android/gms/internal/zzty;)Lcom/google/android/gms/internal/zzuu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzuu;->dispatch()V

    return-void
.end method
