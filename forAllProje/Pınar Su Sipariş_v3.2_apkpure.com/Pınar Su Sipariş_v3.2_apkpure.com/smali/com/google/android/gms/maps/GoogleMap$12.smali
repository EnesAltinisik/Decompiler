.class Lcom/google/android/gms/maps/GoogleMap$12;
.super Lcom/google/android/gms/maps/internal/zzd$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/GoogleMap;->setInfoWindowAdapter(Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

.field final synthetic b:Lcom/google/android/gms/maps/GoogleMap;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMap$12;->b:Lcom/google/android/gms/maps/GoogleMap;

    iput-object p2, p0, Lcom/google/android/gms/maps/GoogleMap$12;->a:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/zzd$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zzb(Lcom/google/android/gms/maps/model/internal/zzf;)Lcom/google/android/gms/dynamic/zzd;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$12;->a:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    new-instance v1, Lcom/google/android/gms/maps/model/Marker;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/Marker;-><init>(Lcom/google/android/gms/maps/model/internal/zzf;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;->getInfoWindow(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v0

    return-object v0
.end method

.method public zzc(Lcom/google/android/gms/maps/model/internal/zzf;)Lcom/google/android/gms/dynamic/zzd;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$12;->a:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    new-instance v1, Lcom/google/android/gms/maps/model/Marker;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/Marker;-><init>(Lcom/google/android/gms/maps/model/internal/zzf;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;->getInfoContents(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v0

    return-object v0
.end method
