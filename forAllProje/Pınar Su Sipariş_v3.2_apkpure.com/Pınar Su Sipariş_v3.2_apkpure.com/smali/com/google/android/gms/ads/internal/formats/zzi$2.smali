.class Lcom/google/android/gms/ads/internal/formats/zzi$2;
.super Lcom/google/android/gms/internal/zzia$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/formats/zzi;->recordImpression()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Lcom/google/android/gms/ads/internal/formats/zzi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/formats/zzi;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/zzi$2;->b:Lcom/google/android/gms/ads/internal/formats/zzi;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/formats/zzi$2;->a:Lorg/json/JSONObject;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzia$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zze(Lcom/google/android/gms/internal/zzfk;)V
    .locals 2

    const-string v0, "google.afma.nativeAds.handleImpressionPing"

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzi$2;->a:Lorg/json/JSONObject;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/zzfk;->zza(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
