.class Lcom/google/android/gms/internal/s$5;
.super Lcom/google/android/gms/ads/internal/client/zzp$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/s;->a(Lcom/google/android/gms/ads/internal/zzl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/s;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/s$5;->a:Lcom/google/android/gms/internal/s;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzp$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/s$5;->a:Lcom/google/android/gms/internal/s;

    invoke-static {v0}, Lcom/google/android/gms/internal/s;->a(Lcom/google/android/gms/internal/s;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/s$5$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/s$5$1;-><init>(Lcom/google/android/gms/internal/s$5;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
