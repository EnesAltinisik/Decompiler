.class public final Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final versionCode:I

.field private final zzbiJ:Ljava/lang/String;

.field private final zzbie:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/zzt;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/zzt;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;->zzbiJ:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;->zzbie:J

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/internal/connection/zzt;->zza(Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzHA()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;->zzbie:J

    return-wide v0
.end method

.method public zzHI()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StopDiscoveryParams;->zzbiJ:Ljava/lang/String;

    return-object v0
.end method
