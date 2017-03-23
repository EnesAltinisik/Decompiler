.class Lcom/google/android/gms/internal/zznh$1;
.super Lcom/google/android/gms/internal/zznk$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zznh;->zza(Lcom/google/android/gms/internal/zzni;Lcom/google/android/gms/internal/zznk;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zznk;

.field final synthetic b:Lcom/google/android/gms/internal/zznh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zznh;Lcom/google/android/gms/internal/zznk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zznh$1;->b:Lcom/google/android/gms/internal/zznh;

    iput-object p2, p0, Lcom/google/android/gms/internal/zznh$1;->a:Lcom/google/android/gms/internal/zznk;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zznk$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zzbw(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zznh;->zzqM()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v0

    const-string v1, "onRemoteDisplayEnded"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zznh$1;->a:Lcom/google/android/gms/internal/zznk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zznh$1;->a:Lcom/google/android/gms/internal/zznk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zznk;->zzbw(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zznh$1;->b:Lcom/google/android/gms/internal/zznh;

    invoke-static {v0}, Lcom/google/android/gms/internal/zznh;->zzb(Lcom/google/android/gms/internal/zznh;)Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionCallbacks;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zznh$1;->b:Lcom/google/android/gms/internal/zznh;

    invoke-static {v0}, Lcom/google/android/gms/internal/zznh;->zzb(Lcom/google/android/gms/internal/zznh;)Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionCallbacks;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionCallbacks;->onRemoteDisplayEnded(Lcom/google/android/gms/common/api/Status;)V

    :cond_1
    return-void
.end method
