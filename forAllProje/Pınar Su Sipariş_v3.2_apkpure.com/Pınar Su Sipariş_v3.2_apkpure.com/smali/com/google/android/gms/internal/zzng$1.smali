.class Lcom/google/android/gms/internal/zzng$1;
.super Lcom/google/android/gms/internal/zznk$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzng;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzng;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzng;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzng$1;->a:Lcom/google/android/gms/internal/zzng;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zznk$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zzbw(I)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/zzng;->zzqM()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v0

    const-string v1, "onRemoteDisplayEnded"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzng$1;->a:Lcom/google/android/gms/internal/zzng;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzng;->zza(Lcom/google/android/gms/internal/zzng;)V

    return-void
.end method
