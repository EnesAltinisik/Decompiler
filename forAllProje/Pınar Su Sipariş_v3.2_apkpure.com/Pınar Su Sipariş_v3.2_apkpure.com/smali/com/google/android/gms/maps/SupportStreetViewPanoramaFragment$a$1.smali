.class Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a$1;
.super Lcom/google/android/gms/maps/internal/zzaa$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->getStreetViewPanoramaAsync(Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;

.field final synthetic b:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a$1;->b:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;

    iput-object p2, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a$1;->a:Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;

    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/zzaa$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a$1;->a:Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;

    new-instance v1, Lcom/google/android/gms/maps/StreetViewPanorama;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/StreetViewPanorama;-><init>(Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;->onStreetViewPanoramaReady(Lcom/google/android/gms/maps/StreetViewPanorama;)V

    return-void
.end method
