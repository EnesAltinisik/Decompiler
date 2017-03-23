.class Lcom/google/android/gms/internal/zztn$1;
.super Lcom/google/android/gms/internal/zztn$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zztn;->attest(Lcom/google/android/gms/common/api/GoogleApiClient;[B)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[B

.field final synthetic b:Lcom/google/android/gms/internal/zztn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zztn;Lcom/google/android/gms/common/api/GoogleApiClient;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zztn$1;->b:Lcom/google/android/gms/internal/zztn;

    iput-object p3, p0, Lcom/google/android/gms/internal/zztn$1;->a:[B

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zztn$b;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zzto;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zztn$1;->c:Lcom/google/android/gms/internal/zztl;

    iget-object v1, p0, Lcom/google/android/gms/internal/zztn$1;->a:[B

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzto;->zza(Lcom/google/android/gms/internal/zztl;[B)V

    return-void
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzto;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zztn$1;->a(Lcom/google/android/gms/internal/zzto;)V

    return-void
.end method
