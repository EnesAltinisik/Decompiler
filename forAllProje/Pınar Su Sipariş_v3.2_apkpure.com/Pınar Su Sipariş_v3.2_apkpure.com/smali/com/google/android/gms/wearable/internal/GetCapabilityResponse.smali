.class public Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final statusCode:I

.field public final versionCode:I

.field public final zzbDi:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzai;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/zzai;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->statusCode:I

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->zzbDi:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/zzai;->zza(Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;Landroid/os/Parcel;I)V

    return-void
.end method
