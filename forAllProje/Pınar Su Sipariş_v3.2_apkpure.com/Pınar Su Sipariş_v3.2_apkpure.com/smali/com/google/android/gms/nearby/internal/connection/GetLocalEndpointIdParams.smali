.class public final Lcom/google/android/gms/nearby/internal/connection/GetLocalEndpointIdParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/GetLocalEndpointIdParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final versionCode:I

.field private final zzbie:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/zzh;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/GetLocalEndpointIdParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/internal/connection/GetLocalEndpointIdParams;->versionCode:I

    iput-wide p2, p0, Lcom/google/android/gms/nearby/internal/connection/GetLocalEndpointIdParams;->zzbie:J

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/internal/connection/zzh;->zza(Lcom/google/android/gms/nearby/internal/connection/GetLocalEndpointIdParams;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzHA()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/internal/connection/GetLocalEndpointIdParams;->zzbie:J

    return-wide v0
.end method
