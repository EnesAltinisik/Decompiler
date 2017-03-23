.class Lcom/google/android/gms/internal/zzaek$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaek;->zzQm()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaek;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaek;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaek$7;->a:Lcom/google/android/gms/internal/zzaek;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$7;->a:Lcom/google/android/gms/internal/zzaek;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaek;->zza(Lcom/google/android/gms/internal/zzaek;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$7;->a:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zzm(Lcom/google/android/gms/internal/zzaek;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$7;->a:Lcom/google/android/gms/internal/zzaek;

    const-string v1, "connection_idle"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaek;->interrupt(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$7;->a:Lcom/google/android/gms/internal/zzaek;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaek;->zzk(Lcom/google/android/gms/internal/zzaek;)V

    goto :goto_0
.end method
