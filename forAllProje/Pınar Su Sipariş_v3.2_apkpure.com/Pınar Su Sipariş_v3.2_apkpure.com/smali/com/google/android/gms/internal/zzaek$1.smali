.class Lcom/google/android/gms/internal/zzaek$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaek;->zzQf()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/internal/zzaek;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaek;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaek$1;->b:Lcom/google/android/gms/internal/zzaek;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzaek$1;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$1;->b:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zza(Lcom/google/android/gms/internal/zzaek;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    const-string v3, "Trying to fetch auth token"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$1;->b:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zzb(Lcom/google/android/gms/internal/zzaek;)Lcom/google/android/gms/internal/zzaek$b;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/zzaek$b;->a:Lcom/google/android/gms/internal/zzaek$b;

    if-ne v0, v3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Not in disconnected state: %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaek$1;->b:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v4}, Lcom/google/android/gms/internal/zzaek;->zzb(Lcom/google/android/gms/internal/zzaek;)Lcom/google/android/gms/internal/zzaek$b;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/internal/zzaeg;->zzc(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$1;->b:Lcom/google/android/gms/internal/zzaek;

    sget-object v1, Lcom/google/android/gms/internal/zzaek$b;->b:Lcom/google/android/gms/internal/zzaek$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaek;->zza(Lcom/google/android/gms/internal/zzaek;Lcom/google/android/gms/internal/zzaek$b;)Lcom/google/android/gms/internal/zzaek$b;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$1;->b:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zzc(Lcom/google/android/gms/internal/zzaek;)J

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$1;->b:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zzd(Lcom/google/android/gms/internal/zzaek;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaek$1;->b:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzaek;->zzf(Lcom/google/android/gms/internal/zzaek;)Lcom/google/android/gms/internal/zzaee;

    move-result-object v2

    iget-boolean v3, p0, Lcom/google/android/gms/internal/zzaek$1;->a:Z

    new-instance v4, Lcom/google/android/gms/internal/zzaek$1$1;

    invoke-direct {v4, p0, v0, v1}, Lcom/google/android/gms/internal/zzaek$1$1;-><init>(Lcom/google/android/gms/internal/zzaek$1;J)V

    invoke-interface {v2, v3, v4}, Lcom/google/android/gms/internal/zzaee;->zza(ZLcom/google/android/gms/internal/zzaee$zza;)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0
.end method
