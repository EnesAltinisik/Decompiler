.class public final Lcom/google/android/gms/nearby/internal/connection/GetLocalDeviceIdParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/GetLocalDeviceIdParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/GetLocalDeviceIdParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/nearby/internal/connection/GetLocalDeviceIdParams;-><init>(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/internal/connection/GetLocalDeviceIdParams;->versionCode:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/internal/connection/zzg;->zza(Lcom/google/android/gms/nearby/internal/connection/GetLocalDeviceIdParams;Landroid/os/Parcel;I)V

    return-void
.end method
