.class Lcom/google/android/gms/internal/zzaek$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaek$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaek;->zzay(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Lcom/google/android/gms/internal/zzaek$f;

.field final synthetic d:Lcom/google/android/gms/internal/zzaem;

.field final synthetic e:Lcom/google/android/gms/internal/zzaek;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaek;Ljava/lang/String;JLcom/google/android/gms/internal/zzaek$f;Lcom/google/android/gms/internal/zzaem;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaek$4;->e:Lcom/google/android/gms/internal/zzaek;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaek$4;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/zzaek$4;->b:J

    iput-object p5, p0, Lcom/google/android/gms/internal/zzaek$4;->c:Lcom/google/android/gms/internal/zzaek$f;

    iput-object p6, p0, Lcom/google/android/gms/internal/zzaek$4;->d:Lcom/google/android/gms/internal/zzaem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->e:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zza(Lcom/google/android/gms/internal/zzaek;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->e:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zza(Lcom/google/android/gms/internal/zzaek;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaek$4;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xb

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " response: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->e:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zzj(Lcom/google/android/gms/internal/zzaek;)Ljava/util/Map;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaek$4;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaek$f;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaek$4;->c:Lcom/google/android/gms/internal/zzaek$f;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->e:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zzj(Lcom/google/android/gms/internal/zzaek;)Ljava/util/Map;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaek$4;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->d:Lcom/google/android/gms/internal/zzaem;

    if-eqz v0, :cond_1

    const-string v0, "s"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "ok"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->d:Lcom/google/android/gms/internal/zzaem;

    invoke-interface {v0, v7, v7}, Lcom/google/android/gms/internal/zzaem;->zzaj(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->e:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zzk(Lcom/google/android/gms/internal/zzaek;)V

    return-void

    :cond_2
    const-string v1, "d"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaek$4;->d:Lcom/google/android/gms/internal/zzaem;

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/internal/zzaem;->zzaj(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->e:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zza(Lcom/google/android/gms/internal/zzaek;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$4;->e:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zza(Lcom/google/android/gms/internal/zzaek;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaek$4;->b:J

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v4, 0x51

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Ignoring on complete for put "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " because it was removed already."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
