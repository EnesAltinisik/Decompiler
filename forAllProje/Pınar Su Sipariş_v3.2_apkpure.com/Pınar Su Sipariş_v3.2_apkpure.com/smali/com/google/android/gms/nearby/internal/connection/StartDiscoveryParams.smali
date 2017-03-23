.class public final Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final durationMillis:J

.field final versionCode:I

.field private final zzbhT:Lcom/google/android/gms/nearby/connection/Strategy;

.field private final zzbiJ:Ljava/lang/String;

.field private final zzbib:Lcom/google/android/gms/nearby/internal/connection/zzi;

.field private final zzbie:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/zzp;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/zzp;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Ljava/lang/String;JLcom/google/android/gms/nearby/connection/Strategy;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->versionCode:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/internal/connection/zzi$zza;->zzdE(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/internal/connection/zzi;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbib:Lcom/google/android/gms/nearby/internal/connection/zzi;

    iput-object p3, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbiJ:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->durationMillis:J

    iput-object p6, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbhT:Lcom/google/android/gms/nearby/connection/Strategy;

    iput-wide p7, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbie:J

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/internal/connection/zzp;->zza(Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzHA()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbie:J

    return-wide v0
.end method

.method public zzHI()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbiJ:Ljava/lang/String;

    return-object v0
.end method

.method public zzHw()Lcom/google/android/gms/nearby/connection/Strategy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbhT:Lcom/google/android/gms/nearby/connection/Strategy;

    return-object v0
.end method

.method public zzHy()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbib:Lcom/google/android/gms/nearby/internal/connection/zzi;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->zzbib:Lcom/google/android/gms/nearby/internal/connection/zzi;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/internal/connection/zzi;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzuD()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartDiscoveryParams;->durationMillis:J

    return-wide v0
.end method
